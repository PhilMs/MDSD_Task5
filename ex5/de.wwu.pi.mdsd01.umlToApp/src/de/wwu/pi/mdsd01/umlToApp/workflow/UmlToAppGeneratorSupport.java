package de.wwu.pi.mdsd01.umlToApp.workflow;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class UmlToAppGeneratorSupport extends AbstractGenericResourceSupport {

	@Override
	protected Module createGuiceModule() {
		return new UmlToAppGeneratorModule();
	}

}
