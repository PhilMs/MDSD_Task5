package de.wwu.pi.mdsd01.umlToApp.workflow;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;

import de.wwu.pi.mdsd.umlToApp.UmlToAppGenerator;
import de.wwu.pi.mdsd01.crudDsl.CrudDslRuntimeModule;

public class UmlToAppGeneratorModule extends CrudDslRuntimeModule {
	
	public Class<? extends IGenerator> bindIGenerator() {
		return UmlToAppGenerator.class;
	}
	
	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

}
