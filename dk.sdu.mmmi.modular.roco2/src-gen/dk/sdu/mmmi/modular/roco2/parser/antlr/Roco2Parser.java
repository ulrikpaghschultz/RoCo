/*
* generated by Xtext
*/
package dk.sdu.mmmi.modular.roco2.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import dk.sdu.mmmi.modular.roco2.services.Roco2GrammarAccess;

public class Roco2Parser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private Roco2GrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected dk.sdu.mmmi.modular.roco2.parser.antlr.internal.InternalRoco2Parser createParser(XtextTokenStream stream) {
		return new dk.sdu.mmmi.modular.roco2.parser.antlr.internal.InternalRoco2Parser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}
	
	public Roco2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Roco2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
