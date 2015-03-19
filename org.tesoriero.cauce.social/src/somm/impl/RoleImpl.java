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

import somm.IndividualRealization;
import somm.Role;
import somm.Society;
import somm.SommPackage;
import somm.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link somm.impl.RoleImpl#getSociety <em>Society</em>}</li>
 *   <li>{@link somm.impl.RoleImpl#getIsRealizedByIndividual <em>Is Realized By Individual</em>}</li>
 *   <li>{@link somm.impl.RoleImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link somm.impl.RoleImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link somm.impl.RoleImpl#getId <em>Id</em>}</li>
 *   <li>{@link somm.impl.RoleImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends SocialInstanceImpl implements Role {
	/**
	 * The cached value of the '{@link #getIsRealizedByIndividual() <em>Is Realized By Individual</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRealizedByIndividual()
	 * @generated
	 * @ordered
	 */
	protected EList<IndividualRealization> isRealizedByIndividual;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> parent;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> children;

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
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SommPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Society getSociety() {
		if (eContainerFeatureID() != SommPackage.ROLE__SOCIETY) return null;
		return (Society)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSociety(Society newSociety, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSociety, SommPackage.ROLE__SOCIETY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSociety(Society newSociety) {
		if (newSociety != eInternalContainer() || (eContainerFeatureID() != SommPackage.ROLE__SOCIETY && newSociety != null)) {
			if (EcoreUtil.isAncestor(this, newSociety))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSociety != null)
				msgs = ((InternalEObject)newSociety).eInverseAdd(this, SommPackage.SOCIETY__ROLES, Society.class, msgs);
			msgs = basicSetSociety(newSociety, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SommPackage.ROLE__SOCIETY, newSociety, newSociety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndividualRealization> getIsRealizedByIndividual() {
		if (isRealizedByIndividual == null) {
			isRealizedByIndividual = new EObjectWithInverseResolvingEList<IndividualRealization>(IndividualRealization.class, this, SommPackage.ROLE__IS_REALIZED_BY_INDIVIDUAL, SommPackage.INDIVIDUAL_REALIZATION__TARGET);
		}
		return isRealizedByIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getParent() {
		if (parent == null) {
			parent = new EObjectWithInverseResolvingEList<Specialization>(Specialization.class, this, SommPackage.ROLE__PARENT, SommPackage.SPECIALIZATION__TARGET);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<Specialization>(Specialization.class, this, SommPackage.ROLE__CHILDREN, SommPackage.SPECIALIZATION__SOURCE);
		}
		return children;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SommPackage.ROLE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SommPackage.ROLE__NAME, oldName, name));
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
			case SommPackage.ROLE__SOCIETY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSociety((Society)otherEnd, msgs);
			case SommPackage.ROLE__IS_REALIZED_BY_INDIVIDUAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRealizedByIndividual()).basicAdd(otherEnd, msgs);
			case SommPackage.ROLE__PARENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParent()).basicAdd(otherEnd, msgs);
			case SommPackage.ROLE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
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
			case SommPackage.ROLE__SOCIETY:
				return basicSetSociety(null, msgs);
			case SommPackage.ROLE__IS_REALIZED_BY_INDIVIDUAL:
				return ((InternalEList<?>)getIsRealizedByIndividual()).basicRemove(otherEnd, msgs);
			case SommPackage.ROLE__PARENT:
				return ((InternalEList<?>)getParent()).basicRemove(otherEnd, msgs);
			case SommPackage.ROLE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case SommPackage.ROLE__SOCIETY:
				return eInternalContainer().eInverseRemove(this, SommPackage.SOCIETY__ROLES, Society.class, msgs);
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
			case SommPackage.ROLE__SOCIETY:
				return getSociety();
			case SommPackage.ROLE__IS_REALIZED_BY_INDIVIDUAL:
				return getIsRealizedByIndividual();
			case SommPackage.ROLE__PARENT:
				return getParent();
			case SommPackage.ROLE__CHILDREN:
				return getChildren();
			case SommPackage.ROLE__ID:
				return getId();
			case SommPackage.ROLE__NAME:
				return getName();
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
			case SommPackage.ROLE__SOCIETY:
				setSociety((Society)newValue);
				return;
			case SommPackage.ROLE__IS_REALIZED_BY_INDIVIDUAL:
				getIsRealizedByIndividual().clear();
				getIsRealizedByIndividual().addAll((Collection<? extends IndividualRealization>)newValue);
				return;
			case SommPackage.ROLE__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends Specialization>)newValue);
				return;
			case SommPackage.ROLE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Specialization>)newValue);
				return;
			case SommPackage.ROLE__ID:
				setId((Integer)newValue);
				return;
			case SommPackage.ROLE__NAME:
				setName((String)newValue);
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
			case SommPackage.ROLE__SOCIETY:
				setSociety((Society)null);
				return;
			case SommPackage.ROLE__IS_REALIZED_BY_INDIVIDUAL:
				getIsRealizedByIndividual().clear();
				return;
			case SommPackage.ROLE__PARENT:
				getParent().clear();
				return;
			case SommPackage.ROLE__CHILDREN:
				getChildren().clear();
				return;
			case SommPackage.ROLE__ID:
				setId(ID_EDEFAULT);
				return;
			case SommPackage.ROLE__NAME:
				setName(NAME_EDEFAULT);
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
			case SommPackage.ROLE__SOCIETY:
				return getSociety() != null;
			case SommPackage.ROLE__IS_REALIZED_BY_INDIVIDUAL:
				return isRealizedByIndividual != null && !isRealizedByIndividual.isEmpty();
			case SommPackage.ROLE__PARENT:
				return parent != null && !parent.isEmpty();
			case SommPackage.ROLE__CHILDREN:
				return children != null && !children.isEmpty();
			case SommPackage.ROLE__ID:
				return id != ID_EDEFAULT;
			case SommPackage.ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //RoleImpl
