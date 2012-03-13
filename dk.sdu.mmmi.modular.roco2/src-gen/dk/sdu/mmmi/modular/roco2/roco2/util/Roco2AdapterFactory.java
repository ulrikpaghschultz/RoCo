/**
 * <copyright>
 * </copyright>
 *
 */
package dk.sdu.mmmi.modular.roco2.roco2.util;

import dk.sdu.mmmi.modular.roco2.roco2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.modular.roco2.roco2.Roco2Package
 * @generated
 */
public class Roco2AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Roco2Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Roco2AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Roco2Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Roco2Switch<Adapter> modelSwitch =
    new Roco2Switch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseExternalName(ExternalName object)
      {
        return createExternalNameAdapter();
      }
      @Override
      public Adapter caseLocalType(LocalType object)
      {
        return createLocalTypeAdapter();
      }
      @Override
      public Adapter caseScopeDefiningElement(ScopeDefiningElement object)
      {
        return createScopeDefiningElementAdapter();
      }
      @Override
      public Adapter caseTypeDef(TypeDef object)
      {
        return createTypeDefAdapter();
      }
      @Override
      public Adapter caseEnumDef(EnumDef object)
      {
        return createEnumDefAdapter();
      }
      @Override
      public Adapter caseEnsemble(Ensemble object)
      {
        return createEnsembleAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseRequire(Require object)
      {
        return createRequireAdapter();
      }
      @Override
      public Adapter caseBehavior(Behavior object)
      {
        return createBehaviorAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseLocalVariable(LocalVariable object)
      {
        return createLocalVariableAdapter();
      }
      @Override
      public Adapter caseInternalQualifiedName(InternalQualifiedName object)
      {
        return createInternalQualifiedNameAdapter();
      }
      @Override
      public Adapter caseBinaryExpr(BinaryExpr object)
      {
        return createBinaryExprAdapter();
      }
      @Override
      public Adapter caseFunctionCall(FunctionCall object)
      {
        return createFunctionCallAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseBasicStatement(BasicStatement object)
      {
        return createBasicStatementAdapter();
      }
      @Override
      public Adapter caseForLoop(ForLoop object)
      {
        return createForLoopAdapter();
      }
      @Override
      public Adapter caseConditional(Conditional object)
      {
        return createConditionalAdapter();
      }
      @Override
      public Adapter caseQualifiedStatement(QualifiedStatement object)
      {
        return createQualifiedStatementAdapter();
      }
      @Override
      public Adapter caseOperationActivation(OperationActivation object)
      {
        return createOperationActivationAdapter();
      }
      @Override
      public Adapter caseOperationInhibit(OperationInhibit object)
      {
        return createOperationInhibitAdapter();
      }
      @Override
      public Adapter caseModuleConditional(ModuleConditional object)
      {
        return createModuleConditionalAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseUpdate(Update object)
      {
        return createUpdateAdapter();
      }
      @Override
      public Adapter caseConstantDefinition(ConstantDefinition object)
      {
        return createConstantDefinitionAdapter();
      }
      @Override
      public Adapter caseConstantAssignment(ConstantAssignment object)
      {
        return createConstantAssignmentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.ExternalName <em>External Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ExternalName
   * @generated
   */
  public Adapter createExternalNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.LocalType <em>Local Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.LocalType
   * @generated
   */
  public Adapter createLocalTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.ScopeDefiningElement <em>Scope Defining Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ScopeDefiningElement
   * @generated
   */
  public Adapter createScopeDefiningElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.TypeDef
   * @generated
   */
  public Adapter createTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.EnumDef <em>Enum Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.EnumDef
   * @generated
   */
  public Adapter createEnumDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Ensemble <em>Ensemble</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Ensemble
   * @generated
   */
  public Adapter createEnsembleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Require <em>Require</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Require
   * @generated
   */
  public Adapter createRequireAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Behavior
   * @generated
   */
  public Adapter createBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.LocalVariable
   * @generated
   */
  public Adapter createLocalVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.InternalQualifiedName <em>Internal Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.InternalQualifiedName
   * @generated
   */
  public Adapter createInternalQualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr <em>Binary Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.BinaryExpr
   * @generated
   */
  public Adapter createBinaryExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.FunctionCall
   * @generated
   */
  public Adapter createFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.BasicStatement <em>Basic Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.BasicStatement
   * @generated
   */
  public Adapter createBasicStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.ForLoop <em>For Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ForLoop
   * @generated
   */
  public Adapter createForLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Conditional
   * @generated
   */
  public Adapter createConditionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement <em>Qualified Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.QualifiedStatement
   * @generated
   */
  public Adapter createQualifiedStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.OperationActivation <em>Operation Activation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.OperationActivation
   * @generated
   */
  public Adapter createOperationActivationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.OperationInhibit <em>Operation Inhibit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.OperationInhibit
   * @generated
   */
  public Adapter createOperationInhibitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.ModuleConditional <em>Module Conditional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ModuleConditional
   * @generated
   */
  public Adapter createModuleConditionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.Update <em>Update</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.Update
   * @generated
   */
  public Adapter createUpdateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ConstantDefinition
   * @generated
   */
  public Adapter createConstantDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment <em>Constant Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.modular.roco2.roco2.ConstantAssignment
   * @generated
   */
  public Adapter createConstantAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Roco2AdapterFactory
