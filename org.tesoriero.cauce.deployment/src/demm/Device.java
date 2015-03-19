/**
 */
package demm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.Device#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link demm.Device#getName <em>Name</em>}</li>
 *   <li>{@link demm.Device#getId <em>Id</em>}</li>
 *   <li>{@link demm.Device#getEntities <em>Entities</em>}</li>
 *   <li>{@link demm.Device#getOngoing <em>Ongoing</em>}</li>
 *   <li>{@link demm.Device#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link demm.Device#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Platforms</b></em>' containment reference list.
	 * The list contents are of type {@link demm.DevicePlatform}.
	 * It is bidirectional and its opposite is '{@link demm.DevicePlatform#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platforms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platforms</em>' containment reference list.
	 * @see demm.DemmPackage#getDevice_Platforms()
	 * @see demm.DevicePlatform#getDevice
	 * @model opposite="device" containment="true" required="true"
	 * @generated
	 */
	EList<DevicePlatform> getPlatforms();

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
	 * @see demm.DemmPackage#getDevice_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link demm.Device#getName <em>Name</em>}' attribute.
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
	 * @see #setId(String)
	 * @see demm.DemmPackage#getDevice_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link demm.Device#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link demm.Entity}.
	 * It is bidirectional and its opposite is '{@link demm.Entity#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see demm.DemmPackage#getDevice_Entities()
	 * @see demm.Entity#getDevice
	 * @model opposite="device" containment="true" required="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Ongoing</b></em>' reference list.
	 * The list contents are of type {@link demm.DeviceToConnectionEdge}.
	 * It is bidirectional and its opposite is '{@link demm.DeviceToConnectionEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ongoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ongoing</em>' reference list.
	 * @see demm.DemmPackage#getDevice_Ongoing()
	 * @see demm.DeviceToConnectionEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<DeviceToConnectionEdge> getOngoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link demm.ConnectionToDeviceEdge}.
	 * It is bidirectional and its opposite is '{@link demm.ConnectionToDeviceEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see demm.DemmPackage#getDevice_Incoming()
	 * @see demm.ConnectionToDeviceEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ConnectionToDeviceEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link demm.DevelopmentEnvironment#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' container reference.
	 * @see #setEnvironment(DevelopmentEnvironment)
	 * @see demm.DemmPackage#getDevice_Environment()
	 * @see demm.DevelopmentEnvironment#getDevices
	 * @model opposite="devices" required="true" transient="false"
	 * @generated
	 */
	DevelopmentEnvironment getEnvironment();

	/**
	 * Sets the value of the '{@link demm.Device#getEnvironment <em>Environment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' container reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(DevelopmentEnvironment value);

} // Device
