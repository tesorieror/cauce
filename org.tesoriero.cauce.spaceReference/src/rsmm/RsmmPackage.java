/**
 */
package rsmm;

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
 * @see rsmm.RsmmFactory
 * @model kind="package"
 * @generated
 */
public interface RsmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rsmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tesoriero.org/cauce/spaceReference/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rsmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RsmmPackage eINSTANCE = rsmm.impl.RsmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link rsmm.impl.SystemInformationFlowReferenceSpaceImpl <em>System Information Flow Reference Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rsmm.impl.SystemInformationFlowReferenceSpaceImpl
	 * @see rsmm.impl.RsmmPackageImpl#getSystemInformationFlowReferenceSpace()
	 * @generated
	 */
	int SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Referential Spaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES = 0;

	/**
	 * The feature id for the '<em><b>Space To Space Reference Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES = 1;

	/**
	 * The feature id for the '<em><b>Space To Entity Reference Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Entity References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ID = 5;

	/**
	 * The number of structural features of the '<em>System Information Flow Reference Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>System Information Flow Reference Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rsmm.impl.ReferentialSpaceImpl <em>Referential Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rsmm.impl.ReferentialSpaceImpl
	 * @see rsmm.impl.RsmmPackageImpl#getReferentialSpace()
	 * @generated
	 */
	int REFERENTIAL_SPACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_SPACE__SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Ongoing Reference Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_SPACE__ONGOING_REFERENCE_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Incoming Reference Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_SPACE__ID = 4;

	/**
	 * The number of structural features of the '<em>Referential Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_SPACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Referential Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIAL_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rsmm.impl.ContextAwareEntityReferenceImpl <em>Context Aware Entity Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rsmm.impl.ContextAwareEntityReferenceImpl
	 * @see rsmm.impl.RsmmPackageImpl#getContextAwareEntityReference()
	 * @generated
	 */
	int CONTEXT_AWARE_ENTITY_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY_REFERENCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Incoming Reference Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY_REFERENCE__ID = 3;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY_REFERENCE__ENTITY = 4;

	/**
	 * The number of structural features of the '<em>Context Aware Entity Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY_REFERENCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Context Aware Entity Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_ENTITY_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rsmm.impl.ReferenceDependencyImpl <em>Reference Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rsmm.impl.ReferenceDependencyImpl
	 * @see rsmm.impl.RsmmPackageImpl#getReferenceDependency()
	 * @generated
	 */
	int REFERENCE_DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DEPENDENCY__CARDINALITY = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DEPENDENCY__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DEPENDENCY__ID = 2;

	/**
	 * The number of structural features of the '<em>Reference Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DEPENDENCY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reference Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rsmm.impl.SpaceToEntityReferenceDependencyImpl <em>Space To Entity Reference Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rsmm.impl.SpaceToEntityReferenceDependencyImpl
	 * @see rsmm.impl.RsmmPackageImpl#getSpaceToEntityReferenceDependency()
	 * @generated
	 */
	int SPACE_TO_ENTITY_REFERENCE_DEPENDENCY = 3;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__CARDINALITY = REFERENCE_DEPENDENCY__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__PARENT = REFERENCE_DEPENDENCY__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__ID = REFERENCE_DEPENDENCY__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__SYSTEM = REFERENCE_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__CHILD = REFERENCE_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Space To Entity Reference Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_ENTITY_REFERENCE_DEPENDENCY_FEATURE_COUNT = REFERENCE_DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Space To Entity Reference Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_ENTITY_REFERENCE_DEPENDENCY_OPERATION_COUNT = REFERENCE_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rsmm.impl.SpaceToSpaceReferenceDependencyImpl <em>Space To Space Reference Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rsmm.impl.SpaceToSpaceReferenceDependencyImpl
	 * @see rsmm.impl.RsmmPackageImpl#getSpaceToSpaceReferenceDependency()
	 * @generated
	 */
	int SPACE_TO_SPACE_REFERENCE_DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CARDINALITY = REFERENCE_DEPENDENCY__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_SPACE_REFERENCE_DEPENDENCY__PARENT = REFERENCE_DEPENDENCY__PARENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_SPACE_REFERENCE_DEPENDENCY__ID = REFERENCE_DEPENDENCY__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM = REFERENCE_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD = REFERENCE_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Space To Space Reference Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_SPACE_REFERENCE_DEPENDENCY_FEATURE_COUNT = REFERENCE_DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Space To Space Reference Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TO_SPACE_REFERENCE_DEPENDENCY_OPERATION_COUNT = REFERENCE_DEPENDENCY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link rsmm.SystemInformationFlowReferenceSpace <em>System Information Flow Reference Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Information Flow Reference Space</em>'.
	 * @see rsmm.SystemInformationFlowReferenceSpace
	 * @generated
	 */
	EClass getSystemInformationFlowReferenceSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link rsmm.SystemInformationFlowReferenceSpace#getReferentialSpaces <em>Referential Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referential Spaces</em>'.
	 * @see rsmm.SystemInformationFlowReferenceSpace#getReferentialSpaces()
	 * @see #getSystemInformationFlowReferenceSpace()
	 * @generated
	 */
	EReference getSystemInformationFlowReferenceSpace_ReferentialSpaces();

	/**
	 * Returns the meta object for the containment reference list '{@link rsmm.SystemInformationFlowReferenceSpace#getSpaceToSpaceReferenceDependencies <em>Space To Space Reference Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Space To Space Reference Dependencies</em>'.
	 * @see rsmm.SystemInformationFlowReferenceSpace#getSpaceToSpaceReferenceDependencies()
	 * @see #getSystemInformationFlowReferenceSpace()
	 * @generated
	 */
	EReference getSystemInformationFlowReferenceSpace_SpaceToSpaceReferenceDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link rsmm.SystemInformationFlowReferenceSpace#getSpaceToEntityReferenceDependencies <em>Space To Entity Reference Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Space To Entity Reference Dependencies</em>'.
	 * @see rsmm.SystemInformationFlowReferenceSpace#getSpaceToEntityReferenceDependencies()
	 * @see #getSystemInformationFlowReferenceSpace()
	 * @generated
	 */
	EReference getSystemInformationFlowReferenceSpace_SpaceToEntityReferenceDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link rsmm.SystemInformationFlowReferenceSpace#getEntityReferences <em>Entity References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity References</em>'.
	 * @see rsmm.SystemInformationFlowReferenceSpace#getEntityReferences()
	 * @see #getSystemInformationFlowReferenceSpace()
	 * @generated
	 */
	EReference getSystemInformationFlowReferenceSpace_EntityReferences();

	/**
	 * Returns the meta object for the attribute '{@link rsmm.SystemInformationFlowReferenceSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rsmm.SystemInformationFlowReferenceSpace#getName()
	 * @see #getSystemInformationFlowReferenceSpace()
	 * @generated
	 */
	EAttribute getSystemInformationFlowReferenceSpace_Name();

	/**
	 * Returns the meta object for the attribute '{@link rsmm.SystemInformationFlowReferenceSpace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rsmm.SystemInformationFlowReferenceSpace#getId()
	 * @see #getSystemInformationFlowReferenceSpace()
	 * @generated
	 */
	EAttribute getSystemInformationFlowReferenceSpace_Id();

	/**
	 * Returns the meta object for class '{@link rsmm.ReferentialSpace <em>Referential Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referential Space</em>'.
	 * @see rsmm.ReferentialSpace
	 * @generated
	 */
	EClass getReferentialSpace();

	/**
	 * Returns the meta object for the attribute '{@link rsmm.ReferentialSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rsmm.ReferentialSpace#getName()
	 * @see #getReferentialSpace()
	 * @generated
	 */
	EAttribute getReferentialSpace_Name();

	/**
	 * Returns the meta object for the container reference '{@link rsmm.ReferentialSpace#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see rsmm.ReferentialSpace#getSystem()
	 * @see #getReferentialSpace()
	 * @generated
	 */
	EReference getReferentialSpace_System();

	/**
	 * Returns the meta object for the reference list '{@link rsmm.ReferentialSpace#getOngoingReferenceDependencies <em>Ongoing Reference Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ongoing Reference Dependencies</em>'.
	 * @see rsmm.ReferentialSpace#getOngoingReferenceDependencies()
	 * @see #getReferentialSpace()
	 * @generated
	 */
	EReference getReferentialSpace_OngoingReferenceDependencies();

	/**
	 * Returns the meta object for the reference '{@link rsmm.ReferentialSpace#getIncomingReferenceDependency <em>Incoming Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming Reference Dependency</em>'.
	 * @see rsmm.ReferentialSpace#getIncomingReferenceDependency()
	 * @see #getReferentialSpace()
	 * @generated
	 */
	EReference getReferentialSpace_IncomingReferenceDependency();

	/**
	 * Returns the meta object for the attribute '{@link rsmm.ReferentialSpace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rsmm.ReferentialSpace#getId()
	 * @see #getReferentialSpace()
	 * @generated
	 */
	EAttribute getReferentialSpace_Id();

	/**
	 * Returns the meta object for class '{@link rsmm.ContextAwareEntityReference <em>Context Aware Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Aware Entity Reference</em>'.
	 * @see rsmm.ContextAwareEntityReference
	 * @generated
	 */
	EClass getContextAwareEntityReference();

	/**
	 * Returns the meta object for the container reference '{@link rsmm.ContextAwareEntityReference#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see rsmm.ContextAwareEntityReference#getSystem()
	 * @see #getContextAwareEntityReference()
	 * @generated
	 */
	EReference getContextAwareEntityReference_System();

	/**
	 * Returns the meta object for the attribute '{@link rsmm.ContextAwareEntityReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rsmm.ContextAwareEntityReference#getName()
	 * @see #getContextAwareEntityReference()
	 * @generated
	 */
	EAttribute getContextAwareEntityReference_Name();

	/**
	 * Returns the meta object for the reference '{@link rsmm.ContextAwareEntityReference#getIncomingReferenceDependency <em>Incoming Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming Reference Dependency</em>'.
	 * @see rsmm.ContextAwareEntityReference#getIncomingReferenceDependency()
	 * @see #getContextAwareEntityReference()
	 * @generated
	 */
	EReference getContextAwareEntityReference_IncomingReferenceDependency();

	/**
	 * Returns the meta object for the attribute '{@link rsmm.ContextAwareEntityReference#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rsmm.ContextAwareEntityReference#getId()
	 * @see #getContextAwareEntityReference()
	 * @generated
	 */
	EAttribute getContextAwareEntityReference_Id();

	/**
	 * Returns the meta object for the attribute '{@link rsmm.ContextAwareEntityReference#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity</em>'.
	 * @see rsmm.ContextAwareEntityReference#getEntity()
	 * @see #getContextAwareEntityReference()
	 * @generated
	 */
	EAttribute getContextAwareEntityReference_Entity();

	/**
	 * Returns the meta object for class '{@link rsmm.SpaceToEntityReferenceDependency <em>Space To Entity Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space To Entity Reference Dependency</em>'.
	 * @see rsmm.SpaceToEntityReferenceDependency
	 * @generated
	 */
	EClass getSpaceToEntityReferenceDependency();

	/**
	 * Returns the meta object for the container reference '{@link rsmm.SpaceToEntityReferenceDependency#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see rsmm.SpaceToEntityReferenceDependency#getSystem()
	 * @see #getSpaceToEntityReferenceDependency()
	 * @generated
	 */
	EReference getSpaceToEntityReferenceDependency_System();

	/**
	 * Returns the meta object for the reference '{@link rsmm.SpaceToEntityReferenceDependency#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see rsmm.SpaceToEntityReferenceDependency#getChild()
	 * @see #getSpaceToEntityReferenceDependency()
	 * @generated
	 */
	EReference getSpaceToEntityReferenceDependency_Child();

	/**
	 * Returns the meta object for class '{@link rsmm.SpaceToSpaceReferenceDependency <em>Space To Space Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space To Space Reference Dependency</em>'.
	 * @see rsmm.SpaceToSpaceReferenceDependency
	 * @generated
	 */
	EClass getSpaceToSpaceReferenceDependency();

	/**
	 * Returns the meta object for the container reference '{@link rsmm.SpaceToSpaceReferenceDependency#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see rsmm.SpaceToSpaceReferenceDependency#getSystem()
	 * @see #getSpaceToSpaceReferenceDependency()
	 * @generated
	 */
	EReference getSpaceToSpaceReferenceDependency_System();

	/**
	 * Returns the meta object for the reference '{@link rsmm.SpaceToSpaceReferenceDependency#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see rsmm.SpaceToSpaceReferenceDependency#getChild()
	 * @see #getSpaceToSpaceReferenceDependency()
	 * @generated
	 */
	EReference getSpaceToSpaceReferenceDependency_Child();

	/**
	 * Returns the meta object for class '{@link rsmm.ReferenceDependency <em>Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Dependency</em>'.
	 * @see rsmm.ReferenceDependency
	 * @generated
	 */
	EClass getReferenceDependency();

	/**
	 * Returns the meta object for the attribute '{@link rsmm.ReferenceDependency#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see rsmm.ReferenceDependency#getCardinality()
	 * @see #getReferenceDependency()
	 * @generated
	 */
	EAttribute getReferenceDependency_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link rsmm.ReferenceDependency#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see rsmm.ReferenceDependency#getParent()
	 * @see #getReferenceDependency()
	 * @generated
	 */
	EReference getReferenceDependency_Parent();

	/**
	 * Returns the meta object for the attribute '{@link rsmm.ReferenceDependency#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rsmm.ReferenceDependency#getId()
	 * @see #getReferenceDependency()
	 * @generated
	 */
	EAttribute getReferenceDependency_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RsmmFactory getRsmmFactory();

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
		 * The meta object literal for the '{@link rsmm.impl.SystemInformationFlowReferenceSpaceImpl <em>System Information Flow Reference Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rsmm.impl.SystemInformationFlowReferenceSpaceImpl
		 * @see rsmm.impl.RsmmPackageImpl#getSystemInformationFlowReferenceSpace()
		 * @generated
		 */
		EClass SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE = eINSTANCE.getSystemInformationFlowReferenceSpace();

		/**
		 * The meta object literal for the '<em><b>Referential Spaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES = eINSTANCE.getSystemInformationFlowReferenceSpace_ReferentialSpaces();

		/**
		 * The meta object literal for the '<em><b>Space To Space Reference Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES = eINSTANCE.getSystemInformationFlowReferenceSpace_SpaceToSpaceReferenceDependencies();

		/**
		 * The meta object literal for the '<em><b>Space To Entity Reference Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES = eINSTANCE.getSystemInformationFlowReferenceSpace_SpaceToEntityReferenceDependencies();

		/**
		 * The meta object literal for the '<em><b>Entity References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES = eINSTANCE.getSystemInformationFlowReferenceSpace_EntityReferences();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__NAME = eINSTANCE.getSystemInformationFlowReferenceSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ID = eINSTANCE.getSystemInformationFlowReferenceSpace_Id();

		/**
		 * The meta object literal for the '{@link rsmm.impl.ReferentialSpaceImpl <em>Referential Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rsmm.impl.ReferentialSpaceImpl
		 * @see rsmm.impl.RsmmPackageImpl#getReferentialSpace()
		 * @generated
		 */
		EClass REFERENTIAL_SPACE = eINSTANCE.getReferentialSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENTIAL_SPACE__NAME = eINSTANCE.getReferentialSpace_Name();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENTIAL_SPACE__SYSTEM = eINSTANCE.getReferentialSpace_System();

		/**
		 * The meta object literal for the '<em><b>Ongoing Reference Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENTIAL_SPACE__ONGOING_REFERENCE_DEPENDENCIES = eINSTANCE.getReferentialSpace_OngoingReferenceDependencies();

		/**
		 * The meta object literal for the '<em><b>Incoming Reference Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY = eINSTANCE.getReferentialSpace_IncomingReferenceDependency();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENTIAL_SPACE__ID = eINSTANCE.getReferentialSpace_Id();

		/**
		 * The meta object literal for the '{@link rsmm.impl.ContextAwareEntityReferenceImpl <em>Context Aware Entity Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rsmm.impl.ContextAwareEntityReferenceImpl
		 * @see rsmm.impl.RsmmPackageImpl#getContextAwareEntityReference()
		 * @generated
		 */
		EClass CONTEXT_AWARE_ENTITY_REFERENCE = eINSTANCE.getContextAwareEntityReference();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM = eINSTANCE.getContextAwareEntityReference_System();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_AWARE_ENTITY_REFERENCE__NAME = eINSTANCE.getContextAwareEntityReference_Name();

		/**
		 * The meta object literal for the '<em><b>Incoming Reference Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY = eINSTANCE.getContextAwareEntityReference_IncomingReferenceDependency();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_AWARE_ENTITY_REFERENCE__ID = eINSTANCE.getContextAwareEntityReference_Id();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_AWARE_ENTITY_REFERENCE__ENTITY = eINSTANCE.getContextAwareEntityReference_Entity();

		/**
		 * The meta object literal for the '{@link rsmm.impl.SpaceToEntityReferenceDependencyImpl <em>Space To Entity Reference Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rsmm.impl.SpaceToEntityReferenceDependencyImpl
		 * @see rsmm.impl.RsmmPackageImpl#getSpaceToEntityReferenceDependency()
		 * @generated
		 */
		EClass SPACE_TO_ENTITY_REFERENCE_DEPENDENCY = eINSTANCE.getSpaceToEntityReferenceDependency();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__SYSTEM = eINSTANCE.getSpaceToEntityReferenceDependency_System();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__CHILD = eINSTANCE.getSpaceToEntityReferenceDependency_Child();

		/**
		 * The meta object literal for the '{@link rsmm.impl.SpaceToSpaceReferenceDependencyImpl <em>Space To Space Reference Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rsmm.impl.SpaceToSpaceReferenceDependencyImpl
		 * @see rsmm.impl.RsmmPackageImpl#getSpaceToSpaceReferenceDependency()
		 * @generated
		 */
		EClass SPACE_TO_SPACE_REFERENCE_DEPENDENCY = eINSTANCE.getSpaceToSpaceReferenceDependency();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM = eINSTANCE.getSpaceToSpaceReferenceDependency_System();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD = eINSTANCE.getSpaceToSpaceReferenceDependency_Child();

		/**
		 * The meta object literal for the '{@link rsmm.impl.ReferenceDependencyImpl <em>Reference Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rsmm.impl.ReferenceDependencyImpl
		 * @see rsmm.impl.RsmmPackageImpl#getReferenceDependency()
		 * @generated
		 */
		EClass REFERENCE_DEPENDENCY = eINSTANCE.getReferenceDependency();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DEPENDENCY__CARDINALITY = eINSTANCE.getReferenceDependency_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DEPENDENCY__PARENT = eINSTANCE.getReferenceDependency_Parent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DEPENDENCY__ID = eINSTANCE.getReferenceDependency_Id();

	}

} //RsmmPackage
