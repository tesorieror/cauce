/**
 */
package tamm.tests;

import junit.textui.TestRunner;

import tamm.JoinTaskToOutputCondition;
import tamm.TammFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Join Task To Output Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoinTaskToOutputConditionTest extends RouteTaskToOutputConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JoinTaskToOutputConditionTest.class);
	}

	/**
	 * Constructs a new Join Task To Output Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinTaskToOutputConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Join Task To Output Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JoinTaskToOutputCondition getFixture() {
		return (JoinTaskToOutputCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TammFactory.eINSTANCE.createJoinTaskToOutputCondition());
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

} //JoinTaskToOutputConditionTest
