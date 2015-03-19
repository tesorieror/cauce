/**
 */
package demm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device To Connection Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.DeviceToConnectionEdge#getSource <em>Source</em>}</li>
 *   <li>{@link demm.DeviceToConnectionEdge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getDeviceToConnectionEdge()
 * @model
 * @generated
 */
public interface DeviceToConnectionEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link demm.Device#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Device)
	 * @see demm.DemmPackage#getDeviceToConnectionEdge_Source()
	 * @see demm.Device#getOngoing
	 * @model opposite="ongoing" required="true"
	 * @generated
	 */
	Device getSource();

	/**
	 * Sets the value of the '{@link demm.DeviceToConnectionEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Device value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link demm.Connection#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Connection)
	 * @see demm.DemmPackage#getDeviceToConnectionEdge_Target()
	 * @see demm.Connection#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Connection getTarget();

	/**
	 * Sets the value of the '{@link demm.DeviceToConnectionEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Connection value);

} // DeviceToConnectionEdge
