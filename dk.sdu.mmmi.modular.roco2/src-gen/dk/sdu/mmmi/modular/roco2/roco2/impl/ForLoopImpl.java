/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2.impl;

import dk.sdu.mmmi.modular.roco2.roco2.ForLoop;
import dk.sdu.mmmi.modular.roco2.roco2.Roco2Package;
import dk.sdu.mmmi.modular.roco2.roco2.ScopeDefiningElement;
import dk.sdu.mmmi.modular.roco2.roco2.Statement;

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
 * An implementation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ForLoopImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ForLoopImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ForLoopImpl#getShared <em>Shared</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ForLoopImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForLoopImpl extends BasicStatementImpl implements ForLoop
{
  /**
   * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected String variable = VARIABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected ScopeDefiningElement qualifier;

  /**
   * The default value of the '{@link #getShared() <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShared()
   * @generated
   * @ordered
   */
  protected static final String SHARED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShared() <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShared()
   * @generated
   * @ordered
   */
  protected String shared = SHARED_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected EList<Statement> body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForLoopImpl()
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
    return Roco2Package.Literals.FOR_LOOP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(String newVariable)
  {
    String oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Roco2Package.FOR_LOOP__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeDefiningElement getQualifier()
  {
    if (qualifier != null && qualifier.eIsProxy())
    {
      InternalEObject oldQualifier = (InternalEObject)qualifier;
      qualifier = (ScopeDefiningElement)eResolveProxy(oldQualifier);
      if (qualifier != oldQualifier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Roco2Package.FOR_LOOP__QUALIFIER, oldQualifier, qualifier));
      }
    }
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeDefiningElement basicGetQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(ScopeDefiningElement newQualifier)
  {
    ScopeDefiningElement oldQualifier = qualifier;
    qualifier = newQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Roco2Package.FOR_LOOP__QUALIFIER, oldQualifier, qualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShared()
  {
    return shared;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShared(String newShared)
  {
    String oldShared = shared;
    shared = newShared;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Roco2Package.FOR_LOOP__SHARED, oldShared, shared));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getBody()
  {
    if (body == null)
    {
      body = new EObjectContainmentEList<Statement>(Statement.class, this, Roco2Package.FOR_LOOP__BODY);
    }
    return body;
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
      case Roco2Package.FOR_LOOP__BODY:
        return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
      case Roco2Package.FOR_LOOP__VARIABLE:
        return getVariable();
      case Roco2Package.FOR_LOOP__QUALIFIER:
        if (resolve) return getQualifier();
        return basicGetQualifier();
      case Roco2Package.FOR_LOOP__SHARED:
        return getShared();
      case Roco2Package.FOR_LOOP__BODY:
        return getBody();
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
      case Roco2Package.FOR_LOOP__VARIABLE:
        setVariable((String)newValue);
        return;
      case Roco2Package.FOR_LOOP__QUALIFIER:
        setQualifier((ScopeDefiningElement)newValue);
        return;
      case Roco2Package.FOR_LOOP__SHARED:
        setShared((String)newValue);
        return;
      case Roco2Package.FOR_LOOP__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends Statement>)newValue);
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
      case Roco2Package.FOR_LOOP__VARIABLE:
        setVariable(VARIABLE_EDEFAULT);
        return;
      case Roco2Package.FOR_LOOP__QUALIFIER:
        setQualifier((ScopeDefiningElement)null);
        return;
      case Roco2Package.FOR_LOOP__SHARED:
        setShared(SHARED_EDEFAULT);
        return;
      case Roco2Package.FOR_LOOP__BODY:
        getBody().clear();
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
      case Roco2Package.FOR_LOOP__VARIABLE:
        return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
      case Roco2Package.FOR_LOOP__QUALIFIER:
        return qualifier != null;
      case Roco2Package.FOR_LOOP__SHARED:
        return SHARED_EDEFAULT == null ? shared != null : !SHARED_EDEFAULT.equals(shared);
      case Roco2Package.FOR_LOOP__BODY:
        return body != null && !body.isEmpty();
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
    result.append(" (variable: ");
    result.append(variable);
    result.append(", shared: ");
    result.append(shared);
    result.append(')');
    return result.toString();
  }

} //ForLoopImpl
