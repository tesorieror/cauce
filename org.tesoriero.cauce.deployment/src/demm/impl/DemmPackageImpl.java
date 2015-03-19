/**
 */
package demm.impl;

import demm.Connection;
import demm.ConnectionPlatform;
import demm.ConnectionToDeviceEdge;
import demm.DemmFactory;
import demm.DemmPackage;
import demm.DevelopmentEnvironment;
import demm.Device;
import demm.DevicePlatform;
import demm.DeviceToConnectionEdge;
import demm.Edge;
import demm.Entity;
import demm.Information;
import demm.Medium;
import demm.OperatingSystem;
import demm.Platform;
import demm.ProgrammingLanguage;
import demm.Protocol;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemmPackageImpl extends EPackageImpl implements DemmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmingLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicePlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceToConnectionEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionToDeviceEdgeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see demm.DemmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DemmPackageImpl() {
		super(eNS_URI, DemmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DemmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DemmPackage init() {
		if (isInited) return (DemmPackage)EPackage.Registry.INSTANCE.getEPackage(DemmPackage.eNS_URI);

		// Obtain or create and register package
		DemmPackageImpl theDemmPackage = (DemmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DemmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DemmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDemmPackage.createPackageContents();

		// Initialize created meta-data
		theDemmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDemmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DemmPackage.eNS_URI, theDemmPackage);
		return theDemmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentEnvironment() {
		return developmentEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentEnvironment_Mediums() {
		return (EReference)developmentEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentEnvironment_Protocols() {
		return (EReference)developmentEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentEnvironment_Languages() {
		return (EReference)developmentEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentEnvironment_Os() {
		return (EReference)developmentEnvironmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevelopmentEnvironment_Name() {
		return (EAttribute)developmentEnvironmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevelopmentEnvironment_Id() {
		return (EAttribute)developmentEnvironmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentEnvironment_Connections() {
		return (EReference)developmentEnvironmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentEnvironment_Devices() {
		return (EReference)developmentEnvironmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevelopmentEnvironment_Edges() {
		return (EReference)developmentEnvironmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedium() {
		return mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_Type() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_Technology() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_Version() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedium_Environment() {
		return (EReference)mediumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocol() {
		return protocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocol_Name() {
		return (EAttribute)protocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocol_Version() {
		return (EAttribute)protocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocol_Environment() {
		return (EReference)protocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingSystem() {
		return operatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_Name() {
		return (EAttribute)operatingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_Version() {
		return (EAttribute)operatingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_Revision() {
		return (EAttribute)operatingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_Environment() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammingLanguage() {
		return programmingLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingLanguage_Name() {
		return (EAttribute)programmingLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingLanguage_Version() {
		return (EAttribute)programmingLanguageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingLanguage_Profile() {
		return (EAttribute)programmingLanguageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingLanguage_Revision() {
		return (EAttribute)programmingLanguageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgrammingLanguage_Environment() {
		return (EReference)programmingLanguageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Platforms() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Name() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Id() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Entities() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Ongoing() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Incoming() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Environment() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Platforms() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Name() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Id() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Information() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Environment() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Ongoing() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Incoming() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPlatform() {
		return connectionPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPlatform_Connection() {
		return (EReference)connectionPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPlatform_Protocol() {
		return (EReference)connectionPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPlatform_Medium() {
		return (EReference)connectionPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevicePlatform() {
		return devicePlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevicePlatform_Device() {
		return (EReference)devicePlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevicePlatform_Language() {
		return (EReference)devicePlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevicePlatform_Os() {
		return (EReference)devicePlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatform() {
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatform_Name() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatform_Id() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Device() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformation() {
		return informationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformation_Connection() {
		return (EReference)informationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Name() {
		return (EAttribute)informationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Id() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Environment() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceToConnectionEdge() {
		return deviceToConnectionEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceToConnectionEdge_Source() {
		return (EReference)deviceToConnectionEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceToConnectionEdge_Target() {
		return (EReference)deviceToConnectionEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionToDeviceEdge() {
		return connectionToDeviceEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionToDeviceEdge_Source() {
		return (EReference)connectionToDeviceEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionToDeviceEdge_Target() {
		return (EReference)connectionToDeviceEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemmFactory getDemmFactory() {
		return (DemmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		developmentEnvironmentEClass = createEClass(DEVELOPMENT_ENVIRONMENT);
		createEReference(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__MEDIUMS);
		createEReference(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__PROTOCOLS);
		createEReference(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__LANGUAGES);
		createEReference(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__OS);
		createEAttribute(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__NAME);
		createEAttribute(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__ID);
		createEReference(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__CONNECTIONS);
		createEReference(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__DEVICES);
		createEReference(developmentEnvironmentEClass, DEVELOPMENT_ENVIRONMENT__EDGES);

		mediumEClass = createEClass(MEDIUM);
		createEAttribute(mediumEClass, MEDIUM__TYPE);
		createEAttribute(mediumEClass, MEDIUM__TECHNOLOGY);
		createEAttribute(mediumEClass, MEDIUM__VERSION);
		createEReference(mediumEClass, MEDIUM__ENVIRONMENT);

		protocolEClass = createEClass(PROTOCOL);
		createEAttribute(protocolEClass, PROTOCOL__NAME);
		createEAttribute(protocolEClass, PROTOCOL__VERSION);
		createEReference(protocolEClass, PROTOCOL__ENVIRONMENT);

		operatingSystemEClass = createEClass(OPERATING_SYSTEM);
		createEAttribute(operatingSystemEClass, OPERATING_SYSTEM__NAME);
		createEAttribute(operatingSystemEClass, OPERATING_SYSTEM__VERSION);
		createEAttribute(operatingSystemEClass, OPERATING_SYSTEM__REVISION);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__ENVIRONMENT);

		programmingLanguageEClass = createEClass(PROGRAMMING_LANGUAGE);
		createEAttribute(programmingLanguageEClass, PROGRAMMING_LANGUAGE__NAME);
		createEAttribute(programmingLanguageEClass, PROGRAMMING_LANGUAGE__VERSION);
		createEAttribute(programmingLanguageEClass, PROGRAMMING_LANGUAGE__PROFILE);
		createEAttribute(programmingLanguageEClass, PROGRAMMING_LANGUAGE__REVISION);
		createEReference(programmingLanguageEClass, PROGRAMMING_LANGUAGE__ENVIRONMENT);

		deviceEClass = createEClass(DEVICE);
		createEReference(deviceEClass, DEVICE__PLATFORMS);
		createEAttribute(deviceEClass, DEVICE__NAME);
		createEAttribute(deviceEClass, DEVICE__ID);
		createEReference(deviceEClass, DEVICE__ENTITIES);
		createEReference(deviceEClass, DEVICE__ONGOING);
		createEReference(deviceEClass, DEVICE__INCOMING);
		createEReference(deviceEClass, DEVICE__ENVIRONMENT);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__PLATFORMS);
		createEAttribute(connectionEClass, CONNECTION__NAME);
		createEAttribute(connectionEClass, CONNECTION__ID);
		createEReference(connectionEClass, CONNECTION__INFORMATION);
		createEReference(connectionEClass, CONNECTION__ENVIRONMENT);
		createEReference(connectionEClass, CONNECTION__ONGOING);
		createEReference(connectionEClass, CONNECTION__INCOMING);

		connectionPlatformEClass = createEClass(CONNECTION_PLATFORM);
		createEReference(connectionPlatformEClass, CONNECTION_PLATFORM__CONNECTION);
		createEReference(connectionPlatformEClass, CONNECTION_PLATFORM__PROTOCOL);
		createEReference(connectionPlatformEClass, CONNECTION_PLATFORM__MEDIUM);

		devicePlatformEClass = createEClass(DEVICE_PLATFORM);
		createEReference(devicePlatformEClass, DEVICE_PLATFORM__DEVICE);
		createEReference(devicePlatformEClass, DEVICE_PLATFORM__LANGUAGE);
		createEReference(devicePlatformEClass, DEVICE_PLATFORM__OS);

		platformEClass = createEClass(PLATFORM);
		createEAttribute(platformEClass, PLATFORM__NAME);
		createEAttribute(platformEClass, PLATFORM__ID);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEReference(entityEClass, ENTITY__DEVICE);

		informationEClass = createEClass(INFORMATION);
		createEReference(informationEClass, INFORMATION__CONNECTION);
		createEAttribute(informationEClass, INFORMATION__NAME);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__ID);
		createEReference(edgeEClass, EDGE__ENVIRONMENT);

		deviceToConnectionEdgeEClass = createEClass(DEVICE_TO_CONNECTION_EDGE);
		createEReference(deviceToConnectionEdgeEClass, DEVICE_TO_CONNECTION_EDGE__SOURCE);
		createEReference(deviceToConnectionEdgeEClass, DEVICE_TO_CONNECTION_EDGE__TARGET);

		connectionToDeviceEdgeEClass = createEClass(CONNECTION_TO_DEVICE_EDGE);
		createEReference(connectionToDeviceEdgeEClass, CONNECTION_TO_DEVICE_EDGE__SOURCE);
		createEReference(connectionToDeviceEdgeEClass, CONNECTION_TO_DEVICE_EDGE__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		connectionPlatformEClass.getESuperTypes().add(this.getPlatform());
		devicePlatformEClass.getESuperTypes().add(this.getPlatform());
		deviceToConnectionEdgeEClass.getESuperTypes().add(this.getEdge());
		connectionToDeviceEdgeEClass.getESuperTypes().add(this.getEdge());

		// Initialize classes, features, and operations; add parameters
		initEClass(developmentEnvironmentEClass, DevelopmentEnvironment.class, "DevelopmentEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevelopmentEnvironment_Mediums(), this.getMedium(), this.getMedium_Environment(), "mediums", null, 0, -1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentEnvironment_Protocols(), this.getProtocol(), this.getProtocol_Environment(), "protocols", null, 0, -1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentEnvironment_Languages(), this.getProgrammingLanguage(), this.getProgrammingLanguage_Environment(), "languages", null, 0, -1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentEnvironment_Os(), this.getOperatingSystem(), this.getOperatingSystem_Environment(), "os", null, 0, -1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevelopmentEnvironment_Name(), ecorePackage.getEString(), "name", null, 1, 1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevelopmentEnvironment_Id(), ecorePackage.getEInt(), "id", null, 1, 1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentEnvironment_Connections(), this.getConnection(), this.getConnection_Environment(), "connections", null, 0, -1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentEnvironment_Devices(), this.getDevice(), this.getDevice_Environment(), "devices", null, 1, -1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevelopmentEnvironment_Edges(), this.getEdge(), this.getEdge_Environment(), "edges", null, 0, -1, DevelopmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediumEClass, Medium.class, "Medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedium_Type(), ecorePackage.getEString(), "type", null, 1, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedium_Technology(), ecorePackage.getEString(), "technology", null, 1, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedium_Version(), ecorePackage.getEString(), "version", null, 1, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedium_Environment(), this.getDevelopmentEnvironment(), this.getDevelopmentEnvironment_Mediums(), "environment", null, 1, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocol_Name(), ecorePackage.getEString(), "name", null, 1, 1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtocol_Version(), ecorePackage.getEString(), "version", null, 1, 1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocol_Environment(), this.getDevelopmentEnvironment(), this.getDevelopmentEnvironment_Protocols(), "environment", null, 1, 1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatingSystemEClass, OperatingSystem.class, "OperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatingSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingSystem_Version(), ecorePackage.getEString(), "version", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingSystem_Revision(), ecorePackage.getEString(), "revision", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_Environment(), this.getDevelopmentEnvironment(), this.getDevelopmentEnvironment_Os(), "environment", null, 1, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmingLanguageEClass, ProgrammingLanguage.class, "ProgrammingLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgrammingLanguage_Name(), ecorePackage.getEString(), "name", null, 1, 1, ProgrammingLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammingLanguage_Version(), ecorePackage.getEString(), "version", null, 0, 1, ProgrammingLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammingLanguage_Profile(), ecorePackage.getEString(), "profile", null, 0, 1, ProgrammingLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammingLanguage_Revision(), ecorePackage.getEString(), "revision", null, 0, 1, ProgrammingLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgrammingLanguage_Environment(), this.getDevelopmentEnvironment(), this.getDevelopmentEnvironment_Languages(), "environment", null, 1, 1, ProgrammingLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevice_Platforms(), this.getDevicePlatform(), this.getDevicePlatform_Device(), "platforms", null, 1, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Id(), ecorePackage.getEString(), "id", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Entities(), this.getEntity(), this.getEntity_Device(), "entities", null, 1, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Ongoing(), this.getDeviceToConnectionEdge(), this.getDeviceToConnectionEdge_Source(), "ongoing", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Incoming(), this.getConnectionToDeviceEdge(), this.getConnectionToDeviceEdge_Target(), "incoming", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Environment(), this.getDevelopmentEnvironment(), this.getDevelopmentEnvironment_Devices(), "environment", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Platforms(), this.getConnectionPlatform(), this.getConnectionPlatform_Connection(), "platforms", null, 1, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Name(), ecorePackage.getEString(), "name", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Information(), this.getInformation(), this.getInformation_Connection(), "information", null, 1, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Environment(), this.getDevelopmentEnvironment(), this.getDevelopmentEnvironment_Connections(), "environment", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Ongoing(), this.getConnectionToDeviceEdge(), this.getConnectionToDeviceEdge_Source(), "ongoing", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Incoming(), this.getDeviceToConnectionEdge(), this.getDeviceToConnectionEdge_Target(), "incoming", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionPlatformEClass, ConnectionPlatform.class, "ConnectionPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionPlatform_Connection(), this.getConnection(), this.getConnection_Platforms(), "connection", null, 1, 1, ConnectionPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPlatform_Protocol(), this.getProtocol(), null, "protocol", null, 1, 1, ConnectionPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPlatform_Medium(), this.getMedium(), null, "medium", null, 1, 1, ConnectionPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devicePlatformEClass, DevicePlatform.class, "DevicePlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevicePlatform_Device(), this.getDevice(), this.getDevice_Platforms(), "device", null, 1, 1, DevicePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevicePlatform_Language(), this.getProgrammingLanguage(), null, "language", null, 1, 1, DevicePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevicePlatform_Os(), this.getOperatingSystem(), null, "os", null, 0, 1, DevicePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformEClass, Platform.class, "Platform", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatform_Name(), ecorePackage.getEString(), "name", null, 1, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatform_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Device(), this.getDevice(), this.getDevice_Entities(), "device", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationEClass, Information.class, "Information", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformation_Connection(), this.getConnection(), this.getConnection_Information(), "connection", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Environment(), this.getDevelopmentEnvironment(), this.getDevelopmentEnvironment_Edges(), "environment", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceToConnectionEdgeEClass, DeviceToConnectionEdge.class, "DeviceToConnectionEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceToConnectionEdge_Source(), this.getDevice(), this.getDevice_Ongoing(), "source", null, 1, 1, DeviceToConnectionEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceToConnectionEdge_Target(), this.getConnection(), this.getConnection_Incoming(), "target", null, 1, 1, DeviceToConnectionEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionToDeviceEdgeEClass, ConnectionToDeviceEdge.class, "ConnectionToDeviceEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionToDeviceEdge_Source(), this.getConnection(), this.getConnection_Ongoing(), "source", null, 1, 1, ConnectionToDeviceEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionToDeviceEdge_Target(), this.getDevice(), this.getDevice_Incoming(), "target", null, 1, 1, ConnectionToDeviceEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DemmPackageImpl
