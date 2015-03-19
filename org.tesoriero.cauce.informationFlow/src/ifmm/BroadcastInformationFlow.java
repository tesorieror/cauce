/**
 */
package ifmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast Information Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifmm.BroadcastInformationFlow#getData <em>Data</em>}</li>
 *   <li>{@link ifmm.BroadcastInformationFlow#getSource <em>Source</em>}</li>
 *   <li>{@link ifmm.BroadcastInformationFlow#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifmm.IfmmPackage#getBroadcastInformationFlow()
 * @model
 * @generated
 */
public interface BroadcastInformationFlow extends InformationFlow {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link ifmm.OutputData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see ifmm.IfmmPackage#getBroadcastInformationFlow_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputData> getData();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifmm.EntityToBroadcastInformationFlowEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EntityToBroadcastInformationFlowEdge)
	 * @see ifmm.IfmmPackage#getBroadcastInformationFlow_Source()
	 * @see ifmm.EntityToBroadcastInformationFlowEdge#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	EntityToBroadcastInformationFlowEdge getSource();

	/**
	 * Sets the value of the '{@link ifmm.BroadcastInformationFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EntityToBroadcastInformationFlowEdge value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifmm.BroadcastInformationFlowToEntityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(BroadcastInformationFlowToEntityEdge)
	 * @see ifmm.IfmmPackage#getBroadcastInformationFlow_Target()
	 * @see ifmm.BroadcastInformationFlowToEntityEdge#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	BroadcastInformationFlowToEntityEdge getTarget();

	/**
	 * Sets the value of the '{@link ifmm.BroadcastInformationFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(BroadcastInformationFlowToEntityEdge value);

} // BroadcastInformationFlow
