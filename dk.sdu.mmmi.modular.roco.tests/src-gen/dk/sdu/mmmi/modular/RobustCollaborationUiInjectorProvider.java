/*
* generated by Xtext
*/
package dk.sdu.mmmi.modular;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class RobustCollaborationUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return dk.sdu.mmmi.modular.ui.internal.RobustCollaborationActivator.getInstance().getInjector("dk.sdu.mmmi.modular.RobustCollaboration");
	}
	
}