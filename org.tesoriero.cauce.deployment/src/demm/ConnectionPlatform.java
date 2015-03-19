/**
 */
package demm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.ConnectionPlatform#getConnection <em>Connection</em>}</li>
 *   <li>{@link demm.ConnectionPlatform#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link demm.ConnectionPlatform#getMedium <em>Medium</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getConnectionPlatform()
 * @model
 * @generated
 */
public interface ConnectionPlatform extends Platform {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link demm.Connection#getPlatforms <em>Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' container reference.
	 * @see #setConnection(Connection)
	 * @see demm.DemmPackage#getConnectionPlatform_Connection()
	 * @see demm.Connection#getPlatforms
	 * @model opposite="platforms" required="true" transient="false"
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link demm.ConnectionPlatform#getConnection <em>Connection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' container reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(Protocol)
	 * @see demm.DemmPackage#getConnectionPlatform_Protocol()
	 * @model required="true"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link demm.ConnectionPlatform#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium</em>' reference.
	 * @see #setMedium(Medium)
	 * @see demm.DemmPackage#getConnectionPlatform_Medium()
	 * @model required="true"
	 * @generated
	 */
	Medium getMedium();

	/**
	 * Sets the value of the '{@link demm.ConnectionPlatform#getMedium <em>Medium</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium</em>' reference.
	 * @see #getMedium()
	 * @generated
	 */
	void setMedium(Medium value);

} // ConnectionPlatform
