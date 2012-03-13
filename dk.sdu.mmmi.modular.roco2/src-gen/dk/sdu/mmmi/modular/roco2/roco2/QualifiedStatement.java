/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#isSelf <em>Self</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getQualifiedStatement()
 * @model
 * @generated
 */
public interface QualifiedStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Self</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Self</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Self</em>' attribute.
   * @see #setSelf(boolean)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getQualifiedStatement_Self()
   * @model
   * @generated
   */
  boolean isSelf();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#isSelf <em>Self</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Self</em>' attribute.
   * @see #isSelf()
   * @generated
   */
  void setSelf(boolean value);

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
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getQualifiedStatement_Qualifier()
   * @model
   * @generated
   */
  ScopeDefiningElement getQualifier();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#getQualifier <em>Qualifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' reference.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(ScopeDefiningElement value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(EObject)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getQualifiedStatement_Statement()
   * @model containment="true"
   * @generated
   */
  EObject getStatement();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(EObject value);

} // QualifiedStatement
