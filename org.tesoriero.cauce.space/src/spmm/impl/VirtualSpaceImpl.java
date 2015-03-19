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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import spmm.Generalization;
import spmm.Grouping;
import spmm.SpmmPackage;
import spmm.Universe;
import spmm.VirtualSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spmm.impl.VirtualSpaceImpl#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.impl.VirtualSpaceImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link spmm.impl.VirtualSpaceImpl#getGeneralizes <em>Generalizes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualSpaceImpl extends SpaceImpl implements VirtualSpace {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Grouping> contains;

	/**
	 * The cached value of the '{@link #getGeneralizes() <em>Generalizes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizes()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmmPackage.Literals.VIRTUAL_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universe getUniverse() {
		if (eContainerFeatureID() != SpmmPackage.VIRTUAL_SPACE__UNIVERSE) return null;
		return (Universe)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniverse(Universe newUniverse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUniverse, SpmmPackage.VIRTUAL_SPACE__UNIVERSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniverse(Universe newUniverse) {
		if (newUniverse != eInternalContainer() || (eContainerFeatureID() != SpmmPackage.VIRTUAL_SPACE__UNIVERSE && newUniverse != null)) {
			if (EcoreUtil.isAncestor(this, newUniverse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUniverse != null)
				msgs = ((InternalEObject)newUniverse).eInverseAdd(this, SpmmPackage.UNIVERSE__VIRTUAL_SPACES, Universe.class, msgs);
			msgs = basicSetUniverse(newUniverse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.VIRTUAL_SPACE__UNIVERSE, newUniverse, newUniverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grouping> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList<Grouping>(Grouping.class, this, SpmmPackage.VIRTUAL_SPACE__CONTAINS, SpmmPackage.GROUPING__PARENT);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizes() {
		if (generalizes == null) {
			generalizes = new EObjectWithInverseResolvingEList<Generalization>(Generalization.class, this, SpmmPackage.VIRTUAL_SPACE__GENERALIZES, SpmmPackage.GENERALIZATION__PARENT);
		}
		return generalizes;
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
			case SpmmPackage.VIRTUAL_SPACE__UNIVERSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUniverse((Universe)otherEnd, msgs);
			case SpmmPackage.VIRTUAL_SPACE__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case SpmmPackage.VIRTUAL_SPACE__GENERALIZES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralizes()).basicAdd(otherEnd, msgs);
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
			case SpmmPackage.VIRTUAL_SPACE__UNIVERSE:
				return basicSetUniverse(null, msgs);
			case SpmmPackage.VIRTUAL_SPACE__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case SpmmPackage.VIRTUAL_SPACE__GENERALIZES:
				return ((InternalEList<?>)getGeneralizes()).basicRemove(otherEnd, msgs);
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
			case SpmmPackage.VIRTUAL_SPACE__UNIVERSE:
				return eInternalContainer().eInverseRemove(this, SpmmPackage.UNIVERSE__VIRTUAL_SPACES, Universe.class, msgs);
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
			case SpmmPackage.VIRTUAL_SPACE__UNIVERSE:
				return getUniverse();
			case SpmmPackage.VIRTUAL_SPACE__CONTAINS:
				return getContains();
			case SpmmPackage.VIRTUAL_SPACE__GENERALIZES:
				return getGeneralizes();
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
			case SpmmPackage.VIRTUAL_SPACE__UNIVERSE:
				setUniverse((Universe)newValue);
				return;
			case SpmmPackage.VIRTUAL_SPACE__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Grouping>)newValue);
				return;
			case SpmmPackage.VIRTUAL_SPACE__GENERALIZES:
				getGeneralizes().clear();
				getGeneralizes().addAll((Collection<? extends Generalization>)newValue);
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
			case SpmmPackage.VIRTUAL_SPACE__UNIVERSE:
				setUniverse((Universe)null);
				return;
			case SpmmPackage.VIRTUAL_SPACE__CONTAINS:
				getContains().clear();
				return;
			case SpmmPackage.VIRTUAL_SPACE__GENERALIZES:
				getGeneralizes().clear();
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
			case SpmmPackage.VIRTUAL_SPACE__UNIVERSE:
				return getUniverse() != null;
			case SpmmPackage.VIRTUAL_SPACE__CONTAINS:
				return contains != null && !contains.isEmpty();
			case SpmmPackage.VIRTUAL_SPACE__GENERALIZES:
				return generalizes != null && !generalizes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualSpaceImpl
