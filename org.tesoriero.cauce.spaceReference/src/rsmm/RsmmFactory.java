/**
 */
package rsmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rsmm.RsmmPackage
 * @generated
 */
public interface RsmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RsmmFactory eINSTANCE = rsmm.impl.RsmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Information Flow Reference Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Information Flow Reference Space</em>'.
	 * @generated
	 */
	SystemInformationFlowReferenceSpace createSystemInformationFlowReferenceSpace();

	/**
	 * Returns a new object of class '<em>Referential Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referential Space</em>'.
	 * @generated
	 */
	ReferentialSpace createReferentialSpace();

	/**
	 * Returns a new object of class '<em>Context Aware Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Aware Entity Reference</em>'.
	 * @generated
	 */
	ContextAwareEntityReference createContextAwareEntityReference();

	/**
	 * Returns a new object of class '<em>Space To Entity Reference Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Space To Entity Reference Dependency</em>'.
	 * @generated
	 */
	SpaceToEntityReferenceDependency createSpaceToEntityReferenceDependency();

	/**
	 * Returns a new object of class '<em>Space To Space Reference Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Space To Space Reference Dependency</em>'.
	 * @generated
	 */
	SpaceToSpaceReferenceDependency createSpaceToSpaceReferenceDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RsmmPackage getRsmmPackage();

} //RsmmFactory
