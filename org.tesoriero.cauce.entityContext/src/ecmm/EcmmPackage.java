/**
 */
package ecmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ecmm.EcmmFactory
 * @model kind="package"
 * @generated
 */
public interface EcmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tesoriero.org/cauce/entityContext/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcmmPackage eINSTANCE = ecmm.impl.EcmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecmm.impl.VariableDataDefinitionImpl <em>Variable Data Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.VariableDataDefinitionImpl
	 * @see ecmm.impl.EcmmPackageImpl#getVariableDataDefinition()
	 * @generated
	 */
	int VARIABLE_DATA_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_DEFINITION__DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_DEFINITION__ID = 2;

	/**
	 * The feature id for the '<em><b>Entity Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT = 3;

	/**
	 * The number of structural features of the '<em>Variable Data Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Variable Data Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DATA_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecmm.impl.EntityContextImpl <em>Entity Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.EntityContextImpl
	 * @see ecmm.impl.EcmmPackageImpl#getEntityContext()
	 * @generated
	 */
	int ENTITY_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Situations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTEXT__SITUATIONS = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTEXT__STATE = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTEXT__SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTEXT__VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTEXT__ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTEXT__ID = 5;

	/**
	 * The number of structural features of the '<em>Entity Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTEXT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTEXT___INCOMING = 0;

	/**
	 * The operation id for the '<em>Ongoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTEXT___ONGOING = 1;

	/**
	 * The number of operations of the '<em>Entity Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONTEXT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ecmm.impl.ContextSituationImpl <em>Context Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.ContextSituationImpl
	 * @see ecmm.impl.EcmmPackageImpl#getContextSituation()
	 * @generated
	 */
	int CONTEXT_SITUATION = 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SITUATION__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Memory Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SITUATION__MEMORY_CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Sensing Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SITUATION__SENSING_CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Entity Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SITUATION__ENTITY_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SITUATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SITUATION__ID = 5;

	/**
	 * The number of structural features of the '<em>Context Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SITUATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SITUATION___MATCHES = 0;

	/**
	 * The number of operations of the '<em>Context Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SITUATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecmm.impl.ContextConditionImpl <em>Context Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.ContextConditionImpl
	 * @see ecmm.impl.EcmmPackageImpl#getContextCondition()
	 * @generated
	 */
	int CONTEXT_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONDITION__ID = 0;

	/**
	 * The number of structural features of the '<em>Context Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Satisfies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONDITION___SATISFIES = 0;

	/**
	 * The number of operations of the '<em>Context Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONDITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecmm.impl.ContextMemoryImpl <em>Context Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.ContextMemoryImpl
	 * @see ecmm.impl.EcmmPackageImpl#getContextMemory()
	 * @generated
	 */
	int CONTEXT_MEMORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MEMORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entity Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MEMORY__ENTITY_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MEMORY__ID = 2;

	/**
	 * The number of structural features of the '<em>Context Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MEMORY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MEMORY___MATCH = 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MEMORY___UPDATE = 1;

	/**
	 * The number of operations of the '<em>Context Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MEMORY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ecmm.impl.LogicMemoryImpl <em>Logic Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.LogicMemoryImpl
	 * @see ecmm.impl.EcmmPackageImpl#getLogicMemory()
	 * @generated
	 */
	int LOGIC_MEMORY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_MEMORY__NAME = CONTEXT_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Entity Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_MEMORY__ENTITY_CONTEXT = CONTEXT_MEMORY__ENTITY_CONTEXT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_MEMORY__ID = CONTEXT_MEMORY__ID;

	/**
	 * The number of structural features of the '<em>Logic Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_MEMORY_FEATURE_COUNT = CONTEXT_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_MEMORY___MATCH = CONTEXT_MEMORY___MATCH;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_MEMORY___UPDATE = CONTEXT_MEMORY___UPDATE;

	/**
	 * The number of operations of the '<em>Logic Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_MEMORY_OPERATION_COUNT = CONTEXT_MEMORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecmm.impl.DictionaryMemoryImpl <em>Dictionary Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.DictionaryMemoryImpl
	 * @see ecmm.impl.EcmmPackageImpl#getDictionaryMemory()
	 * @generated
	 */
	int DICTIONARY_MEMORY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_MEMORY__NAME = CONTEXT_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Entity Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_MEMORY__ENTITY_CONTEXT = CONTEXT_MEMORY__ENTITY_CONTEXT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_MEMORY__ID = CONTEXT_MEMORY__ID;

	/**
	 * The number of structural features of the '<em>Dictionary Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_MEMORY_FEATURE_COUNT = CONTEXT_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_MEMORY___MATCH = CONTEXT_MEMORY___MATCH;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_MEMORY___UPDATE = CONTEXT_MEMORY___UPDATE;

	/**
	 * The number of operations of the '<em>Dictionary Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_MEMORY_OPERATION_COUNT = CONTEXT_MEMORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecmm.impl.HolderMemoryImpl <em>Holder Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.HolderMemoryImpl
	 * @see ecmm.impl.EcmmPackageImpl#getHolderMemory()
	 * @generated
	 */
	int HOLDER_MEMORY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLDER_MEMORY__NAME = CONTEXT_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Entity Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLDER_MEMORY__ENTITY_CONTEXT = CONTEXT_MEMORY__ENTITY_CONTEXT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLDER_MEMORY__ID = CONTEXT_MEMORY__ID;

	/**
	 * The number of structural features of the '<em>Holder Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLDER_MEMORY_FEATURE_COUNT = CONTEXT_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLDER_MEMORY___MATCH = CONTEXT_MEMORY___MATCH;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLDER_MEMORY___UPDATE = CONTEXT_MEMORY___UPDATE;

	/**
	 * The number of operations of the '<em>Holder Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLDER_MEMORY_OPERATION_COUNT = CONTEXT_MEMORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecmm.impl.StackMemoryImpl <em>Stack Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.StackMemoryImpl
	 * @see ecmm.impl.EcmmPackageImpl#getStackMemory()
	 * @generated
	 */
	int STACK_MEMORY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MEMORY__NAME = CONTEXT_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Entity Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MEMORY__ENTITY_CONTEXT = CONTEXT_MEMORY__ENTITY_CONTEXT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MEMORY__ID = CONTEXT_MEMORY__ID;

	/**
	 * The number of structural features of the '<em>Stack Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MEMORY_FEATURE_COUNT = CONTEXT_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MEMORY___MATCH = CONTEXT_MEMORY___MATCH;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MEMORY___UPDATE = CONTEXT_MEMORY___UPDATE;

	/**
	 * The number of operations of the '<em>Stack Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MEMORY_OPERATION_COUNT = CONTEXT_MEMORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecmm.impl.TimeMemoryImpl <em>Time Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.TimeMemoryImpl
	 * @see ecmm.impl.EcmmPackageImpl#getTimeMemory()
	 * @generated
	 */
	int TIME_MEMORY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MEMORY__NAME = CONTEXT_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Entity Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MEMORY__ENTITY_CONTEXT = CONTEXT_MEMORY__ENTITY_CONTEXT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MEMORY__ID = CONTEXT_MEMORY__ID;

	/**
	 * The number of structural features of the '<em>Time Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MEMORY_FEATURE_COUNT = CONTEXT_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MEMORY___MATCH = CONTEXT_MEMORY___MATCH;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MEMORY___UPDATE = CONTEXT_MEMORY___UPDATE;

	/**
	 * The number of operations of the '<em>Time Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MEMORY_OPERATION_COUNT = CONTEXT_MEMORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecmm.impl.ContextActionImpl <em>Context Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.ContextActionImpl
	 * @see ecmm.impl.EcmmPackageImpl#getContextAction()
	 * @generated
	 */
	int CONTEXT_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTION__MEMORY = 0;

	/**
	 * The feature id for the '<em><b>Situation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTION__SITUATION = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTION__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTION__ID = 3;

	/**
	 * The feature id for the '<em><b>Memory Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTION__MEMORY_NAME = 4;

	/**
	 * The number of structural features of the '<em>Context Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTION___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Context Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ACTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecmm.impl.SensingContextConditionImpl <em>Sensing Context Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.SensingContextConditionImpl
	 * @see ecmm.impl.EcmmPackageImpl#getSensingContextCondition()
	 * @generated
	 */
	int SENSING_CONTEXT_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_CONTEXT_CONDITION__ID = CONTEXT_CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Situation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_CONTEXT_CONDITION__SITUATION = CONTEXT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Informationflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_CONTEXT_CONDITION__INFORMATIONFLOW = CONTEXT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensing Context Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_CONTEXT_CONDITION_FEATURE_COUNT = CONTEXT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Satisfies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_CONTEXT_CONDITION___SATISFIES = CONTEXT_CONDITION___SATISFIES;

	/**
	 * The number of operations of the '<em>Sensing Context Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_CONTEXT_CONDITION_OPERATION_COUNT = CONTEXT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecmm.impl.MemoryContextConditionImpl <em>Memory Context Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.MemoryContextConditionImpl
	 * @see ecmm.impl.EcmmPackageImpl#getMemoryContextCondition()
	 * @generated
	 */
	int MEMORY_CONTEXT_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTEXT_CONDITION__ID = CONTEXT_CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Situation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTEXT_CONDITION__SITUATION = CONTEXT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTEXT_CONDITION__EXPRESSION = CONTEXT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTEXT_CONDITION__CONTEXT_MEMORY = CONTEXT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memory Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTEXT_CONDITION__MEMORY_NAME = CONTEXT_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Memory Context Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTEXT_CONDITION_FEATURE_COUNT = CONTEXT_CONDITION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Satisfies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTEXT_CONDITION___SATISFIES = CONTEXT_CONDITION___SATISFIES;

	/**
	 * The number of operations of the '<em>Memory Context Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONTEXT_CONDITION_OPERATION_COUNT = CONTEXT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecmm.impl.SystemContextImpl <em>System Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecmm.impl.SystemContextImpl
	 * @see ecmm.impl.EcmmPackageImpl#getSystemContext()
	 * @generated
	 */
	int SYSTEM_CONTEXT = 13;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__NAME = 1;

	/**
	 * The number of structural features of the '<em>System Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ecmm.VariableDataDefinition <em>Variable Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Data Definition</em>'.
	 * @see ecmm.VariableDataDefinition
	 * @generated
	 */
	EClass getVariableDataDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.VariableDataDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecmm.VariableDataDefinition#getName()
	 * @see #getVariableDataDefinition()
	 * @generated
	 */
	EAttribute getVariableDataDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.VariableDataDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see ecmm.VariableDataDefinition#getDefinition()
	 * @see #getVariableDataDefinition()
	 * @generated
	 */
	EAttribute getVariableDataDefinition_Definition();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.VariableDataDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecmm.VariableDataDefinition#getId()
	 * @see #getVariableDataDefinition()
	 * @generated
	 */
	EAttribute getVariableDataDefinition_Id();

	/**
	 * Returns the meta object for the container reference '{@link ecmm.VariableDataDefinition#getEntityContext <em>Entity Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity Context</em>'.
	 * @see ecmm.VariableDataDefinition#getEntityContext()
	 * @see #getVariableDataDefinition()
	 * @generated
	 */
	EReference getVariableDataDefinition_EntityContext();

	/**
	 * Returns the meta object for class '{@link ecmm.EntityContext <em>Entity Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Context</em>'.
	 * @see ecmm.EntityContext
	 * @generated
	 */
	EClass getEntityContext();

	/**
	 * Returns the meta object for the containment reference list '{@link ecmm.EntityContext#getSituations <em>Situations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Situations</em>'.
	 * @see ecmm.EntityContext#getSituations()
	 * @see #getEntityContext()
	 * @generated
	 */
	EReference getEntityContext_Situations();

	/**
	 * Returns the meta object for the containment reference list '{@link ecmm.EntityContext#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see ecmm.EntityContext#getState()
	 * @see #getEntityContext()
	 * @generated
	 */
	EReference getEntityContext_State();

	/**
	 * Returns the meta object for the container reference '{@link ecmm.EntityContext#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see ecmm.EntityContext#getSystem()
	 * @see #getEntityContext()
	 * @generated
	 */
	EReference getEntityContext_System();

	/**
	 * Returns the meta object for the containment reference list '{@link ecmm.EntityContext#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see ecmm.EntityContext#getVariables()
	 * @see #getEntityContext()
	 * @generated
	 */
	EReference getEntityContext_Variables();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.EntityContext#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity</em>'.
	 * @see ecmm.EntityContext#getEntity()
	 * @see #getEntityContext()
	 * @generated
	 */
	EAttribute getEntityContext_Entity();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.EntityContext#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecmm.EntityContext#getId()
	 * @see #getEntityContext()
	 * @generated
	 */
	EAttribute getEntityContext_Id();

	/**
	 * Returns the meta object for the '{@link ecmm.EntityContext#incoming() <em>Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Incoming</em>' operation.
	 * @see ecmm.EntityContext#incoming()
	 * @generated
	 */
	EOperation getEntityContext__Incoming();

	/**
	 * Returns the meta object for the '{@link ecmm.EntityContext#ongoing() <em>Ongoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ongoing</em>' operation.
	 * @see ecmm.EntityContext#ongoing()
	 * @generated
	 */
	EOperation getEntityContext__Ongoing();

	/**
	 * Returns the meta object for class '{@link ecmm.ContextSituation <em>Context Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Situation</em>'.
	 * @see ecmm.ContextSituation
	 * @generated
	 */
	EClass getContextSituation();

	/**
	 * Returns the meta object for the containment reference list '{@link ecmm.ContextSituation#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see ecmm.ContextSituation#getActions()
	 * @see #getContextSituation()
	 * @generated
	 */
	EReference getContextSituation_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link ecmm.ContextSituation#getMemoryConditions <em>Memory Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Conditions</em>'.
	 * @see ecmm.ContextSituation#getMemoryConditions()
	 * @see #getContextSituation()
	 * @generated
	 */
	EReference getContextSituation_MemoryConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link ecmm.ContextSituation#getSensingConditions <em>Sensing Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensing Conditions</em>'.
	 * @see ecmm.ContextSituation#getSensingConditions()
	 * @see #getContextSituation()
	 * @generated
	 */
	EReference getContextSituation_SensingConditions();

	/**
	 * Returns the meta object for the container reference '{@link ecmm.ContextSituation#getEntityContext <em>Entity Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity Context</em>'.
	 * @see ecmm.ContextSituation#getEntityContext()
	 * @see #getContextSituation()
	 * @generated
	 */
	EReference getContextSituation_EntityContext();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.ContextSituation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecmm.ContextSituation#getName()
	 * @see #getContextSituation()
	 * @generated
	 */
	EAttribute getContextSituation_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.ContextSituation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecmm.ContextSituation#getId()
	 * @see #getContextSituation()
	 * @generated
	 */
	EAttribute getContextSituation_Id();

	/**
	 * Returns the meta object for the '{@link ecmm.ContextSituation#matches() <em>Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matches</em>' operation.
	 * @see ecmm.ContextSituation#matches()
	 * @generated
	 */
	EOperation getContextSituation__Matches();

	/**
	 * Returns the meta object for class '{@link ecmm.ContextCondition <em>Context Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Condition</em>'.
	 * @see ecmm.ContextCondition
	 * @generated
	 */
	EClass getContextCondition();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.ContextCondition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecmm.ContextCondition#getId()
	 * @see #getContextCondition()
	 * @generated
	 */
	EAttribute getContextCondition_Id();

	/**
	 * Returns the meta object for the '{@link ecmm.ContextCondition#satisfies() <em>Satisfies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Satisfies</em>' operation.
	 * @see ecmm.ContextCondition#satisfies()
	 * @generated
	 */
	EOperation getContextCondition__Satisfies();

	/**
	 * Returns the meta object for class '{@link ecmm.ContextMemory <em>Context Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Memory</em>'.
	 * @see ecmm.ContextMemory
	 * @generated
	 */
	EClass getContextMemory();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.ContextMemory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecmm.ContextMemory#getName()
	 * @see #getContextMemory()
	 * @generated
	 */
	EAttribute getContextMemory_Name();

	/**
	 * Returns the meta object for the container reference '{@link ecmm.ContextMemory#getEntityContext <em>Entity Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity Context</em>'.
	 * @see ecmm.ContextMemory#getEntityContext()
	 * @see #getContextMemory()
	 * @generated
	 */
	EReference getContextMemory_EntityContext();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.ContextMemory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecmm.ContextMemory#getId()
	 * @see #getContextMemory()
	 * @generated
	 */
	EAttribute getContextMemory_Id();

	/**
	 * Returns the meta object for the '{@link ecmm.ContextMemory#match() <em>Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Match</em>' operation.
	 * @see ecmm.ContextMemory#match()
	 * @generated
	 */
	EOperation getContextMemory__Match();

	/**
	 * Returns the meta object for the '{@link ecmm.ContextMemory#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see ecmm.ContextMemory#update()
	 * @generated
	 */
	EOperation getContextMemory__Update();

	/**
	 * Returns the meta object for class '{@link ecmm.LogicMemory <em>Logic Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Memory</em>'.
	 * @see ecmm.LogicMemory
	 * @generated
	 */
	EClass getLogicMemory();

	/**
	 * Returns the meta object for class '{@link ecmm.DictionaryMemory <em>Dictionary Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Memory</em>'.
	 * @see ecmm.DictionaryMemory
	 * @generated
	 */
	EClass getDictionaryMemory();

	/**
	 * Returns the meta object for class '{@link ecmm.HolderMemory <em>Holder Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Holder Memory</em>'.
	 * @see ecmm.HolderMemory
	 * @generated
	 */
	EClass getHolderMemory();

	/**
	 * Returns the meta object for class '{@link ecmm.StackMemory <em>Stack Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Memory</em>'.
	 * @see ecmm.StackMemory
	 * @generated
	 */
	EClass getStackMemory();

	/**
	 * Returns the meta object for class '{@link ecmm.TimeMemory <em>Time Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Memory</em>'.
	 * @see ecmm.TimeMemory
	 * @generated
	 */
	EClass getTimeMemory();

	/**
	 * Returns the meta object for class '{@link ecmm.ContextAction <em>Context Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Action</em>'.
	 * @see ecmm.ContextAction
	 * @generated
	 */
	EClass getContextAction();

	/**
	 * Returns the meta object for the reference '{@link ecmm.ContextAction#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory</em>'.
	 * @see ecmm.ContextAction#getMemory()
	 * @see #getContextAction()
	 * @generated
	 */
	EReference getContextAction_Memory();

	/**
	 * Returns the meta object for the container reference '{@link ecmm.ContextAction#getSituation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Situation</em>'.
	 * @see ecmm.ContextAction#getSituation()
	 * @see #getContextAction()
	 * @generated
	 */
	EReference getContextAction_Situation();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.ContextAction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see ecmm.ContextAction#getExpression()
	 * @see #getContextAction()
	 * @generated
	 */
	EAttribute getContextAction_Expression();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.ContextAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecmm.ContextAction#getId()
	 * @see #getContextAction()
	 * @generated
	 */
	EAttribute getContextAction_Id();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.ContextAction#getMemoryName <em>Memory Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Name</em>'.
	 * @see ecmm.ContextAction#getMemoryName()
	 * @see #getContextAction()
	 * @generated
	 */
	EAttribute getContextAction_MemoryName();

	/**
	 * Returns the meta object for the '{@link ecmm.ContextAction#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ecmm.ContextAction#execute()
	 * @generated
	 */
	EOperation getContextAction__Execute();

	/**
	 * Returns the meta object for class '{@link ecmm.SensingContextCondition <em>Sensing Context Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensing Context Condition</em>'.
	 * @see ecmm.SensingContextCondition
	 * @generated
	 */
	EClass getSensingContextCondition();

	/**
	 * Returns the meta object for the container reference '{@link ecmm.SensingContextCondition#getSituation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Situation</em>'.
	 * @see ecmm.SensingContextCondition#getSituation()
	 * @see #getSensingContextCondition()
	 * @generated
	 */
	EReference getSensingContextCondition_Situation();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.SensingContextCondition#getInformationflow <em>Informationflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Informationflow</em>'.
	 * @see ecmm.SensingContextCondition#getInformationflow()
	 * @see #getSensingContextCondition()
	 * @generated
	 */
	EAttribute getSensingContextCondition_Informationflow();

	/**
	 * Returns the meta object for class '{@link ecmm.MemoryContextCondition <em>Memory Context Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Context Condition</em>'.
	 * @see ecmm.MemoryContextCondition
	 * @generated
	 */
	EClass getMemoryContextCondition();

	/**
	 * Returns the meta object for the container reference '{@link ecmm.MemoryContextCondition#getSituation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Situation</em>'.
	 * @see ecmm.MemoryContextCondition#getSituation()
	 * @see #getMemoryContextCondition()
	 * @generated
	 */
	EReference getMemoryContextCondition_Situation();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.MemoryContextCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see ecmm.MemoryContextCondition#getExpression()
	 * @see #getMemoryContextCondition()
	 * @generated
	 */
	EAttribute getMemoryContextCondition_Expression();

	/**
	 * Returns the meta object for the reference '{@link ecmm.MemoryContextCondition#getContextMemory <em>Context Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Memory</em>'.
	 * @see ecmm.MemoryContextCondition#getContextMemory()
	 * @see #getMemoryContextCondition()
	 * @generated
	 */
	EReference getMemoryContextCondition_ContextMemory();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.MemoryContextCondition#getMemoryName <em>Memory Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Name</em>'.
	 * @see ecmm.MemoryContextCondition#getMemoryName()
	 * @see #getMemoryContextCondition()
	 * @generated
	 */
	EAttribute getMemoryContextCondition_MemoryName();

	/**
	 * Returns the meta object for class '{@link ecmm.SystemContext <em>System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Context</em>'.
	 * @see ecmm.SystemContext
	 * @generated
	 */
	EClass getSystemContext();

	/**
	 * Returns the meta object for the containment reference list '{@link ecmm.SystemContext#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see ecmm.SystemContext#getEntities()
	 * @see #getSystemContext()
	 * @generated
	 */
	EReference getSystemContext_Entities();

	/**
	 * Returns the meta object for the attribute '{@link ecmm.SystemContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecmm.SystemContext#getName()
	 * @see #getSystemContext()
	 * @generated
	 */
	EAttribute getSystemContext_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcmmFactory getEcmmFactory();

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
		 * The meta object literal for the '{@link ecmm.impl.VariableDataDefinitionImpl <em>Variable Data Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.VariableDataDefinitionImpl
		 * @see ecmm.impl.EcmmPackageImpl#getVariableDataDefinition()
		 * @generated
		 */
		EClass VARIABLE_DATA_DEFINITION = eINSTANCE.getVariableDataDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DATA_DEFINITION__NAME = eINSTANCE.getVariableDataDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DATA_DEFINITION__DEFINITION = eINSTANCE.getVariableDataDefinition_Definition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DATA_DEFINITION__ID = eINSTANCE.getVariableDataDefinition_Id();

		/**
		 * The meta object literal for the '<em><b>Entity Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT = eINSTANCE.getVariableDataDefinition_EntityContext();

		/**
		 * The meta object literal for the '{@link ecmm.impl.EntityContextImpl <em>Entity Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.EntityContextImpl
		 * @see ecmm.impl.EcmmPackageImpl#getEntityContext()
		 * @generated
		 */
		EClass ENTITY_CONTEXT = eINSTANCE.getEntityContext();

		/**
		 * The meta object literal for the '<em><b>Situations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CONTEXT__SITUATIONS = eINSTANCE.getEntityContext_Situations();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CONTEXT__STATE = eINSTANCE.getEntityContext_State();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CONTEXT__SYSTEM = eINSTANCE.getEntityContext_System();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CONTEXT__VARIABLES = eINSTANCE.getEntityContext_Variables();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_CONTEXT__ENTITY = eINSTANCE.getEntityContext_Entity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_CONTEXT__ID = eINSTANCE.getEntityContext_Id();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_CONTEXT___INCOMING = eINSTANCE.getEntityContext__Incoming();

		/**
		 * The meta object literal for the '<em><b>Ongoing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_CONTEXT___ONGOING = eINSTANCE.getEntityContext__Ongoing();

		/**
		 * The meta object literal for the '{@link ecmm.impl.ContextSituationImpl <em>Context Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.ContextSituationImpl
		 * @see ecmm.impl.EcmmPackageImpl#getContextSituation()
		 * @generated
		 */
		EClass CONTEXT_SITUATION = eINSTANCE.getContextSituation();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SITUATION__ACTIONS = eINSTANCE.getContextSituation_Actions();

		/**
		 * The meta object literal for the '<em><b>Memory Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SITUATION__MEMORY_CONDITIONS = eINSTANCE.getContextSituation_MemoryConditions();

		/**
		 * The meta object literal for the '<em><b>Sensing Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SITUATION__SENSING_CONDITIONS = eINSTANCE.getContextSituation_SensingConditions();

		/**
		 * The meta object literal for the '<em><b>Entity Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_SITUATION__ENTITY_CONTEXT = eINSTANCE.getContextSituation_EntityContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_SITUATION__NAME = eINSTANCE.getContextSituation_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_SITUATION__ID = eINSTANCE.getContextSituation_Id();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_SITUATION___MATCHES = eINSTANCE.getContextSituation__Matches();

		/**
		 * The meta object literal for the '{@link ecmm.impl.ContextConditionImpl <em>Context Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.ContextConditionImpl
		 * @see ecmm.impl.EcmmPackageImpl#getContextCondition()
		 * @generated
		 */
		EClass CONTEXT_CONDITION = eINSTANCE.getContextCondition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_CONDITION__ID = eINSTANCE.getContextCondition_Id();

		/**
		 * The meta object literal for the '<em><b>Satisfies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_CONDITION___SATISFIES = eINSTANCE.getContextCondition__Satisfies();

		/**
		 * The meta object literal for the '{@link ecmm.impl.ContextMemoryImpl <em>Context Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.ContextMemoryImpl
		 * @see ecmm.impl.EcmmPackageImpl#getContextMemory()
		 * @generated
		 */
		EClass CONTEXT_MEMORY = eINSTANCE.getContextMemory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MEMORY__NAME = eINSTANCE.getContextMemory_Name();

		/**
		 * The meta object literal for the '<em><b>Entity Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MEMORY__ENTITY_CONTEXT = eINSTANCE.getContextMemory_EntityContext();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MEMORY__ID = eINSTANCE.getContextMemory_Id();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_MEMORY___MATCH = eINSTANCE.getContextMemory__Match();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_MEMORY___UPDATE = eINSTANCE.getContextMemory__Update();

		/**
		 * The meta object literal for the '{@link ecmm.impl.LogicMemoryImpl <em>Logic Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.LogicMemoryImpl
		 * @see ecmm.impl.EcmmPackageImpl#getLogicMemory()
		 * @generated
		 */
		EClass LOGIC_MEMORY = eINSTANCE.getLogicMemory();

		/**
		 * The meta object literal for the '{@link ecmm.impl.DictionaryMemoryImpl <em>Dictionary Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.DictionaryMemoryImpl
		 * @see ecmm.impl.EcmmPackageImpl#getDictionaryMemory()
		 * @generated
		 */
		EClass DICTIONARY_MEMORY = eINSTANCE.getDictionaryMemory();

		/**
		 * The meta object literal for the '{@link ecmm.impl.HolderMemoryImpl <em>Holder Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.HolderMemoryImpl
		 * @see ecmm.impl.EcmmPackageImpl#getHolderMemory()
		 * @generated
		 */
		EClass HOLDER_MEMORY = eINSTANCE.getHolderMemory();

		/**
		 * The meta object literal for the '{@link ecmm.impl.StackMemoryImpl <em>Stack Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.StackMemoryImpl
		 * @see ecmm.impl.EcmmPackageImpl#getStackMemory()
		 * @generated
		 */
		EClass STACK_MEMORY = eINSTANCE.getStackMemory();

		/**
		 * The meta object literal for the '{@link ecmm.impl.TimeMemoryImpl <em>Time Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.TimeMemoryImpl
		 * @see ecmm.impl.EcmmPackageImpl#getTimeMemory()
		 * @generated
		 */
		EClass TIME_MEMORY = eINSTANCE.getTimeMemory();

		/**
		 * The meta object literal for the '{@link ecmm.impl.ContextActionImpl <em>Context Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.ContextActionImpl
		 * @see ecmm.impl.EcmmPackageImpl#getContextAction()
		 * @generated
		 */
		EClass CONTEXT_ACTION = eINSTANCE.getContextAction();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ACTION__MEMORY = eINSTANCE.getContextAction_Memory();

		/**
		 * The meta object literal for the '<em><b>Situation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ACTION__SITUATION = eINSTANCE.getContextAction_Situation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ACTION__EXPRESSION = eINSTANCE.getContextAction_Expression();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ACTION__ID = eINSTANCE.getContextAction_Id();

		/**
		 * The meta object literal for the '<em><b>Memory Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ACTION__MEMORY_NAME = eINSTANCE.getContextAction_MemoryName();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT_ACTION___EXECUTE = eINSTANCE.getContextAction__Execute();

		/**
		 * The meta object literal for the '{@link ecmm.impl.SensingContextConditionImpl <em>Sensing Context Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.SensingContextConditionImpl
		 * @see ecmm.impl.EcmmPackageImpl#getSensingContextCondition()
		 * @generated
		 */
		EClass SENSING_CONTEXT_CONDITION = eINSTANCE.getSensingContextCondition();

		/**
		 * The meta object literal for the '<em><b>Situation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSING_CONTEXT_CONDITION__SITUATION = eINSTANCE.getSensingContextCondition_Situation();

		/**
		 * The meta object literal for the '<em><b>Informationflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSING_CONTEXT_CONDITION__INFORMATIONFLOW = eINSTANCE.getSensingContextCondition_Informationflow();

		/**
		 * The meta object literal for the '{@link ecmm.impl.MemoryContextConditionImpl <em>Memory Context Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.MemoryContextConditionImpl
		 * @see ecmm.impl.EcmmPackageImpl#getMemoryContextCondition()
		 * @generated
		 */
		EClass MEMORY_CONTEXT_CONDITION = eINSTANCE.getMemoryContextCondition();

		/**
		 * The meta object literal for the '<em><b>Situation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_CONTEXT_CONDITION__SITUATION = eINSTANCE.getMemoryContextCondition_Situation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_CONTEXT_CONDITION__EXPRESSION = eINSTANCE.getMemoryContextCondition_Expression();

		/**
		 * The meta object literal for the '<em><b>Context Memory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_CONTEXT_CONDITION__CONTEXT_MEMORY = eINSTANCE.getMemoryContextCondition_ContextMemory();

		/**
		 * The meta object literal for the '<em><b>Memory Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_CONTEXT_CONDITION__MEMORY_NAME = eINSTANCE.getMemoryContextCondition_MemoryName();

		/**
		 * The meta object literal for the '{@link ecmm.impl.SystemContextImpl <em>System Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecmm.impl.SystemContextImpl
		 * @see ecmm.impl.EcmmPackageImpl#getSystemContext()
		 * @generated
		 */
		EClass SYSTEM_CONTEXT = eINSTANCE.getSystemContext();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT__ENTITIES = eINSTANCE.getSystemContext_Entities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_CONTEXT__NAME = eINSTANCE.getSystemContext_Name();

	}

} //EcmmPackage
