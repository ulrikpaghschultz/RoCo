package dk.sdu.mmmi.modular.roco2.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.sdu.mmmi.modular.roco2.roco2.Assignment;
import dk.sdu.mmmi.modular.roco2.roco2.Behavior;
import dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr;
import dk.sdu.mmmi.modular.roco2.roco2.Conditional;
import dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment;
import dk.sdu.mmmi.modular.roco2.roco2.ConstantDefinition;
import dk.sdu.mmmi.modular.roco2.roco2.Ensemble;
import dk.sdu.mmmi.modular.roco2.roco2.EnumDef;
import dk.sdu.mmmi.modular.roco2.roco2.ExternalName;
import dk.sdu.mmmi.modular.roco2.roco2.Field;
import dk.sdu.mmmi.modular.roco2.roco2.ForLoop;
import dk.sdu.mmmi.modular.roco2.roco2.FunctionCall;
import dk.sdu.mmmi.modular.roco2.roco2.InternalQualifiedName;
import dk.sdu.mmmi.modular.roco2.roco2.LocalVariable;
import dk.sdu.mmmi.modular.roco2.roco2.Method;
import dk.sdu.mmmi.modular.roco2.roco2.ModuleConditional;
import dk.sdu.mmmi.modular.roco2.roco2.Operation;
import dk.sdu.mmmi.modular.roco2.roco2.OperationActivation;
import dk.sdu.mmmi.modular.roco2.roco2.OperationInhibit;
import dk.sdu.mmmi.modular.roco2.roco2.Parameter;
import dk.sdu.mmmi.modular.roco2.roco2.Program;
import dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement;
import dk.sdu.mmmi.modular.roco2.roco2.Require;
import dk.sdu.mmmi.modular.roco2.roco2.Roco2Package;
import dk.sdu.mmmi.modular.roco2.roco2.Role;
import dk.sdu.mmmi.modular.roco2.roco2.TypeDef;
import dk.sdu.mmmi.modular.roco2.roco2.Update;
import dk.sdu.mmmi.modular.roco2.roco2.Value;
import dk.sdu.mmmi.modular.roco2.services.Roco2GrammarAccess;
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
public class AbstractRoco2SemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected Roco2GrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == Roco2Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Roco2Package.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getBasicStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.BEHAVIOR:
				if(context == grammarAccess.getBehaviorRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_Behavior(context, (Behavior) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.BINARY_EXPR:
				if(context == grammarAccess.getBinaryExprRule() ||
				   context == grammarAccess.getExprRule()) {
					sequence_BinaryExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.CONDITIONAL:
				if(context == grammarAccess.getBasicStatementRule() ||
				   context == grammarAccess.getConditionalRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Conditional(context, (Conditional) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.CONSTANT_ASSIGNMENT:
				if(context == grammarAccess.getConstantAssignmentRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_ConstantAssignment(context, (ConstantAssignment) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.CONSTANT_DEFINITION:
				if(context == grammarAccess.getConstantDefinitionRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_ConstantDefinition(context, (ConstantDefinition) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.ENSEMBLE:
				if(context == grammarAccess.getEnsembleRule() ||
				   context == grammarAccess.getLocalTypeRule() ||
				   context == grammarAccess.getScopeDefiningElementRule()) {
					sequence_Ensemble(context, (Ensemble) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.ENUM_DEF:
				if(context == grammarAccess.getEnumDefRule() ||
				   context == grammarAccess.getLocalTypeRule() ||
				   context == grammarAccess.getScopeDefiningElementRule()) {
					sequence_EnumDef(context, (EnumDef) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.EXTERNAL_NAME:
				if(context == grammarAccess.getExternalNameRule()) {
					sequence_ExternalName(context, (ExternalName) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.FIELD:
				if(context == grammarAccess.getFieldRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.FOR_LOOP:
				if(context == grammarAccess.getBasicStatementRule() ||
				   context == grammarAccess.getForLoopRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ForLoop(context, (ForLoop) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.FUNCTION_CALL:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getFunctionCallRule()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.INTERNAL_QUALIFIED_NAME:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getInternalQualifiedNameRule()) {
					sequence_InternalQualifiedName(context, (InternalQualifiedName) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.LOCAL_VARIABLE:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getLocalVariableRule()) {
					sequence_LocalVariable(context, (LocalVariable) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.METHOD:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.MODULE_CONDITIONAL:
				if(context == grammarAccess.getModuleConditionalRule()) {
					sequence_ModuleConditional(context, (ModuleConditional) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.OPERATION:
				if(context == grammarAccess.getBasicStatementRule() ||
				   context == grammarAccess.getOperationRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.OPERATION_ACTIVATION:
				if(context == grammarAccess.getOperationActivationRule()) {
					sequence_OperationActivation(context, (OperationActivation) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.OPERATION_INHIBIT:
				if(context == grammarAccess.getOperationInhibitRule()) {
					sequence_OperationInhibit(context, (OperationInhibit) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.QUALIFIED_STATEMENT:
				if(context == grammarAccess.getQualifiedStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_QualifiedStatement(context, (QualifiedStatement) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.REQUIRE:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getRequireRule()) {
					sequence_Require(context, (Require) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.ROLE:
				if(context == grammarAccess.getLocalTypeRule() ||
				   context == grammarAccess.getRoleRule() ||
				   context == grammarAccess.getScopeDefiningElementRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.TYPE_DEF:
				if(context == grammarAccess.getLocalTypeRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_TypeDef(context, (TypeDef) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.UPDATE:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getUpdateRule()) {
					sequence_Update(context, (Update) semanticObject); 
					return; 
				}
				else break;
			case Roco2Package.VALUE:
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
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.ASSIGNMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.ASSIGNMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.ASSIGNMENT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.ASSIGNMENT__EXP));
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
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.BINARY_EXPR__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.BINARY_EXPR__LHS));
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.BINARY_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.BINARY_EXPR__OP));
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.BINARY_EXPR__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.BINARY_EXPR__RHS));
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
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.CONSTANT_ASSIGNMENT__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.CONSTANT_ASSIGNMENT__LHS));
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.CONSTANT_ASSIGNMENT__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.CONSTANT_ASSIGNMENT__RHS));
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
	 *     (name=ID extendsEnsemble=[Ensemble|ID]? elements+=Member*)
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
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.EXTERNAL_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.EXTERNAL_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalNameAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[LocalType|ID] name=ID initial=Expr?)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=ID qualifier=[ScopeDefiningElement|ID] shared=ID body+=Statement*)
	 */
	protected void sequence_ForLoop(EObject context, ForLoop semanticObject) {
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
	 *     (qualifier=[ScopeDefiningElement|ID] name=ID)
	 */
	protected void sequence_InternalQualifiedName(EObject context, InternalQualifiedName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.INTERNAL_QUALIFIED_NAME__QUALIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.INTERNAL_QUALIFIED_NAME__QUALIFIER));
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.INTERNAL_QUALIFIED_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.INTERNAL_QUALIFIED_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInternalQualifiedNameAccess().getQualifierScopeDefiningElementIDTerminalRuleCall_0_0_1(), semanticObject.getQualifier());
		feeder.accept(grammarAccess.getInternalQualifiedNameAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_LocalVariable(EObject context, LocalVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.LOCAL_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.LOCAL_VARIABLE__NAME));
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
	 *     conditional=Conditional
	 */
	protected void sequence_ModuleConditional(EObject context, ModuleConditional semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.MODULE_CONDITIONAL__CONDITIONAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.MODULE_CONDITIONAL__CONDITIONAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModuleConditionalAccess().getConditionalConditionalParserRuleCall_1_0(), semanticObject.getConditional());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operation=Operation
	 */
	protected void sequence_OperationActivation(EObject context, OperationActivation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.OPERATION_ACTIVATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.OPERATION_ACTIVATION__OPERATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOperationActivationAccess().getOperationOperationParserRuleCall_1_0(), semanticObject.getOperation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operation=Operation
	 */
	protected void sequence_OperationInhibit(EObject context, OperationInhibit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.OPERATION_INHIBIT__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.OPERATION_INHIBIT__OPERATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOperationInhibitAccess().getOperationOperationParserRuleCall_1_0(), semanticObject.getOperation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (arguments+=Expr arguments+=Expr*)?)
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
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeLocalTypeIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID externals+=ExternalName* elements+=LocalType*)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (self?='self' | qualifier=[ScopeDefiningElement|ID]) 
	 *         (statement=OperationActivation | statement=OperationInhibit | statement=ModuleConditional)
	 *     )
	 */
	protected void sequence_QualifiedStatement(EObject context, QualifiedStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expr
	 */
	protected void sequence_Require(EObject context, Require semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.REQUIRE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.REQUIRE__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRequireAccess().getExpExprParserRuleCall_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         mixin?='mixin'? 
	 *         name=ID 
	 *         extendsRole=[Role|ID]? 
	 *         withinEnsemble=[Ensemble|ID]? 
	 *         elements+=Member*
	 *     )
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TypeDef(EObject context, TypeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Roco2Package.Literals.LOCAL_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Roco2Package.Literals.LOCAL_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID body+=Statement body+=Statement*)
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
