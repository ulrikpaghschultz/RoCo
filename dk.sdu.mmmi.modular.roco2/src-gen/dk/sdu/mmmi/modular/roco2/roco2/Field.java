/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Field#getType <em>Type</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Field#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.Field#getInitial <em>Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getField()
 * @model
 * @generated
 */
public interface Field extends Member
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(LocalType)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getField_Type()
   * @model
   * @generated
   */
  LocalType getType();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.Field#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(LocalType value);

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
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.Field#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Initial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial</em>' containment reference.
   * @see #setInitial(Expr)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getField_Initial()
   * @model containment="true"
   * @generated
   */
  Expr getInitial();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.Field#getInitial <em>Initial</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial</em>' containment reference.
   * @see #getInitial()
   * @generated
   */
  void setInitial(Expr value);

} // Field
