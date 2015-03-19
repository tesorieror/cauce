/**
 */
package demm.tests;

import demm.DemmFactory;
import demm.DeviceToConnectionEdge;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device To Connection Edge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceToConnectionEdgeTest extends EdgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeviceToConnectionEdgeTest.class);
	}

	/**
	 * Constructs a new Device To Connection Edge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceToConnectionEdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Device To Connection Edge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeviceToConnectionEdge getFixture() {
		return (DeviceToConnectionEdge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DemmFactory.eINSTANCE.createDeviceToConnectionEdge());
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

} //DeviceToConnectionEdgeTest
