/**
 */
package demm.tests;

import demm.DemmFactory;
import demm.DevelopmentEnvironment;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Development Environment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevelopmentEnvironmentTest extends TestCase {

	/**
	 * The fixture for this Development Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentEnvironment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DevelopmentEnvironmentTest.class);
	}

	/**
	 * Constructs a new Development Environment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentEnvironmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Development Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DevelopmentEnvironment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Development Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentEnvironment getFixture() {
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
		setFixture(DemmFactory.eINSTANCE.createDevelopmentEnvironment());
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

} //DevelopmentEnvironmentTest
