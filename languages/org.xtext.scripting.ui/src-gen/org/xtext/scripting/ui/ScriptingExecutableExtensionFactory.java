/*
 * generated by Xtext unspecified
 */
package org.xtext.scripting.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.scripting.ui.internal.ScriptingActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ScriptingExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ScriptingActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ScriptingActivator activator = ScriptingActivator.getInstance();
		return activator != null ? activator.getInjector(ScriptingActivator.ORG_XTEXT_SCRIPTING_SCRIPTING) : null;
	}

}
