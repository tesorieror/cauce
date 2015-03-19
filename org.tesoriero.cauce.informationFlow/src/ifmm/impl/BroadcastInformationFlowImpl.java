/**
 */
package ifmm.impl;

import ifmm.BroadcastInformationFlow;
import ifmm.BroadcastInformationFlowToEntityEdge;
import ifmm.EntityToBroadcastInformationFlowEdge;
import ifmm.IfmmPackage;
import ifmm.OutputData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broadcast Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifmm.impl.BroadcastInformationFlowImpl#getData <em>Data</em>}</li>
 *   <li>{@link ifmm.impl.BroadcastInformationFlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ifmm.impl.BroadcastInformationFlowImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BroadcastInformationFlowImpl extends InformationFlowImpl implements BroadcastInformationFlow {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputData> data;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EntityToBroadcastInformationFlowEdge source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected BroadcastInformationFlowToEntityEdge target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BroadcastInformationFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IfmmPackage.Literals.BROADCAST_INFORMATION_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<OutputData>(OutputData.class, this, IfmmPackage.BROADCAST_INFORMATION_FLOW__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityToBroadcastInformationFlowEdge getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (EntityToBroadcastInformationFlowEdge)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IfmmPackage.BROADCAST_INFORMATION_FLOW__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityToBroadcastInformationFlowEdge basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(EntityToBroadcastInformationFlowEdge newSource, NotificationChain msgs) {
		EntityToBroadcastInformationFlowEdge oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IfmmPackage.BROADCAST_INFORMATION_FLOW__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EntityToBroadcastInformationFlowEdge newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, IfmmPackage.ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE__TARGET, EntityToBroadcastInformationFlowEdge.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, IfmmPackage.ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE__TARGET, EntityToBroadcastInformationFlowEdge.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IfmmPackage.BROADCAST_INFORMATION_FLOW__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastInformationFlowToEntityEdge getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (BroadcastInformationFlowToEntityEdge)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IfmmPackage.BROADCAST_INFORMATION_FLOW__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastInformationFlowToEntityEdge basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(BroadcastInformationFlowToEntityEdge newTarget, NotificationChain msgs) {
		BroadcastInformationFlowToEntityEdge oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IfmmPackage.BROADCAST_INFORMATION_FLOW__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(BroadcastInformationFlowToEntityEdge newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, IfmmPackage.BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE, BroadcastInformationFlowToEntityEdge.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, IfmmPackage.BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE, BroadcastInformationFlowToEntityEdge.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IfmmPackage.BROADCAST_INFORMATION_FLOW__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, IfmmPackage.ENTITY_TO_BROADCAST_INFORMATION_FLOW_EDGE__TARGET, EntityToBroadcastInformationFlowEdge.class, msgs);
				return basicSetSource((EntityToBroadcastInformationFlowEdge)otherEnd, msgs);
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, IfmmPackage.BROADCAST_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE, BroadcastInformationFlowToEntityEdge.class, msgs);
				return basicSetTarget((BroadcastInformationFlowToEntityEdge)otherEnd, msgs);
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
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__SOURCE:
				return basicSetSource(null, msgs);
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__TARGET:
				return basicSetTarget(null, msgs);
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
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__DATA:
				return getData();
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__DATA:
				getData().clear();
				getData().addAll((Collection<? extends OutputData>)newValue);
				return;
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__SOURCE:
				setSource((EntityToBroadcastInformationFlowEdge)newValue);
				return;
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__TARGET:
				setTarget((BroadcastInformationFlowToEntityEdge)newValue);
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
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__DATA:
				getData().clear();
				return;
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__SOURCE:
				setSource((EntityToBroadcastInformationFlowEdge)null);
				return;
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__TARGET:
				setTarget((BroadcastInformationFlowToEntityEdge)null);
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
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__DATA:
				return data != null && !data.isEmpty();
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__SOURCE:
				return source != null;
			case IfmmPackage.BROADCAST_INFORMATION_FLOW__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //BroadcastInformationFlowImpl
