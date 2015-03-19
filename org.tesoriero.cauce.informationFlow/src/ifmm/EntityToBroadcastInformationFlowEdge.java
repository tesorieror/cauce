/**
 */
package ifmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity To Broadcast Information Flow Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifmm.EntityToBroadcastInformationFlowEdge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifmm.IfmmPackage#getEntityToBroadcastInformationFlowEdge()
 * @model
 * @generated
 */
public interface EntityToBroadcastInformationFlowEdge extends EntityToInformationFlowEdge {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifmm.BroadcastInformationFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(BroadcastInformationFlow)
	 * @see ifmm.IfmmPackage#getEntityToBroadcastInformationFlowEdge_Target()
	 * @see ifmm.BroadcastInformationFlow#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	BroadcastInformationFlow getTarget();

	/**
	 * Sets the value of the '{@link ifmm.EntityToBroadcastInformationFlowEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(BroadcastInformationFlow value);

} // EntityToBroadcastInformationFlowEdge
