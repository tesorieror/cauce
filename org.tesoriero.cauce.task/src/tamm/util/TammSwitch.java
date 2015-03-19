/**
 */
package tamm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tamm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tamm.TammPackage
 * @generated
 */
public class TammSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TammPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TammSwitch() {
		if (modelPackage == null) {
			modelPackage = TammPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TammPackage.CONTEXT_AWARE_SYSTEM: {
				ContextAwareSystem contextAwareSystem = (ContextAwareSystem)theEObject;
				T result = caseContextAwareSystem(contextAwareSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.SYSTEM_TASK: {
				SystemTask systemTask = (SystemTask)theEObject;
				T result = caseSystemTask(systemTask);
				if (result == null) result = caseTask(systemTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.ROUTE_TASK: {
				RouteTask routeTask = (RouteTask)theEObject;
				T result = caseRouteTask(routeTask);
				if (result == null) result = caseTask(routeTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.PRE_CONDITION: {
				PreCondition preCondition = (PreCondition)theEObject;
				T result = casePreCondition(preCondition);
				if (result == null) result = caseTaskOutputCondition(preCondition);
				if (result == null) result = caseCondition(preCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.POST_CONDITION: {
				PostCondition postCondition = (PostCondition)theEObject;
				T result = casePostCondition(postCondition);
				if (result == null) result = caseTaskInputCondition(postCondition);
				if (result == null) result = caseCondition(postCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.TASK_INPUT_CONDITION: {
				TaskInputCondition taskInputCondition = (TaskInputCondition)theEObject;
				T result = caseTaskInputCondition(taskInputCondition);
				if (result == null) result = caseCondition(taskInputCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.TASK_OUTPUT_CONDITION: {
				TaskOutputCondition taskOutputCondition = (TaskOutputCondition)theEObject;
				T result = caseTaskOutputCondition(taskOutputCondition);
				if (result == null) result = caseCondition(taskOutputCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.INITIAL_CONDITION: {
				InitialCondition initialCondition = (InitialCondition)theEObject;
				T result = caseInitialCondition(initialCondition);
				if (result == null) result = caseTaskInputCondition(initialCondition);
				if (result == null) result = caseCondition(initialCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.FINAL_CONDITION: {
				FinalCondition finalCondition = (FinalCondition)theEObject;
				T result = caseFinalCondition(finalCondition);
				if (result == null) result = caseTaskOutputCondition(finalCondition);
				if (result == null) result = caseCondition(finalCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseRouteTask(join);
				if (result == null) result = caseTask(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.SPLIT: {
				Split split = (Split)theEObject;
				T result = caseSplit(split);
				if (result == null) result = caseRouteTask(split);
				if (result == null) result = caseTask(split);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.SIMPLE_TASK: {
				SimpleTask simpleTask = (SimpleTask)theEObject;
				T result = caseSimpleTask(simpleTask);
				if (result == null) result = caseSystemTask(simpleTask);
				if (result == null) result = caseTask(simpleTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.SKIP_TASK: {
				SkipTask skipTask = (SkipTask)theEObject;
				T result = caseSkipTask(skipTask);
				if (result == null) result = caseSystemTask(skipTask);
				if (result == null) result = caseTask(skipTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.INPUT_CONDITION_TO_ROUTE_TASK: {
				InputConditionToRouteTask inputConditionToRouteTask = (InputConditionToRouteTask)theEObject;
				T result = caseInputConditionToRouteTask(inputConditionToRouteTask);
				if (result == null) result = caseEdge(inputConditionToRouteTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.ROUTE_TASK_TO_OUTPUT_CONDITION: {
				RouteTaskToOutputCondition routeTaskToOutputCondition = (RouteTaskToOutputCondition)theEObject;
				T result = caseRouteTaskToOutputCondition(routeTaskToOutputCondition);
				if (result == null) result = caseEdge(routeTaskToOutputCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK: {
				PreConditionToSystemTask preConditionToSystemTask = (PreConditionToSystemTask)theEObject;
				T result = casePreConditionToSystemTask(preConditionToSystemTask);
				if (result == null) result = caseEdge(preConditionToSystemTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.SYSTEM_TASK_TO_POST_CONDITION: {
				SystemTaskToPostCondition systemTaskToPostCondition = (SystemTaskToPostCondition)theEObject;
				T result = caseSystemTaskToPostCondition(systemTaskToPostCondition);
				if (result == null) result = caseEdge(systemTaskToPostCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.AND_JOIN: {
				AndJoin andJoin = (AndJoin)theEObject;
				T result = caseAndJoin(andJoin);
				if (result == null) result = caseJoin(andJoin);
				if (result == null) result = caseRouteTask(andJoin);
				if (result == null) result = caseTask(andJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.OR_JOIN: {
				OrJoin orJoin = (OrJoin)theEObject;
				T result = caseOrJoin(orJoin);
				if (result == null) result = caseJoin(orJoin);
				if (result == null) result = caseRouteTask(orJoin);
				if (result == null) result = caseTask(orJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.AND_SPLIT: {
				AndSplit andSplit = (AndSplit)theEObject;
				T result = caseAndSplit(andSplit);
				if (result == null) result = caseSplit(andSplit);
				if (result == null) result = caseRouteTask(andSplit);
				if (result == null) result = caseTask(andSplit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.OR_SPLIT: {
				OrSplit orSplit = (OrSplit)theEObject;
				T result = caseOrSplit(orSplit);
				if (result == null) result = caseSplit(orSplit);
				if (result == null) result = caseRouteTask(orSplit);
				if (result == null) result = caseTask(orSplit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK: {
				InputConditionToJoinTask inputConditionToJoinTask = (InputConditionToJoinTask)theEObject;
				T result = caseInputConditionToJoinTask(inputConditionToJoinTask);
				if (result == null) result = caseInputConditionToRouteTask(inputConditionToJoinTask);
				if (result == null) result = caseEdge(inputConditionToJoinTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.INPUT_CONDITION_TO_SPLIT_TASK: {
				InputConditionToSplitTask inputConditionToSplitTask = (InputConditionToSplitTask)theEObject;
				T result = caseInputConditionToSplitTask(inputConditionToSplitTask);
				if (result == null) result = caseInputConditionToRouteTask(inputConditionToSplitTask);
				if (result == null) result = caseEdge(inputConditionToSplitTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION: {
				JoinTaskToOutputCondition joinTaskToOutputCondition = (JoinTaskToOutputCondition)theEObject;
				T result = caseJoinTaskToOutputCondition(joinTaskToOutputCondition);
				if (result == null) result = caseRouteTaskToOutputCondition(joinTaskToOutputCondition);
				if (result == null) result = caseEdge(joinTaskToOutputCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TammPackage.SPLIT_TASK_TO_OUTPUT_CONDITION: {
				SplitTaskToOutputCondition splitTaskToOutputCondition = (SplitTaskToOutputCondition)theEObject;
				T result = caseSplitTaskToOutputCondition(splitTaskToOutputCondition);
				if (result == null) result = caseRouteTaskToOutputCondition(splitTaskToOutputCondition);
				if (result == null) result = caseEdge(splitTaskToOutputCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Aware System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Aware System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextAwareSystem(ContextAwareSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemTask(SystemTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteTask(RouteTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreCondition(PreCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostCondition(PostCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Input Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Input Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInputCondition(TaskInputCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Output Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Output Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskOutputCondition(TaskOutputCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialCondition(InitialCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalCondition(FinalCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplit(Split object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTask(SimpleTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skip Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skip Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkipTask(SkipTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Condition To Route Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Condition To Route Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputConditionToRouteTask(InputConditionToRouteTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Task To Output Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Task To Output Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteTaskToOutputCondition(RouteTaskToOutputCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Condition To System Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Condition To System Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreConditionToSystemTask(PreConditionToSystemTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Task To Post Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Task To Post Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemTaskToPostCondition(SystemTaskToPostCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndJoin(AndJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrJoin(OrJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndSplit(AndSplit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrSplit(OrSplit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Condition To Join Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Condition To Join Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputConditionToJoinTask(InputConditionToJoinTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Condition To Split Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Condition To Split Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputConditionToSplitTask(InputConditionToSplitTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Task To Output Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Task To Output Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinTaskToOutputCondition(JoinTaskToOutputCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Task To Output Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Task To Output Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitTaskToOutputCondition(SplitTaskToOutputCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TammSwitch
