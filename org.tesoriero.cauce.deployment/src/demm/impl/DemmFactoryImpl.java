/**
 */
package demm.impl;

import demm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemmFactoryImpl extends EFactoryImpl implements DemmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DemmFactory init() {
		try {
			DemmFactory theDemmFactory = (DemmFactory)EPackage.Registry.INSTANCE.getEFactory(DemmPackage.eNS_URI);
			if (theDemmFactory != null) {
				return theDemmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DemmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DemmPackage.DEVELOPMENT_ENVIRONMENT: return createDevelopmentEnvironment();
			case DemmPackage.MEDIUM: return createMedium();
			case DemmPackage.PROTOCOL: return createProtocol();
			case DemmPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case DemmPackage.PROGRAMMING_LANGUAGE: return createProgrammingLanguage();
			case DemmPackage.DEVICE: return createDevice();
			case DemmPackage.CONNECTION: return createConnection();
			case DemmPackage.CONNECTION_PLATFORM: return createConnectionPlatform();
			case DemmPackage.DEVICE_PLATFORM: return createDevicePlatform();
			case DemmPackage.ENTITY: return createEntity();
			case DemmPackage.INFORMATION: return createInformation();
			case DemmPackage.DEVICE_TO_CONNECTION_EDGE: return createDeviceToConnectionEdge();
			case DemmPackage.CONNECTION_TO_DEVICE_EDGE: return createConnectionToDeviceEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentEnvironment createDevelopmentEnvironment() {
		DevelopmentEnvironmentImpl developmentEnvironment = new DevelopmentEnvironmentImpl();
		return developmentEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medium createMedium() {
		MediumImpl medium = new MediumImpl();
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocol() {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem createOperatingSystem() {
		OperatingSystemImpl operatingSystem = new OperatingSystemImpl();
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage createProgrammingLanguage() {
		ProgrammingLanguageImpl programmingLanguage = new ProgrammingLanguageImpl();
		return programmingLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPlatform createConnectionPlatform() {
		ConnectionPlatformImpl connectionPlatform = new ConnectionPlatformImpl();
		return connectionPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicePlatform createDevicePlatform() {
		DevicePlatformImpl devicePlatform = new DevicePlatformImpl();
		return devicePlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceToConnectionEdge createDeviceToConnectionEdge() {
		DeviceToConnectionEdgeImpl deviceToConnectionEdge = new DeviceToConnectionEdgeImpl();
		return deviceToConnectionEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionToDeviceEdge createConnectionToDeviceEdge() {
		ConnectionToDeviceEdgeImpl connectionToDeviceEdge = new ConnectionToDeviceEdgeImpl();
		return connectionToDeviceEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemmPackage getDemmPackage() {
		return (DemmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DemmPackage getPackage() {
		return DemmPackage.eINSTANCE;
	}

} //DemmFactoryImpl
