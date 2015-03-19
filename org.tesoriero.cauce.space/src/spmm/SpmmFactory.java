/**
 */
package spmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see spmm.SpmmPackage
 * @generated
 */
public interface SpmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpmmFactory eINSTANCE = spmm.impl.SpmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Universe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universe</em>'.
	 * @generated
	 */
	Universe createUniverse();

	/**
	 * Returns a new object of class '<em>Virtual Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Space</em>'.
	 * @generated
	 */
	VirtualSpace createVirtualSpace();

	/**
	 * Returns a new object of class '<em>Physical Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Space</em>'.
	 * @generated
	 */
	PhysicalSpace createPhysicalSpace();

	/**
	 * Returns a new object of class '<em>Location Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Unit</em>'.
	 * @generated
	 */
	LocationUnit createLocationUnit();

	/**
	 * Returns a new object of class '<em>Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identification</em>'.
	 * @generated
	 */
	Identification createIdentification();

	/**
	 * Returns a new object of class '<em>Grouping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grouping</em>'.
	 * @generated
	 */
	Grouping createGrouping();

	/**
	 * Returns a new object of class '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization</em>'.
	 * @generated
	 */
	Generalization createGeneralization();

	/**
	 * Returns a new object of class '<em>Contention</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contention</em>'.
	 * @generated
	 */
	Contention createContention();

	/**
	 * Returns a new object of class '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation</em>'.
	 * @generated
	 */
	Representation createRepresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpmmPackage getSpmmPackage();

} //SpmmFactory
