/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.robustCollaboration.impl;

import dk.sdu.mmmi.modular.robustCollaboration.Member;
import dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage;
import dk.sdu.mmmi.modular.robustCollaboration.Role;

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
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.RoleImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.RoleImpl#isExtendsRole <em>Extends Role</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.RoleImpl#isWithinEnsemble <em>Within Ensemble</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.RoleImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends ScopeDefiningElementImpl implements Role
{
  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #isExtendsRole() <em>Extends Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtendsRole()
   * @generated
   * @ordered
   */
  protected static final boolean EXTENDS_ROLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExtendsRole() <em>Extends Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtendsRole()
   * @generated
   * @ordered
   */
  protected boolean extendsRole = EXTENDS_ROLE_EDEFAULT;

  /**
   * The default value of the '{@link #isWithinEnsemble() <em>Within Ensemble</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWithinEnsemble()
   * @generated
   * @ordered
   */
  protected static final boolean WITHIN_ENSEMBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWithinEnsemble() <em>Within Ensemble</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWithinEnsemble()
   * @generated
   * @ordered
   */
  protected boolean withinEnsemble = WITHIN_ENSEMBLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Member> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleImpl()
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
    return RobustCollaborationPackage.Literals.ROLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.ROLE__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExtendsRole()
  {
    return extendsRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtendsRole(boolean newExtendsRole)
  {
    boolean oldExtendsRole = extendsRole;
    extendsRole = newExtendsRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.ROLE__EXTENDS_ROLE, oldExtendsRole, extendsRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWithinEnsemble()
  {
    return withinEnsemble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWithinEnsemble(boolean newWithinEnsemble)
  {
    boolean oldWithinEnsemble = withinEnsemble;
    withinEnsemble = newWithinEnsemble;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.ROLE__WITHIN_ENSEMBLE, oldWithinEnsemble, withinEnsemble));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Member>(Member.class, this, RobustCollaborationPackage.ROLE__ELEMENTS);
    }
    return elements;
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
      case RobustCollaborationPackage.ROLE__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case RobustCollaborationPackage.ROLE__ABSTRACT:
        return isAbstract();
      case RobustCollaborationPackage.ROLE__EXTENDS_ROLE:
        return isExtendsRole();
      case RobustCollaborationPackage.ROLE__WITHIN_ENSEMBLE:
        return isWithinEnsemble();
      case RobustCollaborationPackage.ROLE__ELEMENTS:
        return getElements();
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
      case RobustCollaborationPackage.ROLE__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case RobustCollaborationPackage.ROLE__EXTENDS_ROLE:
        setExtendsRole((Boolean)newValue);
        return;
      case RobustCollaborationPackage.ROLE__WITHIN_ENSEMBLE:
        setWithinEnsemble((Boolean)newValue);
        return;
      case RobustCollaborationPackage.ROLE__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Member>)newValue);
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
      case RobustCollaborationPackage.ROLE__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case RobustCollaborationPackage.ROLE__EXTENDS_ROLE:
        setExtendsRole(EXTENDS_ROLE_EDEFAULT);
        return;
      case RobustCollaborationPackage.ROLE__WITHIN_ENSEMBLE:
        setWithinEnsemble(WITHIN_ENSEMBLE_EDEFAULT);
        return;
      case RobustCollaborationPackage.ROLE__ELEMENTS:
        getElements().clear();
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
      case RobustCollaborationPackage.ROLE__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case RobustCollaborationPackage.ROLE__EXTENDS_ROLE:
        return extendsRole != EXTENDS_ROLE_EDEFAULT;
      case RobustCollaborationPackage.ROLE__WITHIN_ENSEMBLE:
        return withinEnsemble != WITHIN_ENSEMBLE_EDEFAULT;
      case RobustCollaborationPackage.ROLE__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(", extendsRole: ");
    result.append(extendsRole);
    result.append(", withinEnsemble: ");
    result.append(withinEnsemble);
    result.append(')');
    return result.toString();
  }

} //RoleImpl
