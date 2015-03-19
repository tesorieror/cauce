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
import tamm.TammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.PreConditionImpl#getSystem <em>System</em>}</li>
 *   <li>{@link tamm.impl.PreConditionImpl#getOngoing <em>Ongoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreConditionImpl extends TaskOutputConditionImpl implements PreCondition {
	/**
	 * The cached value of the '{@link #getOngoing() <em>Ongoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoing()
	 * @generated
	 * @ordered
	 */
	protected PreConditionToSystemTask ongoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.PRE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAwareSystem getSystem() {
		if (eContainerFeatureID() != TammPackage.PRE_CONDITION__SYSTEM) return null;
		return (ContextAwareSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(ContextAwareSystem newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, TammPackage.PRE_CONDITION__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(ContextAwareSystem newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != TammPackage.PRE_CONDITION__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS, ContextAwareSystem.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.PRE_CONDITION__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreConditionToSystemTask getOngoing() {
		if (ongoing != null && ongoing.eIsProxy()) {
			InternalEObject oldOngoing = (InternalEObject)ongoing;
			ongoing = (PreConditionToSystemTask)eResolveProxy(oldOngoing);
			if (ongoing != oldOngoing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.PRE_CONDITION__ONGOING, oldOngoing, ongoing));
			}
		}
		return ongoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreConditionToSystemTask basicGetOngoing() {
		return ongoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOngoing(PreConditionToSystemTask newOngoing, NotificationChain msgs) {
		PreConditionToSystemTask oldOngoing = ongoing;
		ongoing = newOngoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.PRE_CONDITION__ONGOING, oldOngoing, newOngoing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOngoing(PreConditionToSystemTask newOngoing) {
		if (newOngoing != ongoing) {
			NotificationChain msgs = null;
			if (ongoing != null)
				msgs = ((InternalEObject)ongoing).eInverseRemove(this, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE, PreConditionToSystemTask.class, msgs);
			if (newOngoing != null)
				msgs = ((InternalEObject)newOngoing).eInverseAdd(this, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE, PreConditionToSystemTask.class, msgs);
			msgs = basicSetOngoing(newOngoing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.PRE_CONDITION__ONGOING, newOngoing, newOngoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TammPackage.PRE_CONDITION__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((ContextAwareSystem)otherEnd, msgs);
			case TammPackage.PRE_CONDITION__ONGOING:
				if (ongoing != null)
					msgs = ((InternalEObject)ongoing).eInverseRemove(this, TammPackage.PRE_CONDITION_TO_SYSTEM_TASK__SOURCE, PreConditionToSystemTask.class, msgs);
				return basicSetOngoing((PreConditionToSystemTask)otherEnd, msgs);
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
			case TammPackage.PRE_CONDITION__SYSTEM:
				return basicSetSystem(null, msgs);
			case TammPackage.PRE_CONDITION__ONGOING:
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
			case TammPackage.PRE_CONDITION__SYSTEM:
				return eInternalContainer().eInverseRemove(this, TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS, ContextAwareSystem.class, msgs);
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
			case TammPackage.PRE_CONDITION__SYSTEM:
				return getSystem();
			case TammPackage.PRE_CONDITION__ONGOING:
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
			case TammPackage.PRE_CONDITION__SYSTEM:
				setSystem((ContextAwareSystem)newValue);
				return;
			case TammPackage.PRE_CONDITION__ONGOING:
				setOngoing((PreConditionToSystemTask)newValue);
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
			case TammPackage.PRE_CONDITION__SYSTEM:
				setSystem((ContextAwareSystem)null);
				return;
			case TammPackage.PRE_CONDITION__ONGOING:
				setOngoing((PreConditionToSystemTask)null);
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
			case TammPackage.PRE_CONDITION__SYSTEM:
				return getSystem() != null;
			case TammPackage.PRE_CONDITION__ONGOING:
				return ongoing != null;
		}
		return super.eIsSet(featureID);
	}

} //PreConditionImpl
