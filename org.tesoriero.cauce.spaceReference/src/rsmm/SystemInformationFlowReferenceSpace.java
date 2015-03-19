/**
 */
package rsmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Information Flow Reference Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rsmm.SystemInformationFlowReferenceSpace#getReferentialSpaces <em>Referential Spaces</em>}</li>
 *   <li>{@link rsmm.SystemInformationFlowReferenceSpace#getSpaceToSpaceReferenceDependencies <em>Space To Space Reference Dependencies</em>}</li>
 *   <li>{@link rsmm.SystemInformationFlowReferenceSpace#getSpaceToEntityReferenceDependencies <em>Space To Entity Reference Dependencies</em>}</li>
 *   <li>{@link rsmm.SystemInformationFlowReferenceSpace#getEntityReferences <em>Entity References</em>}</li>
 *   <li>{@link rsmm.SystemInformationFlowReferenceSpace#getName <em>Name</em>}</li>
 *   <li>{@link rsmm.SystemInformationFlowReferenceSpace#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see rsmm.RsmmPackage#getSystemInformationFlowReferenceSpace()
 * @model
 * @generated
 */
public interface SystemInformationFlowReferenceSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Referential Spaces</b></em>' containment reference list.
	 * The list contents are of type {@link rsmm.ReferentialSpace}.
	 * It is bidirectional and its opposite is '{@link rsmm.ReferentialSpace#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referential Spaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referential Spaces</em>' containment reference list.
	 * @see rsmm.RsmmPackage#getSystemInformationFlowReferenceSpace_ReferentialSpaces()
	 * @see rsmm.ReferentialSpace#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<ReferentialSpace> getReferentialSpaces();

	/**
	 * Returns the value of the '<em><b>Space To Space Reference Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link rsmm.SpaceToSpaceReferenceDependency}.
	 * It is bidirectional and its opposite is '{@link rsmm.SpaceToSpaceReferenceDependency#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space To Space Reference Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space To Space Reference Dependencies</em>' containment reference list.
	 * @see rsmm.RsmmPackage#getSystemInformationFlowReferenceSpace_SpaceToSpaceReferenceDependencies()
	 * @see rsmm.SpaceToSpaceReferenceDependency#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<SpaceToSpaceReferenceDependency> getSpaceToSpaceReferenceDependencies();

	/**
	 * Returns the value of the '<em><b>Space To Entity Reference Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link rsmm.SpaceToEntityReferenceDependency}.
	 * It is bidirectional and its opposite is '{@link rsmm.SpaceToEntityReferenceDependency#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space To Entity Reference Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space To Entity Reference Dependencies</em>' containment reference list.
	 * @see rsmm.RsmmPackage#getSystemInformationFlowReferenceSpace_SpaceToEntityReferenceDependencies()
	 * @see rsmm.SpaceToEntityReferenceDependency#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<SpaceToEntityReferenceDependency> getSpaceToEntityReferenceDependencies();

	/**
	 * Returns the value of the '<em><b>Entity References</b></em>' containment reference list.
	 * The list contents are of type {@link rsmm.ContextAwareEntityReference}.
	 * It is bidirectional and its opposite is '{@link rsmm.ContextAwareEntityReference#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity References</em>' containment reference list.
	 * @see rsmm.RsmmPackage#getSystemInformationFlowReferenceSpace_EntityReferences()
	 * @see rsmm.ContextAwareEntityReference#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<ContextAwareEntityReference> getEntityReferences();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"rsmm-default"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rsmm.RsmmPackage#getSystemInformationFlowReferenceSpace_Name()
	 * @model default="rsmm-default" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rsmm.SystemInformationFlowReferenceSpace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see rsmm.RsmmPackage#getSystemInformationFlowReferenceSpace_Id()
	 * @model default="0" id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link rsmm.SystemInformationFlowReferenceSpace#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // SystemInformationFlowReferenceSpace
