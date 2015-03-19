/**
 */
package ecmm.util;

import ecmm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecmm.EcmmPackage
 * @generated
 */
public class EcmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcmmPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected EcmmSwitch<Adapter> modelSwitch =
		new EcmmSwitch<Adapter>() {
			@Override
			public Adapter caseVariableDataDefinition(VariableDataDefinition object) {
				return createVariableDataDefinitionAdapter();
			}
			@Override
			public Adapter caseEntityContext(EntityContext object) {
				return createEntityContextAdapter();
			}
			@Override
			public Adapter caseContextSituation(ContextSituation object) {
				return createContextSituationAdapter();
			}
			@Override
			public Adapter caseContextCondition(ContextCondition object) {
				return createContextConditionAdapter();
			}
			@Override
			public Adapter caseContextMemory(ContextMemory object) {
				return createContextMemoryAdapter();
			}
			@Override
			public Adapter caseLogicMemory(LogicMemory object) {
				return createLogicMemoryAdapter();
			}
			@Override
			public Adapter caseDictionaryMemory(DictionaryMemory object) {
				return createDictionaryMemoryAdapter();
			}
			@Override
			public Adapter caseHolderMemory(HolderMemory object) {
				return createHolderMemoryAdapter();
			}
			@Override
			public Adapter caseStackMemory(StackMemory object) {
				return createStackMemoryAdapter();
			}
			@Override
			public Adapter caseTimeMemory(TimeMemory object) {
				return createTimeMemoryAdapter();
			}
			@Override
			public Adapter caseContextAction(ContextAction object) {
				return createContextActionAdapter();
			}
			@Override
			public Adapter caseSensingContextCondition(SensingContextCondition object) {
				return createSensingContextConditionAdapter();
			}
			@Override
			public Adapter caseMemoryContextCondition(MemoryContextCondition object) {
				return createMemoryContextConditionAdapter();
			}
			@Override
			public Adapter caseSystemContext(SystemContext object) {
				return createSystemContextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ecmm.VariableDataDefinition <em>Variable Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.VariableDataDefinition
	 * @generated
	 */
	public Adapter createVariableDataDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.EntityContext <em>Entity Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.EntityContext
	 * @generated
	 */
	public Adapter createEntityContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.ContextSituation <em>Context Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.ContextSituation
	 * @generated
	 */
	public Adapter createContextSituationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.ContextCondition <em>Context Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.ContextCondition
	 * @generated
	 */
	public Adapter createContextConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.ContextMemory <em>Context Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.ContextMemory
	 * @generated
	 */
	public Adapter createContextMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.LogicMemory <em>Logic Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.LogicMemory
	 * @generated
	 */
	public Adapter createLogicMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.DictionaryMemory <em>Dictionary Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.DictionaryMemory
	 * @generated
	 */
	public Adapter createDictionaryMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.HolderMemory <em>Holder Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.HolderMemory
	 * @generated
	 */
	public Adapter createHolderMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.StackMemory <em>Stack Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.StackMemory
	 * @generated
	 */
	public Adapter createStackMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.TimeMemory <em>Time Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.TimeMemory
	 * @generated
	 */
	public Adapter createTimeMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.ContextAction <em>Context Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.ContextAction
	 * @generated
	 */
	public Adapter createContextActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.SensingContextCondition <em>Sensing Context Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.SensingContextCondition
	 * @generated
	 */
	public Adapter createSensingContextConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.MemoryContextCondition <em>Memory Context Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.MemoryContextCondition
	 * @generated
	 */
	public Adapter createMemoryContextConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecmm.SystemContext <em>System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecmm.SystemContext
	 * @generated
	 */
	public Adapter createSystemContextAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EcmmAdapterFactory
