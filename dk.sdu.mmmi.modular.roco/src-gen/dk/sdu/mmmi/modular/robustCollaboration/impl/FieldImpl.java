/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.robustCollaboration.impl;

import dk.sdu.mmmi.modular.robustCollaboration.Expr;
import dk.sdu.mmmi.modular.robustCollaboration.Field;
import dk.sdu.mmmi.modular.robustCollaboration.LocalType;
import dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.FieldImpl#isShared <em>Shared</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.FieldImpl#getInitial <em>Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends MemberImpl implements Field
{
  /**
   * The default value of the '{@link #isShared() <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShared()
   * @generated
   * @ordered
   */
  protected static final boolean SHARED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShared() <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShared()
   * @generated
   * @ordered
   */
  protected boolean shared = SHARED_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected LocalType type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitial()
   * @generated
   * @ordered
   */
  protected Expr initial;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldImpl()
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
    return RobustCollaborationPackage.Literals.FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isShared()
  {
    return shared;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShared(boolean newShared)
  {
    boolean oldShared = shared;
    shared = newShared;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.FIELD__SHARED, oldShared, shared));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (LocalType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobustCollaborationPackage.FIELD__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(LocalType newType)
  {
    LocalType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.FIELD__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getInitial()
  {
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitial(Expr newInitial, NotificationChain msgs)
  {
    Expr oldInitial = initial;
    initial = newInitial;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.FIELD__INITIAL, oldInitial, newInitial);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitial(Expr newInitial)
  {
    if (newInitial != initial)
    {
      NotificationChain msgs = null;
      if (initial != null)
        msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobustCollaborationPackage.FIELD__INITIAL, null, msgs);
      if (newInitial != null)
        msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobustCollaborationPackage.FIELD__INITIAL, null, msgs);
      msgs = basicSetInitial(newInitial, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.FIELD__INITIAL, newInitial, newInitial));
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
      case RobustCollaborationPackage.FIELD__INITIAL:
        return basicSetInitial(null, msgs);
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
      case RobustCollaborationPackage.FIELD__SHARED:
        return isShared();
      case RobustCollaborationPackage.FIELD__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case RobustCollaborationPackage.FIELD__NAME:
        return getName();
      case RobustCollaborationPackage.FIELD__INITIAL:
        return getInitial();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RobustCollaborationPackage.FIELD__SHARED:
        setShared((Boolean)newValue);
        return;
      case RobustCollaborationPackage.FIELD__TYPE:
        setType((LocalType)newValue);
        return;
      case RobustCollaborationPackage.FIELD__NAME:
        setName((String)newValue);
        return;
      case RobustCollaborationPackage.FIELD__INITIAL:
        setInitial((Expr)newValue);
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
      case RobustCollaborationPackage.FIELD__SHARED:
        setShared(SHARED_EDEFAULT);
        return;
      case RobustCollaborationPackage.FIELD__TYPE:
        setType((LocalType)null);
        return;
      case RobustCollaborationPackage.FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RobustCollaborationPackage.FIELD__INITIAL:
        setInitial((Expr)null);
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
      case RobustCollaborationPackage.FIELD__SHARED:
        return shared != SHARED_EDEFAULT;
      case RobustCollaborationPackage.FIELD__TYPE:
        return type != null;
      case RobustCollaborationPackage.FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RobustCollaborationPackage.FIELD__INITIAL:
        return initial != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (shared: ");
    result.append(shared);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FieldImpl
