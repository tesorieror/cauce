/**
 */
package ecmm.tests;

import ecmm.EcmmFactory;
import ecmm.StackMemory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stack Memory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StackMemoryTest extends ContextMemoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StackMemoryTest.class);
	}

	/**
	 * Constructs a new Stack Memory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackMemoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stack Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StackMemory getFixture() {
		return (StackMemory)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcmmFactory.eINSTANCE.createStackMemory());
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

} //StackMemoryTest
