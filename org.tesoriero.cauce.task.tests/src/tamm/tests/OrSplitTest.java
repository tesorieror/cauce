/**
 */
package tamm.tests;

import junit.textui.TestRunner;

import tamm.OrSplit;
import tamm.TammFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Or Split</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrSplitTest extends SplitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrSplitTest.class);
	}

	/**
	 * Constructs a new Or Split test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrSplitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Or Split test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrSplit getFixture() {
		return (OrSplit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TammFactory.eINSTANCE.createOrSplit());
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

} //OrSplitTest
