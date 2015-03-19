/**
 */
package ifmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Informaiton Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifmm.SystemInformaitonFlow#getEntities <em>Entities</em>}</li>
 *   <li>{@link ifmm.SystemInformaitonFlow#getId <em>Id</em>}</li>
 *   <li>{@link ifmm.SystemInformaitonFlow#getName <em>Name</em>}</li>
 *   <li>{@link ifmm.SystemInformaitonFlow#getInformationFlows <em>Information Flows</em>}</li>
 *   <li>{@link ifmm.SystemInformaitonFlow#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifmm.IfmmPackage#getSystemInformaitonFlow()
 * @model
 * @generated
 */
public interface SystemInformaitonFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link ifmm.ContextAwareEntity}.
	 * It is bidirectional and its opposite is '{@link ifmm.ContextAwareEntity#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see ifmm.IfmmPackage#getSystemInformaitonFlow_Entities()
	 * @see ifmm.ContextAwareEntity#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<ContextAwareEntity> getEntities();

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
	 * @see ifmm.IfmmPackage#getSystemInformaitonFlow_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ifmm.SystemInformaitonFlow#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"ifmm-default"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ifmm.IfmmPackage#getSystemInformaitonFlow_Name()
	 * @model default="ifmm-default" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ifmm.SystemInformaitonFlow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Information Flows</b></em>' containment reference list.
	 * The list contents are of type {@link ifmm.InformationFlow}.
	 * It is bidirectional and its opposite is '{@link ifmm.InformationFlow#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Flows</em>' containment reference list.
	 * @see ifmm.IfmmPackage#getSystemInformaitonFlow_InformationFlows()
	 * @see ifmm.InformationFlow#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<InformationFlow> getInformationFlows();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link ifmm.Edge}.
	 * It is bidirectional and its opposite is '{@link ifmm.Edge#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see ifmm.IfmmPackage#getSystemInformaitonFlow_Edges()
	 * @see ifmm.Edge#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

} // SystemInformaitonFlow
