/**
 */
package demm.util;

import demm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see demm.DemmPackage
 * @generated
 */
public class DemmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DemmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DemmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemmSwitch<Adapter> modelSwitch =
		new DemmSwitch<Adapter>() {
			@Override
			public Adapter caseDevelopmentEnvironment(DevelopmentEnvironment object) {
				return createDevelopmentEnvironmentAdapter();
			}
			@Override
			public Adapter caseMedium(Medium object) {
				return createMediumAdapter();
			}
			@Override
			public Adapter caseProtocol(Protocol object) {
				return createProtocolAdapter();
			}
			@Override
			public Adapter caseOperatingSystem(OperatingSystem object) {
				return createOperatingSystemAdapter();
			}
			@Override
			public Adapter caseProgrammingLanguage(ProgrammingLanguage object) {
				return createProgrammingLanguageAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseConnectionPlatform(ConnectionPlatform object) {
				return createConnectionPlatformAdapter();
			}
			@Override
			public Adapter caseDevicePlatform(DevicePlatform object) {
				return createDevicePlatformAdapter();
			}
			@Override
			public Adapter casePlatform(Platform object) {
				return createPlatformAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseInformation(Information object) {
				return createInformationAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseDeviceToConnectionEdge(DeviceToConnectionEdge object) {
				return createDeviceToConnectionEdgeAdapter();
			}
			@Override
			public Adapter caseConnectionToDeviceEdge(ConnectionToDeviceEdge object) {
				return createConnectionToDeviceEdgeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link demm.DevelopmentEnvironment <em>Development Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.DevelopmentEnvironment
	 * @generated
	 */
	public Adapter createDevelopmentEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.Medium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.Medium
	 * @generated
	 */
	public Adapter createMediumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.OperatingSystem
	 * @generated
	 */
	public Adapter createOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.ProgrammingLanguage
	 * @generated
	 */
	public Adapter createProgrammingLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.ConnectionPlatform <em>Connection Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.ConnectionPlatform
	 * @generated
	 */
	public Adapter createConnectionPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.DevicePlatform <em>Device Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.DevicePlatform
	 * @generated
	 */
	public Adapter createDevicePlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.Information
	 * @generated
	 */
	public Adapter createInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.DeviceToConnectionEdge <em>Device To Connection Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.DeviceToConnectionEdge
	 * @generated
	 */
	public Adapter createDeviceToConnectionEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link demm.ConnectionToDeviceEdge <em>Connection To Device Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see demm.ConnectionToDeviceEdge
	 * @generated
	 */
	public Adapter createConnectionToDeviceEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DemmAdapterFactory
