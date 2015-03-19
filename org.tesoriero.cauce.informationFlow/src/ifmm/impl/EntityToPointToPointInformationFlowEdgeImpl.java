/**
 */
package ifmm.impl;

import ifmm.EntityToPointToPointInformationFlowEdge;
import ifmm.IfmmPackage;
import ifmm.PointToPointInformationFlow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity To Point To Point Information Flow Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifmm.impl.EntityToPointToPointInformationFlowEdgeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityToPointToPointInformationFlowEdgeImpl extends EntityToInformationFlowEdgeImpl implements EntityToPointToPointInformationFlowEdge {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected PointToPointInformationFlow target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityToPointToPointInformationFlowEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IfmmPackage.Literals.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointToPointInformationFlow getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (PointToPointInformationFlow)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointToPointInformationFlow basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(PointToPointInformationFlow newTarget, NotificationChain msgs) {
		PointToPointInformationFlow oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(PointToPointInformationFlow newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE, PointToPointInformationFlow.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE, PointToPointInformationFlow.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE, PointToPointInformationFlow.class, msgs);
				return basicSetTarget((PointToPointInformationFlow)otherEnd, msgs);
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
			case IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET:
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
			case IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET:
				setTarget((PointToPointInformationFlow)newValue);
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
			case IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET:
				setTarget((PointToPointInformationFlow)null);
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
			case IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityToPointToPointInformationFlowEdgeImpl
