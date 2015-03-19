/**
 */
package tamm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.Split#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link tamm.Split#getOngoing <em>Ongoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getSplit()
 * @model abstract="true"
 * @generated
 */
public interface Split extends RouteTask {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.InputConditionToSplitTask#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(InputConditionToSplitTask)
	 * @see tamm.TammPackage#getSplit_Incoming()
	 * @see tamm.InputConditionToSplitTask#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	InputConditionToSplitTask getIncoming();

	/**
	 * Sets the value of the '{@link tamm.Split#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(InputConditionToSplitTask value);

	/**
	 * Returns the value of the '<em><b>Ongoing</b></em>' reference list.
	 * The list contents are of type {@link tamm.SplitTaskToOutputCondition}.
	 * It is bidirectional and its opposite is '{@link tamm.SplitTaskToOutputCondition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ongoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ongoing</em>' reference list.
	 * @see tamm.TammPackage#getSplit_Ongoing()
	 * @see tamm.SplitTaskToOutputCondition#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	EList<SplitTaskToOutputCondition> getOngoing();

} // Split
