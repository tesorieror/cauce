/**
 */
package rsmm.tests;

import junit.textui.TestRunner;

import rsmm.RsmmFactory;
import rsmm.SpaceToSpaceReferenceDependency;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Space To Space Reference Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpaceToSpaceReferenceDependencyTest extends ReferenceDependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpaceToSpaceReferenceDependencyTest.class);
	}

	/**
	 * Constructs a new Space To Space Reference Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceToSpaceReferenceDependencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Space To Space Reference Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SpaceToSpaceReferenceDependency getFixture() {
		return (SpaceToSpaceReferenceDependency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RsmmFactory.eINSTANCE.createSpaceToSpaceReferenceDependency());
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

} //SpaceToSpaceReferenceDependencyTest
