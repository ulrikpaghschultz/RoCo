/*
 * generated by Xtext
 */
package dk.sdu.mmmi.modular.roco2.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xbase.lib.IteratorExtensions.*
import org.eclipse.xtext.naming.IQualifiedNameProvider
import javax.inject.Inject
import dk.sdu.mmmi.modular.roco2.roco2.Program
import dk.sdu.mmmi.modular.roco2.roco2.Ensemble
import dk.sdu.mmmi.modular.roco2.roco2.Role
import dk.sdu.mmmi.modular.roco2.roco2.EnumDef
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import dk.sdu.mmmi.modular.roco2.roco2.ExternalName
import dk.sdu.mmmi.modular.roco2.roco2.TypeDef
import dk.sdu.mmmi.modular.roco2.roco2.LocalType
import dk.sdu.mmmi.modular.roco2.roco2.Field
import dk.sdu.mmmi.modular.roco2.roco2.Require
import dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr
import dk.sdu.mmmi.modular.roco2.roco2.Value
import dk.sdu.mmmi.modular.roco2.roco2.FunctionCall
import dk.sdu.mmmi.modular.roco2.roco2.LocalVariable
import dk.sdu.mmmi.modular.roco2.roco2.InternalQualifiedName
import dk.sdu.mmmi.modular.roco2.roco2.Update
import dk.sdu.mmmi.modular.roco2.roco2.Method
import dk.sdu.mmmi.modular.roco2.roco2.Behavior

class Roco2Generator implements IGenerator {
	
	@Inject extension IQualifiedNameProvider nameProvider 
	
	Resource resource
	IFileSystemAccess fsa
	QualifiedName packageName
	
	override void doGenerate(Resource _resource, IFileSystemAccess _fsa) {
		resource = _resource; fsa = _fsa;
		generateForType("Program",typeof(Program),[Program x|packageName = x.getFullyQualifiedName; x.compileProgram])
		generateForType(null,typeof(Ensemble),[Ensemble x|x.compileEnsemble])
		generateForType(null,typeof(Role),[Role x|x.compileRole])
		generateForType(null,typeof(EnumDef),[EnumDef x|x.compileEnum])
	}

	def <T extends EObject> void generateForType(String fileName, Class<T> type, (T)=>CharSequence contents) {
		for(e: resource.allContents.toIterable.filter(type)) {
			fsa.generateFile(e.getFullyQualifiedName.toString.replace(".", "/") 
				+ (if(fileName!=null) "/"+fileName else "_RoCo")
				+ ".java",
				contents.apply(e)
			)
		}
	}
	
	def compileProgram(Program program) '''
	package �packageName�;
	import java.util.*;
	import distributedLanguage.*;
	public class Program extends RoCoProgram { 
		@Override List<Entity> getAllEntities() {
			ArrayList<Entity> result = new ArrayList<Entity>();
			�FOR r:program.elements�
			�r.generateMemberListEntry�
			�ENDFOR�
			return result;
		}
	}
	'''

	def dispatch generateMemberListEntry(LocalType x) { }

	def dispatch generateMemberListEntry(Ensemble e) '''
			result.add(new �e.getFullyQualifiedName�(this));
	'''

	def dispatch generateMemberListEntry(Role r) '''
			result.add(new �r.getFullyQualifiedName�(this));
	'''


	def compileRole(Role role) '''
	package �packageName�;
	import java.util.*;
	import distributedLanguage.*;
	public class �role.name�_RoCo extends �IF role.extendsRole==null�RoCoRole�ELSE��role.extendsRole.getFullyQualifiedName�_Roco�ENDIF� {
		public �role.name�_RoCo(Program program) { super(program); }
		@Override public Program getProgram() { return (Program)super.getProgram(); }
		@Override public boolean isAbstract() { return �role.isAbstract�; }
		@Override public boolean isPrimaryRole() { return �!role.isMixin�; }
		@Override public String getName() { return "�role.name�"; }
		�IF role.extendsRole!=null�@Override public String getSuperName() {�return "�role.extendsRole.name�"; }�ENDIF�
		�IF role.withinEnsemble!=null�@Override public String getEnsembleName() { return "�role.withinEnsemble.name�"; } �ENDIF�
		private static final String fieldNames[] = { �FOR f:role.elements.iterator.toIterable.filter(typeof(Field)) SEPARATOR ','�f.name�ENDFOR� };
		@Override public List<String> getFieldNames() { return Arrays.asList(fieldNames); }
		private static final String activeBehaviorNames[] = { �FOR m:role.elements.iterator.toIterable.filter(typeof(Behavior)) SEPARATOR ','�m.name�ENDFOR� };
		protected void getInitialActiveBehaviors(Collection<String> storage) {
			super.getInitialActiveBehaviors(storage);
			storage.addAll(Arrays.asList(activeBehaviorNames);
		}
		@Override public boolean verifyRequirements(Context context, SharedState state) {
			if(!super.verifyRequirements(context,state)) return false;
			Map<String,Integer> localVariables = Collections.EMPTY_MAP;
			�FOR r:role.elements.iterator.toIterable.filter(typeof(Require))�
			if(!�r.exp.compileExpr�) return false;
			�ENDFOR�
			return true;
		}
		@Override protected abstract void initializeUpdateFunctions() {
			�FOR u:role.elements.iterator.toIterable.filter(typeof(Update))�
			updateFunctions.add(new UpdateFunction() {
				@Override public void update(String name, ContextManager context, SharedState sharedState) {
					if(!"�u.name�".equals(name)) throw new Error("Naming mismatch for update function");
					
				}
			�ENDFOR�
		}
		
	}
	'''

	def compileEnsemble(Ensemble ensemble) '''
	package �packageName�;
	public class �ensemble.name�_RoCo extends RoCoEnsemble { }
	'''

	def compileEnum(EnumDef enumd) '''
	package �packageName�;
	public class �enumd.name�_RoCo extends RoCoEnum { }
	'''

	def dispatch compileExpr(BinaryExpr e) '''(�e.lhs.compileExpr��e.op��e.rhs.compileExpr�)'''

	def dispatch compileExpr(Value e) '''�IF e.extern==null��e.value��ELSE�getProgram().getExterns().get_�e.extern�()�ENDIF�'''

	def dispatch compileExpr(FunctionCall e) '''getProgram().getFunctions().call_�e.name�(�FOR a:e.arguments SEPARATOR ','��a.compileExpr��ENDFOR�'''

	def dispatch compileExpr(InternalQualifiedName e) '''�e.qualifier.name�.�e.name�'''

	def dispatch compileExpr(LocalVariable v) '''state.get(localVariables,"�v.name�")'''

}
