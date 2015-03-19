/**
 */
package tamm.tests;

import junit.textui.TestRunner;

import tamm.PreConditionToSystemTask;
import tamm.TammFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pre Condition To System Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreConditionToSystemTaskTest extends EdgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PreConditionToSystemTaskTest.class);
	}

	/**
	 * Constructs a new Pre Condition To System Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreConditionToSystemTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pre Condition To System Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PreConditionToSystemTask getFixture() {
		return (PreConditionToSystemTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TammFactory.eINSTANCE.createPreConditionToSystemTask());
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

} //PreConditionToSystemTaskTest
