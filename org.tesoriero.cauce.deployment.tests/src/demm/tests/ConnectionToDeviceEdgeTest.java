/**
 */
package demm.tests;

import demm.ConnectionToDeviceEdge;
import demm.DemmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connection To Device Edge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionToDeviceEdgeTest extends EdgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConnectionToDeviceEdgeTest.class);
	}

	/**
	 * Constructs a new Connection To Device Edge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionToDeviceEdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Connection To Device Edge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConnectionToDeviceEdge getFixture() {
		return (ConnectionToDeviceEdge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DemmFactory.eINSTANCE.createConnectionToDeviceEdge());
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

} //ConnectionToDeviceEdgeTest
