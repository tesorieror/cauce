/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.SystemTask#getSystem <em>System</em>}</li>
 *   <li>{@link tamm.SystemTask#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link tamm.SystemTask#getOngoing <em>Ongoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getSystemTask()
 * @model abstract="true"
 * @generated
 */
public interface SystemTask extends Task {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tamm.ContextAwareSystem#getSystemTasks <em>System Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(ContextAwareSystem)
	 * @see tamm.TammPackage#getSystemTask_System()
	 * @see tamm.ContextAwareSystem#getSystemTasks
	 * @model opposite="systemTasks" required="true" transient="false"
	 * @generated
	 */
	ContextAwareSystem getSystem();

	/**
	 * Sets the value of the '{@link tamm.SystemTask#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(ContextAwareSystem value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.PreConditionToSystemTask#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(PreConditionToSystemTask)
	 * @see tamm.TammPackage#getSystemTask_Incoming()
	 * @see tamm.PreConditionToSystemTask#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	PreConditionToSystemTask getIncoming();

	/**
	 * Sets the value of the '{@link tamm.SystemTask#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(PreConditionToSystemTask value);

	/**
	 * Returns the value of the '<em><b>Ongoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.SystemTaskToPostCondition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ongoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ongoing</em>' reference.
	 * @see #setOngoing(SystemTaskToPostCondition)
	 * @see tamm.TammPackage#getSystemTask_Ongoing()
	 * @see tamm.SystemTaskToPostCondition#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	SystemTaskToPostCondition getOngoing();

	/**
	 * Sets the value of the '{@link tamm.SystemTask#getOngoing <em>Ongoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ongoing</em>' reference.
	 * @see #getOngoing()
	 * @generated
	 */
	void setOngoing(SystemTaskToPostCondition value);

} // SystemTask
