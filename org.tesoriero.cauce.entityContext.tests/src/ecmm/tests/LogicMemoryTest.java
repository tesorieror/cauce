/**
 */
package ecmm.tests;

import ecmm.EcmmFactory;
import ecmm.LogicMemory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logic Memory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicMemoryTest extends ContextMemoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogicMemoryTest.class);
	}

	/**
	 * Constructs a new Logic Memory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicMemoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Logic Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LogicMemory getFixture() {
		return (LogicMemory)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcmmFactory.eINSTANCE.createLogicMemory());
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

} //LogicMemoryTest
