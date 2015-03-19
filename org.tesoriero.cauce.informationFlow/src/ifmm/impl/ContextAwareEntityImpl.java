/**
 */
package ifmm.impl;

import ifmm.ContextAwareEntity;
import ifmm.EntityToInformationFlowEdge;
import ifmm.IfmmPackage;
import ifmm.InformationFlowToEntityEdge;
import ifmm.SystemInformaitonFlow;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Aware Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifmm.impl.ContextAwareEntityImpl#getSystem <em>System</em>}</li>
 *   <li>{@link ifmm.impl.ContextAwareEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link ifmm.impl.ContextAwareEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifmm.impl.ContextAwareEntityImpl#getOngoingInformationFlows <em>Ongoing Information Flows</em>}</li>
 *   <li>{@link ifmm.impl.ContextAwareEntityImpl#getIncomingInformationFlows <em>Incoming Information Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextAwareEntityImpl extends MinimalEObjectImpl.Container implements ContextAwareEntity {
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
	 * The cached value of the '{@link #getOngoingInformationFlows() <em>Ongoing Information Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoingInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityToInformationFlowEdge> ongoingInformationFlows;

	/**
	 * The cached value of the '{@link #getIncomingInformationFlows() <em>Incoming Information Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationFlowToEntityEdge> incomingInformationFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextAwareEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IfmmPackage.Literals.CONTEXT_AWARE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInformaitonFlow getSystem() {
		if (eContainerFeatureID() != IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM) return null;
		return (SystemInformaitonFlow)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(SystemInformaitonFlow newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(SystemInformaitonFlow newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, IfmmPackage.SYSTEM_INFORMAITON_FLOW__ENTITIES, SystemInformaitonFlow.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM, newSystem, newSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IfmmPackage.CONTEXT_AWARE_ENTITY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IfmmPackage.CONTEXT_AWARE_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityToInformationFlowEdge> getOngoingInformationFlows() {
		if (ongoingInformationFlows == null) {
			ongoingInformationFlows = new EObjectWithInverseResolvingEList<EntityToInformationFlowEdge>(EntityToInformationFlowEdge.class, this, IfmmPackage.CONTEXT_AWARE_ENTITY__ONGOING_INFORMATION_FLOWS, IfmmPackage.ENTITY_TO_INFORMATION_FLOW_EDGE__SOURCE);
		}
		return ongoingInformationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationFlowToEntityEdge> getIncomingInformationFlows() {
		if (incomingInformationFlows == null) {
			incomingInformationFlows = new EObjectWithInverseResolvingEList<InformationFlowToEntityEdge>(InformationFlowToEntityEdge.class, this, IfmmPackage.CONTEXT_AWARE_ENTITY__INCOMING_INFORMATION_FLOWS, IfmmPackage.INFORMATION_FLOW_TO_ENTITY_EDGE__TARGET);
		}
		return incomingInformationFlows;
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
			case IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((SystemInformaitonFlow)otherEnd, msgs);
			case IfmmPackage.CONTEXT_AWARE_ENTITY__ONGOING_INFORMATION_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOngoingInformationFlows()).basicAdd(otherEnd, msgs);
			case IfmmPackage.CONTEXT_AWARE_ENTITY__INCOMING_INFORMATION_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingInformationFlows()).basicAdd(otherEnd, msgs);
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
			case IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM:
				return basicSetSystem(null, msgs);
			case IfmmPackage.CONTEXT_AWARE_ENTITY__ONGOING_INFORMATION_FLOWS:
				return ((InternalEList<?>)getOngoingInformationFlows()).basicRemove(otherEnd, msgs);
			case IfmmPackage.CONTEXT_AWARE_ENTITY__INCOMING_INFORMATION_FLOWS:
				return ((InternalEList<?>)getIncomingInformationFlows()).basicRemove(otherEnd, msgs);
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
			case IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM:
				return eInternalContainer().eInverseRemove(this, IfmmPackage.SYSTEM_INFORMAITON_FLOW__ENTITIES, SystemInformaitonFlow.class, msgs);
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
			case IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM:
				return getSystem();
			case IfmmPackage.CONTEXT_AWARE_ENTITY__ID:
				return getId();
			case IfmmPackage.CONTEXT_AWARE_ENTITY__NAME:
				return getName();
			case IfmmPackage.CONTEXT_AWARE_ENTITY__ONGOING_INFORMATION_FLOWS:
				return getOngoingInformationFlows();
			case IfmmPackage.CONTEXT_AWARE_ENTITY__INCOMING_INFORMATION_FLOWS:
				return getIncomingInformationFlows();
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
			case IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM:
				setSystem((SystemInformaitonFlow)newValue);
				return;
			case IfmmPackage.CONTEXT_AWARE_ENTITY__ID:
				setId((Integer)newValue);
				return;
			case IfmmPackage.CONTEXT_AWARE_ENTITY__NAME:
				setName((String)newValue);
				return;
			case IfmmPackage.CONTEXT_AWARE_ENTITY__ONGOING_INFORMATION_FLOWS:
				getOngoingInformationFlows().clear();
				getOngoingInformationFlows().addAll((Collection<? extends EntityToInformationFlowEdge>)newValue);
				return;
			case IfmmPackage.CONTEXT_AWARE_ENTITY__INCOMING_INFORMATION_FLOWS:
				getIncomingInformationFlows().clear();
				getIncomingInformationFlows().addAll((Collection<? extends InformationFlowToEntityEdge>)newValue);
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
			case IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM:
				setSystem((SystemInformaitonFlow)null);
				return;
			case IfmmPackage.CONTEXT_AWARE_ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case IfmmPackage.CONTEXT_AWARE_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IfmmPackage.CONTEXT_AWARE_ENTITY__ONGOING_INFORMATION_FLOWS:
				getOngoingInformationFlows().clear();
				return;
			case IfmmPackage.CONTEXT_AWARE_ENTITY__INCOMING_INFORMATION_FLOWS:
				getIncomingInformationFlows().clear();
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
			case IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM:
				return getSystem() != null;
			case IfmmPackage.CONTEXT_AWARE_ENTITY__ID:
				return id != ID_EDEFAULT;
			case IfmmPackage.CONTEXT_AWARE_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IfmmPackage.CONTEXT_AWARE_ENTITY__ONGOING_INFORMATION_FLOWS:
				return ongoingInformationFlows != null && !ongoingInformationFlows.isEmpty();
			case IfmmPackage.CONTEXT_AWARE_ENTITY__INCOMING_INFORMATION_FLOWS:
				return incomingInformationFlows != null && !incomingInformationFlows.isEmpty();
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

} //ContextAwareEntityImpl
