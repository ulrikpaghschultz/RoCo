/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2.impl;

import dk.sdu.mmmi.modular.roco2.roco2.Ensemble;
import dk.sdu.mmmi.modular.roco2.roco2.Member;
import dk.sdu.mmmi.modular.roco2.roco2.Roco2Package;
import dk.sdu.mmmi.modular.roco2.roco2.Role;

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
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.impl.RoleImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.impl.RoleImpl#isMixin <em>Mixin</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.impl.RoleImpl#getExtendsRole <em>Extends Role</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.impl.RoleImpl#getWithinEnsemble <em>Within Ensemble</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.impl.RoleImpl#getElements <em>Elements</em>}</li>
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
   * The default value of the '{@link #isMixin() <em>Mixin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMixin()
   * @generated
   * @ordered
   */
  protected static final boolean MIXIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMixin() <em>Mixin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMixin()
   * @generated
   * @ordered
   */
  protected boolean mixin = MIXIN_EDEFAULT;

  /**
   * The cached value of the '{@link #getExtendsRole() <em>Extends Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendsRole()
   * @generated
   * @ordered
   */
  protected Role extendsRole;

  /**
   * The cached value of the '{@link #getWithinEnsemble() <em>Within Ensemble</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWithinEnsemble()
   * @generated
   * @ordered
   */
  protected Ensemble withinEnsemble;

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
    return Roco2Package.Literals.ROLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Roco2Package.ROLE__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMixin()
  {
    return mixin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMixin(boolean newMixin)
  {
    boolean oldMixin = mixin;
    mixin = newMixin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Roco2Package.ROLE__MIXIN, oldMixin, mixin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getExtendsRole()
  {
    if (extendsRole != null && extendsRole.eIsProxy())
    {
      InternalEObject oldExtendsRole = (InternalEObject)extendsRole;
      extendsRole = (Role)eResolveProxy(oldExtendsRole);
      if (extendsRole != oldExtendsRole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Roco2Package.ROLE__EXTENDS_ROLE, oldExtendsRole, extendsRole));
      }
    }
    return extendsRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetExtendsRole()
  {
    return extendsRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtendsRole(Role newExtendsRole)
  {
    Role oldExtendsRole = extendsRole;
    extendsRole = newExtendsRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Roco2Package.ROLE__EXTENDS_ROLE, oldExtendsRole, extendsRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ensemble getWithinEnsemble()
  {
    if (withinEnsemble != null && withinEnsemble.eIsProxy())
    {
      InternalEObject oldWithinEnsemble = (InternalEObject)withinEnsemble;
      withinEnsemble = (Ensemble)eResolveProxy(oldWithinEnsemble);
      if (withinEnsemble != oldWithinEnsemble)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Roco2Package.ROLE__WITHIN_ENSEMBLE, oldWithinEnsemble, withinEnsemble));
      }
    }
    return withinEnsemble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ensemble basicGetWithinEnsemble()
  {
    return withinEnsemble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWithinEnsemble(Ensemble newWithinEnsemble)
  {
    Ensemble oldWithinEnsemble = withinEnsemble;
    withinEnsemble = newWithinEnsemble;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Roco2Package.ROLE__WITHIN_ENSEMBLE, oldWithinEnsemble, withinEnsemble));
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
      elements = new EObjectContainmentEList<Member>(Member.class, this, Roco2Package.ROLE__ELEMENTS);
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
      case Roco2Package.ROLE__ELEMENTS:
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
      case Roco2Package.ROLE__ABSTRACT:
        return isAbstract();
      case Roco2Package.ROLE__MIXIN:
        return isMixin();
      case Roco2Package.ROLE__EXTENDS_ROLE:
        if (resolve) return getExtendsRole();
        return basicGetExtendsRole();
      case Roco2Package.ROLE__WITHIN_ENSEMBLE:
        if (resolve) return getWithinEnsemble();
        return basicGetWithinEnsemble();
      case Roco2Package.ROLE__ELEMENTS:
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
      case Roco2Package.ROLE__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case Roco2Package.ROLE__MIXIN:
        setMixin((Boolean)newValue);
        return;
      case Roco2Package.ROLE__EXTENDS_ROLE:
        setExtendsRole((Role)newValue);
        return;
      case Roco2Package.ROLE__WITHIN_ENSEMBLE:
        setWithinEnsemble((Ensemble)newValue);
        return;
      case Roco2Package.ROLE__ELEMENTS:
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
      case Roco2Package.ROLE__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case Roco2Package.ROLE__MIXIN:
        setMixin(MIXIN_EDEFAULT);
        return;
      case Roco2Package.ROLE__EXTENDS_ROLE:
        setExtendsRole((Role)null);
        return;
      case Roco2Package.ROLE__WITHIN_ENSEMBLE:
        setWithinEnsemble((Ensemble)null);
        return;
      case Roco2Package.ROLE__ELEMENTS:
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
      case Roco2Package.ROLE__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case Roco2Package.ROLE__MIXIN:
        return mixin != MIXIN_EDEFAULT;
      case Roco2Package.ROLE__EXTENDS_ROLE:
        return extendsRole != null;
      case Roco2Package.ROLE__WITHIN_ENSEMBLE:
        return withinEnsemble != null;
      case Roco2Package.ROLE__ELEMENTS:
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
    result.append(", mixin: ");
    result.append(mixin);
    result.append(')');
    return result.toString();
  }

} //RoleImpl
