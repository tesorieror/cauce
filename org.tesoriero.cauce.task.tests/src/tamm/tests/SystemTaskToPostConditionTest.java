/**
 */
package tamm.tests;

import junit.textui.TestRunner;

import tamm.SystemTaskToPostCondition;
import tamm.TammFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Task To Post Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemTaskToPostConditionTest extends EdgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemTaskToPostConditionTest.class);
	}

	/**
	 * Constructs a new System Task To Post Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTaskToPostConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Task To Post Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemTaskToPostCondition getFixture() {
		return (SystemTaskToPostCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TammFactory.eINSTANCE.createSystemTaskToPostCondition());
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

} //SystemTaskToPostConditionTest
