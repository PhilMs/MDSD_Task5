package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.services.MyDsl01GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDsl01Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Integer'", "'Date'", "'[1]'", "'[*]'", "'createEdit'", "'delete'", "'cancel'", "'entity'", "'{'", "'}'", "'extends'", "'att'", "':'", "'ref'", "'opposite='", "'ListWindow'", "'for'", "'title'", "'EntryWindow'", "'size='", "'('", "','", "')'", "'bounds='", "'Label'", "'Field'", "'Button'", "'abstract'", "'optional'"
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
    public String getGrammarFileName() { return "../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g"; }


     
     	private MyDsl01GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDsl01GrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:61:1: ( ruleModel EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:76:1: ( rule__Model__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:90:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:91:1: ( ruleEntity EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:92:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity123);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity130); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:99:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:103:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:104:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:104:1: ( ( rule__Entity__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:105:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:106:1: ( rule__Entity__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:106:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity156);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProperty"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:118:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:119:1: ( ruleProperty EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:120:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty183);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty190); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:127:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:131:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:132:1: ( ( rule__Property__Alternatives ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:132:1: ( ( rule__Property__Alternatives ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:133:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:134:1: ( rule__Property__Alternatives )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:134:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty216);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAttribute"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:146:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:147:1: ( ruleAttribute EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:148:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute243);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute250); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:155:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:159:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:160:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:160:1: ( ( rule__Attribute__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:161:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:162:1: ( rule__Attribute__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:162:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute276);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:174:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:175:1: ( ruleReference EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:176:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference303);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference310); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:183:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:187:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:188:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:188:1: ( ( rule__Reference__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:189:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:190:1: ( rule__Reference__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:190:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference336);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleWindow"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:202:1: entryRuleWindow : ruleWindow EOF ;
    public final void entryRuleWindow() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:203:1: ( ruleWindow EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:204:1: ruleWindow EOF
            {
             before(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_ruleWindow_in_entryRuleWindow363);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getWindowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWindow370); 

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
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:211:1: ruleWindow : ( ( rule__Window__Alternatives ) ) ;
    public final void ruleWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:215:2: ( ( ( rule__Window__Alternatives ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:216:1: ( ( rule__Window__Alternatives ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:216:1: ( ( rule__Window__Alternatives ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:217:1: ( rule__Window__Alternatives )
            {
             before(grammarAccess.getWindowAccess().getAlternatives()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:218:1: ( rule__Window__Alternatives )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:218:2: rule__Window__Alternatives
            {
            pushFollow(FOLLOW_rule__Window__Alternatives_in_ruleWindow396);
            rule__Window__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRuleListWindow"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:230:1: entryRuleListWindow : ruleListWindow EOF ;
    public final void entryRuleListWindow() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:231:1: ( ruleListWindow EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:232:1: ruleListWindow EOF
            {
             before(grammarAccess.getListWindowRule()); 
            pushFollow(FOLLOW_ruleListWindow_in_entryRuleListWindow423);
            ruleListWindow();

            state._fsp--;

             after(grammarAccess.getListWindowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListWindow430); 

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
    // $ANTLR end "entryRuleListWindow"


    // $ANTLR start "ruleListWindow"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:239:1: ruleListWindow : ( ( rule__ListWindow__Group__0 ) ) ;
    public final void ruleListWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:243:2: ( ( ( rule__ListWindow__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:244:1: ( ( rule__ListWindow__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:244:1: ( ( rule__ListWindow__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:245:1: ( rule__ListWindow__Group__0 )
            {
             before(grammarAccess.getListWindowAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:246:1: ( rule__ListWindow__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:246:2: rule__ListWindow__Group__0
            {
            pushFollow(FOLLOW_rule__ListWindow__Group__0_in_ruleListWindow456);
            rule__ListWindow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListWindowAccess().getGroup()); 

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
    // $ANTLR end "ruleListWindow"


    // $ANTLR start "entryRuleEntryWindow"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:258:1: entryRuleEntryWindow : ruleEntryWindow EOF ;
    public final void entryRuleEntryWindow() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:259:1: ( ruleEntryWindow EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:260:1: ruleEntryWindow EOF
            {
             before(grammarAccess.getEntryWindowRule()); 
            pushFollow(FOLLOW_ruleEntryWindow_in_entryRuleEntryWindow483);
            ruleEntryWindow();

            state._fsp--;

             after(grammarAccess.getEntryWindowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryWindow490); 

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
    // $ANTLR end "entryRuleEntryWindow"


    // $ANTLR start "ruleEntryWindow"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:267:1: ruleEntryWindow : ( ( rule__EntryWindow__Group__0 ) ) ;
    public final void ruleEntryWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:271:2: ( ( ( rule__EntryWindow__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:272:1: ( ( rule__EntryWindow__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:272:1: ( ( rule__EntryWindow__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:273:1: ( rule__EntryWindow__Group__0 )
            {
             before(grammarAccess.getEntryWindowAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:274:1: ( rule__EntryWindow__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:274:2: rule__EntryWindow__Group__0
            {
            pushFollow(FOLLOW_rule__EntryWindow__Group__0_in_ruleEntryWindow516);
            rule__EntryWindow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntryWindowAccess().getGroup()); 

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
    // $ANTLR end "ruleEntryWindow"


    // $ANTLR start "entryRuleSize"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:286:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:287:1: ( ruleSize EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:288:1: ruleSize EOF
            {
             before(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize543);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getSizeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize550); 

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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:295:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:299:2: ( ( ( rule__Size__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:300:1: ( ( rule__Size__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:300:1: ( ( rule__Size__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:301:1: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:302:1: ( rule__Size__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:302:2: rule__Size__Group__0
            {
            pushFollow(FOLLOW_rule__Size__Group__0_in_ruleSize576);
            rule__Size__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getGroup()); 

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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleBounds"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:314:1: entryRuleBounds : ruleBounds EOF ;
    public final void entryRuleBounds() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:315:1: ( ruleBounds EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:316:1: ruleBounds EOF
            {
             before(grammarAccess.getBoundsRule()); 
            pushFollow(FOLLOW_ruleBounds_in_entryRuleBounds603);
            ruleBounds();

            state._fsp--;

             after(grammarAccess.getBoundsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBounds610); 

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
    // $ANTLR end "entryRuleBounds"


    // $ANTLR start "ruleBounds"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:323:1: ruleBounds : ( ( rule__Bounds__Group__0 ) ) ;
    public final void ruleBounds() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:327:2: ( ( ( rule__Bounds__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:328:1: ( ( rule__Bounds__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:328:1: ( ( rule__Bounds__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:329:1: ( rule__Bounds__Group__0 )
            {
             before(grammarAccess.getBoundsAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:330:1: ( rule__Bounds__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:330:2: rule__Bounds__Group__0
            {
            pushFollow(FOLLOW_rule__Bounds__Group__0_in_ruleBounds636);
            rule__Bounds__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundsAccess().getGroup()); 

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
    // $ANTLR end "ruleBounds"


    // $ANTLR start "entryRuleUIElement"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:342:1: entryRuleUIElement : ruleUIElement EOF ;
    public final void entryRuleUIElement() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:343:1: ( ruleUIElement EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:344:1: ruleUIElement EOF
            {
             before(grammarAccess.getUIElementRule()); 
            pushFollow(FOLLOW_ruleUIElement_in_entryRuleUIElement663);
            ruleUIElement();

            state._fsp--;

             after(grammarAccess.getUIElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIElement670); 

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
    // $ANTLR end "entryRuleUIElement"


    // $ANTLR start "ruleUIElement"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:351:1: ruleUIElement : ( ( rule__UIElement__Group__0 ) ) ;
    public final void ruleUIElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:355:2: ( ( ( rule__UIElement__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:356:1: ( ( rule__UIElement__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:356:1: ( ( rule__UIElement__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:357:1: ( rule__UIElement__Group__0 )
            {
             before(grammarAccess.getUIElementAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:358:1: ( rule__UIElement__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:358:2: rule__UIElement__Group__0
            {
            pushFollow(FOLLOW_rule__UIElement__Group__0_in_ruleUIElement696);
            rule__UIElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIElementAccess().getGroup()); 

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
    // $ANTLR end "ruleUIElement"


    // $ANTLR start "entryRuleLabel"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:370:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:371:1: ( ruleLabel EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:372:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel723);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel730); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:379:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:383:2: ( ( ( rule__Label__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:384:1: ( ( rule__Label__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:384:1: ( ( rule__Label__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:385:1: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:386:1: ( rule__Label__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:386:2: rule__Label__Group__0
            {
            pushFollow(FOLLOW_rule__Label__Group__0_in_ruleLabel756);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleField"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:398:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:399:1: ( ruleField EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:400:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField783);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField790); 

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
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:407:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:411:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:412:1: ( ( rule__Field__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:412:1: ( ( rule__Field__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:413:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:414:1: ( rule__Field__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:414:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField816);
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


    // $ANTLR start "entryRuleButton"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:426:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:427:1: ( ruleButton EOF )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:428:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton843);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton850); 

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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:435:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:439:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:440:1: ( ( rule__Button__Group__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:440:1: ( ( rule__Button__Group__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:441:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:442:1: ( rule__Button__Group__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:442:2: rule__Button__Group__0
            {
            pushFollow(FOLLOW_rule__Button__Group__0_in_ruleButton876);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "ruleAttributeType"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:455:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:459:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:460:1: ( ( rule__AttributeType__Alternatives ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:460:1: ( ( rule__AttributeType__Alternatives ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:461:1: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:462:1: ( rule__AttributeType__Alternatives )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:462:2: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType913);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "ruleMultiplicityKind"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:474:1: ruleMultiplicityKind : ( ( rule__MultiplicityKind__Alternatives ) ) ;
    public final void ruleMultiplicityKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:478:1: ( ( ( rule__MultiplicityKind__Alternatives ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:479:1: ( ( rule__MultiplicityKind__Alternatives ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:479:1: ( ( rule__MultiplicityKind__Alternatives ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:480:1: ( rule__MultiplicityKind__Alternatives )
            {
             before(grammarAccess.getMultiplicityKindAccess().getAlternatives()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:481:1: ( rule__MultiplicityKind__Alternatives )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:481:2: rule__MultiplicityKind__Alternatives
            {
            pushFollow(FOLLOW_rule__MultiplicityKind__Alternatives_in_ruleMultiplicityKind949);
            rule__MultiplicityKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMultiplicityKind"


    // $ANTLR start "ruleButtonKind"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:493:1: ruleButtonKind : ( ( rule__ButtonKind__Alternatives ) ) ;
    public final void ruleButtonKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:497:1: ( ( ( rule__ButtonKind__Alternatives ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:498:1: ( ( rule__ButtonKind__Alternatives ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:498:1: ( ( rule__ButtonKind__Alternatives ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:499:1: ( rule__ButtonKind__Alternatives )
            {
             before(grammarAccess.getButtonKindAccess().getAlternatives()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:500:1: ( rule__ButtonKind__Alternatives )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:500:2: rule__ButtonKind__Alternatives
            {
            pushFollow(FOLLOW_rule__ButtonKind__Alternatives_in_ruleButtonKind985);
            rule__ButtonKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getButtonKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleButtonKind"


    // $ANTLR start "rule__Property__Alternatives"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:511:1: rule__Property__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:515:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:516:1: ( ruleAttribute )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:516:1: ( ruleAttribute )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:517:1: ruleAttribute
                    {
                     before(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Property__Alternatives1020);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:522:6: ( ruleReference )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:522:6: ( ruleReference )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:523:1: ruleReference
                    {
                     before(grammarAccess.getPropertyAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__Property__Alternatives1037);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__Window__Alternatives"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:533:1: rule__Window__Alternatives : ( ( ruleEntryWindow ) | ( ruleListWindow ) );
    public final void rule__Window__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:537:1: ( ( ruleEntryWindow ) | ( ruleListWindow ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:538:1: ( ruleEntryWindow )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:538:1: ( ruleEntryWindow )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:539:1: ruleEntryWindow
                    {
                     before(grammarAccess.getWindowAccess().getEntryWindowParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntryWindow_in_rule__Window__Alternatives1069);
                    ruleEntryWindow();

                    state._fsp--;

                     after(grammarAccess.getWindowAccess().getEntryWindowParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:544:6: ( ruleListWindow )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:544:6: ( ruleListWindow )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:545:1: ruleListWindow
                    {
                     before(grammarAccess.getWindowAccess().getListWindowParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleListWindow_in_rule__Window__Alternatives1086);
                    ruleListWindow();

                    state._fsp--;

                     after(grammarAccess.getWindowAccess().getListWindowParserRuleCall_1()); 

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
    // $ANTLR end "rule__Window__Alternatives"


    // $ANTLR start "rule__UIElement__Alternatives_0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:555:1: rule__UIElement__Alternatives_0 : ( ( ruleLabel ) | ( ruleField ) | ( ruleButton ) );
    public final void rule__UIElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:559:1: ( ( ruleLabel ) | ( ruleField ) | ( ruleButton ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 38:
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
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:560:1: ( ruleLabel )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:560:1: ( ruleLabel )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:561:1: ruleLabel
                    {
                     before(grammarAccess.getUIElementAccess().getLabelParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleLabel_in_rule__UIElement__Alternatives_01118);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getUIElementAccess().getLabelParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:566:6: ( ruleField )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:566:6: ( ruleField )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:567:1: ruleField
                    {
                     before(grammarAccess.getUIElementAccess().getFieldParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleField_in_rule__UIElement__Alternatives_01135);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getUIElementAccess().getFieldParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:572:6: ( ruleButton )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:572:6: ( ruleButton )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:573:1: ruleButton
                    {
                     before(grammarAccess.getUIElementAccess().getButtonParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleButton_in_rule__UIElement__Alternatives_01152);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getUIElementAccess().getButtonParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__UIElement__Alternatives_0"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:583:1: rule__AttributeType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Date' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:587:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Date' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
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
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:588:1: ( ( 'String' ) )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:588:1: ( ( 'String' ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:589:1: ( 'String' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:590:1: ( 'String' )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:590:3: 'String'
                    {
                    match(input,11,FOLLOW_11_in_rule__AttributeType__Alternatives1185); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:595:6: ( ( 'Integer' ) )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:595:6: ( ( 'Integer' ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:596:1: ( 'Integer' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:597:1: ( 'Integer' )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:597:3: 'Integer'
                    {
                    match(input,12,FOLLOW_12_in_rule__AttributeType__Alternatives1206); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:602:6: ( ( 'Date' ) )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:602:6: ( ( 'Date' ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:603:1: ( 'Date' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_2()); 
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:604:1: ( 'Date' )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:604:3: 'Date'
                    {
                    match(input,13,FOLLOW_13_in_rule__AttributeType__Alternatives1227); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__MultiplicityKind__Alternatives"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:614:1: rule__MultiplicityKind__Alternatives : ( ( ( '[1]' ) ) | ( ( '[*]' ) ) );
    public final void rule__MultiplicityKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:618:1: ( ( ( '[1]' ) ) | ( ( '[*]' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:619:1: ( ( '[1]' ) )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:619:1: ( ( '[1]' ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:620:1: ( '[1]' )
                    {
                     before(grammarAccess.getMultiplicityKindAccess().getSingleEnumLiteralDeclaration_0()); 
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:621:1: ( '[1]' )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:621:3: '[1]'
                    {
                    match(input,14,FOLLOW_14_in_rule__MultiplicityKind__Alternatives1263); 

                    }

                     after(grammarAccess.getMultiplicityKindAccess().getSingleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:626:6: ( ( '[*]' ) )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:626:6: ( ( '[*]' ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:627:1: ( '[*]' )
                    {
                     before(grammarAccess.getMultiplicityKindAccess().getMultipleEnumLiteralDeclaration_1()); 
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:628:1: ( '[*]' )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:628:3: '[*]'
                    {
                    match(input,15,FOLLOW_15_in_rule__MultiplicityKind__Alternatives1284); 

                    }

                     after(grammarAccess.getMultiplicityKindAccess().getMultipleEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__MultiplicityKind__Alternatives"


    // $ANTLR start "rule__ButtonKind__Alternatives"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:638:1: rule__ButtonKind__Alternatives : ( ( ( 'createEdit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) );
    public final void rule__ButtonKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:642:1: ( ( ( 'createEdit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:643:1: ( ( 'createEdit' ) )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:643:1: ( ( 'createEdit' ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:644:1: ( 'createEdit' )
                    {
                     before(grammarAccess.getButtonKindAccess().getCreateEditEnumLiteralDeclaration_0()); 
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:645:1: ( 'createEdit' )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:645:3: 'createEdit'
                    {
                    match(input,16,FOLLOW_16_in_rule__ButtonKind__Alternatives1320); 

                    }

                     after(grammarAccess.getButtonKindAccess().getCreateEditEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:650:6: ( ( 'delete' ) )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:650:6: ( ( 'delete' ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:651:1: ( 'delete' )
                    {
                     before(grammarAccess.getButtonKindAccess().getDeleteEnumLiteralDeclaration_1()); 
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:652:1: ( 'delete' )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:652:3: 'delete'
                    {
                    match(input,17,FOLLOW_17_in_rule__ButtonKind__Alternatives1341); 

                    }

                     after(grammarAccess.getButtonKindAccess().getDeleteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:657:6: ( ( 'cancel' ) )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:657:6: ( ( 'cancel' ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:658:1: ( 'cancel' )
                    {
                     before(grammarAccess.getButtonKindAccess().getCancelEnumLiteralDeclaration_2()); 
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:659:1: ( 'cancel' )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:659:3: 'cancel'
                    {
                    match(input,18,FOLLOW_18_in_rule__ButtonKind__Alternatives1362); 

                    }

                     after(grammarAccess.getButtonKindAccess().getCancelEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ButtonKind__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:671:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:675:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:676:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01395);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01398);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:683:1: rule__Model__Group__0__Impl : ( ( rule__Model__EntitiesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:687:1: ( ( ( rule__Model__EntitiesAssignment_0 )* ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:688:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:688:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:689:1: ( rule__Model__EntitiesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:690:1: ( rule__Model__EntitiesAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19||LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:690:2: rule__Model__EntitiesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__EntitiesAssignment_0_in_rule__Model__Group__0__Impl1425);
            	    rule__Model__EntitiesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:700:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:704:1: ( rule__Model__Group__1__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:705:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11456);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:711:1: rule__Model__Group__1__Impl : ( ( rule__Model__WindowsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:715:1: ( ( ( rule__Model__WindowsAssignment_1 )* ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:716:1: ( ( rule__Model__WindowsAssignment_1 )* )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:716:1: ( ( rule__Model__WindowsAssignment_1 )* )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:717:1: ( rule__Model__WindowsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getWindowsAssignment_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:718:1: ( rule__Model__WindowsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27||LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:718:2: rule__Model__WindowsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__WindowsAssignment_1_in_rule__Model__Group__1__Impl1483);
            	    rule__Model__WindowsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getWindowsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:734:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:738:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:739:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01520);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01523);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:746:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__AbstractAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:750:1: ( ( ( rule__Entity__AbstractAssignment_0 )? ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:751:1: ( ( rule__Entity__AbstractAssignment_0 )? )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:751:1: ( ( rule__Entity__AbstractAssignment_0 )? )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:752:1: ( rule__Entity__AbstractAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getAbstractAssignment_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:753:1: ( rule__Entity__AbstractAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:753:2: rule__Entity__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entity__AbstractAssignment_0_in_rule__Entity__Group__0__Impl1550);
                    rule__Entity__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getAbstractAssignment_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:763:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:767:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:768:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11581);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11584);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:775:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:779:1: ( ( 'entity' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:780:1: ( 'entity' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:780:1: ( 'entity' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:781:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__1__Impl1612); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:794:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:798:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:799:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21643);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21646);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:806:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:810:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:811:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:811:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:812:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:813:1: ( rule__Entity__NameAssignment_2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:813:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1673);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:823:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:827:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:828:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31703);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31706);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:835:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:839:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:840:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:840:1: ( ( rule__Entity__Group_3__0 )? )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:841:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:842:1: ( rule__Entity__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:842:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1733);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:852:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:856:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:857:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41764);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41767);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:864:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:868:1: ( ( '{' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:869:1: ( '{' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:869:1: ( '{' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:870:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__4__Impl1795); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:883:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:887:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:888:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51826);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51829);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:895:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__PropertiesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:899:1: ( ( ( rule__Entity__PropertiesAssignment_5 )* ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:900:1: ( ( rule__Entity__PropertiesAssignment_5 )* )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:900:1: ( ( rule__Entity__PropertiesAssignment_5 )* )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:901:1: ( rule__Entity__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_5()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:902:1: ( rule__Entity__PropertiesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23||LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:902:2: rule__Entity__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_5_in_rule__Entity__Group__5__Impl1856);
            	    rule__Entity__PropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:912:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:916:1: ( rule__Entity__Group__6__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:917:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61887);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:923:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:927:1: ( ( '}' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:928:1: ( '}' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:928:1: ( '}' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:929:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__6__Impl1915); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:956:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:960:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:961:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__01960);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__01963);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:968:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:972:1: ( ( 'extends' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:973:1: ( 'extends' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:973:1: ( 'extends' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:974:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Entity__Group_3__0__Impl1991); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:987:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:991:1: ( rule__Entity__Group_3__1__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:992:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12022);
            rule__Entity__Group_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:998:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1002:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1003:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1003:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1004:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1005:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1005:2: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl2049);
            rule__Entity__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1019:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1023:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1024:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02083);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02086);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1031:1: rule__Attribute__Group__0__Impl : ( 'att' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1035:1: ( ( 'att' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1036:1: ( 'att' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1036:1: ( 'att' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1037:1: 'att'
            {
             before(grammarAccess.getAttributeAccess().getAttKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Attribute__Group__0__Impl2114); 
             after(grammarAccess.getAttributeAccess().getAttKeyword_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1050:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1054:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1055:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12145);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12148);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1062:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1066:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1067:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1067:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1068:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1069:1: ( rule__Attribute__NameAssignment_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1069:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl2175);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1079:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1083:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1084:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22205);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22208);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1091:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1095:1: ( ( ':' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1096:1: ( ':' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1096:1: ( ':' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1097:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Attribute__Group__2__Impl2236); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1110:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1114:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1115:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32267);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32270);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1122:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1126:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1127:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1127:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1128:1: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1129:1: ( rule__Attribute__TypeAssignment_3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1129:2: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl2297);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1139:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1143:1: ( rule__Attribute__Group__4__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1144:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42327);
            rule__Attribute__Group__4__Impl();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1150:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__OptionalAssignment_4 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1154:1: ( ( ( rule__Attribute__OptionalAssignment_4 )? ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1155:1: ( ( rule__Attribute__OptionalAssignment_4 )? )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1155:1: ( ( rule__Attribute__OptionalAssignment_4 )? )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1156:1: ( rule__Attribute__OptionalAssignment_4 )?
            {
             before(grammarAccess.getAttributeAccess().getOptionalAssignment_4()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1157:1: ( rule__Attribute__OptionalAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1157:2: rule__Attribute__OptionalAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Attribute__OptionalAssignment_4_in_rule__Attribute__Group__4__Impl2354);
                    rule__Attribute__OptionalAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getOptionalAssignment_4()); 

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1177:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1181:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1182:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__02395);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__02398);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1189:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1193:1: ( ( 'ref' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1194:1: ( 'ref' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1194:1: ( 'ref' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1195:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Reference__Group__0__Impl2426); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

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
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1208:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1212:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1213:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__12457);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__12460);
            rule__Reference__Group__2();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1220:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1224:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1225:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1225:1: ( ( rule__Reference__NameAssignment_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1226:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1227:1: ( rule__Reference__NameAssignment_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1227:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl2487);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1237:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1241:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1242:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__22517);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__22520);
            rule__Reference__Group__3();

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
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1249:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1253:1: ( ( ':' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1254:1: ( ':' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1254:1: ( ':' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1255:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Reference__Group__2__Impl2548); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1268:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1272:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1273:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__32579);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__32582);
            rule__Reference__Group__4();

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
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1280:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1284:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1285:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1285:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1286:1: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1287:1: ( rule__Reference__TypeAssignment_3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1287:2: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl2609);
            rule__Reference__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1297:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1301:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1302:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__42639);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__42642);
            rule__Reference__Group__5();

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
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1309:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__MultiplicityAssignment_4 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1313:1: ( ( ( rule__Reference__MultiplicityAssignment_4 )? ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1314:1: ( ( rule__Reference__MultiplicityAssignment_4 )? )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1314:1: ( ( rule__Reference__MultiplicityAssignment_4 )? )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1315:1: ( rule__Reference__MultiplicityAssignment_4 )?
            {
             before(grammarAccess.getReferenceAccess().getMultiplicityAssignment_4()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1316:1: ( rule__Reference__MultiplicityAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=14 && LA13_0<=15)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1316:2: rule__Reference__MultiplicityAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Reference__MultiplicityAssignment_4_in_rule__Reference__Group__4__Impl2669);
                    rule__Reference__MultiplicityAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getMultiplicityAssignment_4()); 

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
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__5"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1326:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1330:1: ( rule__Reference__Group__5__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1331:2: rule__Reference__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__52700);
            rule__Reference__Group__5__Impl();

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
    // $ANTLR end "rule__Reference__Group__5"


    // $ANTLR start "rule__Reference__Group__5__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1337:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 ) ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1341:1: ( ( ( rule__Reference__Group_5__0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1342:1: ( ( rule__Reference__Group_5__0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1342:1: ( ( rule__Reference__Group_5__0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1343:1: ( rule__Reference__Group_5__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1344:1: ( rule__Reference__Group_5__0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1344:2: rule__Reference__Group_5__0
            {
            pushFollow(FOLLOW_rule__Reference__Group_5__0_in_rule__Reference__Group__5__Impl2727);
            rule__Reference__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Reference__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group_5__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1366:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1370:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1371:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_5__0__Impl_in_rule__Reference__Group_5__02769);
            rule__Reference__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_5__1_in_rule__Reference__Group_5__02772);
            rule__Reference__Group_5__1();

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
    // $ANTLR end "rule__Reference__Group_5__0"


    // $ANTLR start "rule__Reference__Group_5__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1378:1: rule__Reference__Group_5__0__Impl : ( 'opposite=' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1382:1: ( ( 'opposite=' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1383:1: ( 'opposite=' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1383:1: ( 'opposite=' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1384:1: 'opposite='
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_5_0()); 
            match(input,26,FOLLOW_26_in_rule__Reference__Group_5__0__Impl2800); 
             after(grammarAccess.getReferenceAccess().getOppositeKeyword_5_0()); 

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
    // $ANTLR end "rule__Reference__Group_5__0__Impl"


    // $ANTLR start "rule__Reference__Group_5__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1397:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1401:1: ( rule__Reference__Group_5__1__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1402:2: rule__Reference__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_5__1__Impl_in_rule__Reference__Group_5__12831);
            rule__Reference__Group_5__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_5__1"


    // $ANTLR start "rule__Reference__Group_5__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1408:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__OppositeAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1412:1: ( ( ( rule__Reference__OppositeAssignment_5_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1413:1: ( ( rule__Reference__OppositeAssignment_5_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1413:1: ( ( rule__Reference__OppositeAssignment_5_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1414:1: ( rule__Reference__OppositeAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_5_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1415:1: ( rule__Reference__OppositeAssignment_5_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1415:2: rule__Reference__OppositeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_5_1_in_rule__Reference__Group_5__1__Impl2858);
            rule__Reference__OppositeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOppositeAssignment_5_1()); 

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
    // $ANTLR end "rule__Reference__Group_5__1__Impl"


    // $ANTLR start "rule__ListWindow__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1429:1: rule__ListWindow__Group__0 : rule__ListWindow__Group__0__Impl rule__ListWindow__Group__1 ;
    public final void rule__ListWindow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1433:1: ( rule__ListWindow__Group__0__Impl rule__ListWindow__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1434:2: rule__ListWindow__Group__0__Impl rule__ListWindow__Group__1
            {
            pushFollow(FOLLOW_rule__ListWindow__Group__0__Impl_in_rule__ListWindow__Group__02892);
            rule__ListWindow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListWindow__Group__1_in_rule__ListWindow__Group__02895);
            rule__ListWindow__Group__1();

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
    // $ANTLR end "rule__ListWindow__Group__0"


    // $ANTLR start "rule__ListWindow__Group__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1441:1: rule__ListWindow__Group__0__Impl : ( 'ListWindow' ) ;
    public final void rule__ListWindow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1445:1: ( ( 'ListWindow' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1446:1: ( 'ListWindow' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1446:1: ( 'ListWindow' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1447:1: 'ListWindow'
            {
             before(grammarAccess.getListWindowAccess().getListWindowKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ListWindow__Group__0__Impl2923); 
             after(grammarAccess.getListWindowAccess().getListWindowKeyword_0()); 

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
    // $ANTLR end "rule__ListWindow__Group__0__Impl"


    // $ANTLR start "rule__ListWindow__Group__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1460:1: rule__ListWindow__Group__1 : rule__ListWindow__Group__1__Impl rule__ListWindow__Group__2 ;
    public final void rule__ListWindow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1464:1: ( rule__ListWindow__Group__1__Impl rule__ListWindow__Group__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1465:2: rule__ListWindow__Group__1__Impl rule__ListWindow__Group__2
            {
            pushFollow(FOLLOW_rule__ListWindow__Group__1__Impl_in_rule__ListWindow__Group__12954);
            rule__ListWindow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListWindow__Group__2_in_rule__ListWindow__Group__12957);
            rule__ListWindow__Group__2();

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
    // $ANTLR end "rule__ListWindow__Group__1"


    // $ANTLR start "rule__ListWindow__Group__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1472:1: rule__ListWindow__Group__1__Impl : ( ( rule__ListWindow__NameAssignment_1 ) ) ;
    public final void rule__ListWindow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1476:1: ( ( ( rule__ListWindow__NameAssignment_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1477:1: ( ( rule__ListWindow__NameAssignment_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1477:1: ( ( rule__ListWindow__NameAssignment_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1478:1: ( rule__ListWindow__NameAssignment_1 )
            {
             before(grammarAccess.getListWindowAccess().getNameAssignment_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1479:1: ( rule__ListWindow__NameAssignment_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1479:2: rule__ListWindow__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ListWindow__NameAssignment_1_in_rule__ListWindow__Group__1__Impl2984);
            rule__ListWindow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListWindowAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ListWindow__Group__1__Impl"


    // $ANTLR start "rule__ListWindow__Group__2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1489:1: rule__ListWindow__Group__2 : rule__ListWindow__Group__2__Impl rule__ListWindow__Group__3 ;
    public final void rule__ListWindow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1493:1: ( rule__ListWindow__Group__2__Impl rule__ListWindow__Group__3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1494:2: rule__ListWindow__Group__2__Impl rule__ListWindow__Group__3
            {
            pushFollow(FOLLOW_rule__ListWindow__Group__2__Impl_in_rule__ListWindow__Group__23014);
            rule__ListWindow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListWindow__Group__3_in_rule__ListWindow__Group__23017);
            rule__ListWindow__Group__3();

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
    // $ANTLR end "rule__ListWindow__Group__2"


    // $ANTLR start "rule__ListWindow__Group__2__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1501:1: rule__ListWindow__Group__2__Impl : ( 'for' ) ;
    public final void rule__ListWindow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1505:1: ( ( 'for' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1506:1: ( 'for' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1506:1: ( 'for' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1507:1: 'for'
            {
             before(grammarAccess.getListWindowAccess().getForKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__ListWindow__Group__2__Impl3045); 
             after(grammarAccess.getListWindowAccess().getForKeyword_2()); 

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
    // $ANTLR end "rule__ListWindow__Group__2__Impl"


    // $ANTLR start "rule__ListWindow__Group__3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1520:1: rule__ListWindow__Group__3 : rule__ListWindow__Group__3__Impl rule__ListWindow__Group__4 ;
    public final void rule__ListWindow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1524:1: ( rule__ListWindow__Group__3__Impl rule__ListWindow__Group__4 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1525:2: rule__ListWindow__Group__3__Impl rule__ListWindow__Group__4
            {
            pushFollow(FOLLOW_rule__ListWindow__Group__3__Impl_in_rule__ListWindow__Group__33076);
            rule__ListWindow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListWindow__Group__4_in_rule__ListWindow__Group__33079);
            rule__ListWindow__Group__4();

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
    // $ANTLR end "rule__ListWindow__Group__3"


    // $ANTLR start "rule__ListWindow__Group__3__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1532:1: rule__ListWindow__Group__3__Impl : ( ( rule__ListWindow__EntityAssignment_3 ) ) ;
    public final void rule__ListWindow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1536:1: ( ( ( rule__ListWindow__EntityAssignment_3 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1537:1: ( ( rule__ListWindow__EntityAssignment_3 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1537:1: ( ( rule__ListWindow__EntityAssignment_3 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1538:1: ( rule__ListWindow__EntityAssignment_3 )
            {
             before(grammarAccess.getListWindowAccess().getEntityAssignment_3()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1539:1: ( rule__ListWindow__EntityAssignment_3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1539:2: rule__ListWindow__EntityAssignment_3
            {
            pushFollow(FOLLOW_rule__ListWindow__EntityAssignment_3_in_rule__ListWindow__Group__3__Impl3106);
            rule__ListWindow__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getListWindowAccess().getEntityAssignment_3()); 

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
    // $ANTLR end "rule__ListWindow__Group__3__Impl"


    // $ANTLR start "rule__ListWindow__Group__4"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1549:1: rule__ListWindow__Group__4 : rule__ListWindow__Group__4__Impl rule__ListWindow__Group__5 ;
    public final void rule__ListWindow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1553:1: ( rule__ListWindow__Group__4__Impl rule__ListWindow__Group__5 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1554:2: rule__ListWindow__Group__4__Impl rule__ListWindow__Group__5
            {
            pushFollow(FOLLOW_rule__ListWindow__Group__4__Impl_in_rule__ListWindow__Group__43136);
            rule__ListWindow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListWindow__Group__5_in_rule__ListWindow__Group__43139);
            rule__ListWindow__Group__5();

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
    // $ANTLR end "rule__ListWindow__Group__4"


    // $ANTLR start "rule__ListWindow__Group__4__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1561:1: rule__ListWindow__Group__4__Impl : ( ( rule__ListWindow__Group_4__0 )? ) ;
    public final void rule__ListWindow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1565:1: ( ( ( rule__ListWindow__Group_4__0 )? ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1566:1: ( ( rule__ListWindow__Group_4__0 )? )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1566:1: ( ( rule__ListWindow__Group_4__0 )? )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1567:1: ( rule__ListWindow__Group_4__0 )?
            {
             before(grammarAccess.getListWindowAccess().getGroup_4()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1568:1: ( rule__ListWindow__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1568:2: rule__ListWindow__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ListWindow__Group_4__0_in_rule__ListWindow__Group__4__Impl3166);
                    rule__ListWindow__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListWindowAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ListWindow__Group__4__Impl"


    // $ANTLR start "rule__ListWindow__Group__5"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1578:1: rule__ListWindow__Group__5 : rule__ListWindow__Group__5__Impl ;
    public final void rule__ListWindow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1582:1: ( rule__ListWindow__Group__5__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1583:2: rule__ListWindow__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ListWindow__Group__5__Impl_in_rule__ListWindow__Group__53197);
            rule__ListWindow__Group__5__Impl();

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
    // $ANTLR end "rule__ListWindow__Group__5"


    // $ANTLR start "rule__ListWindow__Group__5__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1589:1: rule__ListWindow__Group__5__Impl : ( ( rule__ListWindow__SizeAssignment_5 ) ) ;
    public final void rule__ListWindow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1593:1: ( ( ( rule__ListWindow__SizeAssignment_5 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1594:1: ( ( rule__ListWindow__SizeAssignment_5 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1594:1: ( ( rule__ListWindow__SizeAssignment_5 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1595:1: ( rule__ListWindow__SizeAssignment_5 )
            {
             before(grammarAccess.getListWindowAccess().getSizeAssignment_5()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1596:1: ( rule__ListWindow__SizeAssignment_5 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1596:2: rule__ListWindow__SizeAssignment_5
            {
            pushFollow(FOLLOW_rule__ListWindow__SizeAssignment_5_in_rule__ListWindow__Group__5__Impl3224);
            rule__ListWindow__SizeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getListWindowAccess().getSizeAssignment_5()); 

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
    // $ANTLR end "rule__ListWindow__Group__5__Impl"


    // $ANTLR start "rule__ListWindow__Group_4__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1618:1: rule__ListWindow__Group_4__0 : rule__ListWindow__Group_4__0__Impl rule__ListWindow__Group_4__1 ;
    public final void rule__ListWindow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1622:1: ( rule__ListWindow__Group_4__0__Impl rule__ListWindow__Group_4__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1623:2: rule__ListWindow__Group_4__0__Impl rule__ListWindow__Group_4__1
            {
            pushFollow(FOLLOW_rule__ListWindow__Group_4__0__Impl_in_rule__ListWindow__Group_4__03266);
            rule__ListWindow__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListWindow__Group_4__1_in_rule__ListWindow__Group_4__03269);
            rule__ListWindow__Group_4__1();

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
    // $ANTLR end "rule__ListWindow__Group_4__0"


    // $ANTLR start "rule__ListWindow__Group_4__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1630:1: rule__ListWindow__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__ListWindow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1634:1: ( ( 'title' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1635:1: ( 'title' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1635:1: ( 'title' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1636:1: 'title'
            {
             before(grammarAccess.getListWindowAccess().getTitleKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__ListWindow__Group_4__0__Impl3297); 
             after(grammarAccess.getListWindowAccess().getTitleKeyword_4_0()); 

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
    // $ANTLR end "rule__ListWindow__Group_4__0__Impl"


    // $ANTLR start "rule__ListWindow__Group_4__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1649:1: rule__ListWindow__Group_4__1 : rule__ListWindow__Group_4__1__Impl ;
    public final void rule__ListWindow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1653:1: ( rule__ListWindow__Group_4__1__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1654:2: rule__ListWindow__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ListWindow__Group_4__1__Impl_in_rule__ListWindow__Group_4__13328);
            rule__ListWindow__Group_4__1__Impl();

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
    // $ANTLR end "rule__ListWindow__Group_4__1"


    // $ANTLR start "rule__ListWindow__Group_4__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1660:1: rule__ListWindow__Group_4__1__Impl : ( ( rule__ListWindow__TitleAssignment_4_1 ) ) ;
    public final void rule__ListWindow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1664:1: ( ( ( rule__ListWindow__TitleAssignment_4_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1665:1: ( ( rule__ListWindow__TitleAssignment_4_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1665:1: ( ( rule__ListWindow__TitleAssignment_4_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1666:1: ( rule__ListWindow__TitleAssignment_4_1 )
            {
             before(grammarAccess.getListWindowAccess().getTitleAssignment_4_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1667:1: ( rule__ListWindow__TitleAssignment_4_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1667:2: rule__ListWindow__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ListWindow__TitleAssignment_4_1_in_rule__ListWindow__Group_4__1__Impl3355);
            rule__ListWindow__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getListWindowAccess().getTitleAssignment_4_1()); 

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
    // $ANTLR end "rule__ListWindow__Group_4__1__Impl"


    // $ANTLR start "rule__EntryWindow__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1681:1: rule__EntryWindow__Group__0 : rule__EntryWindow__Group__0__Impl rule__EntryWindow__Group__1 ;
    public final void rule__EntryWindow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1685:1: ( rule__EntryWindow__Group__0__Impl rule__EntryWindow__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1686:2: rule__EntryWindow__Group__0__Impl rule__EntryWindow__Group__1
            {
            pushFollow(FOLLOW_rule__EntryWindow__Group__0__Impl_in_rule__EntryWindow__Group__03389);
            rule__EntryWindow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntryWindow__Group__1_in_rule__EntryWindow__Group__03392);
            rule__EntryWindow__Group__1();

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
    // $ANTLR end "rule__EntryWindow__Group__0"


    // $ANTLR start "rule__EntryWindow__Group__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1693:1: rule__EntryWindow__Group__0__Impl : ( 'EntryWindow' ) ;
    public final void rule__EntryWindow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1697:1: ( ( 'EntryWindow' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1698:1: ( 'EntryWindow' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1698:1: ( 'EntryWindow' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1699:1: 'EntryWindow'
            {
             before(grammarAccess.getEntryWindowAccess().getEntryWindowKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__EntryWindow__Group__0__Impl3420); 
             after(grammarAccess.getEntryWindowAccess().getEntryWindowKeyword_0()); 

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
    // $ANTLR end "rule__EntryWindow__Group__0__Impl"


    // $ANTLR start "rule__EntryWindow__Group__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1712:1: rule__EntryWindow__Group__1 : rule__EntryWindow__Group__1__Impl rule__EntryWindow__Group__2 ;
    public final void rule__EntryWindow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1716:1: ( rule__EntryWindow__Group__1__Impl rule__EntryWindow__Group__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1717:2: rule__EntryWindow__Group__1__Impl rule__EntryWindow__Group__2
            {
            pushFollow(FOLLOW_rule__EntryWindow__Group__1__Impl_in_rule__EntryWindow__Group__13451);
            rule__EntryWindow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntryWindow__Group__2_in_rule__EntryWindow__Group__13454);
            rule__EntryWindow__Group__2();

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
    // $ANTLR end "rule__EntryWindow__Group__1"


    // $ANTLR start "rule__EntryWindow__Group__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1724:1: rule__EntryWindow__Group__1__Impl : ( ( rule__EntryWindow__NameAssignment_1 ) ) ;
    public final void rule__EntryWindow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1728:1: ( ( ( rule__EntryWindow__NameAssignment_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1729:1: ( ( rule__EntryWindow__NameAssignment_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1729:1: ( ( rule__EntryWindow__NameAssignment_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1730:1: ( rule__EntryWindow__NameAssignment_1 )
            {
             before(grammarAccess.getEntryWindowAccess().getNameAssignment_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1731:1: ( rule__EntryWindow__NameAssignment_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1731:2: rule__EntryWindow__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EntryWindow__NameAssignment_1_in_rule__EntryWindow__Group__1__Impl3481);
            rule__EntryWindow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryWindowAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EntryWindow__Group__1__Impl"


    // $ANTLR start "rule__EntryWindow__Group__2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1741:1: rule__EntryWindow__Group__2 : rule__EntryWindow__Group__2__Impl rule__EntryWindow__Group__3 ;
    public final void rule__EntryWindow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1745:1: ( rule__EntryWindow__Group__2__Impl rule__EntryWindow__Group__3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1746:2: rule__EntryWindow__Group__2__Impl rule__EntryWindow__Group__3
            {
            pushFollow(FOLLOW_rule__EntryWindow__Group__2__Impl_in_rule__EntryWindow__Group__23511);
            rule__EntryWindow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntryWindow__Group__3_in_rule__EntryWindow__Group__23514);
            rule__EntryWindow__Group__3();

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
    // $ANTLR end "rule__EntryWindow__Group__2"


    // $ANTLR start "rule__EntryWindow__Group__2__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1753:1: rule__EntryWindow__Group__2__Impl : ( 'for' ) ;
    public final void rule__EntryWindow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1757:1: ( ( 'for' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1758:1: ( 'for' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1758:1: ( 'for' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1759:1: 'for'
            {
             before(grammarAccess.getEntryWindowAccess().getForKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__EntryWindow__Group__2__Impl3542); 
             after(grammarAccess.getEntryWindowAccess().getForKeyword_2()); 

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
    // $ANTLR end "rule__EntryWindow__Group__2__Impl"


    // $ANTLR start "rule__EntryWindow__Group__3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1772:1: rule__EntryWindow__Group__3 : rule__EntryWindow__Group__3__Impl rule__EntryWindow__Group__4 ;
    public final void rule__EntryWindow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1776:1: ( rule__EntryWindow__Group__3__Impl rule__EntryWindow__Group__4 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1777:2: rule__EntryWindow__Group__3__Impl rule__EntryWindow__Group__4
            {
            pushFollow(FOLLOW_rule__EntryWindow__Group__3__Impl_in_rule__EntryWindow__Group__33573);
            rule__EntryWindow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntryWindow__Group__4_in_rule__EntryWindow__Group__33576);
            rule__EntryWindow__Group__4();

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
    // $ANTLR end "rule__EntryWindow__Group__3"


    // $ANTLR start "rule__EntryWindow__Group__3__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1784:1: rule__EntryWindow__Group__3__Impl : ( ( rule__EntryWindow__EntityAssignment_3 ) ) ;
    public final void rule__EntryWindow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1788:1: ( ( ( rule__EntryWindow__EntityAssignment_3 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1789:1: ( ( rule__EntryWindow__EntityAssignment_3 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1789:1: ( ( rule__EntryWindow__EntityAssignment_3 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1790:1: ( rule__EntryWindow__EntityAssignment_3 )
            {
             before(grammarAccess.getEntryWindowAccess().getEntityAssignment_3()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1791:1: ( rule__EntryWindow__EntityAssignment_3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1791:2: rule__EntryWindow__EntityAssignment_3
            {
            pushFollow(FOLLOW_rule__EntryWindow__EntityAssignment_3_in_rule__EntryWindow__Group__3__Impl3603);
            rule__EntryWindow__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntryWindowAccess().getEntityAssignment_3()); 

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
    // $ANTLR end "rule__EntryWindow__Group__3__Impl"


    // $ANTLR start "rule__EntryWindow__Group__4"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1801:1: rule__EntryWindow__Group__4 : rule__EntryWindow__Group__4__Impl rule__EntryWindow__Group__5 ;
    public final void rule__EntryWindow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1805:1: ( rule__EntryWindow__Group__4__Impl rule__EntryWindow__Group__5 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1806:2: rule__EntryWindow__Group__4__Impl rule__EntryWindow__Group__5
            {
            pushFollow(FOLLOW_rule__EntryWindow__Group__4__Impl_in_rule__EntryWindow__Group__43633);
            rule__EntryWindow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntryWindow__Group__5_in_rule__EntryWindow__Group__43636);
            rule__EntryWindow__Group__5();

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
    // $ANTLR end "rule__EntryWindow__Group__4"


    // $ANTLR start "rule__EntryWindow__Group__4__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1813:1: rule__EntryWindow__Group__4__Impl : ( ( rule__EntryWindow__UnorderedGroup_4 ) ) ;
    public final void rule__EntryWindow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1817:1: ( ( ( rule__EntryWindow__UnorderedGroup_4 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1818:1: ( ( rule__EntryWindow__UnorderedGroup_4 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1818:1: ( ( rule__EntryWindow__UnorderedGroup_4 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1819:1: ( rule__EntryWindow__UnorderedGroup_4 )
            {
             before(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1820:1: ( rule__EntryWindow__UnorderedGroup_4 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1820:2: rule__EntryWindow__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__EntryWindow__UnorderedGroup_4_in_rule__EntryWindow__Group__4__Impl3663);
            rule__EntryWindow__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4()); 

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
    // $ANTLR end "rule__EntryWindow__Group__4__Impl"


    // $ANTLR start "rule__EntryWindow__Group__5"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1830:1: rule__EntryWindow__Group__5 : rule__EntryWindow__Group__5__Impl rule__EntryWindow__Group__6 ;
    public final void rule__EntryWindow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1834:1: ( rule__EntryWindow__Group__5__Impl rule__EntryWindow__Group__6 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1835:2: rule__EntryWindow__Group__5__Impl rule__EntryWindow__Group__6
            {
            pushFollow(FOLLOW_rule__EntryWindow__Group__5__Impl_in_rule__EntryWindow__Group__53693);
            rule__EntryWindow__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntryWindow__Group__6_in_rule__EntryWindow__Group__53696);
            rule__EntryWindow__Group__6();

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
    // $ANTLR end "rule__EntryWindow__Group__5"


    // $ANTLR start "rule__EntryWindow__Group__5__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1842:1: rule__EntryWindow__Group__5__Impl : ( '{' ) ;
    public final void rule__EntryWindow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1846:1: ( ( '{' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1847:1: ( '{' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1847:1: ( '{' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1848:1: '{'
            {
             before(grammarAccess.getEntryWindowAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__EntryWindow__Group__5__Impl3724); 
             after(grammarAccess.getEntryWindowAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__EntryWindow__Group__5__Impl"


    // $ANTLR start "rule__EntryWindow__Group__6"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1861:1: rule__EntryWindow__Group__6 : rule__EntryWindow__Group__6__Impl rule__EntryWindow__Group__7 ;
    public final void rule__EntryWindow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1865:1: ( rule__EntryWindow__Group__6__Impl rule__EntryWindow__Group__7 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1866:2: rule__EntryWindow__Group__6__Impl rule__EntryWindow__Group__7
            {
            pushFollow(FOLLOW_rule__EntryWindow__Group__6__Impl_in_rule__EntryWindow__Group__63755);
            rule__EntryWindow__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntryWindow__Group__7_in_rule__EntryWindow__Group__63758);
            rule__EntryWindow__Group__7();

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
    // $ANTLR end "rule__EntryWindow__Group__6"


    // $ANTLR start "rule__EntryWindow__Group__6__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1873:1: rule__EntryWindow__Group__6__Impl : ( ( rule__EntryWindow__ElementsAssignment_6 )* ) ;
    public final void rule__EntryWindow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1877:1: ( ( ( rule__EntryWindow__ElementsAssignment_6 )* ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1878:1: ( ( rule__EntryWindow__ElementsAssignment_6 )* )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1878:1: ( ( rule__EntryWindow__ElementsAssignment_6 )* )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1879:1: ( rule__EntryWindow__ElementsAssignment_6 )*
            {
             before(grammarAccess.getEntryWindowAccess().getElementsAssignment_6()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1880:1: ( rule__EntryWindow__ElementsAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=36 && LA15_0<=38)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1880:2: rule__EntryWindow__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__EntryWindow__ElementsAssignment_6_in_rule__EntryWindow__Group__6__Impl3785);
            	    rule__EntryWindow__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEntryWindowAccess().getElementsAssignment_6()); 

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
    // $ANTLR end "rule__EntryWindow__Group__6__Impl"


    // $ANTLR start "rule__EntryWindow__Group__7"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1890:1: rule__EntryWindow__Group__7 : rule__EntryWindow__Group__7__Impl ;
    public final void rule__EntryWindow__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1894:1: ( rule__EntryWindow__Group__7__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1895:2: rule__EntryWindow__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__EntryWindow__Group__7__Impl_in_rule__EntryWindow__Group__73816);
            rule__EntryWindow__Group__7__Impl();

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
    // $ANTLR end "rule__EntryWindow__Group__7"


    // $ANTLR start "rule__EntryWindow__Group__7__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1901:1: rule__EntryWindow__Group__7__Impl : ( '}' ) ;
    public final void rule__EntryWindow__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1905:1: ( ( '}' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1906:1: ( '}' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1906:1: ( '}' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1907:1: '}'
            {
             before(grammarAccess.getEntryWindowAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__EntryWindow__Group__7__Impl3844); 
             after(grammarAccess.getEntryWindowAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__EntryWindow__Group__7__Impl"


    // $ANTLR start "rule__EntryWindow__Group_4_0__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1936:1: rule__EntryWindow__Group_4_0__0 : rule__EntryWindow__Group_4_0__0__Impl rule__EntryWindow__Group_4_0__1 ;
    public final void rule__EntryWindow__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1940:1: ( rule__EntryWindow__Group_4_0__0__Impl rule__EntryWindow__Group_4_0__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1941:2: rule__EntryWindow__Group_4_0__0__Impl rule__EntryWindow__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__EntryWindow__Group_4_0__0__Impl_in_rule__EntryWindow__Group_4_0__03891);
            rule__EntryWindow__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntryWindow__Group_4_0__1_in_rule__EntryWindow__Group_4_0__03894);
            rule__EntryWindow__Group_4_0__1();

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
    // $ANTLR end "rule__EntryWindow__Group_4_0__0"


    // $ANTLR start "rule__EntryWindow__Group_4_0__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1948:1: rule__EntryWindow__Group_4_0__0__Impl : ( 'title' ) ;
    public final void rule__EntryWindow__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1952:1: ( ( 'title' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1953:1: ( 'title' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1953:1: ( 'title' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1954:1: 'title'
            {
             before(grammarAccess.getEntryWindowAccess().getTitleKeyword_4_0_0()); 
            match(input,29,FOLLOW_29_in_rule__EntryWindow__Group_4_0__0__Impl3922); 
             after(grammarAccess.getEntryWindowAccess().getTitleKeyword_4_0_0()); 

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
    // $ANTLR end "rule__EntryWindow__Group_4_0__0__Impl"


    // $ANTLR start "rule__EntryWindow__Group_4_0__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1967:1: rule__EntryWindow__Group_4_0__1 : rule__EntryWindow__Group_4_0__1__Impl ;
    public final void rule__EntryWindow__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1971:1: ( rule__EntryWindow__Group_4_0__1__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1972:2: rule__EntryWindow__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EntryWindow__Group_4_0__1__Impl_in_rule__EntryWindow__Group_4_0__13953);
            rule__EntryWindow__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__EntryWindow__Group_4_0__1"


    // $ANTLR start "rule__EntryWindow__Group_4_0__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1978:1: rule__EntryWindow__Group_4_0__1__Impl : ( ( rule__EntryWindow__TitleAssignment_4_0_1 ) ) ;
    public final void rule__EntryWindow__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1982:1: ( ( ( rule__EntryWindow__TitleAssignment_4_0_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1983:1: ( ( rule__EntryWindow__TitleAssignment_4_0_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1983:1: ( ( rule__EntryWindow__TitleAssignment_4_0_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1984:1: ( rule__EntryWindow__TitleAssignment_4_0_1 )
            {
             before(grammarAccess.getEntryWindowAccess().getTitleAssignment_4_0_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1985:1: ( rule__EntryWindow__TitleAssignment_4_0_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1985:2: rule__EntryWindow__TitleAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__EntryWindow__TitleAssignment_4_0_1_in_rule__EntryWindow__Group_4_0__1__Impl3980);
            rule__EntryWindow__TitleAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryWindowAccess().getTitleAssignment_4_0_1()); 

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
    // $ANTLR end "rule__EntryWindow__Group_4_0__1__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:1999:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2003:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2004:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__04014);
            rule__Size__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Size__Group__1_in_rule__Size__Group__04017);
            rule__Size__Group__1();

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
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2011:1: rule__Size__Group__0__Impl : ( 'size=' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2015:1: ( ( 'size=' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2016:1: ( 'size=' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2016:1: ( 'size=' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2017:1: 'size='
            {
             before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Size__Group__0__Impl4045); 
             after(grammarAccess.getSizeAccess().getSizeKeyword_0()); 

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
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2030:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2034:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2035:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__14076);
            rule__Size__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Size__Group__2_in_rule__Size__Group__14079);
            rule__Size__Group__2();

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
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2042:1: rule__Size__Group__1__Impl : ( '(' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2046:1: ( ( '(' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2047:1: ( '(' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2047:1: ( '(' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2048:1: '('
            {
             before(grammarAccess.getSizeAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Size__Group__1__Impl4107); 
             after(grammarAccess.getSizeAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2061:1: rule__Size__Group__2 : rule__Size__Group__2__Impl rule__Size__Group__3 ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2065:1: ( rule__Size__Group__2__Impl rule__Size__Group__3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2066:2: rule__Size__Group__2__Impl rule__Size__Group__3
            {
            pushFollow(FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__24138);
            rule__Size__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Size__Group__3_in_rule__Size__Group__24141);
            rule__Size__Group__3();

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
    // $ANTLR end "rule__Size__Group__2"


    // $ANTLR start "rule__Size__Group__2__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2073:1: rule__Size__Group__2__Impl : ( ( rule__Size__WidthAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2077:1: ( ( ( rule__Size__WidthAssignment_2 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2078:1: ( ( rule__Size__WidthAssignment_2 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2078:1: ( ( rule__Size__WidthAssignment_2 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2079:1: ( rule__Size__WidthAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getWidthAssignment_2()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2080:1: ( rule__Size__WidthAssignment_2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2080:2: rule__Size__WidthAssignment_2
            {
            pushFollow(FOLLOW_rule__Size__WidthAssignment_2_in_rule__Size__Group__2__Impl4168);
            rule__Size__WidthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getWidthAssignment_2()); 

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
    // $ANTLR end "rule__Size__Group__2__Impl"


    // $ANTLR start "rule__Size__Group__3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2090:1: rule__Size__Group__3 : rule__Size__Group__3__Impl rule__Size__Group__4 ;
    public final void rule__Size__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2094:1: ( rule__Size__Group__3__Impl rule__Size__Group__4 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2095:2: rule__Size__Group__3__Impl rule__Size__Group__4
            {
            pushFollow(FOLLOW_rule__Size__Group__3__Impl_in_rule__Size__Group__34198);
            rule__Size__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Size__Group__4_in_rule__Size__Group__34201);
            rule__Size__Group__4();

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
    // $ANTLR end "rule__Size__Group__3"


    // $ANTLR start "rule__Size__Group__3__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2102:1: rule__Size__Group__3__Impl : ( ',' ) ;
    public final void rule__Size__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2106:1: ( ( ',' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2107:1: ( ',' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2107:1: ( ',' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2108:1: ','
            {
             before(grammarAccess.getSizeAccess().getCommaKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Size__Group__3__Impl4229); 
             after(grammarAccess.getSizeAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Size__Group__3__Impl"


    // $ANTLR start "rule__Size__Group__4"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2121:1: rule__Size__Group__4 : rule__Size__Group__4__Impl rule__Size__Group__5 ;
    public final void rule__Size__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2125:1: ( rule__Size__Group__4__Impl rule__Size__Group__5 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2126:2: rule__Size__Group__4__Impl rule__Size__Group__5
            {
            pushFollow(FOLLOW_rule__Size__Group__4__Impl_in_rule__Size__Group__44260);
            rule__Size__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Size__Group__5_in_rule__Size__Group__44263);
            rule__Size__Group__5();

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
    // $ANTLR end "rule__Size__Group__4"


    // $ANTLR start "rule__Size__Group__4__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2133:1: rule__Size__Group__4__Impl : ( ( rule__Size__HeightAssignment_4 ) ) ;
    public final void rule__Size__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2137:1: ( ( ( rule__Size__HeightAssignment_4 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2138:1: ( ( rule__Size__HeightAssignment_4 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2138:1: ( ( rule__Size__HeightAssignment_4 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2139:1: ( rule__Size__HeightAssignment_4 )
            {
             before(grammarAccess.getSizeAccess().getHeightAssignment_4()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2140:1: ( rule__Size__HeightAssignment_4 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2140:2: rule__Size__HeightAssignment_4
            {
            pushFollow(FOLLOW_rule__Size__HeightAssignment_4_in_rule__Size__Group__4__Impl4290);
            rule__Size__HeightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getHeightAssignment_4()); 

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
    // $ANTLR end "rule__Size__Group__4__Impl"


    // $ANTLR start "rule__Size__Group__5"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2150:1: rule__Size__Group__5 : rule__Size__Group__5__Impl ;
    public final void rule__Size__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2154:1: ( rule__Size__Group__5__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2155:2: rule__Size__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Size__Group__5__Impl_in_rule__Size__Group__54320);
            rule__Size__Group__5__Impl();

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
    // $ANTLR end "rule__Size__Group__5"


    // $ANTLR start "rule__Size__Group__5__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2161:1: rule__Size__Group__5__Impl : ( ')' ) ;
    public final void rule__Size__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2165:1: ( ( ')' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2166:1: ( ')' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2166:1: ( ')' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2167:1: ')'
            {
             before(grammarAccess.getSizeAccess().getRightParenthesisKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__Size__Group__5__Impl4348); 
             after(grammarAccess.getSizeAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Size__Group__5__Impl"


    // $ANTLR start "rule__Bounds__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2192:1: rule__Bounds__Group__0 : rule__Bounds__Group__0__Impl rule__Bounds__Group__1 ;
    public final void rule__Bounds__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2196:1: ( rule__Bounds__Group__0__Impl rule__Bounds__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2197:2: rule__Bounds__Group__0__Impl rule__Bounds__Group__1
            {
            pushFollow(FOLLOW_rule__Bounds__Group__0__Impl_in_rule__Bounds__Group__04391);
            rule__Bounds__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bounds__Group__1_in_rule__Bounds__Group__04394);
            rule__Bounds__Group__1();

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
    // $ANTLR end "rule__Bounds__Group__0"


    // $ANTLR start "rule__Bounds__Group__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2204:1: rule__Bounds__Group__0__Impl : ( () ) ;
    public final void rule__Bounds__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2208:1: ( ( () ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2209:1: ( () )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2209:1: ( () )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2210:1: ()
            {
             before(grammarAccess.getBoundsAccess().getBoundsAction_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2211:1: ()
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2213:1: 
            {
            }

             after(grammarAccess.getBoundsAccess().getBoundsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__0__Impl"


    // $ANTLR start "rule__Bounds__Group__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2223:1: rule__Bounds__Group__1 : rule__Bounds__Group__1__Impl rule__Bounds__Group__2 ;
    public final void rule__Bounds__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2227:1: ( rule__Bounds__Group__1__Impl rule__Bounds__Group__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2228:2: rule__Bounds__Group__1__Impl rule__Bounds__Group__2
            {
            pushFollow(FOLLOW_rule__Bounds__Group__1__Impl_in_rule__Bounds__Group__14452);
            rule__Bounds__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bounds__Group__2_in_rule__Bounds__Group__14455);
            rule__Bounds__Group__2();

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
    // $ANTLR end "rule__Bounds__Group__1"


    // $ANTLR start "rule__Bounds__Group__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2235:1: rule__Bounds__Group__1__Impl : ( 'bounds=' ) ;
    public final void rule__Bounds__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2239:1: ( ( 'bounds=' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2240:1: ( 'bounds=' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2240:1: ( 'bounds=' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2241:1: 'bounds='
            {
             before(grammarAccess.getBoundsAccess().getBoundsKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__Bounds__Group__1__Impl4483); 
             after(grammarAccess.getBoundsAccess().getBoundsKeyword_1()); 

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
    // $ANTLR end "rule__Bounds__Group__1__Impl"


    // $ANTLR start "rule__Bounds__Group__2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2254:1: rule__Bounds__Group__2 : rule__Bounds__Group__2__Impl rule__Bounds__Group__3 ;
    public final void rule__Bounds__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2258:1: ( rule__Bounds__Group__2__Impl rule__Bounds__Group__3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2259:2: rule__Bounds__Group__2__Impl rule__Bounds__Group__3
            {
            pushFollow(FOLLOW_rule__Bounds__Group__2__Impl_in_rule__Bounds__Group__24514);
            rule__Bounds__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bounds__Group__3_in_rule__Bounds__Group__24517);
            rule__Bounds__Group__3();

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
    // $ANTLR end "rule__Bounds__Group__2"


    // $ANTLR start "rule__Bounds__Group__2__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2266:1: rule__Bounds__Group__2__Impl : ( '(' ) ;
    public final void rule__Bounds__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2270:1: ( ( '(' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2271:1: ( '(' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2271:1: ( '(' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2272:1: '('
            {
             before(grammarAccess.getBoundsAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Bounds__Group__2__Impl4545); 
             after(grammarAccess.getBoundsAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Bounds__Group__2__Impl"


    // $ANTLR start "rule__Bounds__Group__3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2285:1: rule__Bounds__Group__3 : rule__Bounds__Group__3__Impl rule__Bounds__Group__4 ;
    public final void rule__Bounds__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2289:1: ( rule__Bounds__Group__3__Impl rule__Bounds__Group__4 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2290:2: rule__Bounds__Group__3__Impl rule__Bounds__Group__4
            {
            pushFollow(FOLLOW_rule__Bounds__Group__3__Impl_in_rule__Bounds__Group__34576);
            rule__Bounds__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bounds__Group__4_in_rule__Bounds__Group__34579);
            rule__Bounds__Group__4();

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
    // $ANTLR end "rule__Bounds__Group__3"


    // $ANTLR start "rule__Bounds__Group__3__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2297:1: rule__Bounds__Group__3__Impl : ( ( rule__Bounds__XAssignment_3 ) ) ;
    public final void rule__Bounds__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2301:1: ( ( ( rule__Bounds__XAssignment_3 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2302:1: ( ( rule__Bounds__XAssignment_3 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2302:1: ( ( rule__Bounds__XAssignment_3 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2303:1: ( rule__Bounds__XAssignment_3 )
            {
             before(grammarAccess.getBoundsAccess().getXAssignment_3()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2304:1: ( rule__Bounds__XAssignment_3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2304:2: rule__Bounds__XAssignment_3
            {
            pushFollow(FOLLOW_rule__Bounds__XAssignment_3_in_rule__Bounds__Group__3__Impl4606);
            rule__Bounds__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoundsAccess().getXAssignment_3()); 

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
    // $ANTLR end "rule__Bounds__Group__3__Impl"


    // $ANTLR start "rule__Bounds__Group__4"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2314:1: rule__Bounds__Group__4 : rule__Bounds__Group__4__Impl rule__Bounds__Group__5 ;
    public final void rule__Bounds__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2318:1: ( rule__Bounds__Group__4__Impl rule__Bounds__Group__5 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2319:2: rule__Bounds__Group__4__Impl rule__Bounds__Group__5
            {
            pushFollow(FOLLOW_rule__Bounds__Group__4__Impl_in_rule__Bounds__Group__44636);
            rule__Bounds__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bounds__Group__5_in_rule__Bounds__Group__44639);
            rule__Bounds__Group__5();

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
    // $ANTLR end "rule__Bounds__Group__4"


    // $ANTLR start "rule__Bounds__Group__4__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2326:1: rule__Bounds__Group__4__Impl : ( ',' ) ;
    public final void rule__Bounds__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2330:1: ( ( ',' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2331:1: ( ',' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2331:1: ( ',' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2332:1: ','
            {
             before(grammarAccess.getBoundsAccess().getCommaKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Bounds__Group__4__Impl4667); 
             after(grammarAccess.getBoundsAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Bounds__Group__4__Impl"


    // $ANTLR start "rule__Bounds__Group__5"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2345:1: rule__Bounds__Group__5 : rule__Bounds__Group__5__Impl rule__Bounds__Group__6 ;
    public final void rule__Bounds__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2349:1: ( rule__Bounds__Group__5__Impl rule__Bounds__Group__6 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2350:2: rule__Bounds__Group__5__Impl rule__Bounds__Group__6
            {
            pushFollow(FOLLOW_rule__Bounds__Group__5__Impl_in_rule__Bounds__Group__54698);
            rule__Bounds__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bounds__Group__6_in_rule__Bounds__Group__54701);
            rule__Bounds__Group__6();

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
    // $ANTLR end "rule__Bounds__Group__5"


    // $ANTLR start "rule__Bounds__Group__5__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2357:1: rule__Bounds__Group__5__Impl : ( ( rule__Bounds__YAssignment_5 ) ) ;
    public final void rule__Bounds__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2361:1: ( ( ( rule__Bounds__YAssignment_5 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2362:1: ( ( rule__Bounds__YAssignment_5 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2362:1: ( ( rule__Bounds__YAssignment_5 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2363:1: ( rule__Bounds__YAssignment_5 )
            {
             before(grammarAccess.getBoundsAccess().getYAssignment_5()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2364:1: ( rule__Bounds__YAssignment_5 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2364:2: rule__Bounds__YAssignment_5
            {
            pushFollow(FOLLOW_rule__Bounds__YAssignment_5_in_rule__Bounds__Group__5__Impl4728);
            rule__Bounds__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBoundsAccess().getYAssignment_5()); 

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
    // $ANTLR end "rule__Bounds__Group__5__Impl"


    // $ANTLR start "rule__Bounds__Group__6"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2374:1: rule__Bounds__Group__6 : rule__Bounds__Group__6__Impl rule__Bounds__Group__7 ;
    public final void rule__Bounds__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2378:1: ( rule__Bounds__Group__6__Impl rule__Bounds__Group__7 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2379:2: rule__Bounds__Group__6__Impl rule__Bounds__Group__7
            {
            pushFollow(FOLLOW_rule__Bounds__Group__6__Impl_in_rule__Bounds__Group__64758);
            rule__Bounds__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bounds__Group__7_in_rule__Bounds__Group__64761);
            rule__Bounds__Group__7();

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
    // $ANTLR end "rule__Bounds__Group__6"


    // $ANTLR start "rule__Bounds__Group__6__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2386:1: rule__Bounds__Group__6__Impl : ( ',' ) ;
    public final void rule__Bounds__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2390:1: ( ( ',' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2391:1: ( ',' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2391:1: ( ',' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2392:1: ','
            {
             before(grammarAccess.getBoundsAccess().getCommaKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__Bounds__Group__6__Impl4789); 
             after(grammarAccess.getBoundsAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Bounds__Group__6__Impl"


    // $ANTLR start "rule__Bounds__Group__7"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2405:1: rule__Bounds__Group__7 : rule__Bounds__Group__7__Impl rule__Bounds__Group__8 ;
    public final void rule__Bounds__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2409:1: ( rule__Bounds__Group__7__Impl rule__Bounds__Group__8 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2410:2: rule__Bounds__Group__7__Impl rule__Bounds__Group__8
            {
            pushFollow(FOLLOW_rule__Bounds__Group__7__Impl_in_rule__Bounds__Group__74820);
            rule__Bounds__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bounds__Group__8_in_rule__Bounds__Group__74823);
            rule__Bounds__Group__8();

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
    // $ANTLR end "rule__Bounds__Group__7"


    // $ANTLR start "rule__Bounds__Group__7__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2417:1: rule__Bounds__Group__7__Impl : ( ( rule__Bounds__WidthAssignment_7 ) ) ;
    public final void rule__Bounds__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2421:1: ( ( ( rule__Bounds__WidthAssignment_7 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2422:1: ( ( rule__Bounds__WidthAssignment_7 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2422:1: ( ( rule__Bounds__WidthAssignment_7 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2423:1: ( rule__Bounds__WidthAssignment_7 )
            {
             before(grammarAccess.getBoundsAccess().getWidthAssignment_7()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2424:1: ( rule__Bounds__WidthAssignment_7 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2424:2: rule__Bounds__WidthAssignment_7
            {
            pushFollow(FOLLOW_rule__Bounds__WidthAssignment_7_in_rule__Bounds__Group__7__Impl4850);
            rule__Bounds__WidthAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBoundsAccess().getWidthAssignment_7()); 

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
    // $ANTLR end "rule__Bounds__Group__7__Impl"


    // $ANTLR start "rule__Bounds__Group__8"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2434:1: rule__Bounds__Group__8 : rule__Bounds__Group__8__Impl rule__Bounds__Group__9 ;
    public final void rule__Bounds__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2438:1: ( rule__Bounds__Group__8__Impl rule__Bounds__Group__9 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2439:2: rule__Bounds__Group__8__Impl rule__Bounds__Group__9
            {
            pushFollow(FOLLOW_rule__Bounds__Group__8__Impl_in_rule__Bounds__Group__84880);
            rule__Bounds__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bounds__Group__9_in_rule__Bounds__Group__84883);
            rule__Bounds__Group__9();

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
    // $ANTLR end "rule__Bounds__Group__8"


    // $ANTLR start "rule__Bounds__Group__8__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2446:1: rule__Bounds__Group__8__Impl : ( ',' ) ;
    public final void rule__Bounds__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2450:1: ( ( ',' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2451:1: ( ',' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2451:1: ( ',' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2452:1: ','
            {
             before(grammarAccess.getBoundsAccess().getCommaKeyword_8()); 
            match(input,33,FOLLOW_33_in_rule__Bounds__Group__8__Impl4911); 
             after(grammarAccess.getBoundsAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__Bounds__Group__8__Impl"


    // $ANTLR start "rule__Bounds__Group__9"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2465:1: rule__Bounds__Group__9 : rule__Bounds__Group__9__Impl rule__Bounds__Group__10 ;
    public final void rule__Bounds__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2469:1: ( rule__Bounds__Group__9__Impl rule__Bounds__Group__10 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2470:2: rule__Bounds__Group__9__Impl rule__Bounds__Group__10
            {
            pushFollow(FOLLOW_rule__Bounds__Group__9__Impl_in_rule__Bounds__Group__94942);
            rule__Bounds__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bounds__Group__10_in_rule__Bounds__Group__94945);
            rule__Bounds__Group__10();

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
    // $ANTLR end "rule__Bounds__Group__9"


    // $ANTLR start "rule__Bounds__Group__9__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2477:1: rule__Bounds__Group__9__Impl : ( ( rule__Bounds__HeightAssignment_9 ) ) ;
    public final void rule__Bounds__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2481:1: ( ( ( rule__Bounds__HeightAssignment_9 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2482:1: ( ( rule__Bounds__HeightAssignment_9 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2482:1: ( ( rule__Bounds__HeightAssignment_9 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2483:1: ( rule__Bounds__HeightAssignment_9 )
            {
             before(grammarAccess.getBoundsAccess().getHeightAssignment_9()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2484:1: ( rule__Bounds__HeightAssignment_9 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2484:2: rule__Bounds__HeightAssignment_9
            {
            pushFollow(FOLLOW_rule__Bounds__HeightAssignment_9_in_rule__Bounds__Group__9__Impl4972);
            rule__Bounds__HeightAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getBoundsAccess().getHeightAssignment_9()); 

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
    // $ANTLR end "rule__Bounds__Group__9__Impl"


    // $ANTLR start "rule__Bounds__Group__10"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2494:1: rule__Bounds__Group__10 : rule__Bounds__Group__10__Impl ;
    public final void rule__Bounds__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2498:1: ( rule__Bounds__Group__10__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2499:2: rule__Bounds__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Bounds__Group__10__Impl_in_rule__Bounds__Group__105002);
            rule__Bounds__Group__10__Impl();

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
    // $ANTLR end "rule__Bounds__Group__10"


    // $ANTLR start "rule__Bounds__Group__10__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2505:1: rule__Bounds__Group__10__Impl : ( ')' ) ;
    public final void rule__Bounds__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2509:1: ( ( ')' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2510:1: ( ')' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2510:1: ( ')' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2511:1: ')'
            {
             before(grammarAccess.getBoundsAccess().getRightParenthesisKeyword_10()); 
            match(input,34,FOLLOW_34_in_rule__Bounds__Group__10__Impl5030); 
             after(grammarAccess.getBoundsAccess().getRightParenthesisKeyword_10()); 

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
    // $ANTLR end "rule__Bounds__Group__10__Impl"


    // $ANTLR start "rule__UIElement__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2546:1: rule__UIElement__Group__0 : rule__UIElement__Group__0__Impl rule__UIElement__Group__1 ;
    public final void rule__UIElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2550:1: ( rule__UIElement__Group__0__Impl rule__UIElement__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2551:2: rule__UIElement__Group__0__Impl rule__UIElement__Group__1
            {
            pushFollow(FOLLOW_rule__UIElement__Group__0__Impl_in_rule__UIElement__Group__05083);
            rule__UIElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UIElement__Group__1_in_rule__UIElement__Group__05086);
            rule__UIElement__Group__1();

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
    // $ANTLR end "rule__UIElement__Group__0"


    // $ANTLR start "rule__UIElement__Group__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2558:1: rule__UIElement__Group__0__Impl : ( ( rule__UIElement__Alternatives_0 ) ) ;
    public final void rule__UIElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2562:1: ( ( ( rule__UIElement__Alternatives_0 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2563:1: ( ( rule__UIElement__Alternatives_0 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2563:1: ( ( rule__UIElement__Alternatives_0 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2564:1: ( rule__UIElement__Alternatives_0 )
            {
             before(grammarAccess.getUIElementAccess().getAlternatives_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2565:1: ( rule__UIElement__Alternatives_0 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2565:2: rule__UIElement__Alternatives_0
            {
            pushFollow(FOLLOW_rule__UIElement__Alternatives_0_in_rule__UIElement__Group__0__Impl5113);
            rule__UIElement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getUIElementAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__UIElement__Group__0__Impl"


    // $ANTLR start "rule__UIElement__Group__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2575:1: rule__UIElement__Group__1 : rule__UIElement__Group__1__Impl ;
    public final void rule__UIElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2579:1: ( rule__UIElement__Group__1__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2580:2: rule__UIElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UIElement__Group__1__Impl_in_rule__UIElement__Group__15143);
            rule__UIElement__Group__1__Impl();

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
    // $ANTLR end "rule__UIElement__Group__1"


    // $ANTLR start "rule__UIElement__Group__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2586:1: rule__UIElement__Group__1__Impl : ( ( rule__UIElement__BoundsAssignment_1 ) ) ;
    public final void rule__UIElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2590:1: ( ( ( rule__UIElement__BoundsAssignment_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2591:1: ( ( rule__UIElement__BoundsAssignment_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2591:1: ( ( rule__UIElement__BoundsAssignment_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2592:1: ( rule__UIElement__BoundsAssignment_1 )
            {
             before(grammarAccess.getUIElementAccess().getBoundsAssignment_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2593:1: ( rule__UIElement__BoundsAssignment_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2593:2: rule__UIElement__BoundsAssignment_1
            {
            pushFollow(FOLLOW_rule__UIElement__BoundsAssignment_1_in_rule__UIElement__Group__1__Impl5170);
            rule__UIElement__BoundsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUIElementAccess().getBoundsAssignment_1()); 

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
    // $ANTLR end "rule__UIElement__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2607:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2611:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2612:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__05204);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__1_in_rule__Label__Group__05207);
            rule__Label__Group__1();

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
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2619:1: rule__Label__Group__0__Impl : ( 'Label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2623:1: ( ( 'Label' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2624:1: ( 'Label' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2624:1: ( 'Label' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2625:1: 'Label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Label__Group__0__Impl5235); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

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
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2638:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2642:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2643:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__15266);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__2_in_rule__Label__Group__15269);
            rule__Label__Group__2();

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
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2650:1: rule__Label__Group__1__Impl : ( ( rule__Label__NameAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2654:1: ( ( ( rule__Label__NameAssignment_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2655:1: ( ( rule__Label__NameAssignment_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2655:1: ( ( rule__Label__NameAssignment_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2656:1: ( rule__Label__NameAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2657:1: ( rule__Label__NameAssignment_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2657:2: rule__Label__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Label__NameAssignment_1_in_rule__Label__Group__1__Impl5296);
            rule__Label__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2667:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2671:1: ( rule__Label__Group__2__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2672:2: rule__Label__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group__2__Impl_in_rule__Label__Group__25326);
            rule__Label__Group__2__Impl();

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
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2678:1: rule__Label__Group__2__Impl : ( ( rule__Label__Group_2__0 )? ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2682:1: ( ( ( rule__Label__Group_2__0 )? ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2683:1: ( ( rule__Label__Group_2__0 )? )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2683:1: ( ( rule__Label__Group_2__0 )? )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2684:1: ( rule__Label__Group_2__0 )?
            {
             before(grammarAccess.getLabelAccess().getGroup_2()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2685:1: ( rule__Label__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2685:2: rule__Label__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Label__Group_2__0_in_rule__Label__Group__2__Impl5353);
                    rule__Label__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__Label__Group_2__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2701:1: rule__Label__Group_2__0 : rule__Label__Group_2__0__Impl rule__Label__Group_2__1 ;
    public final void rule__Label__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2705:1: ( rule__Label__Group_2__0__Impl rule__Label__Group_2__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2706:2: rule__Label__Group_2__0__Impl rule__Label__Group_2__1
            {
            pushFollow(FOLLOW_rule__Label__Group_2__0__Impl_in_rule__Label__Group_2__05390);
            rule__Label__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group_2__1_in_rule__Label__Group_2__05393);
            rule__Label__Group_2__1();

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
    // $ANTLR end "rule__Label__Group_2__0"


    // $ANTLR start "rule__Label__Group_2__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2713:1: rule__Label__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Label__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2717:1: ( ( '(' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2718:1: ( '(' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2718:1: ( '(' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2719:1: '('
            {
             before(grammarAccess.getLabelAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Label__Group_2__0__Impl5421); 
             after(grammarAccess.getLabelAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Label__Group_2__0__Impl"


    // $ANTLR start "rule__Label__Group_2__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2732:1: rule__Label__Group_2__1 : rule__Label__Group_2__1__Impl rule__Label__Group_2__2 ;
    public final void rule__Label__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2736:1: ( rule__Label__Group_2__1__Impl rule__Label__Group_2__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2737:2: rule__Label__Group_2__1__Impl rule__Label__Group_2__2
            {
            pushFollow(FOLLOW_rule__Label__Group_2__1__Impl_in_rule__Label__Group_2__15452);
            rule__Label__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group_2__2_in_rule__Label__Group_2__15455);
            rule__Label__Group_2__2();

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
    // $ANTLR end "rule__Label__Group_2__1"


    // $ANTLR start "rule__Label__Group_2__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2744:1: rule__Label__Group_2__1__Impl : ( ( rule__Label__TextAssignment_2_1 )? ) ;
    public final void rule__Label__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2748:1: ( ( ( rule__Label__TextAssignment_2_1 )? ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2749:1: ( ( rule__Label__TextAssignment_2_1 )? )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2749:1: ( ( rule__Label__TextAssignment_2_1 )? )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2750:1: ( rule__Label__TextAssignment_2_1 )?
            {
             before(grammarAccess.getLabelAccess().getTextAssignment_2_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2751:1: ( rule__Label__TextAssignment_2_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2751:2: rule__Label__TextAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Label__TextAssignment_2_1_in_rule__Label__Group_2__1__Impl5482);
                    rule__Label__TextAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabelAccess().getTextAssignment_2_1()); 

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
    // $ANTLR end "rule__Label__Group_2__1__Impl"


    // $ANTLR start "rule__Label__Group_2__2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2761:1: rule__Label__Group_2__2 : rule__Label__Group_2__2__Impl ;
    public final void rule__Label__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2765:1: ( rule__Label__Group_2__2__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2766:2: rule__Label__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group_2__2__Impl_in_rule__Label__Group_2__25513);
            rule__Label__Group_2__2__Impl();

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
    // $ANTLR end "rule__Label__Group_2__2"


    // $ANTLR start "rule__Label__Group_2__2__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2772:1: rule__Label__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Label__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2776:1: ( ( ')' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2777:1: ( ')' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2777:1: ( ')' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2778:1: ')'
            {
             before(grammarAccess.getLabelAccess().getRightParenthesisKeyword_2_2()); 
            match(input,34,FOLLOW_34_in_rule__Label__Group_2__2__Impl5541); 
             after(grammarAccess.getLabelAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Label__Group_2__2__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2797:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2801:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2802:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05578);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05581);
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
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2809:1: rule__Field__Group__0__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2813:1: ( ( 'Field' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2814:1: ( 'Field' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2814:1: ( 'Field' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2815:1: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Field__Group__0__Impl5609); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_0()); 

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
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2828:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2832:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2833:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15640);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15643);
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
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2840:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2844:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2845:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2845:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2846:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2847:1: ( rule__Field__NameAssignment_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2847:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl5670);
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
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2857:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2861:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2862:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25700);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25703);
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
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2869:1: rule__Field__Group__2__Impl : ( 'for' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2873:1: ( ( 'for' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2874:1: ( 'for' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2874:1: ( 'for' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2875:1: 'for'
            {
             before(grammarAccess.getFieldAccess().getForKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Field__Group__2__Impl5731); 
             after(grammarAccess.getFieldAccess().getForKeyword_2()); 

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
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2888:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2892:1: ( rule__Field__Group__3__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2893:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35762);
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
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2899:1: rule__Field__Group__3__Impl : ( ( rule__Field__PropertyAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2903:1: ( ( ( rule__Field__PropertyAssignment_3 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2904:1: ( ( rule__Field__PropertyAssignment_3 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2904:1: ( ( rule__Field__PropertyAssignment_3 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2905:1: ( rule__Field__PropertyAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getPropertyAssignment_3()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2906:1: ( rule__Field__PropertyAssignment_3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2906:2: rule__Field__PropertyAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__PropertyAssignment_3_in_rule__Field__Group__3__Impl5789);
            rule__Field__PropertyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getPropertyAssignment_3()); 

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


    // $ANTLR start "rule__Button__Group__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2924:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2928:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2929:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__05827);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__1_in_rule__Button__Group__05830);
            rule__Button__Group__1();

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
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2936:1: rule__Button__Group__0__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2940:1: ( ( 'Button' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2941:1: ( 'Button' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2941:1: ( 'Button' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2942:1: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Button__Group__0__Impl5858); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

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
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2955:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2959:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2960:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__15889);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__2_in_rule__Button__Group__15892);
            rule__Button__Group__2();

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
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2967:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2971:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2972:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2972:1: ( ( rule__Button__NameAssignment_1 ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2973:1: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2974:1: ( rule__Button__NameAssignment_1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2974:2: rule__Button__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Button__NameAssignment_1_in_rule__Button__Group__1__Impl5919);
            rule__Button__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2984:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2988:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2989:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__25949);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__3_in_rule__Button__Group__25952);
            rule__Button__Group__3();

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
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:2996:1: rule__Button__Group__2__Impl : ( ( rule__Button__KindAssignment_2 )? ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3000:1: ( ( ( rule__Button__KindAssignment_2 )? ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3001:1: ( ( rule__Button__KindAssignment_2 )? )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3001:1: ( ( rule__Button__KindAssignment_2 )? )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3002:1: ( rule__Button__KindAssignment_2 )?
            {
             before(grammarAccess.getButtonAccess().getKindAssignment_2()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3003:1: ( rule__Button__KindAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=16 && LA18_0<=18)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3003:2: rule__Button__KindAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Button__KindAssignment_2_in_rule__Button__Group__2__Impl5979);
                    rule__Button__KindAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getKindAssignment_2()); 

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
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3013:1: rule__Button__Group__3 : rule__Button__Group__3__Impl ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3017:1: ( rule__Button__Group__3__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3018:2: rule__Button__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__36010);
            rule__Button__Group__3__Impl();

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
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3024:1: rule__Button__Group__3__Impl : ( ( rule__Button__Group_3__0 )? ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3028:1: ( ( ( rule__Button__Group_3__0 )? ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3029:1: ( ( rule__Button__Group_3__0 )? )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3029:1: ( ( rule__Button__Group_3__0 )? )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3030:1: ( rule__Button__Group_3__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_3()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3031:1: ( rule__Button__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3031:2: rule__Button__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Button__Group_3__0_in_rule__Button__Group__3__Impl6037);
                    rule__Button__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group_3__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3049:1: rule__Button__Group_3__0 : rule__Button__Group_3__0__Impl rule__Button__Group_3__1 ;
    public final void rule__Button__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3053:1: ( rule__Button__Group_3__0__Impl rule__Button__Group_3__1 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3054:2: rule__Button__Group_3__0__Impl rule__Button__Group_3__1
            {
            pushFollow(FOLLOW_rule__Button__Group_3__0__Impl_in_rule__Button__Group_3__06076);
            rule__Button__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_3__1_in_rule__Button__Group_3__06079);
            rule__Button__Group_3__1();

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
    // $ANTLR end "rule__Button__Group_3__0"


    // $ANTLR start "rule__Button__Group_3__0__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3061:1: rule__Button__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Button__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3065:1: ( ( '(' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3066:1: ( '(' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3066:1: ( '(' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3067:1: '('
            {
             before(grammarAccess.getButtonAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__Button__Group_3__0__Impl6107); 
             after(grammarAccess.getButtonAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__Button__Group_3__0__Impl"


    // $ANTLR start "rule__Button__Group_3__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3080:1: rule__Button__Group_3__1 : rule__Button__Group_3__1__Impl rule__Button__Group_3__2 ;
    public final void rule__Button__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3084:1: ( rule__Button__Group_3__1__Impl rule__Button__Group_3__2 )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3085:2: rule__Button__Group_3__1__Impl rule__Button__Group_3__2
            {
            pushFollow(FOLLOW_rule__Button__Group_3__1__Impl_in_rule__Button__Group_3__16138);
            rule__Button__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_3__2_in_rule__Button__Group_3__16141);
            rule__Button__Group_3__2();

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
    // $ANTLR end "rule__Button__Group_3__1"


    // $ANTLR start "rule__Button__Group_3__1__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3092:1: rule__Button__Group_3__1__Impl : ( ( rule__Button__TextAssignment_3_1 )? ) ;
    public final void rule__Button__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3096:1: ( ( ( rule__Button__TextAssignment_3_1 )? ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3097:1: ( ( rule__Button__TextAssignment_3_1 )? )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3097:1: ( ( rule__Button__TextAssignment_3_1 )? )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3098:1: ( rule__Button__TextAssignment_3_1 )?
            {
             before(grammarAccess.getButtonAccess().getTextAssignment_3_1()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3099:1: ( rule__Button__TextAssignment_3_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3099:2: rule__Button__TextAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Button__TextAssignment_3_1_in_rule__Button__Group_3__1__Impl6168);
                    rule__Button__TextAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getTextAssignment_3_1()); 

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
    // $ANTLR end "rule__Button__Group_3__1__Impl"


    // $ANTLR start "rule__Button__Group_3__2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3109:1: rule__Button__Group_3__2 : rule__Button__Group_3__2__Impl ;
    public final void rule__Button__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3113:1: ( rule__Button__Group_3__2__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3114:2: rule__Button__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_3__2__Impl_in_rule__Button__Group_3__26199);
            rule__Button__Group_3__2__Impl();

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
    // $ANTLR end "rule__Button__Group_3__2"


    // $ANTLR start "rule__Button__Group_3__2__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3120:1: rule__Button__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Button__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3124:1: ( ( ')' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3125:1: ( ')' )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3125:1: ( ')' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3126:1: ')'
            {
             before(grammarAccess.getButtonAccess().getRightParenthesisKeyword_3_2()); 
            match(input,34,FOLLOW_34_in_rule__Button__Group_3__2__Impl6227); 
             after(grammarAccess.getButtonAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__Button__Group_3__2__Impl"


    // $ANTLR start "rule__EntryWindow__UnorderedGroup_4"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3146:1: rule__EntryWindow__UnorderedGroup_4 : rule__EntryWindow__UnorderedGroup_4__0 {...}?;
    public final void rule__EntryWindow__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4());
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3151:1: ( rule__EntryWindow__UnorderedGroup_4__0 {...}?)
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3152:2: rule__EntryWindow__UnorderedGroup_4__0 {...}?
            {
            pushFollow(FOLLOW_rule__EntryWindow__UnorderedGroup_4__0_in_rule__EntryWindow__UnorderedGroup_46265);
            rule__EntryWindow__UnorderedGroup_4__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "rule__EntryWindow__UnorderedGroup_4", "getUnorderedGroupHelper().canLeave(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryWindow__UnorderedGroup_4"


    // $ANTLR start "rule__EntryWindow__UnorderedGroup_4__Impl"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3163:1: rule__EntryWindow__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__EntryWindow__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EntryWindow__SizeAssignment_4_1 ) ) ) ) ) ;
    public final void rule__EntryWindow__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3168:1: ( ( ({...}? => ( ( ( rule__EntryWindow__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EntryWindow__SizeAssignment_4_1 ) ) ) ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3169:3: ( ({...}? => ( ( ( rule__EntryWindow__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EntryWindow__SizeAssignment_4_1 ) ) ) ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3169:3: ( ({...}? => ( ( ( rule__EntryWindow__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EntryWindow__SizeAssignment_4_1 ) ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 1) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3171:4: ({...}? => ( ( ( rule__EntryWindow__Group_4_0__0 ) ) ) )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3171:4: ({...}? => ( ( ( rule__EntryWindow__Group_4_0__0 ) ) ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3172:5: {...}? => ( ( ( rule__EntryWindow__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EntryWindow__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3172:108: ( ( ( rule__EntryWindow__Group_4_0__0 ) ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3173:6: ( ( rule__EntryWindow__Group_4_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3179:6: ( ( rule__EntryWindow__Group_4_0__0 ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3181:7: ( rule__EntryWindow__Group_4_0__0 )
                    {
                     before(grammarAccess.getEntryWindowAccess().getGroup_4_0()); 
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3182:7: ( rule__EntryWindow__Group_4_0__0 )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3182:8: rule__EntryWindow__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__EntryWindow__Group_4_0__0_in_rule__EntryWindow__UnorderedGroup_4__Impl6354);
                    rule__EntryWindow__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntryWindowAccess().getGroup_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3188:4: ({...}? => ( ( ( rule__EntryWindow__SizeAssignment_4_1 ) ) ) )
                    {
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3188:4: ({...}? => ( ( ( rule__EntryWindow__SizeAssignment_4_1 ) ) ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3189:5: {...}? => ( ( ( rule__EntryWindow__SizeAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EntryWindow__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3189:108: ( ( ( rule__EntryWindow__SizeAssignment_4_1 ) ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3190:6: ( ( rule__EntryWindow__SizeAssignment_4_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3196:6: ( ( rule__EntryWindow__SizeAssignment_4_1 ) )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3198:7: ( rule__EntryWindow__SizeAssignment_4_1 )
                    {
                     before(grammarAccess.getEntryWindowAccess().getSizeAssignment_4_1()); 
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3199:7: ( rule__EntryWindow__SizeAssignment_4_1 )
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3199:8: rule__EntryWindow__SizeAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__EntryWindow__SizeAssignment_4_1_in_rule__EntryWindow__UnorderedGroup_4__Impl6445);
                    rule__EntryWindow__SizeAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntryWindowAccess().getSizeAssignment_4_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryWindow__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__EntryWindow__UnorderedGroup_4__0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3214:1: rule__EntryWindow__UnorderedGroup_4__0 : rule__EntryWindow__UnorderedGroup_4__Impl ( rule__EntryWindow__UnorderedGroup_4__1 )? ;
    public final void rule__EntryWindow__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3218:1: ( rule__EntryWindow__UnorderedGroup_4__Impl ( rule__EntryWindow__UnorderedGroup_4__1 )? )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3219:2: rule__EntryWindow__UnorderedGroup_4__Impl ( rule__EntryWindow__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__EntryWindow__UnorderedGroup_4__Impl_in_rule__EntryWindow__UnorderedGroup_4__06504);
            rule__EntryWindow__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3220:2: ( rule__EntryWindow__UnorderedGroup_4__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntryWindowAccess().getUnorderedGroup_4(), 1) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3220:2: rule__EntryWindow__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__EntryWindow__UnorderedGroup_4__1_in_rule__EntryWindow__UnorderedGroup_4__06507);
                    rule__EntryWindow__UnorderedGroup_4__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__EntryWindow__UnorderedGroup_4__0"


    // $ANTLR start "rule__EntryWindow__UnorderedGroup_4__1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3227:1: rule__EntryWindow__UnorderedGroup_4__1 : rule__EntryWindow__UnorderedGroup_4__Impl ;
    public final void rule__EntryWindow__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3231:1: ( rule__EntryWindow__UnorderedGroup_4__Impl )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3232:2: rule__EntryWindow__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__EntryWindow__UnorderedGroup_4__Impl_in_rule__EntryWindow__UnorderedGroup_4__16532);
            rule__EntryWindow__UnorderedGroup_4__Impl();

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
    // $ANTLR end "rule__EntryWindow__UnorderedGroup_4__1"


    // $ANTLR start "rule__Model__EntitiesAssignment_0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3243:1: rule__Model__EntitiesAssignment_0 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3247:1: ( ( ruleEntity ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3248:1: ( ruleEntity )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3248:1: ( ruleEntity )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3249:1: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Model__EntitiesAssignment_06564);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__EntitiesAssignment_0"


    // $ANTLR start "rule__Model__WindowsAssignment_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3258:1: rule__Model__WindowsAssignment_1 : ( ruleWindow ) ;
    public final void rule__Model__WindowsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3262:1: ( ( ruleWindow ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3263:1: ( ruleWindow )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3263:1: ( ruleWindow )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3264:1: ruleWindow
            {
             before(grammarAccess.getModelAccess().getWindowsWindowParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWindow_in_rule__Model__WindowsAssignment_16595);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWindowsWindowParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__WindowsAssignment_1"


    // $ANTLR start "rule__Entity__AbstractAssignment_0"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3273:1: rule__Entity__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Entity__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3277:1: ( ( ( 'abstract' ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3278:1: ( ( 'abstract' ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3278:1: ( ( 'abstract' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3279:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3280:1: ( 'abstract' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3281:1: 'abstract'
            {
             before(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Entity__AbstractAssignment_06631); 
             after(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getEntityAccess().getAbstractAbstractKeyword_0_0()); 

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
    // $ANTLR end "rule__Entity__AbstractAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3296:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3300:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3301:1: ( RULE_ID )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3301:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3302:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_26670); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_3_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3311:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3315:1: ( ( ( RULE_ID ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3316:1: ( ( RULE_ID ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3316:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3317:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3318:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3319:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_16705); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Entity__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__Entity__PropertiesAssignment_5"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3330:1: rule__Entity__PropertiesAssignment_5 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3334:1: ( ( ruleProperty ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3335:1: ( ruleProperty )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3335:1: ( ruleProperty )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3336:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_56740);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Entity__PropertiesAssignment_5"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3345:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3349:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3350:1: ( RULE_ID )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3350:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3351:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_16771); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3360:1: rule__Attribute__TypeAssignment_3 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3364:1: ( ( ruleAttributeType ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3365:1: ( ruleAttributeType )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3365:1: ( ruleAttributeType )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3366:1: ruleAttributeType
            {
             before(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_36802);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Attribute__OptionalAssignment_4"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3375:1: rule__Attribute__OptionalAssignment_4 : ( ( 'optional' ) ) ;
    public final void rule__Attribute__OptionalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3379:1: ( ( ( 'optional' ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3380:1: ( ( 'optional' ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3380:1: ( ( 'optional' ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3381:1: ( 'optional' )
            {
             before(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_4_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3382:1: ( 'optional' )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3383:1: 'optional'
            {
             before(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_4_0()); 
            match(input,40,FOLLOW_40_in_rule__Attribute__OptionalAssignment_46838); 
             after(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_4_0()); 

            }

             after(grammarAccess.getAttributeAccess().getOptionalOptionalKeyword_4_0()); 

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
    // $ANTLR end "rule__Attribute__OptionalAssignment_4"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3398:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3402:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3403:1: ( RULE_ID )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3403:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3404:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_16877); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__TypeAssignment_3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3413:1: rule__Reference__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3417:1: ( ( ( RULE_ID ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3418:1: ( ( RULE_ID ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3418:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3419:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_3_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3420:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3421:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getTypeEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__TypeAssignment_36912); 
             after(grammarAccess.getReferenceAccess().getTypeEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__Reference__TypeAssignment_3"


    // $ANTLR start "rule__Reference__MultiplicityAssignment_4"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3432:1: rule__Reference__MultiplicityAssignment_4 : ( ruleMultiplicityKind ) ;
    public final void rule__Reference__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3436:1: ( ( ruleMultiplicityKind ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3437:1: ( ruleMultiplicityKind )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3437:1: ( ruleMultiplicityKind )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3438:1: ruleMultiplicityKind
            {
             before(grammarAccess.getReferenceAccess().getMultiplicityMultiplicityKindEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMultiplicityKind_in_rule__Reference__MultiplicityAssignment_46947);
            ruleMultiplicityKind();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getMultiplicityMultiplicityKindEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Reference__MultiplicityAssignment_4"


    // $ANTLR start "rule__Reference__OppositeAssignment_5_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3447:1: rule__Reference__OppositeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__OppositeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3451:1: ( ( ( RULE_ID ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3452:1: ( ( RULE_ID ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3452:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3453:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3454:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3455:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_5_16982); 
             after(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Reference__OppositeAssignment_5_1"


    // $ANTLR start "rule__ListWindow__NameAssignment_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3466:1: rule__ListWindow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ListWindow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3470:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3471:1: ( RULE_ID )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3471:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3472:1: RULE_ID
            {
             before(grammarAccess.getListWindowAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListWindow__NameAssignment_17017); 
             after(grammarAccess.getListWindowAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ListWindow__NameAssignment_1"


    // $ANTLR start "rule__ListWindow__EntityAssignment_3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3481:1: rule__ListWindow__EntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ListWindow__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3485:1: ( ( ( RULE_ID ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3486:1: ( ( RULE_ID ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3486:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3487:1: ( RULE_ID )
            {
             before(grammarAccess.getListWindowAccess().getEntityEntityCrossReference_3_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3488:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3489:1: RULE_ID
            {
             before(grammarAccess.getListWindowAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListWindow__EntityAssignment_37052); 
             after(grammarAccess.getListWindowAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getListWindowAccess().getEntityEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__ListWindow__EntityAssignment_3"


    // $ANTLR start "rule__ListWindow__TitleAssignment_4_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3500:1: rule__ListWindow__TitleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ListWindow__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3504:1: ( ( RULE_STRING ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3505:1: ( RULE_STRING )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3505:1: ( RULE_STRING )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3506:1: RULE_STRING
            {
             before(grammarAccess.getListWindowAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListWindow__TitleAssignment_4_17087); 
             after(grammarAccess.getListWindowAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ListWindow__TitleAssignment_4_1"


    // $ANTLR start "rule__ListWindow__SizeAssignment_5"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3515:1: rule__ListWindow__SizeAssignment_5 : ( ruleSize ) ;
    public final void rule__ListWindow__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3519:1: ( ( ruleSize ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3520:1: ( ruleSize )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3520:1: ( ruleSize )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3521:1: ruleSize
            {
             before(grammarAccess.getListWindowAccess().getSizeSizeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSize_in_rule__ListWindow__SizeAssignment_57118);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getListWindowAccess().getSizeSizeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ListWindow__SizeAssignment_5"


    // $ANTLR start "rule__EntryWindow__NameAssignment_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3530:1: rule__EntryWindow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntryWindow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3534:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3535:1: ( RULE_ID )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3535:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3536:1: RULE_ID
            {
             before(grammarAccess.getEntryWindowAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntryWindow__NameAssignment_17149); 
             after(grammarAccess.getEntryWindowAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntryWindow__NameAssignment_1"


    // $ANTLR start "rule__EntryWindow__EntityAssignment_3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3545:1: rule__EntryWindow__EntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__EntryWindow__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3549:1: ( ( ( RULE_ID ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3550:1: ( ( RULE_ID ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3550:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3551:1: ( RULE_ID )
            {
             before(grammarAccess.getEntryWindowAccess().getEntityEntityCrossReference_3_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3552:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3553:1: RULE_ID
            {
             before(grammarAccess.getEntryWindowAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntryWindow__EntityAssignment_37184); 
             after(grammarAccess.getEntryWindowAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getEntryWindowAccess().getEntityEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__EntryWindow__EntityAssignment_3"


    // $ANTLR start "rule__EntryWindow__TitleAssignment_4_0_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3564:1: rule__EntryWindow__TitleAssignment_4_0_1 : ( RULE_STRING ) ;
    public final void rule__EntryWindow__TitleAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3568:1: ( ( RULE_STRING ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3569:1: ( RULE_STRING )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3569:1: ( RULE_STRING )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3570:1: RULE_STRING
            {
             before(grammarAccess.getEntryWindowAccess().getTitleSTRINGTerminalRuleCall_4_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EntryWindow__TitleAssignment_4_0_17219); 
             after(grammarAccess.getEntryWindowAccess().getTitleSTRINGTerminalRuleCall_4_0_1_0()); 

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
    // $ANTLR end "rule__EntryWindow__TitleAssignment_4_0_1"


    // $ANTLR start "rule__EntryWindow__SizeAssignment_4_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3579:1: rule__EntryWindow__SizeAssignment_4_1 : ( ruleSize ) ;
    public final void rule__EntryWindow__SizeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3583:1: ( ( ruleSize ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3584:1: ( ruleSize )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3584:1: ( ruleSize )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3585:1: ruleSize
            {
             before(grammarAccess.getEntryWindowAccess().getSizeSizeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSize_in_rule__EntryWindow__SizeAssignment_4_17250);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getEntryWindowAccess().getSizeSizeParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__EntryWindow__SizeAssignment_4_1"


    // $ANTLR start "rule__EntryWindow__ElementsAssignment_6"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3594:1: rule__EntryWindow__ElementsAssignment_6 : ( ruleUIElement ) ;
    public final void rule__EntryWindow__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3598:1: ( ( ruleUIElement ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3599:1: ( ruleUIElement )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3599:1: ( ruleUIElement )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3600:1: ruleUIElement
            {
             before(grammarAccess.getEntryWindowAccess().getElementsUIElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleUIElement_in_rule__EntryWindow__ElementsAssignment_67281);
            ruleUIElement();

            state._fsp--;

             after(grammarAccess.getEntryWindowAccess().getElementsUIElementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__EntryWindow__ElementsAssignment_6"


    // $ANTLR start "rule__Size__WidthAssignment_2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3609:1: rule__Size__WidthAssignment_2 : ( RULE_INT ) ;
    public final void rule__Size__WidthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3613:1: ( ( RULE_INT ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3614:1: ( RULE_INT )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3614:1: ( RULE_INT )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3615:1: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Size__WidthAssignment_27312); 
             after(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Size__WidthAssignment_2"


    // $ANTLR start "rule__Size__HeightAssignment_4"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3624:1: rule__Size__HeightAssignment_4 : ( RULE_INT ) ;
    public final void rule__Size__HeightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3628:1: ( ( RULE_INT ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3629:1: ( RULE_INT )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3629:1: ( RULE_INT )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3630:1: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Size__HeightAssignment_47343); 
             after(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Size__HeightAssignment_4"


    // $ANTLR start "rule__Bounds__XAssignment_3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3639:1: rule__Bounds__XAssignment_3 : ( RULE_INT ) ;
    public final void rule__Bounds__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3643:1: ( ( RULE_INT ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3644:1: ( RULE_INT )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3644:1: ( RULE_INT )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3645:1: RULE_INT
            {
             before(grammarAccess.getBoundsAccess().getXINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Bounds__XAssignment_37374); 
             after(grammarAccess.getBoundsAccess().getXINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Bounds__XAssignment_3"


    // $ANTLR start "rule__Bounds__YAssignment_5"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3654:1: rule__Bounds__YAssignment_5 : ( RULE_INT ) ;
    public final void rule__Bounds__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3658:1: ( ( RULE_INT ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3659:1: ( RULE_INT )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3659:1: ( RULE_INT )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3660:1: RULE_INT
            {
             before(grammarAccess.getBoundsAccess().getYINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Bounds__YAssignment_57405); 
             after(grammarAccess.getBoundsAccess().getYINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Bounds__YAssignment_5"


    // $ANTLR start "rule__Bounds__WidthAssignment_7"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3669:1: rule__Bounds__WidthAssignment_7 : ( RULE_INT ) ;
    public final void rule__Bounds__WidthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3673:1: ( ( RULE_INT ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3674:1: ( RULE_INT )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3674:1: ( RULE_INT )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3675:1: RULE_INT
            {
             before(grammarAccess.getBoundsAccess().getWidthINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Bounds__WidthAssignment_77436); 
             after(grammarAccess.getBoundsAccess().getWidthINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Bounds__WidthAssignment_7"


    // $ANTLR start "rule__Bounds__HeightAssignment_9"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3684:1: rule__Bounds__HeightAssignment_9 : ( RULE_INT ) ;
    public final void rule__Bounds__HeightAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3688:1: ( ( RULE_INT ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3689:1: ( RULE_INT )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3689:1: ( RULE_INT )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3690:1: RULE_INT
            {
             before(grammarAccess.getBoundsAccess().getHeightINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Bounds__HeightAssignment_97467); 
             after(grammarAccess.getBoundsAccess().getHeightINTTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Bounds__HeightAssignment_9"


    // $ANTLR start "rule__UIElement__BoundsAssignment_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3699:1: rule__UIElement__BoundsAssignment_1 : ( ruleBounds ) ;
    public final void rule__UIElement__BoundsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3703:1: ( ( ruleBounds ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3704:1: ( ruleBounds )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3704:1: ( ruleBounds )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3705:1: ruleBounds
            {
             before(grammarAccess.getUIElementAccess().getBoundsBoundsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBounds_in_rule__UIElement__BoundsAssignment_17498);
            ruleBounds();

            state._fsp--;

             after(grammarAccess.getUIElementAccess().getBoundsBoundsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UIElement__BoundsAssignment_1"


    // $ANTLR start "rule__Label__NameAssignment_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3714:1: rule__Label__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3718:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3719:1: ( RULE_ID )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3719:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3720:1: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__NameAssignment_17529); 
             after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Label__NameAssignment_1"


    // $ANTLR start "rule__Label__TextAssignment_2_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3729:1: rule__Label__TextAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Label__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3733:1: ( ( RULE_STRING ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3734:1: ( RULE_STRING )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3734:1: ( RULE_STRING )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3735:1: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Label__TextAssignment_2_17560); 
             after(grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Label__TextAssignment_2_1"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3744:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3748:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3749:1: ( RULE_ID )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3749:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3750:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_17591); 
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


    // $ANTLR start "rule__Field__PropertyAssignment_3"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3759:1: rule__Field__PropertyAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Field__PropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3763:1: ( ( ( RULE_ID ) ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3764:1: ( ( RULE_ID ) )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3764:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3765:1: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getPropertyPropertyCrossReference_3_0()); 
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3766:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3767:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getPropertyPropertyIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__PropertyAssignment_37626); 
             after(grammarAccess.getFieldAccess().getPropertyPropertyIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getPropertyPropertyCrossReference_3_0()); 

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
    // $ANTLR end "rule__Field__PropertyAssignment_3"


    // $ANTLR start "rule__Button__NameAssignment_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3778:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3782:1: ( ( RULE_ID ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3783:1: ( RULE_ID )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3783:1: ( RULE_ID )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3784:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__NameAssignment_17661); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Button__NameAssignment_1"


    // $ANTLR start "rule__Button__KindAssignment_2"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3793:1: rule__Button__KindAssignment_2 : ( ruleButtonKind ) ;
    public final void rule__Button__KindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3797:1: ( ( ruleButtonKind ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3798:1: ( ruleButtonKind )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3798:1: ( ruleButtonKind )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3799:1: ruleButtonKind
            {
             before(grammarAccess.getButtonAccess().getKindButtonKindEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleButtonKind_in_rule__Button__KindAssignment_27692);
            ruleButtonKind();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getKindButtonKindEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Button__KindAssignment_2"


    // $ANTLR start "rule__Button__TextAssignment_3_1"
    // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3808:1: rule__Button__TextAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Button__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3812:1: ( ( RULE_STRING ) )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3813:1: ( RULE_STRING )
            {
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3813:1: ( RULE_STRING )
            // ../mdsd01.exercise04.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl01.g:3814:1: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Button__TextAssignment_3_17723); 
             after(grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Button__TextAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindow_in_entryRuleWindow363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWindow370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Window__Alternatives_in_ruleWindow396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListWindow_in_entryRuleListWindow423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListWindow430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__0_in_ruleListWindow456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryWindow_in_entryRuleEntryWindow483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryWindow490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__0_in_ruleEntryWindow516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__0_in_ruleSize576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBounds_in_entryRuleBounds603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBounds610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__0_in_ruleBounds636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIElement_in_entryRuleUIElement663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIElement670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIElement__Group__0_in_ruleUIElement696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0_in_ruleLabel756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityKind__Alternatives_in_ruleMultiplicityKind949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ButtonKind__Alternatives_in_ruleButtonKind985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Property__Alternatives1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Property__Alternatives1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryWindow_in_rule__Window__Alternatives1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListWindow_in_rule__Window__Alternatives1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__UIElement__Alternatives_01118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__UIElement__Alternatives_01135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_rule__UIElement__Alternatives_01152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AttributeType__Alternatives1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AttributeType__Alternatives1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AttributeType__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MultiplicityKind__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MultiplicityKind__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ButtonKind__Alternatives1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ButtonKind__Alternatives1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ButtonKind__Alternatives1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01395 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EntitiesAssignment_0_in_rule__Model__Group__0__Impl1425 = new BitSet(new long[]{0x0000008000080002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WindowsAssignment_1_in_rule__Model__Group__1__Impl1483 = new BitSet(new long[]{0x0000000048000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01520 = new BitSet(new long[]{0x0000008000080000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AbstractAssignment_0_in_rule__Entity__Group__0__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__1__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21643 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31703 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41764 = new BitSet(new long[]{0x0000000002A00000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__4__Impl1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51826 = new BitSet(new long[]{0x0000000002A00000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_5_in_rule__Entity__Group__5__Impl1856 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__6__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__01960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__01963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group_3__0__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attribute__Group__0__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12145 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22205 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Attribute__Group__2__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32267 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__OptionalAssignment_4_in_rule__Attribute__Group__4__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__02395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__02398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Reference__Group__0__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__12457 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__12460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__22517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__22520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Reference__Group__2__Impl2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__32579 = new BitSet(new long[]{0x000000000400C000L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__32582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__42639 = new BitSet(new long[]{0x000000000400C000L});
    public static final BitSet FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__42642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__MultiplicityAssignment_4_in_rule__Reference__Group__4__Impl2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__52700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__0_in_rule__Reference__Group__5__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__0__Impl_in_rule__Reference__Group_5__02769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__1_in_rule__Reference__Group_5__02772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Reference__Group_5__0__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__1__Impl_in_rule__Reference__Group_5__12831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_5_1_in_rule__Reference__Group_5__1__Impl2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__0__Impl_in_rule__ListWindow__Group__02892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__1_in_rule__ListWindow__Group__02895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ListWindow__Group__0__Impl2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__1__Impl_in_rule__ListWindow__Group__12954 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__2_in_rule__ListWindow__Group__12957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__NameAssignment_1_in_rule__ListWindow__Group__1__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__2__Impl_in_rule__ListWindow__Group__23014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__3_in_rule__ListWindow__Group__23017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ListWindow__Group__2__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__3__Impl_in_rule__ListWindow__Group__33076 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__4_in_rule__ListWindow__Group__33079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__EntityAssignment_3_in_rule__ListWindow__Group__3__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__4__Impl_in_rule__ListWindow__Group__43136 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__5_in_rule__ListWindow__Group__43139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__Group_4__0_in_rule__ListWindow__Group__4__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__Group__5__Impl_in_rule__ListWindow__Group__53197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__SizeAssignment_5_in_rule__ListWindow__Group__5__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__Group_4__0__Impl_in_rule__ListWindow__Group_4__03266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListWindow__Group_4__1_in_rule__ListWindow__Group_4__03269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ListWindow__Group_4__0__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__Group_4__1__Impl_in_rule__ListWindow__Group_4__13328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListWindow__TitleAssignment_4_1_in_rule__ListWindow__Group_4__1__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__0__Impl_in_rule__EntryWindow__Group__03389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__1_in_rule__EntryWindow__Group__03392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EntryWindow__Group__0__Impl3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__1__Impl_in_rule__EntryWindow__Group__13451 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__2_in_rule__EntryWindow__Group__13454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__NameAssignment_1_in_rule__EntryWindow__Group__1__Impl3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__2__Impl_in_rule__EntryWindow__Group__23511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__3_in_rule__EntryWindow__Group__23514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EntryWindow__Group__2__Impl3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__3__Impl_in_rule__EntryWindow__Group__33573 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__4_in_rule__EntryWindow__Group__33576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__EntityAssignment_3_in_rule__EntryWindow__Group__3__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__4__Impl_in_rule__EntryWindow__Group__43633 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__5_in_rule__EntryWindow__Group__43636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__UnorderedGroup_4_in_rule__EntryWindow__Group__4__Impl3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__5__Impl_in_rule__EntryWindow__Group__53693 = new BitSet(new long[]{0x0000007000200000L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__6_in_rule__EntryWindow__Group__53696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EntryWindow__Group__5__Impl3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__6__Impl_in_rule__EntryWindow__Group__63755 = new BitSet(new long[]{0x0000007000200000L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__7_in_rule__EntryWindow__Group__63758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__ElementsAssignment_6_in_rule__EntryWindow__Group__6__Impl3785 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group__7__Impl_in_rule__EntryWindow__Group__73816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EntryWindow__Group__7__Impl3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group_4_0__0__Impl_in_rule__EntryWindow__Group_4_0__03891 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group_4_0__1_in_rule__EntryWindow__Group_4_0__03894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EntryWindow__Group_4_0__0__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group_4_0__1__Impl_in_rule__EntryWindow__Group_4_0__13953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__TitleAssignment_4_0_1_in_rule__EntryWindow__Group_4_0__1__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__04014 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Size__Group__1_in_rule__Size__Group__04017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Size__Group__0__Impl4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__14076 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Size__Group__2_in_rule__Size__Group__14079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Size__Group__1__Impl4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__24138 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Size__Group__3_in_rule__Size__Group__24141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__WidthAssignment_2_in_rule__Size__Group__2__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__3__Impl_in_rule__Size__Group__34198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Size__Group__4_in_rule__Size__Group__34201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Size__Group__3__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__4__Impl_in_rule__Size__Group__44260 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Size__Group__5_in_rule__Size__Group__44263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__HeightAssignment_4_in_rule__Size__Group__4__Impl4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__5__Impl_in_rule__Size__Group__54320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Size__Group__5__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__0__Impl_in_rule__Bounds__Group__04391 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Bounds__Group__1_in_rule__Bounds__Group__04394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__1__Impl_in_rule__Bounds__Group__14452 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Bounds__Group__2_in_rule__Bounds__Group__14455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Bounds__Group__1__Impl4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__2__Impl_in_rule__Bounds__Group__24514 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Bounds__Group__3_in_rule__Bounds__Group__24517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Bounds__Group__2__Impl4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__3__Impl_in_rule__Bounds__Group__34576 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Bounds__Group__4_in_rule__Bounds__Group__34579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__XAssignment_3_in_rule__Bounds__Group__3__Impl4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__4__Impl_in_rule__Bounds__Group__44636 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Bounds__Group__5_in_rule__Bounds__Group__44639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Bounds__Group__4__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__5__Impl_in_rule__Bounds__Group__54698 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Bounds__Group__6_in_rule__Bounds__Group__54701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__YAssignment_5_in_rule__Bounds__Group__5__Impl4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__6__Impl_in_rule__Bounds__Group__64758 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Bounds__Group__7_in_rule__Bounds__Group__64761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Bounds__Group__6__Impl4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__7__Impl_in_rule__Bounds__Group__74820 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Bounds__Group__8_in_rule__Bounds__Group__74823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__WidthAssignment_7_in_rule__Bounds__Group__7__Impl4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__8__Impl_in_rule__Bounds__Group__84880 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Bounds__Group__9_in_rule__Bounds__Group__84883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Bounds__Group__8__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__9__Impl_in_rule__Bounds__Group__94942 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Bounds__Group__10_in_rule__Bounds__Group__94945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__HeightAssignment_9_in_rule__Bounds__Group__9__Impl4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bounds__Group__10__Impl_in_rule__Bounds__Group__105002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Bounds__Group__10__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIElement__Group__0__Impl_in_rule__UIElement__Group__05083 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__UIElement__Group__1_in_rule__UIElement__Group__05086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIElement__Alternatives_0_in_rule__UIElement__Group__0__Impl5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIElement__Group__1__Impl_in_rule__UIElement__Group__15143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIElement__BoundsAssignment_1_in_rule__UIElement__Group__1__Impl5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__05204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label__Group__1_in_rule__Label__Group__05207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Label__Group__0__Impl5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__15266 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Label__Group__2_in_rule__Label__Group__15269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__NameAssignment_1_in_rule__Label__Group__1__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__2__Impl_in_rule__Label__Group__25326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_2__0_in_rule__Label__Group__2__Impl5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_2__0__Impl_in_rule__Label__Group_2__05390 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__Label__Group_2__1_in_rule__Label__Group_2__05393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Label__Group_2__0__Impl5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_2__1__Impl_in_rule__Label__Group_2__15452 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__Label__Group_2__2_in_rule__Label__Group_2__15455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__TextAssignment_2_1_in_rule__Label__Group_2__1__Impl5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_2__2__Impl_in_rule__Label__Group_2__25513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Label__Group_2__2__Impl5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__05578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__05581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Field__Group__0__Impl5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__15640 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__15643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__25700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__25703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Field__Group__2__Impl5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__35762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__PropertyAssignment_3_in_rule__Field__Group__3__Impl5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__05827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__05830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Button__Group__0__Impl5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__15889 = new BitSet(new long[]{0x0000000100070000L});
    public static final BitSet FOLLOW_rule__Button__Group__2_in_rule__Button__Group__15892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__NameAssignment_1_in_rule__Button__Group__1__Impl5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__25949 = new BitSet(new long[]{0x0000000100070000L});
    public static final BitSet FOLLOW_rule__Button__Group__3_in_rule__Button__Group__25952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__KindAssignment_2_in_rule__Button__Group__2__Impl5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__36010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_3__0_in_rule__Button__Group__3__Impl6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_3__0__Impl_in_rule__Button__Group_3__06076 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__Button__Group_3__1_in_rule__Button__Group_3__06079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Button__Group_3__0__Impl6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_3__1__Impl_in_rule__Button__Group_3__16138 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__Button__Group_3__2_in_rule__Button__Group_3__16141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__TextAssignment_3_1_in_rule__Button__Group_3__1__Impl6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_3__2__Impl_in_rule__Button__Group_3__26199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Button__Group_3__2__Impl6227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__UnorderedGroup_4__0_in_rule__EntryWindow__UnorderedGroup_46265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__Group_4_0__0_in_rule__EntryWindow__UnorderedGroup_4__Impl6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__SizeAssignment_4_1_in_rule__EntryWindow__UnorderedGroup_4__Impl6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__UnorderedGroup_4__Impl_in_rule__EntryWindow__UnorderedGroup_4__06504 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__UnorderedGroup_4__1_in_rule__EntryWindow__UnorderedGroup_4__06507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryWindow__UnorderedGroup_4__Impl_in_rule__EntryWindow__UnorderedGroup_4__16532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Model__EntitiesAssignment_06564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindow_in_rule__Model__WindowsAssignment_16595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Entity__AbstractAssignment_06631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_26670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_3_16705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_56740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_16771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_36802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Attribute__OptionalAssignment_46838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_16877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__TypeAssignment_36912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityKind_in_rule__Reference__MultiplicityAssignment_46947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_5_16982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListWindow__NameAssignment_17017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListWindow__EntityAssignment_37052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListWindow__TitleAssignment_4_17087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rule__ListWindow__SizeAssignment_57118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntryWindow__NameAssignment_17149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntryWindow__EntityAssignment_37184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EntryWindow__TitleAssignment_4_0_17219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rule__EntryWindow__SizeAssignment_4_17250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIElement_in_rule__EntryWindow__ElementsAssignment_67281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Size__WidthAssignment_27312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Size__HeightAssignment_47343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Bounds__XAssignment_37374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Bounds__YAssignment_57405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Bounds__WidthAssignment_77436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Bounds__HeightAssignment_97467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBounds_in_rule__UIElement__BoundsAssignment_17498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__NameAssignment_17529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Label__TextAssignment_2_17560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_17591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__PropertyAssignment_37626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__NameAssignment_17661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButtonKind_in_rule__Button__KindAssignment_27692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Button__TextAssignment_3_17723 = new BitSet(new long[]{0x0000000000000002L});

}
