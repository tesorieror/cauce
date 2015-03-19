/**
 */
package demm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.Edge#getId <em>Id</em>}</li>
 *   <li>{@link demm.Edge#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getEdge()
 * @model abstract="true"
 * @generated
 */
public interface Edge extends EObject {
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
	 * @see demm.DemmPackage#getEdge_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link demm.Edge#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link demm.DevelopmentEnvironment#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' container reference.
	 * @see #setEnvironment(DevelopmentEnvironment)
	 * @see demm.DemmPackage#getEdge_Environment()
	 * @see demm.DevelopmentEnvironment#getEdges
	 * @model opposite="edges" required="true" transient="false"
	 * @generated
	 */
	DevelopmentEnvironment getEnvironment();

	/**
	 * Sets the value of the '{@link demm.Edge#getEnvironment <em>Environment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' container reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(DevelopmentEnvironment value);

} // Edge
