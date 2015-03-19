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
import tamm.PostCondition;
import tamm.SystemTaskToPostCondition;
import tamm.TammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.PostConditionImpl#getSystem <em>System</em>}</li>
 *   <li>{@link tamm.impl.PostConditionImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostConditionImpl extends TaskInputConditionImpl implements PostCondition {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected SystemTaskToPostCondition incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.POST_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAwareSystem getSystem() {
		if (eContainerFeatureID() != TammPackage.POST_CONDITION__SYSTEM) return null;
		return (ContextAwareSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(ContextAwareSystem newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, TammPackage.POST_CONDITION__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(ContextAwareSystem newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != TammPackage.POST_CONDITION__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, TammPackage.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS, ContextAwareSystem.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.POST_CONDITION__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTaskToPostCondition getIncoming() {
		if (incoming != null && incoming.eIsProxy()) {
			InternalEObject oldIncoming = (InternalEObject)incoming;
			incoming = (SystemTaskToPostCondition)eResolveProxy(oldIncoming);
			if (incoming != oldIncoming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.POST_CONDITION__INCOMING, oldIncoming, incoming));
			}
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTaskToPostCondition basicGetIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncoming(SystemTaskToPostCondition newIncoming, NotificationChain msgs) {
		SystemTaskToPostCondition oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.POST_CONDITION__INCOMING, oldIncoming, newIncoming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(SystemTaskToPostCondition newIncoming) {
		if (newIncoming != incoming) {
			NotificationChain msgs = null;
			if (incoming != null)
				msgs = ((InternalEObject)incoming).eInverseRemove(this, TammPackage.SYSTEM_TASK_TO_POST_CONDITION__TARGET, SystemTaskToPostCondition.class, msgs);
			if (newIncoming != null)
				msgs = ((InternalEObject)newIncoming).eInverseAdd(this, TammPackage.SYSTEM_TASK_TO_POST_CONDITION__TARGET, SystemTaskToPostCondition.class, msgs);
			msgs = basicSetIncoming(newIncoming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.POST_CONDITION__INCOMING, newIncoming, newIncoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TammPackage.POST_CONDITION__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((ContextAwareSystem)otherEnd, msgs);
			case TammPackage.POST_CONDITION__INCOMING:
				if (incoming != null)
					msgs = ((InternalEObject)incoming).eInverseRemove(this, TammPackage.SYSTEM_TASK_TO_POST_CONDITION__TARGET, SystemTaskToPostCondition.class, msgs);
				return basicSetIncoming((SystemTaskToPostCondition)otherEnd, msgs);
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
			case TammPackage.POST_CONDITION__SYSTEM:
				return basicSetSystem(null, msgs);
			case TammPackage.POST_CONDITION__INCOMING:
				return basicSetIncoming(null, msgs);
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
			case TammPackage.POST_CONDITION__SYSTEM:
				return eInternalContainer().eInverseRemove(this, TammPackage.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS, ContextAwareSystem.class, msgs);
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
			case TammPackage.POST_CONDITION__SYSTEM:
				return getSystem();
			case TammPackage.POST_CONDITION__INCOMING:
				if (resolve) return getIncoming();
				return basicGetIncoming();
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
			case TammPackage.POST_CONDITION__SYSTEM:
				setSystem((ContextAwareSystem)newValue);
				return;
			case TammPackage.POST_CONDITION__INCOMING:
				setIncoming((SystemTaskToPostCondition)newValue);
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
			case TammPackage.POST_CONDITION__SYSTEM:
				setSystem((ContextAwareSystem)null);
				return;
			case TammPackage.POST_CONDITION__INCOMING:
				setIncoming((SystemTaskToPostCondition)null);
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
			case TammPackage.POST_CONDITION__SYSTEM:
				return getSystem() != null;
			case TammPackage.POST_CONDITION__INCOMING:
				return incoming != null;
		}
		return super.eIsSet(featureID);
	}

} //PostConditionImpl
