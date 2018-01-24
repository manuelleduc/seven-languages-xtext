/** 
 * new * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.scripting.ui

import org.eclipse.jface.viewers.ILabelProvider
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.mbase.ui.labeling.MbaseLabelProvider

/** 
 * Use this class to register components to be used within the IDE.
 */
@FinalFieldsConstructor
class ScriptingUiModule extends AbstractScriptingUiModule {
	override Class<? extends ILabelProvider> bindILabelProvider() {
		return MbaseLabelProvider
	}
}
