/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.robustCollaboration.impl;

import dk.sdu.mmmi.modular.robustCollaboration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobustCollaborationFactoryImpl extends EFactoryImpl implements RobustCollaborationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RobustCollaborationFactory init()
  {
    try
    {
      RobustCollaborationFactory theRobustCollaborationFactory = (RobustCollaborationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sdu.dk/mmmi/modular/RobustCollaboration"); 
      if (theRobustCollaborationFactory != null)
      {
        return theRobustCollaborationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RobustCollaborationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobustCollaborationFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RobustCollaborationPackage.PROGRAM: return createProgram();
      case RobustCollaborationPackage.PROGRAM_ELEMENT: return createProgramElement();
      case RobustCollaborationPackage.EXTERNAL_NAME: return createExternalName();
      case RobustCollaborationPackage.SCOPE_DEFINING_ELEMENT: return createScopeDefiningElement();
      case RobustCollaborationPackage.LOCAL_TYPE: return createLocalType();
      case RobustCollaborationPackage.TYPE_DEF: return createTypeDef();
      case RobustCollaborationPackage.ENUM_DEF: return createEnumDef();
      case RobustCollaborationPackage.ENSEMBLE: return createEnsemble();
      case RobustCollaborationPackage.ROLE: return createRole();
      case RobustCollaborationPackage.MEMBER: return createMember();
      case RobustCollaborationPackage.FIELD: return createField();
      case RobustCollaborationPackage.REQUIRE: return createRequire();
      case RobustCollaborationPackage.BEHAVIOR: return createBehavior();
      case RobustCollaborationPackage.PARAMETER: return createParameter();
      case RobustCollaborationPackage.METHOD: return createMethod();
      case RobustCollaborationPackage.EXPR: return createExpr();
      case RobustCollaborationPackage.LOCAL_VARIABLE: return createLocalVariable();
      case RobustCollaborationPackage.QUALIFIED_NAME: return createQualifiedName();
      case RobustCollaborationPackage.BINARY_EXPR: return createBinaryExpr();
      case RobustCollaborationPackage.FUNCTION_CALL: return createFunctionCall();
      case RobustCollaborationPackage.STATEMENT: return createStatement();
      case RobustCollaborationPackage.CONDITIONAL: return createConditional();
      case RobustCollaborationPackage.OPERATION: return createOperation();
      case RobustCollaborationPackage.SELF_OPERATION: return createSelfOperation();
      case RobustCollaborationPackage.ASSIGNMENT: return createAssignment();
      case RobustCollaborationPackage.VALUE: return createValue();
      case RobustCollaborationPackage.UPDATE: return createUpdate();
      case RobustCollaborationPackage.CONSTANT_DEFINITION: return createConstantDefinition();
      case RobustCollaborationPackage.CONSTANT_ASSIGNMENT: return createConstantAssignment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProgramElement createProgramElement()
  {
    ProgramElementImpl programElement = new ProgramElementImpl();
    return programElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalName createExternalName()
  {
    ExternalNameImpl externalName = new ExternalNameImpl();
    return externalName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeDefiningElement createScopeDefiningElement()
  {
    ScopeDefiningElementImpl scopeDefiningElement = new ScopeDefiningElementImpl();
    return scopeDefiningElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalType createLocalType()
  {
    LocalTypeImpl localType = new LocalTypeImpl();
    return localType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef createTypeDef()
  {
    TypeDefImpl typeDef = new TypeDefImpl();
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDef createEnumDef()
  {
    EnumDefImpl enumDef = new EnumDefImpl();
    return enumDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ensemble createEnsemble()
  {
    EnsembleImpl ensemble = new EnsembleImpl();
    return ensemble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Require createRequire()
  {
    RequireImpl require = new RequireImpl();
    return require;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behavior createBehavior()
  {
    BehaviorImpl behavior = new BehaviorImpl();
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariable createLocalVariable()
  {
    LocalVariableImpl localVariable = new LocalVariableImpl();
    return localVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName createQualifiedName()
  {
    QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpr createBinaryExpr()
  {
    BinaryExprImpl binaryExpr = new BinaryExprImpl();
    return binaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional createConditional()
  {
    ConditionalImpl conditional = new ConditionalImpl();
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfOperation createSelfOperation()
  {
    SelfOperationImpl selfOperation = new SelfOperationImpl();
    return selfOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Update createUpdate()
  {
    UpdateImpl update = new UpdateImpl();
    return update;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinition createConstantDefinition()
  {
    ConstantDefinitionImpl constantDefinition = new ConstantDefinitionImpl();
    return constantDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantAssignment createConstantAssignment()
  {
    ConstantAssignmentImpl constantAssignment = new ConstantAssignmentImpl();
    return constantAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobustCollaborationPackage getRobustCollaborationPackage()
  {
    return (RobustCollaborationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RobustCollaborationPackage getPackage()
  {
    return RobustCollaborationPackage.eINSTANCE;
  }

} //RobustCollaborationFactoryImpl
