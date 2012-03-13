/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ensemble</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Ensemble#getExtendsEnsemble <em>Extends Ensemble</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Ensemble#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getEnsemble()
 * @model
 * @generated
 */
public interface Ensemble extends ScopeDefiningElement
{
  /**
   * Returns the value of the '<em><b>Extends Ensemble</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends Ensemble</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends Ensemble</em>' reference.
   * @see #setExtendsEnsemble(Ensemble)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getEnsemble_ExtendsEnsemble()
   * @model
   * @generated
   */
  Ensemble getExtendsEnsemble();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.Ensemble#getExtendsEnsemble <em>Extends Ensemble</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends Ensemble</em>' reference.
   * @see #getExtendsEnsemble()
   * @generated
   */
  void setExtendsEnsemble(Ensemble value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.modular.roco2.roco2.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getEnsemble_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Member> getElements();

} // Ensemble
