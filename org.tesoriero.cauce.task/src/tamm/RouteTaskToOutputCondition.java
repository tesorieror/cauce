/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Task To Output Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.RouteTaskToOutputCondition#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getRouteTaskToOutputCondition()
 * @model abstract="true"
 * @generated
 */
public interface RouteTaskToOutputCondition extends Edge {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.TaskOutputCondition#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TaskOutputCondition)
	 * @see tamm.TammPackage#getRouteTaskToOutputCondition_Target()
	 * @see tamm.TaskOutputCondition#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	TaskOutputCondition getTarget();

	/**
	 * Sets the value of the '{@link tamm.RouteTaskToOutputCondition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TaskOutputCondition value);

} // RouteTaskToOutputCondition
