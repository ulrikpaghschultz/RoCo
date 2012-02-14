/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.robustCollaboration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Value#getValue <em>Value</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.Value#getExtern <em>Extern</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends Expr
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getValue_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.robustCollaboration.Value#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Extern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extern</em>' reference.
   * @see #setExtern(ExternalName)
   * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage#getValue_Extern()
   * @model
   * @generated
   */
  ExternalName getExtern();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.robustCollaboration.Value#getExtern <em>Extern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extern</em>' reference.
   * @see #getExtern()
   * @generated
   */
  void setExtern(ExternalName value);

} // Value
