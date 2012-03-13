/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment#getLhs <em>Lhs</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getConstantAssignment()
 * @model
 * @generated
 */
public interface ConstantAssignment extends Member
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' attribute.
   * @see #setLhs(String)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getConstantAssignment_Lhs()
   * @model
   * @generated
   */
  String getLhs();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment#getLhs <em>Lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' attribute.
   * @see #getLhs()
   * @generated
   */
  void setLhs(String value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Expr)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getConstantAssignment_Rhs()
   * @model containment="true"
   * @generated
   */
  Expr getRhs();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Expr value);

} // ConstantAssignment
