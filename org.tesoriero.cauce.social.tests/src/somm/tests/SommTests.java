/**
 */
package somm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>somm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SommTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SommTests("somm Tests");
		suite.addTestSuite(RoleTest.class);
		suite.addTestSuite(IndividualInstanceTest.class);
		suite.addTestSuite(SocialInstanceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SommTests(String name) {
		super(name);
	}

} //SommTests
