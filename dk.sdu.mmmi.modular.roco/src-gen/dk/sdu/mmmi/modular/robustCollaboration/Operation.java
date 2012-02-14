/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.robustCollaboration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Operation#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Operation#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Operation#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Statement
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
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getOperation_Qualifier()
   * @model
   * @generated
   */
  ScopeDefiningElement getQualifier();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.robustCollaboration.Operation#getQualifier <em>Qualifier</em>}' reference.
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
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.robustCollaboration.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.modular.robustCollaboration.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getOperation_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getArguments();

} // Operation
