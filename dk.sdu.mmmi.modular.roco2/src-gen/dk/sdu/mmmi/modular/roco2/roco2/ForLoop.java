/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getVariable <em>Variable</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getShared <em>Shared</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends BasicStatement
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getForLoop_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

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
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getForLoop_Qualifier()
   * @model
   * @generated
   */
  ScopeDefiningElement getQualifier();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getQualifier <em>Qualifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' reference.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(ScopeDefiningElement value);

  /**
   * Returns the value of the '<em><b>Shared</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shared</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shared</em>' attribute.
   * @see #setShared(String)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getForLoop_Shared()
   * @model
   * @generated
   */
  String getShared();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getShared <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shared</em>' attribute.
   * @see #getShared()
   * @generated
   */
  void setShared(String value);

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
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getForLoop_Body()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getBody();

} // ForLoop
