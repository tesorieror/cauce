/**
 */
package ecmm.impl;

import ecmm.ContextAction;
import ecmm.ContextCondition;
import ecmm.ContextMemory;
import ecmm.ContextSituation;
import ecmm.DictionaryMemory;
import ecmm.EcmmFactory;
import ecmm.EcmmPackage;
import ecmm.EntityContext;
import ecmm.HolderMemory;
import ecmm.LogicMemory;
import ecmm.MemoryContextCondition;
import ecmm.SensingContextCondition;
import ecmm.StackMemory;
import ecmm.SystemContext;
import ecmm.TimeMemory;
import ecmm.VariableDataDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcmmPackageImpl extends EPackageImpl implements EcmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDataDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextSituationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass holderMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingContextConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryContextConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemContextEClass = null;

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
	 * @see ecmm.EcmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcmmPackageImpl() {
		super(eNS_URI, EcmmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EcmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcmmPackage init() {
		if (isInited) return (EcmmPackage)EPackage.Registry.INSTANCE.getEPackage(EcmmPackage.eNS_URI);

		// Obtain or create and register package
		EcmmPackageImpl theEcmmPackage = (EcmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcmmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEcmmPackage.createPackageContents();

		// Initialize created meta-data
		theEcmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcmmPackage.eNS_URI, theEcmmPackage);
		return theEcmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDataDefinition() {
		return variableDataDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDataDefinition_Name() {
		return (EAttribute)variableDataDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDataDefinition_Definition() {
		return (EAttribute)variableDataDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDataDefinition_Id() {
		return (EAttribute)variableDataDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDataDefinition_EntityContext() {
		return (EReference)variableDataDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityContext() {
		return entityContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityContext_Situations() {
		return (EReference)entityContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityContext_State() {
		return (EReference)entityContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityContext_System() {
		return (EReference)entityContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityContext_Variables() {
		return (EReference)entityContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityContext_Entity() {
		return (EAttribute)entityContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityContext_Id() {
		return (EAttribute)entityContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityContext__Incoming() {
		return entityContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityContext__Ongoing() {
		return entityContextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextSituation() {
		return contextSituationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSituation_Actions() {
		return (EReference)contextSituationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSituation_MemoryConditions() {
		return (EReference)contextSituationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSituation_SensingConditions() {
		return (EReference)contextSituationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSituation_EntityContext() {
		return (EReference)contextSituationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextSituation_Name() {
		return (EAttribute)contextSituationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextSituation_Id() {
		return (EAttribute)contextSituationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContextSituation__Matches() {
		return contextSituationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextCondition() {
		return contextConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextCondition_Id() {
		return (EAttribute)contextConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContextCondition__Satisfies() {
		return contextConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextMemory() {
		return contextMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextMemory_Name() {
		return (EAttribute)contextMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextMemory_EntityContext() {
		return (EReference)contextMemoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextMemory_Id() {
		return (EAttribute)contextMemoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContextMemory__Match() {
		return contextMemoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContextMemory__Update() {
		return contextMemoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicMemory() {
		return logicMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictionaryMemory() {
		return dictionaryMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHolderMemory() {
		return holderMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStackMemory() {
		return stackMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeMemory() {
		return timeMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextAction() {
		return contextActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAction_Memory() {
		return (EReference)contextActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAction_Situation() {
		return (EReference)contextActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextAction_Expression() {
		return (EAttribute)contextActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextAction_Id() {
		return (EAttribute)contextActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextAction_MemoryName() {
		return (EAttribute)contextActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContextAction__Execute() {
		return contextActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingContextCondition() {
		return sensingContextConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensingContextCondition_Situation() {
		return (EReference)sensingContextConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingContextCondition_Informationflow() {
		return (EAttribute)sensingContextConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryContextCondition() {
		return memoryContextConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryContextCondition_Situation() {
		return (EReference)memoryContextConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryContextCondition_Expression() {
		return (EAttribute)memoryContextConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryContextCondition_ContextMemory() {
		return (EReference)memoryContextConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryContextCondition_MemoryName() {
		return (EAttribute)memoryContextConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemContext() {
		return systemContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContext_Entities() {
		return (EReference)systemContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemContext_Name() {
		return (EAttribute)systemContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcmmFactory getEcmmFactory() {
		return (EcmmFactory)getEFactoryInstance();
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
		variableDataDefinitionEClass = createEClass(VARIABLE_DATA_DEFINITION);
		createEAttribute(variableDataDefinitionEClass, VARIABLE_DATA_DEFINITION__NAME);
		createEAttribute(variableDataDefinitionEClass, VARIABLE_DATA_DEFINITION__DEFINITION);
		createEAttribute(variableDataDefinitionEClass, VARIABLE_DATA_DEFINITION__ID);
		createEReference(variableDataDefinitionEClass, VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT);

		entityContextEClass = createEClass(ENTITY_CONTEXT);
		createEReference(entityContextEClass, ENTITY_CONTEXT__SITUATIONS);
		createEReference(entityContextEClass, ENTITY_CONTEXT__STATE);
		createEReference(entityContextEClass, ENTITY_CONTEXT__SYSTEM);
		createEReference(entityContextEClass, ENTITY_CONTEXT__VARIABLES);
		createEAttribute(entityContextEClass, ENTITY_CONTEXT__ENTITY);
		createEAttribute(entityContextEClass, ENTITY_CONTEXT__ID);
		createEOperation(entityContextEClass, ENTITY_CONTEXT___INCOMING);
		createEOperation(entityContextEClass, ENTITY_CONTEXT___ONGOING);

		contextSituationEClass = createEClass(CONTEXT_SITUATION);
		createEReference(contextSituationEClass, CONTEXT_SITUATION__ACTIONS);
		createEReference(contextSituationEClass, CONTEXT_SITUATION__MEMORY_CONDITIONS);
		createEReference(contextSituationEClass, CONTEXT_SITUATION__SENSING_CONDITIONS);
		createEReference(contextSituationEClass, CONTEXT_SITUATION__ENTITY_CONTEXT);
		createEAttribute(contextSituationEClass, CONTEXT_SITUATION__NAME);
		createEAttribute(contextSituationEClass, CONTEXT_SITUATION__ID);
		createEOperation(contextSituationEClass, CONTEXT_SITUATION___MATCHES);

		contextConditionEClass = createEClass(CONTEXT_CONDITION);
		createEAttribute(contextConditionEClass, CONTEXT_CONDITION__ID);
		createEOperation(contextConditionEClass, CONTEXT_CONDITION___SATISFIES);

		contextMemoryEClass = createEClass(CONTEXT_MEMORY);
		createEAttribute(contextMemoryEClass, CONTEXT_MEMORY__NAME);
		createEReference(contextMemoryEClass, CONTEXT_MEMORY__ENTITY_CONTEXT);
		createEAttribute(contextMemoryEClass, CONTEXT_MEMORY__ID);
		createEOperation(contextMemoryEClass, CONTEXT_MEMORY___MATCH);
		createEOperation(contextMemoryEClass, CONTEXT_MEMORY___UPDATE);

		logicMemoryEClass = createEClass(LOGIC_MEMORY);

		dictionaryMemoryEClass = createEClass(DICTIONARY_MEMORY);

		holderMemoryEClass = createEClass(HOLDER_MEMORY);

		stackMemoryEClass = createEClass(STACK_MEMORY);

		timeMemoryEClass = createEClass(TIME_MEMORY);

		contextActionEClass = createEClass(CONTEXT_ACTION);
		createEReference(contextActionEClass, CONTEXT_ACTION__MEMORY);
		createEReference(contextActionEClass, CONTEXT_ACTION__SITUATION);
		createEAttribute(contextActionEClass, CONTEXT_ACTION__EXPRESSION);
		createEAttribute(contextActionEClass, CONTEXT_ACTION__ID);
		createEAttribute(contextActionEClass, CONTEXT_ACTION__MEMORY_NAME);
		createEOperation(contextActionEClass, CONTEXT_ACTION___EXECUTE);

		sensingContextConditionEClass = createEClass(SENSING_CONTEXT_CONDITION);
		createEReference(sensingContextConditionEClass, SENSING_CONTEXT_CONDITION__SITUATION);
		createEAttribute(sensingContextConditionEClass, SENSING_CONTEXT_CONDITION__INFORMATIONFLOW);

		memoryContextConditionEClass = createEClass(MEMORY_CONTEXT_CONDITION);
		createEReference(memoryContextConditionEClass, MEMORY_CONTEXT_CONDITION__SITUATION);
		createEAttribute(memoryContextConditionEClass, MEMORY_CONTEXT_CONDITION__EXPRESSION);
		createEReference(memoryContextConditionEClass, MEMORY_CONTEXT_CONDITION__CONTEXT_MEMORY);
		createEAttribute(memoryContextConditionEClass, MEMORY_CONTEXT_CONDITION__MEMORY_NAME);

		systemContextEClass = createEClass(SYSTEM_CONTEXT);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__ENTITIES);
		createEAttribute(systemContextEClass, SYSTEM_CONTEXT__NAME);
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
		logicMemoryEClass.getESuperTypes().add(this.getContextMemory());
		dictionaryMemoryEClass.getESuperTypes().add(this.getContextMemory());
		holderMemoryEClass.getESuperTypes().add(this.getContextMemory());
		stackMemoryEClass.getESuperTypes().add(this.getContextMemory());
		timeMemoryEClass.getESuperTypes().add(this.getContextMemory());
		sensingContextConditionEClass.getESuperTypes().add(this.getContextCondition());
		memoryContextConditionEClass.getESuperTypes().add(this.getContextCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(variableDataDefinitionEClass, VariableDataDefinition.class, "VariableDataDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableDataDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, VariableDataDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDataDefinition_Definition(), ecorePackage.getEString(), "definition", null, 1, 1, VariableDataDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDataDefinition_Id(), ecorePackage.getEInt(), "id", "-1", 1, 1, VariableDataDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDataDefinition_EntityContext(), this.getEntityContext(), this.getEntityContext_Variables(), "entityContext", null, 1, 1, VariableDataDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityContextEClass, EntityContext.class, "EntityContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityContext_Situations(), this.getContextSituation(), this.getContextSituation_EntityContext(), "situations", null, 0, -1, EntityContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityContext_State(), this.getContextMemory(), this.getContextMemory_EntityContext(), "state", null, 0, -1, EntityContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityContext_System(), this.getSystemContext(), this.getSystemContext_Entities(), "system", null, 1, 1, EntityContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityContext_Variables(), this.getVariableDataDefinition(), this.getVariableDataDefinition_EntityContext(), "variables", null, 0, -1, EntityContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityContext_Entity(), ecorePackage.getEString(), "entity", null, 1, 1, EntityContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityContext_Id(), ecorePackage.getEInt(), "id", "-1", 1, 1, EntityContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEntityContext__Incoming(), null, "incoming", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEntityContext__Ongoing(), null, "ongoing", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextSituationEClass, ContextSituation.class, "ContextSituation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextSituation_Actions(), this.getContextAction(), this.getContextAction_Situation(), "actions", null, 0, -1, ContextSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextSituation_MemoryConditions(), this.getMemoryContextCondition(), this.getMemoryContextCondition_Situation(), "memoryConditions", null, 0, -1, ContextSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextSituation_SensingConditions(), this.getSensingContextCondition(), this.getSensingContextCondition_Situation(), "sensingConditions", null, 0, -1, ContextSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextSituation_EntityContext(), this.getEntityContext(), this.getEntityContext_Situations(), "entityContext", null, 1, 1, ContextSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextSituation_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContextSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextSituation_Id(), ecorePackage.getEInt(), "id", "-1", 1, 1, ContextSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContextSituation__Matches(), ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextConditionEClass, ContextCondition.class, "ContextCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextCondition_Id(), ecorePackage.getEInt(), "id", "-1", 1, 1, ContextCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContextCondition__Satisfies(), ecorePackage.getEBoolean(), "satisfies", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextMemoryEClass, ContextMemory.class, "ContextMemory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextMemory_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContextMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextMemory_EntityContext(), this.getEntityContext(), this.getEntityContext_State(), "entityContext", null, 1, 1, ContextMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextMemory_Id(), ecorePackage.getEInt(), "id", "-1", 1, 1, ContextMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContextMemory__Match(), null, "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContextMemory__Update(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(logicMemoryEClass, LogicMemory.class, "LogicMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dictionaryMemoryEClass, DictionaryMemory.class, "DictionaryMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(holderMemoryEClass, HolderMemory.class, "HolderMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stackMemoryEClass, StackMemory.class, "StackMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeMemoryEClass, TimeMemory.class, "TimeMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextActionEClass, ContextAction.class, "ContextAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextAction_Memory(), this.getContextMemory(), null, "memory", null, 1, 1, ContextAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAction_Situation(), this.getContextSituation(), this.getContextSituation_Actions(), "situation", null, 1, 1, ContextAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextAction_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, ContextAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextAction_Id(), ecorePackage.getEInt(), "id", "-1", 1, 1, ContextAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextAction_MemoryName(), ecorePackage.getEString(), "memoryName", null, 0, 1, ContextAction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getContextAction__Execute(), null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sensingContextConditionEClass, SensingContextCondition.class, "SensingContextCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensingContextCondition_Situation(), this.getContextSituation(), this.getContextSituation_SensingConditions(), "situation", null, 1, 1, SensingContextCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensingContextCondition_Informationflow(), ecorePackage.getEString(), "informationflow", null, 0, 1, SensingContextCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryContextConditionEClass, MemoryContextCondition.class, "MemoryContextCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryContextCondition_Situation(), this.getContextSituation(), this.getContextSituation_MemoryConditions(), "situation", null, 0, 1, MemoryContextCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryContextCondition_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, MemoryContextCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryContextCondition_ContextMemory(), this.getContextMemory(), null, "contextMemory", null, 1, 1, MemoryContextCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryContextCondition_MemoryName(), ecorePackage.getEString(), "memoryName", null, 0, 1, MemoryContextCondition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(systemContextEClass, SystemContext.class, "SystemContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemContext_Entities(), this.getEntityContext(), this.getEntityContext_System(), "entities", null, 0, -1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemContext_Name(), ecorePackage.getEString(), "name", "ecmm-default", 1, 1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EcmmPackageImpl
