/**
 */
package spmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import spmm.Contention;
import spmm.PhysicalSpace;
import spmm.Representation;
import spmm.SpmmPackage;
import spmm.Universe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spmm.impl.PhysicalSpaceImpl#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.impl.PhysicalSpaceImpl#getRepresentedBy <em>Represented By</em>}</li>
 *   <li>{@link spmm.impl.PhysicalSpaceImpl#getInnerSpaces <em>Inner Spaces</em>}</li>
 *   <li>{@link spmm.impl.PhysicalSpaceImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalSpaceImpl extends SpaceImpl implements PhysicalSpace {
	/**
	 * The cached value of the '{@link #getRepresentedBy() <em>Represented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedBy()
	 * @generated
	 * @ordered
	 */
	protected Representation representedBy;

	/**
	 * The cached value of the '{@link #getInnerSpaces() <em>Inner Spaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerSpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Contention> innerSpaces;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected Contention container;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmmPackage.Literals.PHYSICAL_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universe getUniverse() {
		if (eContainerFeatureID() != SpmmPackage.PHYSICAL_SPACE__UNIVERSE) return null;
		return (Universe)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniverse(Universe newUniverse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUniverse, SpmmPackage.PHYSICAL_SPACE__UNIVERSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniverse(Universe newUniverse) {
		if (newUniverse != eInternalContainer() || (eContainerFeatureID() != SpmmPackage.PHYSICAL_SPACE__UNIVERSE && newUniverse != null)) {
			if (EcoreUtil.isAncestor(this, newUniverse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUniverse != null)
				msgs = ((InternalEObject)newUniverse).eInverseAdd(this, SpmmPackage.UNIVERSE__PHYSICAL_SPACES, Universe.class, msgs);
			msgs = basicSetUniverse(newUniverse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.PHYSICAL_SPACE__UNIVERSE, newUniverse, newUniverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation getRepresentedBy() {
		if (representedBy != null && representedBy.eIsProxy()) {
			InternalEObject oldRepresentedBy = (InternalEObject)representedBy;
			representedBy = (Representation)eResolveProxy(oldRepresentedBy);
			if (representedBy != oldRepresentedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY, oldRepresentedBy, representedBy));
			}
		}
		return representedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation basicGetRepresentedBy() {
		return representedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentedBy(Representation newRepresentedBy, NotificationChain msgs) {
		Representation oldRepresentedBy = representedBy;
		representedBy = newRepresentedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY, oldRepresentedBy, newRepresentedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedBy(Representation newRepresentedBy) {
		if (newRepresentedBy != representedBy) {
			NotificationChain msgs = null;
			if (representedBy != null)
				msgs = ((InternalEObject)representedBy).eInverseRemove(this, SpmmPackage.REPRESENTATION__REPRESENTS, Representation.class, msgs);
			if (newRepresentedBy != null)
				msgs = ((InternalEObject)newRepresentedBy).eInverseAdd(this, SpmmPackage.REPRESENTATION__REPRESENTS, Representation.class, msgs);
			msgs = basicSetRepresentedBy(newRepresentedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY, newRepresentedBy, newRepresentedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contention> getInnerSpaces() {
		if (innerSpaces == null) {
			innerSpaces = new EObjectWithInverseResolvingEList<Contention>(Contention.class, this, SpmmPackage.PHYSICAL_SPACE__INNER_SPACES, SpmmPackage.CONTENTION__PARENT);
		}
		return innerSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contention getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (Contention)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpmmPackage.PHYSICAL_SPACE__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contention basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Contention newContainer, NotificationChain msgs) {
		Contention oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpmmPackage.PHYSICAL_SPACE__CONTAINER, oldContainer, newContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Contention newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, SpmmPackage.CONTENTION__CHILD, Contention.class, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, SpmmPackage.CONTENTION__CHILD, Contention.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.PHYSICAL_SPACE__CONTAINER, newContainer, newContainer));
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
			case SpmmPackage.PHYSICAL_SPACE__UNIVERSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUniverse((Universe)otherEnd, msgs);
			case SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY:
				if (representedBy != null)
					msgs = ((InternalEObject)representedBy).eInverseRemove(this, SpmmPackage.REPRESENTATION__REPRESENTS, Representation.class, msgs);
				return basicSetRepresentedBy((Representation)otherEnd, msgs);
			case SpmmPackage.PHYSICAL_SPACE__INNER_SPACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInnerSpaces()).basicAdd(otherEnd, msgs);
			case SpmmPackage.PHYSICAL_SPACE__CONTAINER:
				if (container != null)
					msgs = ((InternalEObject)container).eInverseRemove(this, SpmmPackage.CONTENTION__CHILD, Contention.class, msgs);
				return basicSetContainer((Contention)otherEnd, msgs);
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
			case SpmmPackage.PHYSICAL_SPACE__UNIVERSE:
				return basicSetUniverse(null, msgs);
			case SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY:
				return basicSetRepresentedBy(null, msgs);
			case SpmmPackage.PHYSICAL_SPACE__INNER_SPACES:
				return ((InternalEList<?>)getInnerSpaces()).basicRemove(otherEnd, msgs);
			case SpmmPackage.PHYSICAL_SPACE__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case SpmmPackage.PHYSICAL_SPACE__UNIVERSE:
				return eInternalContainer().eInverseRemove(this, SpmmPackage.UNIVERSE__PHYSICAL_SPACES, Universe.class, msgs);
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
			case SpmmPackage.PHYSICAL_SPACE__UNIVERSE:
				return getUniverse();
			case SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY:
				if (resolve) return getRepresentedBy();
				return basicGetRepresentedBy();
			case SpmmPackage.PHYSICAL_SPACE__INNER_SPACES:
				return getInnerSpaces();
			case SpmmPackage.PHYSICAL_SPACE__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
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
			case SpmmPackage.PHYSICAL_SPACE__UNIVERSE:
				setUniverse((Universe)newValue);
				return;
			case SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY:
				setRepresentedBy((Representation)newValue);
				return;
			case SpmmPackage.PHYSICAL_SPACE__INNER_SPACES:
				getInnerSpaces().clear();
				getInnerSpaces().addAll((Collection<? extends Contention>)newValue);
				return;
			case SpmmPackage.PHYSICAL_SPACE__CONTAINER:
				setContainer((Contention)newValue);
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
			case SpmmPackage.PHYSICAL_SPACE__UNIVERSE:
				setUniverse((Universe)null);
				return;
			case SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY:
				setRepresentedBy((Representation)null);
				return;
			case SpmmPackage.PHYSICAL_SPACE__INNER_SPACES:
				getInnerSpaces().clear();
				return;
			case SpmmPackage.PHYSICAL_SPACE__CONTAINER:
				setContainer((Contention)null);
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
			case SpmmPackage.PHYSICAL_SPACE__UNIVERSE:
				return getUniverse() != null;
			case SpmmPackage.PHYSICAL_SPACE__REPRESENTED_BY:
				return representedBy != null;
			case SpmmPackage.PHYSICAL_SPACE__INNER_SPACES:
				return innerSpaces != null && !innerSpaces.isEmpty();
			case SpmmPackage.PHYSICAL_SPACE__CONTAINER:
				return container != null;
		}
		return super.eIsSet(featureID);
	}

} //PhysicalSpaceImpl
