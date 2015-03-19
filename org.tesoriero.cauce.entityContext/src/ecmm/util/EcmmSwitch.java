/**
 */
package ecmm.util;

import ecmm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see ecmm.EcmmPackage
 * @generated
 */
public class EcmmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcmmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcmmSwitch() {
		if (modelPackage == null) {
			modelPackage = EcmmPackage.eINSTANCE;
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
			case EcmmPackage.VARIABLE_DATA_DEFINITION: {
				VariableDataDefinition variableDataDefinition = (VariableDataDefinition)theEObject;
				T result = caseVariableDataDefinition(variableDataDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.ENTITY_CONTEXT: {
				EntityContext entityContext = (EntityContext)theEObject;
				T result = caseEntityContext(entityContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.CONTEXT_SITUATION: {
				ContextSituation contextSituation = (ContextSituation)theEObject;
				T result = caseContextSituation(contextSituation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.CONTEXT_CONDITION: {
				ContextCondition contextCondition = (ContextCondition)theEObject;
				T result = caseContextCondition(contextCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.CONTEXT_MEMORY: {
				ContextMemory contextMemory = (ContextMemory)theEObject;
				T result = caseContextMemory(contextMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.LOGIC_MEMORY: {
				LogicMemory logicMemory = (LogicMemory)theEObject;
				T result = caseLogicMemory(logicMemory);
				if (result == null) result = caseContextMemory(logicMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.DICTIONARY_MEMORY: {
				DictionaryMemory dictionaryMemory = (DictionaryMemory)theEObject;
				T result = caseDictionaryMemory(dictionaryMemory);
				if (result == null) result = caseContextMemory(dictionaryMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.HOLDER_MEMORY: {
				HolderMemory holderMemory = (HolderMemory)theEObject;
				T result = caseHolderMemory(holderMemory);
				if (result == null) result = caseContextMemory(holderMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.STACK_MEMORY: {
				StackMemory stackMemory = (StackMemory)theEObject;
				T result = caseStackMemory(stackMemory);
				if (result == null) result = caseContextMemory(stackMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.TIME_MEMORY: {
				TimeMemory timeMemory = (TimeMemory)theEObject;
				T result = caseTimeMemory(timeMemory);
				if (result == null) result = caseContextMemory(timeMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.CONTEXT_ACTION: {
				ContextAction contextAction = (ContextAction)theEObject;
				T result = caseContextAction(contextAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.SENSING_CONTEXT_CONDITION: {
				SensingContextCondition sensingContextCondition = (SensingContextCondition)theEObject;
				T result = caseSensingContextCondition(sensingContextCondition);
				if (result == null) result = caseContextCondition(sensingContextCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.MEMORY_CONTEXT_CONDITION: {
				MemoryContextCondition memoryContextCondition = (MemoryContextCondition)theEObject;
				T result = caseMemoryContextCondition(memoryContextCondition);
				if (result == null) result = caseContextCondition(memoryContextCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcmmPackage.SYSTEM_CONTEXT: {
				SystemContext systemContext = (SystemContext)theEObject;
				T result = caseSystemContext(systemContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataDefinition(VariableDataDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityContext(EntityContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Situation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Situation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextSituation(ContextSituation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCondition(ContextCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextMemory(ContextMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicMemory(LogicMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dictionary Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dictionary Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDictionaryMemory(DictionaryMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Holder Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Holder Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHolderMemory(HolderMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackMemory(StackMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeMemory(TimeMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextAction(ContextAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensing Context Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensing Context Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingContextCondition(SensingContextCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Context Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Context Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryContextCondition(MemoryContextCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemContext(SystemContext object) {
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

} //EcmmSwitch
