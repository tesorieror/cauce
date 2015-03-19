/**
 */
package ifmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ifmm.IfmmPackage
 * @generated
 */
public interface IfmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IfmmFactory eINSTANCE = ifmm.impl.IfmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Informaiton Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Informaiton Flow</em>'.
	 * @generated
	 */
	SystemInformaitonFlow createSystemInformaitonFlow();

	/**
	 * Returns a new object of class '<em>Context Aware Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Aware Entity</em>'.
	 * @generated
	 */
	ContextAwareEntity createContextAwareEntity();

	/**
	 * Returns a new object of class '<em>Point To Point Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point To Point Information Flow</em>'.
	 * @generated
	 */
	PointToPointInformationFlow createPointToPointInformationFlow();

	/**
	 * Returns a new object of class '<em>Broadcast Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broadcast Information Flow</em>'.
	 * @generated
	 */
	BroadcastInformationFlow createBroadcastInformationFlow();

	/**
	 * Returns a new object of class '<em>Output Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Data</em>'.
	 * @generated
	 */
	OutputData createOutputData();

	/**
	 * Returns a new object of class '<em>Input Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Data</em>'.
	 * @generated
	 */
	InputData createInputData();

	/**
	 * Returns a new object of class '<em>Entity To Broadcast Information Flow Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity To Broadcast Information Flow Edge</em>'.
	 * @generated
	 */
	EntityToBroadcastInformationFlowEdge createEntityToBroadcastInformationFlowEdge();

	/**
	 * Returns a new object of class '<em>Entity To Point To Point Information Flow Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity To Point To Point Information Flow Edge</em>'.
	 * @generated
	 */
	EntityToPointToPointInformationFlowEdge createEntityToPointToPointInformationFlowEdge();

	/**
	 * Returns a new object of class '<em>Broadcast Information Flow To Entity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broadcast Information Flow To Entity Edge</em>'.
	 * @generated
	 */
	BroadcastInformationFlowToEntityEdge createBroadcastInformationFlowToEntityEdge();

	/**
	 * Returns a new object of class '<em>Point To Point Information Flow To Entity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point To Point Information Flow To Entity Edge</em>'.
	 * @generated
	 */
	PointToPointInformationFlowToEntityEdge createPointToPointInformationFlowToEntityEdge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IfmmPackage getIfmmPackage();

} //IfmmFactory
