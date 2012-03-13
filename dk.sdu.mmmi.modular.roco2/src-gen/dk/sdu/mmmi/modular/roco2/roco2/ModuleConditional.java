/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.ModuleConditional#getConditional <em>Conditional</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getModuleConditional()
 * @model
 * @generated
 */
public interface ModuleConditional extends EObject
{
  /**
   * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional</em>' containment reference.
   * @see #setConditional(Conditional)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getModuleConditional_Conditional()
   * @model containment="true"
   * @generated
   */
  Conditional getConditional();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.ModuleConditional#getConditional <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional</em>' containment reference.
   * @see #getConditional()
   * @generated
   */
  void setConditional(Conditional value);

} // ModuleConditional
