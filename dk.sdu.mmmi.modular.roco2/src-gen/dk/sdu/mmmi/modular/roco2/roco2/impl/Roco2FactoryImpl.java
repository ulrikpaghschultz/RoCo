/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2.impl;

import dk.sdu.mmmi.modular.roco2.roco2.*;

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
public class Roco2FactoryImpl extends EFactoryImpl implements Roco2Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Roco2Factory init()
  {
    try
    {
      Roco2Factory theRoco2Factory = (Roco2Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.sdu.dk/mmmi/modular/roco2/Roco2"); 
      if (theRoco2Factory != null)
      {
        return theRoco2Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Roco2FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Roco2FactoryImpl()
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
      case Roco2Package.PROGRAM: return createProgram();
      case Roco2Package.EXTERNAL_NAME: return createExternalName();
      case Roco2Package.LOCAL_TYPE: return createLocalType();
      case Roco2Package.SCOPE_DEFINING_ELEMENT: return createScopeDefiningElement();
      case Roco2Package.TYPE_DEF: return createTypeDef();
      case Roco2Package.ENUM_DEF: return createEnumDef();
      case Roco2Package.ENSEMBLE: return createEnsemble();
      case Roco2Package.ROLE: return createRole();
      case Roco2Package.MEMBER: return createMember();
      case Roco2Package.FIELD: return createField();
      case Roco2Package.REQUIRE: return createRequire();
      case Roco2Package.BEHAVIOR: return createBehavior();
      case Roco2Package.PARAMETER: return createParameter();
      case Roco2Package.METHOD: return createMethod();
      case Roco2Package.EXPR: return createExpr();
      case Roco2Package.LOCAL_VARIABLE: return createLocalVariable();
      case Roco2Package.INTERNAL_QUALIFIED_NAME: return createInternalQualifiedName();
      case Roco2Package.BINARY_EXPR: return createBinaryExpr();
      case Roco2Package.FUNCTION_CALL: return createFunctionCall();
      case Roco2Package.STATEMENT: return createStatement();
      case Roco2Package.BASIC_STATEMENT: return createBasicStatement();
      case Roco2Package.FOR_LOOP: return createForLoop();
      case Roco2Package.CONDITIONAL: return createConditional();
      case Roco2Package.QUALIFIED_STATEMENT: return createQualifiedStatement();
      case Roco2Package.OPERATION_ACTIVATION: return createOperationActivation();
      case Roco2Package.OPERATION_INHIBIT: return createOperationInhibit();
      case Roco2Package.MODULE_CONDITIONAL: return createModuleConditional();
      case Roco2Package.OPERATION: return createOperation();
      case Roco2Package.ASSIGNMENT: return createAssignment();
      case Roco2Package.VALUE: return createValue();
      case Roco2Package.UPDATE: return createUpdate();
      case Roco2Package.CONSTANT_DEFINITION: return createConstantDefinition();
      case Roco2Package.CONSTANT_ASSIGNMENT: return createConstantAssignment();
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
  public InternalQualifiedName createInternalQualifiedName()
  {
    InternalQualifiedNameImpl internalQualifiedName = new InternalQualifiedNameImpl();
    return internalQualifiedName;
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
  public BasicStatement createBasicStatement()
  {
    BasicStatementImpl basicStatement = new BasicStatementImpl();
    return basicStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForLoop createForLoop()
  {
    ForLoopImpl forLoop = new ForLoopImpl();
    return forLoop;
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
  public QualifiedStatement createQualifiedStatement()
  {
    QualifiedStatementImpl qualifiedStatement = new QualifiedStatementImpl();
    return qualifiedStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationActivation createOperationActivation()
  {
    OperationActivationImpl operationActivation = new OperationActivationImpl();
    return operationActivation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationInhibit createOperationInhibit()
  {
    OperationInhibitImpl operationInhibit = new OperationInhibitImpl();
    return operationInhibit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleConditional createModuleConditional()
  {
    ModuleConditionalImpl moduleConditional = new ModuleConditionalImpl();
    return moduleConditional;
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
  public Roco2Package getRoco2Package()
  {
    return (Roco2Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Roco2Package getPackage()
  {
    return Roco2Package.eINSTANCE;
  }

} //Roco2FactoryImpl
