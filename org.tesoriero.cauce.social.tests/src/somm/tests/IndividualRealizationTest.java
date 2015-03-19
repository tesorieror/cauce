/**
 */
package somm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import somm.IndividualRealization;
import somm.SommFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Individual Realization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndividualRealizationTest extends TestCase {

	/**
	 * The fixture for this Individual Realization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualRealization fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndividualRealizationTest.class);
	}

	/**
	 * Constructs a new Individual Realization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualRealizationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Individual Realization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IndividualRealization fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Individual Realization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualRealization getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SommFactory.eINSTANCE.createIndividualRealization());
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

} //IndividualRealizationTest
