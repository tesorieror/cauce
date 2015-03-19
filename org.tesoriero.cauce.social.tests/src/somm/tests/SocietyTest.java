/**
 */
package somm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import somm.Society;
import somm.SommFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Society</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SocietyTest extends TestCase {

	/**
	 * The fixture for this Society test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Society fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SocietyTest.class);
	}

	/**
	 * Constructs a new Society test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocietyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Society test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Society fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Society test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Society getFixture() {
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
		setFixture(SommFactory.eINSTANCE.createSociety());
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

} //SocietyTest
