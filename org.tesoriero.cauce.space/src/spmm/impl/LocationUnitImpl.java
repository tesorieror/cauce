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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import spmm.Identification;
import spmm.LocationUnit;
import spmm.Representation;
import spmm.SpmmPackage;
import spmm.Universe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spmm.impl.LocationUnitImpl#getIdentifications <em>Identifications</em>}</li>
 *   <li>{@link spmm.impl.LocationUnitImpl#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.impl.LocationUnitImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link spmm.impl.LocationUnitImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationUnitImpl extends MinimalEObjectImpl.Container implements LocationUnit {
	/**
	 * The cached value of the '{@link #getIdentifications() <em>Identifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Identification> identifications;

	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected Representation represents;

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
	protected LocationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmmPackage.Literals.LOCATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identification> getIdentifications() {
		if (identifications == null) {
			identifications = new EObjectContainmentWithInverseEList<Identification>(Identification.class, this, SpmmPackage.LOCATION_UNIT__IDENTIFICATIONS, SpmmPackage.IDENTIFICATION__LOCATION_UNIT);
		}
		return identifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universe getUniverse() {
		if (eContainerFeatureID() != SpmmPackage.LOCATION_UNIT__UNIVERSE) return null;
		return (Universe)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniverse(Universe newUniverse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUniverse, SpmmPackage.LOCATION_UNIT__UNIVERSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniverse(Universe newUniverse) {
		if (newUniverse != eInternalContainer() || (eContainerFeatureID() != SpmmPackage.LOCATION_UNIT__UNIVERSE && newUniverse != null)) {
			if (EcoreUtil.isAncestor(this, newUniverse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUniverse != null)
				msgs = ((InternalEObject)newUniverse).eInverseAdd(this, SpmmPackage.UNIVERSE__LOCATION_UNITS, Universe.class, msgs);
			msgs = basicSetUniverse(newUniverse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.LOCATION_UNIT__UNIVERSE, newUniverse, newUniverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (Representation)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpmmPackage.LOCATION_UNIT__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresents(Representation newRepresents, NotificationChain msgs) {
		Representation oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpmmPackage.LOCATION_UNIT__REPRESENTS, oldRepresents, newRepresents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(Representation newRepresents) {
		if (newRepresents != represents) {
			NotificationChain msgs = null;
			if (represents != null)
				msgs = ((InternalEObject)represents).eInverseRemove(this, SpmmPackage.REPRESENTATION__REPRESENTED_BY, Representation.class, msgs);
			if (newRepresents != null)
				msgs = ((InternalEObject)newRepresents).eInverseAdd(this, SpmmPackage.REPRESENTATION__REPRESENTED_BY, Representation.class, msgs);
			msgs = basicSetRepresents(newRepresents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.LOCATION_UNIT__REPRESENTS, newRepresents, newRepresents));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.LOCATION_UNIT__NAME, oldName, name));
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
			case SpmmPackage.LOCATION_UNIT__IDENTIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIdentifications()).basicAdd(otherEnd, msgs);
			case SpmmPackage.LOCATION_UNIT__UNIVERSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUniverse((Universe)otherEnd, msgs);
			case SpmmPackage.LOCATION_UNIT__REPRESENTS:
				if (represents != null)
					msgs = ((InternalEObject)represents).eInverseRemove(this, SpmmPackage.REPRESENTATION__REPRESENTED_BY, Representation.class, msgs);
				return basicSetRepresents((Representation)otherEnd, msgs);
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
			case SpmmPackage.LOCATION_UNIT__IDENTIFICATIONS:
				return ((InternalEList<?>)getIdentifications()).basicRemove(otherEnd, msgs);
			case SpmmPackage.LOCATION_UNIT__UNIVERSE:
				return basicSetUniverse(null, msgs);
			case SpmmPackage.LOCATION_UNIT__REPRESENTS:
				return basicSetRepresents(null, msgs);
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
			case SpmmPackage.LOCATION_UNIT__UNIVERSE:
				return eInternalContainer().eInverseRemove(this, SpmmPackage.UNIVERSE__LOCATION_UNITS, Universe.class, msgs);
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
			case SpmmPackage.LOCATION_UNIT__IDENTIFICATIONS:
				return getIdentifications();
			case SpmmPackage.LOCATION_UNIT__UNIVERSE:
				return getUniverse();
			case SpmmPackage.LOCATION_UNIT__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
			case SpmmPackage.LOCATION_UNIT__NAME:
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
			case SpmmPackage.LOCATION_UNIT__IDENTIFICATIONS:
				getIdentifications().clear();
				getIdentifications().addAll((Collection<? extends Identification>)newValue);
				return;
			case SpmmPackage.LOCATION_UNIT__UNIVERSE:
				setUniverse((Universe)newValue);
				return;
			case SpmmPackage.LOCATION_UNIT__REPRESENTS:
				setRepresents((Representation)newValue);
				return;
			case SpmmPackage.LOCATION_UNIT__NAME:
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
			case SpmmPackage.LOCATION_UNIT__IDENTIFICATIONS:
				getIdentifications().clear();
				return;
			case SpmmPackage.LOCATION_UNIT__UNIVERSE:
				setUniverse((Universe)null);
				return;
			case SpmmPackage.LOCATION_UNIT__REPRESENTS:
				setRepresents((Representation)null);
				return;
			case SpmmPackage.LOCATION_UNIT__NAME:
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
			case SpmmPackage.LOCATION_UNIT__IDENTIFICATIONS:
				return identifications != null && !identifications.isEmpty();
			case SpmmPackage.LOCATION_UNIT__UNIVERSE:
				return getUniverse() != null;
			case SpmmPackage.LOCATION_UNIT__REPRESENTS:
				return represents != null;
			case SpmmPackage.LOCATION_UNIT__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LocationUnitImpl
