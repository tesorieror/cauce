/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Input Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.TaskInputCondition#getOngoing <em>Ongoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getTaskInputCondition()
 * @model abstract="true"
 * @generated
 */
public interface TaskInputCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Ongoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.InputConditionToRouteTask#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ongoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ongoing</em>' reference.
	 * @see #setOngoing(InputConditionToRouteTask)
	 * @see tamm.TammPackage#getTaskInputCondition_Ongoing()
	 * @see tamm.InputConditionToRouteTask#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	InputConditionToRouteTask getOngoing();

	/**
	 * Sets the value of the '{@link tamm.TaskInputCondition#getOngoing <em>Ongoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ongoing</em>' reference.
	 * @see #getOngoing()
	 * @generated
	 */
	void setOngoing(InputConditionToRouteTask value);

} // TaskInputCondition
