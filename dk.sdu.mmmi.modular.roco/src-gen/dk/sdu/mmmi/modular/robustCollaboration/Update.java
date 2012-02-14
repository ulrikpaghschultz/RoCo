/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.robustCollaboration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Update#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Update#getSourceQualifier <em>Source Qualifier</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Update#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Update#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getUpdate()
 * @model
 * @generated
 */
public interface Update extends Member
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
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getUpdate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.robustCollaboration.Update#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Qualifier</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Qualifier</em>' reference.
   * @see #setSourceQualifier(ScopeDefiningElement)
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getUpdate_SourceQualifier()
   * @model
   * @generated
   */
  ScopeDefiningElement getSourceQualifier();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.robustCollaboration.Update#getSourceQualifier <em>Source Qualifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Qualifier</em>' reference.
   * @see #getSourceQualifier()
   * @generated
   */
  void setSourceQualifier(ScopeDefiningElement value);

  /**
   * Returns the value of the '<em><b>Source Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Name</em>' attribute.
   * @see #setSourceName(String)
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getUpdate_SourceName()
   * @model
   * @generated
   */
  String getSourceName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.robustCollaboration.Update#getSourceName <em>Source Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Name</em>' attribute.
   * @see #getSourceName()
   * @generated
   */
  void setSourceName(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.modular.robustCollaboration.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getUpdate_Body()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getBody();

} // Update