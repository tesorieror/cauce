/**
 */
package demm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Development Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.DevelopmentEnvironment#getMediums <em>Mediums</em>}</li>
 *   <li>{@link demm.DevelopmentEnvironment#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link demm.DevelopmentEnvironment#getLanguages <em>Languages</em>}</li>
 *   <li>{@link demm.DevelopmentEnvironment#getOs <em>Os</em>}</li>
 *   <li>{@link demm.DevelopmentEnvironment#getName <em>Name</em>}</li>
 *   <li>{@link demm.DevelopmentEnvironment#getId <em>Id</em>}</li>
 *   <li>{@link demm.DevelopmentEnvironment#getConnections <em>Connections</em>}</li>
 *   <li>{@link demm.DevelopmentEnvironment#getDevices <em>Devices</em>}</li>
 *   <li>{@link demm.DevelopmentEnvironment#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getDevelopmentEnvironment()
 * @model
 * @generated
 */
public interface DevelopmentEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Mediums</b></em>' containment reference list.
	 * The list contents are of type {@link demm.Medium}.
	 * It is bidirectional and its opposite is '{@link demm.Medium#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediums</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediums</em>' containment reference list.
	 * @see demm.DemmPackage#getDevelopmentEnvironment_Mediums()
	 * @see demm.Medium#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
	EList<Medium> getMediums();

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link demm.Protocol}.
	 * It is bidirectional and its opposite is '{@link demm.Protocol#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference list.
	 * @see demm.DemmPackage#getDevelopmentEnvironment_Protocols()
	 * @see demm.Protocol#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
	EList<Protocol> getProtocols();

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
	 * The list contents are of type {@link demm.ProgrammingLanguage}.
	 * It is bidirectional and its opposite is '{@link demm.ProgrammingLanguage#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' containment reference list.
	 * @see demm.DemmPackage#getDevelopmentEnvironment_Languages()
	 * @see demm.ProgrammingLanguage#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
	EList<ProgrammingLanguage> getLanguages();

	/**
	 * Returns the value of the '<em><b>Os</b></em>' containment reference list.
	 * The list contents are of type {@link demm.OperatingSystem}.
	 * It is bidirectional and its opposite is '{@link demm.OperatingSystem#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' containment reference list.
	 * @see demm.DemmPackage#getDevelopmentEnvironment_Os()
	 * @see demm.OperatingSystem#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
	EList<OperatingSystem> getOs();

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
	 * @see demm.DemmPackage#getDevelopmentEnvironment_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link demm.DevelopmentEnvironment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see demm.DemmPackage#getDevelopmentEnvironment_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link demm.DevelopmentEnvironment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link demm.Connection}.
	 * It is bidirectional and its opposite is '{@link demm.Connection#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see demm.DemmPackage#getDevelopmentEnvironment_Connections()
	 * @see demm.Connection#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link demm.Device}.
	 * It is bidirectional and its opposite is '{@link demm.Device#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see demm.DemmPackage#getDevelopmentEnvironment_Devices()
	 * @see demm.Device#getEnvironment
	 * @model opposite="environment" containment="true" required="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link demm.Edge}.
	 * It is bidirectional and its opposite is '{@link demm.Edge#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see demm.DemmPackage#getDevelopmentEnvironment_Edges()
	 * @see demm.Edge#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

} // DevelopmentEnvironment
