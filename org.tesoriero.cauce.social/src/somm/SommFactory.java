/**
 */
package somm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see somm.SommPackage
 * @generated
 */
public interface SommFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SommFactory eINSTANCE = somm.impl.SommFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Individual Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Realization</em>'.
	 * @generated
	 */
	IndividualRealization createIndividualRealization();

	/**
	 * Returns a new object of class '<em>Society</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Society</em>'.
	 * @generated
	 */
	Society createSociety();

	/**
	 * Returns a new object of class '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialization</em>'.
	 * @generated
	 */
	Specialization createSpecialization();

	/**
	 * Returns a new object of class '<em>Individual Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Instance</em>'.
	 * @generated
	 */
	IndividualInstance createIndividualInstance();

	/**
	 * Returns a new object of class '<em>Social Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social Instance</em>'.
	 * @generated
	 */
	SocialInstance createSocialInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SommPackage getSommPackage();

} //SommFactory
