/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior#getParams <em>Params</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends Member
{
  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' reference.
   * @see #setQualifier(ScopeDefiningElement)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getBehavior_Qualifier()
   * @model
   * @generated
   */
  ScopeDefiningElement getQualifier();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior#getQualifier <em>Qualifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' reference.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(ScopeDefiningElement value);

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
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getBehavior_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.modular.roco2.roco2.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getBehavior_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.modular.roco2.roco2.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getBehavior_Body()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getBody();

} // Behavior
