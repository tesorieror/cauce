/**
 */
package demm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.DevicePlatform#getDevice <em>Device</em>}</li>
 *   <li>{@link demm.DevicePlatform#getLanguage <em>Language</em>}</li>
 *   <li>{@link demm.DevicePlatform#getOs <em>Os</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getDevicePlatform()
 * @model
 * @generated
 */
public interface DevicePlatform extends Platform {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link demm.Device#getPlatforms <em>Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' container reference.
	 * @see #setDevice(Device)
	 * @see demm.DemmPackage#getDevicePlatform_Device()
	 * @see demm.Device#getPlatforms
	 * @model opposite="platforms" required="true" transient="false"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link demm.DevicePlatform#getDevice <em>Device</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' container reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(ProgrammingLanguage)
	 * @see demm.DemmPackage#getDevicePlatform_Language()
	 * @model required="true"
	 * @generated
	 */
	ProgrammingLanguage getLanguage();

	/**
	 * Sets the value of the '{@link demm.DevicePlatform#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ProgrammingLanguage value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' reference.
	 * @see #setOs(OperatingSystem)
	 * @see demm.DemmPackage#getDevicePlatform_Os()
	 * @model
	 * @generated
	 */
	OperatingSystem getOs();

	/**
	 * Sets the value of the '{@link demm.DevicePlatform#getOs <em>Os</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' reference.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(OperatingSystem value);

} // DevicePlatform
