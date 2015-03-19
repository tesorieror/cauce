/**
 */
package tamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Task To Output Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.SplitTaskToOutputCondition#getSource <em>Source</em>}</li>
 *   <li>{@link tamm.SplitTaskToOutputCondition#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getSplitTaskToOutputCondition()
 * @model
 * @generated
 */
public interface SplitTaskToOutputCondition extends RouteTaskToOutputCondition {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.Split#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Split)
	 * @see tamm.TammPackage#getSplitTaskToOutputCondition_Source()
	 * @see tamm.Split#getOngoing
	 * @model opposite="ongoing" required="true"
	 * @generated
	 */
	Split getSource();

	/**
	 * Sets the value of the '{@link tamm.SplitTaskToOutputCondition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Split value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tamm.ContextAwareSystem#getSplitTaskToOutputConditions <em>Split Task To Output Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(ContextAwareSystem)
	 * @see tamm.TammPackage#getSplitTaskToOutputCondition_System()
	 * @see tamm.ContextAwareSystem#getSplitTaskToOutputConditions
	 * @model opposite="splitTaskToOutputConditions" required="true" transient="false"
	 * @generated
	 */
	ContextAwareSystem getSystem();

	/**
	 * Sets the value of the '{@link tamm.SplitTaskToOutputCondition#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(ContextAwareSystem value);

} // SplitTaskToOutputCondition
