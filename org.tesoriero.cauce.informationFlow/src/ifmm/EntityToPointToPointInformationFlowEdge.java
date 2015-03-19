/**
 */
package ifmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity To Point To Point Information Flow Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifmm.EntityToPointToPointInformationFlowEdge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifmm.IfmmPackage#getEntityToPointToPointInformationFlowEdge()
 * @model
 * @generated
 */
public interface EntityToPointToPointInformationFlowEdge extends EntityToInformationFlowEdge {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifmm.PointToPointInformationFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PointToPointInformationFlow)
	 * @see ifmm.IfmmPackage#getEntityToPointToPointInformationFlowEdge_Target()
	 * @see ifmm.PointToPointInformationFlow#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	PointToPointInformationFlow getTarget();

	/**
	 * Sets the value of the '{@link ifmm.EntityToPointToPointInformationFlowEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PointToPointInformationFlow value);

} // EntityToPointToPointInformationFlowEdge
