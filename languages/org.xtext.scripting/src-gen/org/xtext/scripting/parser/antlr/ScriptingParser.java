/*
 * generated by Xtext unspecified
 */
package org.xtext.scripting.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.scripting.parser.antlr.internal.InternalScriptingParser;
import org.xtext.scripting.services.ScriptingGrammarAccess;

public class ScriptingParser extends AbstractAntlrParser {

	@Inject
	private ScriptingGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalScriptingParser createParser(XtextTokenStream stream) {
		return new InternalScriptingParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Script";
	}

	public ScriptingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ScriptingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
