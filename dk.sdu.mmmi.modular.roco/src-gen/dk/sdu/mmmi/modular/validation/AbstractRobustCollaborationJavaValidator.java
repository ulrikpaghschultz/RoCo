package dk.sdu.mmmi.modular.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractRobustCollaborationJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage.eINSTANCE);
		return result;
	}

}
