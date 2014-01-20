
package de.wwu.pi.mdsd01.crudDsl;

import de.wwu.pi.mdsd01.crudDsl.CrudDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CrudDslStandaloneSetup extends CrudDslStandaloneSetupGenerated{

	public static void doSetup() {
		new CrudDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

