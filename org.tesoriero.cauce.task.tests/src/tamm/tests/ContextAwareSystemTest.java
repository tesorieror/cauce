/**
 */
package tamm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tamm.ContextAwareSystem;
import tamm.TammFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Context Aware System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextAwareSystemTest extends TestCase {

	/**
	 * The fixture for this Context Aware System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextAwareSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContextAwareSystemTest.class);
	}

	/**
	 * Constructs a new Context Aware System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAwareSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Context Aware System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ContextAwareSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Context Aware System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextAwareSystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TammFactory.eINSTANCE.createContextAwareSystem());
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

} //ContextAwareSystemTest
