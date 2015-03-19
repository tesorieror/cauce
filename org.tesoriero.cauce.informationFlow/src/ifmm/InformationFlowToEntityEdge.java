/**
 */
package ifmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow To Entity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifmm.InformationFlowToEntityEdge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifmm.IfmmPackage#getInformationFlowToEntityEdge()
 * @model abstract="true"
 * @generated
 */
public interface InformationFlowToEntityEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifmm.ContextAwareEntity#getIncomingInformationFlows <em>Incoming Information Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ContextAwareEntity)
	 * @see ifmm.IfmmPackage#getInformationFlowToEntityEdge_Target()
	 * @see ifmm.ContextAwareEntity#getIncomingInformationFlows
	 * @model opposite="incomingInformationFlows" required="true"
	 * @generated
	 */
	ContextAwareEntity getTarget();

	/**
	 * Sets the value of the '{@link ifmm.InformationFlowToEntityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ContextAwareEntity value);

} // InformationFlowToEntityEdge
