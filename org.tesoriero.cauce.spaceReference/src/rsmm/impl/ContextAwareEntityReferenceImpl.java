/**
 */
package rsmm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import rsmm.ContextAwareEntityReference;
import rsmm.RsmmPackage;
import rsmm.SpaceToEntityReferenceDependency;
import rsmm.SystemInformationFlowReferenceSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Aware Entity Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rsmm.impl.ContextAwareEntityReferenceImpl#getSystem <em>System</em>}</li>
 *   <li>{@link rsmm.impl.ContextAwareEntityReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link rsmm.impl.ContextAwareEntityReferenceImpl#getIncomingReferenceDependency <em>Incoming Reference Dependency</em>}</li>
 *   <li>{@link rsmm.impl.ContextAwareEntityReferenceImpl#getId <em>Id</em>}</li>
 *   <li>{@link rsmm.impl.ContextAwareEntityReferenceImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextAwareEntityReferenceImpl extends MinimalEObjectImpl.Container implements ContextAwareEntityReference {
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
	 * The cached value of the '{@link #getIncomingReferenceDependency() <em>Incoming Reference Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingReferenceDependency()
	 * @generated
	 * @ordered
	 */
	protected SpaceToEntityReferenceDependency incomingReferenceDependency;

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
	 * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected String entity = ENTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextAwareEntityReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RsmmPackage.Literals.CONTEXT_AWARE_ENTITY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInformationFlowReferenceSpace getSystem() {
		if (eContainerFeatureID() != RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM) return null;
		return (SystemInformationFlowReferenceSpace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(SystemInformationFlowReferenceSpace newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(SystemInformationFlowReferenceSpace newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES, SystemInformationFlowReferenceSpace.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM, newSystem, newSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceToEntityReferenceDependency getIncomingReferenceDependency() {
		if (incomingReferenceDependency != null && incomingReferenceDependency.eIsProxy()) {
			InternalEObject oldIncomingReferenceDependency = (InternalEObject)incomingReferenceDependency;
			incomingReferenceDependency = (SpaceToEntityReferenceDependency)eResolveProxy(oldIncomingReferenceDependency);
			if (incomingReferenceDependency != oldIncomingReferenceDependency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY, oldIncomingReferenceDependency, incomingReferenceDependency));
			}
		}
		return incomingReferenceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceToEntityReferenceDependency basicGetIncomingReferenceDependency() {
		return incomingReferenceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingReferenceDependency(SpaceToEntityReferenceDependency newIncomingReferenceDependency, NotificationChain msgs) {
		SpaceToEntityReferenceDependency oldIncomingReferenceDependency = incomingReferenceDependency;
		incomingReferenceDependency = newIncomingReferenceDependency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY, oldIncomingReferenceDependency, newIncomingReferenceDependency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingReferenceDependency(SpaceToEntityReferenceDependency newIncomingReferenceDependency) {
		if (newIncomingReferenceDependency != incomingReferenceDependency) {
			NotificationChain msgs = null;
			if (incomingReferenceDependency != null)
				msgs = ((InternalEObject)incomingReferenceDependency).eInverseRemove(this, RsmmPackage.SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__CHILD, SpaceToEntityReferenceDependency.class, msgs);
			if (newIncomingReferenceDependency != null)
				msgs = ((InternalEObject)newIncomingReferenceDependency).eInverseAdd(this, RsmmPackage.SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__CHILD, SpaceToEntityReferenceDependency.class, msgs);
			msgs = basicSetIncomingReferenceDependency(newIncomingReferenceDependency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY, newIncomingReferenceDependency, newIncomingReferenceDependency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(String newEntity) {
		String oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((SystemInformationFlowReferenceSpace)otherEnd, msgs);
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY:
				if (incomingReferenceDependency != null)
					msgs = ((InternalEObject)incomingReferenceDependency).eInverseRemove(this, RsmmPackage.SPACE_TO_ENTITY_REFERENCE_DEPENDENCY__CHILD, SpaceToEntityReferenceDependency.class, msgs);
				return basicSetIncomingReferenceDependency((SpaceToEntityReferenceDependency)otherEnd, msgs);
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
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM:
				return basicSetSystem(null, msgs);
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY:
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
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM:
				return eInternalContainer().eInverseRemove(this, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES, SystemInformationFlowReferenceSpace.class, msgs);
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
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM:
				return getSystem();
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__NAME:
				return getName();
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY:
				if (resolve) return getIncomingReferenceDependency();
				return basicGetIncomingReferenceDependency();
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__ID:
				return getId();
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__ENTITY:
				return getEntity();
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
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM:
				setSystem((SystemInformationFlowReferenceSpace)newValue);
				return;
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY:
				setIncomingReferenceDependency((SpaceToEntityReferenceDependency)newValue);
				return;
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__ID:
				setId((Integer)newValue);
				return;
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__ENTITY:
				setEntity((String)newValue);
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
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM:
				setSystem((SystemInformationFlowReferenceSpace)null);
				return;
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY:
				setIncomingReferenceDependency((SpaceToEntityReferenceDependency)null);
				return;
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__ID:
				setId(ID_EDEFAULT);
				return;
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__ENTITY:
				setEntity(ENTITY_EDEFAULT);
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
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__SYSTEM:
				return getSystem() != null;
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__INCOMING_REFERENCE_DEPENDENCY:
				return incomingReferenceDependency != null;
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__ID:
				return id != ID_EDEFAULT;
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE__ENTITY:
				return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
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
		result.append(", entity: ");
		result.append(entity);
		result.append(')');
		return result.toString();
	}

} //ContextAwareEntityReferenceImpl
