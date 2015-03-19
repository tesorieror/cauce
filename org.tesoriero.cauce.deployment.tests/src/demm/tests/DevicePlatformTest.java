/**
 */
package demm.tests;

import demm.DemmFactory;
import demm.DevicePlatform;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device Platform</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevicePlatformTest extends PlatformTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DevicePlatformTest.class);
	}

	/**
	 * Constructs a new Device Platform test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicePlatformTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Device Platform test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DevicePlatform getFixture() {
		return (DevicePlatform)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DemmFactory.eINSTANCE.createDevicePlatform());
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

} //DevicePlatformTest
