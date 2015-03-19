/**
 */
package demm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see demm.DemmFactory
 * @model kind="package"
 * @generated
 */
public interface DemmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "demm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tesoriero.org/cauce/deployment/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "demm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DemmPackage eINSTANCE = demm.impl.DemmPackageImpl.init();

	/**
	 * The meta object id for the '{@link demm.impl.DevelopmentEnvironmentImpl <em>Development Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.DevelopmentEnvironmentImpl
	 * @see demm.impl.DemmPackageImpl#getDevelopmentEnvironment()
	 * @generated
	 */
	int DEVELOPMENT_ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__MEDIUMS = 0;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__PROTOCOLS = 1;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__LANGUAGES = 2;

	/**
	 * The feature id for the '<em><b>Os</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__OS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__ID = 5;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__CONNECTIONS = 6;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__DEVICES = 7;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__EDGES = 8;

	/**
	 * The number of structural features of the '<em>Development Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Development Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demm.impl.MediumImpl <em>Medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.MediumImpl
	 * @see demm.impl.DemmPackageImpl#getMedium()
	 * @generated
	 */
	int MEDIUM = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__TECHNOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__ENVIRONMENT = 3;

	/**
	 * The number of structural features of the '<em>Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demm.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.ProtocolImpl
	 * @see demm.impl.DemmPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__ENVIRONMENT = 2;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demm.impl.OperatingSystemImpl <em>Operating System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.OperatingSystemImpl
	 * @see demm.impl.DemmPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__REVISION = 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__ENVIRONMENT = 3;

	/**
	 * The number of structural features of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demm.impl.ProgrammingLanguageImpl <em>Programming Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.ProgrammingLanguageImpl
	 * @see demm.impl.DemmPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_LANGUAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_LANGUAGE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_LANGUAGE__PROFILE = 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_LANGUAGE__REVISION = 3;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_LANGUAGE__ENVIRONMENT = 4;

	/**
	 * The number of structural features of the '<em>Programming Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_LANGUAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Programming Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demm.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.DeviceImpl
	 * @see demm.impl.DemmPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 5;

	/**
	 * The feature id for the '<em><b>Platforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PLATFORMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = 2;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ENTITIES = 3;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ONGOING = 4;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__INCOMING = 5;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ENVIRONMENT = 6;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demm.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.ConnectionImpl
	 * @see demm.impl.DemmPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Platforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PLATFORMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ID = 2;

	/**
	 * The feature id for the '<em><b>Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ENVIRONMENT = 4;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ONGOING = 5;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__INCOMING = 6;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demm.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.PlatformImpl
	 * @see demm.impl.DemmPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__ID = 1;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demm.impl.ConnectionPlatformImpl <em>Connection Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.ConnectionPlatformImpl
	 * @see demm.impl.DemmPackageImpl#getConnectionPlatform()
	 * @generated
	 */
	int CONNECTION_PLATFORM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PLATFORM__NAME = PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PLATFORM__ID = PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PLATFORM__CONNECTION = PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PLATFORM__PROTOCOL = PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Medium</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PLATFORM__MEDIUM = PLATFORM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PLATFORM_FEATURE_COUNT = PLATFORM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PLATFORM_OPERATION_COUNT = PLATFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link demm.impl.DevicePlatformImpl <em>Device Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.DevicePlatformImpl
	 * @see demm.impl.DemmPackageImpl#getDevicePlatform()
	 * @generated
	 */
	int DEVICE_PLATFORM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PLATFORM__NAME = PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PLATFORM__ID = PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Device</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PLATFORM__DEVICE = PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PLATFORM__LANGUAGE = PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PLATFORM__OS = PLATFORM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Device Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PLATFORM_FEATURE_COUNT = PLATFORM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Device Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PLATFORM_OPERATION_COUNT = PLATFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link demm.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.EntityImpl
	 * @see demm.impl.DemmPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DEVICE = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demm.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.InformationImpl
	 * @see demm.impl.DemmPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 11;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demm.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.EdgeImpl
	 * @see demm.impl.DemmPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ENVIRONMENT = 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link demm.impl.DeviceToConnectionEdgeImpl <em>Device To Connection Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.DeviceToConnectionEdgeImpl
	 * @see demm.impl.DemmPackageImpl#getDeviceToConnectionEdge()
	 * @generated
	 */
	int DEVICE_TO_CONNECTION_EDGE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_CONNECTION_EDGE__ID = EDGE__ID;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_CONNECTION_EDGE__ENVIRONMENT = EDGE__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_CONNECTION_EDGE__SOURCE = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_CONNECTION_EDGE__TARGET = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device To Connection Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_CONNECTION_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Device To Connection Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_CONNECTION_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link demm.impl.ConnectionToDeviceEdgeImpl <em>Connection To Device Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see demm.impl.ConnectionToDeviceEdgeImpl
	 * @see demm.impl.DemmPackageImpl#getConnectionToDeviceEdge()
	 * @generated
	 */
	int CONNECTION_TO_DEVICE_EDGE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TO_DEVICE_EDGE__ID = EDGE__ID;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TO_DEVICE_EDGE__ENVIRONMENT = EDGE__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TO_DEVICE_EDGE__SOURCE = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TO_DEVICE_EDGE__TARGET = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection To Device Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TO_DEVICE_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connection To Device Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TO_DEVICE_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link demm.DevelopmentEnvironment <em>Development Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Environment</em>'.
	 * @see demm.DevelopmentEnvironment
	 * @generated
	 */
	EClass getDevelopmentEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link demm.DevelopmentEnvironment#getMediums <em>Mediums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mediums</em>'.
	 * @see demm.DevelopmentEnvironment#getMediums()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EReference getDevelopmentEnvironment_Mediums();

	/**
	 * Returns the meta object for the containment reference list '{@link demm.DevelopmentEnvironment#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see demm.DevelopmentEnvironment#getProtocols()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EReference getDevelopmentEnvironment_Protocols();

	/**
	 * Returns the meta object for the containment reference list '{@link demm.DevelopmentEnvironment#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see demm.DevelopmentEnvironment#getLanguages()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EReference getDevelopmentEnvironment_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link demm.DevelopmentEnvironment#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os</em>'.
	 * @see demm.DevelopmentEnvironment#getOs()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EReference getDevelopmentEnvironment_Os();

	/**
	 * Returns the meta object for the attribute '{@link demm.DevelopmentEnvironment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see demm.DevelopmentEnvironment#getName()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EAttribute getDevelopmentEnvironment_Name();

	/**
	 * Returns the meta object for the attribute '{@link demm.DevelopmentEnvironment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see demm.DevelopmentEnvironment#getId()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EAttribute getDevelopmentEnvironment_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link demm.DevelopmentEnvironment#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see demm.DevelopmentEnvironment#getConnections()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EReference getDevelopmentEnvironment_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link demm.DevelopmentEnvironment#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see demm.DevelopmentEnvironment#getDevices()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EReference getDevelopmentEnvironment_Devices();

	/**
	 * Returns the meta object for the containment reference list '{@link demm.DevelopmentEnvironment#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see demm.DevelopmentEnvironment#getEdges()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EReference getDevelopmentEnvironment_Edges();

	/**
	 * Returns the meta object for class '{@link demm.Medium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medium</em>'.
	 * @see demm.Medium
	 * @generated
	 */
	EClass getMedium();

	/**
	 * Returns the meta object for the attribute '{@link demm.Medium#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see demm.Medium#getType()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_Type();

	/**
	 * Returns the meta object for the attribute '{@link demm.Medium#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see demm.Medium#getTechnology()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_Technology();

	/**
	 * Returns the meta object for the attribute '{@link demm.Medium#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see demm.Medium#getVersion()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_Version();

	/**
	 * Returns the meta object for the container reference '{@link demm.Medium#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see demm.Medium#getEnvironment()
	 * @see #getMedium()
	 * @generated
	 */
	EReference getMedium_Environment();

	/**
	 * Returns the meta object for class '{@link demm.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see demm.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the attribute '{@link demm.Protocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see demm.Protocol#getName()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Name();

	/**
	 * Returns the meta object for the attribute '{@link demm.Protocol#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see demm.Protocol#getVersion()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Version();

	/**
	 * Returns the meta object for the container reference '{@link demm.Protocol#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see demm.Protocol#getEnvironment()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Environment();

	/**
	 * Returns the meta object for class '{@link demm.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System</em>'.
	 * @see demm.OperatingSystem
	 * @generated
	 */
	EClass getOperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link demm.OperatingSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see demm.OperatingSystem#getName()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link demm.OperatingSystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see demm.OperatingSystem#getVersion()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Version();

	/**
	 * Returns the meta object for the attribute '{@link demm.OperatingSystem#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see demm.OperatingSystem#getRevision()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Revision();

	/**
	 * Returns the meta object for the container reference '{@link demm.OperatingSystem#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see demm.OperatingSystem#getEnvironment()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EReference getOperatingSystem_Environment();

	/**
	 * Returns the meta object for class '{@link demm.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programming Language</em>'.
	 * @see demm.ProgrammingLanguage
	 * @generated
	 */
	EClass getProgrammingLanguage();

	/**
	 * Returns the meta object for the attribute '{@link demm.ProgrammingLanguage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see demm.ProgrammingLanguage#getName()
	 * @see #getProgrammingLanguage()
	 * @generated
	 */
	EAttribute getProgrammingLanguage_Name();

	/**
	 * Returns the meta object for the attribute '{@link demm.ProgrammingLanguage#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see demm.ProgrammingLanguage#getVersion()
	 * @see #getProgrammingLanguage()
	 * @generated
	 */
	EAttribute getProgrammingLanguage_Version();

	/**
	 * Returns the meta object for the attribute '{@link demm.ProgrammingLanguage#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see demm.ProgrammingLanguage#getProfile()
	 * @see #getProgrammingLanguage()
	 * @generated
	 */
	EAttribute getProgrammingLanguage_Profile();

	/**
	 * Returns the meta object for the attribute '{@link demm.ProgrammingLanguage#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see demm.ProgrammingLanguage#getRevision()
	 * @see #getProgrammingLanguage()
	 * @generated
	 */
	EAttribute getProgrammingLanguage_Revision();

	/**
	 * Returns the meta object for the container reference '{@link demm.ProgrammingLanguage#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see demm.ProgrammingLanguage#getEnvironment()
	 * @see #getProgrammingLanguage()
	 * @generated
	 */
	EReference getProgrammingLanguage_Environment();

	/**
	 * Returns the meta object for class '{@link demm.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see demm.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link demm.Device#getPlatforms <em>Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platforms</em>'.
	 * @see demm.Device#getPlatforms()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Platforms();

	/**
	 * Returns the meta object for the attribute '{@link demm.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see demm.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the attribute '{@link demm.Device#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see demm.Device#getId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link demm.Device#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see demm.Device#getEntities()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Entities();

	/**
	 * Returns the meta object for the reference list '{@link demm.Device#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ongoing</em>'.
	 * @see demm.Device#getOngoing()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Ongoing();

	/**
	 * Returns the meta object for the reference list '{@link demm.Device#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see demm.Device#getIncoming()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Incoming();

	/**
	 * Returns the meta object for the container reference '{@link demm.Device#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see demm.Device#getEnvironment()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Environment();

	/**
	 * Returns the meta object for class '{@link demm.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see demm.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link demm.Connection#getPlatforms <em>Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platforms</em>'.
	 * @see demm.Connection#getPlatforms()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Platforms();

	/**
	 * Returns the meta object for the attribute '{@link demm.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see demm.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the attribute '{@link demm.Connection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see demm.Connection#getId()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link demm.Connection#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information</em>'.
	 * @see demm.Connection#getInformation()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Information();

	/**
	 * Returns the meta object for the container reference '{@link demm.Connection#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see demm.Connection#getEnvironment()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Environment();

	/**
	 * Returns the meta object for the reference list '{@link demm.Connection#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ongoing</em>'.
	 * @see demm.Connection#getOngoing()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Ongoing();

	/**
	 * Returns the meta object for the reference list '{@link demm.Connection#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see demm.Connection#getIncoming()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Incoming();

	/**
	 * Returns the meta object for class '{@link demm.ConnectionPlatform <em>Connection Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Platform</em>'.
	 * @see demm.ConnectionPlatform
	 * @generated
	 */
	EClass getConnectionPlatform();

	/**
	 * Returns the meta object for the container reference '{@link demm.ConnectionPlatform#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connection</em>'.
	 * @see demm.ConnectionPlatform#getConnection()
	 * @see #getConnectionPlatform()
	 * @generated
	 */
	EReference getConnectionPlatform_Connection();

	/**
	 * Returns the meta object for the reference '{@link demm.ConnectionPlatform#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see demm.ConnectionPlatform#getProtocol()
	 * @see #getConnectionPlatform()
	 * @generated
	 */
	EReference getConnectionPlatform_Protocol();

	/**
	 * Returns the meta object for the reference '{@link demm.ConnectionPlatform#getMedium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Medium</em>'.
	 * @see demm.ConnectionPlatform#getMedium()
	 * @see #getConnectionPlatform()
	 * @generated
	 */
	EReference getConnectionPlatform_Medium();

	/**
	 * Returns the meta object for class '{@link demm.DevicePlatform <em>Device Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Platform</em>'.
	 * @see demm.DevicePlatform
	 * @generated
	 */
	EClass getDevicePlatform();

	/**
	 * Returns the meta object for the container reference '{@link demm.DevicePlatform#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Device</em>'.
	 * @see demm.DevicePlatform#getDevice()
	 * @see #getDevicePlatform()
	 * @generated
	 */
	EReference getDevicePlatform_Device();

	/**
	 * Returns the meta object for the reference '{@link demm.DevicePlatform#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see demm.DevicePlatform#getLanguage()
	 * @see #getDevicePlatform()
	 * @generated
	 */
	EReference getDevicePlatform_Language();

	/**
	 * Returns the meta object for the reference '{@link demm.DevicePlatform#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Os</em>'.
	 * @see demm.DevicePlatform#getOs()
	 * @see #getDevicePlatform()
	 * @generated
	 */
	EReference getDevicePlatform_Os();

	/**
	 * Returns the meta object for class '{@link demm.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see demm.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link demm.Platform#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see demm.Platform#getName()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Name();

	/**
	 * Returns the meta object for the attribute '{@link demm.Platform#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see demm.Platform#getId()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Id();

	/**
	 * Returns the meta object for class '{@link demm.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see demm.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link demm.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see demm.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the container reference '{@link demm.Entity#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Device</em>'.
	 * @see demm.Entity#getDevice()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Device();

	/**
	 * Returns the meta object for class '{@link demm.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see demm.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the container reference '{@link demm.Information#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connection</em>'.
	 * @see demm.Information#getConnection()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Connection();

	/**
	 * Returns the meta object for the attribute '{@link demm.Information#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see demm.Information#getName()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Name();

	/**
	 * Returns the meta object for class '{@link demm.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see demm.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link demm.Edge#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see demm.Edge#getId()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Id();

	/**
	 * Returns the meta object for the container reference '{@link demm.Edge#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see demm.Edge#getEnvironment()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Environment();

	/**
	 * Returns the meta object for class '{@link demm.DeviceToConnectionEdge <em>Device To Connection Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device To Connection Edge</em>'.
	 * @see demm.DeviceToConnectionEdge
	 * @generated
	 */
	EClass getDeviceToConnectionEdge();

	/**
	 * Returns the meta object for the reference '{@link demm.DeviceToConnectionEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see demm.DeviceToConnectionEdge#getSource()
	 * @see #getDeviceToConnectionEdge()
	 * @generated
	 */
	EReference getDeviceToConnectionEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link demm.DeviceToConnectionEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see demm.DeviceToConnectionEdge#getTarget()
	 * @see #getDeviceToConnectionEdge()
	 * @generated
	 */
	EReference getDeviceToConnectionEdge_Target();

	/**
	 * Returns the meta object for class '{@link demm.ConnectionToDeviceEdge <em>Connection To Device Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection To Device Edge</em>'.
	 * @see demm.ConnectionToDeviceEdge
	 * @generated
	 */
	EClass getConnectionToDeviceEdge();

	/**
	 * Returns the meta object for the reference '{@link demm.ConnectionToDeviceEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see demm.ConnectionToDeviceEdge#getSource()
	 * @see #getConnectionToDeviceEdge()
	 * @generated
	 */
	EReference getConnectionToDeviceEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link demm.ConnectionToDeviceEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see demm.ConnectionToDeviceEdge#getTarget()
	 * @see #getConnectionToDeviceEdge()
	 * @generated
	 */
	EReference getConnectionToDeviceEdge_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DemmFactory getDemmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link demm.impl.DevelopmentEnvironmentImpl <em>Development Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.DevelopmentEnvironmentImpl
		 * @see demm.impl.DemmPackageImpl#getDevelopmentEnvironment()
		 * @generated
		 */
		EClass DEVELOPMENT_ENVIRONMENT = eINSTANCE.getDevelopmentEnvironment();

		/**
		 * The meta object literal for the '<em><b>Mediums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ENVIRONMENT__MEDIUMS = eINSTANCE.getDevelopmentEnvironment_Mediums();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ENVIRONMENT__PROTOCOLS = eINSTANCE.getDevelopmentEnvironment_Protocols();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ENVIRONMENT__LANGUAGES = eINSTANCE.getDevelopmentEnvironment_Languages();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ENVIRONMENT__OS = eINSTANCE.getDevelopmentEnvironment_Os();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPMENT_ENVIRONMENT__NAME = eINSTANCE.getDevelopmentEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPMENT_ENVIRONMENT__ID = eINSTANCE.getDevelopmentEnvironment_Id();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ENVIRONMENT__CONNECTIONS = eINSTANCE.getDevelopmentEnvironment_Connections();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ENVIRONMENT__DEVICES = eINSTANCE.getDevelopmentEnvironment_Devices();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ENVIRONMENT__EDGES = eINSTANCE.getDevelopmentEnvironment_Edges();

		/**
		 * The meta object literal for the '{@link demm.impl.MediumImpl <em>Medium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.MediumImpl
		 * @see demm.impl.DemmPackageImpl#getMedium()
		 * @generated
		 */
		EClass MEDIUM = eINSTANCE.getMedium();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__TYPE = eINSTANCE.getMedium_Type();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__TECHNOLOGY = eINSTANCE.getMedium_Technology();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__VERSION = eINSTANCE.getMedium_Version();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIUM__ENVIRONMENT = eINSTANCE.getMedium_Environment();

		/**
		 * The meta object literal for the '{@link demm.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.ProtocolImpl
		 * @see demm.impl.DemmPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__VERSION = eINSTANCE.getProtocol_Version();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__ENVIRONMENT = eINSTANCE.getProtocol_Environment();

		/**
		 * The meta object literal for the '{@link demm.impl.OperatingSystemImpl <em>Operating System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.OperatingSystemImpl
		 * @see demm.impl.DemmPackageImpl#getOperatingSystem()
		 * @generated
		 */
		EClass OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__NAME = eINSTANCE.getOperatingSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__VERSION = eINSTANCE.getOperatingSystem_Version();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__REVISION = eINSTANCE.getOperatingSystem_Revision();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_SYSTEM__ENVIRONMENT = eINSTANCE.getOperatingSystem_Environment();

		/**
		 * The meta object literal for the '{@link demm.impl.ProgrammingLanguageImpl <em>Programming Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.ProgrammingLanguageImpl
		 * @see demm.impl.DemmPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EClass PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMING_LANGUAGE__NAME = eINSTANCE.getProgrammingLanguage_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMING_LANGUAGE__VERSION = eINSTANCE.getProgrammingLanguage_Version();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMING_LANGUAGE__PROFILE = eINSTANCE.getProgrammingLanguage_Profile();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMING_LANGUAGE__REVISION = eINSTANCE.getProgrammingLanguage_Revision();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMMING_LANGUAGE__ENVIRONMENT = eINSTANCE.getProgrammingLanguage_Environment();

		/**
		 * The meta object literal for the '{@link demm.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.DeviceImpl
		 * @see demm.impl.DemmPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Platforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__PLATFORMS = eINSTANCE.getDevice_Platforms();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__ID = eINSTANCE.getDevice_Id();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__ENTITIES = eINSTANCE.getDevice_Entities();

		/**
		 * The meta object literal for the '<em><b>Ongoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__ONGOING = eINSTANCE.getDevice_Ongoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__INCOMING = eINSTANCE.getDevice_Incoming();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__ENVIRONMENT = eINSTANCE.getDevice_Environment();

		/**
		 * The meta object literal for the '{@link demm.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.ConnectionImpl
		 * @see demm.impl.DemmPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Platforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PLATFORMS = eINSTANCE.getConnection_Platforms();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__ID = eINSTANCE.getConnection_Id();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__INFORMATION = eINSTANCE.getConnection_Information();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ENVIRONMENT = eINSTANCE.getConnection_Environment();

		/**
		 * The meta object literal for the '<em><b>Ongoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ONGOING = eINSTANCE.getConnection_Ongoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__INCOMING = eINSTANCE.getConnection_Incoming();

		/**
		 * The meta object literal for the '{@link demm.impl.ConnectionPlatformImpl <em>Connection Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.ConnectionPlatformImpl
		 * @see demm.impl.DemmPackageImpl#getConnectionPlatform()
		 * @generated
		 */
		EClass CONNECTION_PLATFORM = eINSTANCE.getConnectionPlatform();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_PLATFORM__CONNECTION = eINSTANCE.getConnectionPlatform_Connection();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_PLATFORM__PROTOCOL = eINSTANCE.getConnectionPlatform_Protocol();

		/**
		 * The meta object literal for the '<em><b>Medium</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_PLATFORM__MEDIUM = eINSTANCE.getConnectionPlatform_Medium();

		/**
		 * The meta object literal for the '{@link demm.impl.DevicePlatformImpl <em>Device Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.DevicePlatformImpl
		 * @see demm.impl.DemmPackageImpl#getDevicePlatform()
		 * @generated
		 */
		EClass DEVICE_PLATFORM = eINSTANCE.getDevicePlatform();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_PLATFORM__DEVICE = eINSTANCE.getDevicePlatform_Device();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_PLATFORM__LANGUAGE = eINSTANCE.getDevicePlatform_Language();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_PLATFORM__OS = eINSTANCE.getDevicePlatform_Os();

		/**
		 * The meta object literal for the '{@link demm.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.PlatformImpl
		 * @see demm.impl.DemmPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__NAME = eINSTANCE.getPlatform_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__ID = eINSTANCE.getPlatform_Id();

		/**
		 * The meta object literal for the '{@link demm.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.EntityImpl
		 * @see demm.impl.DemmPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__DEVICE = eINSTANCE.getEntity_Device();

		/**
		 * The meta object literal for the '{@link demm.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.InformationImpl
		 * @see demm.impl.DemmPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__CONNECTION = eINSTANCE.getInformation_Connection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__NAME = eINSTANCE.getInformation_Name();

		/**
		 * The meta object literal for the '{@link demm.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.EdgeImpl
		 * @see demm.impl.DemmPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__ID = eINSTANCE.getEdge_Id();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__ENVIRONMENT = eINSTANCE.getEdge_Environment();

		/**
		 * The meta object literal for the '{@link demm.impl.DeviceToConnectionEdgeImpl <em>Device To Connection Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.DeviceToConnectionEdgeImpl
		 * @see demm.impl.DemmPackageImpl#getDeviceToConnectionEdge()
		 * @generated
		 */
		EClass DEVICE_TO_CONNECTION_EDGE = eINSTANCE.getDeviceToConnectionEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TO_CONNECTION_EDGE__SOURCE = eINSTANCE.getDeviceToConnectionEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TO_CONNECTION_EDGE__TARGET = eINSTANCE.getDeviceToConnectionEdge_Target();

		/**
		 * The meta object literal for the '{@link demm.impl.ConnectionToDeviceEdgeImpl <em>Connection To Device Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see demm.impl.ConnectionToDeviceEdgeImpl
		 * @see demm.impl.DemmPackageImpl#getConnectionToDeviceEdge()
		 * @generated
		 */
		EClass CONNECTION_TO_DEVICE_EDGE = eINSTANCE.getConnectionToDeviceEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TO_DEVICE_EDGE__SOURCE = eINSTANCE.getConnectionToDeviceEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TO_DEVICE_EDGE__TARGET = eINSTANCE.getConnectionToDeviceEdge_Target();

	}

} //DemmPackage
