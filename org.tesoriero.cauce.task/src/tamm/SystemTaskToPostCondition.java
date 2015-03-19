/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Task To Post Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.SystemTaskToPostCondition#getSource <em>Source</em>}</li>
 *   <li>{@link tamm.SystemTaskToPostCondition#getTarget <em>Target</em>}</li>
 *   <li>{@link tamm.SystemTaskToPostCondition#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getSystemTaskToPostCondition()
 * @model
 * @generated
 */
public interface SystemTaskToPostCondition extends Edge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.SystemTask#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SystemTask)
	 * @see tamm.TammPackage#getSystemTaskToPostCondition_Source()
	 * @see tamm.SystemTask#getOngoing
	 * @model opposite="ongoing" required="true"
	 * @generated
	 */
	SystemTask getSource();

	/**
	 * Sets the value of the '{@link tamm.SystemTaskToPostCondition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SystemTask value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.PostCondition#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PostCondition)
	 * @see tamm.TammPackage#getSystemTaskToPostCondition_Target()
	 * @see tamm.PostCondition#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	PostCondition getTarget();

	/**
	 * Sets the value of the '{@link tamm.SystemTaskToPostCondition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PostCondition value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tamm.ContextAwareSystem#getSystemTaskToPostConditions <em>System Task To Post Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(ContextAwareSystem)
	 * @see tamm.TammPackage#getSystemTaskToPostCondition_System()
	 * @see tamm.ContextAwareSystem#getSystemTaskToPostConditions
	 * @model opposite="systemTaskToPostConditions" required="true" transient="false"
	 * @generated
	 */
	ContextAwareSystem getSystem();

	/**
	 * Sets the value of the '{@link tamm.SystemTaskToPostCondition#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(ContextAwareSystem value);

} // SystemTaskToPostCondition
