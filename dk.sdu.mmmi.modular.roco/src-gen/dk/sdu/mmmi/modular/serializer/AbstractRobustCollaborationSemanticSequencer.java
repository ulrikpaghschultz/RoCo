package dk.sdu.mmmi.modular.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.sdu.mmmi.modular.robustCollaboration.Assignment;
import dk.sdu.mmmi.modular.robustCollaboration.Behavior;
import dk.sdu.mmmi.modular.robustCollaboration.BinaryExpr;
import dk.sdu.mmmi.modular.robustCollaboration.Conditional;
import dk.sdu.mmmi.modular.robustCollaboration.ConstantAssignment;
import dk.sdu.mmmi.modular.robustCollaboration.ConstantDefinition;
import dk.sdu.mmmi.modular.robustCollaboration.Ensemble;
import dk.sdu.mmmi.modular.robustCollaboration.EnumDef;
import dk.sdu.mmmi.modular.robustCollaboration.ExternalName;
import dk.sdu.mmmi.modular.robustCollaboration.Field;
import dk.sdu.mmmi.modular.robustCollaboration.FunctionCall;
import dk.sdu.mmmi.modular.robustCollaboration.LocalVariable;
import dk.sdu.mmmi.modular.robustCollaboration.Method;
import dk.sdu.mmmi.modular.robustCollaboration.Operation;
import dk.sdu.mmmi.modular.robustCollaboration.Parameter;
import dk.sdu.mmmi.modular.robustCollaboration.Program;
import dk.sdu.mmmi.modular.robustCollaboration.QualifiedName;
import dk.sdu.mmmi.modular.robustCollaboration.Require;
import dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage;
import dk.sdu.mmmi.modular.robustCollaboration.Role;
import dk.sdu.mmmi.modular.robustCollaboration.SelfOperation;
import dk.sdu.mmmi.modular.robustCollaboration.TypeDef;
import dk.sdu.mmmi.modular.robustCollaboration.Update;
import dk.sdu.mmmi.modular.robustCollaboration.Value;
import dk.sdu.mmmi.modular.services.RobustCollaborationGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractRobustCollaborationSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected RobustCollaborationGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RobustCollaborationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RobustCollaborationPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.BEHAVIOR:
				if(context == grammarAccess.getBehaviorRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_Behavior(context, (Behavior) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.BINARY_EXPR:
				if(context == grammarAccess.getBinaryExprRule() ||
				   context == grammarAccess.getExprRule()) {
					sequence_BinaryExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.CONDITIONAL:
				if(context == grammarAccess.getConditionalRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Conditional(context, (Conditional) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.CONSTANT_ASSIGNMENT:
				if(context == grammarAccess.getConstantAssignmentRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_ConstantAssignment(context, (ConstantAssignment) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.CONSTANT_DEFINITION:
				if(context == grammarAccess.getConstantDefinitionRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_ConstantDefinition(context, (ConstantDefinition) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.ENSEMBLE:
				if(context == grammarAccess.getEnsembleRule() ||
				   context == grammarAccess.getLocalTypeRule() ||
				   context == grammarAccess.getProgramElementRule() ||
				   context == grammarAccess.getScopeDefiningElementRule()) {
					sequence_Ensemble(context, (Ensemble) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.ENUM_DEF:
				if(context == grammarAccess.getEnumDefRule() ||
				   context == grammarAccess.getLocalTypeRule() ||
				   context == grammarAccess.getProgramElementRule() ||
				   context == grammarAccess.getScopeDefiningElementRule()) {
					sequence_EnumDef(context, (EnumDef) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.EXTERNAL_NAME:
				if(context == grammarAccess.getExternalNameRule() ||
				   context == grammarAccess.getProgramElementRule()) {
					sequence_ExternalName(context, (ExternalName) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.FIELD:
				if(context == grammarAccess.getFieldRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.FUNCTION_CALL:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getFunctionCallRule()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.LOCAL_VARIABLE:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getLocalVariableRule()) {
					sequence_LocalVariable(context, (LocalVariable) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.METHOD:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.OPERATION:
				if(context == grammarAccess.getOperationRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.QUALIFIED_NAME:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getQualifiedNameRule()) {
					sequence_QualifiedName(context, (QualifiedName) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.REQUIRE:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getRequireRule()) {
					sequence_Require(context, (Require) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.ROLE:
				if(context == grammarAccess.getLocalTypeRule() ||
				   context == grammarAccess.getProgramElementRule() ||
				   context == grammarAccess.getRoleRule() ||
				   context == grammarAccess.getScopeDefiningElementRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.SELF_OPERATION:
				if(context == grammarAccess.getSelfOperationRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_SelfOperation(context, (SelfOperation) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.TYPE_DEF:
				if(context == grammarAccess.getLocalTypeRule() ||
				   context == grammarAccess.getProgramElementRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_TypeDef(context, (TypeDef) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.UPDATE:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getUpdateRule()) {
					sequence_Update(context, (Update) semanticObject); 
					return; 
				}
				else break;
			case RobustCollaborationPackage.VALUE:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Value(context, (Value) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID exp=Expr)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.ASSIGNMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.ASSIGNMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.ASSIGNMENT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.ASSIGNMENT__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssignmentAccess().getExpExprParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (qualifier=[ScopeDefiningElement|ID]? name=ID (params+=Parameter params+=Parameter*)? body+=Statement*)
	 */
	protected void sequence_Behavior(EObject context, Behavior semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Expr op=BinaryOperator rhs=Expr)
	 */
	protected void sequence_BinaryExpr(EObject context, BinaryExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.BINARY_EXPR__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.BINARY_EXPR__LHS));
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.BINARY_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.BINARY_EXPR__OP));
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.BINARY_EXPR__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.BINARY_EXPR__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBinaryExprAccess().getLhsExprParserRuleCall_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getBinaryExprAccess().getOpBinaryOperatorParserRuleCall_2_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getBinaryExprAccess().getRhsExprParserRuleCall_3_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expr thenBranch+=Statement* elseBranch+=Statement*)
	 */
	protected void sequence_Conditional(EObject context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=ID rhs=Expr)
	 */
	protected void sequence_ConstantAssignment(EObject context, ConstantAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.CONSTANT_ASSIGNMENT__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.CONSTANT_ASSIGNMENT__LHS));
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.CONSTANT_ASSIGNMENT__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.CONSTANT_ASSIGNMENT__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAssignmentAccess().getLhsIDTerminalRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getConstantAssignmentAccess().getRhsExprParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (abstract?='abstract'? type=[LocalType|ID] name=ID)
	 */
	protected void sequence_ConstantDefinition(EObject context, ConstantDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=Member*)
	 */
	protected void sequence_Ensemble(EObject context, Ensemble semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID names+=ID names+=ID*)
	 */
	protected void sequence_EnumDef(EObject context, EnumDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ExternalName(EObject context, ExternalName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.PROGRAM_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.PROGRAM_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalNameAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (shared?='shared'? type=[LocalType|ID] name=ID initial=Expr?)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (arguments+=Expr arguments+=Expr*)?)
	 */
	protected void sequence_FunctionCall(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_LocalVariable(EObject context, LocalVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.LOCAL_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.LOCAL_VARIABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[LocalType|ID] name=ID (params+=Parameter params+=Parameter*)? body+=Statement*)
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualifier=[ScopeDefiningElement|ID] name=ID (arguments+=Expr arguments+=Expr*)?)
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[LocalType|ID] name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeLocalTypeIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=ProgramElement*)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualifier=[ScopeDefiningElement|ID] name=ID)
	 */
	protected void sequence_QualifiedName(EObject context, QualifiedName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.QUALIFIED_NAME__QUALIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.QUALIFIED_NAME__QUALIFIER));
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.QUALIFIED_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.QUALIFIED_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQualifiedNameAccess().getQualifierScopeDefiningElementIDTerminalRuleCall_0_0_1(), semanticObject.getQualifier());
		feeder.accept(grammarAccess.getQualifiedNameAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expr
	 */
	protected void sequence_Require(EObject context, Require semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.REQUIRE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.REQUIRE__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRequireAccess().getExpExprParserRuleCall_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (abstract?='abstract'? name=ID extendsRole?=ID? withinEnsemble?=ID? elements+=Member*)
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (arguments+=Expr arguments+=Expr*)?)
	 */
	protected void sequence_SelfOperation(EObject context, SelfOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TypeDef(EObject context, TypeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RobustCollaborationPackage.Literals.PROGRAM_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobustCollaborationPackage.Literals.PROGRAM_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID sourceQualifier=[ScopeDefiningElement|ID] sourceName=ID)? body+=Statement*)
	 */
	protected void sequence_Update(EObject context, Update semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT | extern=[ExternalName|ID])
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
