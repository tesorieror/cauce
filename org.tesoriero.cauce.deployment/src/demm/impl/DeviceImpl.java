/**
 */
package demm.impl;

import demm.ConnectionToDeviceEdge;
import demm.DemmPackage;
import demm.DevelopmentEnvironment;
import demm.Device;
import demm.DevicePlatform;
import demm.DeviceToConnectionEdge;
import demm.Entity;

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
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link demm.impl.DeviceImpl#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link demm.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link demm.impl.DeviceImpl#getId <em>Id</em>}</li>
 *   <li>{@link demm.impl.DeviceImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link demm.impl.DeviceImpl#getOngoing <em>Ongoing</em>}</li>
 *   <li>{@link demm.impl.DeviceImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link demm.impl.DeviceImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device {
	/**
	 * The cached value of the '{@link #getPlatforms() <em>Platforms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<DevicePlatform> platforms;

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
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getOngoing() <em>Ongoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoing()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceToConnectionEdge> ongoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionToDeviceEdge> incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemmPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DevicePlatform> getPlatforms() {
		if (platforms == null) {
			platforms = new EObjectContainmentWithInverseEList<DevicePlatform>(DevicePlatform.class, this, DemmPackage.DEVICE__PLATFORMS, DemmPackage.DEVICE_PLATFORM__DEVICE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.DEVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.DEVICE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentWithInverseEList<Entity>(Entity.class, this, DemmPackage.DEVICE__ENTITIES, DemmPackage.ENTITY__DEVICE);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceToConnectionEdge> getOngoing() {
		if (ongoing == null) {
			ongoing = new EObjectWithInverseResolvingEList<DeviceToConnectionEdge>(DeviceToConnectionEdge.class, this, DemmPackage.DEVICE__ONGOING, DemmPackage.DEVICE_TO_CONNECTION_EDGE__SOURCE);
		}
		return ongoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionToDeviceEdge> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<ConnectionToDeviceEdge>(ConnectionToDeviceEdge.class, this, DemmPackage.DEVICE__INCOMING, DemmPackage.CONNECTION_TO_DEVICE_EDGE__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentEnvironment getEnvironment() {
		if (eContainerFeatureID() != DemmPackage.DEVICE__ENVIRONMENT) return null;
		return (DevelopmentEnvironment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(DevelopmentEnvironment newEnvironment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnvironment, DemmPackage.DEVICE__ENVIRONMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(DevelopmentEnvironment newEnvironment) {
		if (newEnvironment != eInternalContainer() || (eContainerFeatureID() != DemmPackage.DEVICE__ENVIRONMENT && newEnvironment != null)) {
			if (EcoreUtil.isAncestor(this, newEnvironment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, DemmPackage.DEVELOPMENT_ENVIRONMENT__DEVICES, DevelopmentEnvironment.class, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.DEVICE__ENVIRONMENT, newEnvironment, newEnvironment));
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
			case DemmPackage.DEVICE__PLATFORMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlatforms()).basicAdd(otherEnd, msgs);
			case DemmPackage.DEVICE__ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntities()).basicAdd(otherEnd, msgs);
			case DemmPackage.DEVICE__ONGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOngoing()).basicAdd(otherEnd, msgs);
			case DemmPackage.DEVICE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case DemmPackage.DEVICE__ENVIRONMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnvironment((DevelopmentEnvironment)otherEnd, msgs);
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
			case DemmPackage.DEVICE__PLATFORMS:
				return ((InternalEList<?>)getPlatforms()).basicRemove(otherEnd, msgs);
			case DemmPackage.DEVICE__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case DemmPackage.DEVICE__ONGOING:
				return ((InternalEList<?>)getOngoing()).basicRemove(otherEnd, msgs);
			case DemmPackage.DEVICE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case DemmPackage.DEVICE__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
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
			case DemmPackage.DEVICE__ENVIRONMENT:
				return eInternalContainer().eInverseRemove(this, DemmPackage.DEVELOPMENT_ENVIRONMENT__DEVICES, DevelopmentEnvironment.class, msgs);
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
			case DemmPackage.DEVICE__PLATFORMS:
				return getPlatforms();
			case DemmPackage.DEVICE__NAME:
				return getName();
			case DemmPackage.DEVICE__ID:
				return getId();
			case DemmPackage.DEVICE__ENTITIES:
				return getEntities();
			case DemmPackage.DEVICE__ONGOING:
				return getOngoing();
			case DemmPackage.DEVICE__INCOMING:
				return getIncoming();
			case DemmPackage.DEVICE__ENVIRONMENT:
				return getEnvironment();
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
			case DemmPackage.DEVICE__PLATFORMS:
				getPlatforms().clear();
				getPlatforms().addAll((Collection<? extends DevicePlatform>)newValue);
				return;
			case DemmPackage.DEVICE__NAME:
				setName((String)newValue);
				return;
			case DemmPackage.DEVICE__ID:
				setId((String)newValue);
				return;
			case DemmPackage.DEVICE__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case DemmPackage.DEVICE__ONGOING:
				getOngoing().clear();
				getOngoing().addAll((Collection<? extends DeviceToConnectionEdge>)newValue);
				return;
			case DemmPackage.DEVICE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends ConnectionToDeviceEdge>)newValue);
				return;
			case DemmPackage.DEVICE__ENVIRONMENT:
				setEnvironment((DevelopmentEnvironment)newValue);
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
			case DemmPackage.DEVICE__PLATFORMS:
				getPlatforms().clear();
				return;
			case DemmPackage.DEVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DemmPackage.DEVICE__ID:
				setId(ID_EDEFAULT);
				return;
			case DemmPackage.DEVICE__ENTITIES:
				getEntities().clear();
				return;
			case DemmPackage.DEVICE__ONGOING:
				getOngoing().clear();
				return;
			case DemmPackage.DEVICE__INCOMING:
				getIncoming().clear();
				return;
			case DemmPackage.DEVICE__ENVIRONMENT:
				setEnvironment((DevelopmentEnvironment)null);
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
			case DemmPackage.DEVICE__PLATFORMS:
				return platforms != null && !platforms.isEmpty();
			case DemmPackage.DEVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DemmPackage.DEVICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DemmPackage.DEVICE__ENTITIES:
				return entities != null && !entities.isEmpty();
			case DemmPackage.DEVICE__ONGOING:
				return ongoing != null && !ongoing.isEmpty();
			case DemmPackage.DEVICE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case DemmPackage.DEVICE__ENVIRONMENT:
				return getEnvironment() != null;
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

} //DeviceImpl
