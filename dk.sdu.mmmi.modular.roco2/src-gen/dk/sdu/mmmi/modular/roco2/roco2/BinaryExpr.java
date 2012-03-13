/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getLhs <em>Lhs</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getOp <em>Op</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getBinaryExpr()
 * @model
 * @generated
 */
public interface BinaryExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Expr)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getBinaryExpr_Lhs()
   * @model containment="true"
   * @generated
   */
  Expr getLhs();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Expr value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getBinaryExpr_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

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
   * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package#getBinaryExpr_Rhs()
   * @model containment="true"
   * @generated
   */
  Expr getRhs();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Expr value);

} // BinaryExpr
