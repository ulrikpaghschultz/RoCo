/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.robustCollaboration.impl;

import dk.sdu.mmmi.modular.robustCollaboration.Conditional;
import dk.sdu.mmmi.modular.robustCollaboration.Expr;
import dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage;
import dk.sdu.mmmi.modular.robustCollaboration.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ConditionalImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ConditionalImpl#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ConditionalImpl#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends StatementImpl implements Conditional
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expr condition;

  /**
   * The cached value of the '{@link #getThenBranch() <em>Then Branch</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenBranch()
   * @generated
   * @ordered
   */
  protected EList<Statement> thenBranch;

  /**
   * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBranch()
   * @generated
   * @ordered
   */
  protected EList<Statement> elseBranch;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RobustCollaborationPackage.Literals.CONDITIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expr newCondition, NotificationChain msgs)
  {
    Expr oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.CONDITIONAL__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expr newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobustCollaborationPackage.CONDITIONAL__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobustCollaborationPackage.CONDITIONAL__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.CONDITIONAL__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getThenBranch()
  {
    if (thenBranch == null)
    {
      thenBranch = new EObjectContainmentEList<Statement>(Statement.class, this, RobustCollaborationPackage.CONDITIONAL__THEN_BRANCH);
    }
    return thenBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getElseBranch()
  {
    if (elseBranch == null)
    {
      elseBranch = new EObjectContainmentEList<Statement>(Statement.class, this, RobustCollaborationPackage.CONDITIONAL__ELSE_BRANCH);
    }
    return elseBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RobustCollaborationPackage.CONDITIONAL__CONDITION:
        return basicSetCondition(null, msgs);
      case RobustCollaborationPackage.CONDITIONAL__THEN_BRANCH:
        return ((InternalEList<?>)getThenBranch()).basicRemove(otherEnd, msgs);
      case RobustCollaborationPackage.CONDITIONAL__ELSE_BRANCH:
        return ((InternalEList<?>)getElseBranch()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RobustCollaborationPackage.CONDITIONAL__CONDITION:
        return getCondition();
      case RobustCollaborationPackage.CONDITIONAL__THEN_BRANCH:
        return getThenBranch();
      case RobustCollaborationPackage.CONDITIONAL__ELSE_BRANCH:
        return getElseBranch();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RobustCollaborationPackage.CONDITIONAL__CONDITION:
        setCondition((Expr)newValue);
        return;
      case RobustCollaborationPackage.CONDITIONAL__THEN_BRANCH:
        getThenBranch().clear();
        getThenBranch().addAll((Collection<? extends Statement>)newValue);
        return;
      case RobustCollaborationPackage.CONDITIONAL__ELSE_BRANCH:
        getElseBranch().clear();
        getElseBranch().addAll((Collection<? extends Statement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RobustCollaborationPackage.CONDITIONAL__CONDITION:
        setCondition((Expr)null);
        return;
      case RobustCollaborationPackage.CONDITIONAL__THEN_BRANCH:
        getThenBranch().clear();
        return;
      case RobustCollaborationPackage.CONDITIONAL__ELSE_BRANCH:
        getElseBranch().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RobustCollaborationPackage.CONDITIONAL__CONDITION:
        return condition != null;
      case RobustCollaborationPackage.CONDITIONAL__THEN_BRANCH:
        return thenBranch != null && !thenBranch.isEmpty();
      case RobustCollaborationPackage.CONDITIONAL__ELSE_BRANCH:
        return elseBranch != null && !elseBranch.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionalImpl
