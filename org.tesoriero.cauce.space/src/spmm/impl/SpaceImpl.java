/**
 */
package spmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spmm.Generalization;
import spmm.Grouping;
import spmm.Space;
import spmm.SpmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spmm.impl.SpaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link spmm.impl.SpaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link spmm.impl.SpaceImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link spmm.impl.SpaceImpl#getGeneralizedBy <em>Generalized By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SpaceImpl extends MinimalEObjectImpl.Container implements Space {
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
	 * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Grouping> groupBy;

	/**
	 * The cached value of the '{@link #getGeneralizedBy() <em>Generalized By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmmPackage.Literals.SPACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.SPACE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.SPACE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grouping> getGroupBy() {
		if (groupBy == null) {
			groupBy = new EObjectWithInverseResolvingEList<Grouping>(Grouping.class, this, SpmmPackage.SPACE__GROUP_BY, SpmmPackage.GROUPING__CHILD);
		}
		return groupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizedBy() {
		if (generalizedBy == null) {
			generalizedBy = new EObjectWithInverseResolvingEList<Generalization>(Generalization.class, this, SpmmPackage.SPACE__GENERALIZED_BY, SpmmPackage.GENERALIZATION__GENERALIZES);
		}
		return generalizedBy;
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
			case SpmmPackage.SPACE__GROUP_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroupBy()).basicAdd(otherEnd, msgs);
			case SpmmPackage.SPACE__GENERALIZED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralizedBy()).basicAdd(otherEnd, msgs);
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
			case SpmmPackage.SPACE__GROUP_BY:
				return ((InternalEList<?>)getGroupBy()).basicRemove(otherEnd, msgs);
			case SpmmPackage.SPACE__GENERALIZED_BY:
				return ((InternalEList<?>)getGeneralizedBy()).basicRemove(otherEnd, msgs);
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
			case SpmmPackage.SPACE__NAME:
				return getName();
			case SpmmPackage.SPACE__ID:
				return getId();
			case SpmmPackage.SPACE__GROUP_BY:
				return getGroupBy();
			case SpmmPackage.SPACE__GENERALIZED_BY:
				return getGeneralizedBy();
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
			case SpmmPackage.SPACE__NAME:
				setName((String)newValue);
				return;
			case SpmmPackage.SPACE__ID:
				setId((Integer)newValue);
				return;
			case SpmmPackage.SPACE__GROUP_BY:
				getGroupBy().clear();
				getGroupBy().addAll((Collection<? extends Grouping>)newValue);
				return;
			case SpmmPackage.SPACE__GENERALIZED_BY:
				getGeneralizedBy().clear();
				getGeneralizedBy().addAll((Collection<? extends Generalization>)newValue);
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
			case SpmmPackage.SPACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpmmPackage.SPACE__ID:
				setId(ID_EDEFAULT);
				return;
			case SpmmPackage.SPACE__GROUP_BY:
				getGroupBy().clear();
				return;
			case SpmmPackage.SPACE__GENERALIZED_BY:
				getGeneralizedBy().clear();
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
			case SpmmPackage.SPACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpmmPackage.SPACE__ID:
				return id != ID_EDEFAULT;
			case SpmmPackage.SPACE__GROUP_BY:
				return groupBy != null && !groupBy.isEmpty();
			case SpmmPackage.SPACE__GENERALIZED_BY:
				return generalizedBy != null && !generalizedBy.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SpaceImpl
