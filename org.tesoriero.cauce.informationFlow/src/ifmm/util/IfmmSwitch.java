/**
 */
package ifmm.util;

import ifmm.*;

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
 * @see ifmm.IfmmPackage
 * @generated
 */
public class IfmmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IfmmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfmmSwitch() {
		if (modelPackage == null) {
			modelPackage = IfmmPackage.eINSTANCE;
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
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW: {
				SystemInformaitonFlow systemInformaitonFlow = (SystemInformaitonFlow)theEObject;
				T result = caseSystemInformaitonFlow(systemInformaitonFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.CONTEXT_AWARE_ENTITY: {
				ContextAwareEntity contextAwareEntity = (ContextAwareEntity)theEObject;
				T result = caseContextAwareEntity(contextAwareEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.INFORMATION_FLOW: {
				InformationFlow informationFlow = (InformationFlow)theEObject;
				T result = caseInformationFlow(informationFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW: {
				PointToPointInformationFlow pointToPointInformationFlow = (PointToPointInformationFlow)theEObject;
				T result = casePointToPointInformationFlow(pointToPointInformationFlow);
				if (result == null) result = caseInformationFlow(pointToPointInformationFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.BROADCAST_INFORMATION_FLOW: {
				BroadcastInformationFlow broadcastInformationFlow = (BroadcastInformationFlow)theEObject;
				T result = caseBroadcastInformationFlow(broadcastInformationFlow);
				if (result == null) result = caseInformationFlow(broadcastInformationFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.OUTPUT_DATA: {
				OutputData outputData = (OutputData)theEObject;
				T result = caseOutputData(outputData);
				if (result == null) result = caseData(outputData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.INPUT_DATA: {
				InputData inputData = (InputData)theEObject;
				T result = caseInputData(inputData);
				if (result == null) result = caseData(inputData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.INFORMATION_FLOW_TO_ENTITY_EDGE: {
				InformationFlowToEntityEdge informationFlowToEntityEdge = (InformationFlowToEntityEdge)theEObject;
				T result = caseInformationFlowToEntityEdge(informationFlowToEntityEdge);
				if (result == null) result = caseEdge(informationFlowToEntityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.ENTITY_TO_INFORMATION_FLOW_EDGE: {
				EntityToInformationFlowEdge entityToInformationFlowEdge = (EntityToInformationFlowEdge)theEObject;
				T result = caseEntityToInformationFlowEdge(entityToInformationFlowEdge);
				if (result == null) result = caseEdge(entityToInformationFlowEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE: {
				EntityToBroadcastInformationFlowEdge entityToBroadcastInformationFlowEdge = (EntityToBroadcastInformationFlowEdge)theEObject;
				T result = caseEntityToBroadcastInformationFlowEdge(entityToBroadcastInformationFlowEdge);
				if (result == null) result = caseEntityToInformationFlowEdge(entityToBroadcastInformationFlowEdge);
				if (result == null) result = caseEdge(entityToBroadcastInformationFlowEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE: {
				EntityToPointToPointInformationFlowEdge entityToPointToPointInformationFlowEdge = (EntityToPointToPointInformationFlowEdge)theEObject;
				T result = caseEntityToPointToPointInformationFlowEdge(entityToPointToPointInformationFlowEdge);
				if (result == null) result = caseEntityToInformationFlowEdge(entityToPointToPointInformationFlowEdge);
				if (result == null) result = caseEdge(entityToPointToPointInformationFlowEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE: {
				BroadcastInformationFlowToEntityEdge broadcastInformationFlowToEntityEdge = (BroadcastInformationFlowToEntityEdge)theEObject;
				T result = caseBroadcastInformationFlowToEntityEdge(broadcastInformationFlowToEntityEdge);
				if (result == null) result = caseInformationFlowToEntityEdge(broadcastInformationFlowToEntityEdge);
				if (result == null) result = caseEdge(broadcastInformationFlowToEntityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE: {
				PointToPointInformationFlowToEntityEdge pointToPointInformationFlowToEntityEdge = (PointToPointInformationFlowToEntityEdge)theEObject;
				T result = casePointToPointInformationFlowToEntityEdge(pointToPointInformationFlowToEntityEdge);
				if (result == null) result = caseInformationFlowToEntityEdge(pointToPointInformationFlowToEntityEdge);
				if (result == null) result = caseEdge(pointToPointInformationFlowToEntityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Informaiton Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Informaiton Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemInformaitonFlow(SystemInformaitonFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Aware Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Aware Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextAwareEntity(ContextAwareEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationFlow(InformationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point To Point Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point To Point Information Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointToPointInformationFlow(PointToPointInformationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast Information Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadcastInformationFlow(BroadcastInformationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputData(OutputData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputData(InputData object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Information Flow To Entity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Flow To Entity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationFlowToEntityEdge(InformationFlowToEntityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity To Information Flow Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity To Information Flow Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityToInformationFlowEdge(EntityToInformationFlowEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity To Broadcast Information Flow Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity To Broadcast Information Flow Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityToBroadcastInformationFlowEdge(EntityToBroadcastInformationFlowEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity To Point To Point Information Flow Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity To Point To Point Information Flow Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityToPointToPointInformationFlowEdge(EntityToPointToPointInformationFlowEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast Information Flow To Entity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast Information Flow To Entity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadcastInformationFlowToEntityEdge(BroadcastInformationFlowToEntityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point To Point Information Flow To Entity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point To Point Information Flow To Entity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointToPointInformationFlowToEntityEdge(PointToPointInformationFlowToEntityEdge object) {
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

} //IfmmSwitch
