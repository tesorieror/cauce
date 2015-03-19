/**
 */
package tamm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tamm.ContextAwareSystem;
import tamm.InputConditionToJoinTask;
import tamm.Join;
import tamm.TammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Condition To Join Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.InputConditionToJoinTaskImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link tamm.impl.InputConditionToJoinTaskImpl#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputConditionToJoinTaskImpl extends InputConditionToRouteTaskImpl implements InputConditionToJoinTask {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Join target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputConditionToJoinTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.INPUT_CONDITION_TO_JOIN_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Join)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.INPUT_CONDITION_TO_JOIN_TASK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Join newTarget, NotificationChain msgs) {
		Join oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.INPUT_CONDITION_TO_JOIN_TASK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Join newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, TammPackage.JOIN__INCOMING, Join.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, TammPackage.JOIN__INCOMING, Join.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.INPUT_CONDITION_TO_JOIN_TASK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAwareSystem getSystem() {
		if (eContainerFeatureID() != TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM) return null;
		return (ContextAwareSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(ContextAwareSystem newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(ContextAwareSystem newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS, ContextAwareSystem.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, TammPackage.JOIN__INCOMING, Join.class, msgs);
				return basicSetTarget((Join)otherEnd, msgs);
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((ContextAwareSystem)otherEnd, msgs);
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
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__TARGET:
				return basicSetTarget(null, msgs);
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM:
				return basicSetSystem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM:
				return eInternalContainer().eInverseRemove(this, TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS, ContextAwareSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM:
				return getSystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__TARGET:
				setTarget((Join)newValue);
				return;
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM:
				setSystem((ContextAwareSystem)newValue);
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
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__TARGET:
				setTarget((Join)null);
				return;
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM:
				setSystem((ContextAwareSystem)null);
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
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__TARGET:
				return target != null;
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK__SYSTEM:
				return getSystem() != null;
		}
		return super.eIsSet(featureID);
	}

} //InputConditionToJoinTaskImpl
