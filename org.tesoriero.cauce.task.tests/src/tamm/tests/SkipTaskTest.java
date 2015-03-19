/**
 */
package tamm.tests;

import junit.textui.TestRunner;

import tamm.SkipTask;
import tamm.TammFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Skip Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkipTaskTest extends SystemTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SkipTaskTest.class);
	}

	/**
	 * Constructs a new Skip Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkipTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Skip Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SkipTask getFixture() {
		return (SkipTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TammFactory.eINSTANCE.createSkipTask());
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

} //SkipTaskTest
