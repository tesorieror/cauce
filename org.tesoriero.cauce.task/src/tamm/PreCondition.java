/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.PreCondition#getSystem <em>System</em>}</li>
 *   <li>{@link tamm.PreCondition#getOngoing <em>Ongoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getPreCondition()
 * @model
 * @generated
 */
public interface PreCondition extends TaskOutputCondition {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tamm.ContextAwareSystem#getPreConditions <em>Pre Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(ContextAwareSystem)
	 * @see tamm.TammPackage#getPreCondition_System()
	 * @see tamm.ContextAwareSystem#getPreConditions
	 * @model opposite="preConditions" required="true" transient="false"
	 * @generated
	 */
	ContextAwareSystem getSystem();

	/**
	 * Sets the value of the '{@link tamm.PreCondition#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(ContextAwareSystem value);

	/**
	 * Returns the value of the '<em><b>Ongoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.PreConditionToSystemTask#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ongoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ongoing</em>' reference.
	 * @see #setOngoing(PreConditionToSystemTask)
	 * @see tamm.TammPackage#getPreCondition_Ongoing()
	 * @see tamm.PreConditionToSystemTask#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	PreConditionToSystemTask getOngoing();

	/**
	 * Sets the value of the '{@link tamm.PreCondition#getOngoing <em>Ongoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ongoing</em>' reference.
	 * @see #getOngoing()
	 * @generated
	 */
	void setOngoing(PreConditionToSystemTask value);

} // PreCondition
