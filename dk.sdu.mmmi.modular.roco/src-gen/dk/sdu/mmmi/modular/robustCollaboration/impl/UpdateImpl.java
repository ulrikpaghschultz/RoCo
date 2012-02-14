/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.robustCollaboration.impl;

import dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationPackage;
import dk.sdu.mmmi.modular.robustCollaboration.ScopeDefiningElement;
import dk.sdu.mmmi.modular.robustCollaboration.Statement;
import dk.sdu.mmmi.modular.robustCollaboration.Update;

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
 * An implementation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.UpdateImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.UpdateImpl#getSourceQualifier <em>Source Qualifier</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.UpdateImpl#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.modular.robustCollaboration.impl.UpdateImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateImpl extends MemberImpl implements Update
{
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
   * The cached value of the '{@link #getSourceQualifier() <em>Source Qualifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceQualifier()
   * @generated
   * @ordered
   */
  protected ScopeDefiningElement sourceQualifier;

  /**
   * The default value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceName()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceName()
   * @generated
   * @ordered
   */
  protected String sourceName = SOURCE_NAME_EDEFAULT;

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
  protected UpdateImpl()
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
    return RobustCollaborationPackage.Literals.UPDATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.UPDATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeDefiningElement getSourceQualifier()
  {
    if (sourceQualifier != null && sourceQualifier.eIsProxy())
    {
      InternalEObject oldSourceQualifier = (InternalEObject)sourceQualifier;
      sourceQualifier = (ScopeDefiningElement)eResolveProxy(oldSourceQualifier);
      if (sourceQualifier != oldSourceQualifier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobustCollaborationPackage.UPDATE__SOURCE_QUALIFIER, oldSourceQualifier, sourceQualifier));
      }
    }
    return sourceQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeDefiningElement basicGetSourceQualifier()
  {
    return sourceQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceQualifier(ScopeDefiningElement newSourceQualifier)
  {
    ScopeDefiningElement oldSourceQualifier = sourceQualifier;
    sourceQualifier = newSourceQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.UPDATE__SOURCE_QUALIFIER, oldSourceQualifier, sourceQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourceName()
  {
    return sourceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceName(String newSourceName)
  {
    String oldSourceName = sourceName;
    sourceName = newSourceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RobustCollaborationPackage.UPDATE__SOURCE_NAME, oldSourceName, sourceName));
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
      body = new EObjectContainmentEList<Statement>(Statement.class, this, RobustCollaborationPackage.UPDATE__BODY);
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
      case RobustCollaborationPackage.UPDATE__BODY:
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
      case RobustCollaborationPackage.UPDATE__NAME:
        return getName();
      case RobustCollaborationPackage.UPDATE__SOURCE_QUALIFIER:
        if (resolve) return getSourceQualifier();
        return basicGetSourceQualifier();
      case RobustCollaborationPackage.UPDATE__SOURCE_NAME:
        return getSourceName();
      case RobustCollaborationPackage.UPDATE__BODY:
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
      case RobustCollaborationPackage.UPDATE__NAME:
        setName((String)newValue);
        return;
      case RobustCollaborationPackage.UPDATE__SOURCE_QUALIFIER:
        setSourceQualifier((ScopeDefiningElement)newValue);
        return;
      case RobustCollaborationPackage.UPDATE__SOURCE_NAME:
        setSourceName((String)newValue);
        return;
      case RobustCollaborationPackage.UPDATE__BODY:
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
      case RobustCollaborationPackage.UPDATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RobustCollaborationPackage.UPDATE__SOURCE_QUALIFIER:
        setSourceQualifier((ScopeDefiningElement)null);
        return;
      case RobustCollaborationPackage.UPDATE__SOURCE_NAME:
        setSourceName(SOURCE_NAME_EDEFAULT);
        return;
      case RobustCollaborationPackage.UPDATE__BODY:
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
      case RobustCollaborationPackage.UPDATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RobustCollaborationPackage.UPDATE__SOURCE_QUALIFIER:
        return sourceQualifier != null;
      case RobustCollaborationPackage.UPDATE__SOURCE_NAME:
        return SOURCE_NAME_EDEFAULT == null ? sourceName != null : !SOURCE_NAME_EDEFAULT.equals(sourceName);
      case RobustCollaborationPackage.UPDATE__BODY:
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
    result.append(" (name: ");
    result.append(name);
    result.append(", sourceName: ");
    result.append(sourceName);
    result.append(')');
    return result.toString();
  }

} //UpdateImpl
