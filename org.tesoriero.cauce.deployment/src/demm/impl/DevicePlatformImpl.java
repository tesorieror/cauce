/**
 */
package demm.impl;

import demm.DemmPackage;
import demm.Device;
import demm.DevicePlatform;
import demm.OperatingSystem;
import demm.ProgrammingLanguage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link demm.impl.DevicePlatformImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link demm.impl.DevicePlatformImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link demm.impl.DevicePlatformImpl#getOs <em>Os</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DevicePlatformImpl extends PlatformImpl implements DevicePlatform {
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected ProgrammingLanguage language;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected OperatingSystem os;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicePlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemmPackage.Literals.DEVICE_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice() {
		if (eContainerFeatureID() != DemmPackage.DEVICE_PLATFORM__DEVICE) return null;
		return (Device)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDevice, DemmPackage.DEVICE_PLATFORM__DEVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice) {
		if (newDevice != eInternalContainer() || (eContainerFeatureID() != DemmPackage.DEVICE_PLATFORM__DEVICE && newDevice != null)) {
			if (EcoreUtil.isAncestor(this, newDevice))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, DemmPackage.DEVICE__PLATFORMS, Device.class, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.DEVICE_PLATFORM__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject)language;
			language = (ProgrammingLanguage)eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemmPackage.DEVICE_PLATFORM__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage basicGetLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(ProgrammingLanguage newLanguage) {
		ProgrammingLanguage oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.DEVICE_PLATFORM__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem getOs() {
		if (os != null && os.eIsProxy()) {
			InternalEObject oldOs = (InternalEObject)os;
			os = (OperatingSystem)eResolveProxy(oldOs);
			if (os != oldOs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemmPackage.DEVICE_PLATFORM__OS, oldOs, os));
			}
		}
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem basicGetOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(OperatingSystem newOs) {
		OperatingSystem oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.DEVICE_PLATFORM__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DemmPackage.DEVICE_PLATFORM__DEVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDevice((Device)otherEnd, msgs);
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
			case DemmPackage.DEVICE_PLATFORM__DEVICE:
				return basicSetDevice(null, msgs);
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
			case DemmPackage.DEVICE_PLATFORM__DEVICE:
				return eInternalContainer().eInverseRemove(this, DemmPackage.DEVICE__PLATFORMS, Device.class, msgs);
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
			case DemmPackage.DEVICE_PLATFORM__DEVICE:
				return getDevice();
			case DemmPackage.DEVICE_PLATFORM__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case DemmPackage.DEVICE_PLATFORM__OS:
				if (resolve) return getOs();
				return basicGetOs();
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
			case DemmPackage.DEVICE_PLATFORM__DEVICE:
				setDevice((Device)newValue);
				return;
			case DemmPackage.DEVICE_PLATFORM__LANGUAGE:
				setLanguage((ProgrammingLanguage)newValue);
				return;
			case DemmPackage.DEVICE_PLATFORM__OS:
				setOs((OperatingSystem)newValue);
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
			case DemmPackage.DEVICE_PLATFORM__DEVICE:
				setDevice((Device)null);
				return;
			case DemmPackage.DEVICE_PLATFORM__LANGUAGE:
				setLanguage((ProgrammingLanguage)null);
				return;
			case DemmPackage.DEVICE_PLATFORM__OS:
				setOs((OperatingSystem)null);
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
			case DemmPackage.DEVICE_PLATFORM__DEVICE:
				return getDevice() != null;
			case DemmPackage.DEVICE_PLATFORM__LANGUAGE:
				return language != null;
			case DemmPackage.DEVICE_PLATFORM__OS:
				return os != null;
		}
		return super.eIsSet(featureID);
	}

} //DevicePlatformImpl
