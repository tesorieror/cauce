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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rsmm.ReferenceDependency;
import rsmm.ReferentialSpace;
import rsmm.RsmmPackage;
import rsmm.SpaceToSpaceReferenceDependency;
import rsmm.SystemInformationFlowReferenceSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referential Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rsmm.impl.ReferentialSpaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link rsmm.impl.ReferentialSpaceImpl#getSystem <em>System</em>}</li>
 *   <li>{@link rsmm.impl.ReferentialSpaceImpl#getOngoingReferenceDependencies <em>Ongoing Reference Dependencies</em>}</li>
 *   <li>{@link rsmm.impl.ReferentialSpaceImpl#getIncomingReferenceDependency <em>Incoming Reference Dependency</em>}</li>
 *   <li>{@link rsmm.impl.ReferentialSpaceImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferentialSpaceImpl extends MinimalEObjectImpl.Container implements ReferentialSpace {
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
	 * The cached value of the '{@link #getOngoingReferenceDependencies() <em>Ongoing Reference Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoingReferenceDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceDependency> ongoingReferenceDependencies;

	/**
	 * The cached value of the '{@link #getIncomingReferenceDependency() <em>Incoming Reference Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingReferenceDependency()
	 * @generated
	 * @ordered
	 */
	protected SpaceToSpaceReferenceDependency incomingReferenceDependency;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = -1;

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
	protected ReferentialSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RsmmPackage.Literals.REFERENTIAL_SPACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.REFERENTIAL_SPACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInformationFlowReferenceSpace getSystem() {
		if (eContainerFeatureID() != RsmmPackage.REFERENTIAL_SPACE__SYSTEM) return null;
		return (SystemInformationFlowReferenceSpace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(SystemInformationFlowReferenceSpace newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, RsmmPackage.REFERENTIAL_SPACE__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(SystemInformationFlowReferenceSpace newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != RsmmPackage.REFERENTIAL_SPACE__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES, SystemInformationFlowReferenceSpace.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.REFERENTIAL_SPACE__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceDependency> getOngoingReferenceDependencies() {
		if (ongoingReferenceDependencies == null) {
			ongoingReferenceDependencies = new EObjectWithInverseResolvingEList<ReferenceDependency>(ReferenceDependency.class, this, RsmmPackage.REFERENTIAL_SPACE__ONGOING_REFERENCE_DEPENDENCIES, RsmmPackage.REFERENCE_DEPENDENCY__PARENT);
		}
		return ongoingReferenceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceToSpaceReferenceDependency getIncomingReferenceDependency() {
		if (incomingReferenceDependency != null && incomingReferenceDependency.eIsProxy()) {
			InternalEObject oldIncomingReferenceDependency = (InternalEObject)incomingReferenceDependency;
			incomingReferenceDependency = (SpaceToSpaceReferenceDependency)eResolveProxy(oldIncomingReferenceDependency);
			if (incomingReferenceDependency != oldIncomingReferenceDependency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY, oldIncomingReferenceDependency, incomingReferenceDependency));
			}
		}
		return incomingReferenceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceToSpaceReferenceDependency basicGetIncomingReferenceDependency() {
		return incomingReferenceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingReferenceDependency(SpaceToSpaceReferenceDependency newIncomingReferenceDependency, NotificationChain msgs) {
		SpaceToSpaceReferenceDependency oldIncomingReferenceDependency = incomingReferenceDependency;
		incomingReferenceDependency = newIncomingReferenceDependency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY, oldIncomingReferenceDependency, newIncomingReferenceDependency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingReferenceDependency(SpaceToSpaceReferenceDependency newIncomingReferenceDependency) {
		if (newIncomingReferenceDependency != incomingReferenceDependency) {
			NotificationChain msgs = null;
			if (incomingReferenceDependency != null)
				msgs = ((InternalEObject)incomingReferenceDependency).eInverseRemove(this, RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD, SpaceToSpaceReferenceDependency.class, msgs);
			if (newIncomingReferenceDependency != null)
				msgs = ((InternalEObject)newIncomingReferenceDependency).eInverseAdd(this, RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD, SpaceToSpaceReferenceDependency.class, msgs);
			msgs = basicSetIncomingReferenceDependency(newIncomingReferenceDependency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY, newIncomingReferenceDependency, newIncomingReferenceDependency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.REFERENTIAL_SPACE__ID, oldId, id));
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
			case RsmmPackage.REFERENTIAL_SPACE__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((SystemInformationFlowReferenceSpace)otherEnd, msgs);
			case RsmmPackage.REFERENTIAL_SPACE__ONGOING_REFERENCE_DEPENDENCIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOngoingReferenceDependencies()).basicAdd(otherEnd, msgs);
			case RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY:
				if (incomingReferenceDependency != null)
					msgs = ((InternalEObject)incomingReferenceDependency).eInverseRemove(this, RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD, SpaceToSpaceReferenceDependency.class, msgs);
				return basicSetIncomingReferenceDependency((SpaceToSpaceReferenceDependency)otherEnd, msgs);
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
			case RsmmPackage.REFERENTIAL_SPACE__SYSTEM:
				return basicSetSystem(null, msgs);
			case RsmmPackage.REFERENTIAL_SPACE__ONGOING_REFERENCE_DEPENDENCIES:
				return ((InternalEList<?>)getOngoingReferenceDependencies()).basicRemove(otherEnd, msgs);
			case RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY:
				return basicSetIncomingReferenceDependency(null, msgs);
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
			case RsmmPackage.REFERENTIAL_SPACE__SYSTEM:
				return eInternalContainer().eInverseRemove(this, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES, SystemInformationFlowReferenceSpace.class, msgs);
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
			case RsmmPackage.REFERENTIAL_SPACE__NAME:
				return getName();
			case RsmmPackage.REFERENTIAL_SPACE__SYSTEM:
				return getSystem();
			case RsmmPackage.REFERENTIAL_SPACE__ONGOING_REFERENCE_DEPENDENCIES:
				return getOngoingReferenceDependencies();
			case RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY:
				if (resolve) return getIncomingReferenceDependency();
				return basicGetIncomingReferenceDependency();
			case RsmmPackage.REFERENTIAL_SPACE__ID:
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
			case RsmmPackage.REFERENTIAL_SPACE__NAME:
				setName((String)newValue);
				return;
			case RsmmPackage.REFERENTIAL_SPACE__SYSTEM:
				setSystem((SystemInformationFlowReferenceSpace)newValue);
				return;
			case RsmmPackage.REFERENTIAL_SPACE__ONGOING_REFERENCE_DEPENDENCIES:
				getOngoingReferenceDependencies().clear();
				getOngoingReferenceDependencies().addAll((Collection<? extends ReferenceDependency>)newValue);
				return;
			case RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY:
				setIncomingReferenceDependency((SpaceToSpaceReferenceDependency)newValue);
				return;
			case RsmmPackage.REFERENTIAL_SPACE__ID:
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
			case RsmmPackage.REFERENTIAL_SPACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RsmmPackage.REFERENTIAL_SPACE__SYSTEM:
				setSystem((SystemInformationFlowReferenceSpace)null);
				return;
			case RsmmPackage.REFERENTIAL_SPACE__ONGOING_REFERENCE_DEPENDENCIES:
				getOngoingReferenceDependencies().clear();
				return;
			case RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY:
				setIncomingReferenceDependency((SpaceToSpaceReferenceDependency)null);
				return;
			case RsmmPackage.REFERENTIAL_SPACE__ID:
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
			case RsmmPackage.REFERENTIAL_SPACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RsmmPackage.REFERENTIAL_SPACE__SYSTEM:
				return getSystem() != null;
			case RsmmPackage.REFERENTIAL_SPACE__ONGOING_REFERENCE_DEPENDENCIES:
				return ongoingReferenceDependencies != null && !ongoingReferenceDependencies.isEmpty();
			case RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY:
				return incomingReferenceDependency != null;
			case RsmmPackage.REFERENTIAL_SPACE__ID:
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

} //ReferentialSpaceImpl
