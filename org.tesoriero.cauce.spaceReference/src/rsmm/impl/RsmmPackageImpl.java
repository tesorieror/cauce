/**
 */
package rsmm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rsmm.ContextAwareEntityReference;
import rsmm.ReferenceDependency;
import rsmm.ReferentialSpace;
import rsmm.RsmmFactory;
import rsmm.RsmmPackage;
import rsmm.SpaceToEntityReferenceDependency;
import rsmm.SpaceToSpaceReferenceDependency;
import rsmm.SystemInformationFlowReferenceSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RsmmPackageImpl extends EPackageImpl implements RsmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemInformationFlowReferenceSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referentialSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextAwareEntityReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceToEntityReferenceDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceToSpaceReferenceDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceDependencyEClass = null;

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
	 * @see rsmm.RsmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RsmmPackageImpl() {
		super(eNS_URI, RsmmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RsmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RsmmPackage init() {
		if (isInited) return (RsmmPackage)EPackage.Registry.INSTANCE.getEPackage(RsmmPackage.eNS_URI);

		// Obtain or create and register package
		RsmmPackageImpl theRsmmPackage = (RsmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RsmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RsmmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRsmmPackage.createPackageContents();

		// Initialize created meta-data
		theRsmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRsmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RsmmPackage.eNS_URI, theRsmmPackage);
		return theRsmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemInformationFlowReferenceSpace() {
		return systemInformationFlowReferenceSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemInformationFlowReferenceSpace_ReferentialSpaces() {
		return (EReference)systemInformationFlowReferenceSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemInformationFlowReferenceSpace_SpaceToSpaceReferenceDependencies() {
		return (EReference)systemInformationFlowReferenceSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemInformationFlowReferenceSpace_SpaceToEntityReferenceDependencies() {
		return (EReference)systemInformationFlowReferenceSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemInformationFlowReferenceSpace_EntityReferences() {
		return (EReference)systemInformationFlowReferenceSpaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemInformationFlowReferenceSpace_Name() {
		return (EAttribute)systemInformationFlowReferenceSpaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemInformationFlowReferenceSpace_Id() {
		return (EAttribute)systemInformationFlowReferenceSpaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferentialSpace() {
		return referentialSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferentialSpace_Name() {
		return (EAttribute)referentialSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferentialSpace_System() {
		return (EReference)referentialSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferentialSpace_OngoingReferenceDependencies() {
		return (EReference)referentialSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferentialSpace_IncomingReferenceDependency() {
		return (EReference)referentialSpaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferentialSpace_Id() {
		return (EAttribute)referentialSpaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextAwareEntityReference() {
		return contextAwareEntityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareEntityReference_System() {
		return (EReference)contextAwareEntityReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextAwareEntityReference_Name() {
		return (EAttribute)contextAwareEntityReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareEntityReference_IncomingReferenceDependency() {
		return (EReference)contextAwareEntityReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextAwareEntityReference_Id() {
		return (EAttribute)contextAwareEntityReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextAwareEntityReference_Entity() {
		return (EAttribute)contextAwareEntityReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpaceToEntityReferenceDependency() {
		return spaceToEntityReferenceDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceToEntityReferenceDependency_System() {
		return (EReference)spaceToEntityReferenceDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceToEntityReferenceDependency_Child() {
		return (EReference)spaceToEntityReferenceDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpaceToSpaceReferenceDependency() {
		return spaceToSpaceReferenceDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceToSpaceReferenceDependency_System() {
		return (EReference)spaceToSpaceReferenceDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceToSpaceReferenceDependency_Child() {
		return (EReference)spaceToSpaceReferenceDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceDependency() {
		return referenceDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDependency_Cardinality() {
		return (EAttribute)referenceDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDependency_Parent() {
		return (EReference)referenceDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDependency_Id() {
		return (EAttribute)referenceDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RsmmFactory getRsmmFactory() {
		return (RsmmFactory)getEFactoryInstance();
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
		systemInformationFlowReferenceSpaceEClass = createEClass(SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE);
		createEReference(systemInformationFlowReferenceSpaceEClass, SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES);
		createEReference(systemInformationFlowReferenceSpaceEClass, SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES);
		createEReference(systemInformationFlowReferenceSpaceEClass, SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES);
		createEReference(systemInformationFlowReferenceSpaceEClass, SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES);
		createEAttribute(systemInformationFlowReferenceSpaceEClass, SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__NAME);
		createEAttribute(systemInformationFlowReferenceSpaceEClass, SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ID);

		referentialSpaceEClass = createEClass(REFERENTIAL_SPACE);
		createEAttribute(referentialSpaceEClass, REFERENTIAL_SPACE__NAME);
		createEReference(referentialSpaceEClass, REFERENTIAL_SPACE__SYSTEM);
		createEReference(referentialSpaceEClass, REFERENTIAL_SPACE__ONGOING_REFERENCE_DEPENDENCIES);
		createEReference(referentialSpaceEClass, REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY);
		createEAttribute(referentialSpaceEClass, REFERENTIAL_SPACE__ID);

		contextAwareEntityReferenceEClass = createEClass(CONTEXT_AWARE_ENTITY_REFERENCE);
		createEReference(contextAwareEntityReferenceEClass, CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM);
		createEAttribute(contextAwareEntityReferenceEClass, CONTEXT_AWARE_ENTITY_REFERENCE__NAME);
		createEReference(contextAwareEntityReferenceEClass, CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY);
		createEAttribute(contextAwareEntityReferenceEClass, CONTEXT_AWARE_ENTITY_REFERENCE__ID);
		createEAttribute(contextAwareEntityReferenceEClass, CONTEXT_AWARE_ENTITY_REFERENCE__ENTITY);

		spaceToEntityReferenceDependencyEClass = createEClass(SPACE_TO_ENTITY_REFERENCE_DEPENDENCY);
		createEReference(spaceToEntityReferenceDependencyEClass, SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__SYSTEM);
		createEReference(spaceToEntityReferenceDependencyEClass, SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__CHILD);

		spaceToSpaceReferenceDependencyEClass = createEClass(SPACE_TO_SPACE_REFERENCE_DEPENDENCY);
		createEReference(spaceToSpaceReferenceDependencyEClass, SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM);
		createEReference(spaceToSpaceReferenceDependencyEClass, SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD);

		referenceDependencyEClass = createEClass(REFERENCE_DEPENDENCY);
		createEAttribute(referenceDependencyEClass, REFERENCE_DEPENDENCY__CARDINALITY);
		createEReference(referenceDependencyEClass, REFERENCE_DEPENDENCY__PARENT);
		createEAttribute(referenceDependencyEClass, REFERENCE_DEPENDENCY__ID);
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
		spaceToEntityReferenceDependencyEClass.getESuperTypes().add(this.getReferenceDependency());
		spaceToSpaceReferenceDependencyEClass.getESuperTypes().add(this.getReferenceDependency());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemInformationFlowReferenceSpaceEClass, SystemInformationFlowReferenceSpace.class, "SystemInformationFlowReferenceSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemInformationFlowReferenceSpace_ReferentialSpaces(), this.getReferentialSpace(), this.getReferentialSpace_System(), "referentialSpaces", null, 0, -1, SystemInformationFlowReferenceSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemInformationFlowReferenceSpace_SpaceToSpaceReferenceDependencies(), this.getSpaceToSpaceReferenceDependency(), this.getSpaceToSpaceReferenceDependency_System(), "spaceToSpaceReferenceDependencies", null, 0, -1, SystemInformationFlowReferenceSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemInformationFlowReferenceSpace_SpaceToEntityReferenceDependencies(), this.getSpaceToEntityReferenceDependency(), this.getSpaceToEntityReferenceDependency_System(), "spaceToEntityReferenceDependencies", null, 0, -1, SystemInformationFlowReferenceSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemInformationFlowReferenceSpace_EntityReferences(), this.getContextAwareEntityReference(), this.getContextAwareEntityReference_System(), "entityReferences", null, 0, -1, SystemInformationFlowReferenceSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInformationFlowReferenceSpace_Name(), ecorePackage.getEString(), "name", "rsmm-default", 1, 1, SystemInformationFlowReferenceSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInformationFlowReferenceSpace_Id(), ecorePackage.getEInt(), "id", "0", 1, 1, SystemInformationFlowReferenceSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referentialSpaceEClass, ReferentialSpace.class, "ReferentialSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferentialSpace_Name(), ecorePackage.getEString(), "name", null, 1, 1, ReferentialSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferentialSpace_System(), this.getSystemInformationFlowReferenceSpace(), this.getSystemInformationFlowReferenceSpace_ReferentialSpaces(), "system", null, 1, 1, ReferentialSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferentialSpace_OngoingReferenceDependencies(), this.getReferenceDependency(), this.getReferenceDependency_Parent(), "ongoingReferenceDependencies", null, 0, -1, ReferentialSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferentialSpace_IncomingReferenceDependency(), this.getSpaceToSpaceReferenceDependency(), this.getSpaceToSpaceReferenceDependency_Child(), "incomingReferenceDependency", null, 0, 1, ReferentialSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferentialSpace_Id(), ecorePackage.getEInt(), "id", "-1", 1, 1, ReferentialSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextAwareEntityReferenceEClass, ContextAwareEntityReference.class, "ContextAwareEntityReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextAwareEntityReference_System(), this.getSystemInformationFlowReferenceSpace(), this.getSystemInformationFlowReferenceSpace_EntityReferences(), "system", null, 1, 1, ContextAwareEntityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextAwareEntityReference_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContextAwareEntityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareEntityReference_IncomingReferenceDependency(), this.getSpaceToEntityReferenceDependency(), this.getSpaceToEntityReferenceDependency_Child(), "incomingReferenceDependency", null, 1, 1, ContextAwareEntityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextAwareEntityReference_Id(), ecorePackage.getEInt(), "id", "-1", 1, 1, ContextAwareEntityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextAwareEntityReference_Entity(), ecorePackage.getEString(), "entity", null, 0, 1, ContextAwareEntityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spaceToEntityReferenceDependencyEClass, SpaceToEntityReferenceDependency.class, "SpaceToEntityReferenceDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpaceToEntityReferenceDependency_System(), this.getSystemInformationFlowReferenceSpace(), this.getSystemInformationFlowReferenceSpace_SpaceToEntityReferenceDependencies(), "system", null, 1, 1, SpaceToEntityReferenceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpaceToEntityReferenceDependency_Child(), this.getContextAwareEntityReference(), this.getContextAwareEntityReference_IncomingReferenceDependency(), "child", null, 1, 1, SpaceToEntityReferenceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spaceToSpaceReferenceDependencyEClass, SpaceToSpaceReferenceDependency.class, "SpaceToSpaceReferenceDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpaceToSpaceReferenceDependency_System(), this.getSystemInformationFlowReferenceSpace(), this.getSystemInformationFlowReferenceSpace_SpaceToSpaceReferenceDependencies(), "system", null, 1, 1, SpaceToSpaceReferenceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpaceToSpaceReferenceDependency_Child(), this.getReferentialSpace(), this.getReferentialSpace_IncomingReferenceDependency(), "child", null, 1, 1, SpaceToSpaceReferenceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceDependencyEClass, ReferenceDependency.class, "ReferenceDependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceDependency_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, ReferenceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceDependency_Parent(), this.getReferentialSpace(), this.getReferentialSpace_OngoingReferenceDependencies(), "parent", null, 1, 1, ReferenceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDependency_Id(), ecorePackage.getEInt(), "id", null, 1, 1, ReferenceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RsmmPackageImpl
