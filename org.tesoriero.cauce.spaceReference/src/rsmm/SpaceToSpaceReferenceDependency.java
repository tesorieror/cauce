/**
 */
package rsmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space To Space Reference Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rsmm.SpaceToSpaceReferenceDependency#getSystem <em>System</em>}</li>
 *   <li>{@link rsmm.SpaceToSpaceReferenceDependency#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see rsmm.RsmmPackage#getSpaceToSpaceReferenceDependency()
 * @model
 * @generated
 */
public interface SpaceToSpaceReferenceDependency extends ReferenceDependency {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rsmm.SystemInformationFlowReferenceSpace#getSpaceToSpaceReferenceDependencies <em>Space To Space Reference Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(SystemInformationFlowReferenceSpace)
	 * @see rsmm.RsmmPackage#getSpaceToSpaceReferenceDependency_System()
	 * @see rsmm.SystemInformationFlowReferenceSpace#getSpaceToSpaceReferenceDependencies
	 * @model opposite="spaceToSpaceReferenceDependencies" required="true" transient="false"
	 * @generated
	 */
	SystemInformationFlowReferenceSpace getSystem();

	/**
	 * Sets the value of the '{@link rsmm.SpaceToSpaceReferenceDependency#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemInformationFlowReferenceSpace value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rsmm.ReferentialSpace#getIncomingReferenceDependency <em>Incoming Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(ReferentialSpace)
	 * @see rsmm.RsmmPackage#getSpaceToSpaceReferenceDependency_Child()
	 * @see rsmm.ReferentialSpace#getIncomingReferenceDependency
	 * @model opposite="incomingReferenceDependency" required="true"
	 * @generated
	 */
	ReferentialSpace getChild();

	/**
	 * Sets the value of the '{@link rsmm.SpaceToSpaceReferenceDependency#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ReferentialSpace value);

} // SpaceToSpaceReferenceDependency
