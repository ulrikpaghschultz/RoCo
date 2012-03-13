/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Role#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Role#isMixin <em>Mixin</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Role#getExtendsRole <em>Extends Role</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Role#getWithinEnsemble <em>Within Ensemble</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Role#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getRole()
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
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getRole_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.Role#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Mixin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixin</em>' attribute.
   * @see #setMixin(boolean)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getRole_Mixin()
   * @model
   * @generated
   */
  boolean isMixin();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.Role#isMixin <em>Mixin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mixin</em>' attribute.
   * @see #isMixin()
   * @generated
   */
  void setMixin(boolean value);

  /**
   * Returns the value of the '<em><b>Extends Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends Role</em>' reference.
   * @see #setExtendsRole(Role)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getRole_ExtendsRole()
   * @model
   * @generated
   */
  Role getExtendsRole();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.Role#getExtendsRole <em>Extends Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends Role</em>' reference.
   * @see #getExtendsRole()
   * @generated
   */
  void setExtendsRole(Role value);

  /**
   * Returns the value of the '<em><b>Within Ensemble</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Within Ensemble</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Within Ensemble</em>' reference.
   * @see #setWithinEnsemble(Ensemble)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getRole_WithinEnsemble()
   * @model
   * @generated
   */
  Ensemble getWithinEnsemble();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.Role#getWithinEnsemble <em>Within Ensemble</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Within Ensemble</em>' reference.
   * @see #getWithinEnsemble()
   * @generated
   */
  void setWithinEnsemble(Ensemble value);

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
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getRole_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Member> getElements();

} // Role
