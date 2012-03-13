
package dk.sdu.mmmi.modular.roco2;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Roco2StandaloneSetup extends Roco2StandaloneSetupGenerated{

	public static void doSetup() {
		new Roco2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

