/**
 */
package spmm.tests;

import junit.textui.TestRunner;

import spmm.Contention;
import spmm.SpmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contention</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentionTest extends SpaceRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContentionTest.class);
	}

	/**
	 * Constructs a new Contention test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Contention test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Contention getFixture() {
		return (Contention)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmmFactory.eINSTANCE.createContention());
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

} //ContentionTest
