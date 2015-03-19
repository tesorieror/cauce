/**
 */
package rsmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Aware Entity Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rsmm.ContextAwareEntityReference#getSystem <em>System</em>}</li>
 *   <li>{@link rsmm.ContextAwareEntityReference#getName <em>Name</em>}</li>
 *   <li>{@link rsmm.ContextAwareEntityReference#getIncomingReferenceDependency <em>Incoming Reference Dependency</em>}</li>
 *   <li>{@link rsmm.ContextAwareEntityReference#getId <em>Id</em>}</li>
 *   <li>{@link rsmm.ContextAwareEntityReference#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see rsmm.RsmmPackage#getContextAwareEntityReference()
 * @model
 * @generated
 */
public interface ContextAwareEntityReference extends EObject {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rsmm.SystemInformationFlowReferenceSpace#getEntityReferences <em>Entity References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(SystemInformationFlowReferenceSpace)
	 * @see rsmm.RsmmPackage#getContextAwareEntityReference_System()
	 * @see rsmm.SystemInformationFlowReferenceSpace#getEntityReferences
	 * @model opposite="entityReferences" required="true" transient="false"
	 * @generated
	 */
	SystemInformationFlowReferenceSpace getSystem();

	/**
	 * Sets the value of the '{@link rsmm.ContextAwareEntityReference#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemInformationFlowReferenceSpace value);

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
	 * @see rsmm.RsmmPackage#getContextAwareEntityReference_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rsmm.ContextAwareEntityReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Reference Dependency</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rsmm.SpaceToEntityReferenceDependency#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Reference Dependency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Reference Dependency</em>' reference.
	 * @see #setIncomingReferenceDependency(SpaceToEntityReferenceDependency)
	 * @see rsmm.RsmmPackage#getContextAwareEntityReference_IncomingReferenceDependency()
	 * @see rsmm.SpaceToEntityReferenceDependency#getChild
	 * @model opposite="child" required="true"
	 * @generated
	 */
	SpaceToEntityReferenceDependency getIncomingReferenceDependency();

	/**
	 * Sets the value of the '{@link rsmm.ContextAwareEntityReference#getIncomingReferenceDependency <em>Incoming Reference Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Reference Dependency</em>' reference.
	 * @see #getIncomingReferenceDependency()
	 * @generated
	 */
	void setIncomingReferenceDependency(SpaceToEntityReferenceDependency value);

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
	 * @see rsmm.RsmmPackage#getContextAwareEntityReference_Id()
	 * @model default="-1" id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link rsmm.ContextAwareEntityReference#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' attribute.
	 * @see #setEntity(String)
	 * @see rsmm.RsmmPackage#getContextAwareEntityReference_Entity()
	 * @model
	 * @generated
	 */
	String getEntity();

	/**
	 * Sets the value of the '{@link rsmm.ContextAwareEntityReference#getEntity <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' attribute.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(String value);

} // ContextAwareEntityReference
