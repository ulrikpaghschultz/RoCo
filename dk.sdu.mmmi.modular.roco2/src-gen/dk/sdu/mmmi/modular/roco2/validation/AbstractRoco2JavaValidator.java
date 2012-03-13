package dk.sdu.mmmi.modular.roco2.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractRoco2JavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(dk.sdu.mmmi.modular.roco2.roco2.Roco2Package.eINSTANCE);
		return result;
	}

}
