/**
 */
package tamm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tamm.TammPackage
 * @generated
 */
public interface TammFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TammFactory eINSTANCE = tamm.impl.TammFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Context Aware System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Aware System</em>'.
	 * @generated
	 */
	ContextAwareSystem createContextAwareSystem();

	/**
	 * Returns a new object of class '<em>Pre Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Condition</em>'.
	 * @generated
	 */
	PreCondition createPreCondition();

	/**
	 * Returns a new object of class '<em>Post Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Condition</em>'.
	 * @generated
	 */
	PostCondition createPostCondition();

	/**
	 * Returns a new object of class '<em>Initial Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Condition</em>'.
	 * @generated
	 */
	InitialCondition createInitialCondition();

	/**
	 * Returns a new object of class '<em>Final Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final Condition</em>'.
	 * @generated
	 */
	FinalCondition createFinalCondition();

	/**
	 * Returns a new object of class '<em>Simple Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Task</em>'.
	 * @generated
	 */
	SimpleTask createSimpleTask();

	/**
	 * Returns a new object of class '<em>Skip Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skip Task</em>'.
	 * @generated
	 */
	SkipTask createSkipTask();

	/**
	 * Returns a new object of class '<em>Pre Condition To System Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Condition To System Task</em>'.
	 * @generated
	 */
	PreConditionToSystemTask createPreConditionToSystemTask();

	/**
	 * Returns a new object of class '<em>System Task To Post Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Task To Post Condition</em>'.
	 * @generated
	 */
	SystemTaskToPostCondition createSystemTaskToPostCondition();

	/**
	 * Returns a new object of class '<em>And Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Join</em>'.
	 * @generated
	 */
	AndJoin createAndJoin();

	/**
	 * Returns a new object of class '<em>Or Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Join</em>'.
	 * @generated
	 */
	OrJoin createOrJoin();

	/**
	 * Returns a new object of class '<em>And Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Split</em>'.
	 * @generated
	 */
	AndSplit createAndSplit();

	/**
	 * Returns a new object of class '<em>Or Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Split</em>'.
	 * @generated
	 */
	OrSplit createOrSplit();

	/**
	 * Returns a new object of class '<em>Input Condition To Join Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Condition To Join Task</em>'.
	 * @generated
	 */
	InputConditionToJoinTask createInputConditionToJoinTask();

	/**
	 * Returns a new object of class '<em>Input Condition To Split Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Condition To Split Task</em>'.
	 * @generated
	 */
	InputConditionToSplitTask createInputConditionToSplitTask();

	/**
	 * Returns a new object of class '<em>Join Task To Output Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Task To Output Condition</em>'.
	 * @generated
	 */
	JoinTaskToOutputCondition createJoinTaskToOutputCondition();

	/**
	 * Returns a new object of class '<em>Split Task To Output Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split Task To Output Condition</em>'.
	 * @generated
	 */
	SplitTaskToOutputCondition createSplitTaskToOutputCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TammPackage getTammPackage();

} //TammFactory
