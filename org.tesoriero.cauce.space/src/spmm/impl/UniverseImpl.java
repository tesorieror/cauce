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
import org.eclipse.emf.ecore.util.InternalEList;

import spmm.Contention;
import spmm.Generalization;
import spmm.Grouping;
import spmm.LocationUnit;
import spmm.PhysicalSpace;
import spmm.Representation;
import spmm.SpmmPackage;
import spmm.Universe;
import spmm.VirtualSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spmm.impl.UniverseImpl#getName <em>Name</em>}</li>
 *   <li>{@link spmm.impl.UniverseImpl#getId <em>Id</em>}</li>
 *   <li>{@link spmm.impl.UniverseImpl#getGroupings <em>Groupings</em>}</li>
 *   <li>{@link spmm.impl.UniverseImpl#getGeneralizations <em>Generalizations</em>}</li>
 *   <li>{@link spmm.impl.UniverseImpl#getContentions <em>Contentions</em>}</li>
 *   <li>{@link spmm.impl.UniverseImpl#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link spmm.impl.UniverseImpl#getVirtualSpaces <em>Virtual Spaces</em>}</li>
 *   <li>{@link spmm.impl.UniverseImpl#getPhysicalSpaces <em>Physical Spaces</em>}</li>
 *   <li>{@link spmm.impl.UniverseImpl#getLocationUnits <em>Location Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniverseImpl extends MinimalEObjectImpl.Container implements Universe {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "spmm-diagram";

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
	 * The cached value of the '{@link #getGroupings() <em>Groupings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupings()
	 * @generated
	 * @ordered
	 */
	protected EList<Grouping> groupings;

	/**
	 * The cached value of the '{@link #getGeneralizations() <em>Generalizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizations;

	/**
	 * The cached value of the '{@link #getContentions() <em>Contentions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentions()
	 * @generated
	 * @ordered
	 */
	protected EList<Contention> contentions;

	/**
	 * The cached value of the '{@link #getRepresentations() <em>Representations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<Representation> representations;

	/**
	 * The cached value of the '{@link #getVirtualSpaces() <em>Virtual Spaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualSpace> virtualSpaces;

	/**
	 * The cached value of the '{@link #getPhysicalSpaces() <em>Physical Spaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalSpace> physicalSpaces;

	/**
	 * The cached value of the '{@link #getLocationUnits() <em>Location Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationUnit> locationUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniverseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmmPackage.Literals.UNIVERSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.UNIVERSE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.UNIVERSE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grouping> getGroupings() {
		if (groupings == null) {
			groupings = new EObjectContainmentWithInverseEList<Grouping>(Grouping.class, this, SpmmPackage.UNIVERSE__GROUPINGS, SpmmPackage.GROUPING__UNIVERSE);
		}
		return groupings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizations() {
		if (generalizations == null) {
			generalizations = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, SpmmPackage.UNIVERSE__GENERALIZATIONS, SpmmPackage.GENERALIZATION__UNIVERSE);
		}
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contention> getContentions() {
		if (contentions == null) {
			contentions = new EObjectContainmentWithInverseEList<Contention>(Contention.class, this, SpmmPackage.UNIVERSE__CONTENTIONS, SpmmPackage.CONTENTION__UNIVERSE);
		}
		return contentions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Representation> getRepresentations() {
		if (representations == null) {
			representations = new EObjectContainmentWithInverseEList<Representation>(Representation.class, this, SpmmPackage.UNIVERSE__REPRESENTATIONS, SpmmPackage.REPRESENTATION__UNIVERSE);
		}
		return representations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualSpace> getVirtualSpaces() {
		if (virtualSpaces == null) {
			virtualSpaces = new EObjectContainmentWithInverseEList<VirtualSpace>(VirtualSpace.class, this, SpmmPackage.UNIVERSE__VIRTUAL_SPACES, SpmmPackage.VIRTUAL_SPACE__UNIVERSE);
		}
		return virtualSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalSpace> getPhysicalSpaces() {
		if (physicalSpaces == null) {
			physicalSpaces = new EObjectContainmentWithInverseEList<PhysicalSpace>(PhysicalSpace.class, this, SpmmPackage.UNIVERSE__PHYSICAL_SPACES, SpmmPackage.PHYSICAL_SPACE__UNIVERSE);
		}
		return physicalSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationUnit> getLocationUnits() {
		if (locationUnits == null) {
			locationUnits = new EObjectContainmentWithInverseEList<LocationUnit>(LocationUnit.class, this, SpmmPackage.UNIVERSE__LOCATION_UNITS, SpmmPackage.LOCATION_UNIT__UNIVERSE);
		}
		return locationUnits;
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
			case SpmmPackage.UNIVERSE__GROUPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroupings()).basicAdd(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__GENERALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralizations()).basicAdd(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__CONTENTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContentions()).basicAdd(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__REPRESENTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRepresentations()).basicAdd(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__VIRTUAL_SPACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtualSpaces()).basicAdd(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__PHYSICAL_SPACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPhysicalSpaces()).basicAdd(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__LOCATION_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocationUnits()).basicAdd(otherEnd, msgs);
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
			case SpmmPackage.UNIVERSE__GROUPINGS:
				return ((InternalEList<?>)getGroupings()).basicRemove(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__GENERALIZATIONS:
				return ((InternalEList<?>)getGeneralizations()).basicRemove(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__CONTENTIONS:
				return ((InternalEList<?>)getContentions()).basicRemove(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__REPRESENTATIONS:
				return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__VIRTUAL_SPACES:
				return ((InternalEList<?>)getVirtualSpaces()).basicRemove(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__PHYSICAL_SPACES:
				return ((InternalEList<?>)getPhysicalSpaces()).basicRemove(otherEnd, msgs);
			case SpmmPackage.UNIVERSE__LOCATION_UNITS:
				return ((InternalEList<?>)getLocationUnits()).basicRemove(otherEnd, msgs);
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
			case SpmmPackage.UNIVERSE__NAME:
				return getName();
			case SpmmPackage.UNIVERSE__ID:
				return getId();
			case SpmmPackage.UNIVERSE__GROUPINGS:
				return getGroupings();
			case SpmmPackage.UNIVERSE__GENERALIZATIONS:
				return getGeneralizations();
			case SpmmPackage.UNIVERSE__CONTENTIONS:
				return getContentions();
			case SpmmPackage.UNIVERSE__REPRESENTATIONS:
				return getRepresentations();
			case SpmmPackage.UNIVERSE__VIRTUAL_SPACES:
				return getVirtualSpaces();
			case SpmmPackage.UNIVERSE__PHYSICAL_SPACES:
				return getPhysicalSpaces();
			case SpmmPackage.UNIVERSE__LOCATION_UNITS:
				return getLocationUnits();
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
			case SpmmPackage.UNIVERSE__NAME:
				setName((String)newValue);
				return;
			case SpmmPackage.UNIVERSE__ID:
				setId((Integer)newValue);
				return;
			case SpmmPackage.UNIVERSE__GROUPINGS:
				getGroupings().clear();
				getGroupings().addAll((Collection<? extends Grouping>)newValue);
				return;
			case SpmmPackage.UNIVERSE__GENERALIZATIONS:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection<? extends Generalization>)newValue);
				return;
			case SpmmPackage.UNIVERSE__CONTENTIONS:
				getContentions().clear();
				getContentions().addAll((Collection<? extends Contention>)newValue);
				return;
			case SpmmPackage.UNIVERSE__REPRESENTATIONS:
				getRepresentations().clear();
				getRepresentations().addAll((Collection<? extends Representation>)newValue);
				return;
			case SpmmPackage.UNIVERSE__VIRTUAL_SPACES:
				getVirtualSpaces().clear();
				getVirtualSpaces().addAll((Collection<? extends VirtualSpace>)newValue);
				return;
			case SpmmPackage.UNIVERSE__PHYSICAL_SPACES:
				getPhysicalSpaces().clear();
				getPhysicalSpaces().addAll((Collection<? extends PhysicalSpace>)newValue);
				return;
			case SpmmPackage.UNIVERSE__LOCATION_UNITS:
				getLocationUnits().clear();
				getLocationUnits().addAll((Collection<? extends LocationUnit>)newValue);
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
			case SpmmPackage.UNIVERSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpmmPackage.UNIVERSE__ID:
				setId(ID_EDEFAULT);
				return;
			case SpmmPackage.UNIVERSE__GROUPINGS:
				getGroupings().clear();
				return;
			case SpmmPackage.UNIVERSE__GENERALIZATIONS:
				getGeneralizations().clear();
				return;
			case SpmmPackage.UNIVERSE__CONTENTIONS:
				getContentions().clear();
				return;
			case SpmmPackage.UNIVERSE__REPRESENTATIONS:
				getRepresentations().clear();
				return;
			case SpmmPackage.UNIVERSE__VIRTUAL_SPACES:
				getVirtualSpaces().clear();
				return;
			case SpmmPackage.UNIVERSE__PHYSICAL_SPACES:
				getPhysicalSpaces().clear();
				return;
			case SpmmPackage.UNIVERSE__LOCATION_UNITS:
				getLocationUnits().clear();
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
			case SpmmPackage.UNIVERSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpmmPackage.UNIVERSE__ID:
				return id != ID_EDEFAULT;
			case SpmmPackage.UNIVERSE__GROUPINGS:
				return groupings != null && !groupings.isEmpty();
			case SpmmPackage.UNIVERSE__GENERALIZATIONS:
				return generalizations != null && !generalizations.isEmpty();
			case SpmmPackage.UNIVERSE__CONTENTIONS:
				return contentions != null && !contentions.isEmpty();
			case SpmmPackage.UNIVERSE__REPRESENTATIONS:
				return representations != null && !representations.isEmpty();
			case SpmmPackage.UNIVERSE__VIRTUAL_SPACES:
				return virtualSpaces != null && !virtualSpaces.isEmpty();
			case SpmmPackage.UNIVERSE__PHYSICAL_SPACES:
				return physicalSpaces != null && !physicalSpaces.isEmpty();
			case SpmmPackage.UNIVERSE__LOCATION_UNITS:
				return locationUnits != null && !locationUnits.isEmpty();
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

} //UniverseImpl
