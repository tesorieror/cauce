/**
 */
package tamm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tamm.InputConditionToRouteTask;
import tamm.TammPackage;
import tamm.TaskInputCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Input Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.TaskInputConditionImpl#getOngoing <em>Ongoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TaskInputConditionImpl extends ConditionImpl implements TaskInputCondition {
	/**
	 * The cached value of the '{@link #getOngoing() <em>Ongoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoing()
	 * @generated
	 * @ordered
	 */
	protected InputConditionToRouteTask ongoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskInputConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.TASK_INPUT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConditionToRouteTask getOngoing() {
		if (ongoing != null && ongoing.eIsProxy()) {
			InternalEObject oldOngoing = (InternalEObject)ongoing;
			ongoing = (InputConditionToRouteTask)eResolveProxy(oldOngoing);
			if (ongoing != oldOngoing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.TASK_INPUT_CONDITION__ONGOING, oldOngoing, ongoing));
			}
		}
		return ongoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConditionToRouteTask basicGetOngoing() {
		return ongoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOngoing(InputConditionToRouteTask newOngoing, NotificationChain msgs) {
		InputConditionToRouteTask oldOngoing = ongoing;
		ongoing = newOngoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.TASK_INPUT_CONDITION__ONGOING, oldOngoing, newOngoing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOngoing(InputConditionToRouteTask newOngoing) {
		if (newOngoing != ongoing) {
			NotificationChain msgs = null;
			if (ongoing != null)
				msgs = ((InternalEObject)ongoing).eInverseRemove(this, TammPackage.INPUT_CONDITION_TO_ROUTE_TASK__SOURCE, InputConditionToRouteTask.class, msgs);
			if (newOngoing != null)
				msgs = ((InternalEObject)newOngoing).eInverseAdd(this, TammPackage.INPUT_CONDITION_TO_ROUTE_TASK__SOURCE, InputConditionToRouteTask.class, msgs);
			msgs = basicSetOngoing(newOngoing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.TASK_INPUT_CONDITION__ONGOING, newOngoing, newOngoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TammPackage.TASK_INPUT_CONDITION__ONGOING:
				if (ongoing != null)
					msgs = ((InternalEObject)ongoing).eInverseRemove(this, TammPackage.INPUT_CONDITION_TO_ROUTE_TASK__SOURCE, InputConditionToRouteTask.class, msgs);
				return basicSetOngoing((InputConditionToRouteTask)otherEnd, msgs);
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
			case TammPackage.TASK_INPUT_CONDITION__ONGOING:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TammPackage.TASK_INPUT_CONDITION__ONGOING:
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
			case TammPackage.TASK_INPUT_CONDITION__ONGOING:
				setOngoing((InputConditionToRouteTask)newValue);
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
			case TammPackage.TASK_INPUT_CONDITION__ONGOING:
				setOngoing((InputConditionToRouteTask)null);
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
			case TammPackage.TASK_INPUT_CONDITION__ONGOING:
				return ongoing != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskInputConditionImpl
