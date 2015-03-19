/**
 */
package somm.tests;

import junit.textui.TestRunner;

import somm.IndividualInstance;
import somm.SommFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Individual Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndividualInstanceTest extends SocialInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndividualInstanceTest.class);
	}

	/**
	 * Constructs a new Individual Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Individual Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IndividualInstance getFixture() {
		return (IndividualInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SommFactory.eINSTANCE.createIndividualInstance());
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

} //IndividualInstanceTest
