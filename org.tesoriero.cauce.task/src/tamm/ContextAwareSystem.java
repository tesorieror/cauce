/**
 */
package tamm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Aware System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.ContextAwareSystem#getName <em>Name</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getFinalConditions <em>Final Conditions</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getInitialConditions <em>Initial Conditions</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getRouteTasks <em>Route Tasks</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getSystemTasks <em>System Tasks</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getInputConditionToJoinTasks <em>Input Condition To Join Tasks</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getInputConditionToSplitTasks <em>Input Condition To Split Tasks</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getJoinTaskToOutputConditions <em>Join Task To Output Conditions</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getSplitTaskToOutputConditions <em>Split Task To Output Conditions</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getPreConditionToSystemTasks <em>Pre Condition To System Tasks</em>}</li>
 *   <li>{@link tamm.ContextAwareSystem#getSystemTaskToPostConditions <em>System Task To Post Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getContextAwareSystem()
 * @model
 * @generated
 */
public interface ContextAwareSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"tamm-default"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tamm.TammPackage#getContextAwareSystem_Name()
	 * @model default="tamm-default"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tamm.ContextAwareSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Final Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.FinalCondition}.
	 * It is bidirectional and its opposite is '{@link tamm.FinalCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Conditions</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_FinalConditions()
	 * @see tamm.FinalCondition#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<FinalCondition> getFinalConditions();

	/**
	 * Returns the value of the '<em><b>Pre Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.PreCondition}.
	 * It is bidirectional and its opposite is '{@link tamm.PreCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Conditions</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_PreConditions()
	 * @see tamm.PreCondition#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<PreCondition> getPreConditions();

	/**
	 * Returns the value of the '<em><b>Post Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.PostCondition}.
	 * It is bidirectional and its opposite is '{@link tamm.PostCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Conditions</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_PostConditions()
	 * @see tamm.PostCondition#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<PostCondition> getPostConditions();

	/**
	 * Returns the value of the '<em><b>Initial Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.InitialCondition}.
	 * It is bidirectional and its opposite is '{@link tamm.InitialCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Conditions</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_InitialConditions()
	 * @see tamm.InitialCondition#getSystem
	 * @model opposite="system" containment="true" required="true"
	 * @generated
	 */
	EList<InitialCondition> getInitialConditions();

	/**
	 * Returns the value of the '<em><b>Route Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.RouteTask}.
	 * It is bidirectional and its opposite is '{@link tamm.RouteTask#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Tasks</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_RouteTasks()
	 * @see tamm.RouteTask#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<RouteTask> getRouteTasks();

	/**
	 * Returns the value of the '<em><b>System Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.SystemTask}.
	 * It is bidirectional and its opposite is '{@link tamm.SystemTask#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Tasks</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_SystemTasks()
	 * @see tamm.SystemTask#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<SystemTask> getSystemTasks();

	/**
	 * Returns the value of the '<em><b>Input Condition To Join Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.InputConditionToJoinTask}.
	 * It is bidirectional and its opposite is '{@link tamm.InputConditionToJoinTask#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Condition To Join Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Condition To Join Tasks</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_InputConditionToJoinTasks()
	 * @see tamm.InputConditionToJoinTask#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<InputConditionToJoinTask> getInputConditionToJoinTasks();

	/**
	 * Returns the value of the '<em><b>Input Condition To Split Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.InputConditionToSplitTask}.
	 * It is bidirectional and its opposite is '{@link tamm.InputConditionToSplitTask#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Condition To Split Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Condition To Split Tasks</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_InputConditionToSplitTasks()
	 * @see tamm.InputConditionToSplitTask#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<InputConditionToSplitTask> getInputConditionToSplitTasks();

	/**
	 * Returns the value of the '<em><b>Join Task To Output Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.JoinTaskToOutputCondition}.
	 * It is bidirectional and its opposite is '{@link tamm.JoinTaskToOutputCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Task To Output Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Task To Output Conditions</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_JoinTaskToOutputConditions()
	 * @see tamm.JoinTaskToOutputCondition#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<JoinTaskToOutputCondition> getJoinTaskToOutputConditions();

	/**
	 * Returns the value of the '<em><b>Split Task To Output Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.SplitTaskToOutputCondition}.
	 * It is bidirectional and its opposite is '{@link tamm.SplitTaskToOutputCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Task To Output Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Task To Output Conditions</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_SplitTaskToOutputConditions()
	 * @see tamm.SplitTaskToOutputCondition#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<SplitTaskToOutputCondition> getSplitTaskToOutputConditions();

	/**
	 * Returns the value of the '<em><b>Pre Condition To System Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.PreConditionToSystemTask}.
	 * It is bidirectional and its opposite is '{@link tamm.PreConditionToSystemTask#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition To System Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition To System Tasks</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_PreConditionToSystemTasks()
	 * @see tamm.PreConditionToSystemTask#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<PreConditionToSystemTask> getPreConditionToSystemTasks();

	/**
	 * Returns the value of the '<em><b>System Task To Post Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link tamm.SystemTaskToPostCondition}.
	 * It is bidirectional and its opposite is '{@link tamm.SystemTaskToPostCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Task To Post Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Task To Post Conditions</em>' containment reference list.
	 * @see tamm.TammPackage#getContextAwareSystem_SystemTaskToPostConditions()
	 * @see tamm.SystemTaskToPostCondition#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<SystemTaskToPostCondition> getSystemTaskToPostConditions();

} // ContextAwareSystem
