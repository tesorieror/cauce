/**
 */
package ifmm.tests;

import ifmm.BroadcastInformationFlow;
import ifmm.IfmmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Broadcast Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BroadcastInformationFlowTest extends InformationFlowTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BroadcastInformationFlowTest.class);
	}

	/**
	 * Constructs a new Broadcast Information Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastInformationFlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Broadcast Information Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BroadcastInformationFlow getFixture() {
		return (BroadcastInformationFlow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IfmmFactory.eINSTANCE.createBroadcastInformationFlow());
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

} //BroadcastInformationFlowTest
