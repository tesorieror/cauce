/**
 */
package ecmm.impl;

import ecmm.ContextSituation;
import ecmm.EcmmPackage;
import ecmm.SensingContextCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensing Context Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecmm.impl.SensingContextConditionImpl#getSituation <em>Situation</em>}</li>
 *   <li>{@link ecmm.impl.SensingContextConditionImpl#getInformationflow <em>Informationflow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensingContextConditionImpl extends ContextConditionImpl implements SensingContextCondition {
	/**
	 * The default value of the '{@link #getInformationflow() <em>Informationflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationflow()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATIONFLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformationflow() <em>Informationflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationflow()
	 * @generated
	 * @ordered
	 */
	protected String informationflow = INFORMATIONFLOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensingContextConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcmmPackage.Literals.SENSING_CONTEXT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextSituation getSituation() {
		if (eContainerFeatureID() != EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION) return null;
		return (ContextSituation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSituation(ContextSituation newSituation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSituation, EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituation(ContextSituation newSituation) {
		if (newSituation != eInternalContainer() || (eContainerFeatureID() != EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION && newSituation != null)) {
			if (EcoreUtil.isAncestor(this, newSituation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSituation != null)
				msgs = ((InternalEObject)newSituation).eInverseAdd(this, EcmmPackage.CONTEXT_SITUATION__SENSING_CONDITIONS, ContextSituation.class, msgs);
			msgs = basicSetSituation(newSituation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION, newSituation, newSituation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformationflow() {
		return informationflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationflow(String newInformationflow) {
		String oldInformationflow = informationflow;
		informationflow = newInformationflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.SENSING_CONTEXT_CONDITION__INFORMATIONFLOW, oldInformationflow, informationflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSituation((ContextSituation)otherEnd, msgs);
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
			case EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION:
				return basicSetSituation(null, msgs);
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
			case EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION:
				return eInternalContainer().eInverseRemove(this, EcmmPackage.CONTEXT_SITUATION__SENSING_CONDITIONS, ContextSituation.class, msgs);
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
			case EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION:
				return getSituation();
			case EcmmPackage.SENSING_CONTEXT_CONDITION__INFORMATIONFLOW:
				return getInformationflow();
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
			case EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION:
				setSituation((ContextSituation)newValue);
				return;
			case EcmmPackage.SENSING_CONTEXT_CONDITION__INFORMATIONFLOW:
				setInformationflow((String)newValue);
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
			case EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION:
				setSituation((ContextSituation)null);
				return;
			case EcmmPackage.SENSING_CONTEXT_CONDITION__INFORMATIONFLOW:
				setInformationflow(INFORMATIONFLOW_EDEFAULT);
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
			case EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION:
				return getSituation() != null;
			case EcmmPackage.SENSING_CONTEXT_CONDITION__INFORMATIONFLOW:
				return INFORMATIONFLOW_EDEFAULT == null ? informationflow != null : !INFORMATIONFLOW_EDEFAULT.equals(informationflow);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (informationflow: ");
		result.append(informationflow);
		result.append(')');
		return result.toString();
	}

} //SensingContextConditionImpl
