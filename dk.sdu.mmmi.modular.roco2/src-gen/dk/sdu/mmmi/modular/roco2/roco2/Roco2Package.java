/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Factory
 * @model kind="package"
 * @generated
 */
public interface Roco2Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "roco2";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdu.dk/mmmi/modular/roco2/Roco2";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "roco2";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Roco2Package eINSTANCE = dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl.init();

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ProgramImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Externals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__EXTERNALS = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ExternalNameImpl <em>External Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ExternalNameImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getExternalName()
   * @generated
   */
  int EXTERNAL_NAME = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>External Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.LocalTypeImpl <em>Local Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.LocalTypeImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getLocalType()
   * @generated
   */
  int LOCAL_TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Local Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ScopeDefiningElementImpl <em>Scope Defining Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ScopeDefiningElementImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getScopeDefiningElement()
   * @generated
   */
  int SCOPE_DEFINING_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEFINING_ELEMENT__NAME = LOCAL_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Scope Defining Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_DEFINING_ELEMENT_FEATURE_COUNT = LOCAL_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.TypeDefImpl <em>Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.TypeDefImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getTypeDef()
   * @generated
   */
  int TYPE_DEF = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__NAME = LOCAL_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF_FEATURE_COUNT = LOCAL_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.EnumDefImpl <em>Enum Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.EnumDefImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getEnumDef()
   * @generated
   */
  int ENUM_DEF = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEF__NAME = SCOPE_DEFINING_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEF__NAMES = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEF_FEATURE_COUNT = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.EnsembleImpl <em>Ensemble</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.EnsembleImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getEnsemble()
   * @generated
   */
  int ENSEMBLE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENSEMBLE__NAME = SCOPE_DEFINING_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Extends Ensemble</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENSEMBLE__EXTENDS_ENSEMBLE = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENSEMBLE__ELEMENTS = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ensemble</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENSEMBLE_FEATURE_COUNT = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.RoleImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getRole()
   * @generated
   */
  int ROLE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = SCOPE_DEFINING_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__ABSTRACT = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mixin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__MIXIN = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Extends Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__EXTENDS_ROLE = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Within Ensemble</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__WITHIN_ENSEMBLE = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__ELEMENTS = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.MemberImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getMember()
   * @generated
   */
  int MEMBER = 8;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.FieldImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getField()
   * @generated
   */
  int FIELD = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Initial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__INITIAL = MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.RequireImpl <em>Require</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.RequireImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getRequire()
   * @generated
   */
  int REQUIRE = 10;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE__EXP = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Require</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.BehaviorImpl <em>Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.BehaviorImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getBehavior()
   * @generated
   */
  int BEHAVIOR = 11;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__QUALIFIER = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__NAME = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__PARAMS = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__BODY = MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ParameterImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.MethodImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getMethod()
   * @generated
   */
  int METHOD = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMS = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__BODY = MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ExprImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getExpr()
   * @generated
   */
  int EXPR = 14;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.LocalVariableImpl <em>Local Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.LocalVariableImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getLocalVariable()
   * @generated
   */
  int LOCAL_VARIABLE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__NAME = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.InternalQualifiedNameImpl <em>Internal Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.InternalQualifiedNameImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getInternalQualifiedName()
   * @generated
   */
  int INTERNAL_QUALIFIED_NAME = 16;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_QUALIFIED_NAME__QUALIFIER = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_QUALIFIED_NAME__NAME = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Internal Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_QUALIFIED_NAME_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.BinaryExprImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getBinaryExpr()
   * @generated
   */
  int BINARY_EXPR = 17;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__LHS = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__RHS = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.FunctionCallImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__NAME = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__ARGUMENTS = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.StatementImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 19;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.BasicStatementImpl <em>Basic Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.BasicStatementImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getBasicStatement()
   * @generated
   */
  int BASIC_STATEMENT = 20;

  /**
   * The number of structural features of the '<em>Basic Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ForLoopImpl <em>For Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ForLoopImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getForLoop()
   * @generated
   */
  int FOR_LOOP = 21;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__VARIABLE = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__QUALIFIER = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Shared</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__SHARED = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__BODY = BASIC_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>For Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ConditionalImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 22;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__CONDITION = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Branch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__THEN_BRANCH = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Branch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__ELSE_BRANCH = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.QualifiedStatementImpl <em>Qualified Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.QualifiedStatementImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getQualifiedStatement()
   * @generated
   */
  int QUALIFIED_STATEMENT = 23;

  /**
   * The feature id for the '<em><b>Self</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_STATEMENT__SELF = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_STATEMENT__QUALIFIER = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Qualified Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.OperationActivationImpl <em>Operation Activation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.OperationActivationImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getOperationActivation()
   * @generated
   */
  int OPERATION_ACTIVATION = 24;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_ACTIVATION__OPERATION = 0;

  /**
   * The number of structural features of the '<em>Operation Activation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_ACTIVATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.OperationInhibitImpl <em>Operation Inhibit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.OperationInhibitImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getOperationInhibit()
   * @generated
   */
  int OPERATION_INHIBIT = 25;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_INHIBIT__OPERATION = 0;

  /**
   * The number of structural features of the '<em>Operation Inhibit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_INHIBIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ModuleConditionalImpl <em>Module Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ModuleConditionalImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getModuleConditional()
   * @generated
   */
  int MODULE_CONDITIONAL = 26;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_CONDITIONAL__CONDITIONAL = 0;

  /**
   * The number of structural features of the '<em>Module Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_CONDITIONAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.OperationImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__ARGUMENTS = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.AssignmentImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__NAME = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__EXP = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ValueImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getValue()
   * @generated
   */
  int VALUE = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VALUE = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__EXTERN = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.UpdateImpl <em>Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.UpdateImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getUpdate()
   * @generated
   */
  int UPDATE = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE__NAME = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE__BODY = MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ConstantDefinitionImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getConstantDefinition()
   * @generated
   */
  int CONSTANT_DEFINITION = 31;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__ABSTRACT = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__TYPE = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__NAME = MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Constant Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ConstantAssignmentImpl <em>Constant Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ConstantAssignmentImpl
   * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getConstantAssignment()
   * @generated
   */
  int CONSTANT_ASSIGNMENT = 32;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_ASSIGNMENT__LHS = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_ASSIGNMENT__RHS = MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_ASSIGNMENT_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Program#getExternals <em>Externals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Externals</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Program#getExternals()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Externals();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Program#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Program#getElements()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Elements();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.ExternalName <em>External Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ExternalName
   * @generated
   */
  EClass getExternalName();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.ExternalName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ExternalName#getName()
   * @see #getExternalName()
   * @generated
   */
  EAttribute getExternalName_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.LocalType <em>Local Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Type</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.LocalType
   * @generated
   */
  EClass getLocalType();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.LocalType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.LocalType#getName()
   * @see #getLocalType()
   * @generated
   */
  EAttribute getLocalType_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.ScopeDefiningElement <em>Scope Defining Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope Defining Element</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ScopeDefiningElement
   * @generated
   */
  EClass getScopeDefiningElement();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Def</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.TypeDef
   * @generated
   */
  EClass getTypeDef();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.EnumDef <em>Enum Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Def</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.EnumDef
   * @generated
   */
  EClass getEnumDef();

  /**
   * Returns the meta object for the attribute list '{@link dk.sdu.mmmi.modular.roco2.roco2.EnumDef#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.EnumDef#getNames()
   * @see #getEnumDef()
   * @generated
   */
  EAttribute getEnumDef_Names();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Ensemble <em>Ensemble</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ensemble</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Ensemble
   * @generated
   */
  EClass getEnsemble();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Ensemble#getExtendsEnsemble <em>Extends Ensemble</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends Ensemble</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Ensemble#getExtendsEnsemble()
   * @see #getEnsemble()
   * @generated
   */
  EReference getEnsemble_ExtendsEnsemble();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Ensemble#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Ensemble#getElements()
   * @see #getEnsemble()
   * @generated
   */
  EReference getEnsemble_Elements();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.Role#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Role#isAbstract()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Abstract();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.Role#isMixin <em>Mixin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mixin</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Role#isMixin()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Mixin();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Role#getExtendsRole <em>Extends Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends Role</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Role#getExtendsRole()
   * @see #getRole()
   * @generated
   */
  EReference getRole_ExtendsRole();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Role#getWithinEnsemble <em>Within Ensemble</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Within Ensemble</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Role#getWithinEnsemble()
   * @see #getRole()
   * @generated
   */
  EReference getRole_WithinEnsemble();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Role#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Role#getElements()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Elements();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Field#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Field#getInitial()
   * @see #getField()
   * @generated
   */
  EReference getField_Initial();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Require <em>Require</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Require</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Require
   * @generated
   */
  EClass getRequire();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Require#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Require#getExp()
   * @see #getRequire()
   * @generated
   */
  EReference getRequire_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Behavior
   * @generated
   */
  EClass getBehavior();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Qualifier</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Behavior#getQualifier()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_Qualifier();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Behavior#getName()
   * @see #getBehavior()
   * @generated
   */
  EAttribute getBehavior_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Behavior#getParams()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_Params();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Behavior#getBody()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_Body();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Method#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Method#getType()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Method#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Method#getParams()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Params();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Method#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Method#getBody()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Body();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.LocalVariable
   * @generated
   */
  EClass getLocalVariable();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.LocalVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.LocalVariable#getName()
   * @see #getLocalVariable()
   * @generated
   */
  EAttribute getLocalVariable_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.InternalQualifiedName <em>Internal Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Qualified Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.InternalQualifiedName
   * @generated
   */
  EClass getInternalQualifiedName();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.InternalQualifiedName#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Qualifier</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.InternalQualifiedName#getQualifier()
   * @see #getInternalQualifiedName()
   * @generated
   */
  EReference getInternalQualifiedName_Qualifier();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.InternalQualifiedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.InternalQualifiedName#getName()
   * @see #getInternalQualifiedName()
   * @generated
   */
  EAttribute getInternalQualifiedName_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr <em>Binary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expr</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr
   * @generated
   */
  EClass getBinaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getLhs()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Lhs();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getOp()
   * @see #getBinaryExpr()
   * @generated
   */
  EAttribute getBinaryExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr#getRhs()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Rhs();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.FunctionCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.FunctionCall#getName()
   * @see #getFunctionCall()
   * @generated
   */
  EAttribute getFunctionCall_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.FunctionCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.FunctionCall#getArguments()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Arguments();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.BasicStatement <em>Basic Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Statement</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.BasicStatement
   * @generated
   */
  EClass getBasicStatement();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop <em>For Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Loop</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ForLoop
   * @generated
   */
  EClass getForLoop();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getVariable()
   * @see #getForLoop()
   * @generated
   */
  EAttribute getForLoop_Variable();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Qualifier</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getQualifier()
   * @see #getForLoop()
   * @generated
   */
  EReference getForLoop_Qualifier();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getShared <em>Shared</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shared</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getShared()
   * @see #getForLoop()
   * @generated
   */
  EAttribute getForLoop_Shared();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ForLoop#getBody()
   * @see #getForLoop()
   * @generated
   */
  EReference getForLoop_Body();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Conditional#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Conditional#getCondition()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Conditional#getThenBranch <em>Then Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Then Branch</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Conditional#getThenBranch()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_ThenBranch();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Conditional#getElseBranch <em>Else Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Branch</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Conditional#getElseBranch()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_ElseBranch();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement <em>Qualified Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Statement</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement
   * @generated
   */
  EClass getQualifiedStatement();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#isSelf <em>Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Self</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#isSelf()
   * @see #getQualifiedStatement()
   * @generated
   */
  EAttribute getQualifiedStatement_Self();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Qualifier</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#getQualifier()
   * @see #getQualifiedStatement()
   * @generated
   */
  EReference getQualifiedStatement_Qualifier();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement#getStatement()
   * @see #getQualifiedStatement()
   * @generated
   */
  EReference getQualifiedStatement_Statement();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.OperationActivation <em>Operation Activation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Activation</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.OperationActivation
   * @generated
   */
  EClass getOperationActivation();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.roco2.roco2.OperationActivation#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.OperationActivation#getOperation()
   * @see #getOperationActivation()
   * @generated
   */
  EReference getOperationActivation_Operation();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.OperationInhibit <em>Operation Inhibit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Inhibit</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.OperationInhibit
   * @generated
   */
  EClass getOperationInhibit();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.roco2.roco2.OperationInhibit#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.OperationInhibit#getOperation()
   * @see #getOperationInhibit()
   * @generated
   */
  EReference getOperationInhibit_Operation();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.ModuleConditional <em>Module Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Conditional</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ModuleConditional
   * @generated
   */
  EClass getModuleConditional();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.roco2.roco2.ModuleConditional#getConditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ModuleConditional#getConditional()
   * @see #getModuleConditional()
   * @generated
   */
  EReference getModuleConditional_Conditional();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Operation#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Operation#getArguments()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Arguments();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.Assignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Assignment#getName()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Assignment#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Assignment#getExp()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Value#getValue()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Value();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.Value#getExtern <em>Extern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extern</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Value#getExtern()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Extern();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.Update <em>Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Update
   * @generated
   */
  EClass getUpdate();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.Update#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Update#getName()
   * @see #getUpdate()
   * @generated
   */
  EAttribute getUpdate_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.roco2.roco2.Update#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Update#getBody()
   * @see #getUpdate()
   * @generated
   */
  EReference getUpdate_Body();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Definition</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ConstantDefinition
   * @generated
   */
  EClass getConstantDefinition();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantDefinition#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ConstantDefinition#isAbstract()
   * @see #getConstantDefinition()
   * @generated
   */
  EAttribute getConstantDefinition_Abstract();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ConstantDefinition#getType()
   * @see #getConstantDefinition()
   * @generated
   */
  EReference getConstantDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ConstantDefinition#getName()
   * @see #getConstantDefinition()
   * @generated
   */
  EAttribute getConstantDefinition_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment <em>Constant Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Assignment</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment
   * @generated
   */
  EClass getConstantAssignment();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lhs</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment#getLhs()
   * @see #getConstantAssignment()
   * @generated
   */
  EAttribute getConstantAssignment_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment#getRhs()
   * @see #getConstantAssignment()
   * @generated
   */
  EReference getConstantAssignment_Rhs();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Roco2Factory getRoco2Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ProgramImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Externals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__EXTERNALS = eINSTANCE.getProgram_Externals();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__ELEMENTS = eINSTANCE.getProgram_Elements();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ExternalNameImpl <em>External Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ExternalNameImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getExternalName()
     * @generated
     */
    EClass EXTERNAL_NAME = eINSTANCE.getExternalName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_NAME__NAME = eINSTANCE.getExternalName_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.LocalTypeImpl <em>Local Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.LocalTypeImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getLocalType()
     * @generated
     */
    EClass LOCAL_TYPE = eINSTANCE.getLocalType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_TYPE__NAME = eINSTANCE.getLocalType_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ScopeDefiningElementImpl <em>Scope Defining Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ScopeDefiningElementImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getScopeDefiningElement()
     * @generated
     */
    EClass SCOPE_DEFINING_ELEMENT = eINSTANCE.getScopeDefiningElement();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.TypeDefImpl <em>Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.TypeDefImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getTypeDef()
     * @generated
     */
    EClass TYPE_DEF = eINSTANCE.getTypeDef();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.EnumDefImpl <em>Enum Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.EnumDefImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getEnumDef()
     * @generated
     */
    EClass ENUM_DEF = eINSTANCE.getEnumDef();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_DEF__NAMES = eINSTANCE.getEnumDef_Names();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.EnsembleImpl <em>Ensemble</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.EnsembleImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getEnsemble()
     * @generated
     */
    EClass ENSEMBLE = eINSTANCE.getEnsemble();

    /**
     * The meta object literal for the '<em><b>Extends Ensemble</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENSEMBLE__EXTENDS_ENSEMBLE = eINSTANCE.getEnsemble_ExtendsEnsemble();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENSEMBLE__ELEMENTS = eINSTANCE.getEnsemble_Elements();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.RoleImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__ABSTRACT = eINSTANCE.getRole_Abstract();

    /**
     * The meta object literal for the '<em><b>Mixin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__MIXIN = eINSTANCE.getRole_Mixin();

    /**
     * The meta object literal for the '<em><b>Extends Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__EXTENDS_ROLE = eINSTANCE.getRole_ExtendsRole();

    /**
     * The meta object literal for the '<em><b>Within Ensemble</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__WITHIN_ENSEMBLE = eINSTANCE.getRole_WithinEnsemble();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__ELEMENTS = eINSTANCE.getRole_Elements();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.MemberImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.FieldImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__INITIAL = eINSTANCE.getField_Initial();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.RequireImpl <em>Require</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.RequireImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getRequire()
     * @generated
     */
    EClass REQUIRE = eINSTANCE.getRequire();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRE__EXP = eINSTANCE.getRequire_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.BehaviorImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getBehavior()
     * @generated
     */
    EClass BEHAVIOR = eINSTANCE.getBehavior();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR__QUALIFIER = eINSTANCE.getBehavior_Qualifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOR__NAME = eINSTANCE.getBehavior_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR__PARAMS = eINSTANCE.getBehavior_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR__BODY = eINSTANCE.getBehavior_Body();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ParameterImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.MethodImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__TYPE = eINSTANCE.getMethod_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMS = eINSTANCE.getMethod_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__BODY = eINSTANCE.getMethod_Body();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ExprImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.LocalVariableImpl <em>Local Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.LocalVariableImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getLocalVariable()
     * @generated
     */
    EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VARIABLE__NAME = eINSTANCE.getLocalVariable_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.InternalQualifiedNameImpl <em>Internal Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.InternalQualifiedNameImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getInternalQualifiedName()
     * @generated
     */
    EClass INTERNAL_QUALIFIED_NAME = eINSTANCE.getInternalQualifiedName();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL_QUALIFIED_NAME__QUALIFIER = eINSTANCE.getInternalQualifiedName_Qualifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERNAL_QUALIFIED_NAME__NAME = eINSTANCE.getInternalQualifiedName_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.BinaryExprImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getBinaryExpr()
     * @generated
     */
    EClass BINARY_EXPR = eINSTANCE.getBinaryExpr();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__LHS = eINSTANCE.getBinaryExpr_Lhs();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_EXPR__OP = eINSTANCE.getBinaryExpr_Op();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__RHS = eINSTANCE.getBinaryExpr_Rhs();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.FunctionCallImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_CALL__NAME = eINSTANCE.getFunctionCall_Name();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__ARGUMENTS = eINSTANCE.getFunctionCall_Arguments();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.StatementImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.BasicStatementImpl <em>Basic Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.BasicStatementImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getBasicStatement()
     * @generated
     */
    EClass BASIC_STATEMENT = eINSTANCE.getBasicStatement();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ForLoopImpl <em>For Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ForLoopImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getForLoop()
     * @generated
     */
    EClass FOR_LOOP = eINSTANCE.getForLoop();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_LOOP__VARIABLE = eINSTANCE.getForLoop_Variable();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LOOP__QUALIFIER = eINSTANCE.getForLoop_Qualifier();

    /**
     * The meta object literal for the '<em><b>Shared</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_LOOP__SHARED = eINSTANCE.getForLoop_Shared();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LOOP__BODY = eINSTANCE.getForLoop_Body();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ConditionalImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

    /**
     * The meta object literal for the '<em><b>Then Branch</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__THEN_BRANCH = eINSTANCE.getConditional_ThenBranch();

    /**
     * The meta object literal for the '<em><b>Else Branch</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__ELSE_BRANCH = eINSTANCE.getConditional_ElseBranch();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.QualifiedStatementImpl <em>Qualified Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.QualifiedStatementImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getQualifiedStatement()
     * @generated
     */
    EClass QUALIFIED_STATEMENT = eINSTANCE.getQualifiedStatement();

    /**
     * The meta object literal for the '<em><b>Self</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_STATEMENT__SELF = eINSTANCE.getQualifiedStatement_Self();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_STATEMENT__QUALIFIER = eINSTANCE.getQualifiedStatement_Qualifier();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_STATEMENT__STATEMENT = eINSTANCE.getQualifiedStatement_Statement();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.OperationActivationImpl <em>Operation Activation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.OperationActivationImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getOperationActivation()
     * @generated
     */
    EClass OPERATION_ACTIVATION = eINSTANCE.getOperationActivation();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_ACTIVATION__OPERATION = eINSTANCE.getOperationActivation_Operation();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.OperationInhibitImpl <em>Operation Inhibit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.OperationInhibitImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getOperationInhibit()
     * @generated
     */
    EClass OPERATION_INHIBIT = eINSTANCE.getOperationInhibit();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_INHIBIT__OPERATION = eINSTANCE.getOperationInhibit_Operation();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ModuleConditionalImpl <em>Module Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ModuleConditionalImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getModuleConditional()
     * @generated
     */
    EClass MODULE_CONDITIONAL = eINSTANCE.getModuleConditional();

    /**
     * The meta object literal for the '<em><b>Conditional</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_CONDITIONAL__CONDITIONAL = eINSTANCE.getModuleConditional_Conditional();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.OperationImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__ARGUMENTS = eINSTANCE.getOperation_Arguments();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.AssignmentImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__NAME = eINSTANCE.getAssignment_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__EXP = eINSTANCE.getAssignment_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ValueImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

    /**
     * The meta object literal for the '<em><b>Extern</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__EXTERN = eINSTANCE.getValue_Extern();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.UpdateImpl <em>Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.UpdateImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getUpdate()
     * @generated
     */
    EClass UPDATE = eINSTANCE.getUpdate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UPDATE__NAME = eINSTANCE.getUpdate_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE__BODY = eINSTANCE.getUpdate_Body();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ConstantDefinitionImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getConstantDefinition()
     * @generated
     */
    EClass CONSTANT_DEFINITION = eINSTANCE.getConstantDefinition();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DEFINITION__ABSTRACT = eINSTANCE.getConstantDefinition_Abstract();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DEFINITION__TYPE = eINSTANCE.getConstantDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DEFINITION__NAME = eINSTANCE.getConstantDefinition_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.roco2.roco2.impl.ConstantAssignmentImpl <em>Constant Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.ConstantAssignmentImpl
     * @see dk.sdu.mmmi.modular.roco2.roco2.impl.Roco2PackageImpl#getConstantAssignment()
     * @generated
     */
    EClass CONSTANT_ASSIGNMENT = eINSTANCE.getConstantAssignment();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_ASSIGNMENT__LHS = eINSTANCE.getConstantAssignment_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_ASSIGNMENT__RHS = eINSTANCE.getConstantAssignment_Rhs();

  }

} //Roco2Package
