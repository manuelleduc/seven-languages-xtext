/*
 * generated by Xtext 2.11.0-SNAPSHOT
 */
package org.xtext.template.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.template.parser.antlr.internal.InternalTemplateParser;
import org.xtext.template.services.TemplateGrammarAccess;

public class TemplateParser extends AbstractAntlrParser {

	@Inject
	private TemplateGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTemplateParser createParser(XtextTokenStream stream) {
		return new InternalTemplateParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TemplateFile";
	}

	public TemplateGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TemplateGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
