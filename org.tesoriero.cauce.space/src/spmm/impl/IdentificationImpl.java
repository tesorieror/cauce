/**
 */
package spmm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import spmm.Identification;
import spmm.LocationUnit;
import spmm.SpmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spmm.impl.IdentificationImpl#getLocationUnit <em>Location Unit</em>}</li>
 *   <li>{@link spmm.impl.IdentificationImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link spmm.impl.IdentificationImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentificationImpl extends MinimalEObjectImpl.Container implements Identification {
	/**
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNOLOGY_EDEFAULT = "<technology>";

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected String technology = TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = "<identification>";

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmmPackage.Literals.IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationUnit getLocationUnit() {
		if (eContainerFeatureID() != SpmmPackage.IDENTIFICATION__LOCATION_UNIT) return null;
		return (LocationUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationUnit(LocationUnit newLocationUnit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLocationUnit, SpmmPackage.IDENTIFICATION__LOCATION_UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationUnit(LocationUnit newLocationUnit) {
		if (newLocationUnit != eInternalContainer() || (eContainerFeatureID() != SpmmPackage.IDENTIFICATION__LOCATION_UNIT && newLocationUnit != null)) {
			if (EcoreUtil.isAncestor(this, newLocationUnit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocationUnit != null)
				msgs = ((InternalEObject)newLocationUnit).eInverseAdd(this, SpmmPackage.LOCATION_UNIT__IDENTIFICATIONS, LocationUnit.class, msgs);
			msgs = basicSetLocationUnit(newLocationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.IDENTIFICATION__LOCATION_UNIT, newLocationUnit, newLocationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(String newTechnology) {
		String oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.IDENTIFICATION__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpmmPackage.IDENTIFICATION__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpmmPackage.IDENTIFICATION__LOCATION_UNIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocationUnit((LocationUnit)otherEnd, msgs);
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
			case SpmmPackage.IDENTIFICATION__LOCATION_UNIT:
				return basicSetLocationUnit(null, msgs);
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
			case SpmmPackage.IDENTIFICATION__LOCATION_UNIT:
				return eInternalContainer().eInverseRemove(this, SpmmPackage.LOCATION_UNIT__IDENTIFICATIONS, LocationUnit.class, msgs);
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
			case SpmmPackage.IDENTIFICATION__LOCATION_UNIT:
				return getLocationUnit();
			case SpmmPackage.IDENTIFICATION__TECHNOLOGY:
				return getTechnology();
			case SpmmPackage.IDENTIFICATION__CONTENT:
				return getContent();
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
			case SpmmPackage.IDENTIFICATION__LOCATION_UNIT:
				setLocationUnit((LocationUnit)newValue);
				return;
			case SpmmPackage.IDENTIFICATION__TECHNOLOGY:
				setTechnology((String)newValue);
				return;
			case SpmmPackage.IDENTIFICATION__CONTENT:
				setContent((String)newValue);
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
			case SpmmPackage.IDENTIFICATION__LOCATION_UNIT:
				setLocationUnit((LocationUnit)null);
				return;
			case SpmmPackage.IDENTIFICATION__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
				return;
			case SpmmPackage.IDENTIFICATION__CONTENT:
				setContent(CONTENT_EDEFAULT);
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
			case SpmmPackage.IDENTIFICATION__LOCATION_UNIT:
				return getLocationUnit() != null;
			case SpmmPackage.IDENTIFICATION__TECHNOLOGY:
				return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
			case SpmmPackage.IDENTIFICATION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
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
		result.append(" (technology: ");
		result.append(technology);
		result.append(", content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //IdentificationImpl
