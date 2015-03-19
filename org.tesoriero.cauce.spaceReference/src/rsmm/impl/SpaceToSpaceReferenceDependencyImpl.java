/**
 */
package rsmm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import rsmm.ReferentialSpace;
import rsmm.RsmmPackage;
import rsmm.SpaceToSpaceReferenceDependency;
import rsmm.SystemInformationFlowReferenceSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Space To Space Reference Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rsmm.impl.SpaceToSpaceReferenceDependencyImpl#getSystem <em>System</em>}</li>
 *   <li>{@link rsmm.impl.SpaceToSpaceReferenceDependencyImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpaceToSpaceReferenceDependencyImpl extends ReferenceDependencyImpl implements SpaceToSpaceReferenceDependency {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected ReferentialSpace child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceToSpaceReferenceDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RsmmPackage.Literals.SPACE_TO_SPACE_REFERENCE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInformationFlowReferenceSpace getSystem() {
		if (eContainerFeatureID() != RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM) return null;
		return (SystemInformationFlowReferenceSpace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(SystemInformationFlowReferenceSpace newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(SystemInformationFlowReferenceSpace newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES, SystemInformationFlowReferenceSpace.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferentialSpace getChild() {
		if (child != null && child.eIsProxy()) {
			InternalEObject oldChild = (InternalEObject)child;
			child = (ReferentialSpace)eResolveProxy(oldChild);
			if (child != oldChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD, oldChild, child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferentialSpace basicGetChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(ReferentialSpace newChild, NotificationChain msgs) {
		ReferentialSpace oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(ReferentialSpace newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY, ReferentialSpace.class, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY, ReferentialSpace.class, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((SystemInformationFlowReferenceSpace)otherEnd, msgs);
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD:
				if (child != null)
					msgs = ((InternalEObject)child).eInverseRemove(this, RsmmPackage.REFERENTIAL_SPACE__INCOMING_REFERENCE_DEPENDENCY, ReferentialSpace.class, msgs);
				return basicSetChild((ReferentialSpace)otherEnd, msgs);
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
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM:
				return basicSetSystem(null, msgs);
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD:
				return basicSetChild(null, msgs);
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
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM:
				return eInternalContainer().eInverseRemove(this, RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES, SystemInformationFlowReferenceSpace.class, msgs);
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
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM:
				return getSystem();
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
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
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM:
				setSystem((SystemInformationFlowReferenceSpace)newValue);
				return;
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD:
				setChild((ReferentialSpace)newValue);
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
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM:
				setSystem((SystemInformationFlowReferenceSpace)null);
				return;
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD:
				setChild((ReferentialSpace)null);
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
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__SYSTEM:
				return getSystem() != null;
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY__CHILD:
				return child != null;
		}
		return super.eIsSet(featureID);
	}

} //SpaceToSpaceReferenceDependencyImpl
