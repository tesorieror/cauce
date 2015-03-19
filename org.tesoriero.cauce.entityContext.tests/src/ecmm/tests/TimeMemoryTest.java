/**
 */
package ecmm.tests;

import ecmm.EcmmFactory;
import ecmm.TimeMemory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Memory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeMemoryTest extends ContextMemoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeMemoryTest.class);
	}

	/**
	 * Constructs a new Time Memory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeMemoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeMemory getFixture() {
		return (TimeMemory)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcmmFactory.eINSTANCE.createTimeMemory());
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

} //TimeMemoryTest
