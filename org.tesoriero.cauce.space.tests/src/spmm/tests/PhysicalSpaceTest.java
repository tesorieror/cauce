/**
 */
package spmm.tests;

import junit.textui.TestRunner;

import spmm.PhysicalSpace;
import spmm.SpmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Physical Space</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalSpaceTest extends SpaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhysicalSpaceTest.class);
	}

	/**
	 * Constructs a new Physical Space test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalSpaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Physical Space test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PhysicalSpace getFixture() {
		return (PhysicalSpace)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmmFactory.eINSTANCE.createPhysicalSpace());
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

} //PhysicalSpaceTest
