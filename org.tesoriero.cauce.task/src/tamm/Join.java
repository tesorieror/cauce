/**
 */
package tamm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.Join#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link tamm.Join#getOngoing <em>Ongoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getJoin()
 * @model abstract="true"
 * @generated
 */
public interface Join extends RouteTask {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link tamm.InputConditionToJoinTask}.
	 * It is bidirectional and its opposite is '{@link tamm.InputConditionToJoinTask#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see tamm.TammPackage#getJoin_Incoming()
	 * @see tamm.InputConditionToJoinTask#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	EList<InputConditionToJoinTask> getIncoming();

	/**
	 * Returns the value of the '<em><b>Ongoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tamm.JoinTaskToOutputCondition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ongoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ongoing</em>' reference.
	 * @see #setOngoing(JoinTaskToOutputCondition)
	 * @see tamm.TammPackage#getJoin_Ongoing()
	 * @see tamm.JoinTaskToOutputCondition#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	JoinTaskToOutputCondition getOngoing();

	/**
	 * Sets the value of the '{@link tamm.Join#getOngoing <em>Ongoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ongoing</em>' reference.
	 * @see #getOngoing()
	 * @generated
	 */
	void setOngoing(JoinTaskToOutputCondition value);

} // Join
