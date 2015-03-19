/**
 */
package rsmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referential Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rsmm.ReferentialSpace#getName <em>Name</em>}</li>
 *   <li>{@link rsmm.ReferentialSpace#getSystem <em>System</em>}</li>
 *   <li>{@link rsmm.ReferentialSpace#getOngoingReferenceDependencies <em>Ongoing Reference Dependencies</em>}</li>
 *   <li>{@link rsmm.ReferentialSpace#getIncomingReferenceDependency <em>Incoming Reference Dependency</em>}</li>
 *   <li>{@link rsmm.ReferentialSpace#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see rsmm.RsmmPackage#getReferentialSpace()
 * @model
 * @generated
 */
public interface ReferentialSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rsmm.RsmmPackage#getReferentialSpace_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rsmm.ReferentialSpace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rsmm.SystemInformationFlowReferenceSpace#getReferentialSpaces <em>Referential Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(SystemInformationFlowReferenceSpace)
	 * @see rsmm.RsmmPackage#getReferentialSpace_System()
	 * @see rsmm.SystemInformationFlowReferenceSpace#getReferentialSpaces
	 * @model opposite="referentialSpaces" required="true" transient="false"
	 * @generated
	 */
	SystemInformationFlowReferenceSpace getSystem();

	/**
	 * Sets the value of the '{@link rsmm.ReferentialSpace#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemInformationFlowReferenceSpace value);

	/**
	 * Returns the value of the '<em><b>Ongoing Reference Dependencies</b></em>' reference list.
	 * The list contents are of type {@link rsmm.ReferenceDependency}.
	 * It is bidirectional and its opposite is '{@link rsmm.ReferenceDependency#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ongoing Reference Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ongoing Reference Dependencies</em>' reference list.
	 * @see rsmm.RsmmPackage#getReferentialSpace_OngoingReferenceDependencies()
	 * @see rsmm.ReferenceDependency#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<ReferenceDependency> getOngoingReferenceDependencies();

	/**
	 * Returns the value of the '<em><b>Incoming Reference Dependency</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rsmm.SpaceToSpaceReferenceDependency#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Reference Dependency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Reference Dependency</em>' reference.
	 * @see #setIncomingReferenceDependency(SpaceToSpaceReferenceDependency)
	 * @see rsmm.RsmmPackage#getReferentialSpace_IncomingReferenceDependency()
	 * @see rsmm.SpaceToSpaceReferenceDependency#getChild
	 * @model opposite="child"
	 * @generated
	 */
	SpaceToSpaceReferenceDependency getIncomingReferenceDependency();

	/**
	 * Sets the value of the '{@link rsmm.ReferentialSpace#getIncomingReferenceDependency <em>Incoming Reference Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Reference Dependency</em>' reference.
	 * @see #getIncomingReferenceDependency()
	 * @generated
	 */
	void setIncomingReferenceDependency(SpaceToSpaceReferenceDependency value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see rsmm.RsmmPackage#getReferentialSpace_Id()
	 * @model default="-1" id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link rsmm.ReferentialSpace#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // ReferentialSpace
