/**
 */
package rsmm.impl;

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

import rsmm.ContextAwareEntityReference;
import rsmm.ReferentialSpace;
import rsmm.RsmmPackage;
import rsmm.SpaceToEntityReferenceDependency;
import rsmm.SpaceToSpaceReferenceDependency;
import rsmm.SystemInformationFlowReferenceSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Information Flow Reference Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rsmm.impl.SystemInformationFlowReferenceSpaceImpl#getReferentialSpaces <em>Referential Spaces</em>}</li>
 *   <li>{@link rsmm.impl.SystemInformationFlowReferenceSpaceImpl#getSpaceToSpaceReferenceDependencies <em>Space To Space Reference Dependencies</em>}</li>
 *   <li>{@link rsmm.impl.SystemInformationFlowReferenceSpaceImpl#getSpaceToEntityReferenceDependencies <em>Space To Entity Reference Dependencies</em>}</li>
 *   <li>{@link rsmm.impl.SystemInformationFlowReferenceSpaceImpl#getEntityReferences <em>Entity References</em>}</li>
 *   <li>{@link rsmm.impl.SystemInformationFlowReferenceSpaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link rsmm.impl.SystemInformationFlowReferenceSpaceImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemInformationFlowReferenceSpaceImpl extends MinimalEObjectImpl.Container implements SystemInformationFlowReferenceSpace {
	/**
	 * The cached value of the '{@link #getReferentialSpaces() <em>Referential Spaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferentialSpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferentialSpace> referentialSpaces;

	/**
	 * The cached value of the '{@link #getSpaceToSpaceReferenceDependencies() <em>Space To Space Reference Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceToSpaceReferenceDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<SpaceToSpaceReferenceDependency> spaceToSpaceReferenceDependencies;

	/**
	 * The cached value of the '{@link #getSpaceToEntityReferenceDependencies() <em>Space To Entity Reference Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceToEntityReferenceDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<SpaceToEntityReferenceDependency> spaceToEntityReferenceDependencies;

	/**
	 * The cached value of the '{@link #getEntityReferences() <em>Entity References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextAwareEntityReference> entityReferences;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "rsmm-default";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemInformationFlowReferenceSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RsmmPackage.Literals.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferentialSpace> getReferentialSpaces() {
		if (referentialSpaces == null) {
			referentialSpaces = new EObjectContainmentWithInverseEList<ReferentialSpace>(ReferentialSpace.class, this, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES, RsmmPackage.REFERENTIAL_SPACE__SYSTEM);
		}
		return referentialSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpaceToSpaceReferenceDependency> getSpaceToSpaceReferenceDependencies() {
		if (spaceToSpaceReferenceDependencies == null) {
			spaceToSpaceReferenceDependencies = new EObjectContainmentWithInverseEList<SpaceToSpaceReferenceDependency>(SpaceToSpaceReferenceDependency.class, this, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES, RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM);
		}
		return spaceToSpaceReferenceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpaceToEntityReferenceDependency> getSpaceToEntityReferenceDependencies() {
		if (spaceToEntityReferenceDependencies == null) {
			spaceToEntityReferenceDependencies = new EObjectContainmentWithInverseEList<SpaceToEntityReferenceDependency>(SpaceToEntityReferenceDependency.class, this, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES, RsmmPackage.SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__SYSTEM);
		}
		return spaceToEntityReferenceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextAwareEntityReference> getEntityReferences() {
		if (entityReferences == null) {
			entityReferences = new EObjectContainmentWithInverseEList<ContextAwareEntityReference>(ContextAwareEntityReference.class, this, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES, RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM);
		}
		return entityReferences;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ID, oldId, id));
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
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferentialSpaces()).basicAdd(otherEnd, msgs);
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpaceToSpaceReferenceDependencies()).basicAdd(otherEnd, msgs);
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpaceToEntityReferenceDependencies()).basicAdd(otherEnd, msgs);
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntityReferences()).basicAdd(otherEnd, msgs);
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
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES:
				return ((InternalEList<?>)getReferentialSpaces()).basicRemove(otherEnd, msgs);
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES:
				return ((InternalEList<?>)getSpaceToSpaceReferenceDependencies()).basicRemove(otherEnd, msgs);
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES:
				return ((InternalEList<?>)getSpaceToEntityReferenceDependencies()).basicRemove(otherEnd, msgs);
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES:
				return ((InternalEList<?>)getEntityReferences()).basicRemove(otherEnd, msgs);
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
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES:
				return getReferentialSpaces();
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES:
				return getSpaceToSpaceReferenceDependencies();
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES:
				return getSpaceToEntityReferenceDependencies();
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES:
				return getEntityReferences();
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__NAME:
				return getName();
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ID:
				return getId();
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
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES:
				getReferentialSpaces().clear();
				getReferentialSpaces().addAll((Collection<? extends ReferentialSpace>)newValue);
				return;
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES:
				getSpaceToSpaceReferenceDependencies().clear();
				getSpaceToSpaceReferenceDependencies().addAll((Collection<? extends SpaceToSpaceReferenceDependency>)newValue);
				return;
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES:
				getSpaceToEntityReferenceDependencies().clear();
				getSpaceToEntityReferenceDependencies().addAll((Collection<? extends SpaceToEntityReferenceDependency>)newValue);
				return;
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES:
				getEntityReferences().clear();
				getEntityReferences().addAll((Collection<? extends ContextAwareEntityReference>)newValue);
				return;
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__NAME:
				setName((String)newValue);
				return;
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ID:
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
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES:
				getReferentialSpaces().clear();
				return;
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES:
				getSpaceToSpaceReferenceDependencies().clear();
				return;
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES:
				getSpaceToEntityReferenceDependencies().clear();
				return;
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES:
				getEntityReferences().clear();
				return;
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ID:
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
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES:
				return referentialSpaces != null && !referentialSpaces.isEmpty();
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES:
				return spaceToSpaceReferenceDependencies != null && !spaceToSpaceReferenceDependencies.isEmpty();
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES:
				return spaceToEntityReferenceDependencies != null && !spaceToEntityReferenceDependencies.isEmpty();
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES:
				return entityReferences != null && !entityReferences.isEmpty();
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ID:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SystemInformationFlowReferenceSpaceImpl
