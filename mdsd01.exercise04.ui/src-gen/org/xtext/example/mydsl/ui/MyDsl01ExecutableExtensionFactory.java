/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.mydsl.ui.internal.MyDsl01Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDsl01ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MyDsl01Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MyDsl01Activator.getInstance().getInjector(MyDsl01Activator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL01);
	}
	
}
