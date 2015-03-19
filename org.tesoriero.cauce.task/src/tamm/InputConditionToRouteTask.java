/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Condition To Route Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.InputConditionToRouteTask#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getInputConditionToRouteTask()
 * @model abstract="true"
 * @generated
 */
public interface InputConditionToRouteTask extends Edge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.TaskInputCondition#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TaskInputCondition)
	 * @see tamm.TammPackage#getInputConditionToRouteTask_Source()
	 * @see tamm.TaskInputCondition#getOngoing
	 * @model opposite="ongoing" required="true"
	 * @generated
	 */
	TaskInputCondition getSource();

	/**
	 * Sets the value of the '{@link tamm.InputConditionToRouteTask#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TaskInputCondition value);

} // InputConditionToRouteTask
