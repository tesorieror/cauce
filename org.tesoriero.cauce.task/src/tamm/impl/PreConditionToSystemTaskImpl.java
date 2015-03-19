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
import tamm.PreCondition;
import tamm.PreConditionToSystemTask;
import tamm.SystemTask;
import tamm.TammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Condition To System Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.PreConditionToSystemTaskImpl#getSource <em>Source</em>}</li>
 *   <li>{@link tamm.impl.PreConditionToSystemTaskImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link tamm.impl.PreConditionToSystemTaskImpl#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreConditionToSystemTaskImpl extends EdgeImpl implements PreConditionToSystemTask {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PreCondition source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SystemTask target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreConditionToSystemTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.PRE_CONDITION_TO_SYSTEM_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreCondition getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (PreCondition)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreCondition basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(PreCondition newSource, NotificationChain msgs) {
		PreCondition oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(PreCondition newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, TammPackage.PRE_CONDITION__ONGOING, PreCondition.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, TammPackage.PRE_CONDITION__ONGOING, PreCondition.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTask getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SystemTask)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTask basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(SystemTask newTarget, NotificationChain msgs) {
		SystemTask oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SystemTask newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, TammPackage.SYSTEM_TASK__INCOMING, SystemTask.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, TammPackage.SYSTEM_TASK__INCOMING, SystemTask.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAwareSystem getSystem() {
		if (eContainerFeatureID() != TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM) return null;
		return (ContextAwareSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(ContextAwareSystem newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(ContextAwareSystem newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS, ContextAwareSystem.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, TammPackage.PRE_CONDITION__ONGOING, PreCondition.class, msgs);
				return basicSetSource((PreCondition)otherEnd, msgs);
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, TammPackage.SYSTEM_TASK__INCOMING, SystemTask.class, msgs);
				return basicSetTarget((SystemTask)otherEnd, msgs);
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM:
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
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE:
				return basicSetSource(null, msgs);
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET:
				return basicSetTarget(null, msgs);
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM:
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
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM:
				return eInternalContainer().eInverseRemove(this, TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS, ContextAwareSystem.class, msgs);
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
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM:
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
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE:
				setSource((PreCondition)newValue);
				return;
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET:
				setTarget((SystemTask)newValue);
				return;
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM:
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
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE:
				setSource((PreCondition)null);
				return;
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET:
				setTarget((SystemTask)null);
				return;
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM:
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
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE:
				return source != null;
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET:
				return target != null;
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SYSTEM:
				return getSystem() != null;
		}
		return super.eIsSet(featureID);
	}

} //PreConditionToSystemTaskImpl
