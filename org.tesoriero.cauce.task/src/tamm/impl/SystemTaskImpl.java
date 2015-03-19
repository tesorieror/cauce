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
import tamm.PreConditionToSystemTask;
import tamm.SystemTask;
import tamm.SystemTaskToPostCondition;
import tamm.TammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.SystemTaskImpl#getSystem <em>System</em>}</li>
 *   <li>{@link tamm.impl.SystemTaskImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link tamm.impl.SystemTaskImpl#getOngoing <em>Ongoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SystemTaskImpl extends TaskImpl implements SystemTask {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected PreConditionToSystemTask incoming;

	/**
	 * The cached value of the '{@link #getOngoing() <em>Ongoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoing()
	 * @generated
	 * @ordered
	 */
	protected SystemTaskToPostCondition ongoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.SYSTEM_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAwareSystem getSystem() {
		if (eContainerFeatureID() != TammPackage.SYSTEM_TASK__SYSTEM) return null;
		return (ContextAwareSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(ContextAwareSystem newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, TammPackage.SYSTEM_TASK__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(ContextAwareSystem newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != TammPackage.SYSTEM_TASK__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS, ContextAwareSystem.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.SYSTEM_TASK__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreConditionToSystemTask getIncoming() {
		if (incoming != null && incoming.eIsProxy()) {
			InternalEObject oldIncoming = (InternalEObject)incoming;
			incoming = (PreConditionToSystemTask)eResolveProxy(oldIncoming);
			if (incoming != oldIncoming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.SYSTEM_TASK__INCOMING, oldIncoming, incoming));
			}
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreConditionToSystemTask basicGetIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncoming(PreConditionToSystemTask newIncoming, NotificationChain msgs) {
		PreConditionToSystemTask oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.SYSTEM_TASK__INCOMING, oldIncoming, newIncoming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(PreConditionToSystemTask newIncoming) {
		if (newIncoming != incoming) {
			NotificationChain msgs = null;
			if (incoming != null)
				msgs = ((InternalEObject)incoming).eInverseRemove(this, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET, PreConditionToSystemTask.class, msgs);
			if (newIncoming != null)
				msgs = ((InternalEObject)newIncoming).eInverseAdd(this, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET, PreConditionToSystemTask.class, msgs);
			msgs = basicSetIncoming(newIncoming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.SYSTEM_TASK__INCOMING, newIncoming, newIncoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTaskToPostCondition getOngoing() {
		if (ongoing != null && ongoing.eIsProxy()) {
			InternalEObject oldOngoing = (InternalEObject)ongoing;
			ongoing = (SystemTaskToPostCondition)eResolveProxy(oldOngoing);
			if (ongoing != oldOngoing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.SYSTEM_TASK__ONGOING, oldOngoing, ongoing));
			}
		}
		return ongoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTaskToPostCondition basicGetOngoing() {
		return ongoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOngoing(SystemTaskToPostCondition newOngoing, NotificationChain msgs) {
		SystemTaskToPostCondition oldOngoing = ongoing;
		ongoing = newOngoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.SYSTEM_TASK__ONGOING, oldOngoing, newOngoing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOngoing(SystemTaskToPostCondition newOngoing) {
		if (newOngoing != ongoing) {
			NotificationChain msgs = null;
			if (ongoing != null)
				msgs = ((InternalEObject)ongoing).eInverseRemove(this, TammPackage.SYSTEM_TASK_TO_POST_CONDITION__SOURCE, SystemTaskToPostCondition.class, msgs);
			if (newOngoing != null)
				msgs = ((InternalEObject)newOngoing).eInverseAdd(this, TammPackage.SYSTEM_TASK_TO_POST_CONDITION__SOURCE, SystemTaskToPostCondition.class, msgs);
			msgs = basicSetOngoing(newOngoing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.SYSTEM_TASK__ONGOING, newOngoing, newOngoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TammPackage.SYSTEM_TASK__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((ContextAwareSystem)otherEnd, msgs);
			case TammPackage.SYSTEM_TASK__INCOMING:
				if (incoming != null)
					msgs = ((InternalEObject)incoming).eInverseRemove(this, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__TARGET, PreConditionToSystemTask.class, msgs);
				return basicSetIncoming((PreConditionToSystemTask)otherEnd, msgs);
			case TammPackage.SYSTEM_TASK__ONGOING:
				if (ongoing != null)
					msgs = ((InternalEObject)ongoing).eInverseRemove(this, TammPackage.SYSTEM_TASK_TO_POST_CONDITION__SOURCE, SystemTaskToPostCondition.class, msgs);
				return basicSetOngoing((SystemTaskToPostCondition)otherEnd, msgs);
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
			case TammPackage.SYSTEM_TASK__SYSTEM:
				return basicSetSystem(null, msgs);
			case TammPackage.SYSTEM_TASK__INCOMING:
				return basicSetIncoming(null, msgs);
			case TammPackage.SYSTEM_TASK__ONGOING:
				return basicSetOngoing(null, msgs);
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
			case TammPackage.SYSTEM_TASK__SYSTEM:
				return eInternalContainer().eInverseRemove(this, TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS, ContextAwareSystem.class, msgs);
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
			case TammPackage.SYSTEM_TASK__SYSTEM:
				return getSystem();
			case TammPackage.SYSTEM_TASK__INCOMING:
				if (resolve) return getIncoming();
				return basicGetIncoming();
			case TammPackage.SYSTEM_TASK__ONGOING:
				if (resolve) return getOngoing();
				return basicGetOngoing();
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
			case TammPackage.SYSTEM_TASK__SYSTEM:
				setSystem((ContextAwareSystem)newValue);
				return;
			case TammPackage.SYSTEM_TASK__INCOMING:
				setIncoming((PreConditionToSystemTask)newValue);
				return;
			case TammPackage.SYSTEM_TASK__ONGOING:
				setOngoing((SystemTaskToPostCondition)newValue);
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
			case TammPackage.SYSTEM_TASK__SYSTEM:
				setSystem((ContextAwareSystem)null);
				return;
			case TammPackage.SYSTEM_TASK__INCOMING:
				setIncoming((PreConditionToSystemTask)null);
				return;
			case TammPackage.SYSTEM_TASK__ONGOING:
				setOngoing((SystemTaskToPostCondition)null);
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
			case TammPackage.SYSTEM_TASK__SYSTEM:
				return getSystem() != null;
			case TammPackage.SYSTEM_TASK__INCOMING:
				return incoming != null;
			case TammPackage.SYSTEM_TASK__ONGOING:
				return ongoing != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemTaskImpl
