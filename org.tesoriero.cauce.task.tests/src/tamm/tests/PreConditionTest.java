/**
 */
package tamm.tests;

import junit.textui.TestRunner;

import tamm.PreCondition;
import tamm.TammFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pre Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreConditionTest extends TaskOutputConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PreConditionTest.class);
	}

	/**
	 * Constructs a new Pre Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pre Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PreCondition getFixture() {
		return (PreCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TammFactory.eINSTANCE.createPreCondition());
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

} //PreConditionTest
