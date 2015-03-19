/**
 */
package ifmm.impl;

import ifmm.*;

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
public class IfmmFactoryImpl extends EFactoryImpl implements IfmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfmmFactory init() {
		try {
			IfmmFactory theIfmmFactory = (IfmmFactory)EPackage.Registry.INSTANCE.getEFactory(IfmmPackage.eNS_URI);
			if (theIfmmFactory != null) {
				return theIfmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IfmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfmmFactoryImpl() {
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
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW: return createSystemInformaitonFlow();
			case IfmmPackage.CONTEXT_AWARE_ENTITY: return createContextAwareEntity();
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW: return createPointToPointInformationFlow();
			case IfmmPackage.BROADCAST_INFORMATION_FLOW: return createBroadcastInformationFlow();
			case IfmmPackage.OUTPUT_DATA: return createOutputData();
			case IfmmPackage.INPUT_DATA: return createInputData();
			case IfmmPackage.ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE: return createEntityToBroadcastInformationFlowEdge();
			case IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE: return createEntityToPointToPointInformationFlowEdge();
			case IfmmPackage.BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE: return createBroadcastInformationFlowToEntityEdge();
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE: return createPointToPointInformationFlowToEntityEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInformaitonFlow createSystemInformaitonFlow() {
		SystemInformaitonFlowImpl systemInformaitonFlow = new SystemInformaitonFlowImpl();
		return systemInformaitonFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAwareEntity createContextAwareEntity() {
		ContextAwareEntityImpl contextAwareEntity = new ContextAwareEntityImpl();
		return contextAwareEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointToPointInformationFlow createPointToPointInformationFlow() {
		PointToPointInformationFlowImpl pointToPointInformationFlow = new PointToPointInformationFlowImpl();
		return pointToPointInformationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastInformationFlow createBroadcastInformationFlow() {
		BroadcastInformationFlowImpl broadcastInformationFlow = new BroadcastInformationFlowImpl();
		return broadcastInformationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputData createOutputData() {
		OutputDataImpl outputData = new OutputDataImpl();
		return outputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputData createInputData() {
		InputDataImpl inputData = new InputDataImpl();
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityToBroadcastInformationFlowEdge createEntityToBroadcastInformationFlowEdge() {
		EntityToBroadcastInformationFlowEdgeImpl entityToBroadcastInformationFlowEdge = new EntityToBroadcastInformationFlowEdgeImpl();
		return entityToBroadcastInformationFlowEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityToPointToPointInformationFlowEdge createEntityToPointToPointInformationFlowEdge() {
		EntityToPointToPointInformationFlowEdgeImpl entityToPointToPointInformationFlowEdge = new EntityToPointToPointInformationFlowEdgeImpl();
		return entityToPointToPointInformationFlowEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastInformationFlowToEntityEdge createBroadcastInformationFlowToEntityEdge() {
		BroadcastInformationFlowToEntityEdgeImpl broadcastInformationFlowToEntityEdge = new BroadcastInformationFlowToEntityEdgeImpl();
		return broadcastInformationFlowToEntityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointToPointInformationFlowToEntityEdge createPointToPointInformationFlowToEntityEdge() {
		PointToPointInformationFlowToEntityEdgeImpl pointToPointInformationFlowToEntityEdge = new PointToPointInformationFlowToEntityEdgeImpl();
		return pointToPointInformationFlowToEntityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfmmPackage getIfmmPackage() {
		return (IfmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IfmmPackage getPackage() {
		return IfmmPackage.eINSTANCE;
	}

} //IfmmFactoryImpl
