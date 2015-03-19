/**
 */
package spmm.tests;

import junit.textui.TestRunner;

import spmm.SpmmFactory;
import spmm.VirtualSpace;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virtual Space</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualSpaceTest extends SpaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VirtualSpaceTest.class);
	}

	/**
	 * Constructs a new Virtual Space test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSpaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Virtual Space test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VirtualSpace getFixture() {
		return (VirtualSpace)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmmFactory.eINSTANCE.createVirtualSpace());
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

} //VirtualSpaceTest
