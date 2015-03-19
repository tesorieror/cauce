/**
 */
package tamm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tamm.ContextAwareSystem;
import tamm.FinalCondition;
import tamm.InitialCondition;
import tamm.InputConditionToJoinTask;
import tamm.InputConditionToSplitTask;
import tamm.JoinTaskToOutputCondition;
import tamm.PostCondition;
import tamm.PreCondition;
import tamm.PreConditionToSystemTask;
import tamm.RouteTask;
import tamm.SplitTaskToOutputCondition;
import tamm.SystemTask;
import tamm.SystemTaskToPostCondition;
import tamm.TammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Aware System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getFinalConditions <em>Final Conditions</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getInitialConditions <em>Initial Conditions</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getRouteTasks <em>Route Tasks</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getSystemTasks <em>System Tasks</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getInputConditionToJoinTasks <em>Input Condition To Join Tasks</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getInputConditionToSplitTasks <em>Input Condition To Split Tasks</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getJoinTaskToOutputConditions <em>Join Task To Output Conditions</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getSplitTaskToOutputConditions <em>Split Task To Output Conditions</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getPreConditionToSystemTasks <em>Pre Condition To System Tasks</em>}</li>
 *   <li>{@link tamm.impl.ContextAwareSystemImpl#getSystemTaskToPostConditions <em>System Task To Post Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextAwareSystemImpl extends MinimalEObjectImpl.Container implements ContextAwareSystem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "tamm-default";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFinalConditions() <em>Final Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<FinalCondition> finalConditions;

	/**
	 * The cached value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PreCondition> preConditions;

	/**
	 * The cached value of the '{@link #getPostConditions() <em>Post Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PostCondition> postConditions;

	/**
	 * The cached value of the '{@link #getInitialConditions() <em>Initial Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<InitialCondition> initialConditions;

	/**
	 * The cached value of the '{@link #getRouteTasks() <em>Route Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteTask> routeTasks;

	/**
	 * The cached value of the '{@link #getSystemTasks() <em>System Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemTask> systemTasks;

	/**
	 * The cached value of the '{@link #getInputConditionToJoinTasks() <em>Input Condition To Join Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConditionToJoinTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<InputConditionToJoinTask> inputConditionToJoinTasks;

	/**
	 * The cached value of the '{@link #getInputConditionToSplitTasks() <em>Input Condition To Split Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConditionToSplitTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<InputConditionToSplitTask> inputConditionToSplitTasks;

	/**
	 * The cached value of the '{@link #getJoinTaskToOutputConditions() <em>Join Task To Output Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinTaskToOutputConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinTaskToOutputCondition> joinTaskToOutputConditions;

	/**
	 * The cached value of the '{@link #getSplitTaskToOutputConditions() <em>Split Task To Output Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitTaskToOutputConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<SplitTaskToOutputCondition> splitTaskToOutputConditions;

	/**
	 * The cached value of the '{@link #getPreConditionToSystemTasks() <em>Pre Condition To System Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditionToSystemTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<PreConditionToSystemTask> preConditionToSystemTasks;

	/**
	 * The cached value of the '{@link #getSystemTaskToPostConditions() <em>System Task To Post Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemTaskToPostConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemTaskToPostCondition> systemTaskToPostConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextAwareSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.CONTEXT_AWARE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.CONTEXT_AWARE_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinalCondition> getFinalConditions() {
		if (finalConditions == null) {
			finalConditions = new EObjectContainmentWithInverseEList<FinalCondition>(FinalCondition.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS, TammPackage.FINAL_CONDITION__SYSTEM);
		}
		return finalConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreCondition> getPreConditions() {
		if (preConditions == null) {
			preConditions = new EObjectContainmentWithInverseEList<PreCondition>(PreCondition.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS, TammPackage.PRE_CONDITION__SYSTEM);
		}
		return preConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostCondition> getPostConditions() {
		if (postConditions == null) {
			postConditions = new EObjectContainmentWithInverseEList<PostCondition>(PostCondition.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS, TammPackage.POST_CONDITION__SYSTEM);
		}
		return postConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitialCondition> getInitialConditions() {
		if (initialConditions == null) {
			initialConditions = new EObjectContainmentWithInverseEList<InitialCondition>(InitialCondition.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS, TammPackage.INITIAL_CONDITION__SYSTEM);
		}
		return initialConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteTask> getRouteTasks() {
		if (routeTasks == null) {
			routeTasks = new EObjectContainmentWithInverseEList<RouteTask>(RouteTask.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS, TammPackage.ROUTE_TASK__SYSTEM);
		}
		return routeTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemTask> getSystemTasks() {
		if (systemTasks == null) {
			systemTasks = new EObjectContainmentWithInverseEList<SystemTask>(SystemTask.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS, TammPackage.SYSTEM_TASK__SYSTEM);
		}
		return systemTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputConditionToJoinTask> getInputConditionToJoinTasks() {
		if (inputConditionToJoinTasks == null) {
			inputConditionToJoinTasks = new EObjectContainmentWithInverseEList<InputConditionToJoinTask>(InputConditionToJoinTask.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS, TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM);
		}
		return inputConditionToJoinTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputConditionToSplitTask> getInputConditionToSplitTasks() {
		if (inputConditionToSplitTasks == null) {
			inputConditionToSplitTasks = new EObjectContainmentWithInverseEList<InputConditionToSplitTask>(InputConditionToSplitTask.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS, TammPackage.INPUT_CONDITION_TO_SPLIT_TASK__SYSTEM);
		}
		return inputConditionToSplitTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinTaskToOutputCondition> getJoinTaskToOutputConditions() {
		if (joinTaskToOutputConditions == null) {
			joinTaskToOutputConditions = new EObjectContainmentWithInverseEList<JoinTaskToOutputCondition>(JoinTaskToOutputCondition.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS, TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM);
		}
		return joinTaskToOutputConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SplitTaskToOutputCondition> getSplitTaskToOutputConditions() {
		if (splitTaskToOutputConditions == null) {
			splitTaskToOutputConditions = new EObjectContainmentWithInverseEList<SplitTaskToOutputCondition>(SplitTaskToOutputCondition.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS, TammPackage.SPLIT_TASK_TO_OUTPUT_CONDITION__SYSTEM);
		}
		return splitTaskToOutputConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreConditionToSystemTask> getPreConditionToSystemTasks() {
		if (preConditionToSystemTasks == null) {
			preConditionToSystemTasks = new EObjectContainmentWithInverseEList<PreConditionToSystemTask>(PreConditionToSystemTask.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM);
		}
		return preConditionToSystemTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemTaskToPostCondition> getSystemTaskToPostConditions() {
		if (systemTaskToPostConditions == null) {
			systemTaskToPostConditions = new EObjectContainmentWithInverseEList<SystemTaskToPostCondition>(SystemTaskToPostCondition.class, this, TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS, TammPackage.SYSTEM_TASK_TO_POST_CONDITION__SYSTEM);
		}
		return systemTaskToPostConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TammPackage.CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFinalConditions()).basicAdd(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPreConditions()).basicAdd(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPostConditions()).basicAdd(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInitialConditions()).basicAdd(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRouteTasks()).basicAdd(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSystemTasks()).basicAdd(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputConditionToJoinTasks()).basicAdd(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputConditionToSplitTasks()).basicAdd(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJoinTaskToOutputConditions()).basicAdd(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSplitTaskToOutputConditions()).basicAdd(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPreConditionToSystemTasks()).basicAdd(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSystemTaskToPostConditions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TammPackage.CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS:
				return ((InternalEList<?>)getFinalConditions()).basicRemove(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS:
				return ((InternalEList<?>)getPreConditions()).basicRemove(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS:
				return ((InternalEList<?>)getPostConditions()).basicRemove(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS:
				return ((InternalEList<?>)getInitialConditions()).basicRemove(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS:
				return ((InternalEList<?>)getRouteTasks()).basicRemove(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS:
				return ((InternalEList<?>)getSystemTasks()).basicRemove(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS:
				return ((InternalEList<?>)getInputConditionToJoinTasks()).basicRemove(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS:
				return ((InternalEList<?>)getInputConditionToSplitTasks()).basicRemove(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS:
				return ((InternalEList<?>)getJoinTaskToOutputConditions()).basicRemove(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS:
				return ((InternalEList<?>)getSplitTaskToOutputConditions()).basicRemove(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS:
				return ((InternalEList<?>)getPreConditionToSystemTasks()).basicRemove(otherEnd, msgs);
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS:
				return ((InternalEList<?>)getSystemTaskToPostConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TammPackage.CONTEXT_AWARE_SYSTEM__NAME:
				return getName();
			case TammPackage.CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS:
				return getFinalConditions();
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS:
				return getPreConditions();
			case TammPackage.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS:
				return getPostConditions();
			case TammPackage.CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS:
				return getInitialConditions();
			case TammPackage.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS:
				return getRouteTasks();
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS:
				return getSystemTasks();
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS:
				return getInputConditionToJoinTasks();
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS:
				return getInputConditionToSplitTasks();
			case TammPackage.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS:
				return getJoinTaskToOutputConditions();
			case TammPackage.CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS:
				return getSplitTaskToOutputConditions();
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS:
				return getPreConditionToSystemTasks();
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS:
				return getSystemTaskToPostConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TammPackage.CONTEXT_AWARE_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS:
				getFinalConditions().clear();
				getFinalConditions().addAll((Collection<? extends FinalCondition>)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS:
				getPreConditions().clear();
				getPreConditions().addAll((Collection<? extends PreCondition>)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS:
				getPostConditions().clear();
				getPostConditions().addAll((Collection<? extends PostCondition>)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS:
				getInitialConditions().clear();
				getInitialConditions().addAll((Collection<? extends InitialCondition>)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS:
				getRouteTasks().clear();
				getRouteTasks().addAll((Collection<? extends RouteTask>)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS:
				getSystemTasks().clear();
				getSystemTasks().addAll((Collection<? extends SystemTask>)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS:
				getInputConditionToJoinTasks().clear();
				getInputConditionToJoinTasks().addAll((Collection<? extends InputConditionToJoinTask>)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS:
				getInputConditionToSplitTasks().clear();
				getInputConditionToSplitTasks().addAll((Collection<? extends InputConditionToSplitTask>)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS:
				getJoinTaskToOutputConditions().clear();
				getJoinTaskToOutputConditions().addAll((Collection<? extends JoinTaskToOutputCondition>)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS:
				getSplitTaskToOutputConditions().clear();
				getSplitTaskToOutputConditions().addAll((Collection<? extends SplitTaskToOutputCondition>)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS:
				getPreConditionToSystemTasks().clear();
				getPreConditionToSystemTasks().addAll((Collection<? extends PreConditionToSystemTask>)newValue);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS:
				getSystemTaskToPostConditions().clear();
				getSystemTaskToPostConditions().addAll((Collection<? extends SystemTaskToPostCondition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TammPackage.CONTEXT_AWARE_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS:
				getFinalConditions().clear();
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS:
				getPreConditions().clear();
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS:
				getPostConditions().clear();
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS:
				getInitialConditions().clear();
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS:
				getRouteTasks().clear();
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS:
				getSystemTasks().clear();
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS:
				getInputConditionToJoinTasks().clear();
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS:
				getInputConditionToSplitTasks().clear();
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS:
				getJoinTaskToOutputConditions().clear();
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS:
				getSplitTaskToOutputConditions().clear();
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS:
				getPreConditionToSystemTasks().clear();
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS:
				getSystemTaskToPostConditions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TammPackage.CONTEXT_AWARE_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TammPackage.CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS:
				return finalConditions != null && !finalConditions.isEmpty();
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS:
				return preConditions != null && !preConditions.isEmpty();
			case TammPackage.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS:
				return postConditions != null && !postConditions.isEmpty();
			case TammPackage.CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS:
				return initialConditions != null && !initialConditions.isEmpty();
			case TammPackage.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS:
				return routeTasks != null && !routeTasks.isEmpty();
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS:
				return systemTasks != null && !systemTasks.isEmpty();
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS:
				return inputConditionToJoinTasks != null && !inputConditionToJoinTasks.isEmpty();
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS:
				return inputConditionToSplitTasks != null && !inputConditionToSplitTasks.isEmpty();
			case TammPackage.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS:
				return joinTaskToOutputConditions != null && !joinTaskToOutputConditions.isEmpty();
			case TammPackage.CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS:
				return splitTaskToOutputConditions != null && !splitTaskToOutputConditions.isEmpty();
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS:
				return preConditionToSystemTasks != null && !preConditionToSystemTasks.isEmpty();
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS:
				return systemTaskToPostConditions != null && !systemTaskToPostConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContextAwareSystemImpl
