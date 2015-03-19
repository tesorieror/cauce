/**
 */
package ecmm.tests;

import ecmm.EcmmFactory;
import ecmm.HolderMemory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Holder Memory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HolderMemoryTest extends ContextMemoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HolderMemoryTest.class);
	}

	/**
	 * Constructs a new Holder Memory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HolderMemoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Holder Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HolderMemory getFixture() {
		return (HolderMemory)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcmmFactory.eINSTANCE.createHolderMemory());
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

} //HolderMemoryTest
