/**
 */
package tamm;

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
 * @see tamm.TammFactory
 * @model kind="package"
 * @generated
 */
public interface TammPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tamm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tesoriero.org/cauce/task/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tamm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TammPackage eINSTANCE = tamm.impl.TammPackageImpl.init();

	/**
	 * The meta object id for the '{@link tamm.impl.ContextAwareSystemImpl <em>Context Aware System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.ContextAwareSystemImpl
	 * @see tamm.impl.TammPackageImpl#getContextAwareSystem()
	 * @generated
	 */
	int CONTEXT_AWARE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Final Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Pre Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Post Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__POST_CONDITIONS = 3;

	/**
	 * The feature id for the '<em><b>Initial Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS = 4;

	/**
	 * The feature id for the '<em><b>Route Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__ROUTE_TASKS = 5;

	/**
	 * The feature id for the '<em><b>System Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS = 6;

	/**
	 * The feature id for the '<em><b>Input Condition To Join Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS = 7;

	/**
	 * The feature id for the '<em><b>Input Condition To Split Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS = 8;

	/**
	 * The feature id for the '<em><b>Join Task To Output Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS = 9;

	/**
	 * The feature id for the '<em><b>Split Task To Output Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS = 10;

	/**
	 * The feature id for the '<em><b>Pre Condition To System Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS = 11;

	/**
	 * The feature id for the '<em><b>System Task To Post Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS = 12;

	/**
	 * The number of structural features of the '<em>Context Aware System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Context Aware System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tamm.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.ConditionImpl
	 * @see tamm.impl.TammPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Social Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SOCIAL_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Space Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SPACE_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Task Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TASK_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Logic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LOGIC_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Data Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DATA_EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tamm.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.TaskImpl
	 * @see tamm.impl.TammPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 0;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tamm.impl.SystemTaskImpl <em>System Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.SystemTaskImpl
	 * @see tamm.impl.TammPackageImpl#getSystemTask()
	 * @generated
	 */
	int SYSTEM_TASK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TASK__SYSTEM = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TASK__INCOMING = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TASK__ONGOING = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>System Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.RouteTaskImpl <em>Route Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.RouteTaskImpl
	 * @see tamm.impl.TammPackageImpl#getRouteTask()
	 * @generated
	 */
	int ROUTE_TASK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TASK__SYSTEM = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Route Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Route Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.TaskOutputConditionImpl <em>Task Output Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.TaskOutputConditionImpl
	 * @see tamm.impl.TammPackageImpl#getTaskOutputCondition()
	 * @generated
	 */
	int TASK_OUTPUT_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_CONDITION__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Social Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_CONDITION__SOCIAL_EXPRESSION = CONDITION__SOCIAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Space Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_CONDITION__SPACE_EXPRESSION = CONDITION__SPACE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Task Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_CONDITION__TASK_EXPRESSION = CONDITION__TASK_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Logic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_CONDITION__LOGIC_EXPRESSION = CONDITION__LOGIC_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Data Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_CONDITION__DATA_EXPRESSION = CONDITION__DATA_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_CONDITION__INCOMING = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Output Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Output Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.PreConditionImpl <em>Pre Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.PreConditionImpl
	 * @see tamm.impl.TammPackageImpl#getPreCondition()
	 * @generated
	 */
	int PRE_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__ID = TASK_OUTPUT_CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Social Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__SOCIAL_EXPRESSION = TASK_OUTPUT_CONDITION__SOCIAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Space Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__SPACE_EXPRESSION = TASK_OUTPUT_CONDITION__SPACE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Task Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__TASK_EXPRESSION = TASK_OUTPUT_CONDITION__TASK_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Logic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__LOGIC_EXPRESSION = TASK_OUTPUT_CONDITION__LOGIC_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Data Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__DATA_EXPRESSION = TASK_OUTPUT_CONDITION__DATA_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__INCOMING = TASK_OUTPUT_CONDITION__INCOMING;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__SYSTEM = TASK_OUTPUT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__ONGOING = TASK_OUTPUT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_FEATURE_COUNT = TASK_OUTPUT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_OPERATION_COUNT = TASK_OUTPUT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.TaskInputConditionImpl <em>Task Input Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.TaskInputConditionImpl
	 * @see tamm.impl.TammPackageImpl#getTaskInputCondition()
	 * @generated
	 */
	int TASK_INPUT_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_CONDITION__ID = CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Social Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_CONDITION__SOCIAL_EXPRESSION = CONDITION__SOCIAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Space Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_CONDITION__SPACE_EXPRESSION = CONDITION__SPACE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Task Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_CONDITION__TASK_EXPRESSION = CONDITION__TASK_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Logic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_CONDITION__LOGIC_EXPRESSION = CONDITION__LOGIC_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Data Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_CONDITION__DATA_EXPRESSION = CONDITION__DATA_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_CONDITION__ONGOING = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Input Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Input Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.PostConditionImpl <em>Post Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.PostConditionImpl
	 * @see tamm.impl.TammPackageImpl#getPostCondition()
	 * @generated
	 */
	int POST_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__ID = TASK_INPUT_CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Social Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__SOCIAL_EXPRESSION = TASK_INPUT_CONDITION__SOCIAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Space Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__SPACE_EXPRESSION = TASK_INPUT_CONDITION__SPACE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Task Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__TASK_EXPRESSION = TASK_INPUT_CONDITION__TASK_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Logic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__LOGIC_EXPRESSION = TASK_INPUT_CONDITION__LOGIC_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Data Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__DATA_EXPRESSION = TASK_INPUT_CONDITION__DATA_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__ONGOING = TASK_INPUT_CONDITION__ONGOING;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__SYSTEM = TASK_INPUT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__INCOMING = TASK_INPUT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION_FEATURE_COUNT = TASK_INPUT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION_OPERATION_COUNT = TASK_INPUT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.InitialConditionImpl <em>Initial Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.InitialConditionImpl
	 * @see tamm.impl.TammPackageImpl#getInitialCondition()
	 * @generated
	 */
	int INITIAL_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION__ID = TASK_INPUT_CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Social Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION__SOCIAL_EXPRESSION = TASK_INPUT_CONDITION__SOCIAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Space Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION__SPACE_EXPRESSION = TASK_INPUT_CONDITION__SPACE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Task Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION__TASK_EXPRESSION = TASK_INPUT_CONDITION__TASK_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Logic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION__LOGIC_EXPRESSION = TASK_INPUT_CONDITION__LOGIC_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Data Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION__DATA_EXPRESSION = TASK_INPUT_CONDITION__DATA_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION__ONGOING = TASK_INPUT_CONDITION__ONGOING;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION__SYSTEM = TASK_INPUT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION_FEATURE_COUNT = TASK_INPUT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Initial Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONDITION_OPERATION_COUNT = TASK_INPUT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.FinalConditionImpl <em>Final Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.FinalConditionImpl
	 * @see tamm.impl.TammPackageImpl#getFinalCondition()
	 * @generated
	 */
	int FINAL_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CONDITION__ID = TASK_OUTPUT_CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Social Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CONDITION__SOCIAL_EXPRESSION = TASK_OUTPUT_CONDITION__SOCIAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Space Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CONDITION__SPACE_EXPRESSION = TASK_OUTPUT_CONDITION__SPACE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Task Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CONDITION__TASK_EXPRESSION = TASK_OUTPUT_CONDITION__TASK_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Logic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CONDITION__LOGIC_EXPRESSION = TASK_OUTPUT_CONDITION__LOGIC_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Data Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CONDITION__DATA_EXPRESSION = TASK_OUTPUT_CONDITION__DATA_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CONDITION__INCOMING = TASK_OUTPUT_CONDITION__INCOMING;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CONDITION__SYSTEM = TASK_OUTPUT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CONDITION_FEATURE_COUNT = TASK_OUTPUT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Final Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CONDITION_OPERATION_COUNT = TASK_OUTPUT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.JoinImpl
	 * @see tamm.impl.TammPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ID = ROUTE_TASK__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SYSTEM = ROUTE_TASK__SYSTEM;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__INCOMING = ROUTE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ONGOING = ROUTE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = ROUTE_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = ROUTE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.SplitImpl
	 * @see tamm.impl.TammPackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__ID = ROUTE_TASK__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__SYSTEM = ROUTE_TASK__SYSTEM;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__INCOMING = ROUTE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__ONGOING = ROUTE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = ROUTE_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_OPERATION_COUNT = ROUTE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.SimpleTaskImpl <em>Simple Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.SimpleTaskImpl
	 * @see tamm.impl.TammPackageImpl#getSimpleTask()
	 * @generated
	 */
	int SIMPLE_TASK = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__ID = SYSTEM_TASK__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__SYSTEM = SYSTEM_TASK__SYSTEM;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__INCOMING = SYSTEM_TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__ONGOING = SYSTEM_TASK__ONGOING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__NAME = SYSTEM_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK_FEATURE_COUNT = SYSTEM_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK_OPERATION_COUNT = SYSTEM_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.SkipTaskImpl <em>Skip Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.SkipTaskImpl
	 * @see tamm.impl.TammPackageImpl#getSkipTask()
	 * @generated
	 */
	int SKIP_TASK = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_TASK__ID = SYSTEM_TASK__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_TASK__SYSTEM = SYSTEM_TASK__SYSTEM;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_TASK__INCOMING = SYSTEM_TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_TASK__ONGOING = SYSTEM_TASK__ONGOING;

	/**
	 * The number of structural features of the '<em>Skip Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_TASK_FEATURE_COUNT = SYSTEM_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Skip Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_TASK_OPERATION_COUNT = SYSTEM_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.EdgeImpl
	 * @see tamm.impl.TammPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 15;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tamm.impl.InputConditionToRouteTaskImpl <em>Input Condition To Route Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.InputConditionToRouteTaskImpl
	 * @see tamm.impl.TammPackageImpl#getInputConditionToRouteTask()
	 * @generated
	 */
	int INPUT_CONDITION_TO_ROUTE_TASK = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_ROUTE_TASK__SOURCE = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Condition To Route Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_ROUTE_TASK_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Condition To Route Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_ROUTE_TASK_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.RouteTaskToOutputConditionImpl <em>Route Task To Output Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.RouteTaskToOutputConditionImpl
	 * @see tamm.impl.TammPackageImpl#getRouteTaskToOutputCondition()
	 * @generated
	 */
	int ROUTE_TASK_TO_OUTPUT_CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TASK_TO_OUTPUT_CONDITION__TARGET = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Route Task To Output Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TASK_TO_OUTPUT_CONDITION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Route Task To Output Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TASK_TO_OUTPUT_CONDITION_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.PreConditionToSystemTaskImpl <em>Pre Condition To System Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.PreConditionToSystemTaskImpl
	 * @see tamm.impl.TammPackageImpl#getPreConditionToSystemTask()
	 * @generated
	 */
	int PRE_CONDITION_TO_SYSTEM_TASK = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_TO_SYSTEM_TASK__SOURCE = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_TO_SYSTEM_TASK__TARGET = EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM = EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pre Condition To System Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_TO_SYSTEM_TASK_FEATURE_COUNT = EDGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pre Condition To System Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_TO_SYSTEM_TASK_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.SystemTaskToPostConditionImpl <em>System Task To Post Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.SystemTaskToPostConditionImpl
	 * @see tamm.impl.TammPackageImpl#getSystemTaskToPostCondition()
	 * @generated
	 */
	int SYSTEM_TASK_TO_POST_CONDITION = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TASK_TO_POST_CONDITION__SOURCE = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TASK_TO_POST_CONDITION__TARGET = EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TASK_TO_POST_CONDITION__SYSTEM = EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Task To Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TASK_TO_POST_CONDITION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>System Task To Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TASK_TO_POST_CONDITION_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.AndJoinImpl <em>And Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.AndJoinImpl
	 * @see tamm.impl.TammPackageImpl#getAndJoin()
	 * @generated
	 */
	int AND_JOIN = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__ID = JOIN__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__SYSTEM = JOIN__SYSTEM;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__INCOMING = JOIN__INCOMING;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__ONGOING = JOIN__ONGOING;

	/**
	 * The number of structural features of the '<em>And Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_FEATURE_COUNT = JOIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_OPERATION_COUNT = JOIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.OrJoinImpl <em>Or Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.OrJoinImpl
	 * @see tamm.impl.TammPackageImpl#getOrJoin()
	 * @generated
	 */
	int OR_JOIN = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__ID = JOIN__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__SYSTEM = JOIN__SYSTEM;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__INCOMING = JOIN__INCOMING;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__ONGOING = JOIN__ONGOING;

	/**
	 * The number of structural features of the '<em>Or Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN_FEATURE_COUNT = JOIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN_OPERATION_COUNT = JOIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.AndSplitImpl <em>And Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.AndSplitImpl
	 * @see tamm.impl.TammPackageImpl#getAndSplit()
	 * @generated
	 */
	int AND_SPLIT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_SPLIT__ID = SPLIT__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_SPLIT__SYSTEM = SPLIT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_SPLIT__INCOMING = SPLIT__INCOMING;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_SPLIT__ONGOING = SPLIT__ONGOING;

	/**
	 * The number of structural features of the '<em>And Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_SPLIT_FEATURE_COUNT = SPLIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_SPLIT_OPERATION_COUNT = SPLIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.OrSplitImpl <em>Or Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.OrSplitImpl
	 * @see tamm.impl.TammPackageImpl#getOrSplit()
	 * @generated
	 */
	int OR_SPLIT = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_SPLIT__ID = SPLIT__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_SPLIT__SYSTEM = SPLIT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_SPLIT__INCOMING = SPLIT__INCOMING;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_SPLIT__ONGOING = SPLIT__ONGOING;

	/**
	 * The number of structural features of the '<em>Or Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_SPLIT_FEATURE_COUNT = SPLIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_SPLIT_OPERATION_COUNT = SPLIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.InputConditionToJoinTaskImpl <em>Input Condition To Join Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.InputConditionToJoinTaskImpl
	 * @see tamm.impl.TammPackageImpl#getInputConditionToJoinTask()
	 * @generated
	 */
	int INPUT_CONDITION_TO_JOIN_TASK = 24;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_JOIN_TASK__SOURCE = INPUT_CONDITION_TO_ROUTE_TASK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_JOIN_TASK__TARGET = INPUT_CONDITION_TO_ROUTE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_JOIN_TASK__SYSTEM = INPUT_CONDITION_TO_ROUTE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Condition To Join Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_JOIN_TASK_FEATURE_COUNT = INPUT_CONDITION_TO_ROUTE_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Condition To Join Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_JOIN_TASK_OPERATION_COUNT = INPUT_CONDITION_TO_ROUTE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.InputConditionToSplitTaskImpl <em>Input Condition To Split Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.InputConditionToSplitTaskImpl
	 * @see tamm.impl.TammPackageImpl#getInputConditionToSplitTask()
	 * @generated
	 */
	int INPUT_CONDITION_TO_SPLIT_TASK = 25;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_SPLIT_TASK__SOURCE = INPUT_CONDITION_TO_ROUTE_TASK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_SPLIT_TASK__TARGET = INPUT_CONDITION_TO_ROUTE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_SPLIT_TASK__SYSTEM = INPUT_CONDITION_TO_ROUTE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Condition To Split Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_SPLIT_TASK_FEATURE_COUNT = INPUT_CONDITION_TO_ROUTE_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Condition To Split Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_TO_SPLIT_TASK_OPERATION_COUNT = INPUT_CONDITION_TO_ROUTE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.JoinTaskToOutputConditionImpl <em>Join Task To Output Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.JoinTaskToOutputConditionImpl
	 * @see tamm.impl.TammPackageImpl#getJoinTaskToOutputCondition()
	 * @generated
	 */
	int JOIN_TASK_TO_OUTPUT_CONDITION = 26;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TASK_TO_OUTPUT_CONDITION__TARGET = ROUTE_TASK_TO_OUTPUT_CONDITION__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE = ROUTE_TASK_TO_OUTPUT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM = ROUTE_TASK_TO_OUTPUT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Task To Output Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TASK_TO_OUTPUT_CONDITION_FEATURE_COUNT = ROUTE_TASK_TO_OUTPUT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Join Task To Output Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TASK_TO_OUTPUT_CONDITION_OPERATION_COUNT = ROUTE_TASK_TO_OUTPUT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tamm.impl.SplitTaskToOutputConditionImpl <em>Split Task To Output Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tamm.impl.SplitTaskToOutputConditionImpl
	 * @see tamm.impl.TammPackageImpl#getSplitTaskToOutputCondition()
	 * @generated
	 */
	int SPLIT_TASK_TO_OUTPUT_CONDITION = 27;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_TASK_TO_OUTPUT_CONDITION__TARGET = ROUTE_TASK_TO_OUTPUT_CONDITION__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_TASK_TO_OUTPUT_CONDITION__SOURCE = ROUTE_TASK_TO_OUTPUT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_TASK_TO_OUTPUT_CONDITION__SYSTEM = ROUTE_TASK_TO_OUTPUT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Split Task To Output Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_TASK_TO_OUTPUT_CONDITION_FEATURE_COUNT = ROUTE_TASK_TO_OUTPUT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Split Task To Output Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_TASK_TO_OUTPUT_CONDITION_OPERATION_COUNT = ROUTE_TASK_TO_OUTPUT_CONDITION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tamm.ContextAwareSystem <em>Context Aware System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Aware System</em>'.
	 * @see tamm.ContextAwareSystem
	 * @generated
	 */
	EClass getContextAwareSystem();

	/**
	 * Returns the meta object for the attribute '{@link tamm.ContextAwareSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tamm.ContextAwareSystem#getName()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EAttribute getContextAwareSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getFinalConditions <em>Final Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Final Conditions</em>'.
	 * @see tamm.ContextAwareSystem#getFinalConditions()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_FinalConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getPreConditions <em>Pre Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Conditions</em>'.
	 * @see tamm.ContextAwareSystem#getPreConditions()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_PreConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getPostConditions <em>Post Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Conditions</em>'.
	 * @see tamm.ContextAwareSystem#getPostConditions()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_PostConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getInitialConditions <em>Initial Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Conditions</em>'.
	 * @see tamm.ContextAwareSystem#getInitialConditions()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_InitialConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getRouteTasks <em>Route Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Tasks</em>'.
	 * @see tamm.ContextAwareSystem#getRouteTasks()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_RouteTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getSystemTasks <em>System Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Tasks</em>'.
	 * @see tamm.ContextAwareSystem#getSystemTasks()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_SystemTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getInputConditionToJoinTasks <em>Input Condition To Join Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Condition To Join Tasks</em>'.
	 * @see tamm.ContextAwareSystem#getInputConditionToJoinTasks()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_InputConditionToJoinTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getInputConditionToSplitTasks <em>Input Condition To Split Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Condition To Split Tasks</em>'.
	 * @see tamm.ContextAwareSystem#getInputConditionToSplitTasks()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_InputConditionToSplitTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getJoinTaskToOutputConditions <em>Join Task To Output Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Task To Output Conditions</em>'.
	 * @see tamm.ContextAwareSystem#getJoinTaskToOutputConditions()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_JoinTaskToOutputConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getSplitTaskToOutputConditions <em>Split Task To Output Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Split Task To Output Conditions</em>'.
	 * @see tamm.ContextAwareSystem#getSplitTaskToOutputConditions()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_SplitTaskToOutputConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getPreConditionToSystemTasks <em>Pre Condition To System Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Condition To System Tasks</em>'.
	 * @see tamm.ContextAwareSystem#getPreConditionToSystemTasks()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_PreConditionToSystemTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link tamm.ContextAwareSystem#getSystemTaskToPostConditions <em>System Task To Post Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Task To Post Conditions</em>'.
	 * @see tamm.ContextAwareSystem#getSystemTaskToPostConditions()
	 * @see #getContextAwareSystem()
	 * @generated
	 */
	EReference getContextAwareSystem_SystemTaskToPostConditions();

	/**
	 * Returns the meta object for class '{@link tamm.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see tamm.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link tamm.Condition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tamm.Condition#getId()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Id();

	/**
	 * Returns the meta object for the attribute '{@link tamm.Condition#getSocialExpression <em>Social Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Expression</em>'.
	 * @see tamm.Condition#getSocialExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_SocialExpression();

	/**
	 * Returns the meta object for the attribute '{@link tamm.Condition#getSpaceExpression <em>Space Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space Expression</em>'.
	 * @see tamm.Condition#getSpaceExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_SpaceExpression();

	/**
	 * Returns the meta object for the attribute '{@link tamm.Condition#getTaskExpression <em>Task Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Expression</em>'.
	 * @see tamm.Condition#getTaskExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_TaskExpression();

	/**
	 * Returns the meta object for the attribute '{@link tamm.Condition#getLogicExpression <em>Logic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic Expression</em>'.
	 * @see tamm.Condition#getLogicExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_LogicExpression();

	/**
	 * Returns the meta object for the attribute '{@link tamm.Condition#getDataExpression <em>Data Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Expression</em>'.
	 * @see tamm.Condition#getDataExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_DataExpression();

	/**
	 * Returns the meta object for class '{@link tamm.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see tamm.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link tamm.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tamm.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for class '{@link tamm.SystemTask <em>System Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Task</em>'.
	 * @see tamm.SystemTask
	 * @generated
	 */
	EClass getSystemTask();

	/**
	 * Returns the meta object for the container reference '{@link tamm.SystemTask#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.SystemTask#getSystem()
	 * @see #getSystemTask()
	 * @generated
	 */
	EReference getSystemTask_System();

	/**
	 * Returns the meta object for the reference '{@link tamm.SystemTask#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see tamm.SystemTask#getIncoming()
	 * @see #getSystemTask()
	 * @generated
	 */
	EReference getSystemTask_Incoming();

	/**
	 * Returns the meta object for the reference '{@link tamm.SystemTask#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ongoing</em>'.
	 * @see tamm.SystemTask#getOngoing()
	 * @see #getSystemTask()
	 * @generated
	 */
	EReference getSystemTask_Ongoing();

	/**
	 * Returns the meta object for class '{@link tamm.RouteTask <em>Route Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Task</em>'.
	 * @see tamm.RouteTask
	 * @generated
	 */
	EClass getRouteTask();

	/**
	 * Returns the meta object for the container reference '{@link tamm.RouteTask#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.RouteTask#getSystem()
	 * @see #getRouteTask()
	 * @generated
	 */
	EReference getRouteTask_System();

	/**
	 * Returns the meta object for class '{@link tamm.PreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Condition</em>'.
	 * @see tamm.PreCondition
	 * @generated
	 */
	EClass getPreCondition();

	/**
	 * Returns the meta object for the container reference '{@link tamm.PreCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.PreCondition#getSystem()
	 * @see #getPreCondition()
	 * @generated
	 */
	EReference getPreCondition_System();

	/**
	 * Returns the meta object for the reference '{@link tamm.PreCondition#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ongoing</em>'.
	 * @see tamm.PreCondition#getOngoing()
	 * @see #getPreCondition()
	 * @generated
	 */
	EReference getPreCondition_Ongoing();

	/**
	 * Returns the meta object for class '{@link tamm.PostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Condition</em>'.
	 * @see tamm.PostCondition
	 * @generated
	 */
	EClass getPostCondition();

	/**
	 * Returns the meta object for the container reference '{@link tamm.PostCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.PostCondition#getSystem()
	 * @see #getPostCondition()
	 * @generated
	 */
	EReference getPostCondition_System();

	/**
	 * Returns the meta object for the reference '{@link tamm.PostCondition#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see tamm.PostCondition#getIncoming()
	 * @see #getPostCondition()
	 * @generated
	 */
	EReference getPostCondition_Incoming();

	/**
	 * Returns the meta object for class '{@link tamm.TaskInputCondition <em>Task Input Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Input Condition</em>'.
	 * @see tamm.TaskInputCondition
	 * @generated
	 */
	EClass getTaskInputCondition();

	/**
	 * Returns the meta object for the reference '{@link tamm.TaskInputCondition#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ongoing</em>'.
	 * @see tamm.TaskInputCondition#getOngoing()
	 * @see #getTaskInputCondition()
	 * @generated
	 */
	EReference getTaskInputCondition_Ongoing();

	/**
	 * Returns the meta object for class '{@link tamm.TaskOutputCondition <em>Task Output Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Output Condition</em>'.
	 * @see tamm.TaskOutputCondition
	 * @generated
	 */
	EClass getTaskOutputCondition();

	/**
	 * Returns the meta object for the reference '{@link tamm.TaskOutputCondition#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see tamm.TaskOutputCondition#getIncoming()
	 * @see #getTaskOutputCondition()
	 * @generated
	 */
	EReference getTaskOutputCondition_Incoming();

	/**
	 * Returns the meta object for class '{@link tamm.InitialCondition <em>Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Condition</em>'.
	 * @see tamm.InitialCondition
	 * @generated
	 */
	EClass getInitialCondition();

	/**
	 * Returns the meta object for the container reference '{@link tamm.InitialCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.InitialCondition#getSystem()
	 * @see #getInitialCondition()
	 * @generated
	 */
	EReference getInitialCondition_System();

	/**
	 * Returns the meta object for class '{@link tamm.FinalCondition <em>Final Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Condition</em>'.
	 * @see tamm.FinalCondition
	 * @generated
	 */
	EClass getFinalCondition();

	/**
	 * Returns the meta object for the container reference '{@link tamm.FinalCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.FinalCondition#getSystem()
	 * @see #getFinalCondition()
	 * @generated
	 */
	EReference getFinalCondition_System();

	/**
	 * Returns the meta object for class '{@link tamm.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see tamm.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the reference list '{@link tamm.Join#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see tamm.Join#getIncoming()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Incoming();

	/**
	 * Returns the meta object for the reference '{@link tamm.Join#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ongoing</em>'.
	 * @see tamm.Join#getOngoing()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Ongoing();

	/**
	 * Returns the meta object for class '{@link tamm.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see tamm.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for the reference '{@link tamm.Split#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see tamm.Split#getIncoming()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link tamm.Split#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ongoing</em>'.
	 * @see tamm.Split#getOngoing()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Ongoing();

	/**
	 * Returns the meta object for class '{@link tamm.SimpleTask <em>Simple Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Task</em>'.
	 * @see tamm.SimpleTask
	 * @generated
	 */
	EClass getSimpleTask();

	/**
	 * Returns the meta object for the attribute '{@link tamm.SimpleTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tamm.SimpleTask#getName()
	 * @see #getSimpleTask()
	 * @generated
	 */
	EAttribute getSimpleTask_Name();

	/**
	 * Returns the meta object for class '{@link tamm.SkipTask <em>Skip Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skip Task</em>'.
	 * @see tamm.SkipTask
	 * @generated
	 */
	EClass getSkipTask();

	/**
	 * Returns the meta object for class '{@link tamm.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see tamm.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for class '{@link tamm.InputConditionToRouteTask <em>Input Condition To Route Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Condition To Route Task</em>'.
	 * @see tamm.InputConditionToRouteTask
	 * @generated
	 */
	EClass getInputConditionToRouteTask();

	/**
	 * Returns the meta object for the reference '{@link tamm.InputConditionToRouteTask#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see tamm.InputConditionToRouteTask#getSource()
	 * @see #getInputConditionToRouteTask()
	 * @generated
	 */
	EReference getInputConditionToRouteTask_Source();

	/**
	 * Returns the meta object for class '{@link tamm.RouteTaskToOutputCondition <em>Route Task To Output Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Task To Output Condition</em>'.
	 * @see tamm.RouteTaskToOutputCondition
	 * @generated
	 */
	EClass getRouteTaskToOutputCondition();

	/**
	 * Returns the meta object for the reference '{@link tamm.RouteTaskToOutputCondition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see tamm.RouteTaskToOutputCondition#getTarget()
	 * @see #getRouteTaskToOutputCondition()
	 * @generated
	 */
	EReference getRouteTaskToOutputCondition_Target();

	/**
	 * Returns the meta object for class '{@link tamm.PreConditionToSystemTask <em>Pre Condition To System Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Condition To System Task</em>'.
	 * @see tamm.PreConditionToSystemTask
	 * @generated
	 */
	EClass getPreConditionToSystemTask();

	/**
	 * Returns the meta object for the reference '{@link tamm.PreConditionToSystemTask#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see tamm.PreConditionToSystemTask#getSource()
	 * @see #getPreConditionToSystemTask()
	 * @generated
	 */
	EReference getPreConditionToSystemTask_Source();

	/**
	 * Returns the meta object for the reference '{@link tamm.PreConditionToSystemTask#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see tamm.PreConditionToSystemTask#getTarget()
	 * @see #getPreConditionToSystemTask()
	 * @generated
	 */
	EReference getPreConditionToSystemTask_Target();

	/**
	 * Returns the meta object for the container reference '{@link tamm.PreConditionToSystemTask#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.PreConditionToSystemTask#getSystem()
	 * @see #getPreConditionToSystemTask()
	 * @generated
	 */
	EReference getPreConditionToSystemTask_System();

	/**
	 * Returns the meta object for class '{@link tamm.SystemTaskToPostCondition <em>System Task To Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Task To Post Condition</em>'.
	 * @see tamm.SystemTaskToPostCondition
	 * @generated
	 */
	EClass getSystemTaskToPostCondition();

	/**
	 * Returns the meta object for the reference '{@link tamm.SystemTaskToPostCondition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see tamm.SystemTaskToPostCondition#getSource()
	 * @see #getSystemTaskToPostCondition()
	 * @generated
	 */
	EReference getSystemTaskToPostCondition_Source();

	/**
	 * Returns the meta object for the reference '{@link tamm.SystemTaskToPostCondition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see tamm.SystemTaskToPostCondition#getTarget()
	 * @see #getSystemTaskToPostCondition()
	 * @generated
	 */
	EReference getSystemTaskToPostCondition_Target();

	/**
	 * Returns the meta object for the container reference '{@link tamm.SystemTaskToPostCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.SystemTaskToPostCondition#getSystem()
	 * @see #getSystemTaskToPostCondition()
	 * @generated
	 */
	EReference getSystemTaskToPostCondition_System();

	/**
	 * Returns the meta object for class '{@link tamm.AndJoin <em>And Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Join</em>'.
	 * @see tamm.AndJoin
	 * @generated
	 */
	EClass getAndJoin();

	/**
	 * Returns the meta object for class '{@link tamm.OrJoin <em>Or Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Join</em>'.
	 * @see tamm.OrJoin
	 * @generated
	 */
	EClass getOrJoin();

	/**
	 * Returns the meta object for class '{@link tamm.AndSplit <em>And Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Split</em>'.
	 * @see tamm.AndSplit
	 * @generated
	 */
	EClass getAndSplit();

	/**
	 * Returns the meta object for class '{@link tamm.OrSplit <em>Or Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Split</em>'.
	 * @see tamm.OrSplit
	 * @generated
	 */
	EClass getOrSplit();

	/**
	 * Returns the meta object for class '{@link tamm.InputConditionToJoinTask <em>Input Condition To Join Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Condition To Join Task</em>'.
	 * @see tamm.InputConditionToJoinTask
	 * @generated
	 */
	EClass getInputConditionToJoinTask();

	/**
	 * Returns the meta object for the reference '{@link tamm.InputConditionToJoinTask#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see tamm.InputConditionToJoinTask#getTarget()
	 * @see #getInputConditionToJoinTask()
	 * @generated
	 */
	EReference getInputConditionToJoinTask_Target();

	/**
	 * Returns the meta object for the container reference '{@link tamm.InputConditionToJoinTask#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.InputConditionToJoinTask#getSystem()
	 * @see #getInputConditionToJoinTask()
	 * @generated
	 */
	EReference getInputConditionToJoinTask_System();

	/**
	 * Returns the meta object for class '{@link tamm.InputConditionToSplitTask <em>Input Condition To Split Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Condition To Split Task</em>'.
	 * @see tamm.InputConditionToSplitTask
	 * @generated
	 */
	EClass getInputConditionToSplitTask();

	/**
	 * Returns the meta object for the reference '{@link tamm.InputConditionToSplitTask#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see tamm.InputConditionToSplitTask#getTarget()
	 * @see #getInputConditionToSplitTask()
	 * @generated
	 */
	EReference getInputConditionToSplitTask_Target();

	/**
	 * Returns the meta object for the container reference '{@link tamm.InputConditionToSplitTask#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.InputConditionToSplitTask#getSystem()
	 * @see #getInputConditionToSplitTask()
	 * @generated
	 */
	EReference getInputConditionToSplitTask_System();

	/**
	 * Returns the meta object for class '{@link tamm.JoinTaskToOutputCondition <em>Join Task To Output Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Task To Output Condition</em>'.
	 * @see tamm.JoinTaskToOutputCondition
	 * @generated
	 */
	EClass getJoinTaskToOutputCondition();

	/**
	 * Returns the meta object for the reference '{@link tamm.JoinTaskToOutputCondition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see tamm.JoinTaskToOutputCondition#getSource()
	 * @see #getJoinTaskToOutputCondition()
	 * @generated
	 */
	EReference getJoinTaskToOutputCondition_Source();

	/**
	 * Returns the meta object for the container reference '{@link tamm.JoinTaskToOutputCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.JoinTaskToOutputCondition#getSystem()
	 * @see #getJoinTaskToOutputCondition()
	 * @generated
	 */
	EReference getJoinTaskToOutputCondition_System();

	/**
	 * Returns the meta object for class '{@link tamm.SplitTaskToOutputCondition <em>Split Task To Output Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Task To Output Condition</em>'.
	 * @see tamm.SplitTaskToOutputCondition
	 * @generated
	 */
	EClass getSplitTaskToOutputCondition();

	/**
	 * Returns the meta object for the reference '{@link tamm.SplitTaskToOutputCondition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see tamm.SplitTaskToOutputCondition#getSource()
	 * @see #getSplitTaskToOutputCondition()
	 * @generated
	 */
	EReference getSplitTaskToOutputCondition_Source();

	/**
	 * Returns the meta object for the container reference '{@link tamm.SplitTaskToOutputCondition#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see tamm.SplitTaskToOutputCondition#getSystem()
	 * @see #getSplitTaskToOutputCondition()
	 * @generated
	 */
	EReference getSplitTaskToOutputCondition_System();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TammFactory getTammFactory();

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
		 * The meta object literal for the '{@link tamm.impl.ContextAwareSystemImpl <em>Context Aware System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.ContextAwareSystemImpl
		 * @see tamm.impl.TammPackageImpl#getContextAwareSystem()
		 * @generated
		 */
		EClass CONTEXT_AWARE_SYSTEM = eINSTANCE.getContextAwareSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_AWARE_SYSTEM__NAME = eINSTANCE.getContextAwareSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Final Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS = eINSTANCE.getContextAwareSystem_FinalConditions();

		/**
		 * The meta object literal for the '<em><b>Pre Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS = eINSTANCE.getContextAwareSystem_PreConditions();

		/**
		 * The meta object literal for the '<em><b>Post Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__POST_CONDITIONS = eINSTANCE.getContextAwareSystem_PostConditions();

		/**
		 * The meta object literal for the '<em><b>Initial Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS = eINSTANCE.getContextAwareSystem_InitialConditions();

		/**
		 * The meta object literal for the '<em><b>Route Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__ROUTE_TASKS = eINSTANCE.getContextAwareSystem_RouteTasks();

		/**
		 * The meta object literal for the '<em><b>System Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS = eINSTANCE.getContextAwareSystem_SystemTasks();

		/**
		 * The meta object literal for the '<em><b>Input Condition To Join Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS = eINSTANCE.getContextAwareSystem_InputConditionToJoinTasks();

		/**
		 * The meta object literal for the '<em><b>Input Condition To Split Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS = eINSTANCE.getContextAwareSystem_InputConditionToSplitTasks();

		/**
		 * The meta object literal for the '<em><b>Join Task To Output Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS = eINSTANCE.getContextAwareSystem_JoinTaskToOutputConditions();

		/**
		 * The meta object literal for the '<em><b>Split Task To Output Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS = eINSTANCE.getContextAwareSystem_SplitTaskToOutputConditions();

		/**
		 * The meta object literal for the '<em><b>Pre Condition To System Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS = eINSTANCE.getContextAwareSystem_PreConditionToSystemTasks();

		/**
		 * The meta object literal for the '<em><b>System Task To Post Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS = eINSTANCE.getContextAwareSystem_SystemTaskToPostConditions();

		/**
		 * The meta object literal for the '{@link tamm.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.ConditionImpl
		 * @see tamm.impl.TammPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__ID = eINSTANCE.getCondition_Id();

		/**
		 * The meta object literal for the '<em><b>Social Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__SOCIAL_EXPRESSION = eINSTANCE.getCondition_SocialExpression();

		/**
		 * The meta object literal for the '<em><b>Space Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__SPACE_EXPRESSION = eINSTANCE.getCondition_SpaceExpression();

		/**
		 * The meta object literal for the '<em><b>Task Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__TASK_EXPRESSION = eINSTANCE.getCondition_TaskExpression();

		/**
		 * The meta object literal for the '<em><b>Logic Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__LOGIC_EXPRESSION = eINSTANCE.getCondition_LogicExpression();

		/**
		 * The meta object literal for the '<em><b>Data Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__DATA_EXPRESSION = eINSTANCE.getCondition_DataExpression();

		/**
		 * The meta object literal for the '{@link tamm.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.TaskImpl
		 * @see tamm.impl.TammPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '{@link tamm.impl.SystemTaskImpl <em>System Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.SystemTaskImpl
		 * @see tamm.impl.TammPackageImpl#getSystemTask()
		 * @generated
		 */
		EClass SYSTEM_TASK = eINSTANCE.getSystemTask();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TASK__SYSTEM = eINSTANCE.getSystemTask_System();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TASK__INCOMING = eINSTANCE.getSystemTask_Incoming();

		/**
		 * The meta object literal for the '<em><b>Ongoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TASK__ONGOING = eINSTANCE.getSystemTask_Ongoing();

		/**
		 * The meta object literal for the '{@link tamm.impl.RouteTaskImpl <em>Route Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.RouteTaskImpl
		 * @see tamm.impl.TammPackageImpl#getRouteTask()
		 * @generated
		 */
		EClass ROUTE_TASK = eINSTANCE.getRouteTask();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_TASK__SYSTEM = eINSTANCE.getRouteTask_System();

		/**
		 * The meta object literal for the '{@link tamm.impl.PreConditionImpl <em>Pre Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.PreConditionImpl
		 * @see tamm.impl.TammPackageImpl#getPreCondition()
		 * @generated
		 */
		EClass PRE_CONDITION = eINSTANCE.getPreCondition();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION__SYSTEM = eINSTANCE.getPreCondition_System();

		/**
		 * The meta object literal for the '<em><b>Ongoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION__ONGOING = eINSTANCE.getPreCondition_Ongoing();

		/**
		 * The meta object literal for the '{@link tamm.impl.PostConditionImpl <em>Post Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.PostConditionImpl
		 * @see tamm.impl.TammPackageImpl#getPostCondition()
		 * @generated
		 */
		EClass POST_CONDITION = eINSTANCE.getPostCondition();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_CONDITION__SYSTEM = eINSTANCE.getPostCondition_System();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_CONDITION__INCOMING = eINSTANCE.getPostCondition_Incoming();

		/**
		 * The meta object literal for the '{@link tamm.impl.TaskInputConditionImpl <em>Task Input Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.TaskInputConditionImpl
		 * @see tamm.impl.TammPackageImpl#getTaskInputCondition()
		 * @generated
		 */
		EClass TASK_INPUT_CONDITION = eINSTANCE.getTaskInputCondition();

		/**
		 * The meta object literal for the '<em><b>Ongoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_INPUT_CONDITION__ONGOING = eINSTANCE.getTaskInputCondition_Ongoing();

		/**
		 * The meta object literal for the '{@link tamm.impl.TaskOutputConditionImpl <em>Task Output Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.TaskOutputConditionImpl
		 * @see tamm.impl.TammPackageImpl#getTaskOutputCondition()
		 * @generated
		 */
		EClass TASK_OUTPUT_CONDITION = eINSTANCE.getTaskOutputCondition();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_OUTPUT_CONDITION__INCOMING = eINSTANCE.getTaskOutputCondition_Incoming();

		/**
		 * The meta object literal for the '{@link tamm.impl.InitialConditionImpl <em>Initial Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.InitialConditionImpl
		 * @see tamm.impl.TammPackageImpl#getInitialCondition()
		 * @generated
		 */
		EClass INITIAL_CONDITION = eINSTANCE.getInitialCondition();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_CONDITION__SYSTEM = eINSTANCE.getInitialCondition_System();

		/**
		 * The meta object literal for the '{@link tamm.impl.FinalConditionImpl <em>Final Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.FinalConditionImpl
		 * @see tamm.impl.TammPackageImpl#getFinalCondition()
		 * @generated
		 */
		EClass FINAL_CONDITION = eINSTANCE.getFinalCondition();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_CONDITION__SYSTEM = eINSTANCE.getFinalCondition_System();

		/**
		 * The meta object literal for the '{@link tamm.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.JoinImpl
		 * @see tamm.impl.TammPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__INCOMING = eINSTANCE.getJoin_Incoming();

		/**
		 * The meta object literal for the '<em><b>Ongoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__ONGOING = eINSTANCE.getJoin_Ongoing();

		/**
		 * The meta object literal for the '{@link tamm.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.SplitImpl
		 * @see tamm.impl.TammPackageImpl#getSplit()
		 * @generated
		 */
		EClass SPLIT = eINSTANCE.getSplit();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__INCOMING = eINSTANCE.getSplit_Incoming();

		/**
		 * The meta object literal for the '<em><b>Ongoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__ONGOING = eINSTANCE.getSplit_Ongoing();

		/**
		 * The meta object literal for the '{@link tamm.impl.SimpleTaskImpl <em>Simple Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.SimpleTaskImpl
		 * @see tamm.impl.TammPackageImpl#getSimpleTask()
		 * @generated
		 */
		EClass SIMPLE_TASK = eINSTANCE.getSimpleTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TASK__NAME = eINSTANCE.getSimpleTask_Name();

		/**
		 * The meta object literal for the '{@link tamm.impl.SkipTaskImpl <em>Skip Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.SkipTaskImpl
		 * @see tamm.impl.TammPackageImpl#getSkipTask()
		 * @generated
		 */
		EClass SKIP_TASK = eINSTANCE.getSkipTask();

		/**
		 * The meta object literal for the '{@link tamm.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.EdgeImpl
		 * @see tamm.impl.TammPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '{@link tamm.impl.InputConditionToRouteTaskImpl <em>Input Condition To Route Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.InputConditionToRouteTaskImpl
		 * @see tamm.impl.TammPackageImpl#getInputConditionToRouteTask()
		 * @generated
		 */
		EClass INPUT_CONDITION_TO_ROUTE_TASK = eINSTANCE.getInputConditionToRouteTask();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CONDITION_TO_ROUTE_TASK__SOURCE = eINSTANCE.getInputConditionToRouteTask_Source();

		/**
		 * The meta object literal for the '{@link tamm.impl.RouteTaskToOutputConditionImpl <em>Route Task To Output Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.RouteTaskToOutputConditionImpl
		 * @see tamm.impl.TammPackageImpl#getRouteTaskToOutputCondition()
		 * @generated
		 */
		EClass ROUTE_TASK_TO_OUTPUT_CONDITION = eINSTANCE.getRouteTaskToOutputCondition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_TASK_TO_OUTPUT_CONDITION__TARGET = eINSTANCE.getRouteTaskToOutputCondition_Target();

		/**
		 * The meta object literal for the '{@link tamm.impl.PreConditionToSystemTaskImpl <em>Pre Condition To System Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.PreConditionToSystemTaskImpl
		 * @see tamm.impl.TammPackageImpl#getPreConditionToSystemTask()
		 * @generated
		 */
		EClass PRE_CONDITION_TO_SYSTEM_TASK = eINSTANCE.getPreConditionToSystemTask();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION_TO_SYSTEM_TASK__SOURCE = eINSTANCE.getPreConditionToSystemTask_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION_TO_SYSTEM_TASK__TARGET = eINSTANCE.getPreConditionToSystemTask_Target();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM = eINSTANCE.getPreConditionToSystemTask_System();

		/**
		 * The meta object literal for the '{@link tamm.impl.SystemTaskToPostConditionImpl <em>System Task To Post Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.SystemTaskToPostConditionImpl
		 * @see tamm.impl.TammPackageImpl#getSystemTaskToPostCondition()
		 * @generated
		 */
		EClass SYSTEM_TASK_TO_POST_CONDITION = eINSTANCE.getSystemTaskToPostCondition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TASK_TO_POST_CONDITION__SOURCE = eINSTANCE.getSystemTaskToPostCondition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TASK_TO_POST_CONDITION__TARGET = eINSTANCE.getSystemTaskToPostCondition_Target();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TASK_TO_POST_CONDITION__SYSTEM = eINSTANCE.getSystemTaskToPostCondition_System();

		/**
		 * The meta object literal for the '{@link tamm.impl.AndJoinImpl <em>And Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.AndJoinImpl
		 * @see tamm.impl.TammPackageImpl#getAndJoin()
		 * @generated
		 */
		EClass AND_JOIN = eINSTANCE.getAndJoin();

		/**
		 * The meta object literal for the '{@link tamm.impl.OrJoinImpl <em>Or Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.OrJoinImpl
		 * @see tamm.impl.TammPackageImpl#getOrJoin()
		 * @generated
		 */
		EClass OR_JOIN = eINSTANCE.getOrJoin();

		/**
		 * The meta object literal for the '{@link tamm.impl.AndSplitImpl <em>And Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.AndSplitImpl
		 * @see tamm.impl.TammPackageImpl#getAndSplit()
		 * @generated
		 */
		EClass AND_SPLIT = eINSTANCE.getAndSplit();

		/**
		 * The meta object literal for the '{@link tamm.impl.OrSplitImpl <em>Or Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.OrSplitImpl
		 * @see tamm.impl.TammPackageImpl#getOrSplit()
		 * @generated
		 */
		EClass OR_SPLIT = eINSTANCE.getOrSplit();

		/**
		 * The meta object literal for the '{@link tamm.impl.InputConditionToJoinTaskImpl <em>Input Condition To Join Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.InputConditionToJoinTaskImpl
		 * @see tamm.impl.TammPackageImpl#getInputConditionToJoinTask()
		 * @generated
		 */
		EClass INPUT_CONDITION_TO_JOIN_TASK = eINSTANCE.getInputConditionToJoinTask();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CONDITION_TO_JOIN_TASK__TARGET = eINSTANCE.getInputConditionToJoinTask_Target();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CONDITION_TO_JOIN_TASK__SYSTEM = eINSTANCE.getInputConditionToJoinTask_System();

		/**
		 * The meta object literal for the '{@link tamm.impl.InputConditionToSplitTaskImpl <em>Input Condition To Split Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.InputConditionToSplitTaskImpl
		 * @see tamm.impl.TammPackageImpl#getInputConditionToSplitTask()
		 * @generated
		 */
		EClass INPUT_CONDITION_TO_SPLIT_TASK = eINSTANCE.getInputConditionToSplitTask();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CONDITION_TO_SPLIT_TASK__TARGET = eINSTANCE.getInputConditionToSplitTask_Target();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CONDITION_TO_SPLIT_TASK__SYSTEM = eINSTANCE.getInputConditionToSplitTask_System();

		/**
		 * The meta object literal for the '{@link tamm.impl.JoinTaskToOutputConditionImpl <em>Join Task To Output Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.JoinTaskToOutputConditionImpl
		 * @see tamm.impl.TammPackageImpl#getJoinTaskToOutputCondition()
		 * @generated
		 */
		EClass JOIN_TASK_TO_OUTPUT_CONDITION = eINSTANCE.getJoinTaskToOutputCondition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE = eINSTANCE.getJoinTaskToOutputCondition_Source();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM = eINSTANCE.getJoinTaskToOutputCondition_System();

		/**
		 * The meta object literal for the '{@link tamm.impl.SplitTaskToOutputConditionImpl <em>Split Task To Output Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tamm.impl.SplitTaskToOutputConditionImpl
		 * @see tamm.impl.TammPackageImpl#getSplitTaskToOutputCondition()
		 * @generated
		 */
		EClass SPLIT_TASK_TO_OUTPUT_CONDITION = eINSTANCE.getSplitTaskToOutputCondition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_TASK_TO_OUTPUT_CONDITION__SOURCE = eINSTANCE.getSplitTaskToOutputCondition_Source();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_TASK_TO_OUTPUT_CONDITION__SYSTEM = eINSTANCE.getSplitTaskToOutputCondition_System();

	}

} //TammPackage
