/**
 */
package ifmm.tests;

import ifmm.IfmmFactory;
import ifmm.PointToPointInformationFlow;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Point To Point Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PointToPointInformationFlowTest extends InformationFlowTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PointToPointInformationFlowTest.class);
	}

	/**
	 * Constructs a new Point To Point Information Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointToPointInformationFlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Point To Point Information Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PointToPointInformationFlow getFixture() {
		return (PointToPointInformationFlow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IfmmFactory.eINSTANCE.createPointToPointInformationFlow());
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

} //PointToPointInformationFlowTest
