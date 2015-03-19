/**
 */
package demm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.Connection#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link demm.Connection#getName <em>Name</em>}</li>
 *   <li>{@link demm.Connection#getId <em>Id</em>}</li>
 *   <li>{@link demm.Connection#getInformation <em>Information</em>}</li>
 *   <li>{@link demm.Connection#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link demm.Connection#getOngoing <em>Ongoing</em>}</li>
 *   <li>{@link demm.Connection#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Platforms</b></em>' containment reference list.
	 * The list contents are of type {@link demm.ConnectionPlatform}.
	 * It is bidirectional and its opposite is '{@link demm.ConnectionPlatform#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platforms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platforms</em>' containment reference list.
	 * @see demm.DemmPackage#getConnection_Platforms()
	 * @see demm.ConnectionPlatform#getConnection
	 * @model opposite="connection" containment="true" required="true"
	 * @generated
	 */
	EList<ConnectionPlatform> getPlatforms();

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
	 * @see demm.DemmPackage#getConnection_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link demm.Connection#getName <em>Name</em>}' attribute.
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
	 * @see demm.DemmPackage#getConnection_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link demm.Connection#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference list.
	 * The list contents are of type {@link demm.Information}.
	 * It is bidirectional and its opposite is '{@link demm.Information#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' containment reference list.
	 * @see demm.DemmPackage#getConnection_Information()
	 * @see demm.Information#getConnection
	 * @model opposite="connection" containment="true" required="true"
	 * @generated
	 */
	EList<Information> getInformation();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link demm.DevelopmentEnvironment#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' container reference.
	 * @see #setEnvironment(DevelopmentEnvironment)
	 * @see demm.DemmPackage#getConnection_Environment()
	 * @see demm.DevelopmentEnvironment#getConnections
	 * @model opposite="connections" required="true" transient="false"
	 * @generated
	 */
	DevelopmentEnvironment getEnvironment();

	/**
	 * Sets the value of the '{@link demm.Connection#getEnvironment <em>Environment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' container reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(DevelopmentEnvironment value);

	/**
	 * Returns the value of the '<em><b>Ongoing</b></em>' reference list.
	 * The list contents are of type {@link demm.ConnectionToDeviceEdge}.
	 * It is bidirectional and its opposite is '{@link demm.ConnectionToDeviceEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ongoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ongoing</em>' reference list.
	 * @see demm.DemmPackage#getConnection_Ongoing()
	 * @see demm.ConnectionToDeviceEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ConnectionToDeviceEdge> getOngoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link demm.DeviceToConnectionEdge}.
	 * It is bidirectional and its opposite is '{@link demm.DeviceToConnectionEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see demm.DemmPackage#getConnection_Incoming()
	 * @see demm.DeviceToConnectionEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<DeviceToConnectionEdge> getIncoming();

} // Connection
