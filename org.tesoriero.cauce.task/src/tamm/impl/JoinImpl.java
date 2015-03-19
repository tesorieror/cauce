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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tamm.InputConditionToJoinTask;
import tamm.Join;
import tamm.JoinTaskToOutputCondition;
import tamm.TammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.JoinImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link tamm.impl.JoinImpl#getOngoing <em>Ongoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class JoinImpl extends RouteTaskImpl implements Join {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<InputConditionToJoinTask> incoming;

	/**
	 * The cached value of the '{@link #getOngoing() <em>Ongoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoing()
	 * @generated
	 * @ordered
	 */
	protected JoinTaskToOutputCondition ongoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.JOIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputConditionToJoinTask> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<InputConditionToJoinTask>(InputConditionToJoinTask.class, this, TammPackage.JOIN__INCOMING, TammPackage.INPUT_CONDITION_TO_JOIN_TASK__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinTaskToOutputCondition getOngoing() {
		if (ongoing != null && ongoing.eIsProxy()) {
			InternalEObject oldOngoing = (InternalEObject)ongoing;
			ongoing = (JoinTaskToOutputCondition)eResolveProxy(oldOngoing);
			if (ongoing != oldOngoing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.JOIN__ONGOING, oldOngoing, ongoing));
			}
		}
		return ongoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinTaskToOutputCondition basicGetOngoing() {
		return ongoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOngoing(JoinTaskToOutputCondition newOngoing, NotificationChain msgs) {
		JoinTaskToOutputCondition oldOngoing = ongoing;
		ongoing = newOngoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.JOIN__ONGOING, oldOngoing, newOngoing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOngoing(JoinTaskToOutputCondition newOngoing) {
		if (newOngoing != ongoing) {
			NotificationChain msgs = null;
			if (ongoing != null)
				msgs = ((InternalEObject)ongoing).eInverseRemove(this, TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE, JoinTaskToOutputCondition.class, msgs);
			if (newOngoing != null)
				msgs = ((InternalEObject)newOngoing).eInverseAdd(this, TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE, JoinTaskToOutputCondition.class, msgs);
			msgs = basicSetOngoing(newOngoing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.JOIN__ONGOING, newOngoing, newOngoing));
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
			case TammPackage.JOIN__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case TammPackage.JOIN__ONGOING:
				if (ongoing != null)
					msgs = ((InternalEObject)ongoing).eInverseRemove(this, TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION__SOURCE, JoinTaskToOutputCondition.class, msgs);
				return basicSetOngoing((JoinTaskToOutputCondition)otherEnd, msgs);
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
			case TammPackage.JOIN__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case TammPackage.JOIN__ONGOING:
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
			case TammPackage.JOIN__INCOMING:
				return getIncoming();
			case TammPackage.JOIN__ONGOING:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TammPackage.JOIN__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends InputConditionToJoinTask>)newValue);
				return;
			case TammPackage.JOIN__ONGOING:
				setOngoing((JoinTaskToOutputCondition)newValue);
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
			case TammPackage.JOIN__INCOMING:
				getIncoming().clear();
				return;
			case TammPackage.JOIN__ONGOING:
				setOngoing((JoinTaskToOutputCondition)null);
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
			case TammPackage.JOIN__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case TammPackage.JOIN__ONGOING:
				return ongoing != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinImpl
