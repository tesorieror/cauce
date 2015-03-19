/**
 */
package ifmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity To Information Flow Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifmm.EntityToInformationFlowEdge#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifmm.IfmmPackage#getEntityToInformationFlowEdge()
 * @model abstract="true"
 * @generated
 */
public interface EntityToInformationFlowEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifmm.ContextAwareEntity#getOngoingInformationFlows <em>Ongoing Information Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ContextAwareEntity)
	 * @see ifmm.IfmmPackage#getEntityToInformationFlowEdge_Source()
	 * @see ifmm.ContextAwareEntity#getOngoingInformationFlows
	 * @model opposite="ongoingInformationFlows" required="true"
	 * @generated
	 */
	ContextAwareEntity getSource();

	/**
	 * Sets the value of the '{@link ifmm.EntityToInformationFlowEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ContextAwareEntity value);

} // EntityToInformationFlowEdge
