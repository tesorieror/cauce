/**
 */
package tamm.tests;

import junit.textui.TestRunner;

import tamm.InputConditionToJoinTask;
import tamm.TammFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Condition To Join Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputConditionToJoinTaskTest extends InputConditionToRouteTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputConditionToJoinTaskTest.class);
	}

	/**
	 * Constructs a new Input Condition To Join Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConditionToJoinTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Input Condition To Join Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InputConditionToJoinTask getFixture() {
		return (InputConditionToJoinTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TammFactory.eINSTANCE.createInputConditionToJoinTask());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InputConditionToJoinTaskTest
