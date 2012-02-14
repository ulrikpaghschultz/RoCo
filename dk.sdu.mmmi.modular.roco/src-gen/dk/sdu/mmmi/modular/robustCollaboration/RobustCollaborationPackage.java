/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.robustCollaboration;

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
 * @see dk.sdu.mmmi.modular.robustCollaboration.RobustCollaborationFactory
 * @model kind="package"
 * @generated
 */
public interface RobustCollaborationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "robustCollaboration";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdu.dk/mmmi/modular/RobustCollaboration";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "robustCollaboration";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RobustCollaborationPackage eINSTANCE = dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl.init();

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ProgramImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getProgram()
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
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ProgramElementImpl <em>Program Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ProgramElementImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getProgramElement()
   * @generated
   */
  int PROGRAM_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Program Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ExternalNameImpl <em>External Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ExternalNameImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getExternalName()
   * @generated
   */
  int EXTERNAL_NAME = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NAME__NAME = PROGRAM_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>External Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_NAME_FEATURE_COUNT = PROGRAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.LocalTypeImpl <em>Local Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.LocalTypeImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getLocalType()
   * @generated
   */
  int LOCAL_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_TYPE__NAME = PROGRAM_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Local Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_TYPE_FEATURE_COUNT = PROGRAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ScopeDefiningElementImpl <em>Scope Defining Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ScopeDefiningElementImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getScopeDefiningElement()
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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.TypeDefImpl <em>Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.TypeDefImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getTypeDef()
   * @generated
   */
  int TYPE_DEF = 5;

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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.EnumDefImpl <em>Enum Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.EnumDefImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getEnumDef()
   * @generated
   */
  int ENUM_DEF = 6;

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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.EnsembleImpl <em>Ensemble</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.EnsembleImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getEnsemble()
   * @generated
   */
  int ENSEMBLE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENSEMBLE__NAME = SCOPE_DEFINING_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENSEMBLE__ELEMENTS = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ensemble</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENSEMBLE_FEATURE_COUNT = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RoleImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getRole()
   * @generated
   */
  int ROLE = 8;

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
   * The feature id for the '<em><b>Extends Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__EXTENDS_ROLE = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Within Ensemble</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__WITHIN_ENSEMBLE = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__ELEMENTS = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = SCOPE_DEFINING_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.MemberImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 9;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.FieldImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getField()
   * @generated
   */
  int FIELD = 10;

  /**
   * The feature id for the '<em><b>Shared</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__SHARED = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Initial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__INITIAL = MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.RequireImpl <em>Require</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RequireImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getRequire()
   * @generated
   */
  int REQUIRE = 11;

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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.BehaviorImpl <em>Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.BehaviorImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getBehavior()
   * @generated
   */
  int BEHAVIOR = 12;

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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ParameterImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 13;

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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.MethodImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 14;

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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ExprImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 15;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.LocalVariableImpl <em>Local Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.LocalVariableImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getLocalVariable()
   * @generated
   */
  int LOCAL_VARIABLE = 16;

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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.QualifiedNameImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getQualifiedName()
   * @generated
   */
  int QUALIFIED_NAME = 17;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__QUALIFIER = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__NAME = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.BinaryExprImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getBinaryExpr()
   * @generated
   */
  int BINARY_EXPR = 18;

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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.FunctionCallImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 19;

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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.StatementImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 20;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ConditionalImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 21;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Branch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__THEN_BRANCH = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Branch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__ELSE_BRANCH = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.OperationImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 22;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__QUALIFIER = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__ARGUMENTS = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.SelfOperationImpl <em>Self Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.SelfOperationImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getSelfOperation()
   * @generated
   */
  int SELF_OPERATION = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_OPERATION__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_OPERATION__ARGUMENTS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Self Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_OPERATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.AssignmentImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__EXP = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ValueImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getValue()
   * @generated
   */
  int VALUE = 25;

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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.UpdateImpl <em>Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.UpdateImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getUpdate()
   * @generated
   */
  int UPDATE = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE__NAME = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE__SOURCE_QUALIFIER = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE__SOURCE_NAME = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE__BODY = MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ConstantDefinitionImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getConstantDefinition()
   * @generated
   */
  int CONSTANT_DEFINITION = 27;

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
   * The meta object id for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ConstantAssignmentImpl <em>Constant Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ConstantAssignmentImpl
   * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getConstantAssignment()
   * @generated
   */
  int CONSTANT_ASSIGNMENT = 28;

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
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.Program#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Program#getElements()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Elements();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.ProgramElement <em>Program Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program Element</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.ProgramElement
   * @generated
   */
  EClass getProgramElement();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.ProgramElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.ProgramElement#getName()
   * @see #getProgramElement()
   * @generated
   */
  EAttribute getProgramElement_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.ExternalName <em>External Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.ExternalName
   * @generated
   */
  EClass getExternalName();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.ScopeDefiningElement <em>Scope Defining Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope Defining Element</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.ScopeDefiningElement
   * @generated
   */
  EClass getScopeDefiningElement();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.LocalType <em>Local Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Type</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.LocalType
   * @generated
   */
  EClass getLocalType();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Def</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.TypeDef
   * @generated
   */
  EClass getTypeDef();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.EnumDef <em>Enum Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Def</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.EnumDef
   * @generated
   */
  EClass getEnumDef();

  /**
   * Returns the meta object for the attribute list '{@link dk.sdu.mmmi.modular.robustCollaboration.EnumDef#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.EnumDef#getNames()
   * @see #getEnumDef()
   * @generated
   */
  EAttribute getEnumDef_Names();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Ensemble <em>Ensemble</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ensemble</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Ensemble
   * @generated
   */
  EClass getEnsemble();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.Ensemble#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Ensemble#getElements()
   * @see #getEnsemble()
   * @generated
   */
  EReference getEnsemble_Elements();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Role#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Role#isAbstract()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Abstract();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Role#isExtendsRole <em>Extends Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extends Role</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Role#isExtendsRole()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_ExtendsRole();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Role#isWithinEnsemble <em>Within Ensemble</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Within Ensemble</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Role#isWithinEnsemble()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_WithinEnsemble();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.Role#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Role#getElements()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Elements();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Field#isShared <em>Shared</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shared</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Field#isShared()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Shared();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.robustCollaboration.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.robustCollaboration.Field#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Field#getInitial()
   * @see #getField()
   * @generated
   */
  EReference getField_Initial();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Require <em>Require</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Require</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Require
   * @generated
   */
  EClass getRequire();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.robustCollaboration.Require#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Require#getExp()
   * @see #getRequire()
   * @generated
   */
  EReference getRequire_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Behavior
   * @generated
   */
  EClass getBehavior();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.robustCollaboration.Behavior#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Qualifier</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Behavior#getQualifier()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_Qualifier();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Behavior#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Behavior#getName()
   * @see #getBehavior()
   * @generated
   */
  EAttribute getBehavior_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.Behavior#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Behavior#getParams()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_Params();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.Behavior#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Behavior#getBody()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_Body();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.robustCollaboration.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.robustCollaboration.Method#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Method#getType()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.Method#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Method#getParams()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Params();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.Method#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Method#getBody()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Body();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.LocalVariable
   * @generated
   */
  EClass getLocalVariable();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.LocalVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.LocalVariable#getName()
   * @see #getLocalVariable()
   * @generated
   */
  EAttribute getLocalVariable_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.QualifiedName
   * @generated
   */
  EClass getQualifiedName();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.robustCollaboration.QualifiedName#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Qualifier</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.QualifiedName#getQualifier()
   * @see #getQualifiedName()
   * @generated
   */
  EReference getQualifiedName_Qualifier();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.QualifiedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.QualifiedName#getName()
   * @see #getQualifiedName()
   * @generated
   */
  EAttribute getQualifiedName_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.BinaryExpr <em>Binary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expr</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.BinaryExpr
   * @generated
   */
  EClass getBinaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.robustCollaboration.BinaryExpr#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.BinaryExpr#getLhs()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Lhs();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.BinaryExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.BinaryExpr#getOp()
   * @see #getBinaryExpr()
   * @generated
   */
  EAttribute getBinaryExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.robustCollaboration.BinaryExpr#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.BinaryExpr#getRhs()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Rhs();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.FunctionCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.FunctionCall#getName()
   * @see #getFunctionCall()
   * @generated
   */
  EAttribute getFunctionCall_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.FunctionCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.FunctionCall#getArguments()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Arguments();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.robustCollaboration.Conditional#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Conditional#getCondition()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.Conditional#getThenBranch <em>Then Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Then Branch</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Conditional#getThenBranch()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_ThenBranch();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.Conditional#getElseBranch <em>Else Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Branch</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Conditional#getElseBranch()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_ElseBranch();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.robustCollaboration.Operation#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Qualifier</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Operation#getQualifier()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Qualifier();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.Operation#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Operation#getArguments()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Arguments();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.SelfOperation <em>Self Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Operation</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.SelfOperation
   * @generated
   */
  EClass getSelfOperation();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.SelfOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.SelfOperation#getName()
   * @see #getSelfOperation()
   * @generated
   */
  EAttribute getSelfOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.SelfOperation#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.SelfOperation#getArguments()
   * @see #getSelfOperation()
   * @generated
   */
  EReference getSelfOperation_Arguments();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Assignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Assignment#getName()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.robustCollaboration.Assignment#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Assignment#getExp()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Value#getValue()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Value();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.robustCollaboration.Value#getExtern <em>Extern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extern</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Value#getExtern()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Extern();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.Update <em>Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Update
   * @generated
   */
  EClass getUpdate();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Update#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Update#getName()
   * @see #getUpdate()
   * @generated
   */
  EAttribute getUpdate_Name();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.robustCollaboration.Update#getSourceQualifier <em>Source Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Qualifier</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Update#getSourceQualifier()
   * @see #getUpdate()
   * @generated
   */
  EReference getUpdate_SourceQualifier();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.Update#getSourceName <em>Source Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Update#getSourceName()
   * @see #getUpdate()
   * @generated
   */
  EAttribute getUpdate_SourceName();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.modular.robustCollaboration.Update#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.Update#getBody()
   * @see #getUpdate()
   * @generated
   */
  EReference getUpdate_Body();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Definition</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.ConstantDefinition
   * @generated
   */
  EClass getConstantDefinition();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.ConstantDefinition#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.ConstantDefinition#isAbstract()
   * @see #getConstantDefinition()
   * @generated
   */
  EAttribute getConstantDefinition_Abstract();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.modular.robustCollaboration.ConstantDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.ConstantDefinition#getType()
   * @see #getConstantDefinition()
   * @generated
   */
  EReference getConstantDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.ConstantDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.ConstantDefinition#getName()
   * @see #getConstantDefinition()
   * @generated
   */
  EAttribute getConstantDefinition_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.modular.robustCollaboration.ConstantAssignment <em>Constant Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Assignment</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.ConstantAssignment
   * @generated
   */
  EClass getConstantAssignment();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.modular.robustCollaboration.ConstantAssignment#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lhs</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.ConstantAssignment#getLhs()
   * @see #getConstantAssignment()
   * @generated
   */
  EAttribute getConstantAssignment_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.modular.robustCollaboration.ConstantAssignment#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see dk.sdu.mmmi.modular.robustCollaboration.ConstantAssignment#getRhs()
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
  RobustCollaborationFactory getRobustCollaborationFactory();

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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ProgramImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getProgram()
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
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__ELEMENTS = eINSTANCE.getProgram_Elements();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ProgramElementImpl <em>Program Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ProgramElementImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getProgramElement()
     * @generated
     */
    EClass PROGRAM_ELEMENT = eINSTANCE.getProgramElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM_ELEMENT__NAME = eINSTANCE.getProgramElement_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ExternalNameImpl <em>External Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ExternalNameImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getExternalName()
     * @generated
     */
    EClass EXTERNAL_NAME = eINSTANCE.getExternalName();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ScopeDefiningElementImpl <em>Scope Defining Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ScopeDefiningElementImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getScopeDefiningElement()
     * @generated
     */
    EClass SCOPE_DEFINING_ELEMENT = eINSTANCE.getScopeDefiningElement();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.LocalTypeImpl <em>Local Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.LocalTypeImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getLocalType()
     * @generated
     */
    EClass LOCAL_TYPE = eINSTANCE.getLocalType();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.TypeDefImpl <em>Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.TypeDefImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getTypeDef()
     * @generated
     */
    EClass TYPE_DEF = eINSTANCE.getTypeDef();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.EnumDefImpl <em>Enum Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.EnumDefImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getEnumDef()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.EnsembleImpl <em>Ensemble</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.EnsembleImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getEnsemble()
     * @generated
     */
    EClass ENSEMBLE = eINSTANCE.getEnsemble();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENSEMBLE__ELEMENTS = eINSTANCE.getEnsemble_Elements();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RoleImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getRole()
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
     * The meta object literal for the '<em><b>Extends Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__EXTENDS_ROLE = eINSTANCE.getRole_ExtendsRole();

    /**
     * The meta object literal for the '<em><b>Within Ensemble</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__WITHIN_ENSEMBLE = eINSTANCE.getRole_WithinEnsemble();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__ELEMENTS = eINSTANCE.getRole_Elements();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.MemberImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.FieldImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Shared</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__SHARED = eINSTANCE.getField_Shared();

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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.RequireImpl <em>Require</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RequireImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getRequire()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.BehaviorImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getBehavior()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ParameterImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getParameter()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.MethodImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getMethod()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ExprImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.LocalVariableImpl <em>Local Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.LocalVariableImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getLocalVariable()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.QualifiedNameImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getQualifiedName()
     * @generated
     */
    EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_NAME__QUALIFIER = eINSTANCE.getQualifiedName_Qualifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_NAME__NAME = eINSTANCE.getQualifiedName_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.BinaryExprImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getBinaryExpr()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.FunctionCallImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getFunctionCall()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.StatementImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ConditionalImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getConditional()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.OperationImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__QUALIFIER = eINSTANCE.getOperation_Qualifier();

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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.SelfOperationImpl <em>Self Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.SelfOperationImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getSelfOperation()
     * @generated
     */
    EClass SELF_OPERATION = eINSTANCE.getSelfOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELF_OPERATION__NAME = eINSTANCE.getSelfOperation_Name();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELF_OPERATION__ARGUMENTS = eINSTANCE.getSelfOperation_Arguments();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.AssignmentImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getAssignment()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ValueImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getValue()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.UpdateImpl <em>Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.UpdateImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getUpdate()
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
     * The meta object literal for the '<em><b>Source Qualifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE__SOURCE_QUALIFIER = eINSTANCE.getUpdate_SourceQualifier();

    /**
     * The meta object literal for the '<em><b>Source Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UPDATE__SOURCE_NAME = eINSTANCE.getUpdate_SourceName();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE__BODY = eINSTANCE.getUpdate_Body();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ConstantDefinitionImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getConstantDefinition()
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
     * The meta object literal for the '{@link dk.sdu.mmmi.modular.robustCollaboration.impl.ConstantAssignmentImpl <em>Constant Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.ConstantAssignmentImpl
     * @see dk.sdu.mmmi.modular.robustCollaboration.impl.RobustCollaborationPackageImpl#getConstantAssignment()
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

} //RobustCollaborationPackage
