/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Condition To Split Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.InputConditionToSplitTask#getTarget <em>Target</em>}</li>
 *   <li>{@link tamm.InputConditionToSplitTask#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getInputConditionToSplitTask()
 * @model
 * @generated
 */
public interface InputConditionToSplitTask extends InputConditionToRouteTask {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.Split#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Split)
	 * @see tamm.TammPackage#getInputConditionToSplitTask_Target()
	 * @see tamm.Split#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Split getTarget();

	/**
	 * Sets the value of the '{@link tamm.InputConditionToSplitTask#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Split value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tamm.ContextAwareSystem#getInputConditionToSplitTasks <em>Input Condition To Split Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(ContextAwareSystem)
	 * @see tamm.TammPackage#getInputConditionToSplitTask_System()
	 * @see tamm.ContextAwareSystem#getInputConditionToSplitTasks
	 * @model opposite="inputConditionToSplitTasks" required="true" transient="false"
	 * @generated
	 */
	ContextAwareSystem getSystem();

	/**
	 * Sets the value of the '{@link tamm.InputConditionToSplitTask#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(ContextAwareSystem value);

} // InputConditionToSplitTask
