/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.robustCollaboration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Role#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Role#isExtendsRole <em>Extends Role</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Role#isWithinEnsemble <em>Within Ensemble</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Role#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends ScopeDefiningElement
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getRole_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.robustCollaboration.Role#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Extends Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends Role</em>' attribute.
   * @see #setExtendsRole(boolean)
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getRole_ExtendsRole()
   * @model
   * @generated
   */
  boolean isExtendsRole();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.robustCollaboration.Role#isExtendsRole <em>Extends Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends Role</em>' attribute.
   * @see #isExtendsRole()
   * @generated
   */
  void setExtendsRole(boolean value);

  /**
   * Returns the value of the '<em><b>Within Ensemble</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Within Ensemble</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Within Ensemble</em>' attribute.
   * @see #setWithinEnsemble(boolean)
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getRole_WithinEnsemble()
   * @model
   * @generated
   */
  boolean isWithinEnsemble();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.robustCollaboration.Role#isWithinEnsemble <em>Within Ensemble</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Within Ensemble</em>' attribute.
   * @see #isWithinEnsemble()
   * @generated
   */
  void setWithinEnsemble(boolean value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.modular.robustCollaboration.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getRole_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Member> getElements();

} // Role
