/**
 */
package somm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import somm.IndividualInstance;
import somm.IndividualRealization;
import somm.Role;
import somm.Society;
import somm.SommPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link somm.impl.IndividualRealizationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link somm.impl.IndividualRealizationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link somm.impl.IndividualRealizationImpl#getSociety <em>Society</em>}</li>
 *   <li>{@link somm.impl.IndividualRealizationImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualRealizationImpl extends MinimalEObjectImpl.Container implements IndividualRealization {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Role target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected IndividualInstance source;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SommPackage.Literals.INDIVIDUAL_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Role)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SommPackage.INDIVIDUAL_REALIZATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Role newTarget, NotificationChain msgs) {
		Role oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SommPackage.INDIVIDUAL_REALIZATION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Role newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, SommPackage.ROLE__IS_REALIZED_BY_INDIVIDUAL, Role.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, SommPackage.ROLE__IS_REALIZED_BY_INDIVIDUAL, Role.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SommPackage.INDIVIDUAL_REALIZATION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualInstance getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (IndividualInstance)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SommPackage.INDIVIDUAL_REALIZATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualInstance basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(IndividualInstance newSource, NotificationChain msgs) {
		IndividualInstance oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SommPackage.INDIVIDUAL_REALIZATION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(IndividualInstance newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, SommPackage.INDIVIDUAL_INSTANCE__REALIZES, IndividualInstance.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, SommPackage.INDIVIDUAL_INSTANCE__REALIZES, IndividualInstance.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SommPackage.INDIVIDUAL_REALIZATION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Society getSociety() {
		if (eContainerFeatureID() != SommPackage.INDIVIDUAL_REALIZATION__SOCIETY) return null;
		return (Society)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSociety(Society newSociety, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSociety, SommPackage.INDIVIDUAL_REALIZATION__SOCIETY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSociety(Society newSociety) {
		if (newSociety != eInternalContainer() || (eContainerFeatureID() != SommPackage.INDIVIDUAL_REALIZATION__SOCIETY && newSociety != null)) {
			if (EcoreUtil.isAncestor(this, newSociety))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSociety != null)
				msgs = ((InternalEObject)newSociety).eInverseAdd(this, SommPackage.SOCIETY__RELAIZATIONS, Society.class, msgs);
			msgs = basicSetSociety(newSociety, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SommPackage.INDIVIDUAL_REALIZATION__SOCIETY, newSociety, newSociety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SommPackage.INDIVIDUAL_REALIZATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SommPackage.INDIVIDUAL_REALIZATION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, SommPackage.ROLE__IS_REALIZED_BY_INDIVIDUAL, Role.class, msgs);
				return basicSetTarget((Role)otherEnd, msgs);
			case SommPackage.INDIVIDUAL_REALIZATION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, SommPackage.INDIVIDUAL_INSTANCE__REALIZES, IndividualInstance.class, msgs);
				return basicSetSource((IndividualInstance)otherEnd, msgs);
			case SommPackage.INDIVIDUAL_REALIZATION__SOCIETY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSociety((Society)otherEnd, msgs);
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
			case SommPackage.INDIVIDUAL_REALIZATION__TARGET:
				return basicSetTarget(null, msgs);
			case SommPackage.INDIVIDUAL_REALIZATION__SOURCE:
				return basicSetSource(null, msgs);
			case SommPackage.INDIVIDUAL_REALIZATION__SOCIETY:
				return basicSetSociety(null, msgs);
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
			case SommPackage.INDIVIDUAL_REALIZATION__SOCIETY:
				return eInternalContainer().eInverseRemove(this, SommPackage.SOCIETY__RELAIZATIONS, Society.class, msgs);
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
			case SommPackage.INDIVIDUAL_REALIZATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SommPackage.INDIVIDUAL_REALIZATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SommPackage.INDIVIDUAL_REALIZATION__SOCIETY:
				return getSociety();
			case SommPackage.INDIVIDUAL_REALIZATION__ID:
				return getId();
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
			case SommPackage.INDIVIDUAL_REALIZATION__TARGET:
				setTarget((Role)newValue);
				return;
			case SommPackage.INDIVIDUAL_REALIZATION__SOURCE:
				setSource((IndividualInstance)newValue);
				return;
			case SommPackage.INDIVIDUAL_REALIZATION__SOCIETY:
				setSociety((Society)newValue);
				return;
			case SommPackage.INDIVIDUAL_REALIZATION__ID:
				setId((Integer)newValue);
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
			case SommPackage.INDIVIDUAL_REALIZATION__TARGET:
				setTarget((Role)null);
				return;
			case SommPackage.INDIVIDUAL_REALIZATION__SOURCE:
				setSource((IndividualInstance)null);
				return;
			case SommPackage.INDIVIDUAL_REALIZATION__SOCIETY:
				setSociety((Society)null);
				return;
			case SommPackage.INDIVIDUAL_REALIZATION__ID:
				setId(ID_EDEFAULT);
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
			case SommPackage.INDIVIDUAL_REALIZATION__TARGET:
				return target != null;
			case SommPackage.INDIVIDUAL_REALIZATION__SOURCE:
				return source != null;
			case SommPackage.INDIVIDUAL_REALIZATION__SOCIETY:
				return getSociety() != null;
			case SommPackage.INDIVIDUAL_REALIZATION__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //IndividualRealizationImpl
