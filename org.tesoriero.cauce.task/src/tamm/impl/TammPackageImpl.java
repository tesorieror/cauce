/**
 */
package tamm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tamm.AndJoin;
import tamm.AndSplit;
import tamm.Condition;
import tamm.ContextAwareSystem;
import tamm.Edge;
import tamm.FinalCondition;
import tamm.InitialCondition;
import tamm.InputConditionToJoinTask;
import tamm.InputConditionToRouteTask;
import tamm.InputConditionToSplitTask;
import tamm.Join;
import tamm.JoinTaskToOutputCondition;
import tamm.OrJoin;
import tamm.OrSplit;
import tamm.PostCondition;
import tamm.PreCondition;
import tamm.PreConditionToSystemTask;
import tamm.RouteTask;
import tamm.RouteTaskToOutputCondition;
import tamm.SimpleTask;
import tamm.SkipTask;
import tamm.Split;
import tamm.SplitTaskToOutputCondition;
import tamm.SystemTask;
import tamm.SystemTaskToPostCondition;
import tamm.TammFactory;
import tamm.TammPackage;
import tamm.Task;
import tamm.TaskInputCondition;
import tamm.TaskOutputCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TammPackageImpl extends EPackageImpl implements TammPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextAwareSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskInputConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskOutputConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skipTaskEClass = null;

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
	private EClass inputConditionToRouteTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeTaskToOutputConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preConditionToSystemTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTaskToPostConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andSplitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orSplitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputConditionToJoinTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputConditionToSplitTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinTaskToOutputConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitTaskToOutputConditionEClass = null;

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
	 * @see tamm.TammPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TammPackageImpl() {
		super(eNS_URI, TammFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TammPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TammPackage init() {
		if (isInited) return (TammPackage)EPackage.Registry.INSTANCE.getEPackage(TammPackage.eNS_URI);

		// Obtain or create and register package
		TammPackageImpl theTammPackage = (TammPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TammPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TammPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTammPackage.createPackageContents();

		// Initialize created meta-data
		theTammPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTammPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TammPackage.eNS_URI, theTammPackage);
		return theTammPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextAwareSystem() {
		return contextAwareSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextAwareSystem_Name() {
		return (EAttribute)contextAwareSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_FinalConditions() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_PreConditions() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_PostConditions() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_InitialConditions() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_RouteTasks() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_SystemTasks() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_InputConditionToJoinTasks() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_InputConditionToSplitTasks() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_JoinTaskToOutputConditions() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_SplitTaskToOutputConditions() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_PreConditionToSystemTasks() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAwareSystem_SystemTaskToPostConditions() {
		return (EReference)contextAwareSystemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Id() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_SocialExpression() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_SpaceExpression() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_TaskExpression() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_LogicExpression() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_DataExpression() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Id() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemTask() {
		return systemTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTask_System() {
		return (EReference)systemTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTask_Incoming() {
		return (EReference)systemTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTask_Ongoing() {
		return (EReference)systemTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteTask() {
		return routeTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteTask_System() {
		return (EReference)routeTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreCondition() {
		return preConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreCondition_System() {
		return (EReference)preConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreCondition_Ongoing() {
		return (EReference)preConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostCondition() {
		return postConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostCondition_System() {
		return (EReference)postConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostCondition_Incoming() {
		return (EReference)postConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskInputCondition() {
		return taskInputConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskInputCondition_Ongoing() {
		return (EReference)taskInputConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskOutputCondition() {
		return taskOutputConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskOutputCondition_Incoming() {
		return (EReference)taskOutputConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialCondition() {
		return initialConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialCondition_System() {
		return (EReference)initialConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalCondition() {
		return finalConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalCondition_System() {
		return (EReference)finalConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_Incoming() {
		return (EReference)joinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_Ongoing() {
		return (EReference)joinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplit() {
		return splitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplit_Incoming() {
		return (EReference)splitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplit_Ongoing() {
		return (EReference)splitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTask() {
		return simpleTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTask_Name() {
		return (EAttribute)simpleTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkipTask() {
		return skipTaskEClass;
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
	public EClass getInputConditionToRouteTask() {
		return inputConditionToRouteTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputConditionToRouteTask_Source() {
		return (EReference)inputConditionToRouteTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteTaskToOutputCondition() {
		return routeTaskToOutputConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteTaskToOutputCondition_Target() {
		return (EReference)routeTaskToOutputConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreConditionToSystemTask() {
		return preConditionToSystemTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreConditionToSystemTask_Source() {
		return (EReference)preConditionToSystemTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreConditionToSystemTask_Target() {
		return (EReference)preConditionToSystemTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreConditionToSystemTask_System() {
		return (EReference)preConditionToSystemTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemTaskToPostCondition() {
		return systemTaskToPostConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTaskToPostCondition_Source() {
		return (EReference)systemTaskToPostConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTaskToPostCondition_Target() {
		return (EReference)systemTaskToPostConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTaskToPostCondition_System() {
		return (EReference)systemTaskToPostConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndJoin() {
		return andJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrJoin() {
		return orJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndSplit() {
		return andSplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrSplit() {
		return orSplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputConditionToJoinTask() {
		return inputConditionToJoinTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputConditionToJoinTask_Target() {
		return (EReference)inputConditionToJoinTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputConditionToJoinTask_System() {
		return (EReference)inputConditionToJoinTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputConditionToSplitTask() {
		return inputConditionToSplitTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputConditionToSplitTask_Target() {
		return (EReference)inputConditionToSplitTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputConditionToSplitTask_System() {
		return (EReference)inputConditionToSplitTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinTaskToOutputCondition() {
		return joinTaskToOutputConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinTaskToOutputCondition_Source() {
		return (EReference)joinTaskToOutputConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinTaskToOutputCondition_System() {
		return (EReference)joinTaskToOutputConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitTaskToOutputCondition() {
		return splitTaskToOutputConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitTaskToOutputCondition_Source() {
		return (EReference)splitTaskToOutputConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitTaskToOutputCondition_System() {
		return (EReference)splitTaskToOutputConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TammFactory getTammFactory() {
		return (TammFactory)getEFactoryInstance();
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
		contextAwareSystemEClass = createEClass(CONTEXT_AWARE_SYSTEM);
		createEAttribute(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__NAME);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__POST_CONDITIONS);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__ROUTE_TASKS);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS);
		createEReference(contextAwareSystemEClass, CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__ID);
		createEAttribute(conditionEClass, CONDITION__SOCIAL_EXPRESSION);
		createEAttribute(conditionEClass, CONDITION__SPACE_EXPRESSION);
		createEAttribute(conditionEClass, CONDITION__TASK_EXPRESSION);
		createEAttribute(conditionEClass, CONDITION__LOGIC_EXPRESSION);
		createEAttribute(conditionEClass, CONDITION__DATA_EXPRESSION);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__ID);

		systemTaskEClass = createEClass(SYSTEM_TASK);
		createEReference(systemTaskEClass, SYSTEM_TASK__SYSTEM);
		createEReference(systemTaskEClass, SYSTEM_TASK__INCOMING);
		createEReference(systemTaskEClass, SYSTEM_TASK__ONGOING);

		routeTaskEClass = createEClass(ROUTE_TASK);
		createEReference(routeTaskEClass, ROUTE_TASK__SYSTEM);

		preConditionEClass = createEClass(PRE_CONDITION);
		createEReference(preConditionEClass, PRE_CONDITION__SYSTEM);
		createEReference(preConditionEClass, PRE_CONDITION__ONGOING);

		postConditionEClass = createEClass(POST_CONDITION);
		createEReference(postConditionEClass, POST_CONDITION__SYSTEM);
		createEReference(postConditionEClass, POST_CONDITION__INCOMING);

		taskInputConditionEClass = createEClass(TASK_INPUT_CONDITION);
		createEReference(taskInputConditionEClass, TASK_INPUT_CONDITION__ONGOING);

		taskOutputConditionEClass = createEClass(TASK_OUTPUT_CONDITION);
		createEReference(taskOutputConditionEClass, TASK_OUTPUT_CONDITION__INCOMING);

		initialConditionEClass = createEClass(INITIAL_CONDITION);
		createEReference(initialConditionEClass, INITIAL_CONDITION__SYSTEM);

		finalConditionEClass = createEClass(FINAL_CONDITION);
		createEReference(finalConditionEClass, FINAL_CONDITION__SYSTEM);

		joinEClass = createEClass(JOIN);
		createEReference(joinEClass, JOIN__INCOMING);
		createEReference(joinEClass, JOIN__ONGOING);

		splitEClass = createEClass(SPLIT);
		createEReference(splitEClass, SPLIT__INCOMING);
		createEReference(splitEClass, SPLIT__ONGOING);

		simpleTaskEClass = createEClass(SIMPLE_TASK);
		createEAttribute(simpleTaskEClass, SIMPLE_TASK__NAME);

		skipTaskEClass = createEClass(SKIP_TASK);

		edgeEClass = createEClass(EDGE);

		inputConditionToRouteTaskEClass = createEClass(INPUT_CONDITION_TO_ROUTE_TASK);
		createEReference(inputConditionToRouteTaskEClass, INPUT_CONDITION_TO_ROUTE_TASK__SOURCE);

		routeTaskToOutputConditionEClass = createEClass(ROUTE_TASK_TO_OUTPUT_CONDITION);
		createEReference(routeTaskToOutputConditionEClass, ROUTE_TASK_TO_OUTPUT_CONDITION__TARGET);

		preConditionToSystemTaskEClass = createEClass(PRE_CONDITION_TO_SYSTEM_TASK);
		createEReference(preConditionToSystemTaskEClass, PRE_CONDITION_TO_SYSTEM_TASK__SOURCE);
		createEReference(preConditionToSystemTaskEClass, PRE_CONDITION_TO_SYSTEM_TASK__TARGET);
		createEReference(preConditionToSystemTaskEClass, PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM);

		systemTaskToPostConditionEClass = createEClass(SYSTEM_TASK_TO_POST_CONDITION);
		createEReference(systemTaskToPostConditionEClass, SYSTEM_TASK_TO_POST_CONDITION__SOURCE);
		createEReference(systemTaskToPostConditionEClass, SYSTEM_TASK_TO_POST_CONDITION__TARGET);
		createEReference(systemTaskToPostConditionEClass, SYSTEM_TASK_TO_POST_CONDITION__SYSTEM);

		andJoinEClass = createEClass(AND_JOIN);

		orJoinEClass = createEClass(OR_JOIN);

		andSplitEClass = createEClass(AND_SPLIT);

		orSplitEClass = createEClass(OR_SPLIT);

		inputConditionToJoinTaskEClass = createEClass(INPUT_CONDITION_TO_JOIN_TASK);
		createEReference(inputConditionToJoinTaskEClass, INPUT_CONDITION_TO_JOIN_TASK__TARGET);
		createEReference(inputConditionToJoinTaskEClass, INPUT_CONDITION_TO_JOIN_TASK__SYSTEM);

		inputConditionToSplitTaskEClass = createEClass(INPUT_CONDITION_TO_SPLIT_TASK);
		createEReference(inputConditionToSplitTaskEClass, INPUT_CONDITION_TO_SPLIT_TASK__TARGET);
		createEReference(inputConditionToSplitTaskEClass, INPUT_CONDITION_TO_SPLIT_TASK__SYSTEM);

		joinTaskToOutputConditionEClass = createEClass(JOIN_TASK_TO_OUTPUT_CONDITION);
		createEReference(joinTaskToOutputConditionEClass, JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE);
		createEReference(joinTaskToOutputConditionEClass, JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM);

		splitTaskToOutputConditionEClass = createEClass(SPLIT_TASK_TO_OUTPUT_CONDITION);
		createEReference(splitTaskToOutputConditionEClass, SPLIT_TASK_TO_OUTPUT_CONDITION__SOURCE);
		createEReference(splitTaskToOutputConditionEClass, SPLIT_TASK_TO_OUTPUT_CONDITION__SYSTEM);
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
		systemTaskEClass.getESuperTypes().add(this.getTask());
		routeTaskEClass.getESuperTypes().add(this.getTask());
		preConditionEClass.getESuperTypes().add(this.getTaskOutputCondition());
		postConditionEClass.getESuperTypes().add(this.getTaskInputCondition());
		taskInputConditionEClass.getESuperTypes().add(this.getCondition());
		taskOutputConditionEClass.getESuperTypes().add(this.getCondition());
		initialConditionEClass.getESuperTypes().add(this.getTaskInputCondition());
		finalConditionEClass.getESuperTypes().add(this.getTaskOutputCondition());
		joinEClass.getESuperTypes().add(this.getRouteTask());
		splitEClass.getESuperTypes().add(this.getRouteTask());
		simpleTaskEClass.getESuperTypes().add(this.getSystemTask());
		skipTaskEClass.getESuperTypes().add(this.getSystemTask());
		inputConditionToRouteTaskEClass.getESuperTypes().add(this.getEdge());
		routeTaskToOutputConditionEClass.getESuperTypes().add(this.getEdge());
		preConditionToSystemTaskEClass.getESuperTypes().add(this.getEdge());
		systemTaskToPostConditionEClass.getESuperTypes().add(this.getEdge());
		andJoinEClass.getESuperTypes().add(this.getJoin());
		orJoinEClass.getESuperTypes().add(this.getJoin());
		andSplitEClass.getESuperTypes().add(this.getSplit());
		orSplitEClass.getESuperTypes().add(this.getSplit());
		inputConditionToJoinTaskEClass.getESuperTypes().add(this.getInputConditionToRouteTask());
		inputConditionToSplitTaskEClass.getESuperTypes().add(this.getInputConditionToRouteTask());
		joinTaskToOutputConditionEClass.getESuperTypes().add(this.getRouteTaskToOutputCondition());
		splitTaskToOutputConditionEClass.getESuperTypes().add(this.getRouteTaskToOutputCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(contextAwareSystemEClass, ContextAwareSystem.class, "ContextAwareSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextAwareSystem_Name(), ecorePackage.getEString(), "name", "tamm-default", 0, 1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_FinalConditions(), this.getFinalCondition(), this.getFinalCondition_System(), "finalConditions", null, 0, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_PreConditions(), this.getPreCondition(), this.getPreCondition_System(), "preConditions", null, 0, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_PostConditions(), this.getPostCondition(), this.getPostCondition_System(), "postConditions", null, 0, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_InitialConditions(), this.getInitialCondition(), this.getInitialCondition_System(), "initialConditions", null, 1, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_RouteTasks(), this.getRouteTask(), this.getRouteTask_System(), "routeTasks", null, 0, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_SystemTasks(), this.getSystemTask(), this.getSystemTask_System(), "systemTasks", null, 0, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_InputConditionToJoinTasks(), this.getInputConditionToJoinTask(), this.getInputConditionToJoinTask_System(), "inputConditionToJoinTasks", null, 0, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_InputConditionToSplitTasks(), this.getInputConditionToSplitTask(), this.getInputConditionToSplitTask_System(), "inputConditionToSplitTasks", null, 0, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_JoinTaskToOutputConditions(), this.getJoinTaskToOutputCondition(), this.getJoinTaskToOutputCondition_System(), "joinTaskToOutputConditions", null, 0, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_SplitTaskToOutputConditions(), this.getSplitTaskToOutputCondition(), this.getSplitTaskToOutputCondition_System(), "splitTaskToOutputConditions", null, 0, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_PreConditionToSystemTasks(), this.getPreConditionToSystemTask(), this.getPreConditionToSystemTask_System(), "preConditionToSystemTasks", null, 0, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextAwareSystem_SystemTaskToPostConditions(), this.getSystemTaskToPostCondition(), this.getSystemTaskToPostCondition_System(), "systemTaskToPostConditions", null, 0, -1, ContextAwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_SocialExpression(), ecorePackage.getEString(), "socialExpression", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_SpaceExpression(), ecorePackage.getEString(), "spaceExpression", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_TaskExpression(), ecorePackage.getEString(), "taskExpression", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_LogicExpression(), ecorePackage.getEString(), "logicExpression", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_DataExpression(), ecorePackage.getEString(), "dataExpression", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemTaskEClass, SystemTask.class, "SystemTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemTask_System(), this.getContextAwareSystem(), this.getContextAwareSystem_SystemTasks(), "system", null, 1, 1, SystemTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemTask_Incoming(), this.getPreConditionToSystemTask(), this.getPreConditionToSystemTask_Target(), "incoming", null, 1, 1, SystemTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemTask_Ongoing(), this.getSystemTaskToPostCondition(), this.getSystemTaskToPostCondition_Source(), "ongoing", null, 1, 1, SystemTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeTaskEClass, RouteTask.class, "RouteTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouteTask_System(), this.getContextAwareSystem(), this.getContextAwareSystem_RouteTasks(), "system", null, 1, 1, RouteTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preConditionEClass, PreCondition.class, "PreCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreCondition_System(), this.getContextAwareSystem(), this.getContextAwareSystem_PreConditions(), "system", null, 1, 1, PreCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreCondition_Ongoing(), this.getPreConditionToSystemTask(), this.getPreConditionToSystemTask_Source(), "ongoing", null, 1, 1, PreCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postConditionEClass, PostCondition.class, "PostCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPostCondition_System(), this.getContextAwareSystem(), this.getContextAwareSystem_PostConditions(), "system", null, 1, 1, PostCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostCondition_Incoming(), this.getSystemTaskToPostCondition(), this.getSystemTaskToPostCondition_Target(), "incoming", null, 1, 1, PostCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskInputConditionEClass, TaskInputCondition.class, "TaskInputCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskInputCondition_Ongoing(), this.getInputConditionToRouteTask(), this.getInputConditionToRouteTask_Source(), "ongoing", null, 1, 1, TaskInputCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskOutputConditionEClass, TaskOutputCondition.class, "TaskOutputCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskOutputCondition_Incoming(), this.getRouteTaskToOutputCondition(), this.getRouteTaskToOutputCondition_Target(), "incoming", null, 1, 1, TaskOutputCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialConditionEClass, InitialCondition.class, "InitialCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialCondition_System(), this.getContextAwareSystem(), this.getContextAwareSystem_InitialConditions(), "system", null, 1, 1, InitialCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalConditionEClass, FinalCondition.class, "FinalCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalCondition_System(), this.getContextAwareSystem(), this.getContextAwareSystem_FinalConditions(), "system", null, 1, 1, FinalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoin_Incoming(), this.getInputConditionToJoinTask(), this.getInputConditionToJoinTask_Target(), "incoming", null, 1, -1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoin_Ongoing(), this.getJoinTaskToOutputCondition(), this.getJoinTaskToOutputCondition_Source(), "ongoing", null, 1, 1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitEClass, Split.class, "Split", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplit_Incoming(), this.getInputConditionToSplitTask(), this.getInputConditionToSplitTask_Target(), "incoming", null, 1, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSplit_Ongoing(), this.getSplitTaskToOutputCondition(), this.getSplitTaskToOutputCondition_Source(), "ongoing", null, 1, -1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTaskEClass, SimpleTask.class, "SimpleTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skipTaskEClass, SkipTask.class, "SkipTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputConditionToRouteTaskEClass, InputConditionToRouteTask.class, "InputConditionToRouteTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputConditionToRouteTask_Source(), this.getTaskInputCondition(), this.getTaskInputCondition_Ongoing(), "source", null, 1, 1, InputConditionToRouteTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeTaskToOutputConditionEClass, RouteTaskToOutputCondition.class, "RouteTaskToOutputCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouteTaskToOutputCondition_Target(), this.getTaskOutputCondition(), this.getTaskOutputCondition_Incoming(), "target", null, 1, 1, RouteTaskToOutputCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preConditionToSystemTaskEClass, PreConditionToSystemTask.class, "PreConditionToSystemTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreConditionToSystemTask_Source(), this.getPreCondition(), this.getPreCondition_Ongoing(), "source", null, 1, 1, PreConditionToSystemTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreConditionToSystemTask_Target(), this.getSystemTask(), this.getSystemTask_Incoming(), "target", null, 1, 1, PreConditionToSystemTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreConditionToSystemTask_System(), this.getContextAwareSystem(), this.getContextAwareSystem_PreConditionToSystemTasks(), "system", null, 1, 1, PreConditionToSystemTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemTaskToPostConditionEClass, SystemTaskToPostCondition.class, "SystemTaskToPostCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemTaskToPostCondition_Source(), this.getSystemTask(), this.getSystemTask_Ongoing(), "source", null, 1, 1, SystemTaskToPostCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemTaskToPostCondition_Target(), this.getPostCondition(), this.getPostCondition_Incoming(), "target", null, 1, 1, SystemTaskToPostCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemTaskToPostCondition_System(), this.getContextAwareSystem(), this.getContextAwareSystem_SystemTaskToPostConditions(), "system", null, 1, 1, SystemTaskToPostCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andJoinEClass, AndJoin.class, "AndJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orJoinEClass, OrJoin.class, "OrJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andSplitEClass, AndSplit.class, "AndSplit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orSplitEClass, OrSplit.class, "OrSplit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputConditionToJoinTaskEClass, InputConditionToJoinTask.class, "InputConditionToJoinTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputConditionToJoinTask_Target(), this.getJoin(), this.getJoin_Incoming(), "target", null, 1, 1, InputConditionToJoinTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputConditionToJoinTask_System(), this.getContextAwareSystem(), this.getContextAwareSystem_InputConditionToJoinTasks(), "system", null, 1, 1, InputConditionToJoinTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputConditionToSplitTaskEClass, InputConditionToSplitTask.class, "InputConditionToSplitTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputConditionToSplitTask_Target(), this.getSplit(), this.getSplit_Incoming(), "target", null, 1, 1, InputConditionToSplitTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputConditionToSplitTask_System(), this.getContextAwareSystem(), this.getContextAwareSystem_InputConditionToSplitTasks(), "system", null, 1, 1, InputConditionToSplitTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinTaskToOutputConditionEClass, JoinTaskToOutputCondition.class, "JoinTaskToOutputCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinTaskToOutputCondition_Source(), this.getJoin(), this.getJoin_Ongoing(), "source", null, 1, 1, JoinTaskToOutputCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinTaskToOutputCondition_System(), this.getContextAwareSystem(), this.getContextAwareSystem_JoinTaskToOutputConditions(), "system", null, 1, 1, JoinTaskToOutputCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitTaskToOutputConditionEClass, SplitTaskToOutputCondition.class, "SplitTaskToOutputCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplitTaskToOutputCondition_Source(), this.getSplit(), this.getSplit_Ongoing(), "source", null, 1, 1, SplitTaskToOutputCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSplitTaskToOutputCondition_System(), this.getContextAwareSystem(), this.getContextAwareSystem_SplitTaskToOutputConditions(), "system", null, 1, 1, SplitTaskToOutputCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TammPackageImpl
