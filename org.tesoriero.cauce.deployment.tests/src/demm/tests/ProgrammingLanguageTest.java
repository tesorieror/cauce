/**
 */
package demm.tests;

import demm.DemmFactory;
import demm.ProgrammingLanguage;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Programming Language</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgrammingLanguageTest extends TestCase {

	/**
	 * The fixture for this Programming Language test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammingLanguage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgrammingLanguageTest.class);
	}

	/**
	 * Constructs a new Programming Language test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Programming Language test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProgrammingLanguage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Programming Language test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammingLanguage getFixture() {
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
		setFixture(DemmFactory.eINSTANCE.createProgrammingLanguage());
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

} //ProgrammingLanguageTest
