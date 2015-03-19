/**
 */
package spmm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import spmm.Contention;
import spmm.Generalization;
import spmm.Grouping;
import spmm.Identification;
import spmm.LocationUnit;
import spmm.PhysicalSpace;
import spmm.Representation;
import spmm.Space;
import spmm.SpaceRelationship;
import spmm.SpmmFactory;
import spmm.SpmmPackage;
import spmm.Universe;
import spmm.VirtualSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpmmPackageImpl extends EPackageImpl implements SpmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceRelationshipEClass = null;

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
	 * @see spmm.SpmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpmmPackageImpl() {
		super(eNS_URI, SpmmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpmmPackage init() {
		if (isInited) return (SpmmPackage)EPackage.Registry.INSTANCE.getEPackage(SpmmPackage.eNS_URI);

		// Obtain or create and register package
		SpmmPackageImpl theSpmmPackage = (SpmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpmmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSpmmPackage.createPackageContents();

		// Initialize created meta-data
		theSpmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpmmPackage.eNS_URI, theSpmmPackage);
		return theSpmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniverse() {
		return universeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniverse_Name() {
		return (EAttribute)universeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniverse_Id() {
		return (EAttribute)universeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniverse_Groupings() {
		return (EReference)universeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniverse_Generalizations() {
		return (EReference)universeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniverse_Contentions() {
		return (EReference)universeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniverse_Representations() {
		return (EReference)universeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniverse_VirtualSpaces() {
		return (EReference)universeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniverse_PhysicalSpaces() {
		return (EReference)universeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniverse_LocationUnits() {
		return (EReference)universeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpace() {
		return spaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpace_Name() {
		return (EAttribute)spaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpace_Id() {
		return (EAttribute)spaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpace_GroupBy() {
		return (EReference)spaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpace_GeneralizedBy() {
		return (EReference)spaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualSpace() {
		return virtualSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualSpace_Universe() {
		return (EReference)virtualSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualSpace_Contains() {
		return (EReference)virtualSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualSpace_Generalizes() {
		return (EReference)virtualSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalSpace() {
		return physicalSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSpace_Universe() {
		return (EReference)physicalSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSpace_RepresentedBy() {
		return (EReference)physicalSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSpace_InnerSpaces() {
		return (EReference)physicalSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSpace_Container() {
		return (EReference)physicalSpaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationUnit() {
		return locationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationUnit_Identifications() {
		return (EReference)locationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationUnit_Universe() {
		return (EReference)locationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationUnit_Represents() {
		return (EReference)locationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationUnit_Name() {
		return (EAttribute)locationUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentification() {
		return identificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentification_LocationUnit() {
		return (EReference)identificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentification_Technology() {
		return (EAttribute)identificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentification_Content() {
		return (EAttribute)identificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrouping() {
		return groupingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrouping_Universe() {
		return (EReference)groupingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrouping_Child() {
		return (EReference)groupingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrouping_Parent() {
		return (EReference)groupingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Universe() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Parent() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Generalizes() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContention() {
		return contentionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContention_Universe() {
		return (EReference)contentionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContention_Parent() {
		return (EReference)contentionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContention_Child() {
		return (EReference)contentionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentation() {
		return representationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_Universe() {
		return (EReference)representationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_Represents() {
		return (EReference)representationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_RepresentedBy() {
		return (EReference)representationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpaceRelationship() {
		return spaceRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpaceRelationship_Id() {
		return (EAttribute)spaceRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmmFactory getSpmmFactory() {
		return (SpmmFactory)getEFactoryInstance();
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
		universeEClass = createEClass(UNIVERSE);
		createEAttribute(universeEClass, UNIVERSE__NAME);
		createEAttribute(universeEClass, UNIVERSE__ID);
		createEReference(universeEClass, UNIVERSE__GROUPINGS);
		createEReference(universeEClass, UNIVERSE__GENERALIZATIONS);
		createEReference(universeEClass, UNIVERSE__CONTENTIONS);
		createEReference(universeEClass, UNIVERSE__REPRESENTATIONS);
		createEReference(universeEClass, UNIVERSE__VIRTUAL_SPACES);
		createEReference(universeEClass, UNIVERSE__PHYSICAL_SPACES);
		createEReference(universeEClass, UNIVERSE__LOCATION_UNITS);

		spaceEClass = createEClass(SPACE);
		createEAttribute(spaceEClass, SPACE__NAME);
		createEAttribute(spaceEClass, SPACE__ID);
		createEReference(spaceEClass, SPACE__GROUP_BY);
		createEReference(spaceEClass, SPACE__GENERALIZED_BY);

		virtualSpaceEClass = createEClass(VIRTUAL_SPACE);
		createEReference(virtualSpaceEClass, VIRTUAL_SPACE__UNIVERSE);
		createEReference(virtualSpaceEClass, VIRTUAL_SPACE__CONTAINS);
		createEReference(virtualSpaceEClass, VIRTUAL_SPACE__GENERALIZES);

		physicalSpaceEClass = createEClass(PHYSICAL_SPACE);
		createEReference(physicalSpaceEClass, PHYSICAL_SPACE__UNIVERSE);
		createEReference(physicalSpaceEClass, PHYSICAL_SPACE__REPRESENTED_BY);
		createEReference(physicalSpaceEClass, PHYSICAL_SPACE__INNER_SPACES);
		createEReference(physicalSpaceEClass, PHYSICAL_SPACE__CONTAINER);

		locationUnitEClass = createEClass(LOCATION_UNIT);
		createEReference(locationUnitEClass, LOCATION_UNIT__IDENTIFICATIONS);
		createEReference(locationUnitEClass, LOCATION_UNIT__UNIVERSE);
		createEReference(locationUnitEClass, LOCATION_UNIT__REPRESENTS);
		createEAttribute(locationUnitEClass, LOCATION_UNIT__NAME);

		identificationEClass = createEClass(IDENTIFICATION);
		createEReference(identificationEClass, IDENTIFICATION__LOCATION_UNIT);
		createEAttribute(identificationEClass, IDENTIFICATION__TECHNOLOGY);
		createEAttribute(identificationEClass, IDENTIFICATION__CONTENT);

		groupingEClass = createEClass(GROUPING);
		createEReference(groupingEClass, GROUPING__UNIVERSE);
		createEReference(groupingEClass, GROUPING__CHILD);
		createEReference(groupingEClass, GROUPING__PARENT);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__UNIVERSE);
		createEReference(generalizationEClass, GENERALIZATION__PARENT);
		createEReference(generalizationEClass, GENERALIZATION__GENERALIZES);

		contentionEClass = createEClass(CONTENTION);
		createEReference(contentionEClass, CONTENTION__UNIVERSE);
		createEReference(contentionEClass, CONTENTION__PARENT);
		createEReference(contentionEClass, CONTENTION__CHILD);

		representationEClass = createEClass(REPRESENTATION);
		createEReference(representationEClass, REPRESENTATION__UNIVERSE);
		createEReference(representationEClass, REPRESENTATION__REPRESENTS);
		createEReference(representationEClass, REPRESENTATION__REPRESENTED_BY);

		spaceRelationshipEClass = createEClass(SPACE_RELATIONSHIP);
		createEAttribute(spaceRelationshipEClass, SPACE_RELATIONSHIP__ID);
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
		virtualSpaceEClass.getESuperTypes().add(this.getSpace());
		physicalSpaceEClass.getESuperTypes().add(this.getSpace());
		groupingEClass.getESuperTypes().add(this.getSpaceRelationship());
		generalizationEClass.getESuperTypes().add(this.getSpaceRelationship());
		contentionEClass.getESuperTypes().add(this.getSpaceRelationship());
		representationEClass.getESuperTypes().add(this.getSpaceRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(universeEClass, Universe.class, "Universe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniverse_Name(), ecorePackage.getEString(), "name", "spmm-diagram", 1, 1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniverse_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniverse_Groupings(), this.getGrouping(), this.getGrouping_Universe(), "groupings", null, 0, -1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniverse_Generalizations(), this.getGeneralization(), this.getGeneralization_Universe(), "generalizations", null, 0, -1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniverse_Contentions(), this.getContention(), this.getContention_Universe(), "contentions", null, 0, -1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniverse_Representations(), this.getRepresentation(), this.getRepresentation_Universe(), "representations", null, 0, -1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniverse_VirtualSpaces(), this.getVirtualSpace(), this.getVirtualSpace_Universe(), "virtualSpaces", null, 0, -1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniverse_PhysicalSpaces(), this.getPhysicalSpace(), this.getPhysicalSpace_Universe(), "physicalSpaces", null, 0, -1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniverse_LocationUnits(), this.getLocationUnit(), this.getLocationUnit_Universe(), "locationUnits", null, 0, -1, Universe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spaceEClass, Space.class, "Space", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpace_Name(), ecorePackage.getEString(), "name", null, 1, 1, Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpace_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpace_GroupBy(), this.getGrouping(), this.getGrouping_Child(), "groupBy", null, 0, -1, Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpace_GeneralizedBy(), this.getGeneralization(), this.getGeneralization_Generalizes(), "generalizedBy", null, 0, -1, Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualSpaceEClass, VirtualSpace.class, "VirtualSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualSpace_Universe(), this.getUniverse(), this.getUniverse_VirtualSpaces(), "universe", null, 1, 1, VirtualSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualSpace_Contains(), this.getGrouping(), this.getGrouping_Parent(), "contains", null, 0, -1, VirtualSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualSpace_Generalizes(), this.getGeneralization(), this.getGeneralization_Parent(), "generalizes", null, 0, -1, VirtualSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalSpaceEClass, PhysicalSpace.class, "PhysicalSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalSpace_Universe(), this.getUniverse(), this.getUniverse_PhysicalSpaces(), "universe", null, 1, 1, PhysicalSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSpace_RepresentedBy(), this.getRepresentation(), this.getRepresentation_Represents(), "representedBy", null, 0, 1, PhysicalSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSpace_InnerSpaces(), this.getContention(), this.getContention_Parent(), "innerSpaces", null, 0, -1, PhysicalSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSpace_Container(), this.getContention(), this.getContention_Child(), "container", null, 0, 1, PhysicalSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationUnitEClass, LocationUnit.class, "LocationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationUnit_Identifications(), this.getIdentification(), this.getIdentification_LocationUnit(), "identifications", null, 1, -1, LocationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationUnit_Universe(), this.getUniverse(), this.getUniverse_LocationUnits(), "universe", null, 1, 1, LocationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationUnit_Represents(), this.getRepresentation(), this.getRepresentation_RepresentedBy(), "represents", null, 1, 1, LocationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationUnit_Name(), ecorePackage.getEString(), "name", null, 1, 1, LocationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identificationEClass, Identification.class, "Identification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentification_LocationUnit(), this.getLocationUnit(), this.getLocationUnit_Identifications(), "locationUnit", null, 1, 1, Identification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentification_Technology(), ecorePackage.getEString(), "technology", "<technology>", 1, 1, Identification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentification_Content(), ecorePackage.getEString(), "content", "<identification>", 1, 1, Identification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupingEClass, Grouping.class, "Grouping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrouping_Universe(), this.getUniverse(), this.getUniverse_Groupings(), "universe", null, 1, 1, Grouping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrouping_Child(), this.getSpace(), this.getSpace_GroupBy(), "child", null, 1, 1, Grouping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrouping_Parent(), this.getVirtualSpace(), this.getVirtualSpace_Contains(), "parent", null, 1, 1, Grouping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_Universe(), this.getUniverse(), this.getUniverse_Generalizations(), "universe", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_Parent(), this.getVirtualSpace(), this.getVirtualSpace_Generalizes(), "parent", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_Generalizes(), this.getSpace(), this.getSpace_GeneralizedBy(), "generalizes", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentionEClass, Contention.class, "Contention", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContention_Universe(), this.getUniverse(), this.getUniverse_Contentions(), "universe", null, 1, 1, Contention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContention_Parent(), this.getPhysicalSpace(), this.getPhysicalSpace_InnerSpaces(), "parent", null, 1, 1, Contention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContention_Child(), this.getPhysicalSpace(), this.getPhysicalSpace_Container(), "child", null, 1, 1, Contention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationEClass, Representation.class, "Representation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepresentation_Universe(), this.getUniverse(), this.getUniverse_Representations(), "universe", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentation_Represents(), this.getPhysicalSpace(), this.getPhysicalSpace_RepresentedBy(), "represents", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentation_RepresentedBy(), this.getLocationUnit(), this.getLocationUnit_Represents(), "representedBy", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spaceRelationshipEClass, SpaceRelationship.class, "SpaceRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpaceRelationship_Id(), ecorePackage.getEInt(), "id", null, 1, 1, SpaceRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SpmmPackageImpl
