/**
 */
package somm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import somm.IndividualInstance;
import somm.IndividualRealization;
import somm.Role;
import somm.SocialInstance;
import somm.Society;
import somm.SommFactory;
import somm.SommPackage;
import somm.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SommPackageImpl extends EPackageImpl implements SommPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass societyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialInstanceEClass = null;

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
	 * @see somm.SommPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SommPackageImpl() {
		super(eNS_URI, SommFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SommPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SommPackage init() {
		if (isInited) return (SommPackage)EPackage.Registry.INSTANCE.getEPackage(SommPackage.eNS_URI);

		// Obtain or create and register package
		SommPackageImpl theSommPackage = (SommPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SommPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SommPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSommPackage.createPackageContents();

		// Initialize created meta-data
		theSommPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSommPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SommPackage.eNS_URI, theSommPackage);
		return theSommPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Society() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_IsRealizedByIndividual() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Parent() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Children() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Id() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualRealization() {
		return individualRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualRealization_Target() {
		return (EReference)individualRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualRealization_Source() {
		return (EReference)individualRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualRealization_Society() {
		return (EReference)individualRealizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualRealization_Id() {
		return (EAttribute)individualRealizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSociety() {
		return societyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSociety_Generalizations() {
		return (EReference)societyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSociety_Relaizations() {
		return (EReference)societyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSociety_Individuals() {
		return (EReference)societyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSociety_Name() {
		return (EAttribute)societyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSociety_Roles() {
		return (EReference)societyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialization() {
		return specializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialization_Target() {
		return (EReference)specializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialization_Source() {
		return (EReference)specializationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialization_Society() {
		return (EReference)specializationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialization_Id() {
		return (EAttribute)specializationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualInstance() {
		return individualInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualInstance_Realizes() {
		return (EReference)individualInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualInstance_Id() {
		return (EAttribute)individualInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualInstance_Name() {
		return (EAttribute)individualInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualInstance_Society() {
		return (EReference)individualInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialInstance() {
		return socialInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocialInstance__GetID() {
		return socialInstanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocialInstance__GetName() {
		return socialInstanceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SommFactory getSommFactory() {
		return (SommFactory)getEFactoryInstance();
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
		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__SOCIETY);
		createEReference(roleEClass, ROLE__IS_REALIZED_BY_INDIVIDUAL);
		createEReference(roleEClass, ROLE__PARENT);
		createEReference(roleEClass, ROLE__CHILDREN);
		createEAttribute(roleEClass, ROLE__ID);
		createEAttribute(roleEClass, ROLE__NAME);

		individualRealizationEClass = createEClass(INDIVIDUAL_REALIZATION);
		createEReference(individualRealizationEClass, INDIVIDUAL_REALIZATION__TARGET);
		createEReference(individualRealizationEClass, INDIVIDUAL_REALIZATION__SOURCE);
		createEReference(individualRealizationEClass, INDIVIDUAL_REALIZATION__SOCIETY);
		createEAttribute(individualRealizationEClass, INDIVIDUAL_REALIZATION__ID);

		societyEClass = createEClass(SOCIETY);
		createEReference(societyEClass, SOCIETY__GENERALIZATIONS);
		createEReference(societyEClass, SOCIETY__RELAIZATIONS);
		createEReference(societyEClass, SOCIETY__INDIVIDUALS);
		createEAttribute(societyEClass, SOCIETY__NAME);
		createEReference(societyEClass, SOCIETY__ROLES);

		specializationEClass = createEClass(SPECIALIZATION);
		createEReference(specializationEClass, SPECIALIZATION__TARGET);
		createEReference(specializationEClass, SPECIALIZATION__SOURCE);
		createEReference(specializationEClass, SPECIALIZATION__SOCIETY);
		createEAttribute(specializationEClass, SPECIALIZATION__ID);

		individualInstanceEClass = createEClass(INDIVIDUAL_INSTANCE);
		createEReference(individualInstanceEClass, INDIVIDUAL_INSTANCE__REALIZES);
		createEAttribute(individualInstanceEClass, INDIVIDUAL_INSTANCE__ID);
		createEAttribute(individualInstanceEClass, INDIVIDUAL_INSTANCE__NAME);
		createEReference(individualInstanceEClass, INDIVIDUAL_INSTANCE__SOCIETY);

		socialInstanceEClass = createEClass(SOCIAL_INSTANCE);
		createEOperation(socialInstanceEClass, SOCIAL_INSTANCE___GET_ID);
		createEOperation(socialInstanceEClass, SOCIAL_INSTANCE___GET_NAME);
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
		roleEClass.getESuperTypes().add(this.getSocialInstance());
		individualInstanceEClass.getESuperTypes().add(this.getSocialInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Society(), this.getSociety(), this.getSociety_Roles(), "society", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_IsRealizedByIndividual(), this.getIndividualRealization(), this.getIndividualRealization_Target(), "isRealizedByIndividual", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Parent(), this.getSpecialization(), this.getSpecialization_Target(), "parent", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Children(), this.getSpecialization(), this.getSpecialization_Source(), "children", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualRealizationEClass, IndividualRealization.class, "IndividualRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualRealization_Target(), this.getRole(), this.getRole_IsRealizedByIndividual(), "target", null, 1, 1, IndividualRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualRealization_Source(), this.getIndividualInstance(), this.getIndividualInstance_Realizes(), "source", null, 1, 1, IndividualRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualRealization_Society(), this.getSociety(), this.getSociety_Relaizations(), "society", null, 1, 1, IndividualRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndividualRealization_Id(), ecorePackage.getEInt(), "id", null, 1, 1, IndividualRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(societyEClass, Society.class, "Society", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSociety_Generalizations(), this.getSpecialization(), this.getSpecialization_Society(), "generalizations", null, 0, -1, Society.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSociety_Relaizations(), this.getIndividualRealization(), this.getIndividualRealization_Society(), "relaizations", null, 0, -1, Society.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSociety_Individuals(), this.getIndividualInstance(), this.getIndividualInstance_Society(), "individuals", null, 0, -1, Society.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSociety_Name(), ecorePackage.getEString(), "name", null, 1, 1, Society.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSociety_Roles(), this.getRole(), this.getRole_Society(), "roles", null, 1, -1, Society.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specializationEClass, Specialization.class, "Specialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecialization_Target(), this.getRole(), this.getRole_Parent(), "target", null, 1, 1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialization_Source(), this.getRole(), this.getRole_Children(), "source", null, 1, 1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialization_Society(), this.getSociety(), this.getSociety_Generalizations(), "society", null, 1, 1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialization_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualInstanceEClass, IndividualInstance.class, "IndividualInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualInstance_Realizes(), this.getIndividualRealization(), this.getIndividualRealization_Source(), "realizes", null, 1, -1, IndividualInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndividualInstance_Id(), ecorePackage.getEInt(), "id", null, 1, 1, IndividualInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndividualInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, IndividualInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualInstance_Society(), this.getSociety(), this.getSociety_Individuals(), "society", null, 1, 1, IndividualInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(socialInstanceEClass, SocialInstance.class, "SocialInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSocialInstance__GetID(), ecorePackage.getEInt(), "getID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSocialInstance__GetName(), ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SommPackageImpl
