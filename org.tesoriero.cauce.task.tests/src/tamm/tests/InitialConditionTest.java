/**
 */
package tamm.tests;

import junit.textui.TestRunner;

import tamm.InitialCondition;
import tamm.TammFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initial Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitialConditionTest extends TaskInputConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InitialConditionTest.class);
	}

	/**
	 * Constructs a new Initial Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Initial Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InitialCondition getFixture() {
		return (InitialCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TammFactory.eINSTANCE.createInitialCondition());
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

} //InitialConditionTest
