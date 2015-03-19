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
import tamm.Join;
import tamm.JoinTaskToOutputCondition;
import tamm.TammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Task To Output Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.JoinTaskToOutputConditionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link tamm.impl.JoinTaskToOutputConditionImpl#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinTaskToOutputConditionImpl extends RouteTaskToOutputConditionImpl implements JoinTaskToOutputCondition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Join source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinTaskToOutputConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.JOIN_TASK_TO_OUTPUT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Join)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Join newSource, NotificationChain msgs) {
		Join oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Join newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, TammPackage.JOIN__ONGOING, Join.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, TammPackage.JOIN__ONGOING, Join.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAwareSystem getSystem() {
		if (eContainerFeatureID() != TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM) return null;
		return (ContextAwareSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(ContextAwareSystem newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(ContextAwareSystem newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, TammPackage.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS, ContextAwareSystem.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, TammPackage.JOIN__ONGOING, Join.class, msgs);
				return basicSetSource((Join)otherEnd, msgs);
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM:
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
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE:
				return basicSetSource(null, msgs);
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM:
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
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM:
				return eInternalContainer().eInverseRemove(this, TammPackage.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS, ContextAwareSystem.class, msgs);
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
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM:
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
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE:
				setSource((Join)newValue);
				return;
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM:
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
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE:
				setSource((Join)null);
				return;
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM:
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
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE:
				return source != null;
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SYSTEM:
				return getSystem() != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinTaskToOutputConditionImpl
