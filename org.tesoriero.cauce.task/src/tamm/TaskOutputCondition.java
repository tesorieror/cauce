/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Output Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.TaskOutputCondition#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getTaskOutputCondition()
 * @model abstract="true"
 * @generated
 */
public interface TaskOutputCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.RouteTaskToOutputCondition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(RouteTaskToOutputCondition)
	 * @see tamm.TammPackage#getTaskOutputCondition_Incoming()
	 * @see tamm.RouteTaskToOutputCondition#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	RouteTaskToOutputCondition getIncoming();

	/**
	 * Sets the value of the '{@link tamm.TaskOutputCondition#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(RouteTaskToOutputCondition value);

} // TaskOutputCondition
