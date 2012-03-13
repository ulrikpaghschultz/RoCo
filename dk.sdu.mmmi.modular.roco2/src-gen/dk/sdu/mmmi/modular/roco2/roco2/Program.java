/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Program#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Program#getExternals <em>Externals</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Program#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Externals</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.modular.roco2.roco2.ExternalName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Externals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Externals</em>' containment reference list.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getProgram_Externals()
   * @model containment="true"
   * @generated
   */
  EList<ExternalName> getExternals();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.modular.roco2.roco2.LocalType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getProgram_Elements()
   * @model containment="true"
   * @generated
   */
  EList<LocalType> getElements();

} // Program
