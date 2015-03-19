/**
 */
package ifmm;

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
 * @see ifmm.IfmmFactory
 * @model kind="package"
 * @generated
 */
public interface IfmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ifmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tesoriero.org/cauce/informationFlow/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ifmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IfmmPackage eINSTANCE = ifmm.impl.IfmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ifmm.impl.SystemInformaitonFlowImpl <em>System Informaiton Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.SystemInformaitonFlowImpl
	 * @see ifmm.impl.IfmmPackageImpl#getSystemInformaitonFlow()
	 * @generated
	 */
	int SYSTEM_INFORMAITON_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMAITON_FLOW__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMAITON_FLOW__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMAITON_FLOW__NAME = 2;

	/**
	 * The feature id for the '<em><b>Information Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS = 3;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMAITON_FLOW__EDGES = 4;

	/**
	 * The number of structural features of the '<em>System Informaiton Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMAITON_FLOW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>System Informaiton Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMAITON_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.ContextAwareEntityImpl <em>Context Aware Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.ContextAwareEntityImpl
	 * @see ifmm.impl.IfmmPackageImpl#getContextAwareEntity()
	 * @generated
	 */
	int CONTEXT_AWARE_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Ongoing Information Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY__ONGOING_INFORMATION_FLOWS = 3;

	/**
	 * The feature id for the '<em><b>Incoming Information Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY__INCOMING_INFORMATION_FLOWS = 4;

	/**
	 * The number of structural features of the '<em>Context Aware Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Context Aware Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.InformationFlowImpl <em>Information Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.InformationFlowImpl
	 * @see ifmm.impl.IfmmPackageImpl#getInformationFlow()
	 * @generated
	 */
	int INFORMATION_FLOW = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__NAME = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__SYSTEM = 2;

	/**
	 * The number of structural features of the '<em>Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.PointToPointInformationFlowImpl <em>Point To Point Information Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.PointToPointInformationFlowImpl
	 * @see ifmm.impl.IfmmPackageImpl#getPointToPointInformationFlow()
	 * @generated
	 */
	int POINT_TO_POINT_INFORMATION_FLOW = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW__ID = INFORMATION_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW__NAME = INFORMATION_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW__SYSTEM = INFORMATION_FLOW__SYSTEM;

	/**
	 * The feature id for the '<em><b>Output Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW__OUTPUT_DATA = INFORMATION_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW__SOURCE = INFORMATION_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW__TARGET = INFORMATION_FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW__INPUT_DATA = INFORMATION_FLOW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Point To Point Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW_FEATURE_COUNT = INFORMATION_FLOW_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Point To Point Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW_OPERATION_COUNT = INFORMATION_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.BroadcastInformationFlowImpl <em>Broadcast Information Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.BroadcastInformationFlowImpl
	 * @see ifmm.impl.IfmmPackageImpl#getBroadcastInformationFlow()
	 * @generated
	 */
	int BROADCAST_INFORMATION_FLOW = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW__ID = INFORMATION_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW__NAME = INFORMATION_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW__SYSTEM = INFORMATION_FLOW__SYSTEM;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW__DATA = INFORMATION_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW__SOURCE = INFORMATION_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW__TARGET = INFORMATION_FLOW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Broadcast Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW_FEATURE_COUNT = INFORMATION_FLOW_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Broadcast Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW_OPERATION_COUNT = INFORMATION_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.DataImpl
	 * @see ifmm.impl.IfmmPackageImpl#getData()
	 * @generated
	 */
	int DATA = 5;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.OutputDataImpl <em>Output Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.OutputDataImpl
	 * @see ifmm.impl.IfmmPackageImpl#getOutputData()
	 * @generated
	 */
	int OUTPUT_DATA = 6;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__DEFINITION = DATA__DEFINITION;

	/**
	 * The number of structural features of the '<em>Output Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.InputDataImpl <em>Input Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.InputDataImpl
	 * @see ifmm.impl.IfmmPackageImpl#getInputData()
	 * @generated
	 */
	int INPUT_DATA = 7;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__DEFINITION = DATA__DEFINITION;

	/**
	 * The number of structural features of the '<em>Input Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.EdgeImpl
	 * @see ifmm.impl.IfmmPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 8;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SYSTEM = 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.InformationFlowToEntityEdgeImpl <em>Information Flow To Entity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.InformationFlowToEntityEdgeImpl
	 * @see ifmm.impl.IfmmPackageImpl#getInformationFlowToEntityEdge()
	 * @generated
	 */
	int INFORMATION_FLOW_TO_ENTITY_EDGE = 9;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_TO_ENTITY_EDGE__SYSTEM = EDGE__SYSTEM;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_TO_ENTITY_EDGE__TARGET = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Information Flow To Entity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_TO_ENTITY_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Information Flow To Entity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_TO_ENTITY_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.EntityToInformationFlowEdgeImpl <em>Entity To Information Flow Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.EntityToInformationFlowEdgeImpl
	 * @see ifmm.impl.IfmmPackageImpl#getEntityToInformationFlowEdge()
	 * @generated
	 */
	int ENTITY_TO_INFORMATION_FLOW_EDGE = 10;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_INFORMATION_FLOW_EDGE__SYSTEM = EDGE__SYSTEM;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_INFORMATION_FLOW_EDGE__SOURCE = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity To Information Flow Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_INFORMATION_FLOW_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity To Information Flow Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_INFORMATION_FLOW_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.EntityToBroadcastInformationFlowEdgeImpl <em>Entity To Broadcast Information Flow Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.EntityToBroadcastInformationFlowEdgeImpl
	 * @see ifmm.impl.IfmmPackageImpl#getEntityToBroadcastInformationFlowEdge()
	 * @generated
	 */
	int ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE = 11;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE__SYSTEM = ENTITY_TO_INFORMATION_FLOW_EDGE__SYSTEM;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE__SOURCE = ENTITY_TO_INFORMATION_FLOW_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE__TARGET = ENTITY_TO_INFORMATION_FLOW_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity To Broadcast Information Flow Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE_FEATURE_COUNT = ENTITY_TO_INFORMATION_FLOW_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity To Broadcast Information Flow Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE_OPERATION_COUNT = ENTITY_TO_INFORMATION_FLOW_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.EntityToPointToPointInformationFlowEdgeImpl <em>Entity To Point To Point Information Flow Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.EntityToPointToPointInformationFlowEdgeImpl
	 * @see ifmm.impl.IfmmPackageImpl#getEntityToPointToPointInformationFlowEdge()
	 * @generated
	 */
	int ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE = 12;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__SYSTEM = ENTITY_TO_INFORMATION_FLOW_EDGE__SYSTEM;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__SOURCE = ENTITY_TO_INFORMATION_FLOW_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET = ENTITY_TO_INFORMATION_FLOW_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity To Point To Point Information Flow Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE_FEATURE_COUNT = ENTITY_TO_INFORMATION_FLOW_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity To Point To Point Information Flow Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE_OPERATION_COUNT = ENTITY_TO_INFORMATION_FLOW_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.BroadcastInformationFlowToEntityEdgeImpl <em>Broadcast Information Flow To Entity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.BroadcastInformationFlowToEntityEdgeImpl
	 * @see ifmm.impl.IfmmPackageImpl#getBroadcastInformationFlowToEntityEdge()
	 * @generated
	 */
	int BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE = 13;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE__SYSTEM = INFORMATION_FLOW_TO_ENTITY_EDGE__SYSTEM;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE__TARGET = INFORMATION_FLOW_TO_ENTITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE = INFORMATION_FLOW_TO_ENTITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Broadcast Information Flow To Entity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE_FEATURE_COUNT = INFORMATION_FLOW_TO_ENTITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Broadcast Information Flow To Entity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE_OPERATION_COUNT = INFORMATION_FLOW_TO_ENTITY_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifmm.impl.PointToPointInformationFlowToEntityEdgeImpl <em>Point To Point Information Flow To Entity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifmm.impl.PointToPointInformationFlowToEntityEdgeImpl
	 * @see ifmm.impl.IfmmPackageImpl#getPointToPointInformationFlowToEntityEdge()
	 * @generated
	 */
	int POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE = 14;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE__SYSTEM = INFORMATION_FLOW_TO_ENTITY_EDGE__SYSTEM;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE__TARGET = INFORMATION_FLOW_TO_ENTITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE = INFORMATION_FLOW_TO_ENTITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point To Point Information Flow To Entity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE_FEATURE_COUNT = INFORMATION_FLOW_TO_ENTITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point To Point Information Flow To Entity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE_OPERATION_COUNT = INFORMATION_FLOW_TO_ENTITY_EDGE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ifmm.SystemInformaitonFlow <em>System Informaiton Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Informaiton Flow</em>'.
	 * @see ifmm.SystemInformaitonFlow
	 * @generated
	 */
	EClass getSystemInformaitonFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link ifmm.SystemInformaitonFlow#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see ifmm.SystemInformaitonFlow#getEntities()
	 * @see #getSystemInformaitonFlow()
	 * @generated
	 */
	EReference getSystemInformaitonFlow_Entities();

	/**
	 * Returns the meta object for the attribute '{@link ifmm.SystemInformaitonFlow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ifmm.SystemInformaitonFlow#getId()
	 * @see #getSystemInformaitonFlow()
	 * @generated
	 */
	EAttribute getSystemInformaitonFlow_Id();

	/**
	 * Returns the meta object for the attribute '{@link ifmm.SystemInformaitonFlow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ifmm.SystemInformaitonFlow#getName()
	 * @see #getSystemInformaitonFlow()
	 * @generated
	 */
	EAttribute getSystemInformaitonFlow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ifmm.SystemInformaitonFlow#getInformationFlows <em>Information Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information Flows</em>'.
	 * @see ifmm.SystemInformaitonFlow#getInformationFlows()
	 * @see #getSystemInformaitonFlow()
	 * @generated
	 */
	EReference getSystemInformaitonFlow_InformationFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link ifmm.SystemInformaitonFlow#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see ifmm.SystemInformaitonFlow#getEdges()
	 * @see #getSystemInformaitonFlow()
	 * @generated
	 */
	EReference getSystemInformaitonFlow_Edges();

	/**
	 * Returns the meta object for class '{@link ifmm.ContextAwareEntity <em>Context Aware Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Aware Entity</em>'.
	 * @see ifmm.ContextAwareEntity
	 * @generated
	 */
	EClass getContextAwareEntity();

	/**
	 * Returns the meta object for the container reference '{@link ifmm.ContextAwareEntity#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see ifmm.ContextAwareEntity#getSystem()
	 * @see #getContextAwareEntity()
	 * @generated
	 */
	EReference getContextAwareEntity_System();

	/**
	 * Returns the meta object for the attribute '{@link ifmm.ContextAwareEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ifmm.ContextAwareEntity#getId()
	 * @see #getContextAwareEntity()
	 * @generated
	 */
	EAttribute getContextAwareEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link ifmm.ContextAwareEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ifmm.ContextAwareEntity#getName()
	 * @see #getContextAwareEntity()
	 * @generated
	 */
	EAttribute getContextAwareEntity_Name();

	/**
	 * Returns the meta object for the reference list '{@link ifmm.ContextAwareEntity#getOngoingInformationFlows <em>Ongoing Information Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ongoing Information Flows</em>'.
	 * @see ifmm.ContextAwareEntity#getOngoingInformationFlows()
	 * @see #getContextAwareEntity()
	 * @generated
	 */
	EReference getContextAwareEntity_OngoingInformationFlows();

	/**
	 * Returns the meta object for the reference list '{@link ifmm.ContextAwareEntity#getIncomingInformationFlows <em>Incoming Information Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Information Flows</em>'.
	 * @see ifmm.ContextAwareEntity#getIncomingInformationFlows()
	 * @see #getContextAwareEntity()
	 * @generated
	 */
	EReference getContextAwareEntity_IncomingInformationFlows();

	/**
	 * Returns the meta object for class '{@link ifmm.InformationFlow <em>Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Flow</em>'.
	 * @see ifmm.InformationFlow
	 * @generated
	 */
	EClass getInformationFlow();

	/**
	 * Returns the meta object for the attribute '{@link ifmm.InformationFlow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ifmm.InformationFlow#getId()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EAttribute getInformationFlow_Id();

	/**
	 * Returns the meta object for the attribute '{@link ifmm.InformationFlow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ifmm.InformationFlow#getName()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EAttribute getInformationFlow_Name();

	/**
	 * Returns the meta object for the container reference '{@link ifmm.InformationFlow#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see ifmm.InformationFlow#getSystem()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_System();

	/**
	 * Returns the meta object for class '{@link ifmm.PointToPointInformationFlow <em>Point To Point Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point To Point Information Flow</em>'.
	 * @see ifmm.PointToPointInformationFlow
	 * @generated
	 */
	EClass getPointToPointInformationFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link ifmm.PointToPointInformationFlow#getOutputData <em>Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Data</em>'.
	 * @see ifmm.PointToPointInformationFlow#getOutputData()
	 * @see #getPointToPointInformationFlow()
	 * @generated
	 */
	EReference getPointToPointInformationFlow_OutputData();

	/**
	 * Returns the meta object for the reference '{@link ifmm.PointToPointInformationFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ifmm.PointToPointInformationFlow#getSource()
	 * @see #getPointToPointInformationFlow()
	 * @generated
	 */
	EReference getPointToPointInformationFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link ifmm.PointToPointInformationFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ifmm.PointToPointInformationFlow#getTarget()
	 * @see #getPointToPointInformationFlow()
	 * @generated
	 */
	EReference getPointToPointInformationFlow_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link ifmm.PointToPointInformationFlow#getInputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Data</em>'.
	 * @see ifmm.PointToPointInformationFlow#getInputData()
	 * @see #getPointToPointInformationFlow()
	 * @generated
	 */
	EReference getPointToPointInformationFlow_InputData();

	/**
	 * Returns the meta object for class '{@link ifmm.BroadcastInformationFlow <em>Broadcast Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broadcast Information Flow</em>'.
	 * @see ifmm.BroadcastInformationFlow
	 * @generated
	 */
	EClass getBroadcastInformationFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link ifmm.BroadcastInformationFlow#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see ifmm.BroadcastInformationFlow#getData()
	 * @see #getBroadcastInformationFlow()
	 * @generated
	 */
	EReference getBroadcastInformationFlow_Data();

	/**
	 * Returns the meta object for the reference '{@link ifmm.BroadcastInformationFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ifmm.BroadcastInformationFlow#getSource()
	 * @see #getBroadcastInformationFlow()
	 * @generated
	 */
	EReference getBroadcastInformationFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link ifmm.BroadcastInformationFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ifmm.BroadcastInformationFlow#getTarget()
	 * @see #getBroadcastInformationFlow()
	 * @generated
	 */
	EReference getBroadcastInformationFlow_Target();

	/**
	 * Returns the meta object for class '{@link ifmm.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see ifmm.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link ifmm.Data#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see ifmm.Data#getDefinition()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Definition();

	/**
	 * Returns the meta object for class '{@link ifmm.OutputData <em>Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Data</em>'.
	 * @see ifmm.OutputData
	 * @generated
	 */
	EClass getOutputData();

	/**
	 * Returns the meta object for class '{@link ifmm.InputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Data</em>'.
	 * @see ifmm.InputData
	 * @generated
	 */
	EClass getInputData();

	/**
	 * Returns the meta object for class '{@link ifmm.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see ifmm.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the container reference '{@link ifmm.Edge#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see ifmm.Edge#getSystem()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_System();

	/**
	 * Returns the meta object for class '{@link ifmm.InformationFlowToEntityEdge <em>Information Flow To Entity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Flow To Entity Edge</em>'.
	 * @see ifmm.InformationFlowToEntityEdge
	 * @generated
	 */
	EClass getInformationFlowToEntityEdge();

	/**
	 * Returns the meta object for the reference '{@link ifmm.InformationFlowToEntityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ifmm.InformationFlowToEntityEdge#getTarget()
	 * @see #getInformationFlowToEntityEdge()
	 * @generated
	 */
	EReference getInformationFlowToEntityEdge_Target();

	/**
	 * Returns the meta object for class '{@link ifmm.EntityToInformationFlowEdge <em>Entity To Information Flow Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity To Information Flow Edge</em>'.
	 * @see ifmm.EntityToInformationFlowEdge
	 * @generated
	 */
	EClass getEntityToInformationFlowEdge();

	/**
	 * Returns the meta object for the reference '{@link ifmm.EntityToInformationFlowEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ifmm.EntityToInformationFlowEdge#getSource()
	 * @see #getEntityToInformationFlowEdge()
	 * @generated
	 */
	EReference getEntityToInformationFlowEdge_Source();

	/**
	 * Returns the meta object for class '{@link ifmm.EntityToBroadcastInformationFlowEdge <em>Entity To Broadcast Information Flow Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity To Broadcast Information Flow Edge</em>'.
	 * @see ifmm.EntityToBroadcastInformationFlowEdge
	 * @generated
	 */
	EClass getEntityToBroadcastInformationFlowEdge();

	/**
	 * Returns the meta object for the reference '{@link ifmm.EntityToBroadcastInformationFlowEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ifmm.EntityToBroadcastInformationFlowEdge#getTarget()
	 * @see #getEntityToBroadcastInformationFlowEdge()
	 * @generated
	 */
	EReference getEntityToBroadcastInformationFlowEdge_Target();

	/**
	 * Returns the meta object for class '{@link ifmm.EntityToPointToPointInformationFlowEdge <em>Entity To Point To Point Information Flow Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity To Point To Point Information Flow Edge</em>'.
	 * @see ifmm.EntityToPointToPointInformationFlowEdge
	 * @generated
	 */
	EClass getEntityToPointToPointInformationFlowEdge();

	/**
	 * Returns the meta object for the reference '{@link ifmm.EntityToPointToPointInformationFlowEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ifmm.EntityToPointToPointInformationFlowEdge#getTarget()
	 * @see #getEntityToPointToPointInformationFlowEdge()
	 * @generated
	 */
	EReference getEntityToPointToPointInformationFlowEdge_Target();

	/**
	 * Returns the meta object for class '{@link ifmm.BroadcastInformationFlowToEntityEdge <em>Broadcast Information Flow To Entity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broadcast Information Flow To Entity Edge</em>'.
	 * @see ifmm.BroadcastInformationFlowToEntityEdge
	 * @generated
	 */
	EClass getBroadcastInformationFlowToEntityEdge();

	/**
	 * Returns the meta object for the reference '{@link ifmm.BroadcastInformationFlowToEntityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ifmm.BroadcastInformationFlowToEntityEdge#getSource()
	 * @see #getBroadcastInformationFlowToEntityEdge()
	 * @generated
	 */
	EReference getBroadcastInformationFlowToEntityEdge_Source();

	/**
	 * Returns the meta object for class '{@link ifmm.PointToPointInformationFlowToEntityEdge <em>Point To Point Information Flow To Entity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point To Point Information Flow To Entity Edge</em>'.
	 * @see ifmm.PointToPointInformationFlowToEntityEdge
	 * @generated
	 */
	EClass getPointToPointInformationFlowToEntityEdge();

	/**
	 * Returns the meta object for the reference '{@link ifmm.PointToPointInformationFlowToEntityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ifmm.PointToPointInformationFlowToEntityEdge#getSource()
	 * @see #getPointToPointInformationFlowToEntityEdge()
	 * @generated
	 */
	EReference getPointToPointInformationFlowToEntityEdge_Source();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IfmmFactory getIfmmFactory();

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
		 * The meta object literal for the '{@link ifmm.impl.SystemInformaitonFlowImpl <em>System Informaiton Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.SystemInformaitonFlowImpl
		 * @see ifmm.impl.IfmmPackageImpl#getSystemInformaitonFlow()
		 * @generated
		 */
		EClass SYSTEM_INFORMAITON_FLOW = eINSTANCE.getSystemInformaitonFlow();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INFORMAITON_FLOW__ENTITIES = eINSTANCE.getSystemInformaitonFlow_Entities();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFORMAITON_FLOW__ID = eINSTANCE.getSystemInformaitonFlow_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFORMAITON_FLOW__NAME = eINSTANCE.getSystemInformaitonFlow_Name();

		/**
		 * The meta object literal for the '<em><b>Information Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS = eINSTANCE.getSystemInformaitonFlow_InformationFlows();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INFORMAITON_FLOW__EDGES = eINSTANCE.getSystemInformaitonFlow_Edges();

		/**
		 * The meta object literal for the '{@link ifmm.impl.ContextAwareEntityImpl <em>Context Aware Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.ContextAwareEntityImpl
		 * @see ifmm.impl.IfmmPackageImpl#getContextAwareEntity()
		 * @generated
		 */
		EClass CONTEXT_AWARE_ENTITY = eINSTANCE.getContextAwareEntity();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_ENTITY__SYSTEM = eINSTANCE.getContextAwareEntity_System();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_AWARE_ENTITY__ID = eINSTANCE.getContextAwareEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_AWARE_ENTITY__NAME = eINSTANCE.getContextAwareEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Ongoing Information Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_ENTITY__ONGOING_INFORMATION_FLOWS = eINSTANCE.getContextAwareEntity_OngoingInformationFlows();

		/**
		 * The meta object literal for the '<em><b>Incoming Information Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_ENTITY__INCOMING_INFORMATION_FLOWS = eINSTANCE.getContextAwareEntity_IncomingInformationFlows();

		/**
		 * The meta object literal for the '{@link ifmm.impl.InformationFlowImpl <em>Information Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.InformationFlowImpl
		 * @see ifmm.impl.IfmmPackageImpl#getInformationFlow()
		 * @generated
		 */
		EClass INFORMATION_FLOW = eINSTANCE.getInformationFlow();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_FLOW__ID = eINSTANCE.getInformationFlow_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_FLOW__NAME = eINSTANCE.getInformationFlow_Name();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__SYSTEM = eINSTANCE.getInformationFlow_System();

		/**
		 * The meta object literal for the '{@link ifmm.impl.PointToPointInformationFlowImpl <em>Point To Point Information Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.PointToPointInformationFlowImpl
		 * @see ifmm.impl.IfmmPackageImpl#getPointToPointInformationFlow()
		 * @generated
		 */
		EClass POINT_TO_POINT_INFORMATION_FLOW = eINSTANCE.getPointToPointInformationFlow();

		/**
		 * The meta object literal for the '<em><b>Output Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TO_POINT_INFORMATION_FLOW__OUTPUT_DATA = eINSTANCE.getPointToPointInformationFlow_OutputData();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TO_POINT_INFORMATION_FLOW__SOURCE = eINSTANCE.getPointToPointInformationFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TO_POINT_INFORMATION_FLOW__TARGET = eINSTANCE.getPointToPointInformationFlow_Target();

		/**
		 * The meta object literal for the '<em><b>Input Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TO_POINT_INFORMATION_FLOW__INPUT_DATA = eINSTANCE.getPointToPointInformationFlow_InputData();

		/**
		 * The meta object literal for the '{@link ifmm.impl.BroadcastInformationFlowImpl <em>Broadcast Information Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.BroadcastInformationFlowImpl
		 * @see ifmm.impl.IfmmPackageImpl#getBroadcastInformationFlow()
		 * @generated
		 */
		EClass BROADCAST_INFORMATION_FLOW = eINSTANCE.getBroadcastInformationFlow();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROADCAST_INFORMATION_FLOW__DATA = eINSTANCE.getBroadcastInformationFlow_Data();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROADCAST_INFORMATION_FLOW__SOURCE = eINSTANCE.getBroadcastInformationFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROADCAST_INFORMATION_FLOW__TARGET = eINSTANCE.getBroadcastInformationFlow_Target();

		/**
		 * The meta object literal for the '{@link ifmm.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.DataImpl
		 * @see ifmm.impl.IfmmPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DEFINITION = eINSTANCE.getData_Definition();

		/**
		 * The meta object literal for the '{@link ifmm.impl.OutputDataImpl <em>Output Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.OutputDataImpl
		 * @see ifmm.impl.IfmmPackageImpl#getOutputData()
		 * @generated
		 */
		EClass OUTPUT_DATA = eINSTANCE.getOutputData();

		/**
		 * The meta object literal for the '{@link ifmm.impl.InputDataImpl <em>Input Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.InputDataImpl
		 * @see ifmm.impl.IfmmPackageImpl#getInputData()
		 * @generated
		 */
		EClass INPUT_DATA = eINSTANCE.getInputData();

		/**
		 * The meta object literal for the '{@link ifmm.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.EdgeImpl
		 * @see ifmm.impl.IfmmPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SYSTEM = eINSTANCE.getEdge_System();

		/**
		 * The meta object literal for the '{@link ifmm.impl.InformationFlowToEntityEdgeImpl <em>Information Flow To Entity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.InformationFlowToEntityEdgeImpl
		 * @see ifmm.impl.IfmmPackageImpl#getInformationFlowToEntityEdge()
		 * @generated
		 */
		EClass INFORMATION_FLOW_TO_ENTITY_EDGE = eINSTANCE.getInformationFlowToEntityEdge();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW_TO_ENTITY_EDGE__TARGET = eINSTANCE.getInformationFlowToEntityEdge_Target();

		/**
		 * The meta object literal for the '{@link ifmm.impl.EntityToInformationFlowEdgeImpl <em>Entity To Information Flow Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.EntityToInformationFlowEdgeImpl
		 * @see ifmm.impl.IfmmPackageImpl#getEntityToInformationFlowEdge()
		 * @generated
		 */
		EClass ENTITY_TO_INFORMATION_FLOW_EDGE = eINSTANCE.getEntityToInformationFlowEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TO_INFORMATION_FLOW_EDGE__SOURCE = eINSTANCE.getEntityToInformationFlowEdge_Source();

		/**
		 * The meta object literal for the '{@link ifmm.impl.EntityToBroadcastInformationFlowEdgeImpl <em>Entity To Broadcast Information Flow Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.EntityToBroadcastInformationFlowEdgeImpl
		 * @see ifmm.impl.IfmmPackageImpl#getEntityToBroadcastInformationFlowEdge()
		 * @generated
		 */
		EClass ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE = eINSTANCE.getEntityToBroadcastInformationFlowEdge();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE__TARGET = eINSTANCE.getEntityToBroadcastInformationFlowEdge_Target();

		/**
		 * The meta object literal for the '{@link ifmm.impl.EntityToPointToPointInformationFlowEdgeImpl <em>Entity To Point To Point Information Flow Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.EntityToPointToPointInformationFlowEdgeImpl
		 * @see ifmm.impl.IfmmPackageImpl#getEntityToPointToPointInformationFlowEdge()
		 * @generated
		 */
		EClass ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE = eINSTANCE.getEntityToPointToPointInformationFlowEdge();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET = eINSTANCE.getEntityToPointToPointInformationFlowEdge_Target();

		/**
		 * The meta object literal for the '{@link ifmm.impl.BroadcastInformationFlowToEntityEdgeImpl <em>Broadcast Information Flow To Entity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.BroadcastInformationFlowToEntityEdgeImpl
		 * @see ifmm.impl.IfmmPackageImpl#getBroadcastInformationFlowToEntityEdge()
		 * @generated
		 */
		EClass BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE = eINSTANCE.getBroadcastInformationFlowToEntityEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE = eINSTANCE.getBroadcastInformationFlowToEntityEdge_Source();

		/**
		 * The meta object literal for the '{@link ifmm.impl.PointToPointInformationFlowToEntityEdgeImpl <em>Point To Point Information Flow To Entity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifmm.impl.PointToPointInformationFlowToEntityEdgeImpl
		 * @see ifmm.impl.IfmmPackageImpl#getPointToPointInformationFlowToEntityEdge()
		 * @generated
		 */
		EClass POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE = eINSTANCE.getPointToPointInformationFlowToEntityEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE = eINSTANCE.getPointToPointInformationFlowToEntityEdge_Source();

	}

} //IfmmPackage
