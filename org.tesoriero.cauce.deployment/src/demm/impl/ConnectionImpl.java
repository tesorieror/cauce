/**
 */
package demm.impl;

import demm.Connection;
import demm.ConnectionPlatform;
import demm.ConnectionToDeviceEdge;
import demm.DemmPackage;
import demm.DevelopmentEnvironment;
import demm.DeviceToConnectionEdge;
import demm.Information;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link demm.impl.ConnectionImpl#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link demm.impl.ConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link demm.impl.ConnectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link demm.impl.ConnectionImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link demm.impl.ConnectionImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link demm.impl.ConnectionImpl#getOngoing <em>Ongoing</em>}</li>
 *   <li>{@link demm.impl.ConnectionImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getPlatforms() <em>Platforms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPlatform> platforms;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> information;

	/**
	 * The cached value of the '{@link #getOngoing() <em>Ongoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoing()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionToDeviceEdge> ongoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceToConnectionEdge> incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemmPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPlatform> getPlatforms() {
		if (platforms == null) {
			platforms = new EObjectContainmentWithInverseEList<ConnectionPlatform>(ConnectionPlatform.class, this, DemmPackage.CONNECTION__PLATFORMS, DemmPackage.CONNECTION_PLATFORM__CONNECTION);
		}
		return platforms;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.CONNECTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.CONNECTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getInformation() {
		if (information == null) {
			information = new EObjectContainmentWithInverseEList<Information>(Information.class, this, DemmPackage.CONNECTION__INFORMATION, DemmPackage.INFORMATION__CONNECTION);
		}
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentEnvironment getEnvironment() {
		if (eContainerFeatureID() != DemmPackage.CONNECTION__ENVIRONMENT) return null;
		return (DevelopmentEnvironment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(DevelopmentEnvironment newEnvironment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnvironment, DemmPackage.CONNECTION__ENVIRONMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(DevelopmentEnvironment newEnvironment) {
		if (newEnvironment != eInternalContainer() || (eContainerFeatureID() != DemmPackage.CONNECTION__ENVIRONMENT && newEnvironment != null)) {
			if (EcoreUtil.isAncestor(this, newEnvironment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, DemmPackage.DEVELOPMENT_ENVIRONMENT__CONNECTIONS, DevelopmentEnvironment.class, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.CONNECTION__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionToDeviceEdge> getOngoing() {
		if (ongoing == null) {
			ongoing = new EObjectWithInverseResolvingEList<ConnectionToDeviceEdge>(ConnectionToDeviceEdge.class, this, DemmPackage.CONNECTION__ONGOING, DemmPackage.CONNECTION_TO_DEVICE_EDGE__SOURCE);
		}
		return ongoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceToConnectionEdge> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<DeviceToConnectionEdge>(DeviceToConnectionEdge.class, this, DemmPackage.CONNECTION__INCOMING, DemmPackage.DEVICE_TO_CONNECTION_EDGE__TARGET);
		}
		return incoming;
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
			case DemmPackage.CONNECTION__PLATFORMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlatforms()).basicAdd(otherEnd, msgs);
			case DemmPackage.CONNECTION__INFORMATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInformation()).basicAdd(otherEnd, msgs);
			case DemmPackage.CONNECTION__ENVIRONMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnvironment((DevelopmentEnvironment)otherEnd, msgs);
			case DemmPackage.CONNECTION__ONGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOngoing()).basicAdd(otherEnd, msgs);
			case DemmPackage.CONNECTION__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
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
			case DemmPackage.CONNECTION__PLATFORMS:
				return ((InternalEList<?>)getPlatforms()).basicRemove(otherEnd, msgs);
			case DemmPackage.CONNECTION__INFORMATION:
				return ((InternalEList<?>)getInformation()).basicRemove(otherEnd, msgs);
			case DemmPackage.CONNECTION__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case DemmPackage.CONNECTION__ONGOING:
				return ((InternalEList<?>)getOngoing()).basicRemove(otherEnd, msgs);
			case DemmPackage.CONNECTION__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
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
			case DemmPackage.CONNECTION__ENVIRONMENT:
				return eInternalContainer().eInverseRemove(this, DemmPackage.DEVELOPMENT_ENVIRONMENT__CONNECTIONS, DevelopmentEnvironment.class, msgs);
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
			case DemmPackage.CONNECTION__PLATFORMS:
				return getPlatforms();
			case DemmPackage.CONNECTION__NAME:
				return getName();
			case DemmPackage.CONNECTION__ID:
				return getId();
			case DemmPackage.CONNECTION__INFORMATION:
				return getInformation();
			case DemmPackage.CONNECTION__ENVIRONMENT:
				return getEnvironment();
			case DemmPackage.CONNECTION__ONGOING:
				return getOngoing();
			case DemmPackage.CONNECTION__INCOMING:
				return getIncoming();
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
			case DemmPackage.CONNECTION__PLATFORMS:
				getPlatforms().clear();
				getPlatforms().addAll((Collection<? extends ConnectionPlatform>)newValue);
				return;
			case DemmPackage.CONNECTION__NAME:
				setName((String)newValue);
				return;
			case DemmPackage.CONNECTION__ID:
				setId((Integer)newValue);
				return;
			case DemmPackage.CONNECTION__INFORMATION:
				getInformation().clear();
				getInformation().addAll((Collection<? extends Information>)newValue);
				return;
			case DemmPackage.CONNECTION__ENVIRONMENT:
				setEnvironment((DevelopmentEnvironment)newValue);
				return;
			case DemmPackage.CONNECTION__ONGOING:
				getOngoing().clear();
				getOngoing().addAll((Collection<? extends ConnectionToDeviceEdge>)newValue);
				return;
			case DemmPackage.CONNECTION__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends DeviceToConnectionEdge>)newValue);
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
			case DemmPackage.CONNECTION__PLATFORMS:
				getPlatforms().clear();
				return;
			case DemmPackage.CONNECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DemmPackage.CONNECTION__ID:
				setId(ID_EDEFAULT);
				return;
			case DemmPackage.CONNECTION__INFORMATION:
				getInformation().clear();
				return;
			case DemmPackage.CONNECTION__ENVIRONMENT:
				setEnvironment((DevelopmentEnvironment)null);
				return;
			case DemmPackage.CONNECTION__ONGOING:
				getOngoing().clear();
				return;
			case DemmPackage.CONNECTION__INCOMING:
				getIncoming().clear();
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
			case DemmPackage.CONNECTION__PLATFORMS:
				return platforms != null && !platforms.isEmpty();
			case DemmPackage.CONNECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DemmPackage.CONNECTION__ID:
				return id != ID_EDEFAULT;
			case DemmPackage.CONNECTION__INFORMATION:
				return information != null && !information.isEmpty();
			case DemmPackage.CONNECTION__ENVIRONMENT:
				return getEnvironment() != null;
			case DemmPackage.CONNECTION__ONGOING:
				return ongoing != null && !ongoing.isEmpty();
			case DemmPackage.CONNECTION__INCOMING:
				return incoming != null && !incoming.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
