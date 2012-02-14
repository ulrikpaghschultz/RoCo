
package dk.sdu.mmmi.modular;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RobustCollaborationStandaloneSetup extends RobustCollaborationStandaloneSetupGenerated{

	public static void doSetup() {
		new RobustCollaborationStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

