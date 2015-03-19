/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Condition To Join Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.InputConditionToJoinTask#getTarget <em>Target</em>}</li>
 *   <li>{@link tamm.InputConditionToJoinTask#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getInputConditionToJoinTask()
 * @model
 * @generated
 */
public interface InputConditionToJoinTask extends InputConditionToRouteTask {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.Join#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Join)
	 * @see tamm.TammPackage#getInputConditionToJoinTask_Target()
	 * @see tamm.Join#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Join getTarget();

	/**
	 * Sets the value of the '{@link tamm.InputConditionToJoinTask#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Join value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tamm.ContextAwareSystem#getInputConditionToJoinTasks <em>Input Condition To Join Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(ContextAwareSystem)
	 * @see tamm.TammPackage#getInputConditionToJoinTask_System()
	 * @see tamm.ContextAwareSystem#getInputConditionToJoinTasks
	 * @model opposite="inputConditionToJoinTasks" required="true" transient="false"
	 * @generated
	 */
	ContextAwareSystem getSystem();

	/**
	 * Sets the value of the '{@link tamm.InputConditionToJoinTask#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(ContextAwareSystem value);

} // InputConditionToJoinTask
