package dk.sdu.mmmi.modular.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.modular.services.RobustCollaborationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobustCollaborationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'external'", "'type'", "'enum'", "'{'", "','", "'}'", "'ensemble'", "'abstract'", "'role'", "'extends'", "'within'", "'shared'", "'='", "'require'", "'behavior'", "'.'", "'('", "')'", "'=='", "'&&'", "'if'", "'else'", "'self'", "'@'", "'update'", "':'", "'constant'"
    };
    public static final int RULE_ID=4;
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
    public String getGrammarFileName() { return "../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g"; }



     	private RobustCollaborationGrammarAccess grammarAccess;
     	
        public InternalRobustCollaborationParser(TokenStream input, RobustCollaborationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected RobustCollaborationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:76:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_elements_3_0= ruleProgramElement ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_elements_3_0= ruleProgramElement ) )* ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_elements_3_0= ruleProgramElement ) )* )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_elements_3_0= ruleProgramElement ) )* )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_elements_3_0= ruleProgramElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProgram122); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getPackageKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:85:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProgram156); 

                	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getSemicolonKeyword_2());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:106:1: ( (lv_elements_3_0= ruleProgramElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=15)||(LA1_0>=19 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:107:1: (lv_elements_3_0= ruleProgramElement )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:107:1: (lv_elements_3_0= ruleProgramElement )
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:108:3: lv_elements_3_0= ruleProgramElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getElementsProgramElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProgramElement_in_ruleProgram177);
            	    lv_elements_3_0=ruleProgramElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"ProgramElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProgramElement"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:132:1: entryRuleProgramElement returns [EObject current=null] : iv_ruleProgramElement= ruleProgramElement EOF ;
    public final EObject entryRuleProgramElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramElement = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:133:2: (iv_ruleProgramElement= ruleProgramElement EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:134:2: iv_ruleProgramElement= ruleProgramElement EOF
            {
             newCompositeNode(grammarAccess.getProgramElementRule()); 
            pushFollow(FOLLOW_ruleProgramElement_in_entryRuleProgramElement214);
            iv_ruleProgramElement=ruleProgramElement();

            state._fsp--;

             current =iv_ruleProgramElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgramElement224); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgramElement"


    // $ANTLR start "ruleProgramElement"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:141:1: ruleProgramElement returns [EObject current=null] : (this_LocalType_0= ruleLocalType | this_ExternalName_1= ruleExternalName ) ;
    public final EObject ruleProgramElement() throws RecognitionException {
        EObject current = null;

        EObject this_LocalType_0 = null;

        EObject this_ExternalName_1 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:144:28: ( (this_LocalType_0= ruleLocalType | this_ExternalName_1= ruleExternalName ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:145:1: (this_LocalType_0= ruleLocalType | this_ExternalName_1= ruleExternalName )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:145:1: (this_LocalType_0= ruleLocalType | this_ExternalName_1= ruleExternalName )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=15)||(LA2_0>=19 && LA2_0<=21)) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:146:5: this_LocalType_0= ruleLocalType
                    {
                     
                            newCompositeNode(grammarAccess.getProgramElementAccess().getLocalTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLocalType_in_ruleProgramElement271);
                    this_LocalType_0=ruleLocalType();

                    state._fsp--;

                     
                            current = this_LocalType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:156:5: this_ExternalName_1= ruleExternalName
                    {
                     
                            newCompositeNode(grammarAccess.getProgramElementAccess().getExternalNameParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExternalName_in_ruleProgramElement298);
                    this_ExternalName_1=ruleExternalName();

                    state._fsp--;

                     
                            current = this_ExternalName_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgramElement"


    // $ANTLR start "entryRuleExternalName"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:172:1: entryRuleExternalName returns [EObject current=null] : iv_ruleExternalName= ruleExternalName EOF ;
    public final EObject entryRuleExternalName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalName = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:173:2: (iv_ruleExternalName= ruleExternalName EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:174:2: iv_ruleExternalName= ruleExternalName EOF
            {
             newCompositeNode(grammarAccess.getExternalNameRule()); 
            pushFollow(FOLLOW_ruleExternalName_in_entryRuleExternalName333);
            iv_ruleExternalName=ruleExternalName();

            state._fsp--;

             current =iv_ruleExternalName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalName343); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalName"


    // $ANTLR start "ruleExternalName"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:181:1: ruleExternalName returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleExternalName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:184:28: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:185:1: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:185:1: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:185:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleExternalName380); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalNameAccess().getExternalKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:189:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:190:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:190:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:191:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalName397); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExternalNameAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExternalName414); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalNameAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalName"


    // $ANTLR start "entryRuleScopeDefiningElement"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:219:1: entryRuleScopeDefiningElement returns [EObject current=null] : iv_ruleScopeDefiningElement= ruleScopeDefiningElement EOF ;
    public final EObject entryRuleScopeDefiningElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDefiningElement = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:220:2: (iv_ruleScopeDefiningElement= ruleScopeDefiningElement EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:221:2: iv_ruleScopeDefiningElement= ruleScopeDefiningElement EOF
            {
             newCompositeNode(grammarAccess.getScopeDefiningElementRule()); 
            pushFollow(FOLLOW_ruleScopeDefiningElement_in_entryRuleScopeDefiningElement450);
            iv_ruleScopeDefiningElement=ruleScopeDefiningElement();

            state._fsp--;

             current =iv_ruleScopeDefiningElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopeDefiningElement460); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScopeDefiningElement"


    // $ANTLR start "ruleScopeDefiningElement"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:228:1: ruleScopeDefiningElement returns [EObject current=null] : (this_EnumDef_0= ruleEnumDef | this_Ensemble_1= ruleEnsemble | this_Role_2= ruleRole ) ;
    public final EObject ruleScopeDefiningElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDef_0 = null;

        EObject this_Ensemble_1 = null;

        EObject this_Role_2 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:231:28: ( (this_EnumDef_0= ruleEnumDef | this_Ensemble_1= ruleEnsemble | this_Role_2= ruleRole ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:232:1: (this_EnumDef_0= ruleEnumDef | this_Ensemble_1= ruleEnsemble | this_Role_2= ruleRole )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:232:1: (this_EnumDef_0= ruleEnumDef | this_Ensemble_1= ruleEnsemble | this_Role_2= ruleRole )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
            case 21:
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
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:233:5: this_EnumDef_0= ruleEnumDef
                    {
                     
                            newCompositeNode(grammarAccess.getScopeDefiningElementAccess().getEnumDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEnumDef_in_ruleScopeDefiningElement507);
                    this_EnumDef_0=ruleEnumDef();

                    state._fsp--;

                     
                            current = this_EnumDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:243:5: this_Ensemble_1= ruleEnsemble
                    {
                     
                            newCompositeNode(grammarAccess.getScopeDefiningElementAccess().getEnsembleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnsemble_in_ruleScopeDefiningElement534);
                    this_Ensemble_1=ruleEnsemble();

                    state._fsp--;

                     
                            current = this_Ensemble_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:253:5: this_Role_2= ruleRole
                    {
                     
                            newCompositeNode(grammarAccess.getScopeDefiningElementAccess().getRoleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRole_in_ruleScopeDefiningElement561);
                    this_Role_2=ruleRole();

                    state._fsp--;

                     
                            current = this_Role_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScopeDefiningElement"


    // $ANTLR start "entryRuleLocalType"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:269:1: entryRuleLocalType returns [EObject current=null] : iv_ruleLocalType= ruleLocalType EOF ;
    public final EObject entryRuleLocalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalType = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:270:2: (iv_ruleLocalType= ruleLocalType EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:271:2: iv_ruleLocalType= ruleLocalType EOF
            {
             newCompositeNode(grammarAccess.getLocalTypeRule()); 
            pushFollow(FOLLOW_ruleLocalType_in_entryRuleLocalType596);
            iv_ruleLocalType=ruleLocalType();

            state._fsp--;

             current =iv_ruleLocalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalType606); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalType"


    // $ANTLR start "ruleLocalType"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:278:1: ruleLocalType returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_ScopeDefiningElement_1= ruleScopeDefiningElement ) ;
    public final EObject ruleLocalType() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_ScopeDefiningElement_1 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:281:28: ( (this_TypeDef_0= ruleTypeDef | this_ScopeDefiningElement_1= ruleScopeDefiningElement ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:282:1: (this_TypeDef_0= ruleTypeDef | this_ScopeDefiningElement_1= ruleScopeDefiningElement )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:282:1: (this_TypeDef_0= ruleTypeDef | this_ScopeDefiningElement_1= ruleScopeDefiningElement )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15||(LA4_0>=19 && LA4_0<=21)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:283:5: this_TypeDef_0= ruleTypeDef
                    {
                     
                            newCompositeNode(grammarAccess.getLocalTypeAccess().getTypeDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleLocalType653);
                    this_TypeDef_0=ruleTypeDef();

                    state._fsp--;

                     
                            current = this_TypeDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:293:5: this_ScopeDefiningElement_1= ruleScopeDefiningElement
                    {
                     
                            newCompositeNode(grammarAccess.getLocalTypeAccess().getScopeDefiningElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScopeDefiningElement_in_ruleLocalType680);
                    this_ScopeDefiningElement_1=ruleScopeDefiningElement();

                    state._fsp--;

                     
                            current = this_ScopeDefiningElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalType"


    // $ANTLR start "entryRuleTypeDef"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:309:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:310:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:311:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef715);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef725); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:318:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:321:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:322:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:322:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:322:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTypeDef762); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypeKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:326:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:327:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:327:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:328:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDef779); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTypeDef796); 

                	newLeafNode(otherlv_2, grammarAccess.getTypeDefAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleEnumDef"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:356:1: entryRuleEnumDef returns [EObject current=null] : iv_ruleEnumDef= ruleEnumDef EOF ;
    public final EObject entryRuleEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDef = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:357:2: (iv_ruleEnumDef= ruleEnumDef EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:358:2: iv_ruleEnumDef= ruleEnumDef EOF
            {
             newCompositeNode(grammarAccess.getEnumDefRule()); 
            pushFollow(FOLLOW_ruleEnumDef_in_entryRuleEnumDef832);
            iv_ruleEnumDef=ruleEnumDef();

            state._fsp--;

             current =iv_ruleEnumDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDef842); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumDef"


    // $ANTLR start "ruleEnumDef"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:365:1: ruleEnumDef returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_names_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_names_3_0=null;
        Token otherlv_4=null;
        Token lv_names_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:368:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_names_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )* otherlv_6= '}' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:369:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_names_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:369:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_names_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:369:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_names_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleEnumDef879); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumDefAccess().getEnumKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:373:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:374:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:374:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:375:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDef896); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleEnumDef913); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumDefAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:395:1: ( (lv_names_3_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:396:1: (lv_names_3_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:396:1: (lv_names_3_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:397:3: lv_names_3_0= RULE_ID
            {
            lv_names_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDef930); 

            			newLeafNode(lv_names_3_0, grammarAccess.getEnumDefAccess().getNamesIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumDefRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"names",
                    		lv_names_3_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:413:2: (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:413:4: otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEnumDef948); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumDefAccess().getCommaKeyword_4_0());
            	        
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:417:1: ( (lv_names_5_0= RULE_ID ) )
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:418:1: (lv_names_5_0= RULE_ID )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:418:1: (lv_names_5_0= RULE_ID )
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:419:3: lv_names_5_0= RULE_ID
            	    {
            	    lv_names_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDef965); 

            	    			newLeafNode(lv_names_5_0, grammarAccess.getEnumDefAccess().getNamesIDTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnumDefRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"names",
            	            		lv_names_5_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleEnumDef984); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumDefAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumDef"


    // $ANTLR start "entryRuleEnsemble"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:447:1: entryRuleEnsemble returns [EObject current=null] : iv_ruleEnsemble= ruleEnsemble EOF ;
    public final EObject entryRuleEnsemble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsemble = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:448:2: (iv_ruleEnsemble= ruleEnsemble EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:449:2: iv_ruleEnsemble= ruleEnsemble EOF
            {
             newCompositeNode(grammarAccess.getEnsembleRule()); 
            pushFollow(FOLLOW_ruleEnsemble_in_entryRuleEnsemble1020);
            iv_ruleEnsemble=ruleEnsemble();

            state._fsp--;

             current =iv_ruleEnsemble; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnsemble1030); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnsemble"


    // $ANTLR start "ruleEnsemble"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:456:1: ruleEnsemble returns [EObject current=null] : (otherlv_0= 'ensemble' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnsemble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:459:28: ( (otherlv_0= 'ensemble' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMember ) )* otherlv_4= '}' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:460:1: (otherlv_0= 'ensemble' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMember ) )* otherlv_4= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:460:1: (otherlv_0= 'ensemble' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMember ) )* otherlv_4= '}' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:460:3: otherlv_0= 'ensemble' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleEnsemble1067); 

                	newLeafNode(otherlv_0, grammarAccess.getEnsembleAccess().getEnsembleKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:464:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:465:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:465:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:466:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnsemble1084); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnsembleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnsembleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleEnsemble1101); 

                	newLeafNode(otherlv_2, grammarAccess.getEnsembleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:486:1: ( (lv_elements_3_0= ruleMember ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==20||LA6_0==24||(LA6_0>=26 && LA6_0<=27)||LA6_0==37||LA6_0==39) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:487:1: (lv_elements_3_0= ruleMember )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:487:1: (lv_elements_3_0= ruleMember )
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:488:3: lv_elements_3_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnsembleAccess().getElementsMemberParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleEnsemble1122);
            	    lv_elements_3_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnsembleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleEnsemble1135); 

                	newLeafNode(otherlv_4, grammarAccess.getEnsembleAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnsemble"


    // $ANTLR start "entryRuleRole"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:516:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:517:2: (iv_ruleRole= ruleRole EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:518:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole1171);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole1181); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:525:1: ruleRole returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extendsRole_4_0= RULE_ID ) ) )? (otherlv_5= 'within' ( (lv_withinEnsemble_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_elements_8_0= ruleMember ) )* otherlv_9= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_extendsRole_4_0=null;
        Token otherlv_5=null;
        Token lv_withinEnsemble_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_elements_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:528:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extendsRole_4_0= RULE_ID ) ) )? (otherlv_5= 'within' ( (lv_withinEnsemble_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_elements_8_0= ruleMember ) )* otherlv_9= '}' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:529:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extendsRole_4_0= RULE_ID ) ) )? (otherlv_5= 'within' ( (lv_withinEnsemble_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_elements_8_0= ruleMember ) )* otherlv_9= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:529:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extendsRole_4_0= RULE_ID ) ) )? (otherlv_5= 'within' ( (lv_withinEnsemble_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_elements_8_0= ruleMember ) )* otherlv_9= '}' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:529:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extendsRole_4_0= RULE_ID ) ) )? (otherlv_5= 'within' ( (lv_withinEnsemble_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_elements_8_0= ruleMember ) )* otherlv_9= '}'
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:529:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:530:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:530:1: (lv_abstract_0_0= 'abstract' )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:531:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,20,FOLLOW_20_in_ruleRole1224); 

                            newLeafNode(lv_abstract_0_0, grammarAccess.getRoleAccess().getAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleRole1250); 

                	newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:548:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:549:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:549:1: (lv_name_2_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:550:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole1267); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:566:2: (otherlv_3= 'extends' ( (lv_extendsRole_4_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:566:4: otherlv_3= 'extends' ( (lv_extendsRole_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleRole1285); 

                        	newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getExtendsKeyword_3_0());
                        
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:570:1: ( (lv_extendsRole_4_0= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:571:1: (lv_extendsRole_4_0= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:571:1: (lv_extendsRole_4_0= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:572:3: lv_extendsRole_4_0= RULE_ID
                    {
                    lv_extendsRole_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole1302); 

                    			newLeafNode(lv_extendsRole_4_0, grammarAccess.getRoleAccess().getExtendsRoleIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"extendsRole",
                            		true, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:588:4: (otherlv_5= 'within' ( (lv_withinEnsemble_6_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:588:6: otherlv_5= 'within' ( (lv_withinEnsemble_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleRole1322); 

                        	newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getWithinKeyword_4_0());
                        
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:592:1: ( (lv_withinEnsemble_6_0= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:593:1: (lv_withinEnsemble_6_0= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:593:1: (lv_withinEnsemble_6_0= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:594:3: lv_withinEnsemble_6_0= RULE_ID
                    {
                    lv_withinEnsemble_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole1339); 

                    			newLeafNode(lv_withinEnsemble_6_0, grammarAccess.getRoleAccess().getWithinEnsembleIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"withinEnsemble",
                            		true, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleRole1358); 

                	newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_5());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:614:1: ( (lv_elements_8_0= ruleMember ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==20||LA10_0==24||(LA10_0>=26 && LA10_0<=27)||LA10_0==37||LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:615:1: (lv_elements_8_0= ruleMember )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:615:1: (lv_elements_8_0= ruleMember )
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:616:3: lv_elements_8_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleAccess().getElementsMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleRole1379);
            	    lv_elements_8_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_8_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleRole1392); 

                	newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleMember"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:644:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:645:2: (iv_ruleMember= ruleMember EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:646:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember1428);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember1438); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:653:1: ruleMember returns [EObject current=null] : (this_Field_0= ruleField | this_Require_1= ruleRequire | this_Behavior_2= ruleBehavior | this_Method_3= ruleMethod | this_Update_4= ruleUpdate | this_ConstantDefinition_5= ruleConstantDefinition | this_ConstantAssignment_6= ruleConstantAssignment ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Require_1 = null;

        EObject this_Behavior_2 = null;

        EObject this_Method_3 = null;

        EObject this_Update_4 = null;

        EObject this_ConstantDefinition_5 = null;

        EObject this_ConstantAssignment_6 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:656:28: ( (this_Field_0= ruleField | this_Require_1= ruleRequire | this_Behavior_2= ruleBehavior | this_Method_3= ruleMethod | this_Update_4= ruleUpdate | this_ConstantDefinition_5= ruleConstantDefinition | this_ConstantAssignment_6= ruleConstantAssignment ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:657:1: (this_Field_0= ruleField | this_Require_1= ruleRequire | this_Behavior_2= ruleBehavior | this_Method_3= ruleMethod | this_Update_4= ruleUpdate | this_ConstantDefinition_5= ruleConstantDefinition | this_ConstantAssignment_6= ruleConstantAssignment )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:657:1: (this_Field_0= ruleField | this_Require_1= ruleRequire | this_Behavior_2= ruleBehavior | this_Method_3= ruleMethod | this_Update_4= ruleUpdate | this_ConstantDefinition_5= ruleConstantDefinition | this_ConstantAssignment_6= ruleConstantAssignment )
            int alt11=7;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:658:5: this_Field_0= ruleField
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleMember1485);
                    this_Field_0=ruleField();

                    state._fsp--;

                     
                            current = this_Field_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:668:5: this_Require_1= ruleRequire
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getRequireParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRequire_in_ruleMember1512);
                    this_Require_1=ruleRequire();

                    state._fsp--;

                     
                            current = this_Require_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:678:5: this_Behavior_2= ruleBehavior
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getBehaviorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBehavior_in_ruleMember1539);
                    this_Behavior_2=ruleBehavior();

                    state._fsp--;

                     
                            current = this_Behavior_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:688:5: this_Method_3= ruleMethod
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMethod_in_ruleMember1566);
                    this_Method_3=ruleMethod();

                    state._fsp--;

                     
                            current = this_Method_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:698:5: this_Update_4= ruleUpdate
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getUpdateParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUpdate_in_ruleMember1593);
                    this_Update_4=ruleUpdate();

                    state._fsp--;

                     
                            current = this_Update_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:708:5: this_ConstantDefinition_5= ruleConstantDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getConstantDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleConstantDefinition_in_ruleMember1620);
                    this_ConstantDefinition_5=ruleConstantDefinition();

                    state._fsp--;

                     
                            current = this_ConstantDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:718:5: this_ConstantAssignment_6= ruleConstantAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getConstantAssignmentParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleConstantAssignment_in_ruleMember1647);
                    this_ConstantAssignment_6=ruleConstantAssignment();

                    state._fsp--;

                     
                            current = this_ConstantAssignment_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleField"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:734:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:735:2: (iv_ruleField= ruleField EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:736:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1682);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1692); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:743:1: ruleField returns [EObject current=null] : ( ( (lv_shared_0_0= 'shared' ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_initial_4_0= ruleExpr ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_shared_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_initial_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:746:28: ( ( ( (lv_shared_0_0= 'shared' ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_initial_4_0= ruleExpr ) ) )? otherlv_5= ';' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:747:1: ( ( (lv_shared_0_0= 'shared' ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_initial_4_0= ruleExpr ) ) )? otherlv_5= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:747:1: ( ( (lv_shared_0_0= 'shared' ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_initial_4_0= ruleExpr ) ) )? otherlv_5= ';' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:747:2: ( (lv_shared_0_0= 'shared' ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_initial_4_0= ruleExpr ) ) )? otherlv_5= ';'
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:747:2: ( (lv_shared_0_0= 'shared' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:748:1: (lv_shared_0_0= 'shared' )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:748:1: (lv_shared_0_0= 'shared' )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:749:3: lv_shared_0_0= 'shared'
                    {
                    lv_shared_0_0=(Token)match(input,24,FOLLOW_24_in_ruleField1735); 

                            newLeafNode(lv_shared_0_0, grammarAccess.getFieldAccess().getSharedSharedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(current, "shared", true, "shared");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:762:3: ( (otherlv_1= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:763:1: (otherlv_1= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:763:1: (otherlv_1= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:764:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1769); 

            		newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getTypeLocalTypeCrossReference_1_0()); 
            	

            }


            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:775:2: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:776:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:776:1: (lv_name_2_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:777:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1786); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:793:2: (otherlv_3= '=' ( (lv_initial_4_0= ruleExpr ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:793:4: otherlv_3= '=' ( (lv_initial_4_0= ruleExpr ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleField1804); 

                        	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getEqualsSignKeyword_3_0());
                        
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:797:1: ( (lv_initial_4_0= ruleExpr ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:798:1: (lv_initial_4_0= ruleExpr )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:798:1: (lv_initial_4_0= ruleExpr )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:799:3: lv_initial_4_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getInitialExprParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleField1825);
                    lv_initial_4_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"initial",
                            		lv_initial_4_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleField1839); 

                	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleRequire"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:827:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:828:2: (iv_ruleRequire= ruleRequire EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:829:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_ruleRequire_in_entryRuleRequire1875);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequire1885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:836:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ';' ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:839:28: ( (otherlv_0= 'require' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ';' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:840:1: (otherlv_0= 'require' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:840:1: (otherlv_0= 'require' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ';' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:840:3: otherlv_0= 'require' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleRequire1922); 

                	newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:844:1: ( (lv_exp_1_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:845:1: (lv_exp_1_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:845:1: (lv_exp_1_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:846:3: lv_exp_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getRequireAccess().getExpExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleRequire1943);
            lv_exp_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequireRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRequire1955); 

                	newLeafNode(otherlv_2, grammarAccess.getRequireAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleBehavior"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:874:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:875:2: (iv_ruleBehavior= ruleBehavior EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:876:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_ruleBehavior_in_entryRuleBehavior1991);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehavior2001); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:883:1: ruleBehavior returns [EObject current=null] : (otherlv_0= 'behavior' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_body_10_0= ruleStatement ) )* otherlv_11= '}' ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_body_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:886:28: ( (otherlv_0= 'behavior' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_body_10_0= ruleStatement ) )* otherlv_11= '}' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:887:1: (otherlv_0= 'behavior' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_body_10_0= ruleStatement ) )* otherlv_11= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:887:1: (otherlv_0= 'behavior' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_body_10_0= ruleStatement ) )* otherlv_11= '}' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:887:3: otherlv_0= 'behavior' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_body_10_0= ruleStatement ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleBehavior2038); 

                	newLeafNode(otherlv_0, grammarAccess.getBehaviorAccess().getBehaviorKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:891:1: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==28) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:891:2: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.'
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:891:2: ( (otherlv_1= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:892:1: (otherlv_1= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:892:1: (otherlv_1= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:893:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBehaviorRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBehavior2059); 

                    		newLeafNode(otherlv_1, grammarAccess.getBehaviorAccess().getQualifierScopeDefiningElementCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleBehavior2071); 

                        	newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getFullStopKeyword_1_1());
                        

                    }
                    break;

            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:908:3: ( (lv_name_3_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:909:1: (lv_name_3_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:909:1: (lv_name_3_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:910:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBehavior2090); 

            			newLeafNode(lv_name_3_0, grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBehaviorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleBehavior2107); 

                	newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getLeftParenthesisKeyword_3());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:930:1: ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:930:2: ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:930:2: ( (lv_params_5_0= ruleParameter ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:931:1: (lv_params_5_0= ruleParameter )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:931:1: (lv_params_5_0= ruleParameter )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:932:3: lv_params_5_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getBehaviorAccess().getParamsParameterParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleBehavior2129);
                    lv_params_5_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_5_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:948:2: (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:948:4: otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleBehavior2142); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:952:1: ( (lv_params_7_0= ruleParameter ) )
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:953:1: (lv_params_7_0= ruleParameter )
                    	    {
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:953:1: (lv_params_7_0= ruleParameter )
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:954:3: lv_params_7_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBehaviorAccess().getParamsParameterParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleBehavior2163);
                    	    lv_params_7_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_7_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleBehavior2179); 

                	newLeafNode(otherlv_8, grammarAccess.getBehaviorAccess().getRightParenthesisKeyword_5());
                
            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleBehavior2191); 

                	newLeafNode(otherlv_9, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_6());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:978:1: ( (lv_body_10_0= ruleStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==33||LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:979:1: (lv_body_10_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:979:1: (lv_body_10_0= ruleStatement )
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:980:3: lv_body_10_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBehaviorAccess().getBodyStatementParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleBehavior2212);
            	    lv_body_10_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_10_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleBehavior2225); 

                	newLeafNode(otherlv_11, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleParameter"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1008:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1009:2: (iv_ruleParameter= ruleParameter EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1010:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2261);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2271); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1017:1: ruleParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1020:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1021:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1021:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1021:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1021:2: ( (otherlv_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1022:1: (otherlv_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1022:1: (otherlv_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1023:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2316); 

            		newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getTypeLocalTypeCrossReference_0_0()); 
            	

            }


            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1034:2: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1035:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1035:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1036:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2333); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleMethod"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1060:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1061:2: (iv_ruleMethod= ruleMethod EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1062:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod2374);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod2384); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1069:1: ruleMethod returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_body_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1072:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1073:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1073:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1073:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}'
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1073:2: ( (otherlv_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1074:1: (otherlv_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1074:1: (otherlv_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1075:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2429); 

            		newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getTypeLocalTypeCrossReference_0_0()); 
            	

            }


            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1086:2: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1087:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1087:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1088:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2446); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleMethod2463); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1108:1: ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1108:2: ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1108:2: ( (lv_params_3_0= ruleParameter ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1109:1: (lv_params_3_0= ruleParameter )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1109:1: (lv_params_3_0= ruleParameter )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1110:3: lv_params_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2485);
                    lv_params_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1126:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==17) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1126:4: otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleMethod2498); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1130:1: ( (lv_params_5_0= ruleParameter ) )
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1131:1: (lv_params_5_0= ruleParameter )
                    	    {
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1131:1: (lv_params_5_0= ruleParameter )
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1132:3: lv_params_5_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2519);
                    	    lv_params_5_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleMethod2535); 

                	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleMethod2547); 

                	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1156:1: ( (lv_body_8_0= ruleStatement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==33||LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1157:1: (lv_body_8_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1157:1: (lv_body_8_0= ruleStatement )
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1158:3: lv_body_8_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getBodyStatementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleMethod2568);
            	    lv_body_8_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_8_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleMethod2581); 

                	newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleExpr"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1186:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1187:2: (iv_ruleExpr= ruleExpr EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1188:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2617);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2627); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1195:1: ruleExpr returns [EObject current=null] : (this_BinaryExpr_0= ruleBinaryExpr | this_Value_1= ruleValue | this_FunctionCall_2= ruleFunctionCall | this_QualifiedName_3= ruleQualifiedName | this_LocalVariable_4= ruleLocalVariable ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpr_0 = null;

        EObject this_Value_1 = null;

        EObject this_FunctionCall_2 = null;

        EObject this_QualifiedName_3 = null;

        EObject this_LocalVariable_4 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1198:28: ( (this_BinaryExpr_0= ruleBinaryExpr | this_Value_1= ruleValue | this_FunctionCall_2= ruleFunctionCall | this_QualifiedName_3= ruleQualifiedName | this_LocalVariable_4= ruleLocalVariable ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1199:1: (this_BinaryExpr_0= ruleBinaryExpr | this_Value_1= ruleValue | this_FunctionCall_2= ruleFunctionCall | this_QualifiedName_3= ruleQualifiedName | this_LocalVariable_4= ruleLocalVariable )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1199:1: (this_BinaryExpr_0= ruleBinaryExpr | this_Value_1= ruleValue | this_FunctionCall_2= ruleFunctionCall | this_QualifiedName_3= ruleQualifiedName | this_LocalVariable_4= ruleLocalVariable )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt21=1;
                }
                break;
            case RULE_INT:
            case 36:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt21=3;
                    }
                    break;
                case EOF:
                case 12:
                case 17:
                case 30:
                case 31:
                case 32:
                    {
                    alt21=5;
                    }
                    break;
                case 28:
                    {
                    alt21=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1200:5: this_BinaryExpr_0= ruleBinaryExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprAccess().getBinaryExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBinaryExpr_in_ruleExpr2674);
                    this_BinaryExpr_0=ruleBinaryExpr();

                    state._fsp--;

                     
                            current = this_BinaryExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1210:5: this_Value_1= ruleValue
                    {
                     
                            newCompositeNode(grammarAccess.getExprAccess().getValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleValue_in_ruleExpr2701);
                    this_Value_1=ruleValue();

                    state._fsp--;

                     
                            current = this_Value_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1220:5: this_FunctionCall_2= ruleFunctionCall
                    {
                     
                            newCompositeNode(grammarAccess.getExprAccess().getFunctionCallParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleExpr2728);
                    this_FunctionCall_2=ruleFunctionCall();

                    state._fsp--;

                     
                            current = this_FunctionCall_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1230:5: this_QualifiedName_3= ruleQualifiedName
                    {
                     
                            newCompositeNode(grammarAccess.getExprAccess().getQualifiedNameParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleExpr2755);
                    this_QualifiedName_3=ruleQualifiedName();

                    state._fsp--;

                     
                            current = this_QualifiedName_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1240:5: this_LocalVariable_4= ruleLocalVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExprAccess().getLocalVariableParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLocalVariable_in_ruleExpr2782);
                    this_LocalVariable_4=ruleLocalVariable();

                    state._fsp--;

                     
                            current = this_LocalVariable_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleLocalVariable"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1256:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1257:2: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1258:2: iv_ruleLocalVariable= ruleLocalVariable EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableRule()); 
            pushFollow(FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable2817);
            iv_ruleLocalVariable=ruleLocalVariable();

            state._fsp--;

             current =iv_ruleLocalVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVariable2827); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariable"


    // $ANTLR start "ruleLocalVariable"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1265:1: ruleLocalVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1268:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1269:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1269:1: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1270:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1270:1: (lv_name_0_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1271:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVariable2868); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVariable"


    // $ANTLR start "entryRuleQualifiedName"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1295:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1296:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1297:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2908);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2918); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1304:1: ruleQualifiedName returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1307:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1308:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1308:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1308:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1308:2: ( (otherlv_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1309:1: (otherlv_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1309:1: (otherlv_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1310:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2963); 

            		newLeafNode(otherlv_0, grammarAccess.getQualifiedNameAccess().getQualifierScopeDefiningElementCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleQualifiedName2975); 

                	newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1325:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1326:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1326:1: (lv_name_2_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1327:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2992); 

            			newLeafNode(lv_name_2_0, grammarAccess.getQualifiedNameAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleBinaryExpr"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1351:1: entryRuleBinaryExpr returns [EObject current=null] : iv_ruleBinaryExpr= ruleBinaryExpr EOF ;
    public final EObject entryRuleBinaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpr = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1352:2: (iv_ruleBinaryExpr= ruleBinaryExpr EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1353:2: iv_ruleBinaryExpr= ruleBinaryExpr EOF
            {
             newCompositeNode(grammarAccess.getBinaryExprRule()); 
            pushFollow(FOLLOW_ruleBinaryExpr_in_entryRuleBinaryExpr3033);
            iv_ruleBinaryExpr=ruleBinaryExpr();

            state._fsp--;

             current =iv_ruleBinaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryExpr3043); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryExpr"


    // $ANTLR start "ruleBinaryExpr"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1360:1: ruleBinaryExpr returns [EObject current=null] : (otherlv_0= '(' ( (lv_lhs_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_lhs_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1363:28: ( (otherlv_0= '(' ( (lv_lhs_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ')' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1364:1: (otherlv_0= '(' ( (lv_lhs_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ')' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1364:1: (otherlv_0= '(' ( (lv_lhs_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ')' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1364:3: otherlv_0= '(' ( (lv_lhs_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleBinaryExpr3080); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryExprAccess().getLeftParenthesisKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1368:1: ( (lv_lhs_1_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1369:1: (lv_lhs_1_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1369:1: (lv_lhs_1_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1370:3: lv_lhs_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getBinaryExprAccess().getLhsExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleBinaryExpr3101);
            lv_lhs_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryExprRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1386:2: ( (lv_op_2_0= ruleBinaryOperator ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1387:1: (lv_op_2_0= ruleBinaryOperator )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1387:1: (lv_op_2_0= ruleBinaryOperator )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1388:3: lv_op_2_0= ruleBinaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getBinaryExprAccess().getOpBinaryOperatorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryOperator_in_ruleBinaryExpr3122);
            lv_op_2_0=ruleBinaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryExprRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_2_0, 
                    		"BinaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1404:2: ( (lv_rhs_3_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1405:1: (lv_rhs_3_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1405:1: (lv_rhs_3_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1406:3: lv_rhs_3_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getBinaryExprAccess().getRhsExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleBinaryExpr3143);
            lv_rhs_3_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryExprRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_3_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleBinaryExpr3155); 

                	newLeafNode(otherlv_4, grammarAccess.getBinaryExprAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExpr"


    // $ANTLR start "entryRuleBinaryOperator"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1434:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1435:2: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1436:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperatorRule()); 
            pushFollow(FOLLOW_ruleBinaryOperator_in_entryRuleBinaryOperator3192);
            iv_ruleBinaryOperator=ruleBinaryOperator();

            state._fsp--;

             current =iv_ruleBinaryOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOperator3203); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperator"


    // $ANTLR start "ruleBinaryOperator"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1443:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '&&' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1446:28: ( (kw= '==' | kw= '&&' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1447:1: (kw= '==' | kw= '&&' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1447:1: (kw= '==' | kw= '&&' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            else if ( (LA22_0==32) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1448:2: kw= '=='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleBinaryOperator3241); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1455:2: kw= '&&'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleBinaryOperator3260); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAmpersandAmpersandKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "entryRuleFunctionCall"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1468:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1469:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1470:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall3300);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall3310); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1477:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1480:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1481:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1481:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1481:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')'
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1481:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1482:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1482:1: (lv_name_0_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1483:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionCall3352); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFunctionCallAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionCallRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleFunctionCall3369); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1503:1: ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_INT)||LA24_0==29||LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1503:2: ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )*
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1503:2: ( (lv_arguments_2_0= ruleExpr ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1504:1: (lv_arguments_2_0= ruleExpr )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1504:1: (lv_arguments_2_0= ruleExpr )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1505:3: lv_arguments_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsExprParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleFunctionCall3391);
                    lv_arguments_2_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_2_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1521:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==17) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1521:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFunctionCall3404); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1525:1: ( (lv_arguments_4_0= ruleExpr ) )
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1526:1: (lv_arguments_4_0= ruleExpr )
                    	    {
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1526:1: (lv_arguments_4_0= ruleExpr )
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1527:3: lv_arguments_4_0= ruleExpr
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsExprParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleFunctionCall3425);
                    	    lv_arguments_4_0=ruleExpr();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_4_0, 
                    	            		"Expr");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleFunctionCall3441); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleStatement"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1555:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1556:2: (iv_ruleStatement= ruleStatement EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1557:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement3477);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement3487); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1564:1: ruleStatement returns [EObject current=null] : (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_SelfOperation_2= ruleSelfOperation | this_Assignment_3= ruleAssignment ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Conditional_0 = null;

        EObject this_Operation_1 = null;

        EObject this_SelfOperation_2 = null;

        EObject this_Assignment_3 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1567:28: ( (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_SelfOperation_2= ruleSelfOperation | this_Assignment_3= ruleAssignment ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1568:1: (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_SelfOperation_2= ruleSelfOperation | this_Assignment_3= ruleAssignment )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1568:1: (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_SelfOperation_2= ruleSelfOperation | this_Assignment_3= ruleAssignment )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt25=1;
                }
                break;
            case RULE_ID:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==28) ) {
                    alt25=2;
                }
                else if ( (LA25_2==25) ) {
                    alt25=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1569:5: this_Conditional_0= ruleConditional
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getConditionalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConditional_in_ruleStatement3534);
                    this_Conditional_0=ruleConditional();

                    state._fsp--;

                     
                            current = this_Conditional_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1579:5: this_Operation_1= ruleOperation
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getOperationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOperation_in_ruleStatement3561);
                    this_Operation_1=ruleOperation();

                    state._fsp--;

                     
                            current = this_Operation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1589:5: this_SelfOperation_2= ruleSelfOperation
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSelfOperationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSelfOperation_in_ruleStatement3588);
                    this_SelfOperation_2=ruleSelfOperation();

                    state._fsp--;

                     
                            current = this_SelfOperation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1599:5: this_Assignment_3= ruleAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAssignment_in_ruleStatement3615);
                    this_Assignment_3=ruleAssignment();

                    state._fsp--;

                     
                            current = this_Assignment_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleConditional"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1615:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1616:2: (iv_ruleConditional= ruleConditional EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1617:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional3650);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional3660); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1624:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_thenBranch_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenBranch_5_0 = null;

        EObject lv_elseBranch_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1627:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_thenBranch_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )? ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1628:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_thenBranch_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )? )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1628:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_thenBranch_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )? )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1628:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_thenBranch_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleConditional3697); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleConditional3709); 

                	newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1636:1: ( (lv_condition_2_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1637:1: (lv_condition_2_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1637:1: (lv_condition_2_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1638:3: lv_condition_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getConditionalAccess().getConditionExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleConditional3730);
            lv_condition_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleConditional3742); 

                	newLeafNode(otherlv_3, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleConditional3754); 

                	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_4());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1662:1: ( (lv_thenBranch_5_0= ruleStatement ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==33||LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1663:1: (lv_thenBranch_5_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1663:1: (lv_thenBranch_5_0= ruleStatement )
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1664:3: lv_thenBranch_5_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionalAccess().getThenBranchStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleConditional3775);
            	    lv_thenBranch_5_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"thenBranch",
            	            		lv_thenBranch_5_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleConditional3788); 

                	newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_6());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1684:1: (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1684:3: otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleConditional3801); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionalAccess().getElseKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleConditional3813); 

                        	newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1692:1: ( (lv_elseBranch_9_0= ruleStatement ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID||LA27_0==33||LA27_0==35) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1693:1: (lv_elseBranch_9_0= ruleStatement )
                    	    {
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1693:1: (lv_elseBranch_9_0= ruleStatement )
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1694:3: lv_elseBranch_9_0= ruleStatement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConditionalAccess().getElseBranchStatementParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleConditional3834);
                    	    lv_elseBranch_9_0=ruleStatement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elseBranch",
                    	            		lv_elseBranch_9_0, 
                    	            		"Statement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleConditional3847); 

                        	newLeafNode(otherlv_10, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleOperation"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1722:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1723:2: (iv_ruleOperation= ruleOperation EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1724:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation3885);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation3895); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1731:1: ruleOperation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )? otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1734:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )? otherlv_7= ')' otherlv_8= ';' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1735:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )? otherlv_7= ')' otherlv_8= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1735:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )? otherlv_7= ')' otherlv_8= ';' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1735:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )? otherlv_7= ')' otherlv_8= ';'
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1735:2: ( (otherlv_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1736:1: (otherlv_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1736:1: (otherlv_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1737:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation3940); 

            		newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getQualifierScopeDefiningElementCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleOperation3952); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getFullStopKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1752:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1753:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1753:1: (lv_name_2_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1754:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation3969); 

            			newLeafNode(lv_name_2_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleOperation3986); 

                	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1774:1: ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INT)||LA30_0==29||LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1774:2: ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )*
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1774:2: ( (lv_arguments_4_0= ruleExpr ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1775:1: (lv_arguments_4_0= ruleExpr )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1775:1: (lv_arguments_4_0= ruleExpr )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1776:3: lv_arguments_4_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getArgumentsExprParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleOperation4008);
                    lv_arguments_4_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_4_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1792:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==17) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1792:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleOperation4021); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1796:1: ( (lv_arguments_6_0= ruleExpr ) )
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1797:1: (lv_arguments_6_0= ruleExpr )
                    	    {
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1797:1: (lv_arguments_6_0= ruleExpr )
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1798:3: lv_arguments_6_0= ruleExpr
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getArgumentsExprParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleOperation4042);
                    	    lv_arguments_6_0=ruleExpr();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_6_0, 
                    	            		"Expr");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleOperation4058); 

                	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getRightParenthesisKeyword_5());
                
            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleOperation4070); 

                	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelfOperation"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1830:1: entryRuleSelfOperation returns [EObject current=null] : iv_ruleSelfOperation= ruleSelfOperation EOF ;
    public final EObject entryRuleSelfOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfOperation = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1831:2: (iv_ruleSelfOperation= ruleSelfOperation EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1832:2: iv_ruleSelfOperation= ruleSelfOperation EOF
            {
             newCompositeNode(grammarAccess.getSelfOperationRule()); 
            pushFollow(FOLLOW_ruleSelfOperation_in_entryRuleSelfOperation4106);
            iv_ruleSelfOperation=ruleSelfOperation();

            state._fsp--;

             current =iv_ruleSelfOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfOperation4116); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelfOperation"


    // $ANTLR start "ruleSelfOperation"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1839:1: ruleSelfOperation returns [EObject current=null] : (otherlv_0= 'self' otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )? otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleSelfOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1842:28: ( (otherlv_0= 'self' otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )? otherlv_7= ')' otherlv_8= ';' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1843:1: (otherlv_0= 'self' otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )? otherlv_7= ')' otherlv_8= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1843:1: (otherlv_0= 'self' otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )? otherlv_7= ')' otherlv_8= ';' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1843:3: otherlv_0= 'self' otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )? otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleSelfOperation4153); 

                	newLeafNode(otherlv_0, grammarAccess.getSelfOperationAccess().getSelfKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleSelfOperation4165); 

                	newLeafNode(otherlv_1, grammarAccess.getSelfOperationAccess().getFullStopKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1851:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1852:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1852:1: (lv_name_2_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1853:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelfOperation4182); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSelfOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelfOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleSelfOperation4199); 

                	newLeafNode(otherlv_3, grammarAccess.getSelfOperationAccess().getLeftParenthesisKeyword_3());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1873:1: ( ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_INT)||LA32_0==29||LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1873:2: ( (lv_arguments_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )*
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1873:2: ( (lv_arguments_4_0= ruleExpr ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1874:1: (lv_arguments_4_0= ruleExpr )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1874:1: (lv_arguments_4_0= ruleExpr )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1875:3: lv_arguments_4_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelfOperationAccess().getArgumentsExprParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleSelfOperation4221);
                    lv_arguments_4_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelfOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_4_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1891:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==17) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1891:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleExpr ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSelfOperation4234); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSelfOperationAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1895:1: ( (lv_arguments_6_0= ruleExpr ) )
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1896:1: (lv_arguments_6_0= ruleExpr )
                    	    {
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1896:1: (lv_arguments_6_0= ruleExpr )
                    	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1897:3: lv_arguments_6_0= ruleExpr
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelfOperationAccess().getArgumentsExprParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleSelfOperation4255);
                    	    lv_arguments_6_0=ruleExpr();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelfOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_6_0, 
                    	            		"Expr");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleSelfOperation4271); 

                	newLeafNode(otherlv_7, grammarAccess.getSelfOperationAccess().getRightParenthesisKeyword_5());
                
            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleSelfOperation4283); 

                	newLeafNode(otherlv_8, grammarAccess.getSelfOperationAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelfOperation"


    // $ANTLR start "entryRuleAssignment"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1929:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1930:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1931:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment4319);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment4329); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1938:1: ruleAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1941:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1942:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1942:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1942:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';'
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1942:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1943:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1943:1: (lv_name_0_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1944:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment4371); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAssignment4388); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1964:1: ( (lv_exp_2_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1965:1: (lv_exp_2_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1965:1: (lv_exp_2_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1966:3: lv_exp_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAssignment4409);
            lv_exp_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleAssignment4421); 

                	newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleValue"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1994:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1995:2: (iv_ruleValue= ruleValue EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:1996:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4457);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2003:1: ruleValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2006:28: ( ( ( (lv_value_0_0= RULE_INT ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) ) ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2007:1: ( ( (lv_value_0_0= RULE_INT ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) ) )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2007:1: ( ( (lv_value_0_0= RULE_INT ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            else if ( (LA33_0==36) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2007:2: ( (lv_value_0_0= RULE_INT ) )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2007:2: ( (lv_value_0_0= RULE_INT ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2008:1: (lv_value_0_0= RULE_INT )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2008:1: (lv_value_0_0= RULE_INT )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2009:3: lv_value_0_0= RULE_INT
                    {
                    lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue4509); 

                    			newLeafNode(lv_value_0_0, grammarAccess.getValueAccess().getValueINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2026:6: (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2026:6: (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2026:8: otherlv_1= '@' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleValue4533); 

                        	newLeafNode(otherlv_1, grammarAccess.getValueAccess().getCommercialAtKeyword_1_0());
                        
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2030:1: ( (otherlv_2= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2031:1: (otherlv_2= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2031:1: (otherlv_2= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2032:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue4553); 

                    		newLeafNode(otherlv_2, grammarAccess.getValueAccess().getExternExternalNameCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleUpdate"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2051:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2052:2: (iv_ruleUpdate= ruleUpdate EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2053:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_ruleUpdate_in_entryRuleUpdate4590);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdate4600); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2060:1: ruleUpdate returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_sourceName_6_0= RULE_ID ) ) otherlv_7= ')' )? otherlv_8= '{' ( (lv_body_9_0= ruleStatement ) )* otherlv_10= '}' ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_sourceName_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2063:28: ( (otherlv_0= 'update' (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_sourceName_6_0= RULE_ID ) ) otherlv_7= ')' )? otherlv_8= '{' ( (lv_body_9_0= ruleStatement ) )* otherlv_10= '}' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2064:1: (otherlv_0= 'update' (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_sourceName_6_0= RULE_ID ) ) otherlv_7= ')' )? otherlv_8= '{' ( (lv_body_9_0= ruleStatement ) )* otherlv_10= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2064:1: (otherlv_0= 'update' (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_sourceName_6_0= RULE_ID ) ) otherlv_7= ')' )? otherlv_8= '{' ( (lv_body_9_0= ruleStatement ) )* otherlv_10= '}' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2064:3: otherlv_0= 'update' (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_sourceName_6_0= RULE_ID ) ) otherlv_7= ')' )? otherlv_8= '{' ( (lv_body_9_0= ruleStatement ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleUpdate4637); 

                	newLeafNode(otherlv_0, grammarAccess.getUpdateAccess().getUpdateKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2068:1: (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_sourceName_6_0= RULE_ID ) ) otherlv_7= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==29) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2068:3: otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_sourceName_6_0= RULE_ID ) ) otherlv_7= ')'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleUpdate4650); 

                        	newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2072:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2073:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2073:1: (lv_name_2_0= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2074:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdate4667); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getUpdateAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUpdateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleUpdate4684); 

                        	newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getColonKeyword_1_2());
                        
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2094:1: ( (otherlv_4= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2095:1: (otherlv_4= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2095:1: (otherlv_4= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2096:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUpdateRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdate4704); 

                    		newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getSourceQualifierScopeDefiningElementCrossReference_1_3_0()); 
                    	

                    }


                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleUpdate4716); 

                        	newLeafNode(otherlv_5, grammarAccess.getUpdateAccess().getFullStopKeyword_1_4());
                        
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2111:1: ( (lv_sourceName_6_0= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2112:1: (lv_sourceName_6_0= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2112:1: (lv_sourceName_6_0= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2113:3: lv_sourceName_6_0= RULE_ID
                    {
                    lv_sourceName_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdate4733); 

                    			newLeafNode(lv_sourceName_6_0, grammarAccess.getUpdateAccess().getSourceNameIDTerminalRuleCall_1_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUpdateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"sourceName",
                            		lv_sourceName_6_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleUpdate4750); 

                        	newLeafNode(otherlv_7, grammarAccess.getUpdateAccess().getRightParenthesisKeyword_1_6());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleUpdate4764); 

                	newLeafNode(otherlv_8, grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2137:1: ( (lv_body_9_0= ruleStatement ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==33||LA35_0==35) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2138:1: (lv_body_9_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2138:1: (lv_body_9_0= ruleStatement )
            	    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2139:3: lv_body_9_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateAccess().getBodyStatementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleUpdate4785);
            	    lv_body_9_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_9_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleUpdate4798); 

                	newLeafNode(otherlv_10, grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleConstantDefinition"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2167:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2168:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2169:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
             newCompositeNode(grammarAccess.getConstantDefinitionRule()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition4834);
            iv_ruleConstantDefinition=ruleConstantDefinition();

            state._fsp--;

             current =iv_ruleConstantDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition4844); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantDefinition"


    // $ANTLR start "ruleConstantDefinition"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2176:1: ruleConstantDefinition returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'constant' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2179:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'constant' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2180:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'constant' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2180:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'constant' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2180:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'constant' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2180:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2181:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2181:1: (lv_abstract_0_0= 'abstract' )
                    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2182:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,20,FOLLOW_20_in_ruleConstantDefinition4887); 

                            newLeafNode(lv_abstract_0_0, grammarAccess.getConstantDefinitionAccess().getAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleConstantDefinition4913); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantDefinitionAccess().getConstantKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2199:1: ( (otherlv_2= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2200:1: (otherlv_2= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2200:1: (otherlv_2= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2201:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantDefinitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinition4933); 

            		newLeafNode(otherlv_2, grammarAccess.getConstantDefinitionAccess().getTypeLocalTypeCrossReference_2_0()); 
            	

            }


            }

            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2212:2: ( (lv_name_3_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2213:1: (lv_name_3_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2213:1: (lv_name_3_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2214:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinition4950); 

            			newLeafNode(lv_name_3_0, grammarAccess.getConstantDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleConstantDefinition4967); 

                	newLeafNode(otherlv_4, grammarAccess.getConstantDefinitionAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantDefinition"


    // $ANTLR start "entryRuleConstantAssignment"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2242:1: entryRuleConstantAssignment returns [EObject current=null] : iv_ruleConstantAssignment= ruleConstantAssignment EOF ;
    public final EObject entryRuleConstantAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantAssignment = null;


        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2243:2: (iv_ruleConstantAssignment= ruleConstantAssignment EOF )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2244:2: iv_ruleConstantAssignment= ruleConstantAssignment EOF
            {
             newCompositeNode(grammarAccess.getConstantAssignmentRule()); 
            pushFollow(FOLLOW_ruleConstantAssignment_in_entryRuleConstantAssignment5003);
            iv_ruleConstantAssignment=ruleConstantAssignment();

            state._fsp--;

             current =iv_ruleConstantAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantAssignment5013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantAssignment"


    // $ANTLR start "ruleConstantAssignment"
    // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2251:1: ruleConstantAssignment returns [EObject current=null] : ( ( (lv_lhs_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleExpr ) ) otherlv_3= ';' ) ;
    public final EObject ruleConstantAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_lhs_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2254:28: ( ( ( (lv_lhs_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleExpr ) ) otherlv_3= ';' ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2255:1: ( ( (lv_lhs_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleExpr ) ) otherlv_3= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2255:1: ( ( (lv_lhs_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleExpr ) ) otherlv_3= ';' )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2255:2: ( (lv_lhs_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleExpr ) ) otherlv_3= ';'
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2255:2: ( (lv_lhs_0_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2256:1: (lv_lhs_0_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2256:1: (lv_lhs_0_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2257:3: lv_lhs_0_0= RULE_ID
            {
            lv_lhs_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantAssignment5055); 

            			newLeafNode(lv_lhs_0_0, grammarAccess.getConstantAssignmentAccess().getLhsIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleConstantAssignment5072); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2277:1: ( (lv_rhs_2_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2278:1: (lv_rhs_2_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2278:1: (lv_rhs_2_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco/src-gen/dk/sdu/mmmi/modular/parser/antlr/internal/InternalRobustCollaboration.g:2279:3: lv_rhs_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getConstantAssignmentAccess().getRhsExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleConstantAssignment5093);
            lv_rhs_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleConstantAssignment5105); 

                	newLeafNode(otherlv_3, grammarAccess.getConstantAssignmentAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantAssignment"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\1\4\5\uffff\1\14\1\uffff";
    static final String DFA11_maxS =
        "\1\47\1\uffff\1\31\5\uffff\1\35\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\5\1\6\1\7\1\uffff\1\4";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\17\uffff\1\6\3\uffff\1\1\1\uffff\1\3\1\4\11\uffff\1\5\1"+
            "\uffff\1\6",
            "",
            "\1\10\24\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\1\14\uffff\1\1\3\uffff\1\11",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "657:1: (this_Field_0= ruleField | this_Require_1= ruleRequire | this_Behavior_2= ruleBehavior | this_Method_3= ruleMethod | this_Update_4= ruleUpdate | this_ConstantDefinition_5= ruleConstantDefinition | this_ConstantAssignment_6= ruleConstantAssignment )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProgram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram156 = new BitSet(new long[]{0x000000000038E002L});
    public static final BitSet FOLLOW_ruleProgramElement_in_ruleProgram177 = new BitSet(new long[]{0x000000000038E002L});
    public static final BitSet FOLLOW_ruleProgramElement_in_entryRuleProgramElement214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgramElement224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalType_in_ruleProgramElement271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalName_in_ruleProgramElement298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalName_in_entryRuleExternalName333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalName343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExternalName380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalName397 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExternalName414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeDefiningElement_in_entryRuleScopeDefiningElement450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopeDefiningElement460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDef_in_ruleScopeDefiningElement507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnsemble_in_ruleScopeDefiningElement534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleScopeDefiningElement561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalType_in_entryRuleLocalType596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalType606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleLocalType653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeDefiningElement_in_ruleLocalType680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTypeDef762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDef779 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDef796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDef_in_entryRuleEnumDef832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDef842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEnumDef879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDef896 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumDef913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDef930 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleEnumDef948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDef965 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleEnumDef984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnsemble_in_entryRuleEnsemble1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnsemble1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEnsemble1067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnsemble1084 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnsemble1101 = new BitSet(new long[]{0x000000A00D140010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleEnsemble1122 = new BitSet(new long[]{0x000000A00D140010L});
    public static final BitSet FOLLOW_18_in_ruleEnsemble1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRole1224 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRole1250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole1267 = new BitSet(new long[]{0x0000000000C10000L});
    public static final BitSet FOLLOW_22_in_ruleRole1285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole1302 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_23_in_ruleRole1322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole1339 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRole1358 = new BitSet(new long[]{0x000000A00D140010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleRole1379 = new BitSet(new long[]{0x000000A00D140010L});
    public static final BitSet FOLLOW_18_in_ruleRole1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember1428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleMember1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequire_in_ruleMember1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_ruleMember1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMember1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_ruleMember1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleMember1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantAssignment_in_ruleMember1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleField1735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1786 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_25_in_ruleField1804 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleField1825 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleField1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequire_in_entryRuleRequire1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequire1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRequire1922 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleRequire1943 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRequire1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior1991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehavior2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBehavior2038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBehavior2059 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleBehavior2071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBehavior2090 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBehavior2107 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleBehavior2129 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleBehavior2142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleBehavior2163 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleBehavior2179 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBehavior2191 = new BitSet(new long[]{0x0000000A00040010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBehavior2212 = new BitSet(new long[]{0x0000000A00040010L});
    public static final BitSet FOLLOW_18_in_ruleBehavior2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod2374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2446 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMethod2463 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2485 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleMethod2498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2519 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleMethod2535 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMethod2547 = new BitSet(new long[]{0x0000000A00040010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleMethod2568 = new BitSet(new long[]{0x0000000A00040010L});
    public static final BitSet FOLLOW_18_in_ruleMethod2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpr_in_ruleExpr2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleExpr2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleExpr2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleExpr2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_ruleExpr2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable2817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariable2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariable2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2963 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleQualifiedName2975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpr_in_entryRuleBinaryExpr3033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryExpr3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBinaryExpr3080 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleBinaryExpr3101 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_ruleBinaryExpr3122 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleBinaryExpr3143 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleBinaryExpr3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_entryRuleBinaryOperator3192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperator3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBinaryOperator3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBinaryOperator3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionCall3352 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionCall3369 = new BitSet(new long[]{0x0000001060000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFunctionCall3391 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionCall3404 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFunctionCall3425 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionCall3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement3477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleStatement3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleStatement3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfOperation_in_ruleStatement3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleStatement3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional3650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleConditional3697 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConditional3709 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleConditional3730 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleConditional3742 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConditional3754 = new BitSet(new long[]{0x0000000A00040010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleConditional3775 = new BitSet(new long[]{0x0000000A00040010L});
    public static final BitSet FOLLOW_18_in_ruleConditional3788 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleConditional3801 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConditional3813 = new BitSet(new long[]{0x0000000A00040010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleConditional3834 = new BitSet(new long[]{0x0000000A00040010L});
    public static final BitSet FOLLOW_18_in_ruleConditional3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation3885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation3940 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOperation3952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation3969 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOperation3986 = new BitSet(new long[]{0x0000001060000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleOperation4008 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleOperation4021 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleOperation4042 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleOperation4058 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOperation4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfOperation_in_entryRuleSelfOperation4106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfOperation4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSelfOperation4153 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSelfOperation4165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelfOperation4182 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSelfOperation4199 = new BitSet(new long[]{0x0000001060000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleSelfOperation4221 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleSelfOperation4234 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleSelfOperation4255 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleSelfOperation4271 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSelfOperation4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment4319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment4371 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssignment4388 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssignment4409 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssignment4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleValue4533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_entryRuleUpdate4590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdate4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleUpdate4637 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_29_in_ruleUpdate4650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdate4667 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUpdate4684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdate4704 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleUpdate4716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdate4733 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUpdate4750 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUpdate4764 = new BitSet(new long[]{0x0000000A00040010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleUpdate4785 = new BitSet(new long[]{0x0000000A00040010L});
    public static final BitSet FOLLOW_18_in_ruleUpdate4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition4834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleConstantDefinition4887 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleConstantDefinition4913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition4933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition4950 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstantDefinition4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantAssignment_in_entryRuleConstantAssignment5003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantAssignment5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantAssignment5055 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConstantAssignment5072 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleConstantAssignment5093 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstantAssignment5105 = new BitSet(new long[]{0x0000000000000002L});

}