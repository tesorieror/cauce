/**
 */
package spmm;

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
 * @see spmm.SpmmFactory
 * @model kind="package"
 * @generated
 */
public interface SpmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tesoriero.org/cauce/space/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpmmPackage eINSTANCE = spmm.impl.SpmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link spmm.impl.UniverseImpl <em>Universe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spmm.impl.UniverseImpl
	 * @see spmm.impl.SpmmPackageImpl#getUniverse()
	 * @generated
	 */
	int UNIVERSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__ID = 1;

	/**
	 * The feature id for the '<em><b>Groupings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__GROUPINGS = 2;

	/**
	 * The feature id for the '<em><b>Generalizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__GENERALIZATIONS = 3;

	/**
	 * The feature id for the '<em><b>Contentions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__CONTENTIONS = 4;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__REPRESENTATIONS = 5;

	/**
	 * The feature id for the '<em><b>Virtual Spaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__VIRTUAL_SPACES = 6;

	/**
	 * The feature id for the '<em><b>Physical Spaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__PHYSICAL_SPACES = 7;

	/**
	 * The feature id for the '<em><b>Location Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__LOCATION_UNITS = 8;

	/**
	 * The number of structural features of the '<em>Universe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Universe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spmm.impl.SpaceImpl <em>Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spmm.impl.SpaceImpl
	 * @see spmm.impl.SpmmPackageImpl#getSpace()
	 * @generated
	 */
	int SPACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__ID = 1;

	/**
	 * The feature id for the '<em><b>Group By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__GROUP_BY = 2;

	/**
	 * The feature id for the '<em><b>Generalized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__GENERALIZED_BY = 3;

	/**
	 * The number of structural features of the '<em>Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spmm.impl.VirtualSpaceImpl <em>Virtual Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spmm.impl.VirtualSpaceImpl
	 * @see spmm.impl.SpmmPackageImpl#getVirtualSpace()
	 * @generated
	 */
	int VIRTUAL_SPACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPACE__NAME = SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPACE__ID = SPACE__ID;

	/**
	 * The feature id for the '<em><b>Group By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPACE__GROUP_BY = SPACE__GROUP_BY;

	/**
	 * The feature id for the '<em><b>Generalized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPACE__GENERALIZED_BY = SPACE__GENERALIZED_BY;

	/**
	 * The feature id for the '<em><b>Universe</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPACE__UNIVERSE = SPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPACE__CONTAINS = SPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generalizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPACE__GENERALIZES = SPACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Virtual Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPACE_FEATURE_COUNT = SPACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Virtual Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPACE_OPERATION_COUNT = SPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spmm.impl.PhysicalSpaceImpl <em>Physical Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spmm.impl.PhysicalSpaceImpl
	 * @see spmm.impl.SpmmPackageImpl#getPhysicalSpace()
	 * @generated
	 */
	int PHYSICAL_SPACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SPACE__NAME = SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SPACE__ID = SPACE__ID;

	/**
	 * The feature id for the '<em><b>Group By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SPACE__GROUP_BY = SPACE__GROUP_BY;

	/**
	 * The feature id for the '<em><b>Generalized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SPACE__GENERALIZED_BY = SPACE__GENERALIZED_BY;

	/**
	 * The feature id for the '<em><b>Universe</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SPACE__UNIVERSE = SPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Represented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SPACE__REPRESENTED_BY = SPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inner Spaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SPACE__INNER_SPACES = SPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SPACE__CONTAINER = SPACE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Physical Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SPACE_FEATURE_COUNT = SPACE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Physical Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SPACE_OPERATION_COUNT = SPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spmm.impl.LocationUnitImpl <em>Location Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spmm.impl.LocationUnitImpl
	 * @see spmm.impl.SpmmPackageImpl#getLocationUnit()
	 * @generated
	 */
	int LOCATION_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Identifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UNIT__IDENTIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Universe</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UNIT__UNIVERSE = 1;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UNIT__REPRESENTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UNIT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Location Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UNIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Location Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spmm.impl.IdentificationImpl <em>Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spmm.impl.IdentificationImpl
	 * @see spmm.impl.SpmmPackageImpl#getIdentification()
	 * @generated
	 */
	int IDENTIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Location Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION__LOCATION_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION__TECHNOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION__CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spmm.impl.SpaceRelationshipImpl <em>Space Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spmm.impl.SpaceRelationshipImpl
	 * @see spmm.impl.SpmmPackageImpl#getSpaceRelationship()
	 * @generated
	 */
	int SPACE_RELATIONSHIP = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_RELATIONSHIP__ID = 0;

	/**
	 * The number of structural features of the '<em>Space Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_RELATIONSHIP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Space Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spmm.impl.GroupingImpl <em>Grouping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spmm.impl.GroupingImpl
	 * @see spmm.impl.SpmmPackageImpl#getGrouping()
	 * @generated
	 */
	int GROUPING = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__ID = SPACE_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Universe</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__UNIVERSE = SPACE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__CHILD = SPACE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__PARENT = SPACE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Grouping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_FEATURE_COUNT = SPACE_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Grouping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_OPERATION_COUNT = SPACE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spmm.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spmm.impl.GeneralizationImpl
	 * @see spmm.impl.SpmmPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__ID = SPACE_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Universe</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__UNIVERSE = SPACE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__PARENT = SPACE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generalizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERALIZES = SPACE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = SPACE_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = SPACE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spmm.impl.ContentionImpl <em>Contention</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spmm.impl.ContentionImpl
	 * @see spmm.impl.SpmmPackageImpl#getContention()
	 * @generated
	 */
	int CONTENTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION__ID = SPACE_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Universe</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION__UNIVERSE = SPACE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION__PARENT = SPACE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION__CHILD = SPACE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_FEATURE_COUNT = SPACE_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Contention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_OPERATION_COUNT = SPACE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spmm.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spmm.impl.RepresentationImpl
	 * @see spmm.impl.SpmmPackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__ID = SPACE_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Universe</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__UNIVERSE = SPACE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__REPRESENTS = SPACE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Represented By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__REPRESENTED_BY = SPACE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = SPACE_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_OPERATION_COUNT = SPACE_RELATIONSHIP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link spmm.Universe <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universe</em>'.
	 * @see spmm.Universe
	 * @generated
	 */
	EClass getUniverse();

	/**
	 * Returns the meta object for the attribute '{@link spmm.Universe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spmm.Universe#getName()
	 * @see #getUniverse()
	 * @generated
	 */
	EAttribute getUniverse_Name();

	/**
	 * Returns the meta object for the attribute '{@link spmm.Universe#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see spmm.Universe#getId()
	 * @see #getUniverse()
	 * @generated
	 */
	EAttribute getUniverse_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link spmm.Universe#getGroupings <em>Groupings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groupings</em>'.
	 * @see spmm.Universe#getGroupings()
	 * @see #getUniverse()
	 * @generated
	 */
	EReference getUniverse_Groupings();

	/**
	 * Returns the meta object for the containment reference list '{@link spmm.Universe#getGeneralizations <em>Generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalizations</em>'.
	 * @see spmm.Universe#getGeneralizations()
	 * @see #getUniverse()
	 * @generated
	 */
	EReference getUniverse_Generalizations();

	/**
	 * Returns the meta object for the containment reference list '{@link spmm.Universe#getContentions <em>Contentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contentions</em>'.
	 * @see spmm.Universe#getContentions()
	 * @see #getUniverse()
	 * @generated
	 */
	EReference getUniverse_Contentions();

	/**
	 * Returns the meta object for the containment reference list '{@link spmm.Universe#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representations</em>'.
	 * @see spmm.Universe#getRepresentations()
	 * @see #getUniverse()
	 * @generated
	 */
	EReference getUniverse_Representations();

	/**
	 * Returns the meta object for the containment reference list '{@link spmm.Universe#getVirtualSpaces <em>Virtual Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Spaces</em>'.
	 * @see spmm.Universe#getVirtualSpaces()
	 * @see #getUniverse()
	 * @generated
	 */
	EReference getUniverse_VirtualSpaces();

	/**
	 * Returns the meta object for the containment reference list '{@link spmm.Universe#getPhysicalSpaces <em>Physical Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Spaces</em>'.
	 * @see spmm.Universe#getPhysicalSpaces()
	 * @see #getUniverse()
	 * @generated
	 */
	EReference getUniverse_PhysicalSpaces();

	/**
	 * Returns the meta object for the containment reference list '{@link spmm.Universe#getLocationUnits <em>Location Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location Units</em>'.
	 * @see spmm.Universe#getLocationUnits()
	 * @see #getUniverse()
	 * @generated
	 */
	EReference getUniverse_LocationUnits();

	/**
	 * Returns the meta object for class '{@link spmm.Space <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space</em>'.
	 * @see spmm.Space
	 * @generated
	 */
	EClass getSpace();

	/**
	 * Returns the meta object for the attribute '{@link spmm.Space#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spmm.Space#getName()
	 * @see #getSpace()
	 * @generated
	 */
	EAttribute getSpace_Name();

	/**
	 * Returns the meta object for the attribute '{@link spmm.Space#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see spmm.Space#getId()
	 * @see #getSpace()
	 * @generated
	 */
	EAttribute getSpace_Id();

	/**
	 * Returns the meta object for the reference list '{@link spmm.Space#getGroupBy <em>Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group By</em>'.
	 * @see spmm.Space#getGroupBy()
	 * @see #getSpace()
	 * @generated
	 */
	EReference getSpace_GroupBy();

	/**
	 * Returns the meta object for the reference list '{@link spmm.Space#getGeneralizedBy <em>Generalized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generalized By</em>'.
	 * @see spmm.Space#getGeneralizedBy()
	 * @see #getSpace()
	 * @generated
	 */
	EReference getSpace_GeneralizedBy();

	/**
	 * Returns the meta object for class '{@link spmm.VirtualSpace <em>Virtual Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Space</em>'.
	 * @see spmm.VirtualSpace
	 * @generated
	 */
	EClass getVirtualSpace();

	/**
	 * Returns the meta object for the container reference '{@link spmm.VirtualSpace#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Universe</em>'.
	 * @see spmm.VirtualSpace#getUniverse()
	 * @see #getVirtualSpace()
	 * @generated
	 */
	EReference getVirtualSpace_Universe();

	/**
	 * Returns the meta object for the reference list '{@link spmm.VirtualSpace#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see spmm.VirtualSpace#getContains()
	 * @see #getVirtualSpace()
	 * @generated
	 */
	EReference getVirtualSpace_Contains();

	/**
	 * Returns the meta object for the reference list '{@link spmm.VirtualSpace#getGeneralizes <em>Generalizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generalizes</em>'.
	 * @see spmm.VirtualSpace#getGeneralizes()
	 * @see #getVirtualSpace()
	 * @generated
	 */
	EReference getVirtualSpace_Generalizes();

	/**
	 * Returns the meta object for class '{@link spmm.PhysicalSpace <em>Physical Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Space</em>'.
	 * @see spmm.PhysicalSpace
	 * @generated
	 */
	EClass getPhysicalSpace();

	/**
	 * Returns the meta object for the container reference '{@link spmm.PhysicalSpace#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Universe</em>'.
	 * @see spmm.PhysicalSpace#getUniverse()
	 * @see #getPhysicalSpace()
	 * @generated
	 */
	EReference getPhysicalSpace_Universe();

	/**
	 * Returns the meta object for the reference '{@link spmm.PhysicalSpace#getRepresentedBy <em>Represented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represented By</em>'.
	 * @see spmm.PhysicalSpace#getRepresentedBy()
	 * @see #getPhysicalSpace()
	 * @generated
	 */
	EReference getPhysicalSpace_RepresentedBy();

	/**
	 * Returns the meta object for the reference list '{@link spmm.PhysicalSpace#getInnerSpaces <em>Inner Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inner Spaces</em>'.
	 * @see spmm.PhysicalSpace#getInnerSpaces()
	 * @see #getPhysicalSpace()
	 * @generated
	 */
	EReference getPhysicalSpace_InnerSpaces();

	/**
	 * Returns the meta object for the reference '{@link spmm.PhysicalSpace#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see spmm.PhysicalSpace#getContainer()
	 * @see #getPhysicalSpace()
	 * @generated
	 */
	EReference getPhysicalSpace_Container();

	/**
	 * Returns the meta object for class '{@link spmm.LocationUnit <em>Location Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Unit</em>'.
	 * @see spmm.LocationUnit
	 * @generated
	 */
	EClass getLocationUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link spmm.LocationUnit#getIdentifications <em>Identifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifications</em>'.
	 * @see spmm.LocationUnit#getIdentifications()
	 * @see #getLocationUnit()
	 * @generated
	 */
	EReference getLocationUnit_Identifications();

	/**
	 * Returns the meta object for the container reference '{@link spmm.LocationUnit#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Universe</em>'.
	 * @see spmm.LocationUnit#getUniverse()
	 * @see #getLocationUnit()
	 * @generated
	 */
	EReference getLocationUnit_Universe();

	/**
	 * Returns the meta object for the reference '{@link spmm.LocationUnit#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represents</em>'.
	 * @see spmm.LocationUnit#getRepresents()
	 * @see #getLocationUnit()
	 * @generated
	 */
	EReference getLocationUnit_Represents();

	/**
	 * Returns the meta object for the attribute '{@link spmm.LocationUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spmm.LocationUnit#getName()
	 * @see #getLocationUnit()
	 * @generated
	 */
	EAttribute getLocationUnit_Name();

	/**
	 * Returns the meta object for class '{@link spmm.Identification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification</em>'.
	 * @see spmm.Identification
	 * @generated
	 */
	EClass getIdentification();

	/**
	 * Returns the meta object for the container reference '{@link spmm.Identification#getLocationUnit <em>Location Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Location Unit</em>'.
	 * @see spmm.Identification#getLocationUnit()
	 * @see #getIdentification()
	 * @generated
	 */
	EReference getIdentification_LocationUnit();

	/**
	 * Returns the meta object for the attribute '{@link spmm.Identification#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see spmm.Identification#getTechnology()
	 * @see #getIdentification()
	 * @generated
	 */
	EAttribute getIdentification_Technology();

	/**
	 * Returns the meta object for the attribute '{@link spmm.Identification#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see spmm.Identification#getContent()
	 * @see #getIdentification()
	 * @generated
	 */
	EAttribute getIdentification_Content();

	/**
	 * Returns the meta object for class '{@link spmm.Grouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping</em>'.
	 * @see spmm.Grouping
	 * @generated
	 */
	EClass getGrouping();

	/**
	 * Returns the meta object for the container reference '{@link spmm.Grouping#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Universe</em>'.
	 * @see spmm.Grouping#getUniverse()
	 * @see #getGrouping()
	 * @generated
	 */
	EReference getGrouping_Universe();

	/**
	 * Returns the meta object for the reference '{@link spmm.Grouping#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see spmm.Grouping#getChild()
	 * @see #getGrouping()
	 * @generated
	 */
	EReference getGrouping_Child();

	/**
	 * Returns the meta object for the reference '{@link spmm.Grouping#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see spmm.Grouping#getParent()
	 * @see #getGrouping()
	 * @generated
	 */
	EReference getGrouping_Parent();

	/**
	 * Returns the meta object for class '{@link spmm.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see spmm.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the container reference '{@link spmm.Generalization#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Universe</em>'.
	 * @see spmm.Generalization#getUniverse()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Universe();

	/**
	 * Returns the meta object for the reference '{@link spmm.Generalization#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see spmm.Generalization#getParent()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Parent();

	/**
	 * Returns the meta object for the reference '{@link spmm.Generalization#getGeneralizes <em>Generalizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generalizes</em>'.
	 * @see spmm.Generalization#getGeneralizes()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Generalizes();

	/**
	 * Returns the meta object for class '{@link spmm.Contention <em>Contention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contention</em>'.
	 * @see spmm.Contention
	 * @generated
	 */
	EClass getContention();

	/**
	 * Returns the meta object for the container reference '{@link spmm.Contention#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Universe</em>'.
	 * @see spmm.Contention#getUniverse()
	 * @see #getContention()
	 * @generated
	 */
	EReference getContention_Universe();

	/**
	 * Returns the meta object for the reference '{@link spmm.Contention#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see spmm.Contention#getParent()
	 * @see #getContention()
	 * @generated
	 */
	EReference getContention_Parent();

	/**
	 * Returns the meta object for the reference '{@link spmm.Contention#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see spmm.Contention#getChild()
	 * @see #getContention()
	 * @generated
	 */
	EReference getContention_Child();

	/**
	 * Returns the meta object for class '{@link spmm.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see spmm.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for the container reference '{@link spmm.Representation#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Universe</em>'.
	 * @see spmm.Representation#getUniverse()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_Universe();

	/**
	 * Returns the meta object for the reference '{@link spmm.Representation#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represents</em>'.
	 * @see spmm.Representation#getRepresents()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_Represents();

	/**
	 * Returns the meta object for the reference '{@link spmm.Representation#getRepresentedBy <em>Represented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represented By</em>'.
	 * @see spmm.Representation#getRepresentedBy()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_RepresentedBy();

	/**
	 * Returns the meta object for class '{@link spmm.SpaceRelationship <em>Space Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Relationship</em>'.
	 * @see spmm.SpaceRelationship
	 * @generated
	 */
	EClass getSpaceRelationship();

	/**
	 * Returns the meta object for the attribute '{@link spmm.SpaceRelationship#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see spmm.SpaceRelationship#getId()
	 * @see #getSpaceRelationship()
	 * @generated
	 */
	EAttribute getSpaceRelationship_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpmmFactory getSpmmFactory();

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
		 * The meta object literal for the '{@link spmm.impl.UniverseImpl <em>Universe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spmm.impl.UniverseImpl
		 * @see spmm.impl.SpmmPackageImpl#getUniverse()
		 * @generated
		 */
		EClass UNIVERSE = eINSTANCE.getUniverse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSE__NAME = eINSTANCE.getUniverse_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSE__ID = eINSTANCE.getUniverse_Id();

		/**
		 * The meta object literal for the '<em><b>Groupings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSE__GROUPINGS = eINSTANCE.getUniverse_Groupings();

		/**
		 * The meta object literal for the '<em><b>Generalizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSE__GENERALIZATIONS = eINSTANCE.getUniverse_Generalizations();

		/**
		 * The meta object literal for the '<em><b>Contentions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSE__CONTENTIONS = eINSTANCE.getUniverse_Contentions();

		/**
		 * The meta object literal for the '<em><b>Representations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSE__REPRESENTATIONS = eINSTANCE.getUniverse_Representations();

		/**
		 * The meta object literal for the '<em><b>Virtual Spaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSE__VIRTUAL_SPACES = eINSTANCE.getUniverse_VirtualSpaces();

		/**
		 * The meta object literal for the '<em><b>Physical Spaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSE__PHYSICAL_SPACES = eINSTANCE.getUniverse_PhysicalSpaces();

		/**
		 * The meta object literal for the '<em><b>Location Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSE__LOCATION_UNITS = eINSTANCE.getUniverse_LocationUnits();

		/**
		 * The meta object literal for the '{@link spmm.impl.SpaceImpl <em>Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spmm.impl.SpaceImpl
		 * @see spmm.impl.SpmmPackageImpl#getSpace()
		 * @generated
		 */
		EClass SPACE = eINSTANCE.getSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE__NAME = eINSTANCE.getSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE__ID = eINSTANCE.getSpace_Id();

		/**
		 * The meta object literal for the '<em><b>Group By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE__GROUP_BY = eINSTANCE.getSpace_GroupBy();

		/**
		 * The meta object literal for the '<em><b>Generalized By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE__GENERALIZED_BY = eINSTANCE.getSpace_GeneralizedBy();

		/**
		 * The meta object literal for the '{@link spmm.impl.VirtualSpaceImpl <em>Virtual Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spmm.impl.VirtualSpaceImpl
		 * @see spmm.impl.SpmmPackageImpl#getVirtualSpace()
		 * @generated
		 */
		EClass VIRTUAL_SPACE = eINSTANCE.getVirtualSpace();

		/**
		 * The meta object literal for the '<em><b>Universe</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_SPACE__UNIVERSE = eINSTANCE.getVirtualSpace_Universe();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_SPACE__CONTAINS = eINSTANCE.getVirtualSpace_Contains();

		/**
		 * The meta object literal for the '<em><b>Generalizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_SPACE__GENERALIZES = eINSTANCE.getVirtualSpace_Generalizes();

		/**
		 * The meta object literal for the '{@link spmm.impl.PhysicalSpaceImpl <em>Physical Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spmm.impl.PhysicalSpaceImpl
		 * @see spmm.impl.SpmmPackageImpl#getPhysicalSpace()
		 * @generated
		 */
		EClass PHYSICAL_SPACE = eINSTANCE.getPhysicalSpace();

		/**
		 * The meta object literal for the '<em><b>Universe</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_SPACE__UNIVERSE = eINSTANCE.getPhysicalSpace_Universe();

		/**
		 * The meta object literal for the '<em><b>Represented By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_SPACE__REPRESENTED_BY = eINSTANCE.getPhysicalSpace_RepresentedBy();

		/**
		 * The meta object literal for the '<em><b>Inner Spaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_SPACE__INNER_SPACES = eINSTANCE.getPhysicalSpace_InnerSpaces();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_SPACE__CONTAINER = eINSTANCE.getPhysicalSpace_Container();

		/**
		 * The meta object literal for the '{@link spmm.impl.LocationUnitImpl <em>Location Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spmm.impl.LocationUnitImpl
		 * @see spmm.impl.SpmmPackageImpl#getLocationUnit()
		 * @generated
		 */
		EClass LOCATION_UNIT = eINSTANCE.getLocationUnit();

		/**
		 * The meta object literal for the '<em><b>Identifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_UNIT__IDENTIFICATIONS = eINSTANCE.getLocationUnit_Identifications();

		/**
		 * The meta object literal for the '<em><b>Universe</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_UNIT__UNIVERSE = eINSTANCE.getLocationUnit_Universe();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_UNIT__REPRESENTS = eINSTANCE.getLocationUnit_Represents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_UNIT__NAME = eINSTANCE.getLocationUnit_Name();

		/**
		 * The meta object literal for the '{@link spmm.impl.IdentificationImpl <em>Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spmm.impl.IdentificationImpl
		 * @see spmm.impl.SpmmPackageImpl#getIdentification()
		 * @generated
		 */
		EClass IDENTIFICATION = eINSTANCE.getIdentification();

		/**
		 * The meta object literal for the '<em><b>Location Unit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION__LOCATION_UNIT = eINSTANCE.getIdentification_LocationUnit();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION__TECHNOLOGY = eINSTANCE.getIdentification_Technology();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION__CONTENT = eINSTANCE.getIdentification_Content();

		/**
		 * The meta object literal for the '{@link spmm.impl.GroupingImpl <em>Grouping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spmm.impl.GroupingImpl
		 * @see spmm.impl.SpmmPackageImpl#getGrouping()
		 * @generated
		 */
		EClass GROUPING = eINSTANCE.getGrouping();

		/**
		 * The meta object literal for the '<em><b>Universe</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPING__UNIVERSE = eINSTANCE.getGrouping_Universe();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPING__CHILD = eINSTANCE.getGrouping_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPING__PARENT = eINSTANCE.getGrouping_Parent();

		/**
		 * The meta object literal for the '{@link spmm.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spmm.impl.GeneralizationImpl
		 * @see spmm.impl.SpmmPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Universe</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__UNIVERSE = eINSTANCE.getGeneralization_Universe();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__PARENT = eINSTANCE.getGeneralization_Parent();

		/**
		 * The meta object literal for the '<em><b>Generalizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERALIZES = eINSTANCE.getGeneralization_Generalizes();

		/**
		 * The meta object literal for the '{@link spmm.impl.ContentionImpl <em>Contention</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spmm.impl.ContentionImpl
		 * @see spmm.impl.SpmmPackageImpl#getContention()
		 * @generated
		 */
		EClass CONTENTION = eINSTANCE.getContention();

		/**
		 * The meta object literal for the '<em><b>Universe</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTION__UNIVERSE = eINSTANCE.getContention_Universe();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTION__PARENT = eINSTANCE.getContention_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTION__CHILD = eINSTANCE.getContention_Child();

		/**
		 * The meta object literal for the '{@link spmm.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spmm.impl.RepresentationImpl
		 * @see spmm.impl.SpmmPackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '<em><b>Universe</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__UNIVERSE = eINSTANCE.getRepresentation_Universe();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__REPRESENTS = eINSTANCE.getRepresentation_Represents();

		/**
		 * The meta object literal for the '<em><b>Represented By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__REPRESENTED_BY = eINSTANCE.getRepresentation_RepresentedBy();

		/**
		 * The meta object literal for the '{@link spmm.impl.SpaceRelationshipImpl <em>Space Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spmm.impl.SpaceRelationshipImpl
		 * @see spmm.impl.SpmmPackageImpl#getSpaceRelationship()
		 * @generated
		 */
		EClass SPACE_RELATIONSHIP = eINSTANCE.getSpaceRelationship();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE_RELATIONSHIP__ID = eINSTANCE.getSpaceRelationship_Id();

	}

} //SpmmPackage
