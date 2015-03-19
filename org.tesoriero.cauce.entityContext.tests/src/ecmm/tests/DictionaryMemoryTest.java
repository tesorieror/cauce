/**
 */
package ecmm.tests;

import ecmm.DictionaryMemory;
import ecmm.EcmmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dictionary Memory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DictionaryMemoryTest extends ContextMemoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DictionaryMemoryTest.class);
	}

	/**
	 * Constructs a new Dictionary Memory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryMemoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dictionary Memory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DictionaryMemory getFixture() {
		return (DictionaryMemory)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcmmFactory.eINSTANCE.createDictionaryMemory());
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

} //DictionaryMemoryTest
