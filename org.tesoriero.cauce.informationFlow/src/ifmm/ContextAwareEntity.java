/**
 */
package ifmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Aware Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifmm.ContextAwareEntity#getSystem <em>System</em>}</li>
 *   <li>{@link ifmm.ContextAwareEntity#getId <em>Id</em>}</li>
 *   <li>{@link ifmm.ContextAwareEntity#getName <em>Name</em>}</li>
 *   <li>{@link ifmm.ContextAwareEntity#getOngoingInformationFlows <em>Ongoing Information Flows</em>}</li>
 *   <li>{@link ifmm.ContextAwareEntity#getIncomingInformationFlows <em>Incoming Information Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifmm.IfmmPackage#getContextAwareEntity()
 * @model
 * @generated
 */
public interface ContextAwareEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ifmm.SystemInformaitonFlow#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(SystemInformaitonFlow)
	 * @see ifmm.IfmmPackage#getContextAwareEntity_System()
	 * @see ifmm.SystemInformaitonFlow#getEntities
	 * @model opposite="entities" required="true" transient="false" derived="true"
	 * @generated
	 */
	SystemInformaitonFlow getSystem();

	/**
	 * Sets the value of the '{@link ifmm.ContextAwareEntity#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemInformaitonFlow value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see ifmm.IfmmPackage#getContextAwareEntity_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ifmm.ContextAwareEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see ifmm.IfmmPackage#getContextAwareEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ifmm.ContextAwareEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ongoing Information Flows</b></em>' reference list.
	 * The list contents are of type {@link ifmm.EntityToInformationFlowEdge}.
	 * It is bidirectional and its opposite is '{@link ifmm.EntityToInformationFlowEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ongoing Information Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ongoing Information Flows</em>' reference list.
	 * @see ifmm.IfmmPackage#getContextAwareEntity_OngoingInformationFlows()
	 * @see ifmm.EntityToInformationFlowEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<EntityToInformationFlowEdge> getOngoingInformationFlows();

	/**
	 * Returns the value of the '<em><b>Incoming Information Flows</b></em>' reference list.
	 * The list contents are of type {@link ifmm.InformationFlowToEntityEdge}.
	 * It is bidirectional and its opposite is '{@link ifmm.InformationFlowToEntityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Information Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Information Flows</em>' reference list.
	 * @see ifmm.IfmmPackage#getContextAwareEntity_IncomingInformationFlows()
	 * @see ifmm.InformationFlowToEntityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<InformationFlowToEntityEdge> getIncomingInformationFlows();

} // ContextAwareEntity
