/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Condition To System Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.PreConditionToSystemTask#getSource <em>Source</em>}</li>
 *   <li>{@link tamm.PreConditionToSystemTask#getTarget <em>Target</em>}</li>
 *   <li>{@link tamm.PreConditionToSystemTask#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getPreConditionToSystemTask()
 * @model
 * @generated
 */
public interface PreConditionToSystemTask extends Edge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.PreCondition#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PreCondition)
	 * @see tamm.TammPackage#getPreConditionToSystemTask_Source()
	 * @see tamm.PreCondition#getOngoing
	 * @model opposite="ongoing" required="true"
	 * @generated
	 */
	PreCondition getSource();

	/**
	 * Sets the value of the '{@link tamm.PreConditionToSystemTask#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PreCondition value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.SystemTask#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SystemTask)
	 * @see tamm.TammPackage#getPreConditionToSystemTask_Target()
	 * @see tamm.SystemTask#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	SystemTask getTarget();

	/**
	 * Sets the value of the '{@link tamm.PreConditionToSystemTask#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SystemTask value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tamm.ContextAwareSystem#getPreConditionToSystemTasks <em>Pre Condition To System Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(ContextAwareSystem)
	 * @see tamm.TammPackage#getPreConditionToSystemTask_System()
	 * @see tamm.ContextAwareSystem#getPreConditionToSystemTasks
	 * @model opposite="preConditionToSystemTasks" required="true" transient="false"
	 * @generated
	 */
	ContextAwareSystem getSystem();

	/**
	 * Sets the value of the '{@link tamm.PreConditionToSystemTask#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(ContextAwareSystem value);

} // PreConditionToSystemTask
