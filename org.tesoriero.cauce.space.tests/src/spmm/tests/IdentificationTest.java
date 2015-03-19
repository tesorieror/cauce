/**
 */
package spmm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import spmm.Identification;
import spmm.SpmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Identification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentificationTest extends TestCase {

	/**
	 * The fixture for this Identification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Identification fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IdentificationTest.class);
	}

	/**
	 * Constructs a new Identification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Identification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Identification fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Identification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Identification getFixture() {
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
		setFixture(SpmmFactory.eINSTANCE.createIdentification());
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

} //IdentificationTest
