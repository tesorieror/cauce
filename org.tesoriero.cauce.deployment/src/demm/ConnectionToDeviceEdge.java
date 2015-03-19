/**
 */
package demm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection To Device Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.ConnectionToDeviceEdge#getSource <em>Source</em>}</li>
 *   <li>{@link demm.ConnectionToDeviceEdge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getConnectionToDeviceEdge()
 * @model
 * @generated
 */
public interface ConnectionToDeviceEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link demm.Connection#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Connection)
	 * @see demm.DemmPackage#getConnectionToDeviceEdge_Source()
	 * @see demm.Connection#getOngoing
	 * @model opposite="ongoing" required="true"
	 * @generated
	 */
	Connection getSource();

	/**
	 * Sets the value of the '{@link demm.ConnectionToDeviceEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Connection value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link demm.Device#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Device)
	 * @see demm.DemmPackage#getConnectionToDeviceEdge_Target()
	 * @see demm.Device#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Device getTarget();

	/**
	 * Sets the value of the '{@link demm.ConnectionToDeviceEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Device value);

} // ConnectionToDeviceEdge
