/**
 */
package rsmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space To Entity Reference Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rsmm.SpaceToEntityReferenceDependency#getSystem <em>System</em>}</li>
 *   <li>{@link rsmm.SpaceToEntityReferenceDependency#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see rsmm.RsmmPackage#getSpaceToEntityReferenceDependency()
 * @model
 * @generated
 */
public interface SpaceToEntityReferenceDependency extends ReferenceDependency {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rsmm.SystemInformationFlowReferenceSpace#getSpaceToEntityReferenceDependencies <em>Space To Entity Reference Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(SystemInformationFlowReferenceSpace)
	 * @see rsmm.RsmmPackage#getSpaceToEntityReferenceDependency_System()
	 * @see rsmm.SystemInformationFlowReferenceSpace#getSpaceToEntityReferenceDependencies
	 * @model opposite="spaceToEntityReferenceDependencies" required="true" transient="false"
	 * @generated
	 */
	SystemInformationFlowReferenceSpace getSystem();

	/**
	 * Sets the value of the '{@link rsmm.SpaceToEntityReferenceDependency#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemInformationFlowReferenceSpace value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rsmm.ContextAwareEntityReference#getIncomingReferenceDependency <em>Incoming Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(ContextAwareEntityReference)
	 * @see rsmm.RsmmPackage#getSpaceToEntityReferenceDependency_Child()
	 * @see rsmm.ContextAwareEntityReference#getIncomingReferenceDependency
	 * @model opposite="incomingReferenceDependency" required="true"
	 * @generated
	 */
	ContextAwareEntityReference getChild();

	/**
	 * Sets the value of the '{@link rsmm.SpaceToEntityReferenceDependency#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ContextAwareEntityReference value);

} // SpaceToEntityReferenceDependency
