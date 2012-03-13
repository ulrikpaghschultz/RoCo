/*
* generated by Xtext
*/
package dk.sdu.mmmi.modular.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import dk.sdu.mmmi.modular.services.RobustCollaborationGrammarAccess;

public class RobustCollaborationParser extends AbstractContentAssistParser {
	
	@Inject
	private RobustCollaborationGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected dk.sdu.mmmi.modular.ui.contentassist.antlr.internal.InternalRobustCollaborationParser createParser() {
		dk.sdu.mmmi.modular.ui.contentassist.antlr.internal.InternalRobustCollaborationParser result = new dk.sdu.mmmi.modular.ui.contentassist.antlr.internal.InternalRobustCollaborationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getProgramElementAccess().getAlternatives(), "rule__ProgramElement__Alternatives");
					put(grammarAccess.getLocalTypeAccess().getAlternatives(), "rule__LocalType__Alternatives");
					put(grammarAccess.getScopeDefiningElementAccess().getAlternatives(), "rule__ScopeDefiningElement__Alternatives");
					put(grammarAccess.getMemberAccess().getAlternatives(), "rule__Member__Alternatives");
					put(grammarAccess.getExprAccess().getAlternatives(), "rule__Expr__Alternatives");
					put(grammarAccess.getBinaryOperatorAccess().getAlternatives(), "rule__BinaryOperator__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getExternalNameAccess().getGroup(), "rule__ExternalName__Group__0");
					put(grammarAccess.getTypeDefAccess().getGroup(), "rule__TypeDef__Group__0");
					put(grammarAccess.getEnumDefAccess().getGroup(), "rule__EnumDef__Group__0");
					put(grammarAccess.getEnumDefAccess().getGroup_4(), "rule__EnumDef__Group_4__0");
					put(grammarAccess.getEnsembleAccess().getGroup(), "rule__Ensemble__Group__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getRoleAccess().getGroup_4(), "rule__Role__Group_4__0");
					put(grammarAccess.getRoleAccess().getGroup_5(), "rule__Role__Group_5__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getFieldAccess().getGroup_2(), "rule__Field__Group_2__0");
					put(grammarAccess.getRequireAccess().getGroup(), "rule__Require__Group__0");
					put(grammarAccess.getBehaviorAccess().getGroup(), "rule__Behavior__Group__0");
					put(grammarAccess.getBehaviorAccess().getGroup_1(), "rule__Behavior__Group_1__0");
					put(grammarAccess.getBehaviorAccess().getGroup_4(), "rule__Behavior__Group_4__0");
					put(grammarAccess.getBehaviorAccess().getGroup_4_1(), "rule__Behavior__Group_4_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_3(), "rule__Method__Group_3__0");
					put(grammarAccess.getMethodAccess().getGroup_3_1(), "rule__Method__Group_3_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getBinaryExprAccess().getGroup(), "rule__BinaryExpr__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_2(), "rule__FunctionCall__Group_2__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_2_1(), "rule__FunctionCall__Group_2_1__0");
					put(grammarAccess.getForLoopAccess().getGroup(), "rule__ForLoop__Group__0");
					put(grammarAccess.getConditionalAccess().getGroup(), "rule__Conditional__Group__0");
					put(grammarAccess.getConditionalAccess().getGroup_7(), "rule__Conditional__Group_7__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_4(), "rule__Operation__Group_4__0");
					put(grammarAccess.getOperationAccess().getGroup_4_1(), "rule__Operation__Group_4_1__0");
					put(grammarAccess.getSelfOperationAccess().getGroup(), "rule__SelfOperation__Group__0");
					put(grammarAccess.getSelfOperationAccess().getGroup_4(), "rule__SelfOperation__Group_4__0");
					put(grammarAccess.getSelfOperationAccess().getGroup_4_1(), "rule__SelfOperation__Group_4_1__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getValueAccess().getGroup_1(), "rule__Value__Group_1__0");
					put(grammarAccess.getUpdateAccess().getGroup(), "rule__Update__Group__0");
					put(grammarAccess.getConstantDefinitionAccess().getGroup(), "rule__ConstantDefinition__Group__0");
					put(grammarAccess.getConstantAssignmentAccess().getGroup(), "rule__ConstantAssignment__Group__0");
					put(grammarAccess.getProgramAccess().getNameAssignment_1(), "rule__Program__NameAssignment_1");
					put(grammarAccess.getProgramAccess().getElementsAssignment_3(), "rule__Program__ElementsAssignment_3");
					put(grammarAccess.getExternalNameAccess().getNameAssignment_1(), "rule__ExternalName__NameAssignment_1");
					put(grammarAccess.getTypeDefAccess().getNameAssignment_1(), "rule__TypeDef__NameAssignment_1");
					put(grammarAccess.getEnumDefAccess().getNameAssignment_1(), "rule__EnumDef__NameAssignment_1");
					put(grammarAccess.getEnumDefAccess().getNamesAssignment_3(), "rule__EnumDef__NamesAssignment_3");
					put(grammarAccess.getEnumDefAccess().getNamesAssignment_4_1(), "rule__EnumDef__NamesAssignment_4_1");
					put(grammarAccess.getEnsembleAccess().getNameAssignment_1(), "rule__Ensemble__NameAssignment_1");
					put(grammarAccess.getEnsembleAccess().getElementsAssignment_3(), "rule__Ensemble__ElementsAssignment_3");
					put(grammarAccess.getRoleAccess().getAbstractAssignment_0(), "rule__Role__AbstractAssignment_0");
					put(grammarAccess.getRoleAccess().getMixinAssignment_1(), "rule__Role__MixinAssignment_1");
					put(grammarAccess.getRoleAccess().getNameAssignment_3(), "rule__Role__NameAssignment_3");
					put(grammarAccess.getRoleAccess().getExtendsRoleAssignment_4_1(), "rule__Role__ExtendsRoleAssignment_4_1");
					put(grammarAccess.getRoleAccess().getWithinEnsembleAssignment_5_1(), "rule__Role__WithinEnsembleAssignment_5_1");
					put(grammarAccess.getRoleAccess().getElementsAssignment_7(), "rule__Role__ElementsAssignment_7");
					put(grammarAccess.getFieldAccess().getTypeAssignment_0(), "rule__Field__TypeAssignment_0");
					put(grammarAccess.getFieldAccess().getNameAssignment_1(), "rule__Field__NameAssignment_1");
					put(grammarAccess.getFieldAccess().getInitialAssignment_2_1(), "rule__Field__InitialAssignment_2_1");
					put(grammarAccess.getRequireAccess().getExpAssignment_1(), "rule__Require__ExpAssignment_1");
					put(grammarAccess.getBehaviorAccess().getQualifierAssignment_1_0(), "rule__Behavior__QualifierAssignment_1_0");
					put(grammarAccess.getBehaviorAccess().getNameAssignment_2(), "rule__Behavior__NameAssignment_2");
					put(grammarAccess.getBehaviorAccess().getParamsAssignment_4_0(), "rule__Behavior__ParamsAssignment_4_0");
					put(grammarAccess.getBehaviorAccess().getParamsAssignment_4_1_1(), "rule__Behavior__ParamsAssignment_4_1_1");
					put(grammarAccess.getBehaviorAccess().getBodyAssignment_7(), "rule__Behavior__BodyAssignment_7");
					put(grammarAccess.getParameterAccess().getTypeAssignment_0(), "rule__Parameter__TypeAssignment_0");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getMethodAccess().getTypeAssignment_0(), "rule__Method__TypeAssignment_0");
					put(grammarAccess.getMethodAccess().getNameAssignment_1(), "rule__Method__NameAssignment_1");
					put(grammarAccess.getMethodAccess().getParamsAssignment_3_0(), "rule__Method__ParamsAssignment_3_0");
					put(grammarAccess.getMethodAccess().getParamsAssignment_3_1_1(), "rule__Method__ParamsAssignment_3_1_1");
					put(grammarAccess.getMethodAccess().getBodyAssignment_6(), "rule__Method__BodyAssignment_6");
					put(grammarAccess.getLocalVariableAccess().getNameAssignment(), "rule__LocalVariable__NameAssignment");
					put(grammarAccess.getQualifiedNameAccess().getQualifierAssignment_0(), "rule__QualifiedName__QualifierAssignment_0");
					put(grammarAccess.getQualifiedNameAccess().getNameAssignment_2(), "rule__QualifiedName__NameAssignment_2");
					put(grammarAccess.getBinaryExprAccess().getLhsAssignment_1(), "rule__BinaryExpr__LhsAssignment_1");
					put(grammarAccess.getBinaryExprAccess().getOpAssignment_2(), "rule__BinaryExpr__OpAssignment_2");
					put(grammarAccess.getBinaryExprAccess().getRhsAssignment_3(), "rule__BinaryExpr__RhsAssignment_3");
					put(grammarAccess.getFunctionCallAccess().getNameAssignment_0(), "rule__FunctionCall__NameAssignment_0");
					put(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_0(), "rule__FunctionCall__ArgumentsAssignment_2_0");
					put(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_1_1(), "rule__FunctionCall__ArgumentsAssignment_2_1_1");
					put(grammarAccess.getForLoopAccess().getVariableAssignment_2(), "rule__ForLoop__VariableAssignment_2");
					put(grammarAccess.getForLoopAccess().getQualifierAssignment_4(), "rule__ForLoop__QualifierAssignment_4");
					put(grammarAccess.getForLoopAccess().getSharedAssignment_6(), "rule__ForLoop__SharedAssignment_6");
					put(grammarAccess.getForLoopAccess().getBodyAssignment_9(), "rule__ForLoop__BodyAssignment_9");
					put(grammarAccess.getConditionalAccess().getConditionAssignment_2(), "rule__Conditional__ConditionAssignment_2");
					put(grammarAccess.getConditionalAccess().getThenBranchAssignment_5(), "rule__Conditional__ThenBranchAssignment_5");
					put(grammarAccess.getConditionalAccess().getElseBranchAssignment_7_2(), "rule__Conditional__ElseBranchAssignment_7_2");
					put(grammarAccess.getOperationAccess().getQualifierAssignment_0(), "rule__Operation__QualifierAssignment_0");
					put(grammarAccess.getOperationAccess().getNameAssignment_2(), "rule__Operation__NameAssignment_2");
					put(grammarAccess.getOperationAccess().getArgumentsAssignment_4_0(), "rule__Operation__ArgumentsAssignment_4_0");
					put(grammarAccess.getOperationAccess().getArgumentsAssignment_4_1_1(), "rule__Operation__ArgumentsAssignment_4_1_1");
					put(grammarAccess.getSelfOperationAccess().getNameAssignment_2(), "rule__SelfOperation__NameAssignment_2");
					put(grammarAccess.getSelfOperationAccess().getArgumentsAssignment_4_0(), "rule__SelfOperation__ArgumentsAssignment_4_0");
					put(grammarAccess.getSelfOperationAccess().getArgumentsAssignment_4_1_1(), "rule__SelfOperation__ArgumentsAssignment_4_1_1");
					put(grammarAccess.getAssignmentAccess().getNameAssignment_0(), "rule__Assignment__NameAssignment_0");
					put(grammarAccess.getAssignmentAccess().getExpAssignment_2(), "rule__Assignment__ExpAssignment_2");
					put(grammarAccess.getValueAccess().getValueAssignment_0(), "rule__Value__ValueAssignment_0");
					put(grammarAccess.getValueAccess().getExternAssignment_1_1(), "rule__Value__ExternAssignment_1_1");
					put(grammarAccess.getUpdateAccess().getBodyAssignment_2(), "rule__Update__BodyAssignment_2");
					put(grammarAccess.getUpdateAccess().getBodyAssignment_3(), "rule__Update__BodyAssignment_3");
					put(grammarAccess.getConstantDefinitionAccess().getAbstractAssignment_0(), "rule__ConstantDefinition__AbstractAssignment_0");
					put(grammarAccess.getConstantDefinitionAccess().getTypeAssignment_2(), "rule__ConstantDefinition__TypeAssignment_2");
					put(grammarAccess.getConstantDefinitionAccess().getNameAssignment_3(), "rule__ConstantDefinition__NameAssignment_3");
					put(grammarAccess.getConstantAssignmentAccess().getLhsAssignment_0(), "rule__ConstantAssignment__LhsAssignment_0");
					put(grammarAccess.getConstantAssignmentAccess().getRhsAssignment_2(), "rule__ConstantAssignment__RhsAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			dk.sdu.mmmi.modular.ui.contentassist.antlr.internal.InternalRobustCollaborationParser typedParser = (dk.sdu.mmmi.modular.ui.contentassist.antlr.internal.InternalRobustCollaborationParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RobustCollaborationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RobustCollaborationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
