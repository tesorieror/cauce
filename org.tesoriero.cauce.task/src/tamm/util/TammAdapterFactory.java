/**
 */
package tamm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tamm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tamm.TammPackage
 * @generated
 */
public class TammAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TammPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TammAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TammPackage.eINSTANCE;
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
	protected TammSwitch<Adapter> modelSwitch =
		new TammSwitch<Adapter>() {
			@Override
			public Adapter caseContextAwareSystem(ContextAwareSystem object) {
				return createContextAwareSystemAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseSystemTask(SystemTask object) {
				return createSystemTaskAdapter();
			}
			@Override
			public Adapter caseRouteTask(RouteTask object) {
				return createRouteTaskAdapter();
			}
			@Override
			public Adapter casePreCondition(PreCondition object) {
				return createPreConditionAdapter();
			}
			@Override
			public Adapter casePostCondition(PostCondition object) {
				return createPostConditionAdapter();
			}
			@Override
			public Adapter caseTaskInputCondition(TaskInputCondition object) {
				return createTaskInputConditionAdapter();
			}
			@Override
			public Adapter caseTaskOutputCondition(TaskOutputCondition object) {
				return createTaskOutputConditionAdapter();
			}
			@Override
			public Adapter caseInitialCondition(InitialCondition object) {
				return createInitialConditionAdapter();
			}
			@Override
			public Adapter caseFinalCondition(FinalCondition object) {
				return createFinalConditionAdapter();
			}
			@Override
			public Adapter caseJoin(Join object) {
				return createJoinAdapter();
			}
			@Override
			public Adapter caseSplit(Split object) {
				return createSplitAdapter();
			}
			@Override
			public Adapter caseSimpleTask(SimpleTask object) {
				return createSimpleTaskAdapter();
			}
			@Override
			public Adapter caseSkipTask(SkipTask object) {
				return createSkipTaskAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseInputConditionToRouteTask(InputConditionToRouteTask object) {
				return createInputConditionToRouteTaskAdapter();
			}
			@Override
			public Adapter caseRouteTaskToOutputCondition(RouteTaskToOutputCondition object) {
				return createRouteTaskToOutputConditionAdapter();
			}
			@Override
			public Adapter casePreConditionToSystemTask(PreConditionToSystemTask object) {
				return createPreConditionToSystemTaskAdapter();
			}
			@Override
			public Adapter caseSystemTaskToPostCondition(SystemTaskToPostCondition object) {
				return createSystemTaskToPostConditionAdapter();
			}
			@Override
			public Adapter caseAndJoin(AndJoin object) {
				return createAndJoinAdapter();
			}
			@Override
			public Adapter caseOrJoin(OrJoin object) {
				return createOrJoinAdapter();
			}
			@Override
			public Adapter caseAndSplit(AndSplit object) {
				return createAndSplitAdapter();
			}
			@Override
			public Adapter caseOrSplit(OrSplit object) {
				return createOrSplitAdapter();
			}
			@Override
			public Adapter caseInputConditionToJoinTask(InputConditionToJoinTask object) {
				return createInputConditionToJoinTaskAdapter();
			}
			@Override
			public Adapter caseInputConditionToSplitTask(InputConditionToSplitTask object) {
				return createInputConditionToSplitTaskAdapter();
			}
			@Override
			public Adapter caseJoinTaskToOutputCondition(JoinTaskToOutputCondition object) {
				return createJoinTaskToOutputConditionAdapter();
			}
			@Override
			public Adapter caseSplitTaskToOutputCondition(SplitTaskToOutputCondition object) {
				return createSplitTaskToOutputConditionAdapter();
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
	 * Creates a new adapter for an object of class '{@link tamm.ContextAwareSystem <em>Context Aware System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.ContextAwareSystem
	 * @generated
	 */
	public Adapter createContextAwareSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.SystemTask <em>System Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.SystemTask
	 * @generated
	 */
	public Adapter createSystemTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.RouteTask <em>Route Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.RouteTask
	 * @generated
	 */
	public Adapter createRouteTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.PreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.PreCondition
	 * @generated
	 */
	public Adapter createPreConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.PostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.PostCondition
	 * @generated
	 */
	public Adapter createPostConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.TaskInputCondition <em>Task Input Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.TaskInputCondition
	 * @generated
	 */
	public Adapter createTaskInputConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.TaskOutputCondition <em>Task Output Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.TaskOutputCondition
	 * @generated
	 */
	public Adapter createTaskOutputConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.InitialCondition <em>Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.InitialCondition
	 * @generated
	 */
	public Adapter createInitialConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.FinalCondition <em>Final Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.FinalCondition
	 * @generated
	 */
	public Adapter createFinalConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.Split
	 * @generated
	 */
	public Adapter createSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.SimpleTask <em>Simple Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.SimpleTask
	 * @generated
	 */
	public Adapter createSimpleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.SkipTask <em>Skip Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.SkipTask
	 * @generated
	 */
	public Adapter createSkipTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.InputConditionToRouteTask <em>Input Condition To Route Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.InputConditionToRouteTask
	 * @generated
	 */
	public Adapter createInputConditionToRouteTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.RouteTaskToOutputCondition <em>Route Task To Output Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.RouteTaskToOutputCondition
	 * @generated
	 */
	public Adapter createRouteTaskToOutputConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.PreConditionToSystemTask <em>Pre Condition To System Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.PreConditionToSystemTask
	 * @generated
	 */
	public Adapter createPreConditionToSystemTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.SystemTaskToPostCondition <em>System Task To Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.SystemTaskToPostCondition
	 * @generated
	 */
	public Adapter createSystemTaskToPostConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.AndJoin <em>And Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.AndJoin
	 * @generated
	 */
	public Adapter createAndJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.OrJoin <em>Or Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.OrJoin
	 * @generated
	 */
	public Adapter createOrJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.AndSplit <em>And Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.AndSplit
	 * @generated
	 */
	public Adapter createAndSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.OrSplit <em>Or Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.OrSplit
	 * @generated
	 */
	public Adapter createOrSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.InputConditionToJoinTask <em>Input Condition To Join Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.InputConditionToJoinTask
	 * @generated
	 */
	public Adapter createInputConditionToJoinTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.InputConditionToSplitTask <em>Input Condition To Split Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.InputConditionToSplitTask
	 * @generated
	 */
	public Adapter createInputConditionToSplitTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.JoinTaskToOutputCondition <em>Join Task To Output Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.JoinTaskToOutputCondition
	 * @generated
	 */
	public Adapter createJoinTaskToOutputConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tamm.SplitTaskToOutputCondition <em>Split Task To Output Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tamm.SplitTaskToOutputCondition
	 * @generated
	 */
	public Adapter createSplitTaskToOutputConditionAdapter() {
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

} //TammAdapterFactory
