/**
 */
package tamm.tests;

import junit.textui.TestRunner;

import tamm.InputConditionToSplitTask;
import tamm.TammFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Condition To Split Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputConditionToSplitTaskTest extends InputConditionToRouteTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputConditionToSplitTaskTest.class);
	}

	/**
	 * Constructs a new Input Condition To Split Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConditionToSplitTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Input Condition To Split Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InputConditionToSplitTask getFixture() {
		return (InputConditionToSplitTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TammFactory.eINSTANCE.createInputConditionToSplitTask());
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

} //InputConditionToSplitTaskTest
