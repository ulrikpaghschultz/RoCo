/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2.impl;

import dk.sdu.mmmi.modular.roco2.roco2.Ensemble;
import dk.sdu.mmmi.modular.roco2.roco2.Member;
import dk.sdu.mmmi.modular.roco2.roco2.Roco2Package;

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
 * An implementation of the model object '<em><b>Ensemble</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.impl.EnsembleImpl#getExtendsEnsemble <em>Extends Ensemble</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.impl.EnsembleImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnsembleImpl extends ScopeDefiningElementImpl implements Ensemble
{
  /**
   * The cached value of the '{@link #getExtendsEnsemble() <em>Extends Ensemble</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendsEnsemble()
   * @generated
   * @ordered
   */
  protected Ensemble extendsEnsemble;

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
  protected EnsembleImpl()
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
    return Roco2Package.Literals.ENSEMBLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ensemble getExtendsEnsemble()
  {
    if (extendsEnsemble != null && extendsEnsemble.eIsProxy())
    {
      InternalEObject oldExtendsEnsemble = (InternalEObject)extendsEnsemble;
      extendsEnsemble = (Ensemble)eResolveProxy(oldExtendsEnsemble);
      if (extendsEnsemble != oldExtendsEnsemble)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Roco2Package.ENSEMBLE__EXTENDS_ENSEMBLE, oldExtendsEnsemble, extendsEnsemble));
      }
    }
    return extendsEnsemble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ensemble basicGetExtendsEnsemble()
  {
    return extendsEnsemble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtendsEnsemble(Ensemble newExtendsEnsemble)
  {
    Ensemble oldExtendsEnsemble = extendsEnsemble;
    extendsEnsemble = newExtendsEnsemble;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Roco2Package.ENSEMBLE__EXTENDS_ENSEMBLE, oldExtendsEnsemble, extendsEnsemble));
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
      elements = new EObjectContainmentEList<Member>(Member.class, this, Roco2Package.ENSEMBLE__ELEMENTS);
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
      case Roco2Package.ENSEMBLE__ELEMENTS:
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
      case Roco2Package.ENSEMBLE__EXTENDS_ENSEMBLE:
        if (resolve) return getExtendsEnsemble();
        return basicGetExtendsEnsemble();
      case Roco2Package.ENSEMBLE__ELEMENTS:
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
      case Roco2Package.ENSEMBLE__EXTENDS_ENSEMBLE:
        setExtendsEnsemble((Ensemble)newValue);
        return;
      case Roco2Package.ENSEMBLE__ELEMENTS:
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
      case Roco2Package.ENSEMBLE__EXTENDS_ENSEMBLE:
        setExtendsEnsemble((Ensemble)null);
        return;
      case Roco2Package.ENSEMBLE__ELEMENTS:
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
      case Roco2Package.ENSEMBLE__EXTENDS_ENSEMBLE:
        return extendsEnsemble != null;
      case Roco2Package.ENSEMBLE__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnsembleImpl
