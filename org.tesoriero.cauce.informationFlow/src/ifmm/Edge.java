/**
 */
package ifmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifmm.Edge#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifmm.IfmmPackage#getEdge()
 * @model abstract="true"
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ifmm.SystemInformaitonFlow#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(SystemInformaitonFlow)
	 * @see ifmm.IfmmPackage#getEdge_System()
	 * @see ifmm.SystemInformaitonFlow#getEdges
	 * @model opposite="edges" required="true" transient="false"
	 * @generated
	 */
	SystemInformaitonFlow getSystem();

	/**
	 * Sets the value of the '{@link ifmm.Edge#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemInformaitonFlow value);

} // Edge
