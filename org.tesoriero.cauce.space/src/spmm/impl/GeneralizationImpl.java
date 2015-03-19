/**
 */
package spmm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import spmm.Generalization;
import spmm.Space;
import spmm.SpmmPackage;
import spmm.Universe;
import spmm.VirtualSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spmm.impl.GeneralizationImpl#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.impl.GeneralizationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link spmm.impl.GeneralizationImpl#getGeneralizes <em>Generalizes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends SpaceRelationshipImpl implements Generalization {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected VirtualSpace parent;

	/**
	 * The cached value of the '{@link #getGeneralizes() <em>Generalizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizes()
	 * @generated
	 * @ordered
	 */
	protected Space generalizes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmmPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universe getUniverse() {
		if (eContainerFeatureID() != SpmmPackage.GENERALIZATION__UNIVERSE) return null;
		return (Universe)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniverse(Universe newUniverse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUniverse, SpmmPackage.GENERALIZATION__UNIVERSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniverse(Universe newUniverse) {
		if (newUniverse != eInternalContainer() || (eContainerFeatureID() != SpmmPackage.GENERALIZATION__UNIVERSE && newUniverse != null)) {
			if (EcoreUtil.isAncestor(this, newUniverse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUniverse != null)
				msgs = ((InternalEObject)newUniverse).eInverseAdd(this, SpmmPackage.UNIVERSE__GENERALIZATIONS, Universe.class, msgs);
			msgs = basicSetUniverse(newUniverse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.GENERALIZATION__UNIVERSE, newUniverse, newUniverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSpace getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (VirtualSpace)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpmmPackage.GENERALIZATION__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSpace basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(VirtualSpace newParent, NotificationChain msgs) {
		VirtualSpace oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpmmPackage.GENERALIZATION__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(VirtualSpace newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, SpmmPackage.VIRTUAL_SPACE__GENERALIZES, VirtualSpace.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, SpmmPackage.VIRTUAL_SPACE__GENERALIZES, VirtualSpace.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.GENERALIZATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space getGeneralizes() {
		if (generalizes != null && generalizes.eIsProxy()) {
			InternalEObject oldGeneralizes = (InternalEObject)generalizes;
			generalizes = (Space)eResolveProxy(oldGeneralizes);
			if (generalizes != oldGeneralizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpmmPackage.GENERALIZATION__GENERALIZES, oldGeneralizes, generalizes));
			}
		}
		return generalizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space basicGetGeneralizes() {
		return generalizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralizes(Space newGeneralizes, NotificationChain msgs) {
		Space oldGeneralizes = generalizes;
		generalizes = newGeneralizes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpmmPackage.GENERALIZATION__GENERALIZES, oldGeneralizes, newGeneralizes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralizes(Space newGeneralizes) {
		if (newGeneralizes != generalizes) {
			NotificationChain msgs = null;
			if (generalizes != null)
				msgs = ((InternalEObject)generalizes).eInverseRemove(this, SpmmPackage.SPACE__GENERALIZED_BY, Space.class, msgs);
			if (newGeneralizes != null)
				msgs = ((InternalEObject)newGeneralizes).eInverseAdd(this, SpmmPackage.SPACE__GENERALIZED_BY, Space.class, msgs);
			msgs = basicSetGeneralizes(newGeneralizes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.GENERALIZATION__GENERALIZES, newGeneralizes, newGeneralizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpmmPackage.GENERALIZATION__UNIVERSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUniverse((Universe)otherEnd, msgs);
			case SpmmPackage.GENERALIZATION__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, SpmmPackage.VIRTUAL_SPACE__GENERALIZES, VirtualSpace.class, msgs);
				return basicSetParent((VirtualSpace)otherEnd, msgs);
			case SpmmPackage.GENERALIZATION__GENERALIZES:
				if (generalizes != null)
					msgs = ((InternalEObject)generalizes).eInverseRemove(this, SpmmPackage.SPACE__GENERALIZED_BY, Space.class, msgs);
				return basicSetGeneralizes((Space)otherEnd, msgs);
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
			case SpmmPackage.GENERALIZATION__UNIVERSE:
				return basicSetUniverse(null, msgs);
			case SpmmPackage.GENERALIZATION__PARENT:
				return basicSetParent(null, msgs);
			case SpmmPackage.GENERALIZATION__GENERALIZES:
				return basicSetGeneralizes(null, msgs);
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
			case SpmmPackage.GENERALIZATION__UNIVERSE:
				return eInternalContainer().eInverseRemove(this, SpmmPackage.UNIVERSE__GENERALIZATIONS, Universe.class, msgs);
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
			case SpmmPackage.GENERALIZATION__UNIVERSE:
				return getUniverse();
			case SpmmPackage.GENERALIZATION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case SpmmPackage.GENERALIZATION__GENERALIZES:
				if (resolve) return getGeneralizes();
				return basicGetGeneralizes();
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
			case SpmmPackage.GENERALIZATION__UNIVERSE:
				setUniverse((Universe)newValue);
				return;
			case SpmmPackage.GENERALIZATION__PARENT:
				setParent((VirtualSpace)newValue);
				return;
			case SpmmPackage.GENERALIZATION__GENERALIZES:
				setGeneralizes((Space)newValue);
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
			case SpmmPackage.GENERALIZATION__UNIVERSE:
				setUniverse((Universe)null);
				return;
			case SpmmPackage.GENERALIZATION__PARENT:
				setParent((VirtualSpace)null);
				return;
			case SpmmPackage.GENERALIZATION__GENERALIZES:
				setGeneralizes((Space)null);
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
			case SpmmPackage.GENERALIZATION__UNIVERSE:
				return getUniverse() != null;
			case SpmmPackage.GENERALIZATION__PARENT:
				return parent != null;
			case SpmmPackage.GENERALIZATION__GENERALIZES:
				return generalizes != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneralizationImpl
