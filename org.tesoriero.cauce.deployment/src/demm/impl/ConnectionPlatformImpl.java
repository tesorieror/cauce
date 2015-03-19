/**
 */
package demm.impl;

import demm.Connection;
import demm.ConnectionPlatform;
import demm.DemmPackage;
import demm.Medium;
import demm.Protocol;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link demm.impl.ConnectionPlatformImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link demm.impl.ConnectionPlatformImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link demm.impl.ConnectionPlatformImpl#getMedium <em>Medium</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionPlatformImpl extends PlatformImpl implements ConnectionPlatform {
	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Protocol protocol;

	/**
	 * The cached value of the '{@link #getMedium() <em>Medium</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected Medium medium;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemmPackage.Literals.CONNECTION_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConnection() {
		if (eContainerFeatureID() != DemmPackage.CONNECTION_PLATFORM__CONNECTION) return null;
		return (Connection)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnection(Connection newConnection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnection, DemmPackage.CONNECTION_PLATFORM__CONNECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Connection newConnection) {
		if (newConnection != eInternalContainer() || (eContainerFeatureID() != DemmPackage.CONNECTION_PLATFORM__CONNECTION && newConnection != null)) {
			if (EcoreUtil.isAncestor(this, newConnection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnection != null)
				msgs = ((InternalEObject)newConnection).eInverseAdd(this, DemmPackage.CONNECTION__PLATFORMS, Connection.class, msgs);
			msgs = basicSetConnection(newConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.CONNECTION_PLATFORM__CONNECTION, newConnection, newConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol getProtocol() {
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject)protocol;
			protocol = (Protocol)eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemmPackage.CONNECTION_PLATFORM__PROTOCOL, oldProtocol, protocol));
			}
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol basicGetProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(Protocol newProtocol) {
		Protocol oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.CONNECTION_PLATFORM__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medium getMedium() {
		if (medium != null && medium.eIsProxy()) {
			InternalEObject oldMedium = (InternalEObject)medium;
			medium = (Medium)eResolveProxy(oldMedium);
			if (medium != oldMedium) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemmPackage.CONNECTION_PLATFORM__MEDIUM, oldMedium, medium));
			}
		}
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medium basicGetMedium() {
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedium(Medium newMedium) {
		Medium oldMedium = medium;
		medium = newMedium;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.CONNECTION_PLATFORM__MEDIUM, oldMedium, medium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DemmPackage.CONNECTION_PLATFORM__CONNECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConnection((Connection)otherEnd, msgs);
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
			case DemmPackage.CONNECTION_PLATFORM__CONNECTION:
				return basicSetConnection(null, msgs);
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
			case DemmPackage.CONNECTION_PLATFORM__CONNECTION:
				return eInternalContainer().eInverseRemove(this, DemmPackage.CONNECTION__PLATFORMS, Connection.class, msgs);
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
			case DemmPackage.CONNECTION_PLATFORM__CONNECTION:
				return getConnection();
			case DemmPackage.CONNECTION_PLATFORM__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case DemmPackage.CONNECTION_PLATFORM__MEDIUM:
				if (resolve) return getMedium();
				return basicGetMedium();
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
			case DemmPackage.CONNECTION_PLATFORM__CONNECTION:
				setConnection((Connection)newValue);
				return;
			case DemmPackage.CONNECTION_PLATFORM__PROTOCOL:
				setProtocol((Protocol)newValue);
				return;
			case DemmPackage.CONNECTION_PLATFORM__MEDIUM:
				setMedium((Medium)newValue);
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
			case DemmPackage.CONNECTION_PLATFORM__CONNECTION:
				setConnection((Connection)null);
				return;
			case DemmPackage.CONNECTION_PLATFORM__PROTOCOL:
				setProtocol((Protocol)null);
				return;
			case DemmPackage.CONNECTION_PLATFORM__MEDIUM:
				setMedium((Medium)null);
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
			case DemmPackage.CONNECTION_PLATFORM__CONNECTION:
				return getConnection() != null;
			case DemmPackage.CONNECTION_PLATFORM__PROTOCOL:
				return protocol != null;
			case DemmPackage.CONNECTION_PLATFORM__MEDIUM:
				return medium != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionPlatformImpl
