/**
 */
package ecmm.impl;

import ecmm.ContextMemory;
import ecmm.ContextSituation;
import ecmm.EcmmPackage;
import ecmm.EntityContext;
import ecmm.SystemContext;
import ecmm.VariableDataDefinition;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecmm.impl.EntityContextImpl#getSituations <em>Situations</em>}</li>
 *   <li>{@link ecmm.impl.EntityContextImpl#getState <em>State</em>}</li>
 *   <li>{@link ecmm.impl.EntityContextImpl#getSystem <em>System</em>}</li>
 *   <li>{@link ecmm.impl.EntityContextImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link ecmm.impl.EntityContextImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link ecmm.impl.EntityContextImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityContextImpl extends MinimalEObjectImpl.Container implements EntityContext {
	/**
	 * The cached value of the '{@link #getSituations() <em>Situations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituations()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextSituation> situations;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextMemory> state;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDataDefinition> variables;

	/**
	 * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected String entity = ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = -1;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcmmPackage.Literals.ENTITY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextSituation> getSituations() {
		if (situations == null) {
			situations = new EObjectContainmentWithInverseEList<ContextSituation>(ContextSituation.class, this, EcmmPackage.ENTITY_CONTEXT__SITUATIONS, EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT);
		}
		return situations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextMemory> getState() {
		if (state == null) {
			state = new EObjectContainmentWithInverseEList<ContextMemory>(ContextMemory.class, this, EcmmPackage.ENTITY_CONTEXT__STATE, EcmmPackage.CONTEXT_MEMORY__ENTITY_CONTEXT);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemContext getSystem() {
		if (eContainerFeatureID() != EcmmPackage.ENTITY_CONTEXT__SYSTEM) return null;
		return (SystemContext)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(SystemContext newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystem, EcmmPackage.ENTITY_CONTEXT__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(SystemContext newSystem) {
		if (newSystem != eInternalContainer() || (eContainerFeatureID() != EcmmPackage.ENTITY_CONTEXT__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EcmmPackage.SYSTEM_CONTEXT__ENTITIES, SystemContext.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.ENTITY_CONTEXT__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDataDefinition> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList<VariableDataDefinition>(VariableDataDefinition.class, this, EcmmPackage.ENTITY_CONTEXT__VARIABLES, EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(String newEntity) {
		String oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.ENTITY_CONTEXT__ENTITY, oldEntity, entity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.ENTITY_CONTEXT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void incoming() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ongoing() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case EcmmPackage.ENTITY_CONTEXT__SITUATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSituations()).basicAdd(otherEnd, msgs);
			case EcmmPackage.ENTITY_CONTEXT__STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getState()).basicAdd(otherEnd, msgs);
			case EcmmPackage.ENTITY_CONTEXT__SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystem((SystemContext)otherEnd, msgs);
			case EcmmPackage.ENTITY_CONTEXT__VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
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
			case EcmmPackage.ENTITY_CONTEXT__SITUATIONS:
				return ((InternalEList<?>)getSituations()).basicRemove(otherEnd, msgs);
			case EcmmPackage.ENTITY_CONTEXT__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case EcmmPackage.ENTITY_CONTEXT__SYSTEM:
				return basicSetSystem(null, msgs);
			case EcmmPackage.ENTITY_CONTEXT__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case EcmmPackage.ENTITY_CONTEXT__SYSTEM:
				return eInternalContainer().eInverseRemove(this, EcmmPackage.SYSTEM_CONTEXT__ENTITIES, SystemContext.class, msgs);
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
			case EcmmPackage.ENTITY_CONTEXT__SITUATIONS:
				return getSituations();
			case EcmmPackage.ENTITY_CONTEXT__STATE:
				return getState();
			case EcmmPackage.ENTITY_CONTEXT__SYSTEM:
				return getSystem();
			case EcmmPackage.ENTITY_CONTEXT__VARIABLES:
				return getVariables();
			case EcmmPackage.ENTITY_CONTEXT__ENTITY:
				return getEntity();
			case EcmmPackage.ENTITY_CONTEXT__ID:
				return getId();
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
			case EcmmPackage.ENTITY_CONTEXT__SITUATIONS:
				getSituations().clear();
				getSituations().addAll((Collection<? extends ContextSituation>)newValue);
				return;
			case EcmmPackage.ENTITY_CONTEXT__STATE:
				getState().clear();
				getState().addAll((Collection<? extends ContextMemory>)newValue);
				return;
			case EcmmPackage.ENTITY_CONTEXT__SYSTEM:
				setSystem((SystemContext)newValue);
				return;
			case EcmmPackage.ENTITY_CONTEXT__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends VariableDataDefinition>)newValue);
				return;
			case EcmmPackage.ENTITY_CONTEXT__ENTITY:
				setEntity((String)newValue);
				return;
			case EcmmPackage.ENTITY_CONTEXT__ID:
				setId((Integer)newValue);
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
			case EcmmPackage.ENTITY_CONTEXT__SITUATIONS:
				getSituations().clear();
				return;
			case EcmmPackage.ENTITY_CONTEXT__STATE:
				getState().clear();
				return;
			case EcmmPackage.ENTITY_CONTEXT__SYSTEM:
				setSystem((SystemContext)null);
				return;
			case EcmmPackage.ENTITY_CONTEXT__VARIABLES:
				getVariables().clear();
				return;
			case EcmmPackage.ENTITY_CONTEXT__ENTITY:
				setEntity(ENTITY_EDEFAULT);
				return;
			case EcmmPackage.ENTITY_CONTEXT__ID:
				setId(ID_EDEFAULT);
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
			case EcmmPackage.ENTITY_CONTEXT__SITUATIONS:
				return situations != null && !situations.isEmpty();
			case EcmmPackage.ENTITY_CONTEXT__STATE:
				return state != null && !state.isEmpty();
			case EcmmPackage.ENTITY_CONTEXT__SYSTEM:
				return getSystem() != null;
			case EcmmPackage.ENTITY_CONTEXT__VARIABLES:
				return variables != null && !variables.isEmpty();
			case EcmmPackage.ENTITY_CONTEXT__ENTITY:
				return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
			case EcmmPackage.ENTITY_CONTEXT__ID:
				return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcmmPackage.ENTITY_CONTEXT___INCOMING:
				incoming();
				return null;
			case EcmmPackage.ENTITY_CONTEXT___ONGOING:
				ongoing();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (entity: ");
		result.append(entity);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EntityContextImpl
