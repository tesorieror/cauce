/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.PostCondition#getSystem <em>System</em>}</li>
 *   <li>{@link tamm.PostCondition#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getPostCondition()
 * @model
 * @generated
 */
public interface PostCondition extends TaskInputCondition {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tamm.ContextAwareSystem#getPostConditions <em>Post Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(ContextAwareSystem)
	 * @see tamm.TammPackage#getPostCondition_System()
	 * @see tamm.ContextAwareSystem#getPostConditions
	 * @model opposite="postConditions" required="true" transient="false"
	 * @generated
	 */
	ContextAwareSystem getSystem();

	/**
	 * Sets the value of the '{@link tamm.PostCondition#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(ContextAwareSystem value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.SystemTaskToPostCondition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(SystemTaskToPostCondition)
	 * @see tamm.TammPackage#getPostCondition_Incoming()
	 * @see tamm.SystemTaskToPostCondition#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	SystemTaskToPostCondition getIncoming();

	/**
	 * Sets the value of the '{@link tamm.PostCondition#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(SystemTaskToPostCondition value);

} // PostCondition
