/**
 */
package spmm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import spmm.LocationUnit;
import spmm.PhysicalSpace;
import spmm.Representation;
import spmm.SpmmPackage;
import spmm.Universe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spmm.impl.RepresentationImpl#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.impl.RepresentationImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link spmm.impl.RepresentationImpl#getRepresentedBy <em>Represented By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepresentationImpl extends SpaceRelationshipImpl implements Representation {
	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected PhysicalSpace represents;

	/**
	 * The cached value of the '{@link #getRepresentedBy() <em>Represented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedBy()
	 * @generated
	 * @ordered
	 */
	protected LocationUnit representedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmmPackage.Literals.REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universe getUniverse() {
		if (eContainerFeatureID() != SpmmPackage.REPRESENTATION__UNIVERSE) return null;
		return (Universe)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniverse(Universe newUniverse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUniverse, SpmmPackage.REPRESENTATION__UNIVERSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniverse(Universe newUniverse) {
		if (newUniverse != eInternalContainer() || (eContainerFeatureID() != SpmmPackage.REPRESENTATION__UNIVERSE && newUniverse != null)) {
			if (EcoreUtil.isAncestor(this, newUniverse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUniverse != null)
				msgs = ((InternalEObject)newUniverse).eInverseAdd(this, SpmmPackage.UNIVERSE__REPRESENTATIONS, Universe.class, msgs);
			msgs = basicSetUniverse(newUniverse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.REPRESENTATION__UNIVERSE, newUniverse, newUniverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalSpace getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (PhysicalSpace)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpmmPackage.REPRESENTATION__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalSpace basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresents(PhysicalSpace newRepresents, NotificationChain msgs) {
		PhysicalSpace oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpmmPackage.REPRESENTATION__REPRESENTS, oldRepresents, newRepresents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(PhysicalSpace newRepresents) {
		if (newRepresents != represents) {
			NotificationChain msgs = null;
			if (represents != null)
				msgs = ((InternalEObject)represents).eInverseRemove(this, SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY, PhysicalSpace.class, msgs);
			if (newRepresents != null)
				msgs = ((InternalEObject)newRepresents).eInverseAdd(this, SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY, PhysicalSpace.class, msgs);
			msgs = basicSetRepresents(newRepresents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.REPRESENTATION__REPRESENTS, newRepresents, newRepresents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationUnit getRepresentedBy() {
		if (representedBy != null && representedBy.eIsProxy()) {
			InternalEObject oldRepresentedBy = (InternalEObject)representedBy;
			representedBy = (LocationUnit)eResolveProxy(oldRepresentedBy);
			if (representedBy != oldRepresentedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpmmPackage.REPRESENTATION__REPRESENTED_BY, oldRepresentedBy, representedBy));
			}
		}
		return representedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationUnit basicGetRepresentedBy() {
		return representedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentedBy(LocationUnit newRepresentedBy, NotificationChain msgs) {
		LocationUnit oldRepresentedBy = representedBy;
		representedBy = newRepresentedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpmmPackage.REPRESENTATION__REPRESENTED_BY, oldRepresentedBy, newRepresentedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedBy(LocationUnit newRepresentedBy) {
		if (newRepresentedBy != representedBy) {
			NotificationChain msgs = null;
			if (representedBy != null)
				msgs = ((InternalEObject)representedBy).eInverseRemove(this, SpmmPackage.LOCATION_UNIT__REPRESENTS, LocationUnit.class, msgs);
			if (newRepresentedBy != null)
				msgs = ((InternalEObject)newRepresentedBy).eInverseAdd(this, SpmmPackage.LOCATION_UNIT__REPRESENTS, LocationUnit.class, msgs);
			msgs = basicSetRepresentedBy(newRepresentedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.REPRESENTATION__REPRESENTED_BY, newRepresentedBy, newRepresentedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpmmPackage.REPRESENTATION__UNIVERSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUniverse((Universe)otherEnd, msgs);
			case SpmmPackage.REPRESENTATION__REPRESENTS:
				if (represents != null)
					msgs = ((InternalEObject)represents).eInverseRemove(this, SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY, PhysicalSpace.class, msgs);
				return basicSetRepresents((PhysicalSpace)otherEnd, msgs);
			case SpmmPackage.REPRESENTATION__REPRESENTED_BY:
				if (representedBy != null)
					msgs = ((InternalEObject)representedBy).eInverseRemove(this, SpmmPackage.LOCATION_UNIT__REPRESENTS, LocationUnit.class, msgs);
				return basicSetRepresentedBy((LocationUnit)otherEnd, msgs);
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
			case SpmmPackage.REPRESENTATION__UNIVERSE:
				return basicSetUniverse(null, msgs);
			case SpmmPackage.REPRESENTATION__REPRESENTS:
				return basicSetRepresents(null, msgs);
			case SpmmPackage.REPRESENTATION__REPRESENTED_BY:
				return basicSetRepresentedBy(null, msgs);
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
			case SpmmPackage.REPRESENTATION__UNIVERSE:
				return eInternalContainer().eInverseRemove(this, SpmmPackage.UNIVERSE__REPRESENTATIONS, Universe.class, msgs);
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
			case SpmmPackage.REPRESENTATION__UNIVERSE:
				return getUniverse();
			case SpmmPackage.REPRESENTATION__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
			case SpmmPackage.REPRESENTATION__REPRESENTED_BY:
				if (resolve) return getRepresentedBy();
				return basicGetRepresentedBy();
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
			case SpmmPackage.REPRESENTATION__UNIVERSE:
				setUniverse((Universe)newValue);
				return;
			case SpmmPackage.REPRESENTATION__REPRESENTS:
				setRepresents((PhysicalSpace)newValue);
				return;
			case SpmmPackage.REPRESENTATION__REPRESENTED_BY:
				setRepresentedBy((LocationUnit)newValue);
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
			case SpmmPackage.REPRESENTATION__UNIVERSE:
				setUniverse((Universe)null);
				return;
			case SpmmPackage.REPRESENTATION__REPRESENTS:
				setRepresents((PhysicalSpace)null);
				return;
			case SpmmPackage.REPRESENTATION__REPRESENTED_BY:
				setRepresentedBy((LocationUnit)null);
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
			case SpmmPackage.REPRESENTATION__UNIVERSE:
				return getUniverse() != null;
			case SpmmPackage.REPRESENTATION__REPRESENTS:
				return represents != null;
			case SpmmPackage.REPRESENTATION__REPRESENTED_BY:
				return representedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //RepresentationImpl
