/**
 */
package ecmm.tests;

import ecmm.EcmmFactory;
import ecmm.SensingContextCondition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sensing Context Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensingContextConditionTest extends ContextConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensingContextConditionTest.class);
	}

	/**
	 * Constructs a new Sensing Context Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingContextConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sensing Context Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SensingContextCondition getFixture() {
		return (SensingContextCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcmmFactory.eINSTANCE.createSensingContextCondition());
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

} //SensingContextConditionTest
