/**
 */
package ifmm.impl;

import ifmm.ContextAwareEntity;
import ifmm.Edge;
import ifmm.IfmmPackage;
import ifmm.InformationFlow;
import ifmm.SystemInformaitonFlow;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Informaiton Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifmm.impl.SystemInformaitonFlowImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link ifmm.impl.SystemInformaitonFlowImpl#getId <em>Id</em>}</li>
 *   <li>{@link ifmm.impl.SystemInformaitonFlowImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifmm.impl.SystemInformaitonFlowImpl#getInformationFlows <em>Information Flows</em>}</li>
 *   <li>{@link ifmm.impl.SystemInformaitonFlowImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemInformaitonFlowImpl extends MinimalEObjectImpl.Container implements SystemInformaitonFlow {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextAwareEntity> entities;

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
	protected static final String NAME_EDEFAULT = "ifmm-default";

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
	 * The cached value of the '{@link #getInformationFlows() <em>Information Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationFlow> informationFlows;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemInformaitonFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextAwareEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentWithInverseEList<ContextAwareEntity>(ContextAwareEntity.class, this, IfmmPackage.SYSTEM_INFORMAITON_FLOW__ENTITIES, IfmmPackage.CONTEXT_AWARE_ENTITY__SYSTEM);
		}
		return entities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IfmmPackage.SYSTEM_INFORMAITON_FLOW__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IfmmPackage.SYSTEM_INFORMAITON_FLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationFlow> getInformationFlows() {
		if (informationFlows == null) {
			informationFlows = new EObjectContainmentWithInverseEList<InformationFlow>(InformationFlow.class, this, IfmmPackage.SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS, IfmmPackage.INFORMATION_FLOW__SYSTEM);
		}
		return informationFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, IfmmPackage.SYSTEM_INFORMAITON_FLOW__EDGES, IfmmPackage.EDGE__SYSTEM);
		}
		return edges;
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
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntities()).basicAdd(otherEnd, msgs);
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInformationFlows()).basicAdd(otherEnd, msgs);
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdges()).basicAdd(otherEnd, msgs);
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
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS:
				return ((InternalEList<?>)getInformationFlows()).basicRemove(otherEnd, msgs);
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
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
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ENTITIES:
				return getEntities();
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ID:
				return getId();
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__NAME:
				return getName();
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS:
				return getInformationFlows();
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__EDGES:
				return getEdges();
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
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends ContextAwareEntity>)newValue);
				return;
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ID:
				setId((Integer)newValue);
				return;
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__NAME:
				setName((String)newValue);
				return;
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS:
				getInformationFlows().clear();
				getInformationFlows().addAll((Collection<? extends InformationFlow>)newValue);
				return;
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
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
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ENTITIES:
				getEntities().clear();
				return;
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ID:
				setId(ID_EDEFAULT);
				return;
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS:
				getInformationFlows().clear();
				return;
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__EDGES:
				getEdges().clear();
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
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ENTITIES:
				return entities != null && !entities.isEmpty();
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ID:
				return id != ID_EDEFAULT;
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS:
				return informationFlows != null && !informationFlows.isEmpty();
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__EDGES:
				return edges != null && !edges.isEmpty();
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

} //SystemInformaitonFlowImpl
