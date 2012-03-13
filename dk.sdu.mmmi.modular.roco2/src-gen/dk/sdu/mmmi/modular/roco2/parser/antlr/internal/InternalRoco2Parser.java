package dk.sdu.mmmi.modular.roco2.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.modular.roco2.services.Roco2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRoco2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'external'", "'type'", "'enum'", "'{'", "','", "'}'", "'ensemble'", "'extends'", "'abstract'", "'mixin'", "'role'", "'within'", "'='", "'require'", "'behavior'", "'.'", "'('", "')'", "'=='", "'&&'", "'+'", "'-'", "'*'", "'/'", "'for'", "':'", "'if'", "'else'", "'self'", "'!'", "'@'", "'update'", "'constant'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalRoco2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRoco2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRoco2Parser.tokenNames; }
    public String getGrammarFileName() { return "../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g"; }



     	private Roco2GrammarAccess grammarAccess;
     	
        public InternalRoco2Parser(TokenStream input, Roco2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected Roco2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:69:2: iv_ruleProgram= ruleProgram EOF
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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:76:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_externals_3_0= ruleExternalName ) )* ( (lv_elements_4_0= ruleLocalType ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_externals_3_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_externals_3_0= ruleExternalName ) )* ( (lv_elements_4_0= ruleLocalType ) )* ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_externals_3_0= ruleExternalName ) )* ( (lv_elements_4_0= ruleLocalType ) )* )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_externals_3_0= ruleExternalName ) )* ( (lv_elements_4_0= ruleLocalType ) )* )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_externals_3_0= ruleExternalName ) )* ( (lv_elements_4_0= ruleLocalType ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProgram122); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getPackageKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:85:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:86:3: lv_name_1_0= RULE_ID
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
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:106:1: ( (lv_externals_3_0= ruleExternalName ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:107:1: (lv_externals_3_0= ruleExternalName )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:107:1: (lv_externals_3_0= ruleExternalName )
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:108:3: lv_externals_3_0= ruleExternalName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getExternalsExternalNameParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalName_in_ruleProgram177);
            	    lv_externals_3_0=ruleExternalName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"externals",
            	            		lv_externals_3_0, 
            	            		"ExternalName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:124:3: ( (lv_elements_4_0= ruleLocalType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=15)||LA2_0==19||(LA2_0>=21 && LA2_0<=23)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:125:1: (lv_elements_4_0= ruleLocalType )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:125:1: (lv_elements_4_0= ruleLocalType )
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:126:3: lv_elements_4_0= ruleLocalType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getElementsLocalTypeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocalType_in_ruleProgram199);
            	    lv_elements_4_0=ruleLocalType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"LocalType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleExternalName"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:150:1: entryRuleExternalName returns [EObject current=null] : iv_ruleExternalName= ruleExternalName EOF ;
    public final EObject entryRuleExternalName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalName = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:151:2: (iv_ruleExternalName= ruleExternalName EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:152:2: iv_ruleExternalName= ruleExternalName EOF
            {
             newCompositeNode(grammarAccess.getExternalNameRule()); 
            pushFollow(FOLLOW_ruleExternalName_in_entryRuleExternalName236);
            iv_ruleExternalName=ruleExternalName();

            state._fsp--;

             current =iv_ruleExternalName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalName246); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:159:1: ruleExternalName returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleExternalName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:162:28: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:163:1: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:163:1: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:163:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleExternalName283); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalNameAccess().getExternalKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:167:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:168:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:168:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:169:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalName300); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExternalName317); 

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


    // $ANTLR start "entryRuleLocalType"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:197:1: entryRuleLocalType returns [EObject current=null] : iv_ruleLocalType= ruleLocalType EOF ;
    public final EObject entryRuleLocalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalType = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:198:2: (iv_ruleLocalType= ruleLocalType EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:199:2: iv_ruleLocalType= ruleLocalType EOF
            {
             newCompositeNode(grammarAccess.getLocalTypeRule()); 
            pushFollow(FOLLOW_ruleLocalType_in_entryRuleLocalType353);
            iv_ruleLocalType=ruleLocalType();

            state._fsp--;

             current =iv_ruleLocalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalType363); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:206:1: ruleLocalType returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_ScopeDefiningElement_1= ruleScopeDefiningElement ) ;
    public final EObject ruleLocalType() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_ScopeDefiningElement_1 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:209:28: ( (this_TypeDef_0= ruleTypeDef | this_ScopeDefiningElement_1= ruleScopeDefiningElement ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:210:1: (this_TypeDef_0= ruleTypeDef | this_ScopeDefiningElement_1= ruleScopeDefiningElement )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:210:1: (this_TypeDef_0= ruleTypeDef | this_ScopeDefiningElement_1= ruleScopeDefiningElement )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15||LA3_0==19||(LA3_0>=21 && LA3_0<=23)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:211:5: this_TypeDef_0= ruleTypeDef
                    {
                     
                            newCompositeNode(grammarAccess.getLocalTypeAccess().getTypeDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleLocalType410);
                    this_TypeDef_0=ruleTypeDef();

                    state._fsp--;

                     
                            current = this_TypeDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:221:5: this_ScopeDefiningElement_1= ruleScopeDefiningElement
                    {
                     
                            newCompositeNode(grammarAccess.getLocalTypeAccess().getScopeDefiningElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScopeDefiningElement_in_ruleLocalType437);
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


    // $ANTLR start "entryRuleScopeDefiningElement"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:237:1: entryRuleScopeDefiningElement returns [EObject current=null] : iv_ruleScopeDefiningElement= ruleScopeDefiningElement EOF ;
    public final EObject entryRuleScopeDefiningElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDefiningElement = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:238:2: (iv_ruleScopeDefiningElement= ruleScopeDefiningElement EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:239:2: iv_ruleScopeDefiningElement= ruleScopeDefiningElement EOF
            {
             newCompositeNode(grammarAccess.getScopeDefiningElementRule()); 
            pushFollow(FOLLOW_ruleScopeDefiningElement_in_entryRuleScopeDefiningElement472);
            iv_ruleScopeDefiningElement=ruleScopeDefiningElement();

            state._fsp--;

             current =iv_ruleScopeDefiningElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopeDefiningElement482); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:246:1: ruleScopeDefiningElement returns [EObject current=null] : (this_EnumDef_0= ruleEnumDef | this_Ensemble_1= ruleEnsemble | this_Role_2= ruleRole ) ;
    public final EObject ruleScopeDefiningElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDef_0 = null;

        EObject this_Ensemble_1 = null;

        EObject this_Role_2 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:249:28: ( (this_EnumDef_0= ruleEnumDef | this_Ensemble_1= ruleEnsemble | this_Role_2= ruleRole ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:250:1: (this_EnumDef_0= ruleEnumDef | this_Ensemble_1= ruleEnsemble | this_Role_2= ruleRole )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:250:1: (this_EnumDef_0= ruleEnumDef | this_Ensemble_1= ruleEnsemble | this_Role_2= ruleRole )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 21:
            case 22:
            case 23:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:251:5: this_EnumDef_0= ruleEnumDef
                    {
                     
                            newCompositeNode(grammarAccess.getScopeDefiningElementAccess().getEnumDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEnumDef_in_ruleScopeDefiningElement529);
                    this_EnumDef_0=ruleEnumDef();

                    state._fsp--;

                     
                            current = this_EnumDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:261:5: this_Ensemble_1= ruleEnsemble
                    {
                     
                            newCompositeNode(grammarAccess.getScopeDefiningElementAccess().getEnsembleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnsemble_in_ruleScopeDefiningElement556);
                    this_Ensemble_1=ruleEnsemble();

                    state._fsp--;

                     
                            current = this_Ensemble_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:271:5: this_Role_2= ruleRole
                    {
                     
                            newCompositeNode(grammarAccess.getScopeDefiningElementAccess().getRoleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRole_in_ruleScopeDefiningElement583);
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


    // $ANTLR start "entryRuleTypeDef"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:287:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:288:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:289:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef618);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef628); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:296:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:299:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:300:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:300:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:300:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTypeDef665); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypeKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:304:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:305:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:305:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:306:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDef682); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTypeDef699); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:334:1: entryRuleEnumDef returns [EObject current=null] : iv_ruleEnumDef= ruleEnumDef EOF ;
    public final EObject entryRuleEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDef = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:335:2: (iv_ruleEnumDef= ruleEnumDef EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:336:2: iv_ruleEnumDef= ruleEnumDef EOF
            {
             newCompositeNode(grammarAccess.getEnumDefRule()); 
            pushFollow(FOLLOW_ruleEnumDef_in_entryRuleEnumDef735);
            iv_ruleEnumDef=ruleEnumDef();

            state._fsp--;

             current =iv_ruleEnumDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDef745); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:343:1: ruleEnumDef returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_names_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )* otherlv_6= '}' ) ;
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
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:346:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_names_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )* otherlv_6= '}' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:347:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_names_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:347:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_names_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:347:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_names_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleEnumDef782); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumDefAccess().getEnumKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:351:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:352:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:352:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:353:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDef799); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleEnumDef816); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumDefAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:373:1: ( (lv_names_3_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:374:1: (lv_names_3_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:374:1: (lv_names_3_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:375:3: lv_names_3_0= RULE_ID
            {
            lv_names_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDef833); 

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

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:391:2: (otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:391:4: otherlv_4= ',' ( (lv_names_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEnumDef851); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumDefAccess().getCommaKeyword_4_0());
            	        
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:395:1: ( (lv_names_5_0= RULE_ID ) )
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:396:1: (lv_names_5_0= RULE_ID )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:396:1: (lv_names_5_0= RULE_ID )
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:397:3: lv_names_5_0= RULE_ID
            	    {
            	    lv_names_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDef868); 

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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleEnumDef887); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:425:1: entryRuleEnsemble returns [EObject current=null] : iv_ruleEnsemble= ruleEnsemble EOF ;
    public final EObject entryRuleEnsemble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsemble = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:426:2: (iv_ruleEnsemble= ruleEnsemble EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:427:2: iv_ruleEnsemble= ruleEnsemble EOF
            {
             newCompositeNode(grammarAccess.getEnsembleRule()); 
            pushFollow(FOLLOW_ruleEnsemble_in_entryRuleEnsemble923);
            iv_ruleEnsemble=ruleEnsemble();

            state._fsp--;

             current =iv_ruleEnsemble; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnsemble933); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:434:1: ruleEnsemble returns [EObject current=null] : (otherlv_0= 'ensemble' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleMember ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnsemble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:437:28: ( (otherlv_0= 'ensemble' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleMember ) )* otherlv_6= '}' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:438:1: (otherlv_0= 'ensemble' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleMember ) )* otherlv_6= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:438:1: (otherlv_0= 'ensemble' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleMember ) )* otherlv_6= '}' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:438:3: otherlv_0= 'ensemble' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleMember ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleEnsemble970); 

                	newLeafNode(otherlv_0, grammarAccess.getEnsembleAccess().getEnsembleKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:442:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:443:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:443:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:444:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnsemble987); 

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

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:460:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:460:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEnsemble1005); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnsembleAccess().getExtendsKeyword_2_0());
                        
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:464:1: ( (otherlv_3= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:465:1: (otherlv_3= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:465:1: (otherlv_3= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:466:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnsembleRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnsemble1025); 

                    		newLeafNode(otherlv_3, grammarAccess.getEnsembleAccess().getExtendsEnsembleEnsembleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleEnsemble1039); 

                	newLeafNode(otherlv_4, grammarAccess.getEnsembleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:481:1: ( (lv_elements_5_0= ruleMember ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==21||(LA7_0>=26 && LA7_0<=27)||LA7_0==45) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:482:1: (lv_elements_5_0= ruleMember )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:482:1: (lv_elements_5_0= ruleMember )
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:483:3: lv_elements_5_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnsembleAccess().getElementsMemberParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleEnsemble1060);
            	    lv_elements_5_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnsembleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_5_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleEnsemble1073); 

                	newLeafNode(otherlv_6, grammarAccess.getEnsembleAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:511:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:512:2: (iv_ruleRole= ruleRole EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:513:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole1109);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole1119); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:520:1: ruleRole returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_mixin_1_0= 'mixin' ) )? otherlv_2= 'role' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'within' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleMember ) )* otherlv_10= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token lv_mixin_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_elements_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:523:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_mixin_1_0= 'mixin' ) )? otherlv_2= 'role' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'within' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleMember ) )* otherlv_10= '}' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:524:1: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_mixin_1_0= 'mixin' ) )? otherlv_2= 'role' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'within' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleMember ) )* otherlv_10= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:524:1: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_mixin_1_0= 'mixin' ) )? otherlv_2= 'role' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'within' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleMember ) )* otherlv_10= '}' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:524:2: ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_mixin_1_0= 'mixin' ) )? otherlv_2= 'role' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'within' ( (otherlv_7= RULE_ID ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleMember ) )* otherlv_10= '}'
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:524:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:525:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:525:1: (lv_abstract_0_0= 'abstract' )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:526:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,21,FOLLOW_21_in_ruleRole1162); 

                            newLeafNode(lv_abstract_0_0, grammarAccess.getRoleAccess().getAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:539:3: ( (lv_mixin_1_0= 'mixin' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:540:1: (lv_mixin_1_0= 'mixin' )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:540:1: (lv_mixin_1_0= 'mixin' )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:541:3: lv_mixin_1_0= 'mixin'
                    {
                    lv_mixin_1_0=(Token)match(input,22,FOLLOW_22_in_ruleRole1194); 

                            newLeafNode(lv_mixin_1_0, grammarAccess.getRoleAccess().getMixinMixinKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                           		setWithLastConsumed(current, "mixin", true, "mixin");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleRole1220); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getRoleKeyword_2());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:558:1: ( (lv_name_3_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:559:1: (lv_name_3_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:559:1: (lv_name_3_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:560:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole1237); 

            			newLeafNode(lv_name_3_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:576:2: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:576:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleRole1255); 

                        	newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getExtendsKeyword_4_0());
                        
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:580:1: ( (otherlv_5= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:581:1: (otherlv_5= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:581:1: (otherlv_5= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:582:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole1275); 

                    		newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getExtendsRoleRoleCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:593:4: (otherlv_6= 'within' ( (otherlv_7= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:593:6: otherlv_6= 'within' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleRole1290); 

                        	newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getWithinKeyword_5_0());
                        
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:597:1: ( (otherlv_7= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:598:1: (otherlv_7= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:598:1: (otherlv_7= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:599:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole1310); 

                    		newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getWithinEnsembleEnsembleCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleRole1324); 

                	newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_6());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:614:1: ( (lv_elements_9_0= ruleMember ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==21||(LA12_0>=26 && LA12_0<=27)||LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:615:1: (lv_elements_9_0= ruleMember )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:615:1: (lv_elements_9_0= ruleMember )
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:616:3: lv_elements_9_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleAccess().getElementsMemberParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleRole1345);
            	    lv_elements_9_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_9_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleRole1358); 

                	newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:644:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:645:2: (iv_ruleMember= ruleMember EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:646:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember1394);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember1404); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:653:1: ruleMember returns [EObject current=null] : (this_Field_0= ruleField | this_Require_1= ruleRequire | this_Behavior_2= ruleBehavior | this_Method_3= ruleMethod | this_Update_4= ruleUpdate | this_ConstantDefinition_5= ruleConstantDefinition | this_ConstantAssignment_6= ruleConstantAssignment ) ;
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
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:656:28: ( (this_Field_0= ruleField | this_Require_1= ruleRequire | this_Behavior_2= ruleBehavior | this_Method_3= ruleMethod | this_Update_4= ruleUpdate | this_ConstantDefinition_5= ruleConstantDefinition | this_ConstantAssignment_6= ruleConstantAssignment ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:657:1: (this_Field_0= ruleField | this_Require_1= ruleRequire | this_Behavior_2= ruleBehavior | this_Method_3= ruleMethod | this_Update_4= ruleUpdate | this_ConstantDefinition_5= ruleConstantDefinition | this_ConstantAssignment_6= ruleConstantAssignment )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:657:1: (this_Field_0= ruleField | this_Require_1= ruleRequire | this_Behavior_2= ruleBehavior | this_Method_3= ruleMethod | this_Update_4= ruleUpdate | this_ConstantDefinition_5= ruleConstantDefinition | this_ConstantAssignment_6= ruleConstantAssignment )
            int alt13=7;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:658:5: this_Field_0= ruleField
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleMember1451);
                    this_Field_0=ruleField();

                    state._fsp--;

                     
                            current = this_Field_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:668:5: this_Require_1= ruleRequire
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getRequireParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRequire_in_ruleMember1478);
                    this_Require_1=ruleRequire();

                    state._fsp--;

                     
                            current = this_Require_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:678:5: this_Behavior_2= ruleBehavior
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getBehaviorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBehavior_in_ruleMember1505);
                    this_Behavior_2=ruleBehavior();

                    state._fsp--;

                     
                            current = this_Behavior_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:688:5: this_Method_3= ruleMethod
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMethod_in_ruleMember1532);
                    this_Method_3=ruleMethod();

                    state._fsp--;

                     
                            current = this_Method_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:698:5: this_Update_4= ruleUpdate
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getUpdateParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUpdate_in_ruleMember1559);
                    this_Update_4=ruleUpdate();

                    state._fsp--;

                     
                            current = this_Update_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:708:5: this_ConstantDefinition_5= ruleConstantDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getConstantDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleConstantDefinition_in_ruleMember1586);
                    this_ConstantDefinition_5=ruleConstantDefinition();

                    state._fsp--;

                     
                            current = this_ConstantDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:718:5: this_ConstantAssignment_6= ruleConstantAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getConstantAssignmentParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleConstantAssignment_in_ruleMember1613);
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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:734:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:735:2: (iv_ruleField= ruleField EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:736:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1648);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1658); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:743:1: ruleField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initial_3_0= ruleExpr ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_initial_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:746:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initial_3_0= ruleExpr ) ) )? otherlv_4= ';' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:747:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initial_3_0= ruleExpr ) ) )? otherlv_4= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:747:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initial_3_0= ruleExpr ) ) )? otherlv_4= ';' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:747:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initial_3_0= ruleExpr ) ) )? otherlv_4= ';'
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:747:2: ( (otherlv_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:748:1: (otherlv_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:748:1: (otherlv_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:749:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1703); 

            		newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getTypeLocalTypeCrossReference_0_0()); 
            	

            }


            }

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:760:2: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:761:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:761:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:762:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1720); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:778:2: (otherlv_2= '=' ( (lv_initial_3_0= ruleExpr ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:778:4: otherlv_2= '=' ( (lv_initial_3_0= ruleExpr ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleField1738); 

                        	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getEqualsSignKeyword_2_0());
                        
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:782:1: ( (lv_initial_3_0= ruleExpr ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:783:1: (lv_initial_3_0= ruleExpr )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:783:1: (lv_initial_3_0= ruleExpr )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:784:3: lv_initial_3_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getInitialExprParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleField1759);
                    lv_initial_3_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"initial",
                            		lv_initial_3_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleField1773); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getSemicolonKeyword_3());
                

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:812:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:813:2: (iv_ruleRequire= ruleRequire EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:814:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_ruleRequire_in_entryRuleRequire1809);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequire1819); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:821:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ';' ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:824:28: ( (otherlv_0= 'require' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ';' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:825:1: (otherlv_0= 'require' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:825:1: (otherlv_0= 'require' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ';' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:825:3: otherlv_0= 'require' ( (lv_exp_1_0= ruleExpr ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleRequire1856); 

                	newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:829:1: ( (lv_exp_1_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:830:1: (lv_exp_1_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:830:1: (lv_exp_1_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:831:3: lv_exp_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getRequireAccess().getExpExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleRequire1877);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRequire1889); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:859:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:860:2: (iv_ruleBehavior= ruleBehavior EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:861:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_ruleBehavior_in_entryRuleBehavior1925);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehavior1935); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:868:1: ruleBehavior returns [EObject current=null] : (otherlv_0= 'behavior' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_body_10_0= ruleStatement ) )* otherlv_11= '}' ) ;
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
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:871:28: ( (otherlv_0= 'behavior' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_body_10_0= ruleStatement ) )* otherlv_11= '}' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:872:1: (otherlv_0= 'behavior' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_body_10_0= ruleStatement ) )* otherlv_11= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:872:1: (otherlv_0= 'behavior' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_body_10_0= ruleStatement ) )* otherlv_11= '}' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:872:3: otherlv_0= 'behavior' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_body_10_0= ruleStatement ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleBehavior1972); 

                	newLeafNode(otherlv_0, grammarAccess.getBehaviorAccess().getBehaviorKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:876:1: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==28) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:876:2: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.'
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:876:2: ( (otherlv_1= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:877:1: (otherlv_1= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:877:1: (otherlv_1= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:878:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBehaviorRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBehavior1993); 

                    		newLeafNode(otherlv_1, grammarAccess.getBehaviorAccess().getQualifierScopeDefiningElementCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleBehavior2005); 

                        	newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getFullStopKeyword_1_1());
                        

                    }
                    break;

            }

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:893:3: ( (lv_name_3_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:894:1: (lv_name_3_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:894:1: (lv_name_3_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:895:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBehavior2024); 

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

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleBehavior2041); 

                	newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getLeftParenthesisKeyword_3());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:915:1: ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:915:2: ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:915:2: ( (lv_params_5_0= ruleParameter ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:916:1: (lv_params_5_0= ruleParameter )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:916:1: (lv_params_5_0= ruleParameter )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:917:3: lv_params_5_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getBehaviorAccess().getParamsParameterParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleBehavior2063);
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

                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:933:2: (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==17) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:933:4: otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleBehavior2076); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:937:1: ( (lv_params_7_0= ruleParameter ) )
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:938:1: (lv_params_7_0= ruleParameter )
                    	    {
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:938:1: (lv_params_7_0= ruleParameter )
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:939:3: lv_params_7_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBehaviorAccess().getParamsParameterParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleBehavior2097);
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
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleBehavior2113); 

                	newLeafNode(otherlv_8, grammarAccess.getBehaviorAccess().getRightParenthesisKeyword_5());
                
            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleBehavior2125); 

                	newLeafNode(otherlv_9, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_6());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:963:1: ( (lv_body_10_0= ruleStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==37||LA18_0==39||LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:964:1: (lv_body_10_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:964:1: (lv_body_10_0= ruleStatement )
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:965:3: lv_body_10_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBehaviorAccess().getBodyStatementParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleBehavior2146);
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
            	    break loop18;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleBehavior2159); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:993:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:994:2: (iv_ruleParameter= ruleParameter EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:995:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2195);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2205); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1002:1: ruleParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1005:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1006:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1006:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1006:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1006:2: ( (otherlv_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1007:1: (otherlv_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1007:1: (otherlv_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1008:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2250); 

            		newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getTypeLocalTypeCrossReference_0_0()); 
            	

            }


            }

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1019:2: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1020:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1020:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1021:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2267); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1045:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1046:2: (iv_ruleMethod= ruleMethod EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1047:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod2308);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod2318); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1054:1: ruleMethod returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' ) ;
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
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1057:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1058:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1058:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1058:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}'
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1058:2: ( (otherlv_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1059:1: (otherlv_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1059:1: (otherlv_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1060:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2363); 

            		newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getTypeLocalTypeCrossReference_0_0()); 
            	

            }


            }

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1071:2: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1072:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1072:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1073:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2380); 

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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleMethod2397); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1093:1: ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1093:2: ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1093:2: ( (lv_params_3_0= ruleParameter ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1094:1: (lv_params_3_0= ruleParameter )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1094:1: (lv_params_3_0= ruleParameter )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1095:3: lv_params_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2419);
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

                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1111:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==17) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1111:4: otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleMethod2432); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1115:1: ( (lv_params_5_0= ruleParameter ) )
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1116:1: (lv_params_5_0= ruleParameter )
                    	    {
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1116:1: (lv_params_5_0= ruleParameter )
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1117:3: lv_params_5_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2453);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleMethod2469); 

                	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleMethod2481); 

                	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1141:1: ( (lv_body_8_0= ruleStatement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==37||LA21_0==39||LA21_0==41) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1142:1: (lv_body_8_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1142:1: (lv_body_8_0= ruleStatement )
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1143:3: lv_body_8_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getBodyStatementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleMethod2502);
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
            	    break loop21;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleMethod2515); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1171:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1172:2: (iv_ruleExpr= ruleExpr EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1173:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2551);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2561); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1180:1: ruleExpr returns [EObject current=null] : (this_BinaryExpr_0= ruleBinaryExpr | this_Value_1= ruleValue | this_FunctionCall_2= ruleFunctionCall | this_InternalQualifiedName_3= ruleInternalQualifiedName | this_LocalVariable_4= ruleLocalVariable ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpr_0 = null;

        EObject this_Value_1 = null;

        EObject this_FunctionCall_2 = null;

        EObject this_InternalQualifiedName_3 = null;

        EObject this_LocalVariable_4 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1183:28: ( (this_BinaryExpr_0= ruleBinaryExpr | this_Value_1= ruleValue | this_FunctionCall_2= ruleFunctionCall | this_InternalQualifiedName_3= ruleInternalQualifiedName | this_LocalVariable_4= ruleLocalVariable ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1184:1: (this_BinaryExpr_0= ruleBinaryExpr | this_Value_1= ruleValue | this_FunctionCall_2= ruleFunctionCall | this_InternalQualifiedName_3= ruleInternalQualifiedName | this_LocalVariable_4= ruleLocalVariable )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1184:1: (this_BinaryExpr_0= ruleBinaryExpr | this_Value_1= ruleValue | this_FunctionCall_2= ruleFunctionCall | this_InternalQualifiedName_3= ruleInternalQualifiedName | this_LocalVariable_4= ruleLocalVariable )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt22=1;
                }
                break;
            case RULE_INT:
            case 43:
                {
                alt22=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt22=3;
                    }
                    break;
                case EOF:
                case 12:
                case 17:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    {
                    alt22=5;
                    }
                    break;
                case 28:
                    {
                    alt22=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1185:5: this_BinaryExpr_0= ruleBinaryExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprAccess().getBinaryExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBinaryExpr_in_ruleExpr2608);
                    this_BinaryExpr_0=ruleBinaryExpr();

                    state._fsp--;

                     
                            current = this_BinaryExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1195:5: this_Value_1= ruleValue
                    {
                     
                            newCompositeNode(grammarAccess.getExprAccess().getValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleValue_in_ruleExpr2635);
                    this_Value_1=ruleValue();

                    state._fsp--;

                     
                            current = this_Value_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1205:5: this_FunctionCall_2= ruleFunctionCall
                    {
                     
                            newCompositeNode(grammarAccess.getExprAccess().getFunctionCallParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleExpr2662);
                    this_FunctionCall_2=ruleFunctionCall();

                    state._fsp--;

                     
                            current = this_FunctionCall_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1215:5: this_InternalQualifiedName_3= ruleInternalQualifiedName
                    {
                     
                            newCompositeNode(grammarAccess.getExprAccess().getInternalQualifiedNameParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInternalQualifiedName_in_ruleExpr2689);
                    this_InternalQualifiedName_3=ruleInternalQualifiedName();

                    state._fsp--;

                     
                            current = this_InternalQualifiedName_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1225:5: this_LocalVariable_4= ruleLocalVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExprAccess().getLocalVariableParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLocalVariable_in_ruleExpr2716);
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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1241:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1242:2: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1243:2: iv_ruleLocalVariable= ruleLocalVariable EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableRule()); 
            pushFollow(FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable2751);
            iv_ruleLocalVariable=ruleLocalVariable();

            state._fsp--;

             current =iv_ruleLocalVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVariable2761); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1250:1: ruleLocalVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1253:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1254:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1254:1: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1255:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1255:1: (lv_name_0_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1256:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVariable2802); 

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


    // $ANTLR start "entryRuleInternalQualifiedName"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1280:1: entryRuleInternalQualifiedName returns [EObject current=null] : iv_ruleInternalQualifiedName= ruleInternalQualifiedName EOF ;
    public final EObject entryRuleInternalQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalQualifiedName = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1281:2: (iv_ruleInternalQualifiedName= ruleInternalQualifiedName EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1282:2: iv_ruleInternalQualifiedName= ruleInternalQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getInternalQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleInternalQualifiedName_in_entryRuleInternalQualifiedName2842);
            iv_ruleInternalQualifiedName=ruleInternalQualifiedName();

            state._fsp--;

             current =iv_ruleInternalQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalQualifiedName2852); 

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
    // $ANTLR end "entryRuleInternalQualifiedName"


    // $ANTLR start "ruleInternalQualifiedName"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1289:1: ruleInternalQualifiedName returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInternalQualifiedName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1292:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1293:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1293:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1293:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1293:2: ( (otherlv_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1294:1: (otherlv_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1294:1: (otherlv_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1295:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInternalQualifiedNameRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInternalQualifiedName2897); 

            		newLeafNode(otherlv_0, grammarAccess.getInternalQualifiedNameAccess().getQualifierScopeDefiningElementCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleInternalQualifiedName2909); 

                	newLeafNode(otherlv_1, grammarAccess.getInternalQualifiedNameAccess().getFullStopKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1310:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1311:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1311:1: (lv_name_2_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1312:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInternalQualifiedName2926); 

            			newLeafNode(lv_name_2_0, grammarAccess.getInternalQualifiedNameAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInternalQualifiedNameRule());
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
    // $ANTLR end "ruleInternalQualifiedName"


    // $ANTLR start "entryRuleBinaryExpr"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1336:1: entryRuleBinaryExpr returns [EObject current=null] : iv_ruleBinaryExpr= ruleBinaryExpr EOF ;
    public final EObject entryRuleBinaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpr = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1337:2: (iv_ruleBinaryExpr= ruleBinaryExpr EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1338:2: iv_ruleBinaryExpr= ruleBinaryExpr EOF
            {
             newCompositeNode(grammarAccess.getBinaryExprRule()); 
            pushFollow(FOLLOW_ruleBinaryExpr_in_entryRuleBinaryExpr2967);
            iv_ruleBinaryExpr=ruleBinaryExpr();

            state._fsp--;

             current =iv_ruleBinaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryExpr2977); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1345:1: ruleBinaryExpr returns [EObject current=null] : (otherlv_0= '(' ( (lv_lhs_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_lhs_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1348:28: ( (otherlv_0= '(' ( (lv_lhs_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ')' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1349:1: (otherlv_0= '(' ( (lv_lhs_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ')' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1349:1: (otherlv_0= '(' ( (lv_lhs_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ')' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1349:3: otherlv_0= '(' ( (lv_lhs_1_0= ruleExpr ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleBinaryExpr3014); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryExprAccess().getLeftParenthesisKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1353:1: ( (lv_lhs_1_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1354:1: (lv_lhs_1_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1354:1: (lv_lhs_1_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1355:3: lv_lhs_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getBinaryExprAccess().getLhsExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleBinaryExpr3035);
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

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1371:2: ( (lv_op_2_0= ruleBinaryOperator ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1372:1: (lv_op_2_0= ruleBinaryOperator )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1372:1: (lv_op_2_0= ruleBinaryOperator )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1373:3: lv_op_2_0= ruleBinaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getBinaryExprAccess().getOpBinaryOperatorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryOperator_in_ruleBinaryExpr3056);
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

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1389:2: ( (lv_rhs_3_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1390:1: (lv_rhs_3_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1390:1: (lv_rhs_3_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1391:3: lv_rhs_3_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getBinaryExprAccess().getRhsExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleBinaryExpr3077);
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

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleBinaryExpr3089); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1419:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1420:2: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1421:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperatorRule()); 
            pushFollow(FOLLOW_ruleBinaryOperator_in_entryRuleBinaryOperator3126);
            iv_ruleBinaryOperator=ruleBinaryOperator();

            state._fsp--;

             current =iv_ruleBinaryOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOperator3137); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1428:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '&&' | kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1431:28: ( (kw= '==' | kw= '&&' | kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1432:1: (kw= '==' | kw= '&&' | kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1432:1: (kw= '==' | kw= '&&' | kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt23=1;
                }
                break;
            case 32:
                {
                alt23=2;
                }
                break;
            case 33:
                {
                alt23=3;
                }
                break;
            case 34:
                {
                alt23=4;
                }
                break;
            case 35:
                {
                alt23=5;
                }
                break;
            case 36:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1433:2: kw= '=='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleBinaryOperator3175); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1440:2: kw= '&&'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleBinaryOperator3194); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAmpersandAmpersandKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1447:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleBinaryOperator3213); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1454:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleBinaryOperator3232); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1461:2: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleBinaryOperator3251); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1468:2: kw= '/'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleBinaryOperator3270); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_5()); 
                        

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1481:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1482:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1483:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall3310);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall3320); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1490:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' ) ;
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
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1493:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1494:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1494:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1494:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')'
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1494:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1495:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1495:1: (lv_name_0_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1496:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionCall3362); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleFunctionCall3379); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1516:1: ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_INT)||LA25_0==29||LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1516:2: ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )*
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1516:2: ( (lv_arguments_2_0= ruleExpr ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1517:1: (lv_arguments_2_0= ruleExpr )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1517:1: (lv_arguments_2_0= ruleExpr )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1518:3: lv_arguments_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsExprParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleFunctionCall3401);
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

                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1534:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==17) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1534:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFunctionCall3414); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1538:1: ( (lv_arguments_4_0= ruleExpr ) )
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1539:1: (lv_arguments_4_0= ruleExpr )
                    	    {
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1539:1: (lv_arguments_4_0= ruleExpr )
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1540:3: lv_arguments_4_0= ruleExpr
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsExprParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleFunctionCall3435);
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
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleFunctionCall3451); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1568:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1569:2: (iv_ruleStatement= ruleStatement EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1570:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement3487);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement3497); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1577:1: ruleStatement returns [EObject current=null] : (this_BasicStatement_0= ruleBasicStatement | this_QualifiedStatement_1= ruleQualifiedStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BasicStatement_0 = null;

        EObject this_QualifiedStatement_1 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1580:28: ( (this_BasicStatement_0= ruleBasicStatement | this_QualifiedStatement_1= ruleQualifiedStatement ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1581:1: (this_BasicStatement_0= ruleBasicStatement | this_QualifiedStatement_1= ruleQualifiedStatement )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1581:1: (this_BasicStatement_0= ruleBasicStatement | this_QualifiedStatement_1= ruleQualifiedStatement )
            int alt26=2;
            switch ( input.LA(1) ) {
            case 37:
            case 39:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==25||LA26_2==29) ) {
                    alt26=1;
                }
                else if ( (LA26_2==28||LA26_2==42) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt26=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1582:5: this_BasicStatement_0= ruleBasicStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getBasicStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicStatement_in_ruleStatement3544);
                    this_BasicStatement_0=ruleBasicStatement();

                    state._fsp--;

                     
                            current = this_BasicStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1592:5: this_QualifiedStatement_1= ruleQualifiedStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getQualifiedStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQualifiedStatement_in_ruleStatement3571);
                    this_QualifiedStatement_1=ruleQualifiedStatement();

                    state._fsp--;

                     
                            current = this_QualifiedStatement_1; 
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


    // $ANTLR start "entryRuleBasicStatement"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1608:1: entryRuleBasicStatement returns [EObject current=null] : iv_ruleBasicStatement= ruleBasicStatement EOF ;
    public final EObject entryRuleBasicStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicStatement = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1609:2: (iv_ruleBasicStatement= ruleBasicStatement EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1610:2: iv_ruleBasicStatement= ruleBasicStatement EOF
            {
             newCompositeNode(grammarAccess.getBasicStatementRule()); 
            pushFollow(FOLLOW_ruleBasicStatement_in_entryRuleBasicStatement3606);
            iv_ruleBasicStatement=ruleBasicStatement();

            state._fsp--;

             current =iv_ruleBasicStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicStatement3616); 

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
    // $ANTLR end "entryRuleBasicStatement"


    // $ANTLR start "ruleBasicStatement"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1617:1: ruleBasicStatement returns [EObject current=null] : (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_Assignment_2= ruleAssignment | this_ForLoop_3= ruleForLoop ) ;
    public final EObject ruleBasicStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Conditional_0 = null;

        EObject this_Operation_1 = null;

        EObject this_Assignment_2 = null;

        EObject this_ForLoop_3 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1620:28: ( (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_Assignment_2= ruleAssignment | this_ForLoop_3= ruleForLoop ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1621:1: (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_Assignment_2= ruleAssignment | this_ForLoop_3= ruleForLoop )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1621:1: (this_Conditional_0= ruleConditional | this_Operation_1= ruleOperation | this_Assignment_2= ruleAssignment | this_ForLoop_3= ruleForLoop )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==29) ) {
                    alt27=2;
                }
                else if ( (LA27_2==25) ) {
                    alt27=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1622:5: this_Conditional_0= ruleConditional
                    {
                     
                            newCompositeNode(grammarAccess.getBasicStatementAccess().getConditionalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConditional_in_ruleBasicStatement3663);
                    this_Conditional_0=ruleConditional();

                    state._fsp--;

                     
                            current = this_Conditional_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1632:5: this_Operation_1= ruleOperation
                    {
                     
                            newCompositeNode(grammarAccess.getBasicStatementAccess().getOperationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOperation_in_ruleBasicStatement3690);
                    this_Operation_1=ruleOperation();

                    state._fsp--;

                     
                            current = this_Operation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1642:5: this_Assignment_2= ruleAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getBasicStatementAccess().getAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAssignment_in_ruleBasicStatement3717);
                    this_Assignment_2=ruleAssignment();

                    state._fsp--;

                     
                            current = this_Assignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1652:5: this_ForLoop_3= ruleForLoop
                    {
                     
                            newCompositeNode(grammarAccess.getBasicStatementAccess().getForLoopParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleForLoop_in_ruleBasicStatement3744);
                    this_ForLoop_3=ruleForLoop();

                    state._fsp--;

                     
                            current = this_ForLoop_3; 
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
    // $ANTLR end "ruleBasicStatement"


    // $ANTLR start "entryRuleForLoop"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1668:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1669:2: (iv_ruleForLoop= ruleForLoop EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1670:2: iv_ruleForLoop= ruleForLoop EOF
            {
             newCompositeNode(grammarAccess.getForLoopRule()); 
            pushFollow(FOLLOW_ruleForLoop_in_entryRuleForLoop3779);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;

             current =iv_ruleForLoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForLoop3789); 

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
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1677:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_shared_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleStatement ) )* otherlv_10= '}' ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_variable_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_shared_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1680:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_shared_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleStatement ) )* otherlv_10= '}' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1681:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_shared_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleStatement ) )* otherlv_10= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1681:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_shared_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleStatement ) )* otherlv_10= '}' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1681:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_shared_6_0= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleStatement ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleForLoop3826); 

                	newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleForLoop3838); 

                	newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1689:1: ( (lv_variable_2_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1690:1: (lv_variable_2_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1690:1: (lv_variable_2_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1691:3: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForLoop3855); 

            			newLeafNode(lv_variable_2_0, grammarAccess.getForLoopAccess().getVariableIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForLoopRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleForLoop3872); 

                	newLeafNode(otherlv_3, grammarAccess.getForLoopAccess().getColonKeyword_3());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1711:1: ( (otherlv_4= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1712:1: (otherlv_4= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1712:1: (otherlv_4= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1713:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getForLoopRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForLoop3892); 

            		newLeafNode(otherlv_4, grammarAccess.getForLoopAccess().getQualifierScopeDefiningElementCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleForLoop3904); 

                	newLeafNode(otherlv_5, grammarAccess.getForLoopAccess().getFullStopKeyword_5());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1728:1: ( (lv_shared_6_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1729:1: (lv_shared_6_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1729:1: (lv_shared_6_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1730:3: lv_shared_6_0= RULE_ID
            {
            lv_shared_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForLoop3921); 

            			newLeafNode(lv_shared_6_0, grammarAccess.getForLoopAccess().getSharedIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForLoopRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"shared",
                    		lv_shared_6_0, 
                    		"ID");
            	    

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleForLoop3938); 

                	newLeafNode(otherlv_7, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleForLoop3950); 

                	newLeafNode(otherlv_8, grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_8());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1754:1: ( (lv_body_9_0= ruleStatement ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==37||LA28_0==39||LA28_0==41) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1755:1: (lv_body_9_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1755:1: (lv_body_9_0= ruleStatement )
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1756:3: lv_body_9_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForLoopAccess().getBodyStatementParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleForLoop3971);
            	    lv_body_9_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getForLoopRule());
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
            	    break loop28;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleForLoop3984); 

                	newLeafNode(otherlv_10, grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleConditional"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1784:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1785:2: (iv_ruleConditional= ruleConditional EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1786:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional4020);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional4030); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1793:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_thenBranch_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )? ) ;
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
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1796:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_thenBranch_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )? ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1797:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_thenBranch_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )? )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1797:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_thenBranch_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )? )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1797:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_thenBranch_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleConditional4067); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleConditional4079); 

                	newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1805:1: ( (lv_condition_2_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1806:1: (lv_condition_2_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1806:1: (lv_condition_2_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1807:3: lv_condition_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getConditionalAccess().getConditionExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleConditional4100);
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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleConditional4112); 

                	newLeafNode(otherlv_3, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleConditional4124); 

                	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_4());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1831:1: ( (lv_thenBranch_5_0= ruleStatement ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==37||LA29_0==39||LA29_0==41) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1832:1: (lv_thenBranch_5_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1832:1: (lv_thenBranch_5_0= ruleStatement )
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1833:3: lv_thenBranch_5_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionalAccess().getThenBranchStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleConditional4145);
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
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleConditional4158); 

                	newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_6());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1853:1: (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1853:3: otherlv_7= 'else' otherlv_8= '{' ( (lv_elseBranch_9_0= ruleStatement ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleConditional4171); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionalAccess().getElseKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleConditional4183); 

                        	newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1861:1: ( (lv_elseBranch_9_0= ruleStatement ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID||LA30_0==37||LA30_0==39||LA30_0==41) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1862:1: (lv_elseBranch_9_0= ruleStatement )
                    	    {
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1862:1: (lv_elseBranch_9_0= ruleStatement )
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1863:3: lv_elseBranch_9_0= ruleStatement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConditionalAccess().getElseBranchStatementParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleConditional4204);
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
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleConditional4217); 

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


    // $ANTLR start "entryRuleQualifiedStatement"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1891:1: entryRuleQualifiedStatement returns [EObject current=null] : iv_ruleQualifiedStatement= ruleQualifiedStatement EOF ;
    public final EObject entryRuleQualifiedStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedStatement = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1892:2: (iv_ruleQualifiedStatement= ruleQualifiedStatement EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1893:2: iv_ruleQualifiedStatement= ruleQualifiedStatement EOF
            {
             newCompositeNode(grammarAccess.getQualifiedStatementRule()); 
            pushFollow(FOLLOW_ruleQualifiedStatement_in_entryRuleQualifiedStatement4255);
            iv_ruleQualifiedStatement=ruleQualifiedStatement();

            state._fsp--;

             current =iv_ruleQualifiedStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedStatement4265); 

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
    // $ANTLR end "entryRuleQualifiedStatement"


    // $ANTLR start "ruleQualifiedStatement"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1900:1: ruleQualifiedStatement returns [EObject current=null] : ( ( ( (lv_self_0_0= 'self' ) ) | ( (otherlv_1= RULE_ID ) ) ) ( ( (lv_statement_2_1= ruleOperationActivation | lv_statement_2_2= ruleOperationInhibit | lv_statement_2_3= ruleModuleConditional ) ) ) ) ;
    public final EObject ruleQualifiedStatement() throws RecognitionException {
        EObject current = null;

        Token lv_self_0_0=null;
        Token otherlv_1=null;
        EObject lv_statement_2_1 = null;

        EObject lv_statement_2_2 = null;

        EObject lv_statement_2_3 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1903:28: ( ( ( ( (lv_self_0_0= 'self' ) ) | ( (otherlv_1= RULE_ID ) ) ) ( ( (lv_statement_2_1= ruleOperationActivation | lv_statement_2_2= ruleOperationInhibit | lv_statement_2_3= ruleModuleConditional ) ) ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1904:1: ( ( ( (lv_self_0_0= 'self' ) ) | ( (otherlv_1= RULE_ID ) ) ) ( ( (lv_statement_2_1= ruleOperationActivation | lv_statement_2_2= ruleOperationInhibit | lv_statement_2_3= ruleModuleConditional ) ) ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1904:1: ( ( ( (lv_self_0_0= 'self' ) ) | ( (otherlv_1= RULE_ID ) ) ) ( ( (lv_statement_2_1= ruleOperationActivation | lv_statement_2_2= ruleOperationInhibit | lv_statement_2_3= ruleModuleConditional ) ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1904:2: ( ( (lv_self_0_0= 'self' ) ) | ( (otherlv_1= RULE_ID ) ) ) ( ( (lv_statement_2_1= ruleOperationActivation | lv_statement_2_2= ruleOperationInhibit | lv_statement_2_3= ruleModuleConditional ) ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1904:2: ( ( (lv_self_0_0= 'self' ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1904:3: ( (lv_self_0_0= 'self' ) )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1904:3: ( (lv_self_0_0= 'self' ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1905:1: (lv_self_0_0= 'self' )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1905:1: (lv_self_0_0= 'self' )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1906:3: lv_self_0_0= 'self'
                    {
                    lv_self_0_0=(Token)match(input,41,FOLLOW_41_in_ruleQualifiedStatement4309); 

                            newLeafNode(lv_self_0_0, grammarAccess.getQualifiedStatementAccess().getSelfSelfKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQualifiedStatementRule());
                    	        }
                           		setWithLastConsumed(current, "self", true, "self");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1920:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1920:6: ( (otherlv_1= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1921:1: (otherlv_1= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1921:1: (otherlv_1= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1922:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQualifiedStatementRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedStatement4348); 

                    		newLeafNode(otherlv_1, grammarAccess.getQualifiedStatementAccess().getQualifierScopeDefiningElementCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1933:3: ( ( (lv_statement_2_1= ruleOperationActivation | lv_statement_2_2= ruleOperationInhibit | lv_statement_2_3= ruleModuleConditional ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1934:1: ( (lv_statement_2_1= ruleOperationActivation | lv_statement_2_2= ruleOperationInhibit | lv_statement_2_3= ruleModuleConditional ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1934:1: ( (lv_statement_2_1= ruleOperationActivation | lv_statement_2_2= ruleOperationInhibit | lv_statement_2_3= ruleModuleConditional ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1935:1: (lv_statement_2_1= ruleOperationActivation | lv_statement_2_2= ruleOperationInhibit | lv_statement_2_3= ruleModuleConditional )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1935:1: (lv_statement_2_1= ruleOperationActivation | lv_statement_2_2= ruleOperationInhibit | lv_statement_2_3= ruleModuleConditional )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==39) ) {
                    alt33=3;
                }
                else if ( (LA33_1==RULE_ID) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==42) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1936:3: lv_statement_2_1= ruleOperationActivation
                    {
                     
                    	        newCompositeNode(grammarAccess.getQualifiedStatementAccess().getStatementOperationActivationParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperationActivation_in_ruleQualifiedStatement4372);
                    lv_statement_2_1=ruleOperationActivation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQualifiedStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"statement",
                            		lv_statement_2_1, 
                            		"OperationActivation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1951:8: lv_statement_2_2= ruleOperationInhibit
                    {
                     
                    	        newCompositeNode(grammarAccess.getQualifiedStatementAccess().getStatementOperationInhibitParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleOperationInhibit_in_ruleQualifiedStatement4391);
                    lv_statement_2_2=ruleOperationInhibit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQualifiedStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"statement",
                            		lv_statement_2_2, 
                            		"OperationInhibit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1966:8: lv_statement_2_3= ruleModuleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getQualifiedStatementAccess().getStatementModuleConditionalParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleModuleConditional_in_ruleQualifiedStatement4410);
                    lv_statement_2_3=ruleModuleConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQualifiedStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"statement",
                            		lv_statement_2_3, 
                            		"ModuleConditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleQualifiedStatement"


    // $ANTLR start "entryRuleOperationActivation"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1992:1: entryRuleOperationActivation returns [EObject current=null] : iv_ruleOperationActivation= ruleOperationActivation EOF ;
    public final EObject entryRuleOperationActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationActivation = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1993:2: (iv_ruleOperationActivation= ruleOperationActivation EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:1994:2: iv_ruleOperationActivation= ruleOperationActivation EOF
            {
             newCompositeNode(grammarAccess.getOperationActivationRule()); 
            pushFollow(FOLLOW_ruleOperationActivation_in_entryRuleOperationActivation4449);
            iv_ruleOperationActivation=ruleOperationActivation();

            state._fsp--;

             current =iv_ruleOperationActivation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationActivation4459); 

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
    // $ANTLR end "entryRuleOperationActivation"


    // $ANTLR start "ruleOperationActivation"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2001:1: ruleOperationActivation returns [EObject current=null] : (otherlv_0= '.' ( (lv_operation_1_0= ruleOperation ) ) ) ;
    public final EObject ruleOperationActivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operation_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2004:28: ( (otherlv_0= '.' ( (lv_operation_1_0= ruleOperation ) ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2005:1: (otherlv_0= '.' ( (lv_operation_1_0= ruleOperation ) ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2005:1: (otherlv_0= '.' ( (lv_operation_1_0= ruleOperation ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2005:3: otherlv_0= '.' ( (lv_operation_1_0= ruleOperation ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleOperationActivation4496); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationActivationAccess().getFullStopKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2009:1: ( (lv_operation_1_0= ruleOperation ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2010:1: (lv_operation_1_0= ruleOperation )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2010:1: (lv_operation_1_0= ruleOperation )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2011:3: lv_operation_1_0= ruleOperation
            {
             
            	        newCompositeNode(grammarAccess.getOperationActivationAccess().getOperationOperationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOperation_in_ruleOperationActivation4517);
            lv_operation_1_0=ruleOperation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationActivationRule());
            	        }
                   		set(
                   			current, 
                   			"operation",
                    		lv_operation_1_0, 
                    		"Operation");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleOperationActivation"


    // $ANTLR start "entryRuleOperationInhibit"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2035:1: entryRuleOperationInhibit returns [EObject current=null] : iv_ruleOperationInhibit= ruleOperationInhibit EOF ;
    public final EObject entryRuleOperationInhibit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationInhibit = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2036:2: (iv_ruleOperationInhibit= ruleOperationInhibit EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2037:2: iv_ruleOperationInhibit= ruleOperationInhibit EOF
            {
             newCompositeNode(grammarAccess.getOperationInhibitRule()); 
            pushFollow(FOLLOW_ruleOperationInhibit_in_entryRuleOperationInhibit4553);
            iv_ruleOperationInhibit=ruleOperationInhibit();

            state._fsp--;

             current =iv_ruleOperationInhibit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationInhibit4563); 

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
    // $ANTLR end "entryRuleOperationInhibit"


    // $ANTLR start "ruleOperationInhibit"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2044:1: ruleOperationInhibit returns [EObject current=null] : (otherlv_0= '!' ( (lv_operation_1_0= ruleOperation ) ) ) ;
    public final EObject ruleOperationInhibit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operation_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2047:28: ( (otherlv_0= '!' ( (lv_operation_1_0= ruleOperation ) ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2048:1: (otherlv_0= '!' ( (lv_operation_1_0= ruleOperation ) ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2048:1: (otherlv_0= '!' ( (lv_operation_1_0= ruleOperation ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2048:3: otherlv_0= '!' ( (lv_operation_1_0= ruleOperation ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleOperationInhibit4600); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationInhibitAccess().getExclamationMarkKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2052:1: ( (lv_operation_1_0= ruleOperation ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2053:1: (lv_operation_1_0= ruleOperation )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2053:1: (lv_operation_1_0= ruleOperation )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2054:3: lv_operation_1_0= ruleOperation
            {
             
            	        newCompositeNode(grammarAccess.getOperationInhibitAccess().getOperationOperationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOperation_in_ruleOperationInhibit4621);
            lv_operation_1_0=ruleOperation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationInhibitRule());
            	        }
                   		set(
                   			current, 
                   			"operation",
                    		lv_operation_1_0, 
                    		"Operation");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleOperationInhibit"


    // $ANTLR start "entryRuleModuleConditional"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2078:1: entryRuleModuleConditional returns [EObject current=null] : iv_ruleModuleConditional= ruleModuleConditional EOF ;
    public final EObject entryRuleModuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleConditional = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2079:2: (iv_ruleModuleConditional= ruleModuleConditional EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2080:2: iv_ruleModuleConditional= ruleModuleConditional EOF
            {
             newCompositeNode(grammarAccess.getModuleConditionalRule()); 
            pushFollow(FOLLOW_ruleModuleConditional_in_entryRuleModuleConditional4657);
            iv_ruleModuleConditional=ruleModuleConditional();

            state._fsp--;

             current =iv_ruleModuleConditional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleConditional4667); 

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
    // $ANTLR end "entryRuleModuleConditional"


    // $ANTLR start "ruleModuleConditional"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2087:1: ruleModuleConditional returns [EObject current=null] : (otherlv_0= '.' ( (lv_conditional_1_0= ruleConditional ) ) ) ;
    public final EObject ruleModuleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_conditional_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2090:28: ( (otherlv_0= '.' ( (lv_conditional_1_0= ruleConditional ) ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2091:1: (otherlv_0= '.' ( (lv_conditional_1_0= ruleConditional ) ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2091:1: (otherlv_0= '.' ( (lv_conditional_1_0= ruleConditional ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2091:3: otherlv_0= '.' ( (lv_conditional_1_0= ruleConditional ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleModuleConditional4704); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleConditionalAccess().getFullStopKeyword_0());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2095:1: ( (lv_conditional_1_0= ruleConditional ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2096:1: (lv_conditional_1_0= ruleConditional )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2096:1: (lv_conditional_1_0= ruleConditional )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2097:3: lv_conditional_1_0= ruleConditional
            {
             
            	        newCompositeNode(grammarAccess.getModuleConditionalAccess().getConditionalConditionalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConditional_in_ruleModuleConditional4725);
            lv_conditional_1_0=ruleConditional();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleConditionalRule());
            	        }
                   		set(
                   			current, 
                   			"conditional",
                    		lv_conditional_1_0, 
                    		"Conditional");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleModuleConditional"


    // $ANTLR start "entryRuleOperation"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2121:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2122:2: (iv_ruleOperation= ruleOperation EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2123:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation4761);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation4771); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2130:1: ruleOperation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2133:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' otherlv_6= ';' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2134:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' otherlv_6= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2134:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' otherlv_6= ';' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2134:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )? otherlv_5= ')' otherlv_6= ';'
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2134:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2135:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2135:1: (lv_name_0_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2136:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation4813); 

            			newLeafNode(lv_name_0_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleOperation4830); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2156:1: ( ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_INT)||LA35_0==29||LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2156:2: ( (lv_arguments_2_0= ruleExpr ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )*
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2156:2: ( (lv_arguments_2_0= ruleExpr ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2157:1: (lv_arguments_2_0= ruleExpr )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2157:1: (lv_arguments_2_0= ruleExpr )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2158:3: lv_arguments_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getArgumentsExprParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleOperation4852);
                    lv_arguments_2_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_2_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2174:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==17) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2174:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleOperation4865); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2178:1: ( (lv_arguments_4_0= ruleExpr ) )
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2179:1: (lv_arguments_4_0= ruleExpr )
                    	    {
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2179:1: (lv_arguments_4_0= ruleExpr )
                    	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2180:3: lv_arguments_4_0= ruleExpr
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getArgumentsExprParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleOperation4886);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleOperation4902); 

                	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getRightParenthesisKeyword_3());
                
            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleOperation4914); 

                	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getSemicolonKeyword_4());
                

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


    // $ANTLR start "entryRuleAssignment"
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2212:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2213:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2214:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment4950);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment4960); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2221:1: ruleAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2224:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2225:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2225:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2225:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';'
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2225:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2226:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2226:1: (lv_name_0_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2227:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment5002); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAssignment5019); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2247:1: ( (lv_exp_2_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2248:1: (lv_exp_2_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2248:1: (lv_exp_2_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2249:3: lv_exp_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAssignment5040);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleAssignment5052); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2277:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2278:2: (iv_ruleValue= ruleValue EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2279:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue5088);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue5098); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2286:1: ruleValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2289:28: ( ( ( (lv_value_0_0= RULE_INT ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) ) ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2290:1: ( ( (lv_value_0_0= RULE_INT ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) ) )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2290:1: ( ( (lv_value_0_0= RULE_INT ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            else if ( (LA36_0==43) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2290:2: ( (lv_value_0_0= RULE_INT ) )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2290:2: ( (lv_value_0_0= RULE_INT ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2291:1: (lv_value_0_0= RULE_INT )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2291:1: (lv_value_0_0= RULE_INT )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2292:3: lv_value_0_0= RULE_INT
                    {
                    lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue5140); 

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
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2309:6: (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2309:6: (otherlv_1= '@' ( (otherlv_2= RULE_ID ) ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2309:8: otherlv_1= '@' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleValue5164); 

                        	newLeafNode(otherlv_1, grammarAccess.getValueAccess().getCommercialAtKeyword_1_0());
                        
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2313:1: ( (otherlv_2= RULE_ID ) )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2314:1: (otherlv_2= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2314:1: (otherlv_2= RULE_ID )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2315:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue5184); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2334:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2335:2: (iv_ruleUpdate= ruleUpdate EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2336:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_ruleUpdate_in_entryRuleUpdate5221);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdate5231); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2343:1: ruleUpdate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'update' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) ) ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_body_4_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2346:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'update' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) ) ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2347:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'update' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) ) ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2347:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'update' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) ) ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2347:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'update' otherlv_3= '{' ( (lv_body_4_0= ruleStatement ) ) ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '}'
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2347:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2348:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2348:1: (lv_name_0_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2349:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdate5273); 

            			newLeafNode(lv_name_0_0, grammarAccess.getUpdateAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUpdateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleUpdate5290); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getFullStopKeyword_1());
                
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleUpdate5302); 

                	newLeafNode(otherlv_2, grammarAccess.getUpdateAccess().getUpdateKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUpdate5314); 

                	newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2377:1: ( (lv_body_4_0= ruleStatement ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2378:1: (lv_body_4_0= ruleStatement )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2378:1: (lv_body_4_0= ruleStatement )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2379:3: lv_body_4_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getUpdateAccess().getBodyStatementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleUpdate5335);
            lv_body_4_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUpdateRule());
            	        }
                   		add(
                   			current, 
                   			"body",
                    		lv_body_4_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2395:2: ( (lv_body_5_0= ruleStatement ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==37||LA37_0==39||LA37_0==41) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2396:1: (lv_body_5_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2396:1: (lv_body_5_0= ruleStatement )
            	    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2397:3: lv_body_5_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateAccess().getBodyStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleUpdate5356);
            	    lv_body_5_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpdateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_5_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleUpdate5369); 

                	newLeafNode(otherlv_6, grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2425:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2426:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2427:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
             newCompositeNode(grammarAccess.getConstantDefinitionRule()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition5405);
            iv_ruleConstantDefinition=ruleConstantDefinition();

            state._fsp--;

             current =iv_ruleConstantDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition5415); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2434:1: ruleConstantDefinition returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'constant' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2437:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'constant' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2438:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'constant' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2438:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'constant' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2438:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'constant' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2438:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2439:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2439:1: (lv_abstract_0_0= 'abstract' )
                    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2440:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,21,FOLLOW_21_in_ruleConstantDefinition5458); 

                            newLeafNode(lv_abstract_0_0, grammarAccess.getConstantDefinitionAccess().getAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleConstantDefinition5484); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantDefinitionAccess().getConstantKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2457:1: ( (otherlv_2= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2458:1: (otherlv_2= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2458:1: (otherlv_2= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2459:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantDefinitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinition5504); 

            		newLeafNode(otherlv_2, grammarAccess.getConstantDefinitionAccess().getTypeLocalTypeCrossReference_2_0()); 
            	

            }


            }

            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2470:2: ( (lv_name_3_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2471:1: (lv_name_3_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2471:1: (lv_name_3_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2472:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinition5521); 

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

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleConstantDefinition5538); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2500:1: entryRuleConstantAssignment returns [EObject current=null] : iv_ruleConstantAssignment= ruleConstantAssignment EOF ;
    public final EObject entryRuleConstantAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantAssignment = null;


        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2501:2: (iv_ruleConstantAssignment= ruleConstantAssignment EOF )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2502:2: iv_ruleConstantAssignment= ruleConstantAssignment EOF
            {
             newCompositeNode(grammarAccess.getConstantAssignmentRule()); 
            pushFollow(FOLLOW_ruleConstantAssignment_in_entryRuleConstantAssignment5574);
            iv_ruleConstantAssignment=ruleConstantAssignment();

            state._fsp--;

             current =iv_ruleConstantAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantAssignment5584); 

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
    // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2509:1: ruleConstantAssignment returns [EObject current=null] : ( ( (lv_lhs_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleExpr ) ) otherlv_3= ';' ) ;
    public final EObject ruleConstantAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_lhs_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2512:28: ( ( ( (lv_lhs_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleExpr ) ) otherlv_3= ';' ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2513:1: ( ( (lv_lhs_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleExpr ) ) otherlv_3= ';' )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2513:1: ( ( (lv_lhs_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleExpr ) ) otherlv_3= ';' )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2513:2: ( (lv_lhs_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleExpr ) ) otherlv_3= ';'
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2513:2: ( (lv_lhs_0_0= RULE_ID ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2514:1: (lv_lhs_0_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2514:1: (lv_lhs_0_0= RULE_ID )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2515:3: lv_lhs_0_0= RULE_ID
            {
            lv_lhs_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantAssignment5626); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleConstantAssignment5643); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2535:1: ( (lv_rhs_2_0= ruleExpr ) )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2536:1: (lv_rhs_2_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2536:1: (lv_rhs_2_0= ruleExpr )
            // ../dk.sdu.mmmi.modular.roco2/src-gen/dk/sdu/mmmi/modular/roco2/parser/antlr/internal/InternalRoco2.g:2537:3: lv_rhs_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getConstantAssignmentAccess().getRhsExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleConstantAssignment5664);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleConstantAssignment5676); 

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\12\uffff";
    static final String DFA13_minS =
        "\2\4\3\uffff\1\14\4\uffff";
    static final String DFA13_maxS =
        "\1\55\1\34\3\uffff\1\35\4\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\6\1\uffff\1\7\1\5\1\4\1\1";
    static final String DFA13_specialS =
        "\12\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\20\uffff\1\4\4\uffff\1\2\1\3\21\uffff\1\4",
            "\1\5\24\uffff\1\6\2\uffff\1\7",
            "",
            "",
            "",
            "\1\11\14\uffff\1\11\3\uffff\1\10",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "657:1: (this_Field_0= ruleField | this_Require_1= ruleRequire | this_Behavior_2= ruleBehavior | this_Method_3= ruleMethod | this_Update_4= ruleUpdate | this_ConstantDefinition_5= ruleConstantDefinition | this_ConstantAssignment_6= ruleConstantAssignment )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProgram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram156 = new BitSet(new long[]{0x0000000000E8E002L});
    public static final BitSet FOLLOW_ruleExternalName_in_ruleProgram177 = new BitSet(new long[]{0x0000000000E8E002L});
    public static final BitSet FOLLOW_ruleLocalType_in_ruleProgram199 = new BitSet(new long[]{0x0000000000E8C002L});
    public static final BitSet FOLLOW_ruleExternalName_in_entryRuleExternalName236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalName246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExternalName283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalName300 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExternalName317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalType_in_entryRuleLocalType353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalType363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleLocalType410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeDefiningElement_in_ruleLocalType437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeDefiningElement_in_entryRuleScopeDefiningElement472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopeDefiningElement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDef_in_ruleScopeDefiningElement529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnsemble_in_ruleScopeDefiningElement556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleScopeDefiningElement583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTypeDef665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDef682 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDef699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDef_in_entryRuleEnumDef735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDef745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEnumDef782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDef799 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumDef816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDef833 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleEnumDef851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDef868 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleEnumDef887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnsemble_in_entryRuleEnsemble923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnsemble933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEnsemble970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnsemble987 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleEnsemble1005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnsemble1025 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnsemble1039 = new BitSet(new long[]{0x000020000C240010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleEnsemble1060 = new BitSet(new long[]{0x000020000C240010L});
    public static final BitSet FOLLOW_18_in_ruleEnsemble1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRole1162 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleRole1194 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRole1220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole1237 = new BitSet(new long[]{0x0000000001110000L});
    public static final BitSet FOLLOW_20_in_ruleRole1255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole1275 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_24_in_ruleRole1290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole1310 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRole1324 = new BitSet(new long[]{0x000020000C240010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleRole1345 = new BitSet(new long[]{0x000020000C240010L});
    public static final BitSet FOLLOW_18_in_ruleRole1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember1394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleMember1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequire_in_ruleMember1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_ruleMember1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMember1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_ruleMember1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleMember1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantAssignment_in_ruleMember1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1720 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_25_in_ruleField1738 = new BitSet(new long[]{0x0000080020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleField1759 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleField1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequire_in_entryRuleRequire1809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequire1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRequire1856 = new BitSet(new long[]{0x0000080020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleRequire1877 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRequire1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior1925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehavior1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBehavior1972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBehavior1993 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleBehavior2005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBehavior2024 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBehavior2041 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleBehavior2063 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleBehavior2076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleBehavior2097 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleBehavior2113 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBehavior2125 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBehavior2146 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_18_in_ruleBehavior2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod2308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2380 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMethod2397 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2419 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleMethod2432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2453 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleMethod2469 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMethod2481 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleMethod2502 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_18_in_ruleMethod2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpr_in_ruleExpr2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleExpr2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleExpr2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalQualifiedName_in_ruleExpr2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_ruleExpr2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable2751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariable2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariable2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalQualifiedName_in_entryRuleInternalQualifiedName2842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalQualifiedName2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInternalQualifiedName2897 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInternalQualifiedName2909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInternalQualifiedName2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExpr_in_entryRuleBinaryExpr2967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryExpr2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBinaryExpr3014 = new BitSet(new long[]{0x0000080020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleBinaryExpr3035 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_ruleBinaryExpr3056 = new BitSet(new long[]{0x0000080020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleBinaryExpr3077 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleBinaryExpr3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperator_in_entryRuleBinaryOperator3126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperator3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBinaryOperator3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBinaryOperator3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBinaryOperator3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBinaryOperator3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBinaryOperator3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBinaryOperator3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall3310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionCall3362 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionCall3379 = new BitSet(new long[]{0x0000080060000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFunctionCall3401 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionCall3414 = new BitSet(new long[]{0x0000080020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFunctionCall3435 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionCall3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement3487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_ruleStatement3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedStatement_in_ruleStatement3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_entryRuleBasicStatement3606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicStatement3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleBasicStatement3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleBasicStatement3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleBasicStatement3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForLoop_in_ruleBasicStatement3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForLoop_in_entryRuleForLoop3779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForLoop3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleForLoop3826 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleForLoop3838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForLoop3855 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleForLoop3872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForLoop3892 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleForLoop3904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForLoop3921 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleForLoop3938 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleForLoop3950 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleForLoop3971 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_18_in_ruleForLoop3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional4020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleConditional4067 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConditional4079 = new BitSet(new long[]{0x0000080020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleConditional4100 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleConditional4112 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConditional4124 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleConditional4145 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_18_in_ruleConditional4158 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleConditional4171 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConditional4183 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleConditional4204 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_18_in_ruleConditional4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedStatement_in_entryRuleQualifiedStatement4255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedStatement4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleQualifiedStatement4309 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedStatement4348 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_ruleOperationActivation_in_ruleQualifiedStatement4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationInhibit_in_ruleQualifiedStatement4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleConditional_in_ruleQualifiedStatement4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationActivation_in_entryRuleOperationActivation4449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationActivation4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOperationActivation4496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleOperationActivation4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationInhibit_in_entryRuleOperationInhibit4553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationInhibit4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperationInhibit4600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleOperationInhibit4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleConditional_in_entryRuleModuleConditional4657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleConditional4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleModuleConditional4704 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleModuleConditional4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation4761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4813 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOperation4830 = new BitSet(new long[]{0x0000080060000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleOperation4852 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleOperation4865 = new BitSet(new long[]{0x0000080020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleOperation4886 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleOperation4902 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOperation4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment4950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment5002 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssignment5019 = new BitSet(new long[]{0x0000080020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssignment5040 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssignment5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue5088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleValue5164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdate_in_entryRuleUpdate5221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdate5231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdate5273 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleUpdate5290 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleUpdate5302 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUpdate5314 = new BitSet(new long[]{0x000002A000000010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleUpdate5335 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleUpdate5356 = new BitSet(new long[]{0x000002A000040010L});
    public static final BitSet FOLLOW_18_in_ruleUpdate5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition5405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleConstantDefinition5458 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleConstantDefinition5484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition5504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition5521 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstantDefinition5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantAssignment_in_entryRuleConstantAssignment5574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantAssignment5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantAssignment5626 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConstantAssignment5643 = new BitSet(new long[]{0x0000080020000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleConstantAssignment5664 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstantAssignment5676 = new BitSet(new long[]{0x0000000000000002L});

}