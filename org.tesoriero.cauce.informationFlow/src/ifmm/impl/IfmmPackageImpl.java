/**
 */
package ifmm.impl;

import ifmm.BroadcastInformationFlow;
import ifmm.BroadcastInformationFlowToEntityEdge;
import ifmm.ContextAwareEntity;
import ifmm.Data;
import ifmm.Edge;
import ifmm.EntityToBroadcastInformationFlowEdge;
import ifmm.EntityToInformationFlowEdge;
import ifmm.EntityToPointToPointInformationFlowEdge;
import ifmm.IfmmFactory;
import ifmm.IfmmPackage;
import ifmm.InformationFlow;
import ifmm.InformationFlowToEntityEdge;
import ifmm.InputData;
import ifmm.OutputData;
import ifmm.PointToPointInformationFlow;
import ifmm.PointToPointInformationFlowToEntityEdge;
import ifmm.SystemInformaitonFlow;

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
public class IfmmPackageImpl extends EPackageImpl implements IfmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemInformaitonFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextAwareEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointToPointInformationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastInformationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDataEClass = null;

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
	private EClass informationFlowToEntityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityToInformationFlowEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityToBroadcastInformationFlowEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityToPointToPointInformationFlowEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastInformationFlowToEntityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointToPointInformationFlowToEntityEdgeEClass = null;

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
	 * @see ifmm.IfmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IfmmPackageImpl() {
		super(eNS_URI, IfmmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IfmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IfmmPackage init() {
		if (isInited) return (IfmmPackage)EPackage.Registry.INSTANCE.getEPackage(IfmmPackage.eNS_URI);

		// Obtain or create and register package
		IfmmPackageImpl theIfmmPackage = (IfmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IfmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IfmmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIfmmPackage.createPackageContents();

		// Initialize created meta-data
		theIfmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIfmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IfmmPackage.eNS_URI, theIfmmPackage);
		return theIfmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemInformaitonFlow() {
		return systemInformaitonFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemInformaitonFlow_Entities() {
		return (EReference)systemInformaitonFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemInformaitonFlow_Id() {
		return (EAttribute)systemInformaitonFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemInformaitonFlow_Name() {
		return (EAttribute)systemInformaitonFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemInformaitonFlow_InformationFlows() {
		return (EReference)systemInformaitonFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemInformaitonFlow_Edges() {
		return (EReference)systemInformaitonFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextAwareEntity() {
		return contextAwareEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareEntity_System() {
		return (EReference)contextAwareEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextAwareEntity_Id() {
		return (EAttribute)contextAwareEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextAwareEntity_Name() {
		return (EAttribute)contextAwareEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareEntity_OngoingInformationFlows() {
		return (EReference)contextAwareEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareEntity_IncomingInformationFlows() {
		return (EReference)contextAwareEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlow() {
		return informationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationFlow_Id() {
		return (EAttribute)informationFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationFlow_Name() {
		return (EAttribute)informationFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_System() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointToPointInformationFlow() {
		return pointToPointInformationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointToPointInformationFlow_OutputData() {
		return (EReference)pointToPointInformationFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointToPointInformationFlow_Source() {
		return (EReference)pointToPointInformationFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointToPointInformationFlow_Target() {
		return (EReference)pointToPointInformationFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointToPointInformationFlow_InputData() {
		return (EReference)pointToPointInformationFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastInformationFlow() {
		return broadcastInformationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastInformationFlow_Data() {
		return (EReference)broadcastInformationFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastInformationFlow_Source() {
		return (EReference)broadcastInformationFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastInformationFlow_Target() {
		return (EReference)broadcastInformationFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Definition() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputData() {
		return outputDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputData() {
		return inputDataEClass;
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
	public EReference getEdge_System() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlowToEntityEdge() {
		return informationFlowToEntityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlowToEntityEdge_Target() {
		return (EReference)informationFlowToEntityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityToInformationFlowEdge() {
		return entityToInformationFlowEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityToInformationFlowEdge_Source() {
		return (EReference)entityToInformationFlowEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityToBroadcastInformationFlowEdge() {
		return entityToBroadcastInformationFlowEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityToBroadcastInformationFlowEdge_Target() {
		return (EReference)entityToBroadcastInformationFlowEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityToPointToPointInformationFlowEdge() {
		return entityToPointToPointInformationFlowEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityToPointToPointInformationFlowEdge_Target() {
		return (EReference)entityToPointToPointInformationFlowEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastInformationFlowToEntityEdge() {
		return broadcastInformationFlowToEntityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastInformationFlowToEntityEdge_Source() {
		return (EReference)broadcastInformationFlowToEntityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointToPointInformationFlowToEntityEdge() {
		return pointToPointInformationFlowToEntityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointToPointInformationFlowToEntityEdge_Source() {
		return (EReference)pointToPointInformationFlowToEntityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfmmFactory getIfmmFactory() {
		return (IfmmFactory)getEFactoryInstance();
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
		systemInformaitonFlowEClass = createEClass(SYSTEM_INFORMAITON_FLOW);
		createEReference(systemInformaitonFlowEClass, SYSTEM_INFORMAITON_FLOW__ENTITIES);
		createEAttribute(systemInformaitonFlowEClass, SYSTEM_INFORMAITON_FLOW__ID);
		createEAttribute(systemInformaitonFlowEClass, SYSTEM_INFORMAITON_FLOW__NAME);
		createEReference(systemInformaitonFlowEClass, SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS);
		createEReference(systemInformaitonFlowEClass, SYSTEM_INFORMAITON_FLOW__EDGES);

		contextAwareEntityEClass = createEClass(CONTEXT_AWARE_ENTITY);
		createEReference(contextAwareEntityEClass, CONTEXT_AWARE_ENTITY__SYSTEM);
		createEAttribute(contextAwareEntityEClass, CONTEXT_AWARE_ENTITY__ID);
		createEAttribute(contextAwareEntityEClass, CONTEXT_AWARE_ENTITY__NAME);
		createEReference(contextAwareEntityEClass, CONTEXT_AWARE_ENTITY__ONGOING_INFORMATION_FLOWS);
		createEReference(contextAwareEntityEClass, CONTEXT_AWARE_ENTITY__INCOMING_INFORMATION_FLOWS);

		informationFlowEClass = createEClass(INFORMATION_FLOW);
		createEAttribute(informationFlowEClass, INFORMATION_FLOW__ID);
		createEAttribute(informationFlowEClass, INFORMATION_FLOW__NAME);
		createEReference(informationFlowEClass, INFORMATION_FLOW__SYSTEM);

		pointToPointInformationFlowEClass = createEClass(POINT_TO_POINT_INFORMATION_FLOW);
		createEReference(pointToPointInformationFlowEClass, POINT_TO_POINT_INFORMATION_FLOW__OUTPUT_DATA);
		createEReference(pointToPointInformationFlowEClass, POINT_TO_POINT_INFORMATION_FLOW__SOURCE);
		createEReference(pointToPointInformationFlowEClass, POINT_TO_POINT_INFORMATION_FLOW__TARGET);
		createEReference(pointToPointInformationFlowEClass, POINT_TO_POINT_INFORMATION_FLOW__INPUT_DATA);

		broadcastInformationFlowEClass = createEClass(BROADCAST_INFORMATION_FLOW);
		createEReference(broadcastInformationFlowEClass, BROADCAST_INFORMATION_FLOW__DATA);
		createEReference(broadcastInformationFlowEClass, BROADCAST_INFORMATION_FLOW__SOURCE);
		createEReference(broadcastInformationFlowEClass, BROADCAST_INFORMATION_FLOW__TARGET);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__DEFINITION);

		outputDataEClass = createEClass(OUTPUT_DATA);

		inputDataEClass = createEClass(INPUT_DATA);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__SYSTEM);

		informationFlowToEntityEdgeEClass = createEClass(INFORMATION_FLOW_TO_ENTITY_EDGE);
		createEReference(informationFlowToEntityEdgeEClass, INFORMATION_FLOW_TO_ENTITY_EDGE__TARGET);

		entityToInformationFlowEdgeEClass = createEClass(ENTITY_TO_INFORMATION_FLOW_EDGE);
		createEReference(entityToInformationFlowEdgeEClass, ENTITY_TO_INFORMATION_FLOW_EDGE__SOURCE);

		entityToBroadcastInformationFlowEdgeEClass = createEClass(ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE);
		createEReference(entityToBroadcastInformationFlowEdgeEClass, ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE__TARGET);

		entityToPointToPointInformationFlowEdgeEClass = createEClass(ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE);
		createEReference(entityToPointToPointInformationFlowEdgeEClass, ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET);

		broadcastInformationFlowToEntityEdgeEClass = createEClass(BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE);
		createEReference(broadcastInformationFlowToEntityEdgeEClass, BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE);

		pointToPointInformationFlowToEntityEdgeEClass = createEClass(POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE);
		createEReference(pointToPointInformationFlowToEntityEdgeEClass, POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE);
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
		pointToPointInformationFlowEClass.getESuperTypes().add(this.getInformationFlow());
		broadcastInformationFlowEClass.getESuperTypes().add(this.getInformationFlow());
		outputDataEClass.getESuperTypes().add(this.getData());
		inputDataEClass.getESuperTypes().add(this.getData());
		informationFlowToEntityEdgeEClass.getESuperTypes().add(this.getEdge());
		entityToInformationFlowEdgeEClass.getESuperTypes().add(this.getEdge());
		entityToBroadcastInformationFlowEdgeEClass.getESuperTypes().add(this.getEntityToInformationFlowEdge());
		entityToPointToPointInformationFlowEdgeEClass.getESuperTypes().add(this.getEntityToInformationFlowEdge());
		broadcastInformationFlowToEntityEdgeEClass.getESuperTypes().add(this.getInformationFlowToEntityEdge());
		pointToPointInformationFlowToEntityEdgeEClass.getESuperTypes().add(this.getInformationFlowToEntityEdge());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemInformaitonFlowEClass, SystemInformaitonFlow.class, "SystemInformaitonFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemInformaitonFlow_Entities(), this.getContextAwareEntity(), this.getContextAwareEntity_System(), "entities", null, 0, -1, SystemInformaitonFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInformaitonFlow_Id(), ecorePackage.getEInt(), "id", null, 1, 1, SystemInformaitonFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInformaitonFlow_Name(), ecorePackage.getEString(), "name", "ifmm-default", 1, 1, SystemInformaitonFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemInformaitonFlow_InformationFlows(), this.getInformationFlow(), this.getInformationFlow_System(), "informationFlows", null, 0, -1, SystemInformaitonFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemInformaitonFlow_Edges(), this.getEdge(), this.getEdge_System(), "edges", null, 0, -1, SystemInformaitonFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextAwareEntityEClass, ContextAwareEntity.class, "ContextAwareEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextAwareEntity_System(), this.getSystemInformaitonFlow(), this.getSystemInformaitonFlow_Entities(), "system", null, 1, 1, ContextAwareEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextAwareEntity_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ContextAwareEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextAwareEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContextAwareEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareEntity_OngoingInformationFlows(), this.getEntityToInformationFlowEdge(), this.getEntityToInformationFlowEdge_Source(), "ongoingInformationFlows", null, 0, -1, ContextAwareEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareEntity_IncomingInformationFlows(), this.getInformationFlowToEntityEdge(), this.getInformationFlowToEntityEdge_Target(), "incomingInformationFlows", null, 0, -1, ContextAwareEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationFlowEClass, InformationFlow.class, "InformationFlow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformationFlow_Id(), ecorePackage.getEInt(), "id", null, 1, 1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationFlow_Name(), ecorePackage.getEString(), "name", null, 1, 1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationFlow_System(), this.getSystemInformaitonFlow(), this.getSystemInformaitonFlow_InformationFlows(), "system", null, 1, 1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointToPointInformationFlowEClass, PointToPointInformationFlow.class, "PointToPointInformationFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointToPointInformationFlow_OutputData(), this.getOutputData(), null, "outputData", null, 0, -1, PointToPointInformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointToPointInformationFlow_Source(), this.getEntityToPointToPointInformationFlowEdge(), this.getEntityToPointToPointInformationFlowEdge_Target(), "source", null, 1, 1, PointToPointInformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointToPointInformationFlow_Target(), this.getPointToPointInformationFlowToEntityEdge(), this.getPointToPointInformationFlowToEntityEdge_Source(), "target", null, 1, 1, PointToPointInformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointToPointInformationFlow_InputData(), this.getInputData(), null, "inputData", null, 0, -1, PointToPointInformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(broadcastInformationFlowEClass, BroadcastInformationFlow.class, "BroadcastInformationFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBroadcastInformationFlow_Data(), this.getOutputData(), null, "data", null, 0, -1, BroadcastInformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBroadcastInformationFlow_Source(), this.getEntityToBroadcastInformationFlowEdge(), this.getEntityToBroadcastInformationFlowEdge_Target(), "source", null, 1, 1, BroadcastInformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBroadcastInformationFlow_Target(), this.getBroadcastInformationFlowToEntityEdge(), this.getBroadcastInformationFlowToEntityEdge_Source(), "target", null, 1, 1, BroadcastInformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputDataEClass, OutputData.class, "OutputData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputDataEClass, InputData.class, "InputData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_System(), this.getSystemInformaitonFlow(), this.getSystemInformaitonFlow_Edges(), "system", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationFlowToEntityEdgeEClass, InformationFlowToEntityEdge.class, "InformationFlowToEntityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationFlowToEntityEdge_Target(), this.getContextAwareEntity(), this.getContextAwareEntity_IncomingInformationFlows(), "target", null, 1, 1, InformationFlowToEntityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityToInformationFlowEdgeEClass, EntityToInformationFlowEdge.class, "EntityToInformationFlowEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityToInformationFlowEdge_Source(), this.getContextAwareEntity(), this.getContextAwareEntity_OngoingInformationFlows(), "source", null, 1, 1, EntityToInformationFlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityToBroadcastInformationFlowEdgeEClass, EntityToBroadcastInformationFlowEdge.class, "EntityToBroadcastInformationFlowEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityToBroadcastInformationFlowEdge_Target(), this.getBroadcastInformationFlow(), this.getBroadcastInformationFlow_Source(), "target", null, 1, 1, EntityToBroadcastInformationFlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityToPointToPointInformationFlowEdgeEClass, EntityToPointToPointInformationFlowEdge.class, "EntityToPointToPointInformationFlowEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityToPointToPointInformationFlowEdge_Target(), this.getPointToPointInformationFlow(), this.getPointToPointInformationFlow_Source(), "target", null, 1, 1, EntityToPointToPointInformationFlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(broadcastInformationFlowToEntityEdgeEClass, BroadcastInformationFlowToEntityEdge.class, "BroadcastInformationFlowToEntityEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBroadcastInformationFlowToEntityEdge_Source(), this.getBroadcastInformationFlow(), this.getBroadcastInformationFlow_Target(), "source", null, 1, 1, BroadcastInformationFlowToEntityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointToPointInformationFlowToEntityEdgeEClass, PointToPointInformationFlowToEntityEdge.class, "PointToPointInformationFlowToEntityEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointToPointInformationFlowToEntityEdge_Source(), this.getPointToPointInformationFlow(), this.getPointToPointInformationFlow_Target(), "source", null, 1, 1, PointToPointInformationFlowToEntityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IfmmPackageImpl
