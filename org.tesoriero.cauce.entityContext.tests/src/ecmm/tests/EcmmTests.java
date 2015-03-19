/**
 */
package ecmm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ecmm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcmmTests extends TestSuite {

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
		TestSuite suite = new EcmmTests("ecmm Tests");
		suite.addTestSuite(EntityContextTest.class);
		suite.addTestSuite(ContextSituationTest.class);
		suite.addTestSuite(LogicMemoryTest.class);
		suite.addTestSuite(DictionaryMemoryTest.class);
		suite.addTestSuite(HolderMemoryTest.class);
		suite.addTestSuite(StackMemoryTest.class);
		suite.addTestSuite(TimeMemoryTest.class);
		suite.addTestSuite(ContextActionTest.class);
		suite.addTestSuite(SensingContextConditionTest.class);
		suite.addTestSuite(MemoryContextConditionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcmmTests(String name) {
		super(name);
	}

} //EcmmTests
