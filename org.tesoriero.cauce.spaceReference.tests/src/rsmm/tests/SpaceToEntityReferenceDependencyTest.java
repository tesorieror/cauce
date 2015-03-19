/**
 */
package rsmm.tests;

import junit.textui.TestRunner;

import rsmm.RsmmFactory;
import rsmm.SpaceToEntityReferenceDependency;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Space To Entity Reference Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpaceToEntityReferenceDependencyTest extends ReferenceDependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpaceToEntityReferenceDependencyTest.class);
	}

	/**
	 * Constructs a new Space To Entity Reference Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceToEntityReferenceDependencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Space To Entity Reference Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SpaceToEntityReferenceDependency getFixture() {
		return (SpaceToEntityReferenceDependency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RsmmFactory.eINSTANCE.createSpaceToEntityReferenceDependency());
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

} //SpaceToEntityReferenceDependencyTest
