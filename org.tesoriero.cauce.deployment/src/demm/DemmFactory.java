/**
 */
package demm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see demm.DemmPackage
 * @generated
 */
public interface DemmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DemmFactory eINSTANCE = demm.impl.DemmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Development Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Development Environment</em>'.
	 * @generated
	 */
	DevelopmentEnvironment createDevelopmentEnvironment();

	/**
	 * Returns a new object of class '<em>Medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medium</em>'.
	 * @generated
	 */
	Medium createMedium();

	/**
	 * Returns a new object of class '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol</em>'.
	 * @generated
	 */
	Protocol createProtocol();

	/**
	 * Returns a new object of class '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operating System</em>'.
	 * @generated
	 */
	OperatingSystem createOperatingSystem();

	/**
	 * Returns a new object of class '<em>Programming Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programming Language</em>'.
	 * @generated
	 */
	ProgrammingLanguage createProgrammingLanguage();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Connection Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Platform</em>'.
	 * @generated
	 */
	ConnectionPlatform createConnectionPlatform();

	/**
	 * Returns a new object of class '<em>Device Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Platform</em>'.
	 * @generated
	 */
	DevicePlatform createDevicePlatform();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information</em>'.
	 * @generated
	 */
	Information createInformation();

	/**
	 * Returns a new object of class '<em>Device To Connection Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device To Connection Edge</em>'.
	 * @generated
	 */
	DeviceToConnectionEdge createDeviceToConnectionEdge();

	/**
	 * Returns a new object of class '<em>Connection To Device Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection To Device Edge</em>'.
	 * @generated
	 */
	ConnectionToDeviceEdge createConnectionToDeviceEdge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DemmPackage getDemmPackage();

} //DemmFactory
