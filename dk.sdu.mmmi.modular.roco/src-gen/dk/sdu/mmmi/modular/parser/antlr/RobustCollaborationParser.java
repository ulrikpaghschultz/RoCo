/*
* generated by Xtext
*/
package dk.sdu.mmmi.modular.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import dk.sdu.mmmi.modular.services.RobustCollaborationGrammarAccess;

public class RobustCollaborationParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private RobustCollaborationGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected dk.sdu.mmmi.modular.parser.antlr.internal.InternalRobustCollaborationParser createParser(XtextTokenStream stream) {
		return new dk.sdu.mmmi.modular.parser.antlr.internal.InternalRobustCollaborationParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}
	
	public RobustCollaborationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RobustCollaborationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}