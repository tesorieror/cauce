/**
 */
package ifmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast Information Flow To Entity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifmm.BroadcastInformationFlowToEntityEdge#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifmm.IfmmPackage#getBroadcastInformationFlowToEntityEdge()
 * @model
 * @generated
 */
public interface BroadcastInformationFlowToEntityEdge extends InformationFlowToEntityEdge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifmm.BroadcastInformationFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(BroadcastInformationFlow)
	 * @see ifmm.IfmmPackage#getBroadcastInformationFlowToEntityEdge_Source()
	 * @see ifmm.BroadcastInformationFlow#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	BroadcastInformationFlow getSource();

	/**
	 * Sets the value of the '{@link ifmm.BroadcastInformationFlowToEntityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(BroadcastInformationFlow value);

} // BroadcastInformationFlowToEntityEdge
