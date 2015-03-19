/**
 */
package somm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import somm.IndividualInstance;
import somm.IndividualRealization;
import somm.Society;
import somm.SommPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link somm.impl.IndividualInstanceImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link somm.impl.IndividualInstanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link somm.impl.IndividualInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link somm.impl.IndividualInstanceImpl#getSociety <em>Society</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualInstanceImpl extends SocialInstanceImpl implements IndividualInstance {
	/**
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected EList<IndividualRealization> realizes;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SommPackage.Literals.INDIVIDUAL_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndividualRealization> getRealizes() {
		if (realizes == null) {
			realizes = new EObjectWithInverseResolvingEList<IndividualRealization>(IndividualRealization.class, this, SommPackage.INDIVIDUAL_INSTANCE__REALIZES, SommPackage.INDIVIDUAL_REALIZATION__SOURCE);
		}
		return realizes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SommPackage.INDIVIDUAL_INSTANCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SommPackage.INDIVIDUAL_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Society getSociety() {
		if (eContainerFeatureID() != SommPackage.INDIVIDUAL_INSTANCE__SOCIETY) return null;
		return (Society)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSociety(Society newSociety, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSociety, SommPackage.INDIVIDUAL_INSTANCE__SOCIETY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSociety(Society newSociety) {
		if (newSociety != eInternalContainer() || (eContainerFeatureID() != SommPackage.INDIVIDUAL_INSTANCE__SOCIETY && newSociety != null)) {
			if (EcoreUtil.isAncestor(this, newSociety))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSociety != null)
				msgs = ((InternalEObject)newSociety).eInverseAdd(this, SommPackage.SOCIETY__INDIVIDUALS, Society.class, msgs);
			msgs = basicSetSociety(newSociety, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SommPackage.INDIVIDUAL_INSTANCE__SOCIETY, newSociety, newSociety));
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
			case SommPackage.INDIVIDUAL_INSTANCE__REALIZES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizes()).basicAdd(otherEnd, msgs);
			case SommPackage.INDIVIDUAL_INSTANCE__SOCIETY:
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
			case SommPackage.INDIVIDUAL_INSTANCE__REALIZES:
				return ((InternalEList<?>)getRealizes()).basicRemove(otherEnd, msgs);
			case SommPackage.INDIVIDUAL_INSTANCE__SOCIETY:
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
			case SommPackage.INDIVIDUAL_INSTANCE__SOCIETY:
				return eInternalContainer().eInverseRemove(this, SommPackage.SOCIETY__INDIVIDUALS, Society.class, msgs);
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
			case SommPackage.INDIVIDUAL_INSTANCE__REALIZES:
				return getRealizes();
			case SommPackage.INDIVIDUAL_INSTANCE__ID:
				return getId();
			case SommPackage.INDIVIDUAL_INSTANCE__NAME:
				return getName();
			case SommPackage.INDIVIDUAL_INSTANCE__SOCIETY:
				return getSociety();
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
			case SommPackage.INDIVIDUAL_INSTANCE__REALIZES:
				getRealizes().clear();
				getRealizes().addAll((Collection<? extends IndividualRealization>)newValue);
				return;
			case SommPackage.INDIVIDUAL_INSTANCE__ID:
				setId((Integer)newValue);
				return;
			case SommPackage.INDIVIDUAL_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case SommPackage.INDIVIDUAL_INSTANCE__SOCIETY:
				setSociety((Society)newValue);
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
			case SommPackage.INDIVIDUAL_INSTANCE__REALIZES:
				getRealizes().clear();
				return;
			case SommPackage.INDIVIDUAL_INSTANCE__ID:
				setId(ID_EDEFAULT);
				return;
			case SommPackage.INDIVIDUAL_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SommPackage.INDIVIDUAL_INSTANCE__SOCIETY:
				setSociety((Society)null);
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
			case SommPackage.INDIVIDUAL_INSTANCE__REALIZES:
				return realizes != null && !realizes.isEmpty();
			case SommPackage.INDIVIDUAL_INSTANCE__ID:
				return id != ID_EDEFAULT;
			case SommPackage.INDIVIDUAL_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SommPackage.INDIVIDUAL_INSTANCE__SOCIETY:
				return getSociety() != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IndividualInstanceImpl
