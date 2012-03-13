package dk.sdu.mmmi.modular.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.modular.services.RobustCollaborationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobustCollaborationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'&&'", "'package'", "';'", "'external'", "'type'", "'enum'", "'{'", "'}'", "','", "'ensemble'", "'role'", "'extends'", "'within'", "'='", "'require'", "'behavior'", "'('", "')'", "'.'", "'for'", "':'", "'if'", "'else'", "'self'", "'@'", "'update'", "'constant'", "'abstract'", "'mixin'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalRobustCollaborationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRobustCollaborationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRobustCollaborationParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g"; }


     
     	private RobustCollaborationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RobustCollaborationGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProgram"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:61:1: ( ruleProgram EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:69:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:73:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:74:1: ( ( rule__Program__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:74:1: ( ( rule__Program__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:75:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:76:1: ( rule__Program__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:76:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram94);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProgramElement"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:88:1: entryRuleProgramElement : ruleProgramElement EOF ;
    public final void entryRuleProgramElement() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:89:1: ( ruleProgramElement EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:90:1: ruleProgramElement EOF
            {
             before(grammarAccess.getProgramElementRule()); 
            pushFollow(FOLLOW_ruleProgramElement_in_entryRuleProgramElement121);
            ruleProgramElement();

            state._fsp--;

             after(grammarAccess.getProgramElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgramElement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgramElement"


    // $ANTLR start "ruleProgramElement"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:97:1: ruleProgramElement : ( ( rule__ProgramElement__Alternatives ) ) ;
    public final void ruleProgramElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:101:2: ( ( ( rule__ProgramElement__Alternatives ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:102:1: ( ( rule__ProgramElement__Alternatives ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:102:1: ( ( rule__ProgramElement__Alternatives ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:103:1: ( rule__ProgramElement__Alternatives )
            {
             before(grammarAccess.getProgramElementAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:104:1: ( rule__ProgramElement__Alternatives )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:104:2: rule__ProgramElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ProgramElement__Alternatives_in_ruleProgramElement154);
            rule__ProgramElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProgramElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgramElement"


    // $ANTLR start "entryRuleExternalName"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:116:1: entryRuleExternalName : ruleExternalName EOF ;
    public final void entryRuleExternalName() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:117:1: ( ruleExternalName EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:118:1: ruleExternalName EOF
            {
             before(grammarAccess.getExternalNameRule()); 
            pushFollow(FOLLOW_ruleExternalName_in_entryRuleExternalName181);
            ruleExternalName();

            state._fsp--;

             after(grammarAccess.getExternalNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalName188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalName"


    // $ANTLR start "ruleExternalName"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:125:1: ruleExternalName : ( ( rule__ExternalName__Group__0 ) ) ;
    public final void ruleExternalName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:129:2: ( ( ( rule__ExternalName__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:130:1: ( ( rule__ExternalName__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:130:1: ( ( rule__ExternalName__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:131:1: ( rule__ExternalName__Group__0 )
            {
             before(grammarAccess.getExternalNameAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:132:1: ( rule__ExternalName__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:132:2: rule__ExternalName__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalName__Group__0_in_ruleExternalName214);
            rule__ExternalName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalName"


    // $ANTLR start "entryRuleLocalType"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:144:1: entryRuleLocalType : ruleLocalType EOF ;
    public final void entryRuleLocalType() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:145:1: ( ruleLocalType EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:146:1: ruleLocalType EOF
            {
             before(grammarAccess.getLocalTypeRule()); 
            pushFollow(FOLLOW_ruleLocalType_in_entryRuleLocalType241);
            ruleLocalType();

            state._fsp--;

             after(grammarAccess.getLocalTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalType248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalType"


    // $ANTLR start "ruleLocalType"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:153:1: ruleLocalType : ( ( rule__LocalType__Alternatives ) ) ;
    public final void ruleLocalType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:157:2: ( ( ( rule__LocalType__Alternatives ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:158:1: ( ( rule__LocalType__Alternatives ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:158:1: ( ( rule__LocalType__Alternatives ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:159:1: ( rule__LocalType__Alternatives )
            {
             before(grammarAccess.getLocalTypeAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:160:1: ( rule__LocalType__Alternatives )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:160:2: rule__LocalType__Alternatives
            {
            pushFollow(FOLLOW_rule__LocalType__Alternatives_in_ruleLocalType274);
            rule__LocalType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLocalTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalType"


    // $ANTLR start "entryRuleScopeDefiningElement"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:172:1: entryRuleScopeDefiningElement : ruleScopeDefiningElement EOF ;
    public final void entryRuleScopeDefiningElement() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:173:1: ( ruleScopeDefiningElement EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:174:1: ruleScopeDefiningElement EOF
            {
             before(grammarAccess.getScopeDefiningElementRule()); 
            pushFollow(FOLLOW_ruleScopeDefiningElement_in_entryRuleScopeDefiningElement301);
            ruleScopeDefiningElement();

            state._fsp--;

             after(grammarAccess.getScopeDefiningElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopeDefiningElement308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScopeDefiningElement"


    // $ANTLR start "ruleScopeDefiningElement"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:181:1: ruleScopeDefiningElement : ( ( rule__ScopeDefiningElement__Alternatives ) ) ;
    public final void ruleScopeDefiningElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:185:2: ( ( ( rule__ScopeDefiningElement__Alternatives ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:186:1: ( ( rule__ScopeDefiningElement__Alternatives ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:186:1: ( ( rule__ScopeDefiningElement__Alternatives ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:187:1: ( rule__ScopeDefiningElement__Alternatives )
            {
             before(grammarAccess.getScopeDefiningElementAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:188:1: ( rule__ScopeDefiningElement__Alternatives )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:188:2: rule__ScopeDefiningElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ScopeDefiningElement__Alternatives_in_ruleScopeDefiningElement334);
            rule__ScopeDefiningElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScopeDefiningElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScopeDefiningElement"


    // $ANTLR start "entryRuleTypeDef"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:200:1: entryRuleTypeDef : ruleTypeDef EOF ;
    public final void entryRuleTypeDef() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:201:1: ( ruleTypeDef EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:202:1: ruleTypeDef EOF
            {
             before(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef361);
            ruleTypeDef();

            state._fsp--;

             after(grammarAccess.getTypeDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:209:1: ruleTypeDef : ( ( rule__TypeDef__Group__0 ) ) ;
    public final void ruleTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:213:2: ( ( ( rule__TypeDef__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:214:1: ( ( rule__TypeDef__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:214:1: ( ( rule__TypeDef__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:215:1: ( rule__TypeDef__Group__0 )
            {
             before(grammarAccess.getTypeDefAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:216:1: ( rule__TypeDef__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:216:2: rule__TypeDef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__0_in_ruleTypeDef394);
            rule__TypeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleEnumDef"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:228:1: entryRuleEnumDef : ruleEnumDef EOF ;
    public final void entryRuleEnumDef() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:229:1: ( ruleEnumDef EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:230:1: ruleEnumDef EOF
            {
             before(grammarAccess.getEnumDefRule()); 
            pushFollow(FOLLOW_ruleEnumDef_in_entryRuleEnumDef421);
            ruleEnumDef();

            state._fsp--;

             after(grammarAccess.getEnumDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDef428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumDef"


    // $ANTLR start "ruleEnumDef"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:237:1: ruleEnumDef : ( ( rule__EnumDef__Group__0 ) ) ;
    public final void ruleEnumDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:241:2: ( ( ( rule__EnumDef__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:242:1: ( ( rule__EnumDef__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:242:1: ( ( rule__EnumDef__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:243:1: ( rule__EnumDef__Group__0 )
            {
             before(grammarAccess.getEnumDefAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:244:1: ( rule__EnumDef__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:244:2: rule__EnumDef__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDef__Group__0_in_ruleEnumDef454);
            rule__EnumDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumDef"


    // $ANTLR start "entryRuleEnsemble"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:256:1: entryRuleEnsemble : ruleEnsemble EOF ;
    public final void entryRuleEnsemble() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:257:1: ( ruleEnsemble EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:258:1: ruleEnsemble EOF
            {
             before(grammarAccess.getEnsembleRule()); 
            pushFollow(FOLLOW_ruleEnsemble_in_entryRuleEnsemble481);
            ruleEnsemble();

            state._fsp--;

             after(grammarAccess.getEnsembleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnsemble488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnsemble"


    // $ANTLR start "ruleEnsemble"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:265:1: ruleEnsemble : ( ( rule__Ensemble__Group__0 ) ) ;
    public final void ruleEnsemble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:269:2: ( ( ( rule__Ensemble__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:270:1: ( ( rule__Ensemble__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:270:1: ( ( rule__Ensemble__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:271:1: ( rule__Ensemble__Group__0 )
            {
             before(grammarAccess.getEnsembleAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:272:1: ( rule__Ensemble__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:272:2: rule__Ensemble__Group__0
            {
            pushFollow(FOLLOW_rule__Ensemble__Group__0_in_ruleEnsemble514);
            rule__Ensemble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnsembleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnsemble"


    // $ANTLR start "entryRuleRole"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:284:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:285:1: ( ruleRole EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:286:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole541);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:293:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:297:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:298:1: ( ( rule__Role__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:298:1: ( ( rule__Role__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:299:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:300:1: ( rule__Role__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:300:2: rule__Role__Group__0
            {
            pushFollow(FOLLOW_rule__Role__Group__0_in_ruleRole574);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleMember"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:312:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:313:1: ( ruleMember EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:314:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember601);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:321:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:325:2: ( ( ( rule__Member__Alternatives ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:326:1: ( ( rule__Member__Alternatives ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:326:1: ( ( rule__Member__Alternatives ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:327:1: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:328:1: ( rule__Member__Alternatives )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:328:2: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_rule__Member__Alternatives_in_ruleMember634);
            rule__Member__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleField"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:340:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:341:1: ( ruleField EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:342:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField661);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:349:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:353:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:354:1: ( ( rule__Field__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:354:1: ( ( rule__Field__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:355:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:356:1: ( rule__Field__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:356:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField694);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleRequire"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:368:1: entryRuleRequire : ruleRequire EOF ;
    public final void entryRuleRequire() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:369:1: ( ruleRequire EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:370:1: ruleRequire EOF
            {
             before(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_ruleRequire_in_entryRuleRequire721);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getRequireRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequire728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:377:1: ruleRequire : ( ( rule__Require__Group__0 ) ) ;
    public final void ruleRequire() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:381:2: ( ( ( rule__Require__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:382:1: ( ( rule__Require__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:382:1: ( ( rule__Require__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:383:1: ( rule__Require__Group__0 )
            {
             before(grammarAccess.getRequireAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:384:1: ( rule__Require__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:384:2: rule__Require__Group__0
            {
            pushFollow(FOLLOW_rule__Require__Group__0_in_ruleRequire754);
            rule__Require__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleBehavior"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:396:1: entryRuleBehavior : ruleBehavior EOF ;
    public final void entryRuleBehavior() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:397:1: ( ruleBehavior EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:398:1: ruleBehavior EOF
            {
             before(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_ruleBehavior_in_entryRuleBehavior781);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getBehaviorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehavior788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:405:1: ruleBehavior : ( ( rule__Behavior__Group__0 ) ) ;
    public final void ruleBehavior() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:409:2: ( ( ( rule__Behavior__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:410:1: ( ( rule__Behavior__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:410:1: ( ( rule__Behavior__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:411:1: ( rule__Behavior__Group__0 )
            {
             before(grammarAccess.getBehaviorAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:412:1: ( rule__Behavior__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:412:2: rule__Behavior__Group__0
            {
            pushFollow(FOLLOW_rule__Behavior__Group__0_in_ruleBehavior814);
            rule__Behavior__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleParameter"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:424:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:425:1: ( ruleParameter EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:426:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter841);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:433:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:437:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:438:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:438:1: ( ( rule__Parameter__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:439:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:440:1: ( rule__Parameter__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:440:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter874);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleMethod"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:452:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:453:1: ( ruleMethod EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:454:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod901);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:461:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:465:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:466:1: ( ( rule__Method__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:466:1: ( ( rule__Method__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:467:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:468:1: ( rule__Method__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:468:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod934);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleExpr"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:480:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:481:1: ( ruleExpr EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:482:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr961);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:489:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:493:2: ( ( ( rule__Expr__Alternatives ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:494:1: ( ( rule__Expr__Alternatives ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:494:1: ( ( rule__Expr__Alternatives ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:495:1: ( rule__Expr__Alternatives )
            {
             before(grammarAccess.getExprAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:496:1: ( rule__Expr__Alternatives )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:496:2: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Expr__Alternatives_in_ruleExpr994);
            rule__Expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleLocalVariable"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:508:1: entryRuleLocalVariable : ruleLocalVariable EOF ;
    public final void entryRuleLocalVariable() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:509:1: ( ruleLocalVariable EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:510:1: ruleLocalVariable EOF
            {
             before(grammarAccess.getLocalVariableRule()); 
            pushFollow(FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable1021);
            ruleLocalVariable();

            state._fsp--;

             after(grammarAccess.getLocalVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVariable1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalVariable"


    // $ANTLR start "ruleLocalVariable"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:517:1: ruleLocalVariable : ( ( rule__LocalVariable__NameAssignment ) ) ;
    public final void ruleLocalVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:521:2: ( ( ( rule__LocalVariable__NameAssignment ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:522:1: ( ( rule__LocalVariable__NameAssignment ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:522:1: ( ( rule__LocalVariable__NameAssignment ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:523:1: ( rule__LocalVariable__NameAssignment )
            {
             before(grammarAccess.getLocalVariableAccess().getNameAssignment()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:524:1: ( rule__LocalVariable__NameAssignment )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:524:2: rule__LocalVariable__NameAssignment
            {
            pushFollow(FOLLOW_rule__LocalVariable__NameAssignment_in_ruleLocalVariable1054);
            rule__LocalVariable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalVariable"


    // $ANTLR start "entryRuleQualifiedName"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:536:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:537:1: ( ruleQualifiedName EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:538:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1081);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:545:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:549:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:550:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:550:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:551:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:552:1: ( rule__QualifiedName__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:552:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1114);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleBinaryExpr"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:564:1: entryRuleBinaryExpr : ruleBinaryExpr EOF ;
    public final void entryRuleBinaryExpr() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:565:1: ( ruleBinaryExpr EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:566:1: ruleBinaryExpr EOF
            {
             before(grammarAccess.getBinaryExprRule()); 
            pushFollow(FOLLOW_ruleBinaryExpr_in_entryRuleBinaryExpr1141);
            ruleBinaryExpr();

            state._fsp--;

             after(grammarAccess.getBinaryExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryExpr1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryExpr"


    // $ANTLR start "ruleBinaryExpr"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:573:1: ruleBinaryExpr : ( ( rule__BinaryExpr__Group__0 ) ) ;
    public final void ruleBinaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:577:2: ( ( ( rule__BinaryExpr__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:578:1: ( ( rule__BinaryExpr__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:578:1: ( ( rule__BinaryExpr__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:579:1: ( rule__BinaryExpr__Group__0 )
            {
             before(grammarAccess.getBinaryExprAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:580:1: ( rule__BinaryExpr__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:580:2: rule__BinaryExpr__Group__0
            {
            pushFollow(FOLLOW_rule__BinaryExpr__Group__0_in_ruleBinaryExpr1174);
            rule__BinaryExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryExpr"


    // $ANTLR start "entryRuleBinaryOperator"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:592:1: entryRuleBinaryOperator : ruleBinaryOperator EOF ;
    public final void entryRuleBinaryOperator() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:593:1: ( ruleBinaryOperator EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:594:1: ruleBinaryOperator EOF
            {
             before(grammarAccess.getBinaryOperatorRule()); 
            pushFollow(FOLLOW_ruleBinaryOperator_in_entryRuleBinaryOperator1201);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOperator1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryOperator"


    // $ANTLR start "ruleBinaryOperator"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:601:1: ruleBinaryOperator : ( ( rule__BinaryOperator__Alternatives ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:605:2: ( ( ( rule__BinaryOperator__Alternatives ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:606:1: ( ( rule__BinaryOperator__Alternatives ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:606:1: ( ( rule__BinaryOperator__Alternatives ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:607:1: ( rule__BinaryOperator__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:608:1: ( rule__BinaryOperator__Alternatives )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:608:2: rule__BinaryOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator1234);
            rule__BinaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "entryRuleFunctionCall"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:620:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:621:1: ( ruleFunctionCall EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:622:1: ruleFunctionCall EOF
            {
             before(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1261);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:629:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:633:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:634:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:634:1: ( ( rule__FunctionCall__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:635:1: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:636:1: ( rule__FunctionCall__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:636:2: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1294);
            rule__FunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleStatement"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:648:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:649:1: ( ruleStatement EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:650:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1321);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:657:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:661:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:662:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:662:1: ( ( rule__Statement__Alternatives ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:663:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:664:1: ( rule__Statement__Alternatives )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:664:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement1354);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleForLoop"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:676:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:677:1: ( ruleForLoop EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:678:1: ruleForLoop EOF
            {
             before(grammarAccess.getForLoopRule()); 
            pushFollow(FOLLOW_ruleForLoop_in_entryRuleForLoop1381);
            ruleForLoop();

            state._fsp--;

             after(grammarAccess.getForLoopRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForLoop1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:685:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:689:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:690:1: ( ( rule__ForLoop__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:690:1: ( ( rule__ForLoop__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:691:1: ( rule__ForLoop__Group__0 )
            {
             before(grammarAccess.getForLoopAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:692:1: ( rule__ForLoop__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:692:2: rule__ForLoop__Group__0
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__0_in_ruleForLoop1414);
            rule__ForLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleConditional"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:704:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:705:1: ( ruleConditional EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:706:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional1441);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:713:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:717:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:718:1: ( ( rule__Conditional__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:718:1: ( ( rule__Conditional__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:719:1: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:720:1: ( rule__Conditional__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:720:2: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_rule__Conditional__Group__0_in_ruleConditional1474);
            rule__Conditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleOperation"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:732:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:733:1: ( ruleOperation EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:734:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1501);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:741:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:745:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:746:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:746:1: ( ( rule__Operation__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:747:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:748:1: ( rule__Operation__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:748:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation1534);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelfOperation"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:760:1: entryRuleSelfOperation : ruleSelfOperation EOF ;
    public final void entryRuleSelfOperation() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:761:1: ( ruleSelfOperation EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:762:1: ruleSelfOperation EOF
            {
             before(grammarAccess.getSelfOperationRule()); 
            pushFollow(FOLLOW_ruleSelfOperation_in_entryRuleSelfOperation1561);
            ruleSelfOperation();

            state._fsp--;

             after(grammarAccess.getSelfOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfOperation1568); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelfOperation"


    // $ANTLR start "ruleSelfOperation"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:769:1: ruleSelfOperation : ( ( rule__SelfOperation__Group__0 ) ) ;
    public final void ruleSelfOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:773:2: ( ( ( rule__SelfOperation__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:774:1: ( ( rule__SelfOperation__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:774:1: ( ( rule__SelfOperation__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:775:1: ( rule__SelfOperation__Group__0 )
            {
             before(grammarAccess.getSelfOperationAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:776:1: ( rule__SelfOperation__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:776:2: rule__SelfOperation__Group__0
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group__0_in_ruleSelfOperation1594);
            rule__SelfOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelfOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfOperation"


    // $ANTLR start "entryRuleAssignment"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:788:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:789:1: ( ruleAssignment EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:790:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1621);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1628); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:797:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:801:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:802:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:802:1: ( ( rule__Assignment__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:803:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:804:1: ( rule__Assignment__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:804:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment1654);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleValue"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:816:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:817:1: ( ruleValue EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:818:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1681);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1688); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:825:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:829:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:830:1: ( ( rule__Value__Alternatives ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:830:1: ( ( rule__Value__Alternatives ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:831:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:832:1: ( rule__Value__Alternatives )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:832:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1714);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleUpdate"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:844:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:845:1: ( ruleUpdate EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:846:1: ruleUpdate EOF
            {
             before(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_ruleUpdate_in_entryRuleUpdate1741);
            ruleUpdate();

            state._fsp--;

             after(grammarAccess.getUpdateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdate1748); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:853:1: ruleUpdate : ( ( rule__Update__Group__0 ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:857:2: ( ( ( rule__Update__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:858:1: ( ( rule__Update__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:858:1: ( ( rule__Update__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:859:1: ( rule__Update__Group__0 )
            {
             before(grammarAccess.getUpdateAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:860:1: ( rule__Update__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:860:2: rule__Update__Group__0
            {
            pushFollow(FOLLOW_rule__Update__Group__0_in_ruleUpdate1774);
            rule__Update__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleConstantDefinition"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:872:1: entryRuleConstantDefinition : ruleConstantDefinition EOF ;
    public final void entryRuleConstantDefinition() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:873:1: ( ruleConstantDefinition EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:874:1: ruleConstantDefinition EOF
            {
             before(grammarAccess.getConstantDefinitionRule()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1801);
            ruleConstantDefinition();

            state._fsp--;

             after(grammarAccess.getConstantDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition1808); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantDefinition"


    // $ANTLR start "ruleConstantDefinition"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:881:1: ruleConstantDefinition : ( ( rule__ConstantDefinition__Group__0 ) ) ;
    public final void ruleConstantDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:885:2: ( ( ( rule__ConstantDefinition__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:886:1: ( ( rule__ConstantDefinition__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:886:1: ( ( rule__ConstantDefinition__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:887:1: ( rule__ConstantDefinition__Group__0 )
            {
             before(grammarAccess.getConstantDefinitionAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:888:1: ( rule__ConstantDefinition__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:888:2: rule__ConstantDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1834);
            rule__ConstantDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantDefinition"


    // $ANTLR start "entryRuleConstantAssignment"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:900:1: entryRuleConstantAssignment : ruleConstantAssignment EOF ;
    public final void entryRuleConstantAssignment() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:901:1: ( ruleConstantAssignment EOF )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:902:1: ruleConstantAssignment EOF
            {
             before(grammarAccess.getConstantAssignmentRule()); 
            pushFollow(FOLLOW_ruleConstantAssignment_in_entryRuleConstantAssignment1861);
            ruleConstantAssignment();

            state._fsp--;

             after(grammarAccess.getConstantAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantAssignment1868); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantAssignment"


    // $ANTLR start "ruleConstantAssignment"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:909:1: ruleConstantAssignment : ( ( rule__ConstantAssignment__Group__0 ) ) ;
    public final void ruleConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:913:2: ( ( ( rule__ConstantAssignment__Group__0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:914:1: ( ( rule__ConstantAssignment__Group__0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:914:1: ( ( rule__ConstantAssignment__Group__0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:915:1: ( rule__ConstantAssignment__Group__0 )
            {
             before(grammarAccess.getConstantAssignmentAccess().getGroup()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:916:1: ( rule__ConstantAssignment__Group__0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:916:2: rule__ConstantAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantAssignment__Group__0_in_ruleConstantAssignment1894);
            rule__ConstantAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantAssignment"


    // $ANTLR start "rule__ProgramElement__Alternatives"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:928:1: rule__ProgramElement__Alternatives : ( ( ruleLocalType ) | ( ruleExternalName ) );
    public final void rule__ProgramElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:932:1: ( ( ruleLocalType ) | ( ruleExternalName ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=16 && LA1_0<=17)||LA1_0==21||(LA1_0>=39 && LA1_0<=40)) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:933:1: ( ruleLocalType )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:933:1: ( ruleLocalType )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:934:1: ruleLocalType
                    {
                     before(grammarAccess.getProgramElementAccess().getLocalTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLocalType_in_rule__ProgramElement__Alternatives1930);
                    ruleLocalType();

                    state._fsp--;

                     after(grammarAccess.getProgramElementAccess().getLocalTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:939:6: ( ruleExternalName )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:939:6: ( ruleExternalName )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:940:1: ruleExternalName
                    {
                     before(grammarAccess.getProgramElementAccess().getExternalNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExternalName_in_rule__ProgramElement__Alternatives1947);
                    ruleExternalName();

                    state._fsp--;

                     after(grammarAccess.getProgramElementAccess().getExternalNameParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgramElement__Alternatives"


    // $ANTLR start "rule__LocalType__Alternatives"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:950:1: rule__LocalType__Alternatives : ( ( ruleTypeDef ) | ( ruleScopeDefiningElement ) );
    public final void rule__LocalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:954:1: ( ( ruleTypeDef ) | ( ruleScopeDefiningElement ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17||LA2_0==21||(LA2_0>=39 && LA2_0<=40)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:955:1: ( ruleTypeDef )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:955:1: ( ruleTypeDef )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:956:1: ruleTypeDef
                    {
                     before(grammarAccess.getLocalTypeAccess().getTypeDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeDef_in_rule__LocalType__Alternatives1979);
                    ruleTypeDef();

                    state._fsp--;

                     after(grammarAccess.getLocalTypeAccess().getTypeDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:961:6: ( ruleScopeDefiningElement )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:961:6: ( ruleScopeDefiningElement )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:962:1: ruleScopeDefiningElement
                    {
                     before(grammarAccess.getLocalTypeAccess().getScopeDefiningElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleScopeDefiningElement_in_rule__LocalType__Alternatives1996);
                    ruleScopeDefiningElement();

                    state._fsp--;

                     after(grammarAccess.getLocalTypeAccess().getScopeDefiningElementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalType__Alternatives"


    // $ANTLR start "rule__ScopeDefiningElement__Alternatives"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:972:1: rule__ScopeDefiningElement__Alternatives : ( ( ruleEnumDef ) | ( ruleEnsemble ) | ( ruleRole ) );
    public final void rule__ScopeDefiningElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:976:1: ( ( ruleEnumDef ) | ( ruleEnsemble ) | ( ruleRole ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 39:
            case 40:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:977:1: ( ruleEnumDef )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:977:1: ( ruleEnumDef )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:978:1: ruleEnumDef
                    {
                     before(grammarAccess.getScopeDefiningElementAccess().getEnumDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumDef_in_rule__ScopeDefiningElement__Alternatives2028);
                    ruleEnumDef();

                    state._fsp--;

                     after(grammarAccess.getScopeDefiningElementAccess().getEnumDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:983:6: ( ruleEnsemble )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:983:6: ( ruleEnsemble )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:984:1: ruleEnsemble
                    {
                     before(grammarAccess.getScopeDefiningElementAccess().getEnsembleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnsemble_in_rule__ScopeDefiningElement__Alternatives2045);
                    ruleEnsemble();

                    state._fsp--;

                     after(grammarAccess.getScopeDefiningElementAccess().getEnsembleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:989:6: ( ruleRole )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:989:6: ( ruleRole )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:990:1: ruleRole
                    {
                     before(grammarAccess.getScopeDefiningElementAccess().getRoleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRole_in_rule__ScopeDefiningElement__Alternatives2062);
                    ruleRole();

                    state._fsp--;

                     after(grammarAccess.getScopeDefiningElementAccess().getRoleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDefiningElement__Alternatives"


    // $ANTLR start "rule__Member__Alternatives"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1000:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleRequire ) | ( ruleBehavior ) | ( ruleMethod ) | ( ruleUpdate ) | ( ruleConstantDefinition ) | ( ruleConstantAssignment ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1004:1: ( ( ruleField ) | ( ruleRequire ) | ( ruleBehavior ) | ( ruleMethod ) | ( ruleUpdate ) | ( ruleConstantDefinition ) | ( ruleConstantAssignment ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1005:1: ( ruleField )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1005:1: ( ruleField )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1006:1: ruleField
                    {
                     before(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleField_in_rule__Member__Alternatives2094);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1011:6: ( ruleRequire )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1011:6: ( ruleRequire )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1012:1: ruleRequire
                    {
                     before(grammarAccess.getMemberAccess().getRequireParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRequire_in_rule__Member__Alternatives2111);
                    ruleRequire();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getRequireParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1017:6: ( ruleBehavior )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1017:6: ( ruleBehavior )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1018:1: ruleBehavior
                    {
                     before(grammarAccess.getMemberAccess().getBehaviorParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBehavior_in_rule__Member__Alternatives2128);
                    ruleBehavior();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getBehaviorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1023:6: ( ruleMethod )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1023:6: ( ruleMethod )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1024:1: ruleMethod
                    {
                     before(grammarAccess.getMemberAccess().getMethodParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__Member__Alternatives2145);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getMethodParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1029:6: ( ruleUpdate )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1029:6: ( ruleUpdate )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1030:1: ruleUpdate
                    {
                     before(grammarAccess.getMemberAccess().getUpdateParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUpdate_in_rule__Member__Alternatives2162);
                    ruleUpdate();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getUpdateParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1035:6: ( ruleConstantDefinition )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1035:6: ( ruleConstantDefinition )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1036:1: ruleConstantDefinition
                    {
                     before(grammarAccess.getMemberAccess().getConstantDefinitionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleConstantDefinition_in_rule__Member__Alternatives2179);
                    ruleConstantDefinition();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getConstantDefinitionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1041:6: ( ruleConstantAssignment )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1041:6: ( ruleConstantAssignment )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1042:1: ruleConstantAssignment
                    {
                     before(grammarAccess.getMemberAccess().getConstantAssignmentParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleConstantAssignment_in_rule__Member__Alternatives2196);
                    ruleConstantAssignment();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getConstantAssignmentParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__Expr__Alternatives"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1052:1: rule__Expr__Alternatives : ( ( ruleBinaryExpr ) | ( ruleValue ) | ( ruleFunctionCall ) | ( ruleQualifiedName ) | ( ruleLocalVariable ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1056:1: ( ( ruleBinaryExpr ) | ( ruleValue ) | ( ruleFunctionCall ) | ( ruleQualifiedName ) | ( ruleLocalVariable ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
            case 36:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt5=4;
                    }
                    break;
                case 28:
                    {
                    alt5=3;
                    }
                    break;
                case EOF:
                case 11:
                case 12:
                case 14:
                case 20:
                case 29:
                    {
                    alt5=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1057:1: ( ruleBinaryExpr )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1057:1: ( ruleBinaryExpr )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1058:1: ruleBinaryExpr
                    {
                     before(grammarAccess.getExprAccess().getBinaryExprParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBinaryExpr_in_rule__Expr__Alternatives2228);
                    ruleBinaryExpr();

                    state._fsp--;

                     after(grammarAccess.getExprAccess().getBinaryExprParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1063:6: ( ruleValue )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1063:6: ( ruleValue )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1064:1: ruleValue
                    {
                     before(grammarAccess.getExprAccess().getValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleValue_in_rule__Expr__Alternatives2245);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getExprAccess().getValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1069:6: ( ruleFunctionCall )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1069:6: ( ruleFunctionCall )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1070:1: ruleFunctionCall
                    {
                     before(grammarAccess.getExprAccess().getFunctionCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFunctionCall_in_rule__Expr__Alternatives2262);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getExprAccess().getFunctionCallParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1075:6: ( ruleQualifiedName )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1075:6: ( ruleQualifiedName )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1076:1: ruleQualifiedName
                    {
                     before(grammarAccess.getExprAccess().getQualifiedNameParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleQualifiedName_in_rule__Expr__Alternatives2279);
                    ruleQualifiedName();

                    state._fsp--;

                     after(grammarAccess.getExprAccess().getQualifiedNameParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1081:6: ( ruleLocalVariable )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1081:6: ( ruleLocalVariable )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1082:1: ruleLocalVariable
                    {
                     before(grammarAccess.getExprAccess().getLocalVariableParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleLocalVariable_in_rule__Expr__Alternatives2296);
                    ruleLocalVariable();

                    state._fsp--;

                     after(grammarAccess.getExprAccess().getLocalVariableParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Alternatives"


    // $ANTLR start "rule__BinaryOperator__Alternatives"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1092:1: rule__BinaryOperator__Alternatives : ( ( '==' ) | ( '&&' ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1096:1: ( ( '==' ) | ( '&&' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1097:1: ( '==' )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1097:1: ( '==' )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1098:1: '=='
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__BinaryOperator__Alternatives2329); 
                     after(grammarAccess.getBinaryOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1105:6: ( '&&' )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1105:6: ( '&&' )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1106:1: '&&'
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getAmpersandAmpersandKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__BinaryOperator__Alternatives2349); 
                     after(grammarAccess.getBinaryOperatorAccess().getAmpersandAmpersandKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperator__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1118:1: rule__Statement__Alternatives : ( ( ruleConditional ) | ( ruleOperation ) | ( ruleSelfOperation ) | ( ruleAssignment ) | ( ruleForLoop ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1122:1: ( ( ruleConditional ) | ( ruleOperation ) | ( ruleSelfOperation ) | ( ruleAssignment ) | ( ruleForLoop ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==25) ) {
                    alt7=4;
                }
                else if ( (LA7_2==30) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1123:1: ( ruleConditional )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1123:1: ( ruleConditional )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1124:1: ruleConditional
                    {
                     before(grammarAccess.getStatementAccess().getConditionalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConditional_in_rule__Statement__Alternatives2383);
                    ruleConditional();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConditionalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1129:6: ( ruleOperation )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1129:6: ( ruleOperation )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1130:1: ruleOperation
                    {
                     before(grammarAccess.getStatementAccess().getOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOperation_in_rule__Statement__Alternatives2400);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1135:6: ( ruleSelfOperation )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1135:6: ( ruleSelfOperation )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1136:1: ruleSelfOperation
                    {
                     before(grammarAccess.getStatementAccess().getSelfOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSelfOperation_in_rule__Statement__Alternatives2417);
                    ruleSelfOperation();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSelfOperationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1141:6: ( ruleAssignment )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1141:6: ( ruleAssignment )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1142:1: ruleAssignment
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Statement__Alternatives2434);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1147:6: ( ruleForLoop )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1147:6: ( ruleForLoop )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1148:1: ruleForLoop
                    {
                     before(grammarAccess.getStatementAccess().getForLoopParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleForLoop_in_rule__Statement__Alternatives2451);
                    ruleForLoop();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getForLoopParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1158:1: rule__Value__Alternatives : ( ( ( rule__Value__ValueAssignment_0 ) ) | ( ( rule__Value__Group_1__0 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1162:1: ( ( ( rule__Value__ValueAssignment_0 ) ) | ( ( rule__Value__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==36) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1163:1: ( ( rule__Value__ValueAssignment_0 ) )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1163:1: ( ( rule__Value__ValueAssignment_0 ) )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1164:1: ( rule__Value__ValueAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getValueAssignment_0()); 
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1165:1: ( rule__Value__ValueAssignment_0 )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1165:2: rule__Value__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Value__ValueAssignment_0_in_rule__Value__Alternatives2483);
                    rule__Value__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1169:6: ( ( rule__Value__Group_1__0 ) )
                    {
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1169:6: ( ( rule__Value__Group_1__0 ) )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1170:1: ( rule__Value__Group_1__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_1()); 
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1171:1: ( rule__Value__Group_1__0 )
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1171:2: rule__Value__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Value__Group_1__0_in_rule__Value__Alternatives2501);
                    rule__Value__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1182:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1186:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1187:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02532);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02535);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1194:1: rule__Program__Group__0__Impl : ( 'package' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1198:1: ( ( 'package' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1199:1: ( 'package' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1199:1: ( 'package' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1200:1: 'package'
            {
             before(grammarAccess.getProgramAccess().getPackageKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Program__Group__0__Impl2563); 
             after(grammarAccess.getProgramAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1213:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1217:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1218:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12594);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12597);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1225:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1229:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1230:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1230:1: ( ( rule__Program__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1231:1: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1232:1: ( rule__Program__NameAssignment_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1232:2: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl2624);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1242:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1246:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1247:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22654);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__22657);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1254:1: rule__Program__Group__2__Impl : ( ';' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1258:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1259:1: ( ';' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1259:1: ( ';' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1260:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Program__Group__2__Impl2685); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1273:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1277:1: ( rule__Program__Group__3__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1278:2: rule__Program__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__32716);
            rule__Program__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1284:1: rule__Program__Group__3__Impl : ( ( rule__Program__ElementsAssignment_3 )* ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1288:1: ( ( ( rule__Program__ElementsAssignment_3 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1289:1: ( ( rule__Program__ElementsAssignment_3 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1289:1: ( ( rule__Program__ElementsAssignment_3 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1290:1: ( rule__Program__ElementsAssignment_3 )*
            {
             before(grammarAccess.getProgramAccess().getElementsAssignment_3()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1291:1: ( rule__Program__ElementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=15 && LA9_0<=17)||LA9_0==21||(LA9_0>=39 && LA9_0<=40)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1291:2: rule__Program__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Program__ElementsAssignment_3_in_rule__Program__Group__3__Impl2743);
            	    rule__Program__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__ExternalName__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1309:1: rule__ExternalName__Group__0 : rule__ExternalName__Group__0__Impl rule__ExternalName__Group__1 ;
    public final void rule__ExternalName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1313:1: ( rule__ExternalName__Group__0__Impl rule__ExternalName__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1314:2: rule__ExternalName__Group__0__Impl rule__ExternalName__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalName__Group__0__Impl_in_rule__ExternalName__Group__02782);
            rule__ExternalName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalName__Group__1_in_rule__ExternalName__Group__02785);
            rule__ExternalName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalName__Group__0"


    // $ANTLR start "rule__ExternalName__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1321:1: rule__ExternalName__Group__0__Impl : ( 'external' ) ;
    public final void rule__ExternalName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1325:1: ( ( 'external' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1326:1: ( 'external' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1326:1: ( 'external' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1327:1: 'external'
            {
             before(grammarAccess.getExternalNameAccess().getExternalKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__ExternalName__Group__0__Impl2813); 
             after(grammarAccess.getExternalNameAccess().getExternalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalName__Group__0__Impl"


    // $ANTLR start "rule__ExternalName__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1340:1: rule__ExternalName__Group__1 : rule__ExternalName__Group__1__Impl rule__ExternalName__Group__2 ;
    public final void rule__ExternalName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1344:1: ( rule__ExternalName__Group__1__Impl rule__ExternalName__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1345:2: rule__ExternalName__Group__1__Impl rule__ExternalName__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalName__Group__1__Impl_in_rule__ExternalName__Group__12844);
            rule__ExternalName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalName__Group__2_in_rule__ExternalName__Group__12847);
            rule__ExternalName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalName__Group__1"


    // $ANTLR start "rule__ExternalName__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1352:1: rule__ExternalName__Group__1__Impl : ( ( rule__ExternalName__NameAssignment_1 ) ) ;
    public final void rule__ExternalName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1356:1: ( ( ( rule__ExternalName__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1357:1: ( ( rule__ExternalName__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1357:1: ( ( rule__ExternalName__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1358:1: ( rule__ExternalName__NameAssignment_1 )
            {
             before(grammarAccess.getExternalNameAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1359:1: ( rule__ExternalName__NameAssignment_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1359:2: rule__ExternalName__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalName__NameAssignment_1_in_rule__ExternalName__Group__1__Impl2874);
            rule__ExternalName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalName__Group__1__Impl"


    // $ANTLR start "rule__ExternalName__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1369:1: rule__ExternalName__Group__2 : rule__ExternalName__Group__2__Impl ;
    public final void rule__ExternalName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1373:1: ( rule__ExternalName__Group__2__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1374:2: rule__ExternalName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalName__Group__2__Impl_in_rule__ExternalName__Group__22904);
            rule__ExternalName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalName__Group__2"


    // $ANTLR start "rule__ExternalName__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1380:1: rule__ExternalName__Group__2__Impl : ( ';' ) ;
    public final void rule__ExternalName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1384:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1385:1: ( ';' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1385:1: ( ';' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1386:1: ';'
            {
             before(grammarAccess.getExternalNameAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__ExternalName__Group__2__Impl2932); 
             after(grammarAccess.getExternalNameAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalName__Group__2__Impl"


    // $ANTLR start "rule__TypeDef__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1405:1: rule__TypeDef__Group__0 : rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 ;
    public final void rule__TypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1409:1: ( rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1410:2: rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__0__Impl_in_rule__TypeDef__Group__02969);
            rule__TypeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group__1_in_rule__TypeDef__Group__02972);
            rule__TypeDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0"


    // $ANTLR start "rule__TypeDef__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1417:1: rule__TypeDef__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1421:1: ( ( 'type' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1422:1: ( 'type' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1422:1: ( 'type' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1423:1: 'type'
            {
             before(grammarAccess.getTypeDefAccess().getTypeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__TypeDef__Group__0__Impl3000); 
             after(grammarAccess.getTypeDefAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0__Impl"


    // $ANTLR start "rule__TypeDef__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1436:1: rule__TypeDef__Group__1 : rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 ;
    public final void rule__TypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1440:1: ( rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1441:2: rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__1__Impl_in_rule__TypeDef__Group__13031);
            rule__TypeDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group__2_in_rule__TypeDef__Group__13034);
            rule__TypeDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1"


    // $ANTLR start "rule__TypeDef__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1448:1: rule__TypeDef__Group__1__Impl : ( ( rule__TypeDef__NameAssignment_1 ) ) ;
    public final void rule__TypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1452:1: ( ( ( rule__TypeDef__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1453:1: ( ( rule__TypeDef__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1453:1: ( ( rule__TypeDef__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1454:1: ( rule__TypeDef__NameAssignment_1 )
            {
             before(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1455:1: ( rule__TypeDef__NameAssignment_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1455:2: rule__TypeDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDef__NameAssignment_1_in_rule__TypeDef__Group__1__Impl3061);
            rule__TypeDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1__Impl"


    // $ANTLR start "rule__TypeDef__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1465:1: rule__TypeDef__Group__2 : rule__TypeDef__Group__2__Impl ;
    public final void rule__TypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1469:1: ( rule__TypeDef__Group__2__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1470:2: rule__TypeDef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__2__Impl_in_rule__TypeDef__Group__23091);
            rule__TypeDef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__2"


    // $ANTLR start "rule__TypeDef__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1476:1: rule__TypeDef__Group__2__Impl : ( ';' ) ;
    public final void rule__TypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1480:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1481:1: ( ';' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1481:1: ( ';' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1482:1: ';'
            {
             before(grammarAccess.getTypeDefAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__TypeDef__Group__2__Impl3119); 
             after(grammarAccess.getTypeDefAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__2__Impl"


    // $ANTLR start "rule__EnumDef__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1501:1: rule__EnumDef__Group__0 : rule__EnumDef__Group__0__Impl rule__EnumDef__Group__1 ;
    public final void rule__EnumDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1505:1: ( rule__EnumDef__Group__0__Impl rule__EnumDef__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1506:2: rule__EnumDef__Group__0__Impl rule__EnumDef__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDef__Group__0__Impl_in_rule__EnumDef__Group__03156);
            rule__EnumDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDef__Group__1_in_rule__EnumDef__Group__03159);
            rule__EnumDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__0"


    // $ANTLR start "rule__EnumDef__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1513:1: rule__EnumDef__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1517:1: ( ( 'enum' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1518:1: ( 'enum' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1518:1: ( 'enum' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1519:1: 'enum'
            {
             before(grammarAccess.getEnumDefAccess().getEnumKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__EnumDef__Group__0__Impl3187); 
             after(grammarAccess.getEnumDefAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__0__Impl"


    // $ANTLR start "rule__EnumDef__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1532:1: rule__EnumDef__Group__1 : rule__EnumDef__Group__1__Impl rule__EnumDef__Group__2 ;
    public final void rule__EnumDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1536:1: ( rule__EnumDef__Group__1__Impl rule__EnumDef__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1537:2: rule__EnumDef__Group__1__Impl rule__EnumDef__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDef__Group__1__Impl_in_rule__EnumDef__Group__13218);
            rule__EnumDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDef__Group__2_in_rule__EnumDef__Group__13221);
            rule__EnumDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__1"


    // $ANTLR start "rule__EnumDef__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1544:1: rule__EnumDef__Group__1__Impl : ( ( rule__EnumDef__NameAssignment_1 ) ) ;
    public final void rule__EnumDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1548:1: ( ( ( rule__EnumDef__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1549:1: ( ( rule__EnumDef__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1549:1: ( ( rule__EnumDef__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1550:1: ( rule__EnumDef__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDefAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1551:1: ( rule__EnumDef__NameAssignment_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1551:2: rule__EnumDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumDef__NameAssignment_1_in_rule__EnumDef__Group__1__Impl3248);
            rule__EnumDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__1__Impl"


    // $ANTLR start "rule__EnumDef__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1561:1: rule__EnumDef__Group__2 : rule__EnumDef__Group__2__Impl rule__EnumDef__Group__3 ;
    public final void rule__EnumDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1565:1: ( rule__EnumDef__Group__2__Impl rule__EnumDef__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1566:2: rule__EnumDef__Group__2__Impl rule__EnumDef__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDef__Group__2__Impl_in_rule__EnumDef__Group__23278);
            rule__EnumDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDef__Group__3_in_rule__EnumDef__Group__23281);
            rule__EnumDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__2"


    // $ANTLR start "rule__EnumDef__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1573:1: rule__EnumDef__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1577:1: ( ( '{' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1578:1: ( '{' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1578:1: ( '{' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1579:1: '{'
            {
             before(grammarAccess.getEnumDefAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__EnumDef__Group__2__Impl3309); 
             after(grammarAccess.getEnumDefAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__2__Impl"


    // $ANTLR start "rule__EnumDef__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1592:1: rule__EnumDef__Group__3 : rule__EnumDef__Group__3__Impl rule__EnumDef__Group__4 ;
    public final void rule__EnumDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1596:1: ( rule__EnumDef__Group__3__Impl rule__EnumDef__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1597:2: rule__EnumDef__Group__3__Impl rule__EnumDef__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDef__Group__3__Impl_in_rule__EnumDef__Group__33340);
            rule__EnumDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDef__Group__4_in_rule__EnumDef__Group__33343);
            rule__EnumDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__3"


    // $ANTLR start "rule__EnumDef__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1604:1: rule__EnumDef__Group__3__Impl : ( ( rule__EnumDef__NamesAssignment_3 ) ) ;
    public final void rule__EnumDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1608:1: ( ( ( rule__EnumDef__NamesAssignment_3 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1609:1: ( ( rule__EnumDef__NamesAssignment_3 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1609:1: ( ( rule__EnumDef__NamesAssignment_3 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1610:1: ( rule__EnumDef__NamesAssignment_3 )
            {
             before(grammarAccess.getEnumDefAccess().getNamesAssignment_3()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1611:1: ( rule__EnumDef__NamesAssignment_3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1611:2: rule__EnumDef__NamesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDef__NamesAssignment_3_in_rule__EnumDef__Group__3__Impl3370);
            rule__EnumDef__NamesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumDefAccess().getNamesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__3__Impl"


    // $ANTLR start "rule__EnumDef__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1621:1: rule__EnumDef__Group__4 : rule__EnumDef__Group__4__Impl rule__EnumDef__Group__5 ;
    public final void rule__EnumDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1625:1: ( rule__EnumDef__Group__4__Impl rule__EnumDef__Group__5 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1626:2: rule__EnumDef__Group__4__Impl rule__EnumDef__Group__5
            {
            pushFollow(FOLLOW_rule__EnumDef__Group__4__Impl_in_rule__EnumDef__Group__43400);
            rule__EnumDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDef__Group__5_in_rule__EnumDef__Group__43403);
            rule__EnumDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__4"


    // $ANTLR start "rule__EnumDef__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1633:1: rule__EnumDef__Group__4__Impl : ( ( rule__EnumDef__Group_4__0 )* ) ;
    public final void rule__EnumDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1637:1: ( ( ( rule__EnumDef__Group_4__0 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1638:1: ( ( rule__EnumDef__Group_4__0 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1638:1: ( ( rule__EnumDef__Group_4__0 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1639:1: ( rule__EnumDef__Group_4__0 )*
            {
             before(grammarAccess.getEnumDefAccess().getGroup_4()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1640:1: ( rule__EnumDef__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1640:2: rule__EnumDef__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumDef__Group_4__0_in_rule__EnumDef__Group__4__Impl3430);
            	    rule__EnumDef__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEnumDefAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__4__Impl"


    // $ANTLR start "rule__EnumDef__Group__5"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1650:1: rule__EnumDef__Group__5 : rule__EnumDef__Group__5__Impl ;
    public final void rule__EnumDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1654:1: ( rule__EnumDef__Group__5__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1655:2: rule__EnumDef__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumDef__Group__5__Impl_in_rule__EnumDef__Group__53461);
            rule__EnumDef__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__5"


    // $ANTLR start "rule__EnumDef__Group__5__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1661:1: rule__EnumDef__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1665:1: ( ( '}' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1666:1: ( '}' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1666:1: ( '}' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1667:1: '}'
            {
             before(grammarAccess.getEnumDefAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__EnumDef__Group__5__Impl3489); 
             after(grammarAccess.getEnumDefAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group__5__Impl"


    // $ANTLR start "rule__EnumDef__Group_4__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1692:1: rule__EnumDef__Group_4__0 : rule__EnumDef__Group_4__0__Impl rule__EnumDef__Group_4__1 ;
    public final void rule__EnumDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1696:1: ( rule__EnumDef__Group_4__0__Impl rule__EnumDef__Group_4__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1697:2: rule__EnumDef__Group_4__0__Impl rule__EnumDef__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumDef__Group_4__0__Impl_in_rule__EnumDef__Group_4__03532);
            rule__EnumDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDef__Group_4__1_in_rule__EnumDef__Group_4__03535);
            rule__EnumDef__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group_4__0"


    // $ANTLR start "rule__EnumDef__Group_4__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1704:1: rule__EnumDef__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1708:1: ( ( ',' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1709:1: ( ',' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1709:1: ( ',' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1710:1: ','
            {
             before(grammarAccess.getEnumDefAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__EnumDef__Group_4__0__Impl3563); 
             after(grammarAccess.getEnumDefAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group_4__0__Impl"


    // $ANTLR start "rule__EnumDef__Group_4__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1723:1: rule__EnumDef__Group_4__1 : rule__EnumDef__Group_4__1__Impl ;
    public final void rule__EnumDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1727:1: ( rule__EnumDef__Group_4__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1728:2: rule__EnumDef__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumDef__Group_4__1__Impl_in_rule__EnumDef__Group_4__13594);
            rule__EnumDef__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group_4__1"


    // $ANTLR start "rule__EnumDef__Group_4__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1734:1: rule__EnumDef__Group_4__1__Impl : ( ( rule__EnumDef__NamesAssignment_4_1 ) ) ;
    public final void rule__EnumDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1738:1: ( ( ( rule__EnumDef__NamesAssignment_4_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1739:1: ( ( rule__EnumDef__NamesAssignment_4_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1739:1: ( ( rule__EnumDef__NamesAssignment_4_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1740:1: ( rule__EnumDef__NamesAssignment_4_1 )
            {
             before(grammarAccess.getEnumDefAccess().getNamesAssignment_4_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1741:1: ( rule__EnumDef__NamesAssignment_4_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1741:2: rule__EnumDef__NamesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumDef__NamesAssignment_4_1_in_rule__EnumDef__Group_4__1__Impl3621);
            rule__EnumDef__NamesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumDefAccess().getNamesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__Group_4__1__Impl"


    // $ANTLR start "rule__Ensemble__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1755:1: rule__Ensemble__Group__0 : rule__Ensemble__Group__0__Impl rule__Ensemble__Group__1 ;
    public final void rule__Ensemble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1759:1: ( rule__Ensemble__Group__0__Impl rule__Ensemble__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1760:2: rule__Ensemble__Group__0__Impl rule__Ensemble__Group__1
            {
            pushFollow(FOLLOW_rule__Ensemble__Group__0__Impl_in_rule__Ensemble__Group__03655);
            rule__Ensemble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ensemble__Group__1_in_rule__Ensemble__Group__03658);
            rule__Ensemble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__0"


    // $ANTLR start "rule__Ensemble__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1767:1: rule__Ensemble__Group__0__Impl : ( 'ensemble' ) ;
    public final void rule__Ensemble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1771:1: ( ( 'ensemble' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1772:1: ( 'ensemble' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1772:1: ( 'ensemble' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1773:1: 'ensemble'
            {
             before(grammarAccess.getEnsembleAccess().getEnsembleKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Ensemble__Group__0__Impl3686); 
             after(grammarAccess.getEnsembleAccess().getEnsembleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__0__Impl"


    // $ANTLR start "rule__Ensemble__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1786:1: rule__Ensemble__Group__1 : rule__Ensemble__Group__1__Impl rule__Ensemble__Group__2 ;
    public final void rule__Ensemble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1790:1: ( rule__Ensemble__Group__1__Impl rule__Ensemble__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1791:2: rule__Ensemble__Group__1__Impl rule__Ensemble__Group__2
            {
            pushFollow(FOLLOW_rule__Ensemble__Group__1__Impl_in_rule__Ensemble__Group__13717);
            rule__Ensemble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ensemble__Group__2_in_rule__Ensemble__Group__13720);
            rule__Ensemble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__1"


    // $ANTLR start "rule__Ensemble__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1798:1: rule__Ensemble__Group__1__Impl : ( ( rule__Ensemble__NameAssignment_1 ) ) ;
    public final void rule__Ensemble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1802:1: ( ( ( rule__Ensemble__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1803:1: ( ( rule__Ensemble__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1803:1: ( ( rule__Ensemble__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1804:1: ( rule__Ensemble__NameAssignment_1 )
            {
             before(grammarAccess.getEnsembleAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1805:1: ( rule__Ensemble__NameAssignment_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1805:2: rule__Ensemble__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Ensemble__NameAssignment_1_in_rule__Ensemble__Group__1__Impl3747);
            rule__Ensemble__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnsembleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__1__Impl"


    // $ANTLR start "rule__Ensemble__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1815:1: rule__Ensemble__Group__2 : rule__Ensemble__Group__2__Impl rule__Ensemble__Group__3 ;
    public final void rule__Ensemble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1819:1: ( rule__Ensemble__Group__2__Impl rule__Ensemble__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1820:2: rule__Ensemble__Group__2__Impl rule__Ensemble__Group__3
            {
            pushFollow(FOLLOW_rule__Ensemble__Group__2__Impl_in_rule__Ensemble__Group__23777);
            rule__Ensemble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ensemble__Group__3_in_rule__Ensemble__Group__23780);
            rule__Ensemble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__2"


    // $ANTLR start "rule__Ensemble__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1827:1: rule__Ensemble__Group__2__Impl : ( '{' ) ;
    public final void rule__Ensemble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1831:1: ( ( '{' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1832:1: ( '{' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1832:1: ( '{' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1833:1: '{'
            {
             before(grammarAccess.getEnsembleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Ensemble__Group__2__Impl3808); 
             after(grammarAccess.getEnsembleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__2__Impl"


    // $ANTLR start "rule__Ensemble__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1846:1: rule__Ensemble__Group__3 : rule__Ensemble__Group__3__Impl rule__Ensemble__Group__4 ;
    public final void rule__Ensemble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1850:1: ( rule__Ensemble__Group__3__Impl rule__Ensemble__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1851:2: rule__Ensemble__Group__3__Impl rule__Ensemble__Group__4
            {
            pushFollow(FOLLOW_rule__Ensemble__Group__3__Impl_in_rule__Ensemble__Group__33839);
            rule__Ensemble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ensemble__Group__4_in_rule__Ensemble__Group__33842);
            rule__Ensemble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__3"


    // $ANTLR start "rule__Ensemble__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1858:1: rule__Ensemble__Group__3__Impl : ( ( rule__Ensemble__ElementsAssignment_3 )* ) ;
    public final void rule__Ensemble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1862:1: ( ( ( rule__Ensemble__ElementsAssignment_3 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1863:1: ( ( rule__Ensemble__ElementsAssignment_3 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1863:1: ( ( rule__Ensemble__ElementsAssignment_3 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1864:1: ( rule__Ensemble__ElementsAssignment_3 )*
            {
             before(grammarAccess.getEnsembleAccess().getElementsAssignment_3()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1865:1: ( rule__Ensemble__ElementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=26 && LA11_0<=27)||(LA11_0>=37 && LA11_0<=39)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1865:2: rule__Ensemble__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Ensemble__ElementsAssignment_3_in_rule__Ensemble__Group__3__Impl3869);
            	    rule__Ensemble__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEnsembleAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__3__Impl"


    // $ANTLR start "rule__Ensemble__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1875:1: rule__Ensemble__Group__4 : rule__Ensemble__Group__4__Impl ;
    public final void rule__Ensemble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1879:1: ( rule__Ensemble__Group__4__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1880:2: rule__Ensemble__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Ensemble__Group__4__Impl_in_rule__Ensemble__Group__43900);
            rule__Ensemble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__4"


    // $ANTLR start "rule__Ensemble__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1886:1: rule__Ensemble__Group__4__Impl : ( '}' ) ;
    public final void rule__Ensemble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1890:1: ( ( '}' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1891:1: ( '}' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1891:1: ( '}' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1892:1: '}'
            {
             before(grammarAccess.getEnsembleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Ensemble__Group__4__Impl3928); 
             after(grammarAccess.getEnsembleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1915:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1919:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1920:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03969);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03972);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1927:1: rule__Role__Group__0__Impl : ( ( rule__Role__AbstractAssignment_0 )? ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1931:1: ( ( ( rule__Role__AbstractAssignment_0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1932:1: ( ( rule__Role__AbstractAssignment_0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1932:1: ( ( rule__Role__AbstractAssignment_0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1933:1: ( rule__Role__AbstractAssignment_0 )?
            {
             before(grammarAccess.getRoleAccess().getAbstractAssignment_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1934:1: ( rule__Role__AbstractAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1934:2: rule__Role__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Role__AbstractAssignment_0_in_rule__Role__Group__0__Impl3999);
                    rule__Role__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getAbstractAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1944:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1948:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1949:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__14030);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__14033);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1956:1: rule__Role__Group__1__Impl : ( ( rule__Role__MixinAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1960:1: ( ( ( rule__Role__MixinAssignment_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1961:1: ( ( rule__Role__MixinAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1961:1: ( ( rule__Role__MixinAssignment_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1962:1: ( rule__Role__MixinAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getMixinAssignment_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1963:1: ( rule__Role__MixinAssignment_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1963:2: rule__Role__MixinAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__MixinAssignment_1_in_rule__Role__Group__1__Impl4060);
            rule__Role__MixinAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getMixinAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1973:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1977:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1978:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__24090);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__24093);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1985:1: rule__Role__Group__2__Impl : ( 'role' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1989:1: ( ( 'role' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1990:1: ( 'role' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1990:1: ( 'role' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:1991:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Role__Group__2__Impl4121); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2004:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2008:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2009:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__34152);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__4_in_rule__Role__Group__34155);
            rule__Role__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2016:1: rule__Role__Group__3__Impl : ( ( rule__Role__NameAssignment_3 ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2020:1: ( ( ( rule__Role__NameAssignment_3 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2021:1: ( ( rule__Role__NameAssignment_3 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2021:1: ( ( rule__Role__NameAssignment_3 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2022:1: ( rule__Role__NameAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_3()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2023:1: ( rule__Role__NameAssignment_3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2023:2: rule__Role__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_3_in_rule__Role__Group__3__Impl4182);
            rule__Role__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2033:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2037:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2038:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__44212);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__5_in_rule__Role__Group__44215);
            rule__Role__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2045:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )? ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2049:1: ( ( ( rule__Role__Group_4__0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2050:1: ( ( rule__Role__Group_4__0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2050:1: ( ( rule__Role__Group_4__0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2051:1: ( rule__Role__Group_4__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2052:1: ( rule__Role__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2052:2: rule__Role__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl4242);
                    rule__Role__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__5"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2062:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2066:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2067:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__54273);
            rule__Role__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__6_in_rule__Role__Group__54276);
            rule__Role__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2074:1: rule__Role__Group__5__Impl : ( ( rule__Role__Group_5__0 )? ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2078:1: ( ( ( rule__Role__Group_5__0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2079:1: ( ( rule__Role__Group_5__0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2079:1: ( ( rule__Role__Group_5__0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2080:1: ( rule__Role__Group_5__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_5()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2081:1: ( rule__Role__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2081:2: rule__Role__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Role__Group_5__0_in_rule__Role__Group__5__Impl4303);
                    rule__Role__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__Role__Group__6"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2091:1: rule__Role__Group__6 : rule__Role__Group__6__Impl rule__Role__Group__7 ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2095:1: ( rule__Role__Group__6__Impl rule__Role__Group__7 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2096:2: rule__Role__Group__6__Impl rule__Role__Group__7
            {
            pushFollow(FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__64334);
            rule__Role__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__7_in_rule__Role__Group__64337);
            rule__Role__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__6"


    // $ANTLR start "rule__Role__Group__6__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2103:1: rule__Role__Group__6__Impl : ( '{' ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2107:1: ( ( '{' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2108:1: ( '{' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2108:1: ( '{' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2109:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Role__Group__6__Impl4365); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__6__Impl"


    // $ANTLR start "rule__Role__Group__7"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2122:1: rule__Role__Group__7 : rule__Role__Group__7__Impl rule__Role__Group__8 ;
    public final void rule__Role__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2126:1: ( rule__Role__Group__7__Impl rule__Role__Group__8 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2127:2: rule__Role__Group__7__Impl rule__Role__Group__8
            {
            pushFollow(FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__74396);
            rule__Role__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__8_in_rule__Role__Group__74399);
            rule__Role__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__7"


    // $ANTLR start "rule__Role__Group__7__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2134:1: rule__Role__Group__7__Impl : ( ( rule__Role__ElementsAssignment_7 )* ) ;
    public final void rule__Role__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2138:1: ( ( ( rule__Role__ElementsAssignment_7 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2139:1: ( ( rule__Role__ElementsAssignment_7 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2139:1: ( ( rule__Role__ElementsAssignment_7 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2140:1: ( rule__Role__ElementsAssignment_7 )*
            {
             before(grammarAccess.getRoleAccess().getElementsAssignment_7()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2141:1: ( rule__Role__ElementsAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=26 && LA15_0<=27)||(LA15_0>=37 && LA15_0<=39)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2141:2: rule__Role__ElementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Role__ElementsAssignment_7_in_rule__Role__Group__7__Impl4426);
            	    rule__Role__ElementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getElementsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__7__Impl"


    // $ANTLR start "rule__Role__Group__8"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2151:1: rule__Role__Group__8 : rule__Role__Group__8__Impl ;
    public final void rule__Role__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2155:1: ( rule__Role__Group__8__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2156:2: rule__Role__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__8__Impl_in_rule__Role__Group__84457);
            rule__Role__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__8"


    // $ANTLR start "rule__Role__Group__8__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2162:1: rule__Role__Group__8__Impl : ( '}' ) ;
    public final void rule__Role__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2166:1: ( ( '}' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2167:1: ( '}' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2167:1: ( '}' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2168:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__Role__Group__8__Impl4485); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__8__Impl"


    // $ANTLR start "rule__Role__Group_4__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2199:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2203:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2204:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__04534);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__04537);
            rule__Role__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__0"


    // $ANTLR start "rule__Role__Group_4__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2211:1: rule__Role__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2215:1: ( ( 'extends' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2216:1: ( 'extends' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2216:1: ( 'extends' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2217:1: 'extends'
            {
             before(grammarAccess.getRoleAccess().getExtendsKeyword_4_0()); 
            match(input,23,FOLLOW_23_in_rule__Role__Group_4__0__Impl4565); 
             after(grammarAccess.getRoleAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__0__Impl"


    // $ANTLR start "rule__Role__Group_4__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2230:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2234:1: ( rule__Role__Group_4__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2235:2: rule__Role__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__14596);
            rule__Role__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__1"


    // $ANTLR start "rule__Role__Group_4__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2241:1: rule__Role__Group_4__1__Impl : ( ( rule__Role__ExtendsRoleAssignment_4_1 ) ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2245:1: ( ( ( rule__Role__ExtendsRoleAssignment_4_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2246:1: ( ( rule__Role__ExtendsRoleAssignment_4_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2246:1: ( ( rule__Role__ExtendsRoleAssignment_4_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2247:1: ( rule__Role__ExtendsRoleAssignment_4_1 )
            {
             before(grammarAccess.getRoleAccess().getExtendsRoleAssignment_4_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2248:1: ( rule__Role__ExtendsRoleAssignment_4_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2248:2: rule__Role__ExtendsRoleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Role__ExtendsRoleAssignment_4_1_in_rule__Role__Group_4__1__Impl4623);
            rule__Role__ExtendsRoleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getExtendsRoleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__1__Impl"


    // $ANTLR start "rule__Role__Group_5__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2262:1: rule__Role__Group_5__0 : rule__Role__Group_5__0__Impl rule__Role__Group_5__1 ;
    public final void rule__Role__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2266:1: ( rule__Role__Group_5__0__Impl rule__Role__Group_5__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2267:2: rule__Role__Group_5__0__Impl rule__Role__Group_5__1
            {
            pushFollow(FOLLOW_rule__Role__Group_5__0__Impl_in_rule__Role__Group_5__04657);
            rule__Role__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_5__1_in_rule__Role__Group_5__04660);
            rule__Role__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__0"


    // $ANTLR start "rule__Role__Group_5__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2274:1: rule__Role__Group_5__0__Impl : ( 'within' ) ;
    public final void rule__Role__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2278:1: ( ( 'within' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2279:1: ( 'within' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2279:1: ( 'within' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2280:1: 'within'
            {
             before(grammarAccess.getRoleAccess().getWithinKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Role__Group_5__0__Impl4688); 
             after(grammarAccess.getRoleAccess().getWithinKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__0__Impl"


    // $ANTLR start "rule__Role__Group_5__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2293:1: rule__Role__Group_5__1 : rule__Role__Group_5__1__Impl ;
    public final void rule__Role__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2297:1: ( rule__Role__Group_5__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2298:2: rule__Role__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_5__1__Impl_in_rule__Role__Group_5__14719);
            rule__Role__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__1"


    // $ANTLR start "rule__Role__Group_5__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2304:1: rule__Role__Group_5__1__Impl : ( ( rule__Role__WithinEnsembleAssignment_5_1 ) ) ;
    public final void rule__Role__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2308:1: ( ( ( rule__Role__WithinEnsembleAssignment_5_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2309:1: ( ( rule__Role__WithinEnsembleAssignment_5_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2309:1: ( ( rule__Role__WithinEnsembleAssignment_5_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2310:1: ( rule__Role__WithinEnsembleAssignment_5_1 )
            {
             before(grammarAccess.getRoleAccess().getWithinEnsembleAssignment_5_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2311:1: ( rule__Role__WithinEnsembleAssignment_5_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2311:2: rule__Role__WithinEnsembleAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Role__WithinEnsembleAssignment_5_1_in_rule__Role__Group_5__1__Impl4746);
            rule__Role__WithinEnsembleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getWithinEnsembleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_5__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2325:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2329:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2330:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__04780);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__04783);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2337:1: rule__Field__Group__0__Impl : ( ( rule__Field__TypeAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2341:1: ( ( ( rule__Field__TypeAssignment_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2342:1: ( ( rule__Field__TypeAssignment_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2342:1: ( ( rule__Field__TypeAssignment_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2343:1: ( rule__Field__TypeAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2344:1: ( rule__Field__TypeAssignment_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2344:2: rule__Field__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_0_in_rule__Field__Group__0__Impl4810);
            rule__Field__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2354:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2358:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2359:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__14840);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__14843);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2366:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2370:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2371:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2371:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2372:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2373:1: ( rule__Field__NameAssignment_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2373:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl4870);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2383:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2387:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2388:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__24900);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__24903);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2395:1: rule__Field__Group__2__Impl : ( ( rule__Field__Group_2__0 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2399:1: ( ( ( rule__Field__Group_2__0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2400:1: ( ( rule__Field__Group_2__0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2400:1: ( ( rule__Field__Group_2__0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2401:1: ( rule__Field__Group_2__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2402:1: ( rule__Field__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2402:2: rule__Field__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_2__0_in_rule__Field__Group__2__Impl4930);
                    rule__Field__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2412:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2416:1: ( rule__Field__Group__3__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2417:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__34961);
            rule__Field__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2423:1: rule__Field__Group__3__Impl : ( ';' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2427:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2428:1: ( ';' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2428:1: ( ';' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2429:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Field__Group__3__Impl4989); 
             after(grammarAccess.getFieldAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group_2__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2450:1: rule__Field__Group_2__0 : rule__Field__Group_2__0__Impl rule__Field__Group_2__1 ;
    public final void rule__Field__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2454:1: ( rule__Field__Group_2__0__Impl rule__Field__Group_2__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2455:2: rule__Field__Group_2__0__Impl rule__Field__Group_2__1
            {
            pushFollow(FOLLOW_rule__Field__Group_2__0__Impl_in_rule__Field__Group_2__05028);
            rule__Field__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_2__1_in_rule__Field__Group_2__05031);
            rule__Field__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_2__0"


    // $ANTLR start "rule__Field__Group_2__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2462:1: rule__Field__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Field__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2466:1: ( ( '=' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2467:1: ( '=' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2467:1: ( '=' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2468:1: '='
            {
             before(grammarAccess.getFieldAccess().getEqualsSignKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Field__Group_2__0__Impl5059); 
             after(grammarAccess.getFieldAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_2__0__Impl"


    // $ANTLR start "rule__Field__Group_2__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2481:1: rule__Field__Group_2__1 : rule__Field__Group_2__1__Impl ;
    public final void rule__Field__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2485:1: ( rule__Field__Group_2__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2486:2: rule__Field__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_2__1__Impl_in_rule__Field__Group_2__15090);
            rule__Field__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_2__1"


    // $ANTLR start "rule__Field__Group_2__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2492:1: rule__Field__Group_2__1__Impl : ( ( rule__Field__InitialAssignment_2_1 ) ) ;
    public final void rule__Field__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2496:1: ( ( ( rule__Field__InitialAssignment_2_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2497:1: ( ( rule__Field__InitialAssignment_2_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2497:1: ( ( rule__Field__InitialAssignment_2_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2498:1: ( rule__Field__InitialAssignment_2_1 )
            {
             before(grammarAccess.getFieldAccess().getInitialAssignment_2_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2499:1: ( rule__Field__InitialAssignment_2_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2499:2: rule__Field__InitialAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Field__InitialAssignment_2_1_in_rule__Field__Group_2__1__Impl5117);
            rule__Field__InitialAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getInitialAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_2__1__Impl"


    // $ANTLR start "rule__Require__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2513:1: rule__Require__Group__0 : rule__Require__Group__0__Impl rule__Require__Group__1 ;
    public final void rule__Require__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2517:1: ( rule__Require__Group__0__Impl rule__Require__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2518:2: rule__Require__Group__0__Impl rule__Require__Group__1
            {
            pushFollow(FOLLOW_rule__Require__Group__0__Impl_in_rule__Require__Group__05151);
            rule__Require__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Require__Group__1_in_rule__Require__Group__05154);
            rule__Require__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__0"


    // $ANTLR start "rule__Require__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2525:1: rule__Require__Group__0__Impl : ( 'require' ) ;
    public final void rule__Require__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2529:1: ( ( 'require' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2530:1: ( 'require' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2530:1: ( 'require' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2531:1: 'require'
            {
             before(grammarAccess.getRequireAccess().getRequireKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Require__Group__0__Impl5182); 
             after(grammarAccess.getRequireAccess().getRequireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__0__Impl"


    // $ANTLR start "rule__Require__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2544:1: rule__Require__Group__1 : rule__Require__Group__1__Impl rule__Require__Group__2 ;
    public final void rule__Require__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2548:1: ( rule__Require__Group__1__Impl rule__Require__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2549:2: rule__Require__Group__1__Impl rule__Require__Group__2
            {
            pushFollow(FOLLOW_rule__Require__Group__1__Impl_in_rule__Require__Group__15213);
            rule__Require__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Require__Group__2_in_rule__Require__Group__15216);
            rule__Require__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__1"


    // $ANTLR start "rule__Require__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2556:1: rule__Require__Group__1__Impl : ( ( rule__Require__ExpAssignment_1 ) ) ;
    public final void rule__Require__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2560:1: ( ( ( rule__Require__ExpAssignment_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2561:1: ( ( rule__Require__ExpAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2561:1: ( ( rule__Require__ExpAssignment_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2562:1: ( rule__Require__ExpAssignment_1 )
            {
             before(grammarAccess.getRequireAccess().getExpAssignment_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2563:1: ( rule__Require__ExpAssignment_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2563:2: rule__Require__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__Require__ExpAssignment_1_in_rule__Require__Group__1__Impl5243);
            rule__Require__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__1__Impl"


    // $ANTLR start "rule__Require__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2573:1: rule__Require__Group__2 : rule__Require__Group__2__Impl ;
    public final void rule__Require__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2577:1: ( rule__Require__Group__2__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2578:2: rule__Require__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Require__Group__2__Impl_in_rule__Require__Group__25273);
            rule__Require__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__2"


    // $ANTLR start "rule__Require__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2584:1: rule__Require__Group__2__Impl : ( ';' ) ;
    public final void rule__Require__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2588:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2589:1: ( ';' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2589:1: ( ';' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2590:1: ';'
            {
             before(grammarAccess.getRequireAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Require__Group__2__Impl5301); 
             after(grammarAccess.getRequireAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__2__Impl"


    // $ANTLR start "rule__Behavior__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2609:1: rule__Behavior__Group__0 : rule__Behavior__Group__0__Impl rule__Behavior__Group__1 ;
    public final void rule__Behavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2613:1: ( rule__Behavior__Group__0__Impl rule__Behavior__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2614:2: rule__Behavior__Group__0__Impl rule__Behavior__Group__1
            {
            pushFollow(FOLLOW_rule__Behavior__Group__0__Impl_in_rule__Behavior__Group__05338);
            rule__Behavior__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Behavior__Group__1_in_rule__Behavior__Group__05341);
            rule__Behavior__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__0"


    // $ANTLR start "rule__Behavior__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2621:1: rule__Behavior__Group__0__Impl : ( 'behavior' ) ;
    public final void rule__Behavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2625:1: ( ( 'behavior' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2626:1: ( 'behavior' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2626:1: ( 'behavior' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2627:1: 'behavior'
            {
             before(grammarAccess.getBehaviorAccess().getBehaviorKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Behavior__Group__0__Impl5369); 
             after(grammarAccess.getBehaviorAccess().getBehaviorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__0__Impl"


    // $ANTLR start "rule__Behavior__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2640:1: rule__Behavior__Group__1 : rule__Behavior__Group__1__Impl rule__Behavior__Group__2 ;
    public final void rule__Behavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2644:1: ( rule__Behavior__Group__1__Impl rule__Behavior__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2645:2: rule__Behavior__Group__1__Impl rule__Behavior__Group__2
            {
            pushFollow(FOLLOW_rule__Behavior__Group__1__Impl_in_rule__Behavior__Group__15400);
            rule__Behavior__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Behavior__Group__2_in_rule__Behavior__Group__15403);
            rule__Behavior__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__1"


    // $ANTLR start "rule__Behavior__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2652:1: rule__Behavior__Group__1__Impl : ( ( rule__Behavior__Group_1__0 )? ) ;
    public final void rule__Behavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2656:1: ( ( ( rule__Behavior__Group_1__0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2657:1: ( ( rule__Behavior__Group_1__0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2657:1: ( ( rule__Behavior__Group_1__0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2658:1: ( rule__Behavior__Group_1__0 )?
            {
             before(grammarAccess.getBehaviorAccess().getGroup_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2659:1: ( rule__Behavior__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==30) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2659:2: rule__Behavior__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Behavior__Group_1__0_in_rule__Behavior__Group__1__Impl5430);
                    rule__Behavior__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehaviorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__1__Impl"


    // $ANTLR start "rule__Behavior__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2669:1: rule__Behavior__Group__2 : rule__Behavior__Group__2__Impl rule__Behavior__Group__3 ;
    public final void rule__Behavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2673:1: ( rule__Behavior__Group__2__Impl rule__Behavior__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2674:2: rule__Behavior__Group__2__Impl rule__Behavior__Group__3
            {
            pushFollow(FOLLOW_rule__Behavior__Group__2__Impl_in_rule__Behavior__Group__25461);
            rule__Behavior__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Behavior__Group__3_in_rule__Behavior__Group__25464);
            rule__Behavior__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__2"


    // $ANTLR start "rule__Behavior__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2681:1: rule__Behavior__Group__2__Impl : ( ( rule__Behavior__NameAssignment_2 ) ) ;
    public final void rule__Behavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2685:1: ( ( ( rule__Behavior__NameAssignment_2 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2686:1: ( ( rule__Behavior__NameAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2686:1: ( ( rule__Behavior__NameAssignment_2 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2687:1: ( rule__Behavior__NameAssignment_2 )
            {
             before(grammarAccess.getBehaviorAccess().getNameAssignment_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2688:1: ( rule__Behavior__NameAssignment_2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2688:2: rule__Behavior__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Behavior__NameAssignment_2_in_rule__Behavior__Group__2__Impl5491);
            rule__Behavior__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__2__Impl"


    // $ANTLR start "rule__Behavior__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2698:1: rule__Behavior__Group__3 : rule__Behavior__Group__3__Impl rule__Behavior__Group__4 ;
    public final void rule__Behavior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2702:1: ( rule__Behavior__Group__3__Impl rule__Behavior__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2703:2: rule__Behavior__Group__3__Impl rule__Behavior__Group__4
            {
            pushFollow(FOLLOW_rule__Behavior__Group__3__Impl_in_rule__Behavior__Group__35521);
            rule__Behavior__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Behavior__Group__4_in_rule__Behavior__Group__35524);
            rule__Behavior__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__3"


    // $ANTLR start "rule__Behavior__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2710:1: rule__Behavior__Group__3__Impl : ( '(' ) ;
    public final void rule__Behavior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2714:1: ( ( '(' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2715:1: ( '(' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2715:1: ( '(' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2716:1: '('
            {
             before(grammarAccess.getBehaviorAccess().getLeftParenthesisKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Behavior__Group__3__Impl5552); 
             after(grammarAccess.getBehaviorAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__3__Impl"


    // $ANTLR start "rule__Behavior__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2729:1: rule__Behavior__Group__4 : rule__Behavior__Group__4__Impl rule__Behavior__Group__5 ;
    public final void rule__Behavior__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2733:1: ( rule__Behavior__Group__4__Impl rule__Behavior__Group__5 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2734:2: rule__Behavior__Group__4__Impl rule__Behavior__Group__5
            {
            pushFollow(FOLLOW_rule__Behavior__Group__4__Impl_in_rule__Behavior__Group__45583);
            rule__Behavior__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Behavior__Group__5_in_rule__Behavior__Group__45586);
            rule__Behavior__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__4"


    // $ANTLR start "rule__Behavior__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2741:1: rule__Behavior__Group__4__Impl : ( ( rule__Behavior__Group_4__0 )? ) ;
    public final void rule__Behavior__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2745:1: ( ( ( rule__Behavior__Group_4__0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2746:1: ( ( rule__Behavior__Group_4__0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2746:1: ( ( rule__Behavior__Group_4__0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2747:1: ( rule__Behavior__Group_4__0 )?
            {
             before(grammarAccess.getBehaviorAccess().getGroup_4()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2748:1: ( rule__Behavior__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2748:2: rule__Behavior__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Behavior__Group_4__0_in_rule__Behavior__Group__4__Impl5613);
                    rule__Behavior__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehaviorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__4__Impl"


    // $ANTLR start "rule__Behavior__Group__5"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2758:1: rule__Behavior__Group__5 : rule__Behavior__Group__5__Impl rule__Behavior__Group__6 ;
    public final void rule__Behavior__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2762:1: ( rule__Behavior__Group__5__Impl rule__Behavior__Group__6 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2763:2: rule__Behavior__Group__5__Impl rule__Behavior__Group__6
            {
            pushFollow(FOLLOW_rule__Behavior__Group__5__Impl_in_rule__Behavior__Group__55644);
            rule__Behavior__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Behavior__Group__6_in_rule__Behavior__Group__55647);
            rule__Behavior__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__5"


    // $ANTLR start "rule__Behavior__Group__5__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2770:1: rule__Behavior__Group__5__Impl : ( ')' ) ;
    public final void rule__Behavior__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2774:1: ( ( ')' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2775:1: ( ')' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2775:1: ( ')' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2776:1: ')'
            {
             before(grammarAccess.getBehaviorAccess().getRightParenthesisKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__Behavior__Group__5__Impl5675); 
             after(grammarAccess.getBehaviorAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__5__Impl"


    // $ANTLR start "rule__Behavior__Group__6"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2789:1: rule__Behavior__Group__6 : rule__Behavior__Group__6__Impl rule__Behavior__Group__7 ;
    public final void rule__Behavior__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2793:1: ( rule__Behavior__Group__6__Impl rule__Behavior__Group__7 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2794:2: rule__Behavior__Group__6__Impl rule__Behavior__Group__7
            {
            pushFollow(FOLLOW_rule__Behavior__Group__6__Impl_in_rule__Behavior__Group__65706);
            rule__Behavior__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Behavior__Group__7_in_rule__Behavior__Group__65709);
            rule__Behavior__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__6"


    // $ANTLR start "rule__Behavior__Group__6__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2801:1: rule__Behavior__Group__6__Impl : ( '{' ) ;
    public final void rule__Behavior__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2805:1: ( ( '{' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2806:1: ( '{' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2806:1: ( '{' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2807:1: '{'
            {
             before(grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Behavior__Group__6__Impl5737); 
             after(grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__6__Impl"


    // $ANTLR start "rule__Behavior__Group__7"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2820:1: rule__Behavior__Group__7 : rule__Behavior__Group__7__Impl rule__Behavior__Group__8 ;
    public final void rule__Behavior__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2824:1: ( rule__Behavior__Group__7__Impl rule__Behavior__Group__8 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2825:2: rule__Behavior__Group__7__Impl rule__Behavior__Group__8
            {
            pushFollow(FOLLOW_rule__Behavior__Group__7__Impl_in_rule__Behavior__Group__75768);
            rule__Behavior__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Behavior__Group__8_in_rule__Behavior__Group__75771);
            rule__Behavior__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__7"


    // $ANTLR start "rule__Behavior__Group__7__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2832:1: rule__Behavior__Group__7__Impl : ( ( rule__Behavior__BodyAssignment_7 )* ) ;
    public final void rule__Behavior__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2836:1: ( ( ( rule__Behavior__BodyAssignment_7 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2837:1: ( ( rule__Behavior__BodyAssignment_7 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2837:1: ( ( rule__Behavior__BodyAssignment_7 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2838:1: ( rule__Behavior__BodyAssignment_7 )*
            {
             before(grammarAccess.getBehaviorAccess().getBodyAssignment_7()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2839:1: ( rule__Behavior__BodyAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==31||LA19_0==33||LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2839:2: rule__Behavior__BodyAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Behavior__BodyAssignment_7_in_rule__Behavior__Group__7__Impl5798);
            	    rule__Behavior__BodyAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBehaviorAccess().getBodyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__7__Impl"


    // $ANTLR start "rule__Behavior__Group__8"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2849:1: rule__Behavior__Group__8 : rule__Behavior__Group__8__Impl ;
    public final void rule__Behavior__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2853:1: ( rule__Behavior__Group__8__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2854:2: rule__Behavior__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Behavior__Group__8__Impl_in_rule__Behavior__Group__85829);
            rule__Behavior__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__8"


    // $ANTLR start "rule__Behavior__Group__8__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2860:1: rule__Behavior__Group__8__Impl : ( '}' ) ;
    public final void rule__Behavior__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2864:1: ( ( '}' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2865:1: ( '}' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2865:1: ( '}' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2866:1: '}'
            {
             before(grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__Behavior__Group__8__Impl5857); 
             after(grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__8__Impl"


    // $ANTLR start "rule__Behavior__Group_1__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2897:1: rule__Behavior__Group_1__0 : rule__Behavior__Group_1__0__Impl rule__Behavior__Group_1__1 ;
    public final void rule__Behavior__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2901:1: ( rule__Behavior__Group_1__0__Impl rule__Behavior__Group_1__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2902:2: rule__Behavior__Group_1__0__Impl rule__Behavior__Group_1__1
            {
            pushFollow(FOLLOW_rule__Behavior__Group_1__0__Impl_in_rule__Behavior__Group_1__05906);
            rule__Behavior__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Behavior__Group_1__1_in_rule__Behavior__Group_1__05909);
            rule__Behavior__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_1__0"


    // $ANTLR start "rule__Behavior__Group_1__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2909:1: rule__Behavior__Group_1__0__Impl : ( ( rule__Behavior__QualifierAssignment_1_0 ) ) ;
    public final void rule__Behavior__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2913:1: ( ( ( rule__Behavior__QualifierAssignment_1_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2914:1: ( ( rule__Behavior__QualifierAssignment_1_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2914:1: ( ( rule__Behavior__QualifierAssignment_1_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2915:1: ( rule__Behavior__QualifierAssignment_1_0 )
            {
             before(grammarAccess.getBehaviorAccess().getQualifierAssignment_1_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2916:1: ( rule__Behavior__QualifierAssignment_1_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2916:2: rule__Behavior__QualifierAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Behavior__QualifierAssignment_1_0_in_rule__Behavior__Group_1__0__Impl5936);
            rule__Behavior__QualifierAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getQualifierAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_1__0__Impl"


    // $ANTLR start "rule__Behavior__Group_1__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2926:1: rule__Behavior__Group_1__1 : rule__Behavior__Group_1__1__Impl ;
    public final void rule__Behavior__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2930:1: ( rule__Behavior__Group_1__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2931:2: rule__Behavior__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Behavior__Group_1__1__Impl_in_rule__Behavior__Group_1__15966);
            rule__Behavior__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_1__1"


    // $ANTLR start "rule__Behavior__Group_1__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2937:1: rule__Behavior__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Behavior__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2941:1: ( ( '.' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2942:1: ( '.' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2942:1: ( '.' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2943:1: '.'
            {
             before(grammarAccess.getBehaviorAccess().getFullStopKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__Behavior__Group_1__1__Impl5994); 
             after(grammarAccess.getBehaviorAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_1__1__Impl"


    // $ANTLR start "rule__Behavior__Group_4__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2960:1: rule__Behavior__Group_4__0 : rule__Behavior__Group_4__0__Impl rule__Behavior__Group_4__1 ;
    public final void rule__Behavior__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2964:1: ( rule__Behavior__Group_4__0__Impl rule__Behavior__Group_4__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2965:2: rule__Behavior__Group_4__0__Impl rule__Behavior__Group_4__1
            {
            pushFollow(FOLLOW_rule__Behavior__Group_4__0__Impl_in_rule__Behavior__Group_4__06029);
            rule__Behavior__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Behavior__Group_4__1_in_rule__Behavior__Group_4__06032);
            rule__Behavior__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_4__0"


    // $ANTLR start "rule__Behavior__Group_4__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2972:1: rule__Behavior__Group_4__0__Impl : ( ( rule__Behavior__ParamsAssignment_4_0 ) ) ;
    public final void rule__Behavior__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2976:1: ( ( ( rule__Behavior__ParamsAssignment_4_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2977:1: ( ( rule__Behavior__ParamsAssignment_4_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2977:1: ( ( rule__Behavior__ParamsAssignment_4_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2978:1: ( rule__Behavior__ParamsAssignment_4_0 )
            {
             before(grammarAccess.getBehaviorAccess().getParamsAssignment_4_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2979:1: ( rule__Behavior__ParamsAssignment_4_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2979:2: rule__Behavior__ParamsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Behavior__ParamsAssignment_4_0_in_rule__Behavior__Group_4__0__Impl6059);
            rule__Behavior__ParamsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getParamsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_4__0__Impl"


    // $ANTLR start "rule__Behavior__Group_4__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2989:1: rule__Behavior__Group_4__1 : rule__Behavior__Group_4__1__Impl ;
    public final void rule__Behavior__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2993:1: ( rule__Behavior__Group_4__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:2994:2: rule__Behavior__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Behavior__Group_4__1__Impl_in_rule__Behavior__Group_4__16089);
            rule__Behavior__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_4__1"


    // $ANTLR start "rule__Behavior__Group_4__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3000:1: rule__Behavior__Group_4__1__Impl : ( ( rule__Behavior__Group_4_1__0 )* ) ;
    public final void rule__Behavior__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3004:1: ( ( ( rule__Behavior__Group_4_1__0 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3005:1: ( ( rule__Behavior__Group_4_1__0 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3005:1: ( ( rule__Behavior__Group_4_1__0 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3006:1: ( rule__Behavior__Group_4_1__0 )*
            {
             before(grammarAccess.getBehaviorAccess().getGroup_4_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3007:1: ( rule__Behavior__Group_4_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3007:2: rule__Behavior__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Behavior__Group_4_1__0_in_rule__Behavior__Group_4__1__Impl6116);
            	    rule__Behavior__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBehaviorAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_4__1__Impl"


    // $ANTLR start "rule__Behavior__Group_4_1__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3021:1: rule__Behavior__Group_4_1__0 : rule__Behavior__Group_4_1__0__Impl rule__Behavior__Group_4_1__1 ;
    public final void rule__Behavior__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3025:1: ( rule__Behavior__Group_4_1__0__Impl rule__Behavior__Group_4_1__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3026:2: rule__Behavior__Group_4_1__0__Impl rule__Behavior__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Behavior__Group_4_1__0__Impl_in_rule__Behavior__Group_4_1__06151);
            rule__Behavior__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Behavior__Group_4_1__1_in_rule__Behavior__Group_4_1__06154);
            rule__Behavior__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_4_1__0"


    // $ANTLR start "rule__Behavior__Group_4_1__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3033:1: rule__Behavior__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Behavior__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3037:1: ( ( ',' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3038:1: ( ',' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3038:1: ( ',' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3039:1: ','
            {
             before(grammarAccess.getBehaviorAccess().getCommaKeyword_4_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Behavior__Group_4_1__0__Impl6182); 
             after(grammarAccess.getBehaviorAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_4_1__0__Impl"


    // $ANTLR start "rule__Behavior__Group_4_1__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3052:1: rule__Behavior__Group_4_1__1 : rule__Behavior__Group_4_1__1__Impl ;
    public final void rule__Behavior__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3056:1: ( rule__Behavior__Group_4_1__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3057:2: rule__Behavior__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Behavior__Group_4_1__1__Impl_in_rule__Behavior__Group_4_1__16213);
            rule__Behavior__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_4_1__1"


    // $ANTLR start "rule__Behavior__Group_4_1__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3063:1: rule__Behavior__Group_4_1__1__Impl : ( ( rule__Behavior__ParamsAssignment_4_1_1 ) ) ;
    public final void rule__Behavior__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3067:1: ( ( ( rule__Behavior__ParamsAssignment_4_1_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3068:1: ( ( rule__Behavior__ParamsAssignment_4_1_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3068:1: ( ( rule__Behavior__ParamsAssignment_4_1_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3069:1: ( rule__Behavior__ParamsAssignment_4_1_1 )
            {
             before(grammarAccess.getBehaviorAccess().getParamsAssignment_4_1_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3070:1: ( rule__Behavior__ParamsAssignment_4_1_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3070:2: rule__Behavior__ParamsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Behavior__ParamsAssignment_4_1_1_in_rule__Behavior__Group_4_1__1__Impl6240);
            rule__Behavior__ParamsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getParamsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_4_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3084:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3088:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3089:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06274);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06277);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3096:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3100:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3101:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3101:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3102:1: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3103:1: ( rule__Parameter__TypeAssignment_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3103:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl6304);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3113:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3117:1: ( rule__Parameter__Group__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3118:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16334);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3124:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3128:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3129:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3129:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3130:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3131:1: ( rule__Parameter__NameAssignment_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3131:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl6361);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3145:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3149:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3150:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__06395);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__06398);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3157:1: rule__Method__Group__0__Impl : ( ( rule__Method__TypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3161:1: ( ( ( rule__Method__TypeAssignment_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3162:1: ( ( rule__Method__TypeAssignment_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3162:1: ( ( rule__Method__TypeAssignment_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3163:1: ( rule__Method__TypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3164:1: ( rule__Method__TypeAssignment_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3164:2: rule__Method__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__TypeAssignment_0_in_rule__Method__Group__0__Impl6425);
            rule__Method__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3174:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3178:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3179:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__16455);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__16458);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3186:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3190:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3191:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3191:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3192:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3193:1: ( rule__Method__NameAssignment_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3193:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl6485);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3203:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3207:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3208:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__26515);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__26518);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3215:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3219:1: ( ( '(' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3220:1: ( '(' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3220:1: ( '(' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3221:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Method__Group__2__Impl6546); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3234:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3238:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3239:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__36577);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__36580);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3246:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3250:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3251:1: ( ( rule__Method__Group_3__0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3251:1: ( ( rule__Method__Group_3__0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3252:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3253:1: ( rule__Method__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3253:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl6607);
                    rule__Method__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3263:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3267:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3268:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__46638);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__46641);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3275:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3279:1: ( ( ')' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3280:1: ( ')' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3280:1: ( ')' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3281:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Method__Group__4__Impl6669); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3294:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3298:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3299:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__56700);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__6_in_rule__Method__Group__56703);
            rule__Method__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3306:1: rule__Method__Group__5__Impl : ( '{' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3310:1: ( ( '{' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3311:1: ( '{' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3311:1: ( '{' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3312:1: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Method__Group__5__Impl6731); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3325:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3329:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3330:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__66762);
            rule__Method__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__7_in_rule__Method__Group__66765);
            rule__Method__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3337:1: rule__Method__Group__6__Impl : ( ( rule__Method__BodyAssignment_6 )* ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3341:1: ( ( ( rule__Method__BodyAssignment_6 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3342:1: ( ( rule__Method__BodyAssignment_6 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3342:1: ( ( rule__Method__BodyAssignment_6 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3343:1: ( rule__Method__BodyAssignment_6 )*
            {
             before(grammarAccess.getMethodAccess().getBodyAssignment_6()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3344:1: ( rule__Method__BodyAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==31||LA22_0==33||LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3344:2: rule__Method__BodyAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Method__BodyAssignment_6_in_rule__Method__Group__6__Impl6792);
            	    rule__Method__BodyAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getBodyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3354:1: rule__Method__Group__7 : rule__Method__Group__7__Impl ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3358:1: ( rule__Method__Group__7__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3359:2: rule__Method__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__7__Impl_in_rule__Method__Group__76823);
            rule__Method__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3365:1: rule__Method__Group__7__Impl : ( '}' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3369:1: ( ( '}' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3370:1: ( '}' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3370:1: ( '}' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3371:1: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__Method__Group__7__Impl6851); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3400:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3404:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3405:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__06898);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__06901);
            rule__Method__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3412:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ParamsAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3416:1: ( ( ( rule__Method__ParamsAssignment_3_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3417:1: ( ( rule__Method__ParamsAssignment_3_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3417:1: ( ( rule__Method__ParamsAssignment_3_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3418:1: ( rule__Method__ParamsAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getParamsAssignment_3_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3419:1: ( rule__Method__ParamsAssignment_3_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3419:2: rule__Method__ParamsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Method__ParamsAssignment_3_0_in_rule__Method__Group_3__0__Impl6928);
            rule__Method__ParamsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParamsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3429:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3433:1: ( rule__Method__Group_3__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3434:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__16958);
            rule__Method__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3440:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3444:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3445:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3445:1: ( ( rule__Method__Group_3_1__0 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3446:1: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3447:1: ( rule__Method__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3447:2: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__1__Impl6985);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__Method__Group_3_1__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3461:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3465:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3466:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3_1__0__Impl_in_rule__Method__Group_3_1__07020);
            rule__Method__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__07023);
            rule__Method__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__0"


    // $ANTLR start "rule__Method__Group_3_1__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3473:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3477:1: ( ( ',' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3478:1: ( ',' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3478:1: ( ',' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3479:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Method__Group_3_1__0__Impl7051); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__0__Impl"


    // $ANTLR start "rule__Method__Group_3_1__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3492:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3496:1: ( rule__Method__Group_3_1__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3497:2: rule__Method__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3_1__1__Impl_in_rule__Method__Group_3_1__17082);
            rule__Method__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__1"


    // $ANTLR start "rule__Method__Group_3_1__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3503:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ParamsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3507:1: ( ( ( rule__Method__ParamsAssignment_3_1_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3508:1: ( ( rule__Method__ParamsAssignment_3_1_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3508:1: ( ( rule__Method__ParamsAssignment_3_1_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3509:1: ( rule__Method__ParamsAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParamsAssignment_3_1_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3510:1: ( rule__Method__ParamsAssignment_3_1_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3510:2: rule__Method__ParamsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Method__ParamsAssignment_3_1_1_in_rule__Method__Group_3_1__1__Impl7109);
            rule__Method__ParamsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParamsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3524:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3528:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3529:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07143);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07146);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3536:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__QualifierAssignment_0 ) ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3540:1: ( ( ( rule__QualifiedName__QualifierAssignment_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3541:1: ( ( rule__QualifiedName__QualifierAssignment_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3541:1: ( ( rule__QualifiedName__QualifierAssignment_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3542:1: ( rule__QualifiedName__QualifierAssignment_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getQualifierAssignment_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3543:1: ( rule__QualifiedName__QualifierAssignment_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3543:2: rule__QualifiedName__QualifierAssignment_0
            {
            pushFollow(FOLLOW_rule__QualifiedName__QualifierAssignment_0_in_rule__QualifiedName__Group__0__Impl7173);
            rule__QualifiedName__QualifierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getQualifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3553:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3557:1: ( rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3558:2: rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17203);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__17206);
            rule__QualifiedName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3565:1: rule__QualifiedName__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3569:1: ( ( '.' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3570:1: ( '.' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3570:1: ( '.' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3571:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__QualifiedName__Group__1__Impl7234); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3584:1: rule__QualifiedName__Group__2 : rule__QualifiedName__Group__2__Impl ;
    public final void rule__QualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3588:1: ( rule__QualifiedName__Group__2__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3589:2: rule__QualifiedName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__27265);
            rule__QualifiedName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2"


    // $ANTLR start "rule__QualifiedName__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3595:1: rule__QualifiedName__Group__2__Impl : ( ( rule__QualifiedName__NameAssignment_2 ) ) ;
    public final void rule__QualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3599:1: ( ( ( rule__QualifiedName__NameAssignment_2 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3600:1: ( ( rule__QualifiedName__NameAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3600:1: ( ( rule__QualifiedName__NameAssignment_2 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3601:1: ( rule__QualifiedName__NameAssignment_2 )
            {
             before(grammarAccess.getQualifiedNameAccess().getNameAssignment_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3602:1: ( rule__QualifiedName__NameAssignment_2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3602:2: rule__QualifiedName__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__QualifiedName__NameAssignment_2_in_rule__QualifiedName__Group__2__Impl7292);
            rule__QualifiedName__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2__Impl"


    // $ANTLR start "rule__BinaryExpr__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3618:1: rule__BinaryExpr__Group__0 : rule__BinaryExpr__Group__0__Impl rule__BinaryExpr__Group__1 ;
    public final void rule__BinaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3622:1: ( rule__BinaryExpr__Group__0__Impl rule__BinaryExpr__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3623:2: rule__BinaryExpr__Group__0__Impl rule__BinaryExpr__Group__1
            {
            pushFollow(FOLLOW_rule__BinaryExpr__Group__0__Impl_in_rule__BinaryExpr__Group__07328);
            rule__BinaryExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryExpr__Group__1_in_rule__BinaryExpr__Group__07331);
            rule__BinaryExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__Group__0"


    // $ANTLR start "rule__BinaryExpr__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3630:1: rule__BinaryExpr__Group__0__Impl : ( '(' ) ;
    public final void rule__BinaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3634:1: ( ( '(' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3635:1: ( '(' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3635:1: ( '(' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3636:1: '('
            {
             before(grammarAccess.getBinaryExprAccess().getLeftParenthesisKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__BinaryExpr__Group__0__Impl7359); 
             after(grammarAccess.getBinaryExprAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__Group__0__Impl"


    // $ANTLR start "rule__BinaryExpr__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3649:1: rule__BinaryExpr__Group__1 : rule__BinaryExpr__Group__1__Impl rule__BinaryExpr__Group__2 ;
    public final void rule__BinaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3653:1: ( rule__BinaryExpr__Group__1__Impl rule__BinaryExpr__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3654:2: rule__BinaryExpr__Group__1__Impl rule__BinaryExpr__Group__2
            {
            pushFollow(FOLLOW_rule__BinaryExpr__Group__1__Impl_in_rule__BinaryExpr__Group__17390);
            rule__BinaryExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryExpr__Group__2_in_rule__BinaryExpr__Group__17393);
            rule__BinaryExpr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__Group__1"


    // $ANTLR start "rule__BinaryExpr__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3661:1: rule__BinaryExpr__Group__1__Impl : ( ( rule__BinaryExpr__LhsAssignment_1 ) ) ;
    public final void rule__BinaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3665:1: ( ( ( rule__BinaryExpr__LhsAssignment_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3666:1: ( ( rule__BinaryExpr__LhsAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3666:1: ( ( rule__BinaryExpr__LhsAssignment_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3667:1: ( rule__BinaryExpr__LhsAssignment_1 )
            {
             before(grammarAccess.getBinaryExprAccess().getLhsAssignment_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3668:1: ( rule__BinaryExpr__LhsAssignment_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3668:2: rule__BinaryExpr__LhsAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryExpr__LhsAssignment_1_in_rule__BinaryExpr__Group__1__Impl7420);
            rule__BinaryExpr__LhsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExprAccess().getLhsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__Group__1__Impl"


    // $ANTLR start "rule__BinaryExpr__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3678:1: rule__BinaryExpr__Group__2 : rule__BinaryExpr__Group__2__Impl rule__BinaryExpr__Group__3 ;
    public final void rule__BinaryExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3682:1: ( rule__BinaryExpr__Group__2__Impl rule__BinaryExpr__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3683:2: rule__BinaryExpr__Group__2__Impl rule__BinaryExpr__Group__3
            {
            pushFollow(FOLLOW_rule__BinaryExpr__Group__2__Impl_in_rule__BinaryExpr__Group__27450);
            rule__BinaryExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryExpr__Group__3_in_rule__BinaryExpr__Group__27453);
            rule__BinaryExpr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__Group__2"


    // $ANTLR start "rule__BinaryExpr__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3690:1: rule__BinaryExpr__Group__2__Impl : ( ( rule__BinaryExpr__OpAssignment_2 ) ) ;
    public final void rule__BinaryExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3694:1: ( ( ( rule__BinaryExpr__OpAssignment_2 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3695:1: ( ( rule__BinaryExpr__OpAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3695:1: ( ( rule__BinaryExpr__OpAssignment_2 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3696:1: ( rule__BinaryExpr__OpAssignment_2 )
            {
             before(grammarAccess.getBinaryExprAccess().getOpAssignment_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3697:1: ( rule__BinaryExpr__OpAssignment_2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3697:2: rule__BinaryExpr__OpAssignment_2
            {
            pushFollow(FOLLOW_rule__BinaryExpr__OpAssignment_2_in_rule__BinaryExpr__Group__2__Impl7480);
            rule__BinaryExpr__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExprAccess().getOpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__Group__2__Impl"


    // $ANTLR start "rule__BinaryExpr__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3707:1: rule__BinaryExpr__Group__3 : rule__BinaryExpr__Group__3__Impl rule__BinaryExpr__Group__4 ;
    public final void rule__BinaryExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3711:1: ( rule__BinaryExpr__Group__3__Impl rule__BinaryExpr__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3712:2: rule__BinaryExpr__Group__3__Impl rule__BinaryExpr__Group__4
            {
            pushFollow(FOLLOW_rule__BinaryExpr__Group__3__Impl_in_rule__BinaryExpr__Group__37510);
            rule__BinaryExpr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryExpr__Group__4_in_rule__BinaryExpr__Group__37513);
            rule__BinaryExpr__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__Group__3"


    // $ANTLR start "rule__BinaryExpr__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3719:1: rule__BinaryExpr__Group__3__Impl : ( ( rule__BinaryExpr__RhsAssignment_3 ) ) ;
    public final void rule__BinaryExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3723:1: ( ( ( rule__BinaryExpr__RhsAssignment_3 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3724:1: ( ( rule__BinaryExpr__RhsAssignment_3 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3724:1: ( ( rule__BinaryExpr__RhsAssignment_3 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3725:1: ( rule__BinaryExpr__RhsAssignment_3 )
            {
             before(grammarAccess.getBinaryExprAccess().getRhsAssignment_3()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3726:1: ( rule__BinaryExpr__RhsAssignment_3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3726:2: rule__BinaryExpr__RhsAssignment_3
            {
            pushFollow(FOLLOW_rule__BinaryExpr__RhsAssignment_3_in_rule__BinaryExpr__Group__3__Impl7540);
            rule__BinaryExpr__RhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExprAccess().getRhsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__Group__3__Impl"


    // $ANTLR start "rule__BinaryExpr__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3736:1: rule__BinaryExpr__Group__4 : rule__BinaryExpr__Group__4__Impl ;
    public final void rule__BinaryExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3740:1: ( rule__BinaryExpr__Group__4__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3741:2: rule__BinaryExpr__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BinaryExpr__Group__4__Impl_in_rule__BinaryExpr__Group__47570);
            rule__BinaryExpr__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__Group__4"


    // $ANTLR start "rule__BinaryExpr__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3747:1: rule__BinaryExpr__Group__4__Impl : ( ')' ) ;
    public final void rule__BinaryExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3751:1: ( ( ')' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3752:1: ( ')' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3752:1: ( ')' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3753:1: ')'
            {
             before(grammarAccess.getBinaryExprAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__BinaryExpr__Group__4__Impl7598); 
             after(grammarAccess.getBinaryExprAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__Group__4__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3776:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3780:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3781:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__07639);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__07642);
            rule__FunctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3788:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__NameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3792:1: ( ( ( rule__FunctionCall__NameAssignment_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3793:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3793:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3794:1: ( rule__FunctionCall__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3795:1: ( rule__FunctionCall__NameAssignment_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3795:2: rule__FunctionCall__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionCall__NameAssignment_0_in_rule__FunctionCall__Group__0__Impl7669);
            rule__FunctionCall__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3805:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3809:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3810:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__17699);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__17702);
            rule__FunctionCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3817:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3821:1: ( ( '(' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3822:1: ( '(' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3822:1: ( '(' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3823:1: '('
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__FunctionCall__Group__1__Impl7730); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3836:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3840:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3841:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__27761);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__27764);
            rule__FunctionCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3848:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Group_2__0 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3852:1: ( ( ( rule__FunctionCall__Group_2__0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3853:1: ( ( rule__FunctionCall__Group_2__0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3853:1: ( ( rule__FunctionCall__Group_2__0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3854:1: ( rule__FunctionCall__Group_2__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3855:1: ( rule__FunctionCall__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_INT)||LA24_0==28||LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3855:2: rule__FunctionCall__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionCall__Group_2__0_in_rule__FunctionCall__Group__2__Impl7791);
                    rule__FunctionCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3865:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3869:1: ( rule__FunctionCall__Group__3__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3870:2: rule__FunctionCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__37822);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3876:1: rule__FunctionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3880:1: ( ( ')' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3881:1: ( ')' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3881:1: ( ')' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3882:1: ')'
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__FunctionCall__Group__3__Impl7850); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3903:1: rule__FunctionCall__Group_2__0 : rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 ;
    public final void rule__FunctionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3907:1: ( rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3908:2: rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_2__0__Impl_in_rule__FunctionCall__Group_2__07889);
            rule__FunctionCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group_2__1_in_rule__FunctionCall__Group_2__07892);
            rule__FunctionCall__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__0"


    // $ANTLR start "rule__FunctionCall__Group_2__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3915:1: rule__FunctionCall__Group_2__0__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) ) ;
    public final void rule__FunctionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3919:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3920:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3920:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3921:1: ( rule__FunctionCall__ArgumentsAssignment_2_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3922:1: ( rule__FunctionCall__ArgumentsAssignment_2_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3922:2: rule__FunctionCall__ArgumentsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__FunctionCall__ArgumentsAssignment_2_0_in_rule__FunctionCall__Group_2__0__Impl7919);
            rule__FunctionCall__ArgumentsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3932:1: rule__FunctionCall__Group_2__1 : rule__FunctionCall__Group_2__1__Impl ;
    public final void rule__FunctionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3936:1: ( rule__FunctionCall__Group_2__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3937:2: rule__FunctionCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_2__1__Impl_in_rule__FunctionCall__Group_2__17949);
            rule__FunctionCall__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__1"


    // $ANTLR start "rule__FunctionCall__Group_2__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3943:1: rule__FunctionCall__Group_2__1__Impl : ( ( rule__FunctionCall__Group_2_1__0 )* ) ;
    public final void rule__FunctionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3947:1: ( ( ( rule__FunctionCall__Group_2_1__0 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3948:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3948:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3949:1: ( rule__FunctionCall__Group_2_1__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3950:1: ( rule__FunctionCall__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3950:2: rule__FunctionCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionCall__Group_2_1__0_in_rule__FunctionCall__Group_2__1__Impl7976);
            	    rule__FunctionCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_1__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3964:1: rule__FunctionCall__Group_2_1__0 : rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 ;
    public final void rule__FunctionCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3968:1: ( rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3969:2: rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_2_1__0__Impl_in_rule__FunctionCall__Group_2_1__08011);
            rule__FunctionCall__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group_2_1__1_in_rule__FunctionCall__Group_2_1__08014);
            rule__FunctionCall__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_1__0"


    // $ANTLR start "rule__FunctionCall__Group_2_1__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3976:1: rule__FunctionCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3980:1: ( ( ',' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3981:1: ( ',' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3981:1: ( ',' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3982:1: ','
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0()); 
            match(input,20,FOLLOW_20_in_rule__FunctionCall__Group_2_1__0__Impl8042); 
             after(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_1__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3995:1: rule__FunctionCall__Group_2_1__1 : rule__FunctionCall__Group_2_1__1__Impl ;
    public final void rule__FunctionCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:3999:1: ( rule__FunctionCall__Group_2_1__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4000:2: rule__FunctionCall__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_2_1__1__Impl_in_rule__FunctionCall__Group_2_1__18073);
            rule__FunctionCall__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_1__1"


    // $ANTLR start "rule__FunctionCall__Group_2_1__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4006:1: rule__FunctionCall__Group_2_1__1__Impl : ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) ) ;
    public final void rule__FunctionCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4010:1: ( ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4011:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4011:1: ( ( rule__FunctionCall__ArgumentsAssignment_2_1_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4012:1: ( rule__FunctionCall__ArgumentsAssignment_2_1_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_1_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4013:1: ( rule__FunctionCall__ArgumentsAssignment_2_1_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4013:2: rule__FunctionCall__ArgumentsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__FunctionCall__ArgumentsAssignment_2_1_1_in_rule__FunctionCall__Group_2_1__1__Impl8100);
            rule__FunctionCall__ArgumentsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_1__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4027:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4031:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4032:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__0__Impl_in_rule__ForLoop__Group__08134);
            rule__ForLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForLoop__Group__1_in_rule__ForLoop__Group__08137);
            rule__ForLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0"


    // $ANTLR start "rule__ForLoop__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4039:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4043:1: ( ( 'for' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4044:1: ( 'for' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4044:1: ( 'for' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4045:1: 'for'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ForLoop__Group__0__Impl8165); 
             after(grammarAccess.getForLoopAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0__Impl"


    // $ANTLR start "rule__ForLoop__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4058:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4062:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4063:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__1__Impl_in_rule__ForLoop__Group__18196);
            rule__ForLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForLoop__Group__2_in_rule__ForLoop__Group__18199);
            rule__ForLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1"


    // $ANTLR start "rule__ForLoop__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4070:1: rule__ForLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4074:1: ( ( '(' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4075:1: ( '(' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4075:1: ( '(' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4076:1: '('
            {
             before(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__ForLoop__Group__1__Impl8227); 
             after(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4089:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4093:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4094:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__2__Impl_in_rule__ForLoop__Group__28258);
            rule__ForLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForLoop__Group__3_in_rule__ForLoop__Group__28261);
            rule__ForLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2"


    // $ANTLR start "rule__ForLoop__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4101:1: rule__ForLoop__Group__2__Impl : ( ( rule__ForLoop__VariableAssignment_2 ) ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4105:1: ( ( ( rule__ForLoop__VariableAssignment_2 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4106:1: ( ( rule__ForLoop__VariableAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4106:1: ( ( rule__ForLoop__VariableAssignment_2 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4107:1: ( rule__ForLoop__VariableAssignment_2 )
            {
             before(grammarAccess.getForLoopAccess().getVariableAssignment_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4108:1: ( rule__ForLoop__VariableAssignment_2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4108:2: rule__ForLoop__VariableAssignment_2
            {
            pushFollow(FOLLOW_rule__ForLoop__VariableAssignment_2_in_rule__ForLoop__Group__2__Impl8288);
            rule__ForLoop__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2__Impl"


    // $ANTLR start "rule__ForLoop__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4118:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4122:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4123:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__3__Impl_in_rule__ForLoop__Group__38318);
            rule__ForLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForLoop__Group__4_in_rule__ForLoop__Group__38321);
            rule__ForLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3"


    // $ANTLR start "rule__ForLoop__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4130:1: rule__ForLoop__Group__3__Impl : ( ':' ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4134:1: ( ( ':' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4135:1: ( ':' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4135:1: ( ':' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4136:1: ':'
            {
             before(grammarAccess.getForLoopAccess().getColonKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__ForLoop__Group__3__Impl8349); 
             after(grammarAccess.getForLoopAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3__Impl"


    // $ANTLR start "rule__ForLoop__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4149:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4153:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4154:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__4__Impl_in_rule__ForLoop__Group__48380);
            rule__ForLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForLoop__Group__5_in_rule__ForLoop__Group__48383);
            rule__ForLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4"


    // $ANTLR start "rule__ForLoop__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4161:1: rule__ForLoop__Group__4__Impl : ( ( rule__ForLoop__QualifierAssignment_4 ) ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4165:1: ( ( ( rule__ForLoop__QualifierAssignment_4 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4166:1: ( ( rule__ForLoop__QualifierAssignment_4 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4166:1: ( ( rule__ForLoop__QualifierAssignment_4 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4167:1: ( rule__ForLoop__QualifierAssignment_4 )
            {
             before(grammarAccess.getForLoopAccess().getQualifierAssignment_4()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4168:1: ( rule__ForLoop__QualifierAssignment_4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4168:2: rule__ForLoop__QualifierAssignment_4
            {
            pushFollow(FOLLOW_rule__ForLoop__QualifierAssignment_4_in_rule__ForLoop__Group__4__Impl8410);
            rule__ForLoop__QualifierAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getQualifierAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4__Impl"


    // $ANTLR start "rule__ForLoop__Group__5"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4178:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4182:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4183:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__5__Impl_in_rule__ForLoop__Group__58440);
            rule__ForLoop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForLoop__Group__6_in_rule__ForLoop__Group__58443);
            rule__ForLoop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5"


    // $ANTLR start "rule__ForLoop__Group__5__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4190:1: rule__ForLoop__Group__5__Impl : ( '.' ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4194:1: ( ( '.' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4195:1: ( '.' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4195:1: ( '.' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4196:1: '.'
            {
             before(grammarAccess.getForLoopAccess().getFullStopKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__ForLoop__Group__5__Impl8471); 
             after(grammarAccess.getForLoopAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5__Impl"


    // $ANTLR start "rule__ForLoop__Group__6"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4209:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4213:1: ( rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4214:2: rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__6__Impl_in_rule__ForLoop__Group__68502);
            rule__ForLoop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForLoop__Group__7_in_rule__ForLoop__Group__68505);
            rule__ForLoop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6"


    // $ANTLR start "rule__ForLoop__Group__6__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4221:1: rule__ForLoop__Group__6__Impl : ( ( rule__ForLoop__SharedAssignment_6 ) ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4225:1: ( ( ( rule__ForLoop__SharedAssignment_6 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4226:1: ( ( rule__ForLoop__SharedAssignment_6 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4226:1: ( ( rule__ForLoop__SharedAssignment_6 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4227:1: ( rule__ForLoop__SharedAssignment_6 )
            {
             before(grammarAccess.getForLoopAccess().getSharedAssignment_6()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4228:1: ( rule__ForLoop__SharedAssignment_6 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4228:2: rule__ForLoop__SharedAssignment_6
            {
            pushFollow(FOLLOW_rule__ForLoop__SharedAssignment_6_in_rule__ForLoop__Group__6__Impl8532);
            rule__ForLoop__SharedAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getSharedAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6__Impl"


    // $ANTLR start "rule__ForLoop__Group__7"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4238:1: rule__ForLoop__Group__7 : rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8 ;
    public final void rule__ForLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4242:1: ( rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4243:2: rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__7__Impl_in_rule__ForLoop__Group__78562);
            rule__ForLoop__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForLoop__Group__8_in_rule__ForLoop__Group__78565);
            rule__ForLoop__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__7"


    // $ANTLR start "rule__ForLoop__Group__7__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4250:1: rule__ForLoop__Group__7__Impl : ( ')' ) ;
    public final void rule__ForLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4254:1: ( ( ')' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4255:1: ( ')' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4255:1: ( ')' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4256:1: ')'
            {
             before(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7()); 
            match(input,29,FOLLOW_29_in_rule__ForLoop__Group__7__Impl8593); 
             after(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__7__Impl"


    // $ANTLR start "rule__ForLoop__Group__8"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4269:1: rule__ForLoop__Group__8 : rule__ForLoop__Group__8__Impl rule__ForLoop__Group__9 ;
    public final void rule__ForLoop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4273:1: ( rule__ForLoop__Group__8__Impl rule__ForLoop__Group__9 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4274:2: rule__ForLoop__Group__8__Impl rule__ForLoop__Group__9
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__8__Impl_in_rule__ForLoop__Group__88624);
            rule__ForLoop__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForLoop__Group__9_in_rule__ForLoop__Group__88627);
            rule__ForLoop__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__8"


    // $ANTLR start "rule__ForLoop__Group__8__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4281:1: rule__ForLoop__Group__8__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4285:1: ( ( '{' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4286:1: ( '{' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4286:1: ( '{' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4287:1: '{'
            {
             before(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__ForLoop__Group__8__Impl8655); 
             after(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__8__Impl"


    // $ANTLR start "rule__ForLoop__Group__9"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4300:1: rule__ForLoop__Group__9 : rule__ForLoop__Group__9__Impl rule__ForLoop__Group__10 ;
    public final void rule__ForLoop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4304:1: ( rule__ForLoop__Group__9__Impl rule__ForLoop__Group__10 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4305:2: rule__ForLoop__Group__9__Impl rule__ForLoop__Group__10
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__9__Impl_in_rule__ForLoop__Group__98686);
            rule__ForLoop__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForLoop__Group__10_in_rule__ForLoop__Group__98689);
            rule__ForLoop__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__9"


    // $ANTLR start "rule__ForLoop__Group__9__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4312:1: rule__ForLoop__Group__9__Impl : ( ( rule__ForLoop__BodyAssignment_9 )* ) ;
    public final void rule__ForLoop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4316:1: ( ( ( rule__ForLoop__BodyAssignment_9 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4317:1: ( ( rule__ForLoop__BodyAssignment_9 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4317:1: ( ( rule__ForLoop__BodyAssignment_9 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4318:1: ( rule__ForLoop__BodyAssignment_9 )*
            {
             before(grammarAccess.getForLoopAccess().getBodyAssignment_9()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4319:1: ( rule__ForLoop__BodyAssignment_9 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==31||LA26_0==33||LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4319:2: rule__ForLoop__BodyAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__ForLoop__BodyAssignment_9_in_rule__ForLoop__Group__9__Impl8716);
            	    rule__ForLoop__BodyAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getForLoopAccess().getBodyAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__9__Impl"


    // $ANTLR start "rule__ForLoop__Group__10"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4329:1: rule__ForLoop__Group__10 : rule__ForLoop__Group__10__Impl ;
    public final void rule__ForLoop__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4333:1: ( rule__ForLoop__Group__10__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4334:2: rule__ForLoop__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__ForLoop__Group__10__Impl_in_rule__ForLoop__Group__108747);
            rule__ForLoop__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__10"


    // $ANTLR start "rule__ForLoop__Group__10__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4340:1: rule__ForLoop__Group__10__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4344:1: ( ( '}' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4345:1: ( '}' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4345:1: ( '}' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4346:1: '}'
            {
             before(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_19_in_rule__ForLoop__Group__10__Impl8775); 
             after(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__10__Impl"


    // $ANTLR start "rule__Conditional__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4381:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4385:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4386:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_rule__Conditional__Group__0__Impl_in_rule__Conditional__Group__08828);
            rule__Conditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__1_in_rule__Conditional__Group__08831);
            rule__Conditional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4393:1: rule__Conditional__Group__0__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4397:1: ( ( 'if' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4398:1: ( 'if' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4398:1: ( 'if' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4399:1: 'if'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Conditional__Group__0__Impl8859); 
             after(grammarAccess.getConditionalAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4412:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4416:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4417:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_rule__Conditional__Group__1__Impl_in_rule__Conditional__Group__18890);
            rule__Conditional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__2_in_rule__Conditional__Group__18893);
            rule__Conditional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4424:1: rule__Conditional__Group__1__Impl : ( '(' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4428:1: ( ( '(' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4429:1: ( '(' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4429:1: ( '(' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4430:1: '('
            {
             before(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Conditional__Group__1__Impl8921); 
             after(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4443:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4447:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4448:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_rule__Conditional__Group__2__Impl_in_rule__Conditional__Group__28952);
            rule__Conditional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__3_in_rule__Conditional__Group__28955);
            rule__Conditional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2"


    // $ANTLR start "rule__Conditional__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4455:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__ConditionAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4459:1: ( ( ( rule__Conditional__ConditionAssignment_2 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4460:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4460:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4461:1: ( rule__Conditional__ConditionAssignment_2 )
            {
             before(grammarAccess.getConditionalAccess().getConditionAssignment_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4462:1: ( rule__Conditional__ConditionAssignment_2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4462:2: rule__Conditional__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__Conditional__ConditionAssignment_2_in_rule__Conditional__Group__2__Impl8982);
            rule__Conditional__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4472:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4476:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4477:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_rule__Conditional__Group__3__Impl_in_rule__Conditional__Group__39012);
            rule__Conditional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__4_in_rule__Conditional__Group__39015);
            rule__Conditional__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3"


    // $ANTLR start "rule__Conditional__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4484:1: rule__Conditional__Group__3__Impl : ( ')' ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4488:1: ( ( ')' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4489:1: ( ')' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4489:1: ( ')' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4490:1: ')'
            {
             before(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Conditional__Group__3__Impl9043); 
             after(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4503:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4507:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4508:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_rule__Conditional__Group__4__Impl_in_rule__Conditional__Group__49074);
            rule__Conditional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__5_in_rule__Conditional__Group__49077);
            rule__Conditional__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4"


    // $ANTLR start "rule__Conditional__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4515:1: rule__Conditional__Group__4__Impl : ( '{' ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4519:1: ( ( '{' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4520:1: ( '{' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4520:1: ( '{' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4521:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Conditional__Group__4__Impl9105); 
             after(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4__Impl"


    // $ANTLR start "rule__Conditional__Group__5"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4534:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl rule__Conditional__Group__6 ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4538:1: ( rule__Conditional__Group__5__Impl rule__Conditional__Group__6 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4539:2: rule__Conditional__Group__5__Impl rule__Conditional__Group__6
            {
            pushFollow(FOLLOW_rule__Conditional__Group__5__Impl_in_rule__Conditional__Group__59136);
            rule__Conditional__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__6_in_rule__Conditional__Group__59139);
            rule__Conditional__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5"


    // $ANTLR start "rule__Conditional__Group__5__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4546:1: rule__Conditional__Group__5__Impl : ( ( rule__Conditional__ThenBranchAssignment_5 )* ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4550:1: ( ( ( rule__Conditional__ThenBranchAssignment_5 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4551:1: ( ( rule__Conditional__ThenBranchAssignment_5 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4551:1: ( ( rule__Conditional__ThenBranchAssignment_5 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4552:1: ( rule__Conditional__ThenBranchAssignment_5 )*
            {
             before(grammarAccess.getConditionalAccess().getThenBranchAssignment_5()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4553:1: ( rule__Conditional__ThenBranchAssignment_5 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==31||LA27_0==33||LA27_0==35) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4553:2: rule__Conditional__ThenBranchAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Conditional__ThenBranchAssignment_5_in_rule__Conditional__Group__5__Impl9166);
            	    rule__Conditional__ThenBranchAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getConditionalAccess().getThenBranchAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5__Impl"


    // $ANTLR start "rule__Conditional__Group__6"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4563:1: rule__Conditional__Group__6 : rule__Conditional__Group__6__Impl rule__Conditional__Group__7 ;
    public final void rule__Conditional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4567:1: ( rule__Conditional__Group__6__Impl rule__Conditional__Group__7 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4568:2: rule__Conditional__Group__6__Impl rule__Conditional__Group__7
            {
            pushFollow(FOLLOW_rule__Conditional__Group__6__Impl_in_rule__Conditional__Group__69197);
            rule__Conditional__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group__7_in_rule__Conditional__Group__69200);
            rule__Conditional__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__6"


    // $ANTLR start "rule__Conditional__Group__6__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4575:1: rule__Conditional__Group__6__Impl : ( '}' ) ;
    public final void rule__Conditional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4579:1: ( ( '}' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4580:1: ( '}' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4580:1: ( '}' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4581:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Conditional__Group__6__Impl9228); 
             after(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__6__Impl"


    // $ANTLR start "rule__Conditional__Group__7"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4594:1: rule__Conditional__Group__7 : rule__Conditional__Group__7__Impl ;
    public final void rule__Conditional__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4598:1: ( rule__Conditional__Group__7__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4599:2: rule__Conditional__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Conditional__Group__7__Impl_in_rule__Conditional__Group__79259);
            rule__Conditional__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__7"


    // $ANTLR start "rule__Conditional__Group__7__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4605:1: rule__Conditional__Group__7__Impl : ( ( rule__Conditional__Group_7__0 )? ) ;
    public final void rule__Conditional__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4609:1: ( ( ( rule__Conditional__Group_7__0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4610:1: ( ( rule__Conditional__Group_7__0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4610:1: ( ( rule__Conditional__Group_7__0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4611:1: ( rule__Conditional__Group_7__0 )?
            {
             before(grammarAccess.getConditionalAccess().getGroup_7()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4612:1: ( rule__Conditional__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4612:2: rule__Conditional__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Conditional__Group_7__0_in_rule__Conditional__Group__7__Impl9286);
                    rule__Conditional__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionalAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__7__Impl"


    // $ANTLR start "rule__Conditional__Group_7__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4638:1: rule__Conditional__Group_7__0 : rule__Conditional__Group_7__0__Impl rule__Conditional__Group_7__1 ;
    public final void rule__Conditional__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4642:1: ( rule__Conditional__Group_7__0__Impl rule__Conditional__Group_7__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4643:2: rule__Conditional__Group_7__0__Impl rule__Conditional__Group_7__1
            {
            pushFollow(FOLLOW_rule__Conditional__Group_7__0__Impl_in_rule__Conditional__Group_7__09333);
            rule__Conditional__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group_7__1_in_rule__Conditional__Group_7__09336);
            rule__Conditional__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_7__0"


    // $ANTLR start "rule__Conditional__Group_7__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4650:1: rule__Conditional__Group_7__0__Impl : ( 'else' ) ;
    public final void rule__Conditional__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4654:1: ( ( 'else' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4655:1: ( 'else' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4655:1: ( 'else' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4656:1: 'else'
            {
             before(grammarAccess.getConditionalAccess().getElseKeyword_7_0()); 
            match(input,34,FOLLOW_34_in_rule__Conditional__Group_7__0__Impl9364); 
             after(grammarAccess.getConditionalAccess().getElseKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_7__0__Impl"


    // $ANTLR start "rule__Conditional__Group_7__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4669:1: rule__Conditional__Group_7__1 : rule__Conditional__Group_7__1__Impl rule__Conditional__Group_7__2 ;
    public final void rule__Conditional__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4673:1: ( rule__Conditional__Group_7__1__Impl rule__Conditional__Group_7__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4674:2: rule__Conditional__Group_7__1__Impl rule__Conditional__Group_7__2
            {
            pushFollow(FOLLOW_rule__Conditional__Group_7__1__Impl_in_rule__Conditional__Group_7__19395);
            rule__Conditional__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group_7__2_in_rule__Conditional__Group_7__19398);
            rule__Conditional__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_7__1"


    // $ANTLR start "rule__Conditional__Group_7__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4681:1: rule__Conditional__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Conditional__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4685:1: ( ( '{' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4686:1: ( '{' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4686:1: ( '{' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4687:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,18,FOLLOW_18_in_rule__Conditional__Group_7__1__Impl9426); 
             after(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_7__1__Impl"


    // $ANTLR start "rule__Conditional__Group_7__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4700:1: rule__Conditional__Group_7__2 : rule__Conditional__Group_7__2__Impl rule__Conditional__Group_7__3 ;
    public final void rule__Conditional__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4704:1: ( rule__Conditional__Group_7__2__Impl rule__Conditional__Group_7__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4705:2: rule__Conditional__Group_7__2__Impl rule__Conditional__Group_7__3
            {
            pushFollow(FOLLOW_rule__Conditional__Group_7__2__Impl_in_rule__Conditional__Group_7__29457);
            rule__Conditional__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conditional__Group_7__3_in_rule__Conditional__Group_7__29460);
            rule__Conditional__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_7__2"


    // $ANTLR start "rule__Conditional__Group_7__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4712:1: rule__Conditional__Group_7__2__Impl : ( ( rule__Conditional__ElseBranchAssignment_7_2 )* ) ;
    public final void rule__Conditional__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4716:1: ( ( ( rule__Conditional__ElseBranchAssignment_7_2 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4717:1: ( ( rule__Conditional__ElseBranchAssignment_7_2 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4717:1: ( ( rule__Conditional__ElseBranchAssignment_7_2 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4718:1: ( rule__Conditional__ElseBranchAssignment_7_2 )*
            {
             before(grammarAccess.getConditionalAccess().getElseBranchAssignment_7_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4719:1: ( rule__Conditional__ElseBranchAssignment_7_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==31||LA29_0==33||LA29_0==35) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4719:2: rule__Conditional__ElseBranchAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Conditional__ElseBranchAssignment_7_2_in_rule__Conditional__Group_7__2__Impl9487);
            	    rule__Conditional__ElseBranchAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getConditionalAccess().getElseBranchAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_7__2__Impl"


    // $ANTLR start "rule__Conditional__Group_7__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4729:1: rule__Conditional__Group_7__3 : rule__Conditional__Group_7__3__Impl ;
    public final void rule__Conditional__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4733:1: ( rule__Conditional__Group_7__3__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4734:2: rule__Conditional__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Conditional__Group_7__3__Impl_in_rule__Conditional__Group_7__39518);
            rule__Conditional__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_7__3"


    // $ANTLR start "rule__Conditional__Group_7__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4740:1: rule__Conditional__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Conditional__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4744:1: ( ( '}' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4745:1: ( '}' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4745:1: ( '}' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4746:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,19,FOLLOW_19_in_rule__Conditional__Group_7__3__Impl9546); 
             after(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_7__3__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4767:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4771:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4772:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__09585);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__09588);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4779:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__QualifierAssignment_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4783:1: ( ( ( rule__Operation__QualifierAssignment_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4784:1: ( ( rule__Operation__QualifierAssignment_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4784:1: ( ( rule__Operation__QualifierAssignment_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4785:1: ( rule__Operation__QualifierAssignment_0 )
            {
             before(grammarAccess.getOperationAccess().getQualifierAssignment_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4786:1: ( rule__Operation__QualifierAssignment_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4786:2: rule__Operation__QualifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Operation__QualifierAssignment_0_in_rule__Operation__Group__0__Impl9615);
            rule__Operation__QualifierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getQualifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4796:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4800:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4801:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__19645);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__19648);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4808:1: rule__Operation__Group__1__Impl : ( '.' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4812:1: ( ( '.' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4813:1: ( '.' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4813:1: ( '.' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4814:1: '.'
            {
             before(grammarAccess.getOperationAccess().getFullStopKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Operation__Group__1__Impl9676); 
             after(grammarAccess.getOperationAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4827:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4831:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4832:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__29707);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__29710);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4839:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4843:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4844:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4844:1: ( ( rule__Operation__NameAssignment_2 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4845:1: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4846:1: ( rule__Operation__NameAssignment_2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4846:2: rule__Operation__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl9737);
            rule__Operation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4856:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4860:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4861:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__39767);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__39770);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4868:1: rule__Operation__Group__3__Impl : ( '(' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4872:1: ( ( '(' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4873:1: ( '(' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4873:1: ( '(' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4874:1: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Operation__Group__3__Impl9798); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4887:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4891:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4892:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__49829);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__49832);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4899:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4903:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4904:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4904:1: ( ( rule__Operation__Group_4__0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4905:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4906:1: ( rule__Operation__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INT)||LA30_0==28||LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4906:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl9859);
                    rule__Operation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4916:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4920:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4921:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__59890);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__59893);
            rule__Operation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4928:1: rule__Operation__Group__5__Impl : ( ')' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4932:1: ( ( ')' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4933:1: ( ')' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4933:1: ( ')' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4934:1: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__Operation__Group__5__Impl9921); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4947:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4951:1: ( rule__Operation__Group__6__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4952:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__69952);
            rule__Operation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4958:1: rule__Operation__Group__6__Impl : ( ';' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4962:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4963:1: ( ';' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4963:1: ( ';' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4964:1: ';'
            {
             before(grammarAccess.getOperationAccess().getSemicolonKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Operation__Group__6__Impl9980); 
             after(grammarAccess.getOperationAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4991:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4995:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:4996:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__010025);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__010028);
            rule__Operation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5003:1: rule__Operation__Group_4__0__Impl : ( ( rule__Operation__ArgumentsAssignment_4_0 ) ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5007:1: ( ( ( rule__Operation__ArgumentsAssignment_4_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5008:1: ( ( rule__Operation__ArgumentsAssignment_4_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5008:1: ( ( rule__Operation__ArgumentsAssignment_4_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5009:1: ( rule__Operation__ArgumentsAssignment_4_0 )
            {
             before(grammarAccess.getOperationAccess().getArgumentsAssignment_4_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5010:1: ( rule__Operation__ArgumentsAssignment_4_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5010:2: rule__Operation__ArgumentsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Operation__ArgumentsAssignment_4_0_in_rule__Operation__Group_4__0__Impl10055);
            rule__Operation__ArgumentsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getArgumentsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5020:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5024:1: ( rule__Operation__Group_4__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5025:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__110085);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5031:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__Group_4_1__0 )* ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5035:1: ( ( ( rule__Operation__Group_4_1__0 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5036:1: ( ( rule__Operation__Group_4_1__0 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5036:1: ( ( rule__Operation__Group_4_1__0 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5037:1: ( rule__Operation__Group_4_1__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_4_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5038:1: ( rule__Operation__Group_4_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5038:2: rule__Operation__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_4_1__0_in_rule__Operation__Group_4__1__Impl10112);
            	    rule__Operation__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group_4_1__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5052:1: rule__Operation__Group_4_1__0 : rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1 ;
    public final void rule__Operation__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5056:1: ( rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5057:2: rule__Operation__Group_4_1__0__Impl rule__Operation__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4_1__0__Impl_in_rule__Operation__Group_4_1__010147);
            rule__Operation__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4_1__1_in_rule__Operation__Group_4_1__010150);
            rule__Operation__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__0"


    // $ANTLR start "rule__Operation__Group_4_1__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5064:1: rule__Operation__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5068:1: ( ( ',' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5069:1: ( ',' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5069:1: ( ',' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5070:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_4_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Operation__Group_4_1__0__Impl10178); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__0__Impl"


    // $ANTLR start "rule__Operation__Group_4_1__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5083:1: rule__Operation__Group_4_1__1 : rule__Operation__Group_4_1__1__Impl ;
    public final void rule__Operation__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5087:1: ( rule__Operation__Group_4_1__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5088:2: rule__Operation__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4_1__1__Impl_in_rule__Operation__Group_4_1__110209);
            rule__Operation__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__1"


    // $ANTLR start "rule__Operation__Group_4_1__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5094:1: rule__Operation__Group_4_1__1__Impl : ( ( rule__Operation__ArgumentsAssignment_4_1_1 ) ) ;
    public final void rule__Operation__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5098:1: ( ( ( rule__Operation__ArgumentsAssignment_4_1_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5099:1: ( ( rule__Operation__ArgumentsAssignment_4_1_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5099:1: ( ( rule__Operation__ArgumentsAssignment_4_1_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5100:1: ( rule__Operation__ArgumentsAssignment_4_1_1 )
            {
             before(grammarAccess.getOperationAccess().getArgumentsAssignment_4_1_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5101:1: ( rule__Operation__ArgumentsAssignment_4_1_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5101:2: rule__Operation__ArgumentsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Operation__ArgumentsAssignment_4_1_1_in_rule__Operation__Group_4_1__1__Impl10236);
            rule__Operation__ArgumentsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getArgumentsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_1__1__Impl"


    // $ANTLR start "rule__SelfOperation__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5115:1: rule__SelfOperation__Group__0 : rule__SelfOperation__Group__0__Impl rule__SelfOperation__Group__1 ;
    public final void rule__SelfOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5119:1: ( rule__SelfOperation__Group__0__Impl rule__SelfOperation__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5120:2: rule__SelfOperation__Group__0__Impl rule__SelfOperation__Group__1
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group__0__Impl_in_rule__SelfOperation__Group__010270);
            rule__SelfOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfOperation__Group__1_in_rule__SelfOperation__Group__010273);
            rule__SelfOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__0"


    // $ANTLR start "rule__SelfOperation__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5127:1: rule__SelfOperation__Group__0__Impl : ( 'self' ) ;
    public final void rule__SelfOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5131:1: ( ( 'self' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5132:1: ( 'self' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5132:1: ( 'self' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5133:1: 'self'
            {
             before(grammarAccess.getSelfOperationAccess().getSelfKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__SelfOperation__Group__0__Impl10301); 
             after(grammarAccess.getSelfOperationAccess().getSelfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__0__Impl"


    // $ANTLR start "rule__SelfOperation__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5146:1: rule__SelfOperation__Group__1 : rule__SelfOperation__Group__1__Impl rule__SelfOperation__Group__2 ;
    public final void rule__SelfOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5150:1: ( rule__SelfOperation__Group__1__Impl rule__SelfOperation__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5151:2: rule__SelfOperation__Group__1__Impl rule__SelfOperation__Group__2
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group__1__Impl_in_rule__SelfOperation__Group__110332);
            rule__SelfOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfOperation__Group__2_in_rule__SelfOperation__Group__110335);
            rule__SelfOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__1"


    // $ANTLR start "rule__SelfOperation__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5158:1: rule__SelfOperation__Group__1__Impl : ( '.' ) ;
    public final void rule__SelfOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5162:1: ( ( '.' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5163:1: ( '.' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5163:1: ( '.' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5164:1: '.'
            {
             before(grammarAccess.getSelfOperationAccess().getFullStopKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__SelfOperation__Group__1__Impl10363); 
             after(grammarAccess.getSelfOperationAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__1__Impl"


    // $ANTLR start "rule__SelfOperation__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5177:1: rule__SelfOperation__Group__2 : rule__SelfOperation__Group__2__Impl rule__SelfOperation__Group__3 ;
    public final void rule__SelfOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5181:1: ( rule__SelfOperation__Group__2__Impl rule__SelfOperation__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5182:2: rule__SelfOperation__Group__2__Impl rule__SelfOperation__Group__3
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group__2__Impl_in_rule__SelfOperation__Group__210394);
            rule__SelfOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfOperation__Group__3_in_rule__SelfOperation__Group__210397);
            rule__SelfOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__2"


    // $ANTLR start "rule__SelfOperation__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5189:1: rule__SelfOperation__Group__2__Impl : ( ( rule__SelfOperation__NameAssignment_2 ) ) ;
    public final void rule__SelfOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5193:1: ( ( ( rule__SelfOperation__NameAssignment_2 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5194:1: ( ( rule__SelfOperation__NameAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5194:1: ( ( rule__SelfOperation__NameAssignment_2 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5195:1: ( rule__SelfOperation__NameAssignment_2 )
            {
             before(grammarAccess.getSelfOperationAccess().getNameAssignment_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5196:1: ( rule__SelfOperation__NameAssignment_2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5196:2: rule__SelfOperation__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__SelfOperation__NameAssignment_2_in_rule__SelfOperation__Group__2__Impl10424);
            rule__SelfOperation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelfOperationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__2__Impl"


    // $ANTLR start "rule__SelfOperation__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5206:1: rule__SelfOperation__Group__3 : rule__SelfOperation__Group__3__Impl rule__SelfOperation__Group__4 ;
    public final void rule__SelfOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5210:1: ( rule__SelfOperation__Group__3__Impl rule__SelfOperation__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5211:2: rule__SelfOperation__Group__3__Impl rule__SelfOperation__Group__4
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group__3__Impl_in_rule__SelfOperation__Group__310454);
            rule__SelfOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfOperation__Group__4_in_rule__SelfOperation__Group__310457);
            rule__SelfOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__3"


    // $ANTLR start "rule__SelfOperation__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5218:1: rule__SelfOperation__Group__3__Impl : ( '(' ) ;
    public final void rule__SelfOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5222:1: ( ( '(' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5223:1: ( '(' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5223:1: ( '(' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5224:1: '('
            {
             before(grammarAccess.getSelfOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__SelfOperation__Group__3__Impl10485); 
             after(grammarAccess.getSelfOperationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__3__Impl"


    // $ANTLR start "rule__SelfOperation__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5237:1: rule__SelfOperation__Group__4 : rule__SelfOperation__Group__4__Impl rule__SelfOperation__Group__5 ;
    public final void rule__SelfOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5241:1: ( rule__SelfOperation__Group__4__Impl rule__SelfOperation__Group__5 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5242:2: rule__SelfOperation__Group__4__Impl rule__SelfOperation__Group__5
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group__4__Impl_in_rule__SelfOperation__Group__410516);
            rule__SelfOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfOperation__Group__5_in_rule__SelfOperation__Group__410519);
            rule__SelfOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__4"


    // $ANTLR start "rule__SelfOperation__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5249:1: rule__SelfOperation__Group__4__Impl : ( ( rule__SelfOperation__Group_4__0 )? ) ;
    public final void rule__SelfOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5253:1: ( ( ( rule__SelfOperation__Group_4__0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5254:1: ( ( rule__SelfOperation__Group_4__0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5254:1: ( ( rule__SelfOperation__Group_4__0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5255:1: ( rule__SelfOperation__Group_4__0 )?
            {
             before(grammarAccess.getSelfOperationAccess().getGroup_4()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5256:1: ( rule__SelfOperation__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_INT)||LA32_0==28||LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5256:2: rule__SelfOperation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SelfOperation__Group_4__0_in_rule__SelfOperation__Group__4__Impl10546);
                    rule__SelfOperation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelfOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__4__Impl"


    // $ANTLR start "rule__SelfOperation__Group__5"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5266:1: rule__SelfOperation__Group__5 : rule__SelfOperation__Group__5__Impl rule__SelfOperation__Group__6 ;
    public final void rule__SelfOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5270:1: ( rule__SelfOperation__Group__5__Impl rule__SelfOperation__Group__6 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5271:2: rule__SelfOperation__Group__5__Impl rule__SelfOperation__Group__6
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group__5__Impl_in_rule__SelfOperation__Group__510577);
            rule__SelfOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfOperation__Group__6_in_rule__SelfOperation__Group__510580);
            rule__SelfOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__5"


    // $ANTLR start "rule__SelfOperation__Group__5__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5278:1: rule__SelfOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__SelfOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5282:1: ( ( ')' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5283:1: ( ')' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5283:1: ( ')' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5284:1: ')'
            {
             before(grammarAccess.getSelfOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__SelfOperation__Group__5__Impl10608); 
             after(grammarAccess.getSelfOperationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__5__Impl"


    // $ANTLR start "rule__SelfOperation__Group__6"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5297:1: rule__SelfOperation__Group__6 : rule__SelfOperation__Group__6__Impl ;
    public final void rule__SelfOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5301:1: ( rule__SelfOperation__Group__6__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5302:2: rule__SelfOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group__6__Impl_in_rule__SelfOperation__Group__610639);
            rule__SelfOperation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__6"


    // $ANTLR start "rule__SelfOperation__Group__6__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5308:1: rule__SelfOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__SelfOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5312:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5313:1: ( ';' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5313:1: ( ';' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5314:1: ';'
            {
             before(grammarAccess.getSelfOperationAccess().getSemicolonKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__SelfOperation__Group__6__Impl10667); 
             after(grammarAccess.getSelfOperationAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group__6__Impl"


    // $ANTLR start "rule__SelfOperation__Group_4__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5341:1: rule__SelfOperation__Group_4__0 : rule__SelfOperation__Group_4__0__Impl rule__SelfOperation__Group_4__1 ;
    public final void rule__SelfOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5345:1: ( rule__SelfOperation__Group_4__0__Impl rule__SelfOperation__Group_4__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5346:2: rule__SelfOperation__Group_4__0__Impl rule__SelfOperation__Group_4__1
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group_4__0__Impl_in_rule__SelfOperation__Group_4__010712);
            rule__SelfOperation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfOperation__Group_4__1_in_rule__SelfOperation__Group_4__010715);
            rule__SelfOperation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group_4__0"


    // $ANTLR start "rule__SelfOperation__Group_4__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5353:1: rule__SelfOperation__Group_4__0__Impl : ( ( rule__SelfOperation__ArgumentsAssignment_4_0 ) ) ;
    public final void rule__SelfOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5357:1: ( ( ( rule__SelfOperation__ArgumentsAssignment_4_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5358:1: ( ( rule__SelfOperation__ArgumentsAssignment_4_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5358:1: ( ( rule__SelfOperation__ArgumentsAssignment_4_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5359:1: ( rule__SelfOperation__ArgumentsAssignment_4_0 )
            {
             before(grammarAccess.getSelfOperationAccess().getArgumentsAssignment_4_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5360:1: ( rule__SelfOperation__ArgumentsAssignment_4_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5360:2: rule__SelfOperation__ArgumentsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__SelfOperation__ArgumentsAssignment_4_0_in_rule__SelfOperation__Group_4__0__Impl10742);
            rule__SelfOperation__ArgumentsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSelfOperationAccess().getArgumentsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group_4__0__Impl"


    // $ANTLR start "rule__SelfOperation__Group_4__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5370:1: rule__SelfOperation__Group_4__1 : rule__SelfOperation__Group_4__1__Impl ;
    public final void rule__SelfOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5374:1: ( rule__SelfOperation__Group_4__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5375:2: rule__SelfOperation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group_4__1__Impl_in_rule__SelfOperation__Group_4__110772);
            rule__SelfOperation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group_4__1"


    // $ANTLR start "rule__SelfOperation__Group_4__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5381:1: rule__SelfOperation__Group_4__1__Impl : ( ( rule__SelfOperation__Group_4_1__0 )* ) ;
    public final void rule__SelfOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5385:1: ( ( ( rule__SelfOperation__Group_4_1__0 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5386:1: ( ( rule__SelfOperation__Group_4_1__0 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5386:1: ( ( rule__SelfOperation__Group_4_1__0 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5387:1: ( rule__SelfOperation__Group_4_1__0 )*
            {
             before(grammarAccess.getSelfOperationAccess().getGroup_4_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5388:1: ( rule__SelfOperation__Group_4_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==20) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5388:2: rule__SelfOperation__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SelfOperation__Group_4_1__0_in_rule__SelfOperation__Group_4__1__Impl10799);
            	    rule__SelfOperation__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSelfOperationAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group_4__1__Impl"


    // $ANTLR start "rule__SelfOperation__Group_4_1__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5402:1: rule__SelfOperation__Group_4_1__0 : rule__SelfOperation__Group_4_1__0__Impl rule__SelfOperation__Group_4_1__1 ;
    public final void rule__SelfOperation__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5406:1: ( rule__SelfOperation__Group_4_1__0__Impl rule__SelfOperation__Group_4_1__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5407:2: rule__SelfOperation__Group_4_1__0__Impl rule__SelfOperation__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group_4_1__0__Impl_in_rule__SelfOperation__Group_4_1__010834);
            rule__SelfOperation__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfOperation__Group_4_1__1_in_rule__SelfOperation__Group_4_1__010837);
            rule__SelfOperation__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group_4_1__0"


    // $ANTLR start "rule__SelfOperation__Group_4_1__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5414:1: rule__SelfOperation__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__SelfOperation__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5418:1: ( ( ',' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5419:1: ( ',' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5419:1: ( ',' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5420:1: ','
            {
             before(grammarAccess.getSelfOperationAccess().getCommaKeyword_4_1_0()); 
            match(input,20,FOLLOW_20_in_rule__SelfOperation__Group_4_1__0__Impl10865); 
             after(grammarAccess.getSelfOperationAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group_4_1__0__Impl"


    // $ANTLR start "rule__SelfOperation__Group_4_1__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5433:1: rule__SelfOperation__Group_4_1__1 : rule__SelfOperation__Group_4_1__1__Impl ;
    public final void rule__SelfOperation__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5437:1: ( rule__SelfOperation__Group_4_1__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5438:2: rule__SelfOperation__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SelfOperation__Group_4_1__1__Impl_in_rule__SelfOperation__Group_4_1__110896);
            rule__SelfOperation__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group_4_1__1"


    // $ANTLR start "rule__SelfOperation__Group_4_1__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5444:1: rule__SelfOperation__Group_4_1__1__Impl : ( ( rule__SelfOperation__ArgumentsAssignment_4_1_1 ) ) ;
    public final void rule__SelfOperation__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5448:1: ( ( ( rule__SelfOperation__ArgumentsAssignment_4_1_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5449:1: ( ( rule__SelfOperation__ArgumentsAssignment_4_1_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5449:1: ( ( rule__SelfOperation__ArgumentsAssignment_4_1_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5450:1: ( rule__SelfOperation__ArgumentsAssignment_4_1_1 )
            {
             before(grammarAccess.getSelfOperationAccess().getArgumentsAssignment_4_1_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5451:1: ( rule__SelfOperation__ArgumentsAssignment_4_1_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5451:2: rule__SelfOperation__ArgumentsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__SelfOperation__ArgumentsAssignment_4_1_1_in_rule__SelfOperation__Group_4_1__1__Impl10923);
            rule__SelfOperation__ArgumentsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelfOperationAccess().getArgumentsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__Group_4_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5465:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5469:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5470:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__010957);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__010960);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5477:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__NameAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5481:1: ( ( ( rule__Assignment__NameAssignment_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5482:1: ( ( rule__Assignment__NameAssignment_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5482:1: ( ( rule__Assignment__NameAssignment_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5483:1: ( rule__Assignment__NameAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5484:1: ( rule__Assignment__NameAssignment_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5484:2: rule__Assignment__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl10987);
            rule__Assignment__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5494:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5498:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5499:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__111017);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__111020);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5506:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5510:1: ( ( '=' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5511:1: ( '=' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5511:1: ( '=' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5512:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Assignment__Group__1__Impl11048); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5525:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5529:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5530:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__211079);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__211082);
            rule__Assignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5537:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5541:1: ( ( ( rule__Assignment__ExpAssignment_2 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5542:1: ( ( rule__Assignment__ExpAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5542:1: ( ( rule__Assignment__ExpAssignment_2 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5543:1: ( rule__Assignment__ExpAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getExpAssignment_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5544:1: ( rule__Assignment__ExpAssignment_2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5544:2: rule__Assignment__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ExpAssignment_2_in_rule__Assignment__Group__2__Impl11109);
            rule__Assignment__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5554:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5558:1: ( rule__Assignment__Group__3__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5559:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__311139);
            rule__Assignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5565:1: rule__Assignment__Group__3__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5569:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5570:1: ( ';' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5570:1: ( ';' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5571:1: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Assignment__Group__3__Impl11167); 
             after(grammarAccess.getAssignmentAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Value__Group_1__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5592:1: rule__Value__Group_1__0 : rule__Value__Group_1__0__Impl rule__Value__Group_1__1 ;
    public final void rule__Value__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5596:1: ( rule__Value__Group_1__0__Impl rule__Value__Group_1__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5597:2: rule__Value__Group_1__0__Impl rule__Value__Group_1__1
            {
            pushFollow(FOLLOW_rule__Value__Group_1__0__Impl_in_rule__Value__Group_1__011206);
            rule__Value__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group_1__1_in_rule__Value__Group_1__011209);
            rule__Value__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1__0"


    // $ANTLR start "rule__Value__Group_1__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5604:1: rule__Value__Group_1__0__Impl : ( '@' ) ;
    public final void rule__Value__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5608:1: ( ( '@' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5609:1: ( '@' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5609:1: ( '@' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5610:1: '@'
            {
             before(grammarAccess.getValueAccess().getCommercialAtKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Value__Group_1__0__Impl11237); 
             after(grammarAccess.getValueAccess().getCommercialAtKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1__0__Impl"


    // $ANTLR start "rule__Value__Group_1__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5623:1: rule__Value__Group_1__1 : rule__Value__Group_1__1__Impl ;
    public final void rule__Value__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5627:1: ( rule__Value__Group_1__1__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5628:2: rule__Value__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group_1__1__Impl_in_rule__Value__Group_1__111268);
            rule__Value__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1__1"


    // $ANTLR start "rule__Value__Group_1__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5634:1: rule__Value__Group_1__1__Impl : ( ( rule__Value__ExternAssignment_1_1 ) ) ;
    public final void rule__Value__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5638:1: ( ( ( rule__Value__ExternAssignment_1_1 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5639:1: ( ( rule__Value__ExternAssignment_1_1 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5639:1: ( ( rule__Value__ExternAssignment_1_1 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5640:1: ( rule__Value__ExternAssignment_1_1 )
            {
             before(grammarAccess.getValueAccess().getExternAssignment_1_1()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5641:1: ( rule__Value__ExternAssignment_1_1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5641:2: rule__Value__ExternAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Value__ExternAssignment_1_1_in_rule__Value__Group_1__1__Impl11295);
            rule__Value__ExternAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getExternAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1__1__Impl"


    // $ANTLR start "rule__Update__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5655:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5659:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5660:2: rule__Update__Group__0__Impl rule__Update__Group__1
            {
            pushFollow(FOLLOW_rule__Update__Group__0__Impl_in_rule__Update__Group__011329);
            rule__Update__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Update__Group__1_in_rule__Update__Group__011332);
            rule__Update__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__0"


    // $ANTLR start "rule__Update__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5667:1: rule__Update__Group__0__Impl : ( 'update' ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5671:1: ( ( 'update' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5672:1: ( 'update' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5672:1: ( 'update' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5673:1: 'update'
            {
             before(grammarAccess.getUpdateAccess().getUpdateKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Update__Group__0__Impl11360); 
             after(grammarAccess.getUpdateAccess().getUpdateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__0__Impl"


    // $ANTLR start "rule__Update__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5686:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5690:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5691:2: rule__Update__Group__1__Impl rule__Update__Group__2
            {
            pushFollow(FOLLOW_rule__Update__Group__1__Impl_in_rule__Update__Group__111391);
            rule__Update__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Update__Group__2_in_rule__Update__Group__111394);
            rule__Update__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__1"


    // $ANTLR start "rule__Update__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5698:1: rule__Update__Group__1__Impl : ( '{' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5702:1: ( ( '{' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5703:1: ( '{' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5703:1: ( '{' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5704:1: '{'
            {
             before(grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Update__Group__1__Impl11422); 
             after(grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__1__Impl"


    // $ANTLR start "rule__Update__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5717:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5721:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5722:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_rule__Update__Group__2__Impl_in_rule__Update__Group__211453);
            rule__Update__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Update__Group__3_in_rule__Update__Group__211456);
            rule__Update__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__2"


    // $ANTLR start "rule__Update__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5729:1: rule__Update__Group__2__Impl : ( ( rule__Update__BodyAssignment_2 ) ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5733:1: ( ( ( rule__Update__BodyAssignment_2 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5734:1: ( ( rule__Update__BodyAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5734:1: ( ( rule__Update__BodyAssignment_2 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5735:1: ( rule__Update__BodyAssignment_2 )
            {
             before(grammarAccess.getUpdateAccess().getBodyAssignment_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5736:1: ( rule__Update__BodyAssignment_2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5736:2: rule__Update__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__Update__BodyAssignment_2_in_rule__Update__Group__2__Impl11483);
            rule__Update__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__2__Impl"


    // $ANTLR start "rule__Update__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5746:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5750:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5751:2: rule__Update__Group__3__Impl rule__Update__Group__4
            {
            pushFollow(FOLLOW_rule__Update__Group__3__Impl_in_rule__Update__Group__311513);
            rule__Update__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Update__Group__4_in_rule__Update__Group__311516);
            rule__Update__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__3"


    // $ANTLR start "rule__Update__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5758:1: rule__Update__Group__3__Impl : ( ( rule__Update__BodyAssignment_3 )* ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5762:1: ( ( ( rule__Update__BodyAssignment_3 )* ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5763:1: ( ( rule__Update__BodyAssignment_3 )* )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5763:1: ( ( rule__Update__BodyAssignment_3 )* )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5764:1: ( rule__Update__BodyAssignment_3 )*
            {
             before(grammarAccess.getUpdateAccess().getBodyAssignment_3()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5765:1: ( rule__Update__BodyAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==31||LA34_0==33||LA34_0==35) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5765:2: rule__Update__BodyAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Update__BodyAssignment_3_in_rule__Update__Group__3__Impl11543);
            	    rule__Update__BodyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getUpdateAccess().getBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__3__Impl"


    // $ANTLR start "rule__Update__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5775:1: rule__Update__Group__4 : rule__Update__Group__4__Impl ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5779:1: ( rule__Update__Group__4__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5780:2: rule__Update__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Update__Group__4__Impl_in_rule__Update__Group__411574);
            rule__Update__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__4"


    // $ANTLR start "rule__Update__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5786:1: rule__Update__Group__4__Impl : ( '}' ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5790:1: ( ( '}' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5791:1: ( '}' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5791:1: ( '}' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5792:1: '}'
            {
             before(grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Update__Group__4__Impl11602); 
             after(grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__4__Impl"


    // $ANTLR start "rule__ConstantDefinition__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5815:1: rule__ConstantDefinition__Group__0 : rule__ConstantDefinition__Group__0__Impl rule__ConstantDefinition__Group__1 ;
    public final void rule__ConstantDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5819:1: ( rule__ConstantDefinition__Group__0__Impl rule__ConstantDefinition__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5820:2: rule__ConstantDefinition__Group__0__Impl rule__ConstantDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__Group__0__Impl_in_rule__ConstantDefinition__Group__011643);
            rule__ConstantDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__011646);
            rule__ConstantDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__0"


    // $ANTLR start "rule__ConstantDefinition__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5827:1: rule__ConstantDefinition__Group__0__Impl : ( ( rule__ConstantDefinition__AbstractAssignment_0 )? ) ;
    public final void rule__ConstantDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5831:1: ( ( ( rule__ConstantDefinition__AbstractAssignment_0 )? ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5832:1: ( ( rule__ConstantDefinition__AbstractAssignment_0 )? )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5832:1: ( ( rule__ConstantDefinition__AbstractAssignment_0 )? )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5833:1: ( rule__ConstantDefinition__AbstractAssignment_0 )?
            {
             before(grammarAccess.getConstantDefinitionAccess().getAbstractAssignment_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5834:1: ( rule__ConstantDefinition__AbstractAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5834:2: rule__ConstantDefinition__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ConstantDefinition__AbstractAssignment_0_in_rule__ConstantDefinition__Group__0__Impl11673);
                    rule__ConstantDefinition__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantDefinitionAccess().getAbstractAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__0__Impl"


    // $ANTLR start "rule__ConstantDefinition__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5844:1: rule__ConstantDefinition__Group__1 : rule__ConstantDefinition__Group__1__Impl rule__ConstantDefinition__Group__2 ;
    public final void rule__ConstantDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5848:1: ( rule__ConstantDefinition__Group__1__Impl rule__ConstantDefinition__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5849:2: rule__ConstantDefinition__Group__1__Impl rule__ConstantDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__Group__1__Impl_in_rule__ConstantDefinition__Group__111704);
            rule__ConstantDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantDefinition__Group__2_in_rule__ConstantDefinition__Group__111707);
            rule__ConstantDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__1"


    // $ANTLR start "rule__ConstantDefinition__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5856:1: rule__ConstantDefinition__Group__1__Impl : ( 'constant' ) ;
    public final void rule__ConstantDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5860:1: ( ( 'constant' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5861:1: ( 'constant' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5861:1: ( 'constant' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5862:1: 'constant'
            {
             before(grammarAccess.getConstantDefinitionAccess().getConstantKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__ConstantDefinition__Group__1__Impl11735); 
             after(grammarAccess.getConstantDefinitionAccess().getConstantKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__1__Impl"


    // $ANTLR start "rule__ConstantDefinition__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5875:1: rule__ConstantDefinition__Group__2 : rule__ConstantDefinition__Group__2__Impl rule__ConstantDefinition__Group__3 ;
    public final void rule__ConstantDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5879:1: ( rule__ConstantDefinition__Group__2__Impl rule__ConstantDefinition__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5880:2: rule__ConstantDefinition__Group__2__Impl rule__ConstantDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__Group__2__Impl_in_rule__ConstantDefinition__Group__211766);
            rule__ConstantDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantDefinition__Group__3_in_rule__ConstantDefinition__Group__211769);
            rule__ConstantDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__2"


    // $ANTLR start "rule__ConstantDefinition__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5887:1: rule__ConstantDefinition__Group__2__Impl : ( ( rule__ConstantDefinition__TypeAssignment_2 ) ) ;
    public final void rule__ConstantDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5891:1: ( ( ( rule__ConstantDefinition__TypeAssignment_2 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5892:1: ( ( rule__ConstantDefinition__TypeAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5892:1: ( ( rule__ConstantDefinition__TypeAssignment_2 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5893:1: ( rule__ConstantDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getConstantDefinitionAccess().getTypeAssignment_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5894:1: ( rule__ConstantDefinition__TypeAssignment_2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5894:2: rule__ConstantDefinition__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__TypeAssignment_2_in_rule__ConstantDefinition__Group__2__Impl11796);
            rule__ConstantDefinition__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstantDefinitionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__2__Impl"


    // $ANTLR start "rule__ConstantDefinition__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5904:1: rule__ConstantDefinition__Group__3 : rule__ConstantDefinition__Group__3__Impl rule__ConstantDefinition__Group__4 ;
    public final void rule__ConstantDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5908:1: ( rule__ConstantDefinition__Group__3__Impl rule__ConstantDefinition__Group__4 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5909:2: rule__ConstantDefinition__Group__3__Impl rule__ConstantDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__Group__3__Impl_in_rule__ConstantDefinition__Group__311826);
            rule__ConstantDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantDefinition__Group__4_in_rule__ConstantDefinition__Group__311829);
            rule__ConstantDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__3"


    // $ANTLR start "rule__ConstantDefinition__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5916:1: rule__ConstantDefinition__Group__3__Impl : ( ( rule__ConstantDefinition__NameAssignment_3 ) ) ;
    public final void rule__ConstantDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5920:1: ( ( ( rule__ConstantDefinition__NameAssignment_3 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5921:1: ( ( rule__ConstantDefinition__NameAssignment_3 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5921:1: ( ( rule__ConstantDefinition__NameAssignment_3 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5922:1: ( rule__ConstantDefinition__NameAssignment_3 )
            {
             before(grammarAccess.getConstantDefinitionAccess().getNameAssignment_3()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5923:1: ( rule__ConstantDefinition__NameAssignment_3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5923:2: rule__ConstantDefinition__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__NameAssignment_3_in_rule__ConstantDefinition__Group__3__Impl11856);
            rule__ConstantDefinition__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstantDefinitionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__3__Impl"


    // $ANTLR start "rule__ConstantDefinition__Group__4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5933:1: rule__ConstantDefinition__Group__4 : rule__ConstantDefinition__Group__4__Impl ;
    public final void rule__ConstantDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5937:1: ( rule__ConstantDefinition__Group__4__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5938:2: rule__ConstantDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__Group__4__Impl_in_rule__ConstantDefinition__Group__411886);
            rule__ConstantDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__4"


    // $ANTLR start "rule__ConstantDefinition__Group__4__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5944:1: rule__ConstantDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__ConstantDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5948:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5949:1: ( ';' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5949:1: ( ';' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5950:1: ';'
            {
             before(grammarAccess.getConstantDefinitionAccess().getSemicolonKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__ConstantDefinition__Group__4__Impl11914); 
             after(grammarAccess.getConstantDefinitionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__Group__4__Impl"


    // $ANTLR start "rule__ConstantAssignment__Group__0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5973:1: rule__ConstantAssignment__Group__0 : rule__ConstantAssignment__Group__0__Impl rule__ConstantAssignment__Group__1 ;
    public final void rule__ConstantAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5977:1: ( rule__ConstantAssignment__Group__0__Impl rule__ConstantAssignment__Group__1 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5978:2: rule__ConstantAssignment__Group__0__Impl rule__ConstantAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__ConstantAssignment__Group__0__Impl_in_rule__ConstantAssignment__Group__011955);
            rule__ConstantAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantAssignment__Group__1_in_rule__ConstantAssignment__Group__011958);
            rule__ConstantAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantAssignment__Group__0"


    // $ANTLR start "rule__ConstantAssignment__Group__0__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5985:1: rule__ConstantAssignment__Group__0__Impl : ( ( rule__ConstantAssignment__LhsAssignment_0 ) ) ;
    public final void rule__ConstantAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5989:1: ( ( ( rule__ConstantAssignment__LhsAssignment_0 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5990:1: ( ( rule__ConstantAssignment__LhsAssignment_0 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5990:1: ( ( rule__ConstantAssignment__LhsAssignment_0 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5991:1: ( rule__ConstantAssignment__LhsAssignment_0 )
            {
             before(grammarAccess.getConstantAssignmentAccess().getLhsAssignment_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5992:1: ( rule__ConstantAssignment__LhsAssignment_0 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:5992:2: rule__ConstantAssignment__LhsAssignment_0
            {
            pushFollow(FOLLOW_rule__ConstantAssignment__LhsAssignment_0_in_rule__ConstantAssignment__Group__0__Impl11985);
            rule__ConstantAssignment__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAssignmentAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantAssignment__Group__0__Impl"


    // $ANTLR start "rule__ConstantAssignment__Group__1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6002:1: rule__ConstantAssignment__Group__1 : rule__ConstantAssignment__Group__1__Impl rule__ConstantAssignment__Group__2 ;
    public final void rule__ConstantAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6006:1: ( rule__ConstantAssignment__Group__1__Impl rule__ConstantAssignment__Group__2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6007:2: rule__ConstantAssignment__Group__1__Impl rule__ConstantAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__ConstantAssignment__Group__1__Impl_in_rule__ConstantAssignment__Group__112015);
            rule__ConstantAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantAssignment__Group__2_in_rule__ConstantAssignment__Group__112018);
            rule__ConstantAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantAssignment__Group__1"


    // $ANTLR start "rule__ConstantAssignment__Group__1__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6014:1: rule__ConstantAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__ConstantAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6018:1: ( ( '=' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6019:1: ( '=' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6019:1: ( '=' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6020:1: '='
            {
             before(grammarAccess.getConstantAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ConstantAssignment__Group__1__Impl12046); 
             after(grammarAccess.getConstantAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantAssignment__Group__1__Impl"


    // $ANTLR start "rule__ConstantAssignment__Group__2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6033:1: rule__ConstantAssignment__Group__2 : rule__ConstantAssignment__Group__2__Impl rule__ConstantAssignment__Group__3 ;
    public final void rule__ConstantAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6037:1: ( rule__ConstantAssignment__Group__2__Impl rule__ConstantAssignment__Group__3 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6038:2: rule__ConstantAssignment__Group__2__Impl rule__ConstantAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__ConstantAssignment__Group__2__Impl_in_rule__ConstantAssignment__Group__212077);
            rule__ConstantAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantAssignment__Group__3_in_rule__ConstantAssignment__Group__212080);
            rule__ConstantAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantAssignment__Group__2"


    // $ANTLR start "rule__ConstantAssignment__Group__2__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6045:1: rule__ConstantAssignment__Group__2__Impl : ( ( rule__ConstantAssignment__RhsAssignment_2 ) ) ;
    public final void rule__ConstantAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6049:1: ( ( ( rule__ConstantAssignment__RhsAssignment_2 ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6050:1: ( ( rule__ConstantAssignment__RhsAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6050:1: ( ( rule__ConstantAssignment__RhsAssignment_2 ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6051:1: ( rule__ConstantAssignment__RhsAssignment_2 )
            {
             before(grammarAccess.getConstantAssignmentAccess().getRhsAssignment_2()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6052:1: ( rule__ConstantAssignment__RhsAssignment_2 )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6052:2: rule__ConstantAssignment__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__ConstantAssignment__RhsAssignment_2_in_rule__ConstantAssignment__Group__2__Impl12107);
            rule__ConstantAssignment__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstantAssignmentAccess().getRhsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantAssignment__Group__2__Impl"


    // $ANTLR start "rule__ConstantAssignment__Group__3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6062:1: rule__ConstantAssignment__Group__3 : rule__ConstantAssignment__Group__3__Impl ;
    public final void rule__ConstantAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6066:1: ( rule__ConstantAssignment__Group__3__Impl )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6067:2: rule__ConstantAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ConstantAssignment__Group__3__Impl_in_rule__ConstantAssignment__Group__312137);
            rule__ConstantAssignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantAssignment__Group__3"


    // $ANTLR start "rule__ConstantAssignment__Group__3__Impl"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6073:1: rule__ConstantAssignment__Group__3__Impl : ( ';' ) ;
    public final void rule__ConstantAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6077:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6078:1: ( ';' )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6078:1: ( ';' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6079:1: ';'
            {
             before(grammarAccess.getConstantAssignmentAccess().getSemicolonKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ConstantAssignment__Group__3__Impl12165); 
             after(grammarAccess.getConstantAssignmentAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantAssignment__Group__3__Impl"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6101:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6105:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6106:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6106:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6107:1: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Program__NameAssignment_112209); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_1"


    // $ANTLR start "rule__Program__ElementsAssignment_3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6116:1: rule__Program__ElementsAssignment_3 : ( ruleProgramElement ) ;
    public final void rule__Program__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6120:1: ( ( ruleProgramElement ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6121:1: ( ruleProgramElement )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6121:1: ( ruleProgramElement )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6122:1: ruleProgramElement
            {
             before(grammarAccess.getProgramAccess().getElementsProgramElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProgramElement_in_rule__Program__ElementsAssignment_312240);
            ruleProgramElement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getElementsProgramElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ElementsAssignment_3"


    // $ANTLR start "rule__ExternalName__NameAssignment_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6131:1: rule__ExternalName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6135:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6136:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6136:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6137:1: RULE_ID
            {
             before(grammarAccess.getExternalNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalName__NameAssignment_112271); 
             after(grammarAccess.getExternalNameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalName__NameAssignment_1"


    // $ANTLR start "rule__TypeDef__NameAssignment_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6146:1: rule__TypeDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6150:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6151:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6151:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6152:1: RULE_ID
            {
             before(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDef__NameAssignment_112302); 
             after(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__NameAssignment_1"


    // $ANTLR start "rule__EnumDef__NameAssignment_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6161:1: rule__EnumDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6165:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6166:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6166:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6167:1: RULE_ID
            {
             before(grammarAccess.getEnumDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDef__NameAssignment_112333); 
             after(grammarAccess.getEnumDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__NameAssignment_1"


    // $ANTLR start "rule__EnumDef__NamesAssignment_3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6176:1: rule__EnumDef__NamesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumDef__NamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6180:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6181:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6181:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6182:1: RULE_ID
            {
             before(grammarAccess.getEnumDefAccess().getNamesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDef__NamesAssignment_312364); 
             after(grammarAccess.getEnumDefAccess().getNamesIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__NamesAssignment_3"


    // $ANTLR start "rule__EnumDef__NamesAssignment_4_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6191:1: rule__EnumDef__NamesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumDef__NamesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6195:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6196:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6196:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6197:1: RULE_ID
            {
             before(grammarAccess.getEnumDefAccess().getNamesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDef__NamesAssignment_4_112395); 
             after(grammarAccess.getEnumDefAccess().getNamesIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDef__NamesAssignment_4_1"


    // $ANTLR start "rule__Ensemble__NameAssignment_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6206:1: rule__Ensemble__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ensemble__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6210:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6211:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6211:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6212:1: RULE_ID
            {
             before(grammarAccess.getEnsembleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ensemble__NameAssignment_112426); 
             after(grammarAccess.getEnsembleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__NameAssignment_1"


    // $ANTLR start "rule__Ensemble__ElementsAssignment_3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6221:1: rule__Ensemble__ElementsAssignment_3 : ( ruleMember ) ;
    public final void rule__Ensemble__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6225:1: ( ( ruleMember ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6226:1: ( ruleMember )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6226:1: ( ruleMember )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6227:1: ruleMember
            {
             before(grammarAccess.getEnsembleAccess().getElementsMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__Ensemble__ElementsAssignment_312457);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getEnsembleAccess().getElementsMemberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__ElementsAssignment_3"


    // $ANTLR start "rule__Role__AbstractAssignment_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6236:1: rule__Role__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Role__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6240:1: ( ( ( 'abstract' ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6241:1: ( ( 'abstract' ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6241:1: ( ( 'abstract' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6242:1: ( 'abstract' )
            {
             before(grammarAccess.getRoleAccess().getAbstractAbstractKeyword_0_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6243:1: ( 'abstract' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6244:1: 'abstract'
            {
             before(grammarAccess.getRoleAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Role__AbstractAssignment_012493); 
             after(grammarAccess.getRoleAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getRoleAccess().getAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__AbstractAssignment_0"


    // $ANTLR start "rule__Role__MixinAssignment_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6259:1: rule__Role__MixinAssignment_1 : ( ( 'mixin' ) ) ;
    public final void rule__Role__MixinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6263:1: ( ( ( 'mixin' ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6264:1: ( ( 'mixin' ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6264:1: ( ( 'mixin' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6265:1: ( 'mixin' )
            {
             before(grammarAccess.getRoleAccess().getMixinMixinKeyword_1_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6266:1: ( 'mixin' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6267:1: 'mixin'
            {
             before(grammarAccess.getRoleAccess().getMixinMixinKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Role__MixinAssignment_112537); 
             after(grammarAccess.getRoleAccess().getMixinMixinKeyword_1_0()); 

            }

             after(grammarAccess.getRoleAccess().getMixinMixinKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__MixinAssignment_1"


    // $ANTLR start "rule__Role__NameAssignment_3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6282:1: rule__Role__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6286:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6287:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6287:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6288:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_312576); 
             after(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_3"


    // $ANTLR start "rule__Role__ExtendsRoleAssignment_4_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6297:1: rule__Role__ExtendsRoleAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Role__ExtendsRoleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6301:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6302:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6302:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6303:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getExtendsRoleIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__ExtendsRoleAssignment_4_112607); 
             after(grammarAccess.getRoleAccess().getExtendsRoleIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__ExtendsRoleAssignment_4_1"


    // $ANTLR start "rule__Role__WithinEnsembleAssignment_5_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6312:1: rule__Role__WithinEnsembleAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Role__WithinEnsembleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6316:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6317:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6317:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6318:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getWithinEnsembleIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__WithinEnsembleAssignment_5_112638); 
             after(grammarAccess.getRoleAccess().getWithinEnsembleIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__WithinEnsembleAssignment_5_1"


    // $ANTLR start "rule__Role__ElementsAssignment_7"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6327:1: rule__Role__ElementsAssignment_7 : ( ruleMember ) ;
    public final void rule__Role__ElementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6331:1: ( ( ruleMember ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6332:1: ( ruleMember )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6332:1: ( ruleMember )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6333:1: ruleMember
            {
             before(grammarAccess.getRoleAccess().getElementsMemberParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__Role__ElementsAssignment_712669);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getElementsMemberParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__ElementsAssignment_7"


    // $ANTLR start "rule__Field__TypeAssignment_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6342:1: rule__Field__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Field__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6346:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6347:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6347:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6348:1: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getTypeLocalTypeCrossReference_0_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6349:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6350:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getTypeLocalTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__TypeAssignment_012704); 
             after(grammarAccess.getFieldAccess().getTypeLocalTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getTypeLocalTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_0"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6361:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6365:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6366:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6366:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6367:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_112739); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__InitialAssignment_2_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6376:1: rule__Field__InitialAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Field__InitialAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6380:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6381:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6381:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6382:1: ruleExpr
            {
             before(grammarAccess.getFieldAccess().getInitialExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Field__InitialAssignment_2_112770);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getInitialExprParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__InitialAssignment_2_1"


    // $ANTLR start "rule__Require__ExpAssignment_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6391:1: rule__Require__ExpAssignment_1 : ( ruleExpr ) ;
    public final void rule__Require__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6395:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6396:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6396:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6397:1: ruleExpr
            {
             before(grammarAccess.getRequireAccess().getExpExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Require__ExpAssignment_112801);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getRequireAccess().getExpExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__ExpAssignment_1"


    // $ANTLR start "rule__Behavior__QualifierAssignment_1_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6406:1: rule__Behavior__QualifierAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Behavior__QualifierAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6410:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6411:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6411:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6412:1: ( RULE_ID )
            {
             before(grammarAccess.getBehaviorAccess().getQualifierScopeDefiningElementCrossReference_1_0_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6413:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6414:1: RULE_ID
            {
             before(grammarAccess.getBehaviorAccess().getQualifierScopeDefiningElementIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Behavior__QualifierAssignment_1_012836); 
             after(grammarAccess.getBehaviorAccess().getQualifierScopeDefiningElementIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getBehaviorAccess().getQualifierScopeDefiningElementCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__QualifierAssignment_1_0"


    // $ANTLR start "rule__Behavior__NameAssignment_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6425:1: rule__Behavior__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Behavior__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6429:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6430:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6430:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6431:1: RULE_ID
            {
             before(grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Behavior__NameAssignment_212871); 
             after(grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__NameAssignment_2"


    // $ANTLR start "rule__Behavior__ParamsAssignment_4_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6440:1: rule__Behavior__ParamsAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__Behavior__ParamsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6444:1: ( ( ruleParameter ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6445:1: ( ruleParameter )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6445:1: ( ruleParameter )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6446:1: ruleParameter
            {
             before(grammarAccess.getBehaviorAccess().getParamsParameterParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Behavior__ParamsAssignment_4_012902);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getParamsParameterParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__ParamsAssignment_4_0"


    // $ANTLR start "rule__Behavior__ParamsAssignment_4_1_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6455:1: rule__Behavior__ParamsAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__Behavior__ParamsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6459:1: ( ( ruleParameter ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6460:1: ( ruleParameter )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6460:1: ( ruleParameter )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6461:1: ruleParameter
            {
             before(grammarAccess.getBehaviorAccess().getParamsParameterParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Behavior__ParamsAssignment_4_1_112933);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getParamsParameterParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__ParamsAssignment_4_1_1"


    // $ANTLR start "rule__Behavior__BodyAssignment_7"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6470:1: rule__Behavior__BodyAssignment_7 : ( ruleStatement ) ;
    public final void rule__Behavior__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6474:1: ( ( ruleStatement ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6475:1: ( ruleStatement )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6475:1: ( ruleStatement )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6476:1: ruleStatement
            {
             before(grammarAccess.getBehaviorAccess().getBodyStatementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Behavior__BodyAssignment_712964);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getBodyStatementParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__BodyAssignment_7"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6485:1: rule__Parameter__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6489:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6490:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6490:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6491:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getTypeLocalTypeCrossReference_0_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6492:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6493:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getTypeLocalTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_012999); 
             after(grammarAccess.getParameterAccess().getTypeLocalTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeLocalTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6504:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6508:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6509:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6509:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6510:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_113034); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Method__TypeAssignment_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6519:1: rule__Method__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Method__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6523:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6524:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6524:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6525:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getTypeLocalTypeCrossReference_0_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6526:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6527:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getTypeLocalTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__TypeAssignment_013069); 
             after(grammarAccess.getMethodAccess().getTypeLocalTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getTypeLocalTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypeAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6538:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6542:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6543:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6543:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6544:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_113104); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ParamsAssignment_3_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6553:1: rule__Method__ParamsAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6557:1: ( ( ruleParameter ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6558:1: ( ruleParameter )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6558:1: ( ruleParameter )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6559:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParamsAssignment_3_013135);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParamsAssignment_3_0"


    // $ANTLR start "rule__Method__ParamsAssignment_3_1_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6568:1: rule__Method__ParamsAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6572:1: ( ( ruleParameter ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6573:1: ( ruleParameter )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6573:1: ( ruleParameter )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6574:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParamsAssignment_3_1_113166);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParamsAssignment_3_1_1"


    // $ANTLR start "rule__Method__BodyAssignment_6"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6583:1: rule__Method__BodyAssignment_6 : ( ruleStatement ) ;
    public final void rule__Method__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6587:1: ( ( ruleStatement ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6588:1: ( ruleStatement )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6588:1: ( ruleStatement )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6589:1: ruleStatement
            {
             before(grammarAccess.getMethodAccess().getBodyStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Method__BodyAssignment_613197);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getBodyStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__BodyAssignment_6"


    // $ANTLR start "rule__LocalVariable__NameAssignment"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6598:1: rule__LocalVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__LocalVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6602:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6603:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6603:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6604:1: RULE_ID
            {
             before(grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalVariable__NameAssignment13228); 
             after(grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariable__NameAssignment"


    // $ANTLR start "rule__QualifiedName__QualifierAssignment_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6613:1: rule__QualifiedName__QualifierAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__QualifiedName__QualifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6617:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6618:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6618:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6619:1: ( RULE_ID )
            {
             before(grammarAccess.getQualifiedNameAccess().getQualifierScopeDefiningElementCrossReference_0_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6620:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6621:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getQualifierScopeDefiningElementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__QualifierAssignment_013263); 
             after(grammarAccess.getQualifiedNameAccess().getQualifierScopeDefiningElementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getQualifiedNameAccess().getQualifierScopeDefiningElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__QualifierAssignment_0"


    // $ANTLR start "rule__QualifiedName__NameAssignment_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6632:1: rule__QualifiedName__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__QualifiedName__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6636:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6637:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6637:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6638:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__NameAssignment_213298); 
             after(grammarAccess.getQualifiedNameAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__NameAssignment_2"


    // $ANTLR start "rule__BinaryExpr__LhsAssignment_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6647:1: rule__BinaryExpr__LhsAssignment_1 : ( ruleExpr ) ;
    public final void rule__BinaryExpr__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6651:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6652:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6652:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6653:1: ruleExpr
            {
             before(grammarAccess.getBinaryExprAccess().getLhsExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__BinaryExpr__LhsAssignment_113329);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getBinaryExprAccess().getLhsExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__LhsAssignment_1"


    // $ANTLR start "rule__BinaryExpr__OpAssignment_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6662:1: rule__BinaryExpr__OpAssignment_2 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryExpr__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6666:1: ( ( ruleBinaryOperator ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6667:1: ( ruleBinaryOperator )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6667:1: ( ruleBinaryOperator )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6668:1: ruleBinaryOperator
            {
             before(grammarAccess.getBinaryExprAccess().getOpBinaryOperatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBinaryOperator_in_rule__BinaryExpr__OpAssignment_213360);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryExprAccess().getOpBinaryOperatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__OpAssignment_2"


    // $ANTLR start "rule__BinaryExpr__RhsAssignment_3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6677:1: rule__BinaryExpr__RhsAssignment_3 : ( ruleExpr ) ;
    public final void rule__BinaryExpr__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6681:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6682:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6682:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6683:1: ruleExpr
            {
             before(grammarAccess.getBinaryExprAccess().getRhsExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__BinaryExpr__RhsAssignment_313391);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getBinaryExprAccess().getRhsExprParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpr__RhsAssignment_3"


    // $ANTLR start "rule__FunctionCall__NameAssignment_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6692:1: rule__FunctionCall__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6696:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6697:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6697:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6698:1: RULE_ID
            {
             before(grammarAccess.getFunctionCallAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionCall__NameAssignment_013422); 
             after(grammarAccess.getFunctionCallAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__NameAssignment_0"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_2_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6707:1: rule__FunctionCall__ArgumentsAssignment_2_0 : ( ruleExpr ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6711:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6712:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6712:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6713:1: ruleExpr
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsExprParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__FunctionCall__ArgumentsAssignment_2_013453);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsExprParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_2_0"


    // $ANTLR start "rule__FunctionCall__ArgumentsAssignment_2_1_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6722:1: rule__FunctionCall__ArgumentsAssignment_2_1_1 : ( ruleExpr ) ;
    public final void rule__FunctionCall__ArgumentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6726:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6727:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6727:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6728:1: ruleExpr
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentsExprParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__FunctionCall__ArgumentsAssignment_2_1_113484);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getArgumentsExprParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ArgumentsAssignment_2_1_1"


    // $ANTLR start "rule__ForLoop__VariableAssignment_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6737:1: rule__ForLoop__VariableAssignment_2 : ( RULE_ID ) ;
    public final void rule__ForLoop__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6741:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6742:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6742:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6743:1: RULE_ID
            {
             before(grammarAccess.getForLoopAccess().getVariableIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForLoop__VariableAssignment_213515); 
             after(grammarAccess.getForLoopAccess().getVariableIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__VariableAssignment_2"


    // $ANTLR start "rule__ForLoop__QualifierAssignment_4"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6752:1: rule__ForLoop__QualifierAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForLoop__QualifierAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6756:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6757:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6757:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6758:1: ( RULE_ID )
            {
             before(grammarAccess.getForLoopAccess().getQualifierScopeDefiningElementCrossReference_4_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6759:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6760:1: RULE_ID
            {
             before(grammarAccess.getForLoopAccess().getQualifierScopeDefiningElementIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForLoop__QualifierAssignment_413550); 
             after(grammarAccess.getForLoopAccess().getQualifierScopeDefiningElementIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getForLoopAccess().getQualifierScopeDefiningElementCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__QualifierAssignment_4"


    // $ANTLR start "rule__ForLoop__SharedAssignment_6"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6771:1: rule__ForLoop__SharedAssignment_6 : ( RULE_ID ) ;
    public final void rule__ForLoop__SharedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6775:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6776:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6776:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6777:1: RULE_ID
            {
             before(grammarAccess.getForLoopAccess().getSharedIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForLoop__SharedAssignment_613585); 
             after(grammarAccess.getForLoopAccess().getSharedIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__SharedAssignment_6"


    // $ANTLR start "rule__ForLoop__BodyAssignment_9"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6786:1: rule__ForLoop__BodyAssignment_9 : ( ruleStatement ) ;
    public final void rule__ForLoop__BodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6790:1: ( ( ruleStatement ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6791:1: ( ruleStatement )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6791:1: ( ruleStatement )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6792:1: ruleStatement
            {
             before(grammarAccess.getForLoopAccess().getBodyStatementParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__ForLoop__BodyAssignment_913616);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getBodyStatementParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__BodyAssignment_9"


    // $ANTLR start "rule__Conditional__ConditionAssignment_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6801:1: rule__Conditional__ConditionAssignment_2 : ( ruleExpr ) ;
    public final void rule__Conditional__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6805:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6806:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6806:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6807:1: ruleExpr
            {
             before(grammarAccess.getConditionalAccess().getConditionExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Conditional__ConditionAssignment_213647);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getConditionExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ConditionAssignment_2"


    // $ANTLR start "rule__Conditional__ThenBranchAssignment_5"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6816:1: rule__Conditional__ThenBranchAssignment_5 : ( ruleStatement ) ;
    public final void rule__Conditional__ThenBranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6820:1: ( ( ruleStatement ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6821:1: ( ruleStatement )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6821:1: ( ruleStatement )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6822:1: ruleStatement
            {
             before(grammarAccess.getConditionalAccess().getThenBranchStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Conditional__ThenBranchAssignment_513678);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getThenBranchStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ThenBranchAssignment_5"


    // $ANTLR start "rule__Conditional__ElseBranchAssignment_7_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6831:1: rule__Conditional__ElseBranchAssignment_7_2 : ( ruleStatement ) ;
    public final void rule__Conditional__ElseBranchAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6835:1: ( ( ruleStatement ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6836:1: ( ruleStatement )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6836:1: ( ruleStatement )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6837:1: ruleStatement
            {
             before(grammarAccess.getConditionalAccess().getElseBranchStatementParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Conditional__ElseBranchAssignment_7_213709);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getElseBranchStatementParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ElseBranchAssignment_7_2"


    // $ANTLR start "rule__Operation__QualifierAssignment_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6846:1: rule__Operation__QualifierAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__QualifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6850:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6851:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6851:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6852:1: ( RULE_ID )
            {
             before(grammarAccess.getOperationAccess().getQualifierScopeDefiningElementCrossReference_0_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6853:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6854:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getQualifierScopeDefiningElementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__QualifierAssignment_013744); 
             after(grammarAccess.getOperationAccess().getQualifierScopeDefiningElementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getQualifierScopeDefiningElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__QualifierAssignment_0"


    // $ANTLR start "rule__Operation__NameAssignment_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6865:1: rule__Operation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6869:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6870:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6870:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6871:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_213779); 
             after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_2"


    // $ANTLR start "rule__Operation__ArgumentsAssignment_4_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6880:1: rule__Operation__ArgumentsAssignment_4_0 : ( ruleExpr ) ;
    public final void rule__Operation__ArgumentsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6884:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6885:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6885:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6886:1: ruleExpr
            {
             before(grammarAccess.getOperationAccess().getArgumentsExprParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Operation__ArgumentsAssignment_4_013810);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getArgumentsExprParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ArgumentsAssignment_4_0"


    // $ANTLR start "rule__Operation__ArgumentsAssignment_4_1_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6895:1: rule__Operation__ArgumentsAssignment_4_1_1 : ( ruleExpr ) ;
    public final void rule__Operation__ArgumentsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6899:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6900:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6900:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6901:1: ruleExpr
            {
             before(grammarAccess.getOperationAccess().getArgumentsExprParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Operation__ArgumentsAssignment_4_1_113841);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getArgumentsExprParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ArgumentsAssignment_4_1_1"


    // $ANTLR start "rule__SelfOperation__NameAssignment_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6910:1: rule__SelfOperation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SelfOperation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6914:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6915:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6915:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6916:1: RULE_ID
            {
             before(grammarAccess.getSelfOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SelfOperation__NameAssignment_213872); 
             after(grammarAccess.getSelfOperationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__NameAssignment_2"


    // $ANTLR start "rule__SelfOperation__ArgumentsAssignment_4_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6925:1: rule__SelfOperation__ArgumentsAssignment_4_0 : ( ruleExpr ) ;
    public final void rule__SelfOperation__ArgumentsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6929:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6930:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6930:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6931:1: ruleExpr
            {
             before(grammarAccess.getSelfOperationAccess().getArgumentsExprParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__SelfOperation__ArgumentsAssignment_4_013903);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getSelfOperationAccess().getArgumentsExprParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__ArgumentsAssignment_4_0"


    // $ANTLR start "rule__SelfOperation__ArgumentsAssignment_4_1_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6940:1: rule__SelfOperation__ArgumentsAssignment_4_1_1 : ( ruleExpr ) ;
    public final void rule__SelfOperation__ArgumentsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6944:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6945:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6945:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6946:1: ruleExpr
            {
             before(grammarAccess.getSelfOperationAccess().getArgumentsExprParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__SelfOperation__ArgumentsAssignment_4_1_113934);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getSelfOperationAccess().getArgumentsExprParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfOperation__ArgumentsAssignment_4_1_1"


    // $ANTLR start "rule__Assignment__NameAssignment_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6955:1: rule__Assignment__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6959:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6960:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6960:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6961:1: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__NameAssignment_013965); 
             after(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__NameAssignment_0"


    // $ANTLR start "rule__Assignment__ExpAssignment_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6970:1: rule__Assignment__ExpAssignment_2 : ( ruleExpr ) ;
    public final void rule__Assignment__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6974:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6975:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6975:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6976:1: ruleExpr
            {
             before(grammarAccess.getAssignmentAccess().getExpExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Assignment__ExpAssignment_213996);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getExpExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ExpAssignment_2"


    // $ANTLR start "rule__Value__ValueAssignment_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6985:1: rule__Value__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Value__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6989:1: ( ( RULE_INT ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6990:1: ( RULE_INT )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6990:1: ( RULE_INT )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:6991:1: RULE_INT
            {
             before(grammarAccess.getValueAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Value__ValueAssignment_014027); 
             after(grammarAccess.getValueAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAssignment_0"


    // $ANTLR start "rule__Value__ExternAssignment_1_1"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7000:1: rule__Value__ExternAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Value__ExternAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7004:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7005:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7005:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7006:1: ( RULE_ID )
            {
             before(grammarAccess.getValueAccess().getExternExternalNameCrossReference_1_1_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7007:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7008:1: RULE_ID
            {
             before(grammarAccess.getValueAccess().getExternExternalNameIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Value__ExternAssignment_1_114062); 
             after(grammarAccess.getValueAccess().getExternExternalNameIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getValueAccess().getExternExternalNameCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ExternAssignment_1_1"


    // $ANTLR start "rule__Update__BodyAssignment_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7019:1: rule__Update__BodyAssignment_2 : ( ruleStatement ) ;
    public final void rule__Update__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7023:1: ( ( ruleStatement ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7024:1: ( ruleStatement )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7024:1: ( ruleStatement )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7025:1: ruleStatement
            {
             before(grammarAccess.getUpdateAccess().getBodyStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Update__BodyAssignment_214097);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getBodyStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__BodyAssignment_2"


    // $ANTLR start "rule__Update__BodyAssignment_3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7034:1: rule__Update__BodyAssignment_3 : ( ruleStatement ) ;
    public final void rule__Update__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7038:1: ( ( ruleStatement ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7039:1: ( ruleStatement )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7039:1: ( ruleStatement )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7040:1: ruleStatement
            {
             before(grammarAccess.getUpdateAccess().getBodyStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Update__BodyAssignment_314128);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getBodyStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__BodyAssignment_3"


    // $ANTLR start "rule__ConstantDefinition__AbstractAssignment_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7049:1: rule__ConstantDefinition__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ConstantDefinition__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7053:1: ( ( ( 'abstract' ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7054:1: ( ( 'abstract' ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7054:1: ( ( 'abstract' ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7055:1: ( 'abstract' )
            {
             before(grammarAccess.getConstantDefinitionAccess().getAbstractAbstractKeyword_0_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7056:1: ( 'abstract' )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7057:1: 'abstract'
            {
             before(grammarAccess.getConstantDefinitionAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__ConstantDefinition__AbstractAssignment_014164); 
             after(grammarAccess.getConstantDefinitionAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getConstantDefinitionAccess().getAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__AbstractAssignment_0"


    // $ANTLR start "rule__ConstantDefinition__TypeAssignment_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7072:1: rule__ConstantDefinition__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ConstantDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7076:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7077:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7077:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7078:1: ( RULE_ID )
            {
             before(grammarAccess.getConstantDefinitionAccess().getTypeLocalTypeCrossReference_2_0()); 
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7079:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7080:1: RULE_ID
            {
             before(grammarAccess.getConstantDefinitionAccess().getTypeLocalTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantDefinition__TypeAssignment_214207); 
             after(grammarAccess.getConstantDefinitionAccess().getTypeLocalTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConstantDefinitionAccess().getTypeLocalTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__TypeAssignment_2"


    // $ANTLR start "rule__ConstantDefinition__NameAssignment_3"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7091:1: rule__ConstantDefinition__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ConstantDefinition__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7095:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7096:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7096:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7097:1: RULE_ID
            {
             before(grammarAccess.getConstantDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantDefinition__NameAssignment_314242); 
             after(grammarAccess.getConstantDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinition__NameAssignment_3"


    // $ANTLR start "rule__ConstantAssignment__LhsAssignment_0"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7106:1: rule__ConstantAssignment__LhsAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConstantAssignment__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7110:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7111:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7111:1: ( RULE_ID )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7112:1: RULE_ID
            {
             before(grammarAccess.getConstantAssignmentAccess().getLhsIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantAssignment__LhsAssignment_014273); 
             after(grammarAccess.getConstantAssignmentAccess().getLhsIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantAssignment__LhsAssignment_0"


    // $ANTLR start "rule__ConstantAssignment__RhsAssignment_2"
    // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7121:1: rule__ConstantAssignment__RhsAssignment_2 : ( ruleExpr ) ;
    public final void rule__ConstantAssignment__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7125:1: ( ( ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7126:1: ( ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7126:1: ( ruleExpr )
            // ../dk.sdu.mmmi.modular.roco.ui/src-gen/dk/sdu/mmmi/modular/ui/contentassist/antlr/internal/InternalRobustCollaboration.g:7127:1: ruleExpr
            {
             before(grammarAccess.getConstantAssignmentAccess().getRhsExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__ConstantAssignment__RhsAssignment_214304);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getConstantAssignmentAccess().getRhsExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantAssignment__RhsAssignment_2"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\2\4\4\uffff\1\16\3\uffff";
    static final String DFA4_maxS =
        "\1\47\1\31\4\uffff\1\34\3\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\3\1\5\1\6\1\uffff\1\7\1\4\1\1";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\25\uffff\1\2\1\3\11\uffff\1\4\2\5",
            "\1\6\24\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\11\12\uffff\1\11\2\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1000:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleRequire ) | ( ruleBehavior ) | ( ruleMethod ) | ( ruleUpdate ) | ( ruleConstantDefinition ) | ( ruleConstantAssignment ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramElement_in_entryRuleProgramElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgramElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProgramElement__Alternatives_in_ruleProgramElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalName_in_entryRuleExternalName181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalName188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalName__Group__0_in_ruleExternalName214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalType_in_entryRuleLocalType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalType__Alternatives_in_ruleLocalType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeDefiningElement_in_entryRuleScopeDefiningElement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopeDefiningElement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeDefiningElement__Alternatives_in_ruleScopeDefiningElement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__0_in_ruleTypeDef394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDef_in_entryRuleEnumDef421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDef428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__0_in_ruleEnumDef454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnsemble_in_entryRuleEnsemble481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnsemble488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ensemble__Group__0_in_ruleEnsemble514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Alternatives_in_ruleMember634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequire_in_entryRuleRequire721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequire728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Require__Group__0_in_ruleRequire754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehavior788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group__0_in_ruleBehavior814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Alternatives_in_ruleExpr994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariable1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalVariable__NameAssignment_in_ruleLocalVariable1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpr_in_entryRuleBinaryExpr1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryExpr1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpr__Group__0_in_ruleBinaryExpr1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_entryRuleBinaryOperator1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperator1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForLoop_in_entryRuleForLoop1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForLoop1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__0_in_ruleForLoop1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__0_in_ruleConditional1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfOperation_in_entryRuleSelfOperation1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfOperation1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__0_in_ruleSelfOperation1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_entryRuleUpdate1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdate1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group__0_in_ruleUpdate1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantAssignment_in_entryRuleConstantAssignment1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantAssignment1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantAssignment__Group__0_in_ruleConstantAssignment1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalType_in_rule__ProgramElement__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalName_in_rule__ProgramElement__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_rule__LocalType__Alternatives1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeDefiningElement_in_rule__LocalType__Alternatives1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDef_in_rule__ScopeDefiningElement__Alternatives2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnsemble_in_rule__ScopeDefiningElement__Alternatives2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__ScopeDefiningElement__Alternatives2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Member__Alternatives2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequire_in_rule__Member__Alternatives2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_rule__Member__Alternatives2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Member__Alternatives2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_rule__Member__Alternatives2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_rule__Member__Alternatives2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantAssignment_in_rule__Member__Alternatives2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpr_in_rule__Expr__Alternatives2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Expr__Alternatives2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rule__Expr__Alternatives2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Expr__Alternatives2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_rule__Expr__Alternatives2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BinaryOperator__Alternatives2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BinaryOperator__Alternatives2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_rule__Statement__Alternatives2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Statement__Alternatives2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfOperation_in_rule__Statement__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Statement__Alternatives2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForLoop_in_rule__Statement__Alternatives2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ValueAssignment_0_in_rule__Value__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1__0_in_rule__Value__Alternatives2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Program__Group__0__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12594 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22654 = new BitSet(new long[]{0x0000018000238000L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__22657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Program__Group__2__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__32716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ElementsAssignment_3_in_rule__Program__Group__3__Impl2743 = new BitSet(new long[]{0x0000018000238002L});
    public static final BitSet FOLLOW_rule__ExternalName__Group__0__Impl_in_rule__ExternalName__Group__02782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalName__Group__1_in_rule__ExternalName__Group__02785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ExternalName__Group__0__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalName__Group__1__Impl_in_rule__ExternalName__Group__12844 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ExternalName__Group__2_in_rule__ExternalName__Group__12847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalName__NameAssignment_1_in_rule__ExternalName__Group__1__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalName__Group__2__Impl_in_rule__ExternalName__Group__22904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ExternalName__Group__2__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__0__Impl_in_rule__TypeDef__Group__02969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__1_in_rule__TypeDef__Group__02972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeDef__Group__0__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__1__Impl_in_rule__TypeDef__Group__13031 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__2_in_rule__TypeDef__Group__13034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__NameAssignment_1_in_rule__TypeDef__Group__1__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__2__Impl_in_rule__TypeDef__Group__23091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TypeDef__Group__2__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__0__Impl_in_rule__EnumDef__Group__03156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__1_in_rule__EnumDef__Group__03159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EnumDef__Group__0__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__1__Impl_in_rule__EnumDef__Group__13218 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__2_in_rule__EnumDef__Group__13221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__NameAssignment_1_in_rule__EnumDef__Group__1__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__2__Impl_in_rule__EnumDef__Group__23278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__3_in_rule__EnumDef__Group__23281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnumDef__Group__2__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__3__Impl_in_rule__EnumDef__Group__33340 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__4_in_rule__EnumDef__Group__33343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__NamesAssignment_3_in_rule__EnumDef__Group__3__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__4__Impl_in_rule__EnumDef__Group__43400 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__5_in_rule__EnumDef__Group__43403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__Group_4__0_in_rule__EnumDef__Group__4__Impl3430 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__EnumDef__Group__5__Impl_in_rule__EnumDef__Group__53461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumDef__Group__5__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__Group_4__0__Impl_in_rule__EnumDef__Group_4__03532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDef__Group_4__1_in_rule__EnumDef__Group_4__03535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumDef__Group_4__0__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__Group_4__1__Impl_in_rule__EnumDef__Group_4__13594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDef__NamesAssignment_4_1_in_rule__EnumDef__Group_4__1__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ensemble__Group__0__Impl_in_rule__Ensemble__Group__03655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Ensemble__Group__1_in_rule__Ensemble__Group__03658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Ensemble__Group__0__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ensemble__Group__1__Impl_in_rule__Ensemble__Group__13717 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Ensemble__Group__2_in_rule__Ensemble__Group__13720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ensemble__NameAssignment_1_in_rule__Ensemble__Group__1__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ensemble__Group__2__Impl_in_rule__Ensemble__Group__23777 = new BitSet(new long[]{0x000000E00C080010L});
    public static final BitSet FOLLOW_rule__Ensemble__Group__3_in_rule__Ensemble__Group__23780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Ensemble__Group__2__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ensemble__Group__3__Impl_in_rule__Ensemble__Group__33839 = new BitSet(new long[]{0x000000E00C080010L});
    public static final BitSet FOLLOW_rule__Ensemble__Group__4_in_rule__Ensemble__Group__33842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ensemble__ElementsAssignment_3_in_rule__Ensemble__Group__3__Impl3869 = new BitSet(new long[]{0x000000E00C000012L});
    public static final BitSet FOLLOW_rule__Ensemble__Group__4__Impl_in_rule__Ensemble__Group__43900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Ensemble__Group__4__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03969 = new BitSet(new long[]{0x0000018000230000L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__AbstractAssignment_0_in_rule__Role__Group__0__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__14030 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__MixinAssignment_1_in_rule__Role__Group__1__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__24090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__24093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Role__Group__2__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__34152 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__34155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_3_in_rule__Role__Group__3__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__44212 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_rule__Role__Group__5_in_rule__Role__Group__44215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__54273 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_rule__Role__Group__6_in_rule__Role__Group__54276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__0_in_rule__Role__Group__5__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__64334 = new BitSet(new long[]{0x000000E00C080010L});
    public static final BitSet FOLLOW_rule__Role__Group__7_in_rule__Role__Group__64337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Role__Group__6__Impl4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__74396 = new BitSet(new long[]{0x000000E00C080010L});
    public static final BitSet FOLLOW_rule__Role__Group__8_in_rule__Role__Group__74399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__ElementsAssignment_7_in_rule__Role__Group__7__Impl4426 = new BitSet(new long[]{0x000000E00C000012L});
    public static final BitSet FOLLOW_rule__Role__Group__8__Impl_in_rule__Role__Group__84457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Role__Group__8__Impl4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__04534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__04537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Role__Group_4__0__Impl4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__14596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__ExtendsRoleAssignment_4_1_in_rule__Role__Group_4__1__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__0__Impl_in_rule__Role__Group_5__04657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_5__1_in_rule__Role__Group_5__04660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Role__Group_5__0__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__1__Impl_in_rule__Role__Group_5__14719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__WithinEnsembleAssignment_5_1_in_rule__Role__Group_5__1__Impl4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__04780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__04783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_0_in_rule__Field__Group__0__Impl4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__14840 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__14843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__24900 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__24903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_2__0_in_rule__Field__Group__2__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__34961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Field__Group__3__Impl4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_2__0__Impl_in_rule__Field__Group_2__05028 = new BitSet(new long[]{0x0000001010000030L});
    public static final BitSet FOLLOW_rule__Field__Group_2__1_in_rule__Field__Group_2__05031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group_2__0__Impl5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_2__1__Impl_in_rule__Field__Group_2__15090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__InitialAssignment_2_1_in_rule__Field__Group_2__1__Impl5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Require__Group__0__Impl_in_rule__Require__Group__05151 = new BitSet(new long[]{0x0000001010000030L});
    public static final BitSet FOLLOW_rule__Require__Group__1_in_rule__Require__Group__05154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Require__Group__0__Impl5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Require__Group__1__Impl_in_rule__Require__Group__15213 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Require__Group__2_in_rule__Require__Group__15216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Require__ExpAssignment_1_in_rule__Require__Group__1__Impl5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Require__Group__2__Impl_in_rule__Require__Group__25273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Require__Group__2__Impl5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group__0__Impl_in_rule__Behavior__Group__05338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Behavior__Group__1_in_rule__Behavior__Group__05341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Behavior__Group__0__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group__1__Impl_in_rule__Behavior__Group__15400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Behavior__Group__2_in_rule__Behavior__Group__15403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group_1__0_in_rule__Behavior__Group__1__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group__2__Impl_in_rule__Behavior__Group__25461 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Behavior__Group__3_in_rule__Behavior__Group__25464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__NameAssignment_2_in_rule__Behavior__Group__2__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group__3__Impl_in_rule__Behavior__Group__35521 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__Behavior__Group__4_in_rule__Behavior__Group__35524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Behavior__Group__3__Impl5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group__4__Impl_in_rule__Behavior__Group__45583 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__Behavior__Group__5_in_rule__Behavior__Group__45586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group_4__0_in_rule__Behavior__Group__4__Impl5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group__5__Impl_in_rule__Behavior__Group__55644 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Behavior__Group__6_in_rule__Behavior__Group__55647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Behavior__Group__5__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group__6__Impl_in_rule__Behavior__Group__65706 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__Behavior__Group__7_in_rule__Behavior__Group__65709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Behavior__Group__6__Impl5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group__7__Impl_in_rule__Behavior__Group__75768 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__Behavior__Group__8_in_rule__Behavior__Group__75771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__BodyAssignment_7_in_rule__Behavior__Group__7__Impl5798 = new BitSet(new long[]{0x0000000A80000012L});
    public static final BitSet FOLLOW_rule__Behavior__Group__8__Impl_in_rule__Behavior__Group__85829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Behavior__Group__8__Impl5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group_1__0__Impl_in_rule__Behavior__Group_1__05906 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Behavior__Group_1__1_in_rule__Behavior__Group_1__05909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__QualifierAssignment_1_0_in_rule__Behavior__Group_1__0__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group_1__1__Impl_in_rule__Behavior__Group_1__15966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Behavior__Group_1__1__Impl5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group_4__0__Impl_in_rule__Behavior__Group_4__06029 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Behavior__Group_4__1_in_rule__Behavior__Group_4__06032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__ParamsAssignment_4_0_in_rule__Behavior__Group_4__0__Impl6059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group_4__1__Impl_in_rule__Behavior__Group_4__16089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group_4_1__0_in_rule__Behavior__Group_4__1__Impl6116 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Behavior__Group_4_1__0__Impl_in_rule__Behavior__Group_4_1__06151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Behavior__Group_4_1__1_in_rule__Behavior__Group_4_1__06154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Behavior__Group_4_1__0__Impl6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__Group_4_1__1__Impl_in_rule__Behavior__Group_4_1__16213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Behavior__ParamsAssignment_4_1_1_in_rule__Behavior__Group_4_1__1__Impl6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__06395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__06398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__TypeAssignment_0_in_rule__Method__Group__0__Impl6425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__16455 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__16458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__26515 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__26518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Method__Group__2__Impl6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__36577 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__36580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__46638 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__46641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Method__Group__4__Impl6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__56700 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__Method__Group__6_in_rule__Method__Group__56703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Method__Group__5__Impl6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__66762 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__Method__Group__7_in_rule__Method__Group__66765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__BodyAssignment_6_in_rule__Method__Group__6__Impl6792 = new BitSet(new long[]{0x0000000A80000012L});
    public static final BitSet FOLLOW_rule__Method__Group__7__Impl_in_rule__Method__Group__76823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Method__Group__7__Impl6851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__06898 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__06901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParamsAssignment_3_0_in_rule__Method__Group_3__0__Impl6928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__16958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__1__Impl6985 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0__Impl_in_rule__Method__Group_3_1__07020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__07023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Method__Group_3_1__0__Impl7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1__Impl_in_rule__Method__Group_3_1__17082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParamsAssignment_3_1_1_in_rule__Method__Group_3_1__1__Impl7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07143 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__QualifierAssignment_0_in_rule__QualifiedName__Group__0__Impl7173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__17206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__QualifiedName__Group__1__Impl7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__27265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__NameAssignment_2_in_rule__QualifiedName__Group__2__Impl7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpr__Group__0__Impl_in_rule__BinaryExpr__Group__07328 = new BitSet(new long[]{0x0000001010000030L});
    public static final BitSet FOLLOW_rule__BinaryExpr__Group__1_in_rule__BinaryExpr__Group__07331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BinaryExpr__Group__0__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpr__Group__1__Impl_in_rule__BinaryExpr__Group__17390 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__BinaryExpr__Group__2_in_rule__BinaryExpr__Group__17393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpr__LhsAssignment_1_in_rule__BinaryExpr__Group__1__Impl7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpr__Group__2__Impl_in_rule__BinaryExpr__Group__27450 = new BitSet(new long[]{0x0000001010000030L});
    public static final BitSet FOLLOW_rule__BinaryExpr__Group__3_in_rule__BinaryExpr__Group__27453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpr__OpAssignment_2_in_rule__BinaryExpr__Group__2__Impl7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpr__Group__3__Impl_in_rule__BinaryExpr__Group__37510 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__BinaryExpr__Group__4_in_rule__BinaryExpr__Group__37513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpr__RhsAssignment_3_in_rule__BinaryExpr__Group__3__Impl7540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExpr__Group__4__Impl_in_rule__BinaryExpr__Group__47570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BinaryExpr__Group__4__Impl7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__07639 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__07642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__NameAssignment_0_in_rule__FunctionCall__Group__0__Impl7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__17699 = new BitSet(new long[]{0x0000001030000030L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__17702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionCall__Group__1__Impl7730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__27761 = new BitSet(new long[]{0x0000001030000030L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__27764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2__0_in_rule__FunctionCall__Group__2__Impl7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__37822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionCall__Group__3__Impl7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2__0__Impl_in_rule__FunctionCall__Group_2__07889 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2__1_in_rule__FunctionCall__Group_2__07892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ArgumentsAssignment_2_0_in_rule__FunctionCall__Group_2__0__Impl7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2__1__Impl_in_rule__FunctionCall__Group_2__17949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2_1__0_in_rule__FunctionCall__Group_2__1__Impl7976 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2_1__0__Impl_in_rule__FunctionCall__Group_2_1__08011 = new BitSet(new long[]{0x0000001010000030L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2_1__1_in_rule__FunctionCall__Group_2_1__08014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FunctionCall__Group_2_1__0__Impl8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2_1__1__Impl_in_rule__FunctionCall__Group_2_1__18073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ArgumentsAssignment_2_1_1_in_rule__FunctionCall__Group_2_1__1__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__0__Impl_in_rule__ForLoop__Group__08134 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__1_in_rule__ForLoop__Group__08137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ForLoop__Group__0__Impl8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__1__Impl_in_rule__ForLoop__Group__18196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__2_in_rule__ForLoop__Group__18199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ForLoop__Group__1__Impl8227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__2__Impl_in_rule__ForLoop__Group__28258 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__3_in_rule__ForLoop__Group__28261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__VariableAssignment_2_in_rule__ForLoop__Group__2__Impl8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__3__Impl_in_rule__ForLoop__Group__38318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__4_in_rule__ForLoop__Group__38321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ForLoop__Group__3__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__4__Impl_in_rule__ForLoop__Group__48380 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__5_in_rule__ForLoop__Group__48383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__QualifierAssignment_4_in_rule__ForLoop__Group__4__Impl8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__5__Impl_in_rule__ForLoop__Group__58440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__6_in_rule__ForLoop__Group__58443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ForLoop__Group__5__Impl8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__6__Impl_in_rule__ForLoop__Group__68502 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__7_in_rule__ForLoop__Group__68505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__SharedAssignment_6_in_rule__ForLoop__Group__6__Impl8532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__7__Impl_in_rule__ForLoop__Group__78562 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__8_in_rule__ForLoop__Group__78565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ForLoop__Group__7__Impl8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__8__Impl_in_rule__ForLoop__Group__88624 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__9_in_rule__ForLoop__Group__88627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ForLoop__Group__8__Impl8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__9__Impl_in_rule__ForLoop__Group__98686 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__10_in_rule__ForLoop__Group__98689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForLoop__BodyAssignment_9_in_rule__ForLoop__Group__9__Impl8716 = new BitSet(new long[]{0x0000000A80000012L});
    public static final BitSet FOLLOW_rule__ForLoop__Group__10__Impl_in_rule__ForLoop__Group__108747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ForLoop__Group__10__Impl8775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__0__Impl_in_rule__Conditional__Group__08828 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__1_in_rule__Conditional__Group__08831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Conditional__Group__0__Impl8859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__1__Impl_in_rule__Conditional__Group__18890 = new BitSet(new long[]{0x0000001010000030L});
    public static final BitSet FOLLOW_rule__Conditional__Group__2_in_rule__Conditional__Group__18893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Conditional__Group__1__Impl8921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__2__Impl_in_rule__Conditional__Group__28952 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__3_in_rule__Conditional__Group__28955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ConditionAssignment_2_in_rule__Conditional__Group__2__Impl8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__3__Impl_in_rule__Conditional__Group__39012 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__4_in_rule__Conditional__Group__39015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Conditional__Group__3__Impl9043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__4__Impl_in_rule__Conditional__Group__49074 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__Conditional__Group__5_in_rule__Conditional__Group__49077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Conditional__Group__4__Impl9105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__5__Impl_in_rule__Conditional__Group__59136 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__Conditional__Group__6_in_rule__Conditional__Group__59139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ThenBranchAssignment_5_in_rule__Conditional__Group__5__Impl9166 = new BitSet(new long[]{0x0000000A80000012L});
    public static final BitSet FOLLOW_rule__Conditional__Group__6__Impl_in_rule__Conditional__Group__69197 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__7_in_rule__Conditional__Group__69200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Conditional__Group__6__Impl9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__7__Impl_in_rule__Conditional__Group__79259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_7__0_in_rule__Conditional__Group__7__Impl9286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_7__0__Impl_in_rule__Conditional__Group_7__09333 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Conditional__Group_7__1_in_rule__Conditional__Group_7__09336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Conditional__Group_7__0__Impl9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_7__1__Impl_in_rule__Conditional__Group_7__19395 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__Conditional__Group_7__2_in_rule__Conditional__Group_7__19398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Conditional__Group_7__1__Impl9426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_7__2__Impl_in_rule__Conditional__Group_7__29457 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__Conditional__Group_7__3_in_rule__Conditional__Group_7__29460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ElseBranchAssignment_7_2_in_rule__Conditional__Group_7__2__Impl9487 = new BitSet(new long[]{0x0000000A80000012L});
    public static final BitSet FOLLOW_rule__Conditional__Group_7__3__Impl_in_rule__Conditional__Group_7__39518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Conditional__Group_7__3__Impl9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__09585 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__09588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__QualifierAssignment_0_in_rule__Operation__Group__0__Impl9615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__19645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__19648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Operation__Group__1__Impl9676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__29707 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__29710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl9737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__39767 = new BitSet(new long[]{0x0000001030000030L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__39770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Operation__Group__3__Impl9798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__49829 = new BitSet(new long[]{0x0000001030000030L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__49832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl9859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__59890 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__59893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Operation__Group__5__Impl9921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__69952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Operation__Group__6__Impl9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__010025 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__010028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ArgumentsAssignment_4_0_in_rule__Operation__Group_4__0__Impl10055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__110085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__0_in_rule__Operation__Group_4__1__Impl10112 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__0__Impl_in_rule__Operation__Group_4_1__010147 = new BitSet(new long[]{0x0000001010000030L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__1_in_rule__Operation__Group_4_1__010150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Operation__Group_4_1__0__Impl10178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4_1__1__Impl_in_rule__Operation__Group_4_1__110209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ArgumentsAssignment_4_1_1_in_rule__Operation__Group_4_1__1__Impl10236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__0__Impl_in_rule__SelfOperation__Group__010270 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__1_in_rule__SelfOperation__Group__010273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SelfOperation__Group__0__Impl10301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__1__Impl_in_rule__SelfOperation__Group__110332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__2_in_rule__SelfOperation__Group__110335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SelfOperation__Group__1__Impl10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__2__Impl_in_rule__SelfOperation__Group__210394 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__3_in_rule__SelfOperation__Group__210397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__NameAssignment_2_in_rule__SelfOperation__Group__2__Impl10424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__3__Impl_in_rule__SelfOperation__Group__310454 = new BitSet(new long[]{0x0000001030000030L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__4_in_rule__SelfOperation__Group__310457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SelfOperation__Group__3__Impl10485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__4__Impl_in_rule__SelfOperation__Group__410516 = new BitSet(new long[]{0x0000001030000030L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__5_in_rule__SelfOperation__Group__410519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group_4__0_in_rule__SelfOperation__Group__4__Impl10546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__5__Impl_in_rule__SelfOperation__Group__510577 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__6_in_rule__SelfOperation__Group__510580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SelfOperation__Group__5__Impl10608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group__6__Impl_in_rule__SelfOperation__Group__610639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SelfOperation__Group__6__Impl10667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group_4__0__Impl_in_rule__SelfOperation__Group_4__010712 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group_4__1_in_rule__SelfOperation__Group_4__010715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__ArgumentsAssignment_4_0_in_rule__SelfOperation__Group_4__0__Impl10742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group_4__1__Impl_in_rule__SelfOperation__Group_4__110772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group_4_1__0_in_rule__SelfOperation__Group_4__1__Impl10799 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group_4_1__0__Impl_in_rule__SelfOperation__Group_4_1__010834 = new BitSet(new long[]{0x0000001010000030L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group_4_1__1_in_rule__SelfOperation__Group_4_1__010837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SelfOperation__Group_4_1__0__Impl10865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__Group_4_1__1__Impl_in_rule__SelfOperation__Group_4_1__110896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfOperation__ArgumentsAssignment_4_1_1_in_rule__SelfOperation__Group_4_1__1__Impl10923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__010957 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__010960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl10987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__111017 = new BitSet(new long[]{0x0000001010000030L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__111020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Assignment__Group__1__Impl11048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__211079 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__211082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpAssignment_2_in_rule__Assignment__Group__2__Impl11109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__311139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Assignment__Group__3__Impl11167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1__0__Impl_in_rule__Value__Group_1__011206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Value__Group_1__1_in_rule__Value__Group_1__011209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Value__Group_1__0__Impl11237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1__1__Impl_in_rule__Value__Group_1__111268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ExternAssignment_1_1_in_rule__Value__Group_1__1__Impl11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group__0__Impl_in_rule__Update__Group__011329 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Update__Group__1_in_rule__Update__Group__011332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Update__Group__0__Impl11360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group__1__Impl_in_rule__Update__Group__111391 = new BitSet(new long[]{0x0000000A80000010L});
    public static final BitSet FOLLOW_rule__Update__Group__2_in_rule__Update__Group__111394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Update__Group__1__Impl11422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group__2__Impl_in_rule__Update__Group__211453 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__Update__Group__3_in_rule__Update__Group__211456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__BodyAssignment_2_in_rule__Update__Group__2__Impl11483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__Group__3__Impl_in_rule__Update__Group__311513 = new BitSet(new long[]{0x0000000A80080010L});
    public static final BitSet FOLLOW_rule__Update__Group__4_in_rule__Update__Group__311516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Update__BodyAssignment_3_in_rule__Update__Group__3__Impl11543 = new BitSet(new long[]{0x0000000A80000012L});
    public static final BitSet FOLLOW_rule__Update__Group__4__Impl_in_rule__Update__Group__411574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Update__Group__4__Impl11602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__0__Impl_in_rule__ConstantDefinition__Group__011643 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__011646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__AbstractAssignment_0_in_rule__ConstantDefinition__Group__0__Impl11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__1__Impl_in_rule__ConstantDefinition__Group__111704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__2_in_rule__ConstantDefinition__Group__111707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ConstantDefinition__Group__1__Impl11735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__2__Impl_in_rule__ConstantDefinition__Group__211766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__3_in_rule__ConstantDefinition__Group__211769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__TypeAssignment_2_in_rule__ConstantDefinition__Group__2__Impl11796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__3__Impl_in_rule__ConstantDefinition__Group__311826 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__4_in_rule__ConstantDefinition__Group__311829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__NameAssignment_3_in_rule__ConstantDefinition__Group__3__Impl11856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__4__Impl_in_rule__ConstantDefinition__Group__411886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConstantDefinition__Group__4__Impl11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantAssignment__Group__0__Impl_in_rule__ConstantAssignment__Group__011955 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ConstantAssignment__Group__1_in_rule__ConstantAssignment__Group__011958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantAssignment__LhsAssignment_0_in_rule__ConstantAssignment__Group__0__Impl11985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantAssignment__Group__1__Impl_in_rule__ConstantAssignment__Group__112015 = new BitSet(new long[]{0x0000001010000030L});
    public static final BitSet FOLLOW_rule__ConstantAssignment__Group__2_in_rule__ConstantAssignment__Group__112018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ConstantAssignment__Group__1__Impl12046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantAssignment__Group__2__Impl_in_rule__ConstantAssignment__Group__212077 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ConstantAssignment__Group__3_in_rule__ConstantAssignment__Group__212080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantAssignment__RhsAssignment_2_in_rule__ConstantAssignment__Group__2__Impl12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantAssignment__Group__3__Impl_in_rule__ConstantAssignment__Group__312137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConstantAssignment__Group__3__Impl12165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Program__NameAssignment_112209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramElement_in_rule__Program__ElementsAssignment_312240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalName__NameAssignment_112271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDef__NameAssignment_112302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDef__NameAssignment_112333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDef__NamesAssignment_312364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDef__NamesAssignment_4_112395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ensemble__NameAssignment_112426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__Ensemble__ElementsAssignment_312457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Role__AbstractAssignment_012493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Role__MixinAssignment_112537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_312576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__ExtendsRoleAssignment_4_112607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__WithinEnsembleAssignment_5_112638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__Role__ElementsAssignment_712669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__TypeAssignment_012704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_112739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Field__InitialAssignment_2_112770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Require__ExpAssignment_112801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Behavior__QualifierAssignment_1_012836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Behavior__NameAssignment_212871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Behavior__ParamsAssignment_4_012902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Behavior__ParamsAssignment_4_1_112933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Behavior__BodyAssignment_712964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_012999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_113034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__TypeAssignment_013069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_113104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParamsAssignment_3_013135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParamsAssignment_3_1_113166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Method__BodyAssignment_613197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocalVariable__NameAssignment13228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__QualifierAssignment_013263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__NameAssignment_213298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__BinaryExpr__LhsAssignment_113329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_rule__BinaryExpr__OpAssignment_213360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__BinaryExpr__RhsAssignment_313391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionCall__NameAssignment_013422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__FunctionCall__ArgumentsAssignment_2_013453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__FunctionCall__ArgumentsAssignment_2_1_113484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForLoop__VariableAssignment_213515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForLoop__QualifierAssignment_413550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForLoop__SharedAssignment_613585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ForLoop__BodyAssignment_913616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Conditional__ConditionAssignment_213647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Conditional__ThenBranchAssignment_513678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Conditional__ElseBranchAssignment_7_213709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__QualifierAssignment_013744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_213779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Operation__ArgumentsAssignment_4_013810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Operation__ArgumentsAssignment_4_1_113841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SelfOperation__NameAssignment_213872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__SelfOperation__ArgumentsAssignment_4_013903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__SelfOperation__ArgumentsAssignment_4_1_113934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__NameAssignment_013965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Assignment__ExpAssignment_213996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Value__ValueAssignment_014027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Value__ExternAssignment_1_114062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Update__BodyAssignment_214097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Update__BodyAssignment_314128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ConstantDefinition__AbstractAssignment_014164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantDefinition__TypeAssignment_214207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantDefinition__NameAssignment_314242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantAssignment__LhsAssignment_014273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ConstantAssignment__RhsAssignment_214304 = new BitSet(new long[]{0x0000000000000002L});

}