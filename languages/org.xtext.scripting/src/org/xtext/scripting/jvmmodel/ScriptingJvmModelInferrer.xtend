/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.scripting.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.mbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.mbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.mbase.jvmmodel.JvmTypesBuilder
import org.xtext.scripting.scripting.Script

/**
 * Infers a Java class with a main method from a {@link Script}.
 */
class ScriptingJvmModelInferrer extends AbstractModelInferrer {
	
   	@Inject extension JvmTypesBuilder

   	def dispatch void infer(Script script, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val className = script.eResource.URI.trimFileExtension.lastSegment
   		acceptor.accept(script.toClass(className)) [
   			// the class gets one main method
   			members += script.toMethod('main', typeRef(Void.TYPE)) [
   				parameters += script.toParameter("args", typeRef(String).addArrayTypeDimension)
   				static = true
   				varArgs = true
   				// Associate the script as the body of the main method
   				body = script
   			]	
   		]
  	}
}

