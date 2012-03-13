package dk.sdu.mmmi.modular.roco2.generator;

import dk.sdu.mmmi.modular.roco2.roco2.Behavior;
import dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr;
import dk.sdu.mmmi.modular.roco2.roco2.Ensemble;
import dk.sdu.mmmi.modular.roco2.roco2.EnumDef;
import dk.sdu.mmmi.modular.roco2.roco2.Expr;
import dk.sdu.mmmi.modular.roco2.roco2.ExternalName;
import dk.sdu.mmmi.modular.roco2.roco2.Field;
import dk.sdu.mmmi.modular.roco2.roco2.FunctionCall;
import dk.sdu.mmmi.modular.roco2.roco2.InternalQualifiedName;
import dk.sdu.mmmi.modular.roco2.roco2.LocalType;
import dk.sdu.mmmi.modular.roco2.roco2.LocalVariable;
import dk.sdu.mmmi.modular.roco2.roco2.Member;
import dk.sdu.mmmi.modular.roco2.roco2.Program;
import dk.sdu.mmmi.modular.roco2.roco2.Require;
import dk.sdu.mmmi.modular.roco2.roco2.Role;
import dk.sdu.mmmi.modular.roco2.roco2.ScopeDefiningElement;
import dk.sdu.mmmi.modular.roco2.roco2.Update;
import dk.sdu.mmmi.modular.roco2.roco2.Value;
import java.util.Arrays;
import java.util.Iterator;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Roco2Generator implements IGenerator {
  @Inject
  private IQualifiedNameProvider nameProvider;
  
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private QualifiedName packageName;
  
  public void doGenerate(final Resource _resource, final IFileSystemAccess _fsa) {
      this.resource = _resource;
      this.fsa = _fsa;
      final Function1<Program,CharSequence> _function = new Function1<Program,CharSequence>() {
          public CharSequence apply(final Program x) {
            CharSequence _xblockexpression = null;
            {
              QualifiedName _fullyQualifiedName = Roco2Generator.this.nameProvider.getFullyQualifiedName(x);
              Roco2Generator.this.packageName = _fullyQualifiedName;
              CharSequence _compileProgram = Roco2Generator.this.compileProgram(x);
              _xblockexpression = (_compileProgram);
            }
            return _xblockexpression;
          }
        };
      this.<Program>generateForType("Program", dk.sdu.mmmi.modular.roco2.roco2.Program.class, _function);
      final Function1<Ensemble,CharSequence> _function_1 = new Function1<Ensemble,CharSequence>() {
          public CharSequence apply(final Ensemble x) {
            CharSequence _compileEnsemble = Roco2Generator.this.compileEnsemble(x);
            return _compileEnsemble;
          }
        };
      this.<Ensemble>generateForType(null, dk.sdu.mmmi.modular.roco2.roco2.Ensemble.class, _function_1);
      final Function1<Role,CharSequence> _function_2 = new Function1<Role,CharSequence>() {
          public CharSequence apply(final Role x) {
            CharSequence _compileRole = Roco2Generator.this.compileRole(x);
            return _compileRole;
          }
        };
      this.<Role>generateForType(null, dk.sdu.mmmi.modular.roco2.roco2.Role.class, _function_2);
      final Function1<EnumDef,CharSequence> _function_3 = new Function1<EnumDef,CharSequence>() {
          public CharSequence apply(final EnumDef x) {
            CharSequence _compileEnum = Roco2Generator.this.compileEnum(x);
            return _compileEnum;
          }
        };
      this.<EnumDef>generateForType(null, dk.sdu.mmmi.modular.roco2.roco2.EnumDef.class, _function_3);
  }
  
  public <T extends EObject> void generateForType(final String fileName, final Class<T> type, final Function1<? super T,? extends CharSequence> contents) {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<T> _filter = IterableExtensions.<T>filter(_iterable, type);
    for (final T e : _filter) {
      QualifiedName _fullyQualifiedName = this.nameProvider.getFullyQualifiedName(e);
      String _string = _fullyQualifiedName.toString();
      String _replace = _string.replace(".", "/");
      String _xifexpression = null;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(fileName, null);
      if (_operator_notEquals) {
        String _operator_plus = StringExtensions.operator_plus("/", fileName);
        _xifexpression = _operator_plus;
      } else {
        _xifexpression = "_RoCo";
      }
      String _operator_plus_1 = StringExtensions.operator_plus(_replace, _xifexpression);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".java");
      CharSequence _apply = contents.apply(e);
      this.fsa.generateFile(_operator_plus_2, _apply);
    }
  }
  
  public CharSequence compileProgram(final Program program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import distributedLanguage.*;");
    _builder.newLine();
    _builder.append("public class Program extends RoCoProgram { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override List<Entity> getAllEntities() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ArrayList<Entity> result = new ArrayList<Entity>();");
    _builder.newLine();
    {
      EList<LocalType> _elements = program.getElements();
      for(final LocalType r : _elements) {
        _builder.append("\t\t");
        CharSequence _generateMemberListEntry = this.generateMemberListEntry(r);
        _builder.append(_generateMemberListEntry, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateMemberListEntry(final LocalType x) {
    return null;
  }
  
  protected CharSequence _generateMemberListEntry(final Ensemble e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("result.add(new ");
    QualifiedName _fullyQualifiedName = this.nameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName, "");
    _builder.append("(this));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateMemberListEntry(final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("result.add(new ");
    QualifiedName _fullyQualifiedName = this.nameProvider.getFullyQualifiedName(r);
    _builder.append(_fullyQualifiedName, "");
    _builder.append("(this));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileRole(final Role role) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import distributedLanguage.*;");
    _builder.newLine();
    _builder.append("public class ");
    String _name = role.getName();
    _builder.append(_name, "");
    _builder.append("_RoCo extends ");
    {
      Role _extendsRole = role.getExtendsRole();
      boolean _operator_equals = ObjectExtensions.operator_equals(_extendsRole, null);
      if (_operator_equals) {
        _builder.append("RoCoRole");
      } else {
        Role _extendsRole_1 = role.getExtendsRole();
        QualifiedName _fullyQualifiedName = this.nameProvider.getFullyQualifiedName(_extendsRole_1);
        _builder.append(_fullyQualifiedName, "");
        _builder.append("_Roco");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = role.getName();
    _builder.append(_name_1, "	");
    _builder.append("_RoCo(Program program) { super(program); }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@Override public Program getProgram() { return (Program)super.getProgram(); }");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override public boolean isAbstract() { return ");
    boolean _isAbstract = role.isAbstract();
    _builder.append(_isAbstract, "	");
    _builder.append("; }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@Override public boolean isPrimaryRole() { return ");
    boolean _isMixin = role.isMixin();
    boolean _operator_not = BooleanExtensions.operator_not(_isMixin);
    _builder.append(_operator_not, "	");
    _builder.append("; }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@Override public String getName() { return \"");
    String _name_2 = role.getName();
    _builder.append(_name_2, "	");
    _builder.append("\"; }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Role _extendsRole_2 = role.getExtendsRole();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_extendsRole_2, null);
      if (_operator_notEquals) {
        _builder.append("@Override public String getSuperName() {\u00A0return \"");
        Role _extendsRole_3 = role.getExtendsRole();
        String _name_3 = _extendsRole_3.getName();
        _builder.append(_name_3, "	");
        _builder.append("\"; }");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Ensemble _withinEnsemble = role.getWithinEnsemble();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_withinEnsemble, null);
      if (_operator_notEquals_1) {
        _builder.append("@Override public String getEnsembleName() { return \"");
        Ensemble _withinEnsemble_1 = role.getWithinEnsemble();
        String _name_4 = _withinEnsemble_1.getName();
        _builder.append(_name_4, "	");
        _builder.append("\"; } ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private static final String fieldNames[] = { ");
    {
      EList<Member> _elements = role.getElements();
      Iterator<Member> _iterator = _elements.iterator();
      Iterable<Member> _iterable = IteratorExtensions.<Member>toIterable(_iterator);
      Iterable<Field> _filter = IterableExtensions.<Field>filter(_iterable, dk.sdu.mmmi.modular.roco2.roco2.Field.class);
      boolean _hasElements = false;
      for(final Field f : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        _builder.append("f.name");
      }
    }
    _builder.append(" };");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@Override public List<String> getFieldNames() { return Arrays.asList(fieldNames); }");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String activeBehaviorNames[] = { ");
    {
      EList<Member> _elements_1 = role.getElements();
      Iterator<Member> _iterator_1 = _elements_1.iterator();
      Iterable<Member> _iterable_1 = IteratorExtensions.<Member>toIterable(_iterator_1);
      Iterable<Behavior> _filter_1 = IterableExtensions.<Behavior>filter(_iterable_1, dk.sdu.mmmi.modular.roco2.roco2.Behavior.class);
      boolean _hasElements_1 = false;
      for(final Behavior m : _filter_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        _builder.append("m.name");
      }
    }
    _builder.append(" };");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("protected void getInitialActiveBehaviors(Collection<String> storage) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super.getInitialActiveBehaviors(storage);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("storage.addAll(Arrays.asList(activeBehaviorNames);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override public boolean verifyRequirements(Context context, SharedState state) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(!super.verifyRequirements(context,state)) return false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Map<String,Integer> localVariables = Collections.EMPTY_MAP;");
    _builder.newLine();
    {
      EList<Member> _elements_2 = role.getElements();
      Iterator<Member> _iterator_2 = _elements_2.iterator();
      Iterable<Member> _iterable_2 = IteratorExtensions.<Member>toIterable(_iterator_2);
      Iterable<Require> _filter_2 = IterableExtensions.<Require>filter(_iterable_2, dk.sdu.mmmi.modular.roco2.roco2.Require.class);
      for(final Require r : _filter_2) {
        _builder.append("\t\t");
        _builder.append("if(!");
        Expr _exp = r.getExp();
        CharSequence _compileExpr = this.compileExpr(_exp);
        _builder.append(_compileExpr, "		");
        _builder.append(") return false;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override protected abstract void initializeUpdateFunctions() {");
    _builder.newLine();
    {
      EList<Member> _elements_3 = role.getElements();
      Iterator<Member> _iterator_3 = _elements_3.iterator();
      Iterable<Member> _iterable_3 = IteratorExtensions.<Member>toIterable(_iterator_3);
      Iterable<Update> _filter_3 = IterableExtensions.<Update>filter(_iterable_3, dk.sdu.mmmi.modular.roco2.roco2.Update.class);
      for(final Update u : _filter_3) {
        _builder.append("\t\t");
        _builder.append("updateFunctions.add(new UpdateFunction() {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("@Override public void update(String name, ContextManager context, SharedState sharedState) {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("if(!\"");
        String _name_5 = u.getName();
        _builder.append(_name_5, "				");
        _builder.append("\".equals(name)) throw new Error(\"Naming mismatch for update function\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileEnsemble(final Ensemble ensemble) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _name = ensemble.getName();
    _builder.append(_name, "");
    _builder.append("_RoCo extends RoCoEnsemble { }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileEnum(final EnumDef enumd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _name = enumd.getName();
    _builder.append(_name, "");
    _builder.append("_RoCo extends RoCoEnum { }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compileExpr(final BinaryExpr e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expr _lhs = e.getLhs();
    CharSequence _compileExpr = this.compileExpr(_lhs);
    _builder.append(_compileExpr, "");
    String _op = e.getOp();
    _builder.append(_op, "");
    Expr _rhs = e.getRhs();
    CharSequence _compileExpr_1 = this.compileExpr(_rhs);
    _builder.append(_compileExpr_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Value e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ExternalName _extern = e.getExtern();
      boolean _operator_equals = ObjectExtensions.operator_equals(_extern, null);
      if (_operator_equals) {
        int _value = e.getValue();
        _builder.append(_value, "");
      } else {
        _builder.append("getProgram().getExterns().get_");
        ExternalName _extern_1 = e.getExtern();
        _builder.append(_extern_1, "");
        _builder.append("()");
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileExpr(final FunctionCall e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("getProgram().getFunctions().call_");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("(");
    {
      EList<Expr> _arguments = e.getArguments();
      boolean _hasElements = false;
      for(final Expr a : _arguments) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _compileExpr = this.compileExpr(a);
        _builder.append(_compileExpr, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileExpr(final InternalQualifiedName e) {
    StringConcatenation _builder = new StringConcatenation();
    ScopeDefiningElement _qualifier = e.getQualifier();
    String _name = _qualifier.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _name_1 = e.getName();
    _builder.append(_name_1, "");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final LocalVariable v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("state.get(localVariables,\"");
    String _name = v.getName();
    _builder.append(_name, "");
    _builder.append("\")");
    return _builder;
  }
  
  public CharSequence generateMemberListEntry(final LocalType e) {
    if (e instanceof Ensemble) {
      return _generateMemberListEntry((Ensemble)e);
    } else if (e instanceof Role) {
      return _generateMemberListEntry((Role)e);
    } else if (e != null) {
      return _generateMemberListEntry(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public CharSequence compileExpr(final Expr e) {
    if (e instanceof BinaryExpr) {
      return _compileExpr((BinaryExpr)e);
    } else if (e instanceof FunctionCall) {
      return _compileExpr((FunctionCall)e);
    } else if (e instanceof InternalQualifiedName) {
      return _compileExpr((InternalQualifiedName)e);
    } else if (e instanceof LocalVariable) {
      return _compileExpr((LocalVariable)e);
    } else if (e instanceof Value) {
      return _compileExpr((Value)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
