package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDsl01GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDsl01Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'abstract'", "'entity'", "'extends'", "'{'", "'}'", "'att'", "':'", "'optional'", "'ref'", "'opposite='", "'ListWindow'", "'for'", "'title'", "'EntryWindow'", "'size='", "'('", "','", "')'", "'bounds='", "'Label'", "'Field'", "'Button'", "'String'", "'Integer'", "'Date'", "'[1]'", "'[*]'", "'createEdit'", "'delete'", "'cancel'"
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
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMyDsl01Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDsl01Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDsl01Parser.tokenNames; }
    public String getGrammarFileName() { return "../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g"; }



     	private MyDsl01GrammarAccess grammarAccess;
     	
        public InternalMyDsl01Parser(TokenStream input, MyDsl01GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDsl01GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_windows_1_0= ruleWindow ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_windows_1_0 = null;


         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:80:28: ( ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_windows_1_0= ruleWindow ) )* ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:81:1: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_windows_1_0= ruleWindow ) )* )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:81:1: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_windows_1_0= ruleWindow ) )* )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:81:2: ( (lv_entities_0_0= ruleEntity ) )* ( (lv_windows_1_0= ruleWindow ) )*
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:81:2: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:82:1: (lv_entities_0_0= ruleEntity )
            	    {
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:82:1: (lv_entities_0_0= ruleEntity )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:83:3: lv_entities_0_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleModel131);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_0_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:99:3: ( (lv_windows_1_0= ruleWindow ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21||LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:100:1: (lv_windows_1_0= ruleWindow )
            	    {
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:100:1: (lv_windows_1_0= ruleWindow )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:101:3: lv_windows_1_0= ruleWindow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getWindowsWindowParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWindow_in_ruleModel153);
            	    lv_windows_1_0=ruleWindow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"windows",
            	            		lv_windows_1_0, 
            	            		"Window");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:127:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:128:2: (iv_ruleEntity= ruleEntity EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:129:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity192);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity202); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:136:1: ruleEntity returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_properties_6_0 = null;


         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:139:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:140:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:140:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:140:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}'
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:140:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:141:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:141:1: (lv_abstract_0_0= 'abstract' )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:142:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,11,FOLLOW_11_in_ruleEntity245); 

                            newLeafNode(lv_abstract_0_0, grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleEntity271); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:159:1: ( (lv_name_2_0= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:160:1: (lv_name_2_0= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:160:1: (lv_name_2_0= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:161:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity288); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:177:2: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:177:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEntity306); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                        
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:181:1: ( (otherlv_4= RULE_ID ) )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:182:1: (otherlv_4= RULE_ID )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:182:1: (otherlv_4= RULE_ID )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:183:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity326); 

                    		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEntity340); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:198:1: ( (lv_properties_6_0= ruleProperty ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:199:1: (lv_properties_6_0= ruleProperty )
            	    {
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:199:1: (lv_properties_6_0= ruleProperty )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:200:3: lv_properties_6_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity361);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_6_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleEntity374); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProperty"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:228:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:229:2: (iv_ruleProperty= ruleProperty EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:230:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty410);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty420); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:237:1: ruleProperty returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;


         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:240:28: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:241:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:241:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:242:5: this_Attribute_0= ruleAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleProperty467);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;

                     
                            current = this_Attribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:252:5: this_Reference_1= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleProperty494);
                    this_Reference_1=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_1; 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAttribute"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:268:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:269:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:270:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute529);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute539); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:277:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAttributeType ) ) ( (lv_optional_4_0= 'optional' ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_optional_4_0=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:280:28: ( (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAttributeType ) ) ( (lv_optional_4_0= 'optional' ) )? ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:281:1: (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAttributeType ) ) ( (lv_optional_4_0= 'optional' ) )? )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:281:1: (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAttributeType ) ) ( (lv_optional_4_0= 'optional' ) )? )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:281:3: otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAttributeType ) ) ( (lv_optional_4_0= 'optional' ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAttribute576); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttKeyword_0());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:285:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:286:1: (lv_name_1_0= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:286:1: (lv_name_1_0= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute593); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAttribute610); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:307:1: ( (lv_type_3_0= ruleAttributeType ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:308:1: (lv_type_3_0= ruleAttributeType )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:308:1: (lv_type_3_0= ruleAttributeType )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:309:3: lv_type_3_0= ruleAttributeType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeType_in_ruleAttribute631);
            lv_type_3_0=ruleAttributeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AttributeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:325:2: ( (lv_optional_4_0= 'optional' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:326:1: (lv_optional_4_0= 'optional' )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:326:1: (lv_optional_4_0= 'optional' )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:327:3: lv_optional_4_0= 'optional'
                    {
                    lv_optional_4_0=(Token)match(input,18,FOLLOW_18_in_ruleAttribute649); 

                            newLeafNode(lv_optional_4_0, grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:348:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:349:2: (iv_ruleReference= ruleReference EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:350:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference699);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference709); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:357:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicityKind ) )? (otherlv_5= 'opposite=' ( (otherlv_6= RULE_ID ) ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_multiplicity_4_0 = null;


         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:360:28: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicityKind ) )? (otherlv_5= 'opposite=' ( (otherlv_6= RULE_ID ) ) ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:361:1: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicityKind ) )? (otherlv_5= 'opposite=' ( (otherlv_6= RULE_ID ) ) ) )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:361:1: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicityKind ) )? (otherlv_5= 'opposite=' ( (otherlv_6= RULE_ID ) ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:361:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicityKind ) )? (otherlv_5= 'opposite=' ( (otherlv_6= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleReference746); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:365:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:366:1: (lv_name_1_0= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:366:1: (lv_name_1_0= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:367:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference763); 

            			newLeafNode(lv_name_1_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleReference780); 

                	newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_2());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:387:1: ( (otherlv_3= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:388:1: (otherlv_3= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:388:1: (otherlv_3= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:389:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference800); 

            		newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getTypeEntityCrossReference_3_0()); 
            	

            }


            }

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:400:2: ( (lv_multiplicity_4_0= ruleMultiplicityKind ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=36 && LA8_0<=37)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:401:1: (lv_multiplicity_4_0= ruleMultiplicityKind )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:401:1: (lv_multiplicity_4_0= ruleMultiplicityKind )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:402:3: lv_multiplicity_4_0= ruleMultiplicityKind
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceAccess().getMultiplicityMultiplicityKindEnumRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiplicityKind_in_ruleReference821);
                    lv_multiplicity_4_0=ruleMultiplicityKind();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"multiplicity",
                            		lv_multiplicity_4_0, 
                            		"MultiplicityKind");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:418:3: (otherlv_5= 'opposite=' ( (otherlv_6= RULE_ID ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:418:5: otherlv_5= 'opposite=' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleReference835); 

                	newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getOppositeKeyword_5_0());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:422:1: ( (otherlv_6= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:423:1: (otherlv_6= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:423:1: (otherlv_6= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:424:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference855); 

            		newLeafNode(otherlv_6, grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); 
            	

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleWindow"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:443:1: entryRuleWindow returns [EObject current=null] : iv_ruleWindow= ruleWindow EOF ;
    public final EObject entryRuleWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindow = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:444:2: (iv_ruleWindow= ruleWindow EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:445:2: iv_ruleWindow= ruleWindow EOF
            {
             newCompositeNode(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_ruleWindow_in_entryRuleWindow892);
            iv_ruleWindow=ruleWindow();

            state._fsp--;

             current =iv_ruleWindow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWindow902); 

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
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:452:1: ruleWindow returns [EObject current=null] : (this_EntryWindow_0= ruleEntryWindow | this_ListWindow_1= ruleListWindow ) ;
    public final EObject ruleWindow() throws RecognitionException {
        EObject current = null;

        EObject this_EntryWindow_0 = null;

        EObject this_ListWindow_1 = null;


         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:455:28: ( (this_EntryWindow_0= ruleEntryWindow | this_ListWindow_1= ruleListWindow ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:456:1: (this_EntryWindow_0= ruleEntryWindow | this_ListWindow_1= ruleListWindow )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:456:1: (this_EntryWindow_0= ruleEntryWindow | this_ListWindow_1= ruleListWindow )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:457:5: this_EntryWindow_0= ruleEntryWindow
                    {
                     
                            newCompositeNode(grammarAccess.getWindowAccess().getEntryWindowParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntryWindow_in_ruleWindow949);
                    this_EntryWindow_0=ruleEntryWindow();

                    state._fsp--;

                     
                            current = this_EntryWindow_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:467:5: this_ListWindow_1= ruleListWindow
                    {
                     
                            newCompositeNode(grammarAccess.getWindowAccess().getListWindowParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleListWindow_in_ruleWindow976);
                    this_ListWindow_1=ruleListWindow();

                    state._fsp--;

                     
                            current = this_ListWindow_1; 
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
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRuleListWindow"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:483:1: entryRuleListWindow returns [EObject current=null] : iv_ruleListWindow= ruleListWindow EOF ;
    public final EObject entryRuleListWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListWindow = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:484:2: (iv_ruleListWindow= ruleListWindow EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:485:2: iv_ruleListWindow= ruleListWindow EOF
            {
             newCompositeNode(grammarAccess.getListWindowRule()); 
            pushFollow(FOLLOW_ruleListWindow_in_entryRuleListWindow1011);
            iv_ruleListWindow=ruleListWindow();

            state._fsp--;

             current =iv_ruleListWindow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListWindow1021); 

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
    // $ANTLR end "entryRuleListWindow"


    // $ANTLR start "ruleListWindow"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:492:1: ruleListWindow returns [EObject current=null] : (otherlv_0= 'ListWindow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? ( (lv_size_6_0= ruleSize ) ) ) ;
    public final EObject ruleListWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        EObject lv_size_6_0 = null;


         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:495:28: ( (otherlv_0= 'ListWindow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? ( (lv_size_6_0= ruleSize ) ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:496:1: (otherlv_0= 'ListWindow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? ( (lv_size_6_0= ruleSize ) ) )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:496:1: (otherlv_0= 'ListWindow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? ( (lv_size_6_0= ruleSize ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:496:3: otherlv_0= 'ListWindow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? ( (lv_size_6_0= ruleSize ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleListWindow1058); 

                	newLeafNode(otherlv_0, grammarAccess.getListWindowAccess().getListWindowKeyword_0());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:500:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:501:1: (lv_name_1_0= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:501:1: (lv_name_1_0= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:502:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListWindow1075); 

            			newLeafNode(lv_name_1_0, grammarAccess.getListWindowAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListWindowRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleListWindow1092); 

                	newLeafNode(otherlv_2, grammarAccess.getListWindowAccess().getForKeyword_2());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:522:1: ( (otherlv_3= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:523:1: (otherlv_3= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:523:1: (otherlv_3= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:524:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getListWindowRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListWindow1112); 

            		newLeafNode(otherlv_3, grammarAccess.getListWindowAccess().getEntityEntityCrossReference_3_0()); 
            	

            }


            }

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:535:2: (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:535:4: otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleListWindow1125); 

                        	newLeafNode(otherlv_4, grammarAccess.getListWindowAccess().getTitleKeyword_4_0());
                        
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:539:1: ( (lv_title_5_0= RULE_STRING ) )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:540:1: (lv_title_5_0= RULE_STRING )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:540:1: (lv_title_5_0= RULE_STRING )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:541:3: lv_title_5_0= RULE_STRING
                    {
                    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleListWindow1142); 

                    			newLeafNode(lv_title_5_0, grammarAccess.getListWindowAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getListWindowRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:557:4: ( (lv_size_6_0= ruleSize ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:558:1: (lv_size_6_0= ruleSize )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:558:1: (lv_size_6_0= ruleSize )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:559:3: lv_size_6_0= ruleSize
            {
             
            	        newCompositeNode(grammarAccess.getListWindowAccess().getSizeSizeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleSize_in_ruleListWindow1170);
            lv_size_6_0=ruleSize();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListWindowRule());
            	        }
                   		set(
                   			current, 
                   			"size",
                    		lv_size_6_0, 
                    		"Size");
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
    // $ANTLR end "ruleListWindow"


    // $ANTLR start "entryRuleEntryWindow"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:583:1: entryRuleEntryWindow returns [EObject current=null] : iv_ruleEntryWindow= ruleEntryWindow EOF ;
    public final EObject entryRuleEntryWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryWindow = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:584:2: (iv_ruleEntryWindow= ruleEntryWindow EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:585:2: iv_ruleEntryWindow= ruleEntryWindow EOF
            {
             newCompositeNode(grammarAccess.getEntryWindowRule()); 
            pushFollow(FOLLOW_ruleEntryWindow_in_entryRuleEntryWindow1206);
            iv_ruleEntryWindow=ruleEntryWindow();

            state._fsp--;

             current =iv_ruleEntryWindow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryWindow1216); 

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
    // $ANTLR end "entryRuleEntryWindow"


    // $ANTLR start "ruleEntryWindow"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:592:1: ruleEntryWindow returns [EObject current=null] : (otherlv_0= 'EntryWindow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '{' ( (lv_elements_9_0= ruleUIElement ) )* otherlv_10= '}' ) ;
    public final EObject ruleEntryWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_title_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_size_7_0 = null;

        EObject lv_elements_9_0 = null;


         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:595:28: ( (otherlv_0= 'EntryWindow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '{' ( (lv_elements_9_0= ruleUIElement ) )* otherlv_10= '}' ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:596:1: (otherlv_0= 'EntryWindow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '{' ( (lv_elements_9_0= ruleUIElement ) )* otherlv_10= '}' )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:596:1: (otherlv_0= 'EntryWindow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '{' ( (lv_elements_9_0= ruleUIElement ) )* otherlv_10= '}' )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:596:3: otherlv_0= 'EntryWindow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '{' ( (lv_elements_9_0= ruleUIElement ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleEntryWindow1253); 

                	newLeafNode(otherlv_0, grammarAccess.getEntryWindowAccess().getEntryWindowKeyword_0());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:600:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:601:1: (lv_name_1_0= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:601:1: (lv_name_1_0= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:602:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryWindow1270); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntryWindowAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntryWindowRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleEntryWindow1287); 

                	newLeafNode(otherlv_2, grammarAccess.getEntryWindowAccess().getForKeyword_2());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:622:1: ( (otherlv_3= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:623:1: (otherlv_3= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:623:1: (otherlv_3= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:624:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntryWindowRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryWindow1307); 

            		newLeafNode(otherlv_3, grammarAccess.getEntryWindowAccess().getEntityEntityCrossReference_3_0()); 
            	

            }


            }

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:635:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+ {...}?) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:637:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+ {...}?) )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:637:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+ {...}?) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:638:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4());
            	
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:641:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+ {...}?)
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:642:3: ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+ {...}?
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:642:3: ( ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:644:4: ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:644:4: ({...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:645:5: {...}? => ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEntryWindow", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:645:108: ( ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) ) )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:646:6: ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:649:6: ({...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) ) )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:649:7: {...}? => (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEntryWindow", "true");
            	    }
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:649:16: (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:649:18: otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleEntryWindow1365); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEntryWindowAccess().getTitleKeyword_4_0_0());
            	        
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:653:1: ( (lv_title_6_0= RULE_STRING ) )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:654:1: (lv_title_6_0= RULE_STRING )
            	    {
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:654:1: (lv_title_6_0= RULE_STRING )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:655:3: lv_title_6_0= RULE_STRING
            	    {
            	    lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntryWindow1382); 

            	    			newLeafNode(lv_title_6_0, grammarAccess.getEntryWindowAccess().getTitleSTRINGTerminalRuleCall_4_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEntryWindowRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:678:4: ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) )
            	    {
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:678:4: ({...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) ) )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:679:5: {...}? => ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEntryWindow", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:679:108: ( ({...}? => ( (lv_size_7_0= ruleSize ) ) ) )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:680:6: ({...}? => ( (lv_size_7_0= ruleSize ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:683:6: ({...}? => ( (lv_size_7_0= ruleSize ) ) )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:683:7: {...}? => ( (lv_size_7_0= ruleSize ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEntryWindow", "true");
            	    }
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:683:16: ( (lv_size_7_0= ruleSize ) )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:684:1: (lv_size_7_0= ruleSize )
            	    {
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:684:1: (lv_size_7_0= ruleSize )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:685:3: lv_size_7_0= ruleSize
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntryWindowAccess().getSizeSizeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSize_in_ruleEntryWindow1463);
            	    lv_size_7_0=ruleSize();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntryWindowRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"size",
            	            		lv_size_7_0, 
            	            		"Size");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleEntryWindow", "getUnorderedGroupHelper().canLeave(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4());
            	

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleEntryWindow1521); 

                	newLeafNode(otherlv_8, grammarAccess.getEntryWindowAccess().getLeftCurlyBracketKeyword_5());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:720:1: ( (lv_elements_9_0= ruleUIElement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=30 && LA12_0<=32)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:721:1: (lv_elements_9_0= ruleUIElement )
            	    {
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:721:1: (lv_elements_9_0= ruleUIElement )
            	    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:722:3: lv_elements_9_0= ruleUIElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntryWindowAccess().getElementsUIElementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIElement_in_ruleEntryWindow1542);
            	    lv_elements_9_0=ruleUIElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntryWindowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_9_0, 
            	            		"UIElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEntryWindow1555); 

                	newLeafNode(otherlv_10, grammarAccess.getEntryWindowAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleEntryWindow"


    // $ANTLR start "entryRuleSize"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:750:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:751:2: (iv_ruleSize= ruleSize EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:752:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize1591);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize1601); 

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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:759:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size=' otherlv_1= '(' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_width_2_0=null;
        Token otherlv_3=null;
        Token lv_height_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:762:28: ( (otherlv_0= 'size=' otherlv_1= '(' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:763:1: (otherlv_0= 'size=' otherlv_1= '(' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:763:1: (otherlv_0= 'size=' otherlv_1= '(' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')' )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:763:3: otherlv_0= 'size=' otherlv_1= '(' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleSize1638); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSize1650); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getLeftParenthesisKeyword_1());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:771:1: ( (lv_width_2_0= RULE_INT ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:772:1: (lv_width_2_0= RULE_INT )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:772:1: (lv_width_2_0= RULE_INT )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:773:3: lv_width_2_0= RULE_INT
            {
            lv_width_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize1667); 

            			newLeafNode(lv_width_2_0, grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleSize1684); 

                	newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getCommaKeyword_3());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:793:1: ( (lv_height_4_0= RULE_INT ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:794:1: (lv_height_4_0= RULE_INT )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:794:1: (lv_height_4_0= RULE_INT )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:795:3: lv_height_4_0= RULE_INT
            {
            lv_height_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize1701); 

            			newLeafNode(lv_height_4_0, grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleSize1718); 

                	newLeafNode(otherlv_5, grammarAccess.getSizeAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleBounds"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:823:1: entryRuleBounds returns [EObject current=null] : iv_ruleBounds= ruleBounds EOF ;
    public final EObject entryRuleBounds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBounds = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:824:2: (iv_ruleBounds= ruleBounds EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:825:2: iv_ruleBounds= ruleBounds EOF
            {
             newCompositeNode(grammarAccess.getBoundsRule()); 
            pushFollow(FOLLOW_ruleBounds_in_entryRuleBounds1754);
            iv_ruleBounds=ruleBounds();

            state._fsp--;

             current =iv_ruleBounds; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBounds1764); 

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
    // $ANTLR end "entryRuleBounds"


    // $ANTLR start "ruleBounds"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:832:1: ruleBounds returns [EObject current=null] : ( () otherlv_1= 'bounds=' otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_width_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_height_9_0= RULE_INT ) ) otherlv_10= ')' ) ;
    public final EObject ruleBounds() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token otherlv_4=null;
        Token lv_y_5_0=null;
        Token otherlv_6=null;
        Token lv_width_7_0=null;
        Token otherlv_8=null;
        Token lv_height_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:835:28: ( ( () otherlv_1= 'bounds=' otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_width_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_height_9_0= RULE_INT ) ) otherlv_10= ')' ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:836:1: ( () otherlv_1= 'bounds=' otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_width_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_height_9_0= RULE_INT ) ) otherlv_10= ')' )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:836:1: ( () otherlv_1= 'bounds=' otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_width_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_height_9_0= RULE_INT ) ) otherlv_10= ')' )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:836:2: () otherlv_1= 'bounds=' otherlv_2= '(' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_width_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_height_9_0= RULE_INT ) ) otherlv_10= ')'
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:836:2: ()
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:837:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoundsAccess().getBoundsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleBounds1810); 

                	newLeafNode(otherlv_1, grammarAccess.getBoundsAccess().getBoundsKeyword_1());
                
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleBounds1822); 

                	newLeafNode(otherlv_2, grammarAccess.getBoundsAccess().getLeftParenthesisKeyword_2());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:850:1: ( (lv_x_3_0= RULE_INT ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:851:1: (lv_x_3_0= RULE_INT )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:851:1: (lv_x_3_0= RULE_INT )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:852:3: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBounds1839); 

            			newLeafNode(lv_x_3_0, grammarAccess.getBoundsAccess().getXINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoundsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleBounds1856); 

                	newLeafNode(otherlv_4, grammarAccess.getBoundsAccess().getCommaKeyword_4());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:872:1: ( (lv_y_5_0= RULE_INT ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:873:1: (lv_y_5_0= RULE_INT )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:873:1: (lv_y_5_0= RULE_INT )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:874:3: lv_y_5_0= RULE_INT
            {
            lv_y_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBounds1873); 

            			newLeafNode(lv_y_5_0, grammarAccess.getBoundsAccess().getYINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoundsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleBounds1890); 

                	newLeafNode(otherlv_6, grammarAccess.getBoundsAccess().getCommaKeyword_6());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:894:1: ( (lv_width_7_0= RULE_INT ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:895:1: (lv_width_7_0= RULE_INT )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:895:1: (lv_width_7_0= RULE_INT )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:896:3: lv_width_7_0= RULE_INT
            {
            lv_width_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBounds1907); 

            			newLeafNode(lv_width_7_0, grammarAccess.getBoundsAccess().getWidthINTTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoundsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_7_0, 
                    		"INT");
            	    

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleBounds1924); 

                	newLeafNode(otherlv_8, grammarAccess.getBoundsAccess().getCommaKeyword_8());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:916:1: ( (lv_height_9_0= RULE_INT ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:917:1: (lv_height_9_0= RULE_INT )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:917:1: (lv_height_9_0= RULE_INT )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:918:3: lv_height_9_0= RULE_INT
            {
            lv_height_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBounds1941); 

            			newLeafNode(lv_height_9_0, grammarAccess.getBoundsAccess().getHeightINTTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoundsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_9_0, 
                    		"INT");
            	    

            }


            }

            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleBounds1958); 

                	newLeafNode(otherlv_10, grammarAccess.getBoundsAccess().getRightParenthesisKeyword_10());
                

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
    // $ANTLR end "ruleBounds"


    // $ANTLR start "entryRuleUIElement"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:946:1: entryRuleUIElement returns [EObject current=null] : iv_ruleUIElement= ruleUIElement EOF ;
    public final EObject entryRuleUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIElement = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:947:2: (iv_ruleUIElement= ruleUIElement EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:948:2: iv_ruleUIElement= ruleUIElement EOF
            {
             newCompositeNode(grammarAccess.getUIElementRule()); 
            pushFollow(FOLLOW_ruleUIElement_in_entryRuleUIElement1994);
            iv_ruleUIElement=ruleUIElement();

            state._fsp--;

             current =iv_ruleUIElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIElement2004); 

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
    // $ANTLR end "entryRuleUIElement"


    // $ANTLR start "ruleUIElement"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:955:1: ruleUIElement returns [EObject current=null] : ( (this_Label_0= ruleLabel | this_Field_1= ruleField | this_Button_2= ruleButton ) ( (lv_bounds_3_0= ruleBounds ) ) ) ;
    public final EObject ruleUIElement() throws RecognitionException {
        EObject current = null;

        EObject this_Label_0 = null;

        EObject this_Field_1 = null;

        EObject this_Button_2 = null;

        EObject lv_bounds_3_0 = null;


         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:958:28: ( ( (this_Label_0= ruleLabel | this_Field_1= ruleField | this_Button_2= ruleButton ) ( (lv_bounds_3_0= ruleBounds ) ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:959:1: ( (this_Label_0= ruleLabel | this_Field_1= ruleField | this_Button_2= ruleButton ) ( (lv_bounds_3_0= ruleBounds ) ) )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:959:1: ( (this_Label_0= ruleLabel | this_Field_1= ruleField | this_Button_2= ruleButton ) ( (lv_bounds_3_0= ruleBounds ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:959:2: (this_Label_0= ruleLabel | this_Field_1= ruleField | this_Button_2= ruleButton ) ( (lv_bounds_3_0= ruleBounds ) )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:959:2: (this_Label_0= ruleLabel | this_Field_1= ruleField | this_Button_2= ruleButton )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:960:5: this_Label_0= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getLabelParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleUIElement2052);
                    this_Label_0=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:970:5: this_Field_1= ruleField
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getFieldParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleUIElement2079);
                    this_Field_1=ruleField();

                    state._fsp--;

                     
                            current = this_Field_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:980:5: this_Button_2= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getButtonParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleUIElement2106);
                    this_Button_2=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:988:2: ( (lv_bounds_3_0= ruleBounds ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:989:1: (lv_bounds_3_0= ruleBounds )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:989:1: (lv_bounds_3_0= ruleBounds )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:990:3: lv_bounds_3_0= ruleBounds
            {
             
            	        newCompositeNode(grammarAccess.getUIElementAccess().getBoundsBoundsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBounds_in_ruleUIElement2127);
            lv_bounds_3_0=ruleBounds();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIElementRule());
            	        }
                   		set(
                   			current, 
                   			"bounds",
                    		lv_bounds_3_0, 
                    		"Bounds");
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
    // $ANTLR end "ruleUIElement"


    // $ANTLR start "entryRuleLabel"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1014:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1015:2: (iv_ruleLabel= ruleLabel EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1016:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2163);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2173); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1023:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'Label' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) )? otherlv_4= ')' )? ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1026:28: ( (otherlv_0= 'Label' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) )? otherlv_4= ')' )? ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1027:1: (otherlv_0= 'Label' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) )? otherlv_4= ')' )? )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1027:1: (otherlv_0= 'Label' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) )? otherlv_4= ')' )? )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1027:3: otherlv_0= 'Label' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) )? otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleLabel2210); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1031:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1032:1: (lv_name_1_0= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1032:1: (lv_name_1_0= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1033:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel2227); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1049:2: (otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) )? otherlv_4= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1049:4: otherlv_2= '(' ( (lv_text_3_0= RULE_STRING ) )? otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleLabel2245); 

                        	newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1053:1: ( (lv_text_3_0= RULE_STRING ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_STRING) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1054:1: (lv_text_3_0= RULE_STRING )
                            {
                            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1054:1: (lv_text_3_0= RULE_STRING )
                            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1055:3: lv_text_3_0= RULE_STRING
                            {
                            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel2262); 

                            			newLeafNode(lv_text_3_0, grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLabelRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"text",
                                    		lv_text_3_0, 
                                    		"STRING");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleLabel2280); 

                        	newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getRightParenthesisKeyword_2_2());
                        

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleField"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1083:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1084:2: (iv_ruleField= ruleField EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1085:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField2318);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField2328); 

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
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1092:1: ruleField returns [EObject current=null] : (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1095:28: ( (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1096:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1096:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1096:3: otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleField2365); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1100:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1101:1: (lv_name_1_0= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1101:1: (lv_name_1_0= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1102:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField2382); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleField2399); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getForKeyword_2());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1122:1: ( (otherlv_3= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1123:1: (otherlv_3= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1123:1: (otherlv_3= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1124:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField2419); 

            		newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getPropertyPropertyCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleButton"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1143:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1144:2: (iv_ruleButton= ruleButton EOF )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1145:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton2455);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton2465); 

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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1152:1: ruleButton returns [EObject current=null] : (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_kind_2_0= ruleButtonKind ) )? (otherlv_3= '(' ( (lv_text_4_0= RULE_STRING ) )? otherlv_5= ')' )? ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_kind_2_0 = null;


         enterRule(); 
            
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1155:28: ( (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_kind_2_0= ruleButtonKind ) )? (otherlv_3= '(' ( (lv_text_4_0= RULE_STRING ) )? otherlv_5= ')' )? ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1156:1: (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_kind_2_0= ruleButtonKind ) )? (otherlv_3= '(' ( (lv_text_4_0= RULE_STRING ) )? otherlv_5= ')' )? )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1156:1: (otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_kind_2_0= ruleButtonKind ) )? (otherlv_3= '(' ( (lv_text_4_0= RULE_STRING ) )? otherlv_5= ')' )? )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1156:3: otherlv_0= 'Button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_kind_2_0= ruleButtonKind ) )? (otherlv_3= '(' ( (lv_text_4_0= RULE_STRING ) )? otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleButton2502); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1160:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1161:1: (lv_name_1_0= RULE_ID )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1161:1: (lv_name_1_0= RULE_ID )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1162:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton2519); 

            			newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1178:2: ( (lv_kind_2_0= ruleButtonKind ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=38 && LA16_0<=40)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1179:1: (lv_kind_2_0= ruleButtonKind )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1179:1: (lv_kind_2_0= ruleButtonKind )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1180:3: lv_kind_2_0= ruleButtonKind
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonAccess().getKindButtonKindEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleButtonKind_in_ruleButton2545);
                    lv_kind_2_0=ruleButtonKind();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonRule());
                    	        }
                           		set(
                           			current, 
                           			"kind",
                            		lv_kind_2_0, 
                            		"ButtonKind");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1196:3: (otherlv_3= '(' ( (lv_text_4_0= RULE_STRING ) )? otherlv_5= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1196:5: otherlv_3= '(' ( (lv_text_4_0= RULE_STRING ) )? otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleButton2559); 

                        	newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1200:1: ( (lv_text_4_0= RULE_STRING ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_STRING) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1201:1: (lv_text_4_0= RULE_STRING )
                            {
                            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1201:1: (lv_text_4_0= RULE_STRING )
                            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1202:3: lv_text_4_0= RULE_STRING
                            {
                            lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton2576); 

                            			newLeafNode(lv_text_4_0, grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_3_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getButtonRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"text",
                                    		lv_text_4_0, 
                                    		"STRING");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleButton2594); 

                        	newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getRightParenthesisKeyword_3_2());
                        

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "ruleAttributeType"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1230:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Date' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1232:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Date' ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1233:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Date' ) )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1233:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Date' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 34:
                {
                alt19=2;
                }
                break;
            case 35:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1233:2: (enumLiteral_0= 'String' )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1233:2: (enumLiteral_0= 'String' )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1233:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleAttributeType2646); 

                            current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1239:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1239:6: (enumLiteral_1= 'Integer' )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1239:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleAttributeType2663); 

                            current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1245:6: (enumLiteral_2= 'Date' )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1245:6: (enumLiteral_2= 'Date' )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1245:8: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleAttributeType2680); 

                            current = grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "ruleMultiplicityKind"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1255:1: ruleMultiplicityKind returns [Enumerator current=null] : ( (enumLiteral_0= '[1]' ) | (enumLiteral_1= '[*]' ) ) ;
    public final Enumerator ruleMultiplicityKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1257:28: ( ( (enumLiteral_0= '[1]' ) | (enumLiteral_1= '[*]' ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1258:1: ( (enumLiteral_0= '[1]' ) | (enumLiteral_1= '[*]' ) )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1258:1: ( (enumLiteral_0= '[1]' ) | (enumLiteral_1= '[*]' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            else if ( (LA20_0==37) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1258:2: (enumLiteral_0= '[1]' )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1258:2: (enumLiteral_0= '[1]' )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1258:4: enumLiteral_0= '[1]'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_36_in_ruleMultiplicityKind2725); 

                            current = grammarAccess.getMultiplicityKindAccess().getSingleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityKindAccess().getSingleEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1264:6: (enumLiteral_1= '[*]' )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1264:6: (enumLiteral_1= '[*]' )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1264:8: enumLiteral_1= '[*]'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_37_in_ruleMultiplicityKind2742); 

                            current = grammarAccess.getMultiplicityKindAccess().getMultipleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityKindAccess().getMultipleEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleMultiplicityKind"


    // $ANTLR start "ruleButtonKind"
    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1274:1: ruleButtonKind returns [Enumerator current=null] : ( (enumLiteral_0= 'createEdit' ) | (enumLiteral_1= 'delete' ) | (enumLiteral_2= 'cancel' ) ) ;
    public final Enumerator ruleButtonKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1276:28: ( ( (enumLiteral_0= 'createEdit' ) | (enumLiteral_1= 'delete' ) | (enumLiteral_2= 'cancel' ) ) )
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1277:1: ( (enumLiteral_0= 'createEdit' ) | (enumLiteral_1= 'delete' ) | (enumLiteral_2= 'cancel' ) )
            {
            // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1277:1: ( (enumLiteral_0= 'createEdit' ) | (enumLiteral_1= 'delete' ) | (enumLiteral_2= 'cancel' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt21=1;
                }
                break;
            case 39:
                {
                alt21=2;
                }
                break;
            case 40:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1277:2: (enumLiteral_0= 'createEdit' )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1277:2: (enumLiteral_0= 'createEdit' )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1277:4: enumLiteral_0= 'createEdit'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleButtonKind2787); 

                            current = grammarAccess.getButtonKindAccess().getCreateEditEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getButtonKindAccess().getCreateEditEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1283:6: (enumLiteral_1= 'delete' )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1283:6: (enumLiteral_1= 'delete' )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1283:8: enumLiteral_1= 'delete'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleButtonKind2804); 

                            current = grammarAccess.getButtonKindAccess().getDeleteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getButtonKindAccess().getDeleteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1289:6: (enumLiteral_2= 'cancel' )
                    {
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1289:6: (enumLiteral_2= 'cancel' )
                    // ../mdsd01.exercise04/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl01.g:1289:8: enumLiteral_2= 'cancel'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_40_in_ruleButtonKind2821); 

                            current = grammarAccess.getButtonKindAccess().getCancelEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getButtonKindAccess().getCancelEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleButtonKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModel131 = new BitSet(new long[]{0x0000000001201802L});
    public static final BitSet FOLLOW_ruleWindow_in_ruleModel153 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntity245 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity288 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEntity306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity326 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity340 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity361 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_15_in_ruleEntity374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleProperty467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleProperty494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAttribute576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute593 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttribute610 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute631 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleAttribute649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleReference746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference763 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleReference780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference800 = new BitSet(new long[]{0x0000003000100000L});
    public static final BitSet FOLLOW_ruleMultiplicityKind_in_ruleReference821 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReference835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindow_in_entryRuleWindow892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWindow902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryWindow_in_ruleWindow949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListWindow_in_ruleWindow976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListWindow_in_entryRuleListWindow1011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListWindow1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleListWindow1058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListWindow1075 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleListWindow1092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListWindow1112 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_ruleListWindow1125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleListWindow1142 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleListWindow1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryWindow_in_entryRuleEntryWindow1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryWindow1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEntryWindow1253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryWindow1270 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEntryWindow1287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryWindow1307 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_ruleEntryWindow1365 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntryWindow1382 = new BitSet(new long[]{0x0000000002804000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleEntryWindow1463 = new BitSet(new long[]{0x0000000002804000L});
    public static final BitSet FOLLOW_14_in_ruleEntryWindow1521 = new BitSet(new long[]{0x00000001C0008000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleEntryWindow1542 = new BitSet(new long[]{0x00000001C0008000L});
    public static final BitSet FOLLOW_15_in_ruleEntryWindow1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize1591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSize1638 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSize1650 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize1667 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSize1684 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize1701 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSize1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBounds_in_entryRuleBounds1754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBounds1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBounds1810 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBounds1822 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBounds1839 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBounds1856 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBounds1873 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBounds1890 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBounds1907 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBounds1924 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBounds1941 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleBounds1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIElement_in_entryRuleUIElement1994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIElement2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleUIElement2052 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleField_in_ruleUIElement2079 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleButton_in_ruleUIElement2106 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleBounds_in_ruleUIElement2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLabel2210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel2227 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleLabel2245 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel2262 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLabel2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField2318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleField2365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField2382 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleField2399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton2455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleButton2502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton2519 = new BitSet(new long[]{0x000001C004000002L});
    public static final BitSet FOLLOW_ruleButtonKind_in_ruleButton2545 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleButton2559 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton2576 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleButton2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAttributeType2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAttributeType2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAttributeType2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMultiplicityKind2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMultiplicityKind2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleButtonKind2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleButtonKind2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleButtonKind2821 = new BitSet(new long[]{0x0000000000000002L});

}
