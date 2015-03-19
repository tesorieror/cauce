/**
 */
package spmm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import spmm.LocationUnit;
import spmm.SpmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Location Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationUnitTest extends TestCase {

	/**
	 * The fixture for this Location Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationUnit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocationUnitTest.class);
	}

	/**
	 * Constructs a new Location Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationUnitTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Location Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LocationUnit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Location Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationUnit getFixture() {
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
		setFixture(SpmmFactory.eINSTANCE.createLocationUnit());
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

} //LocationUnitTest
