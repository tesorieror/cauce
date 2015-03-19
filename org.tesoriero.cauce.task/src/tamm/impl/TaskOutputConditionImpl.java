/**
 */
package tamm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tamm.RouteTaskToOutputCondition;
import tamm.TammPackage;
import tamm.TaskOutputCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Output Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.TaskOutputConditionImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TaskOutputConditionImpl extends ConditionImpl implements TaskOutputCondition {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected RouteTaskToOutputCondition incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskOutputConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.TASK_OUTPUT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteTaskToOutputCondition getIncoming() {
		if (incoming != null && incoming.eIsProxy()) {
			InternalEObject oldIncoming = (InternalEObject)incoming;
			incoming = (RouteTaskToOutputCondition)eResolveProxy(oldIncoming);
			if (incoming != oldIncoming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.TASK_OUTPUT_CONDITION__INCOMING, oldIncoming, incoming));
			}
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteTaskToOutputCondition basicGetIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncoming(RouteTaskToOutputCondition newIncoming, NotificationChain msgs) {
		RouteTaskToOutputCondition oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.TASK_OUTPUT_CONDITION__INCOMING, oldIncoming, newIncoming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(RouteTaskToOutputCondition newIncoming) {
		if (newIncoming != incoming) {
			NotificationChain msgs = null;
			if (incoming != null)
				msgs = ((InternalEObject)incoming).eInverseRemove(this, TammPackage.ROUTE_TASK_TO_OUTPUT_CONDITION__TARGET, RouteTaskToOutputCondition.class, msgs);
			if (newIncoming != null)
				msgs = ((InternalEObject)newIncoming).eInverseAdd(this, TammPackage.ROUTE_TASK_TO_OUTPUT_CONDITION__TARGET, RouteTaskToOutputCondition.class, msgs);
			msgs = basicSetIncoming(newIncoming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.TASK_OUTPUT_CONDITION__INCOMING, newIncoming, newIncoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TammPackage.TASK_OUTPUT_CONDITION__INCOMING:
				if (incoming != null)
					msgs = ((InternalEObject)incoming).eInverseRemove(this, TammPackage.ROUTE_TASK_TO_OUTPUT_CONDITION__TARGET, RouteTaskToOutputCondition.class, msgs);
				return basicSetIncoming((RouteTaskToOutputCondition)otherEnd, msgs);
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
			case TammPackage.TASK_OUTPUT_CONDITION__INCOMING:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TammPackage.TASK_OUTPUT_CONDITION__INCOMING:
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
			case TammPackage.TASK_OUTPUT_CONDITION__INCOMING:
				setIncoming((RouteTaskToOutputCondition)newValue);
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
			case TammPackage.TASK_OUTPUT_CONDITION__INCOMING:
				setIncoming((RouteTaskToOutputCondition)null);
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
			case TammPackage.TASK_OUTPUT_CONDITION__INCOMING:
				return incoming != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskOutputConditionImpl
