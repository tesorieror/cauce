/**
 */
package ifmm.impl;

import ifmm.EntityToPointToPointInformationFlowEdge;
import ifmm.IfmmPackage;
import ifmm.InputData;
import ifmm.OutputData;
import ifmm.PointToPointInformationFlow;
import ifmm.PointToPointInformationFlowToEntityEdge;

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
 * An implementation of the model object '<em><b>Point To Point Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifmm.impl.PointToPointInformationFlowImpl#getOutputData <em>Output Data</em>}</li>
 *   <li>{@link ifmm.impl.PointToPointInformationFlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ifmm.impl.PointToPointInformationFlowImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ifmm.impl.PointToPointInformationFlowImpl#getInputData <em>Input Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointToPointInformationFlowImpl extends InformationFlowImpl implements PointToPointInformationFlow {
	/**
	 * The cached value of the '{@link #getOutputData() <em>Output Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputData()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputData> outputData;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EntityToPointToPointInformationFlowEdge source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected PointToPointInformationFlowToEntityEdge target;

	/**
	 * The cached value of the '{@link #getInputData() <em>Input Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputData()
	 * @generated
	 * @ordered
	 */
	protected EList<InputData> inputData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointToPointInformationFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IfmmPackage.Literals.POINT_TO_POINT_INFORMATION_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputData> getOutputData() {
		if (outputData == null) {
			outputData = new EObjectContainmentEList<OutputData>(OutputData.class, this, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__OUTPUT_DATA);
		}
		return outputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityToPointToPointInformationFlowEdge getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (EntityToPointToPointInformationFlowEdge)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityToPointToPointInformationFlowEdge basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(EntityToPointToPointInformationFlowEdge newSource, NotificationChain msgs) {
		EntityToPointToPointInformationFlowEdge oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EntityToPointToPointInformationFlowEdge newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET, EntityToPointToPointInformationFlowEdge.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET, EntityToPointToPointInformationFlowEdge.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointToPointInformationFlowToEntityEdge getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (PointToPointInformationFlowToEntityEdge)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointToPointInformationFlowToEntityEdge basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(PointToPointInformationFlowToEntityEdge newTarget, NotificationChain msgs) {
		PointToPointInformationFlowToEntityEdge oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(PointToPointInformationFlowToEntityEdge newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE, PointToPointInformationFlowToEntityEdge.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE, PointToPointInformationFlowToEntityEdge.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputData> getInputData() {
		if (inputData == null) {
			inputData = new EObjectContainmentEList<InputData>(InputData.class, this, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__INPUT_DATA);
		}
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, IfmmPackage.ENTITY_TO_POINT_TO_POINT_INFORMATION_FLOW_EDGE__TARGET, EntityToPointToPointInformationFlowEdge.class, msgs);
				return basicSetSource((EntityToPointToPointInformationFlowEdge)otherEnd, msgs);
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW_TO_ENTITY_EDGE__SOURCE, PointToPointInformationFlowToEntityEdge.class, msgs);
				return basicSetTarget((PointToPointInformationFlowToEntityEdge)otherEnd, msgs);
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
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__OUTPUT_DATA:
				return ((InternalEList<?>)getOutputData()).basicRemove(otherEnd, msgs);
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE:
				return basicSetSource(null, msgs);
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__TARGET:
				return basicSetTarget(null, msgs);
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__INPUT_DATA:
				return ((InternalEList<?>)getInputData()).basicRemove(otherEnd, msgs);
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
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__OUTPUT_DATA:
				return getOutputData();
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__INPUT_DATA:
				return getInputData();
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
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__OUTPUT_DATA:
				getOutputData().clear();
				getOutputData().addAll((Collection<? extends OutputData>)newValue);
				return;
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE:
				setSource((EntityToPointToPointInformationFlowEdge)newValue);
				return;
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__TARGET:
				setTarget((PointToPointInformationFlowToEntityEdge)newValue);
				return;
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__INPUT_DATA:
				getInputData().clear();
				getInputData().addAll((Collection<? extends InputData>)newValue);
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
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__OUTPUT_DATA:
				getOutputData().clear();
				return;
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE:
				setSource((EntityToPointToPointInformationFlowEdge)null);
				return;
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__TARGET:
				setTarget((PointToPointInformationFlowToEntityEdge)null);
				return;
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__INPUT_DATA:
				getInputData().clear();
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
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__OUTPUT_DATA:
				return outputData != null && !outputData.isEmpty();
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__SOURCE:
				return source != null;
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__TARGET:
				return target != null;
			case IfmmPackage.POINT_TO_POINT_INFORMATION_FLOW__INPUT_DATA:
				return inputData != null && !inputData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PointToPointInformationFlowImpl
