/**
 */
package demm.impl;

import demm.Connection;
import demm.DemmPackage;
import demm.DevelopmentEnvironment;
import demm.Device;
import demm.Edge;
import demm.Medium;
import demm.OperatingSystem;
import demm.ProgrammingLanguage;
import demm.Protocol;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Development Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link demm.impl.DevelopmentEnvironmentImpl#getMediums <em>Mediums</em>}</li>
 *   <li>{@link demm.impl.DevelopmentEnvironmentImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link demm.impl.DevelopmentEnvironmentImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link demm.impl.DevelopmentEnvironmentImpl#getOs <em>Os</em>}</li>
 *   <li>{@link demm.impl.DevelopmentEnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link demm.impl.DevelopmentEnvironmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link demm.impl.DevelopmentEnvironmentImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link demm.impl.DevelopmentEnvironmentImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link demm.impl.DevelopmentEnvironmentImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DevelopmentEnvironmentImpl extends MinimalEObjectImpl.Container implements DevelopmentEnvironment {
	/**
	 * The cached value of the '{@link #getMediums() <em>Mediums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediums()
	 * @generated
	 * @ordered
	 */
	protected EList<Medium> mediums;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> protocols;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgrammingLanguage> languages;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingSystem> os;

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
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemmPackage.Literals.DEVELOPMENT_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Medium> getMediums() {
		if (mediums == null) {
			mediums = new EObjectContainmentWithInverseEList<Medium>(Medium.class, this, DemmPackage.DEVELOPMENT_ENVIRONMENT__MEDIUMS, DemmPackage.MEDIUM__ENVIRONMENT);
		}
		return mediums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Protocol> getProtocols() {
		if (protocols == null) {
			protocols = new EObjectContainmentWithInverseEList<Protocol>(Protocol.class, this, DemmPackage.DEVELOPMENT_ENVIRONMENT__PROTOCOLS, DemmPackage.PROTOCOL__ENVIRONMENT);
		}
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgrammingLanguage> getLanguages() {
		if (languages == null) {
			languages = new EObjectContainmentWithInverseEList<ProgrammingLanguage>(ProgrammingLanguage.class, this, DemmPackage.DEVELOPMENT_ENVIRONMENT__LANGUAGES, DemmPackage.PROGRAMMING_LANGUAGE__ENVIRONMENT);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatingSystem> getOs() {
		if (os == null) {
			os = new EObjectContainmentWithInverseEList<OperatingSystem>(OperatingSystem.class, this, DemmPackage.DEVELOPMENT_ENVIRONMENT__OS, DemmPackage.OPERATING_SYSTEM__ENVIRONMENT);
		}
		return os;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.DEVELOPMENT_ENVIRONMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DemmPackage.DEVELOPMENT_ENVIRONMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentWithInverseEList<Connection>(Connection.class, this, DemmPackage.DEVELOPMENT_ENVIRONMENT__CONNECTIONS, DemmPackage.CONNECTION__ENVIRONMENT);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentWithInverseEList<Device>(Device.class, this, DemmPackage.DEVELOPMENT_ENVIRONMENT__DEVICES, DemmPackage.DEVICE__ENVIRONMENT);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, DemmPackage.DEVELOPMENT_ENVIRONMENT__EDGES, DemmPackage.EDGE__ENVIRONMENT);
		}
		return edges;
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
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__MEDIUMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMediums()).basicAdd(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__PROTOCOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProtocols()).basicAdd(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__LANGUAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLanguages()).basicAdd(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__OS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOs()).basicAdd(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnections()).basicAdd(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__DEVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDevices()).basicAdd(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdges()).basicAdd(otherEnd, msgs);
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
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__MEDIUMS:
				return ((InternalEList<?>)getMediums()).basicRemove(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__PROTOCOLS:
				return ((InternalEList<?>)getProtocols()).basicRemove(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__LANGUAGES:
				return ((InternalEList<?>)getLanguages()).basicRemove(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__OS:
				return ((InternalEList<?>)getOs()).basicRemove(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__DEVICES:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
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
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__MEDIUMS:
				return getMediums();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__PROTOCOLS:
				return getProtocols();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__LANGUAGES:
				return getLanguages();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__OS:
				return getOs();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__NAME:
				return getName();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__ID:
				return getId();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__CONNECTIONS:
				return getConnections();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__DEVICES:
				return getDevices();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__EDGES:
				return getEdges();
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
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__MEDIUMS:
				getMediums().clear();
				getMediums().addAll((Collection<? extends Medium>)newValue);
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__PROTOCOLS:
				getProtocols().clear();
				getProtocols().addAll((Collection<? extends Protocol>)newValue);
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends ProgrammingLanguage>)newValue);
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__OS:
				getOs().clear();
				getOs().addAll((Collection<? extends OperatingSystem>)newValue);
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__NAME:
				setName((String)newValue);
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__ID:
				setId((Integer)newValue);
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
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
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__MEDIUMS:
				getMediums().clear();
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__PROTOCOLS:
				getProtocols().clear();
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__LANGUAGES:
				getLanguages().clear();
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__OS:
				getOs().clear();
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__CONNECTIONS:
				getConnections().clear();
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__DEVICES:
				getDevices().clear();
				return;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__EDGES:
				getEdges().clear();
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
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__MEDIUMS:
				return mediums != null && !mediums.isEmpty();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__PROTOCOLS:
				return protocols != null && !protocols.isEmpty();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__OS:
				return os != null && !os.isEmpty();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__ID:
				return id != ID_EDEFAULT;
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__DEVICES:
				return devices != null && !devices.isEmpty();
			case DemmPackage.DEVELOPMENT_ENVIRONMENT__EDGES:
				return edges != null && !edges.isEmpty();
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

} //DevelopmentEnvironmentImpl
