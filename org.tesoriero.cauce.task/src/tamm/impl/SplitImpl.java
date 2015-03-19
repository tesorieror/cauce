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

import tamm.InputConditionToSplitTask;
import tamm.Split;
import tamm.SplitTaskToOutputCondition;
import tamm.TammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.SplitImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link tamm.impl.SplitImpl#getOngoing <em>Ongoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SplitImpl extends RouteTaskImpl implements Split {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected InputConditionToSplitTask incoming;

	/**
	 * The cached value of the '{@link #getOngoing() <em>Ongoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoing()
	 * @generated
	 * @ordered
	 */
	protected EList<SplitTaskToOutputCondition> ongoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.SPLIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConditionToSplitTask getIncoming() {
		if (incoming != null && incoming.eIsProxy()) {
			InternalEObject oldIncoming = (InternalEObject)incoming;
			incoming = (InputConditionToSplitTask)eResolveProxy(oldIncoming);
			if (incoming != oldIncoming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TammPackage.SPLIT__INCOMING, oldIncoming, incoming));
			}
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConditionToSplitTask basicGetIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncoming(InputConditionToSplitTask newIncoming, NotificationChain msgs) {
		InputConditionToSplitTask oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TammPackage.SPLIT__INCOMING, oldIncoming, newIncoming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(InputConditionToSplitTask newIncoming) {
		if (newIncoming != incoming) {
			NotificationChain msgs = null;
			if (incoming != null)
				msgs = ((InternalEObject)incoming).eInverseRemove(this, TammPackage.INPUT_CONDITION_TO_SPLIT_TASK__TARGET, InputConditionToSplitTask.class, msgs);
			if (newIncoming != null)
				msgs = ((InternalEObject)newIncoming).eInverseAdd(this, TammPackage.INPUT_CONDITION_TO_SPLIT_TASK__TARGET, InputConditionToSplitTask.class, msgs);
			msgs = basicSetIncoming(newIncoming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.SPLIT__INCOMING, newIncoming, newIncoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SplitTaskToOutputCondition> getOngoing() {
		if (ongoing == null) {
			ongoing = new EObjectWithInverseResolvingEList<SplitTaskToOutputCondition>(SplitTaskToOutputCondition.class, this, TammPackage.SPLIT__ONGOING, TammPackage.SPLIT_TASK_TO_OUTPUT_CONDITION__SOURCE);
		}
		return ongoing;
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
			case TammPackage.SPLIT__INCOMING:
				if (incoming != null)
					msgs = ((InternalEObject)incoming).eInverseRemove(this, TammPackage.INPUT_CONDITION_TO_SPLIT_TASK__TARGET, InputConditionToSplitTask.class, msgs);
				return basicSetIncoming((InputConditionToSplitTask)otherEnd, msgs);
			case TammPackage.SPLIT__ONGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOngoing()).basicAdd(otherEnd, msgs);
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
			case TammPackage.SPLIT__INCOMING:
				return basicSetIncoming(null, msgs);
			case TammPackage.SPLIT__ONGOING:
				return ((InternalEList<?>)getOngoing()).basicRemove(otherEnd, msgs);
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
			case TammPackage.SPLIT__INCOMING:
				if (resolve) return getIncoming();
				return basicGetIncoming();
			case TammPackage.SPLIT__ONGOING:
				return getOngoing();
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
			case TammPackage.SPLIT__INCOMING:
				setIncoming((InputConditionToSplitTask)newValue);
				return;
			case TammPackage.SPLIT__ONGOING:
				getOngoing().clear();
				getOngoing().addAll((Collection<? extends SplitTaskToOutputCondition>)newValue);
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
			case TammPackage.SPLIT__INCOMING:
				setIncoming((InputConditionToSplitTask)null);
				return;
			case TammPackage.SPLIT__ONGOING:
				getOngoing().clear();
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
			case TammPackage.SPLIT__INCOMING:
				return incoming != null;
			case TammPackage.SPLIT__ONGOING:
				return ongoing != null && !ongoing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SplitImpl
