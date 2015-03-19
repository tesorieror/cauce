/**
 */
package ecmm.impl;

import ecmm.ContextAction;
import ecmm.ContextSituation;
import ecmm.EcmmPackage;
import ecmm.EntityContext;
import ecmm.MemoryContextCondition;
import ecmm.SensingContextCondition;

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
 * An implementation of the model object '<em><b>Context Situation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecmm.impl.ContextSituationImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link ecmm.impl.ContextSituationImpl#getMemoryConditions <em>Memory Conditions</em>}</li>
 *   <li>{@link ecmm.impl.ContextSituationImpl#getSensingConditions <em>Sensing Conditions</em>}</li>
 *   <li>{@link ecmm.impl.ContextSituationImpl#getEntityContext <em>Entity Context</em>}</li>
 *   <li>{@link ecmm.impl.ContextSituationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecmm.impl.ContextSituationImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextSituationImpl extends MinimalEObjectImpl.Container implements ContextSituation {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextAction> actions;

	/**
	 * The cached value of the '{@link #getMemoryConditions() <em>Memory Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryContextCondition> memoryConditions;

	/**
	 * The cached value of the '{@link #getSensingConditions() <em>Sensing Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensingConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<SensingContextCondition> sensingConditions;

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
	protected ContextSituationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcmmPackage.Literals.CONTEXT_SITUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<ContextAction>(ContextAction.class, this, EcmmPackage.CONTEXT_SITUATION__ACTIONS, EcmmPackage.CONTEXT_ACTION__SITUATION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryContextCondition> getMemoryConditions() {
		if (memoryConditions == null) {
			memoryConditions = new EObjectContainmentWithInverseEList<MemoryContextCondition>(MemoryContextCondition.class, this, EcmmPackage.CONTEXT_SITUATION__MEMORY_CONDITIONS, EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION);
		}
		return memoryConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensingContextCondition> getSensingConditions() {
		if (sensingConditions == null) {
			sensingConditions = new EObjectContainmentWithInverseEList<SensingContextCondition>(SensingContextCondition.class, this, EcmmPackage.CONTEXT_SITUATION__SENSING_CONDITIONS, EcmmPackage.SENSING_CONTEXT_CONDITION__SITUATION);
		}
		return sensingConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityContext getEntityContext() {
		if (eContainerFeatureID() != EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT) return null;
		return (EntityContext)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityContext(EntityContext newEntityContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntityContext, EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityContext(EntityContext newEntityContext) {
		if (newEntityContext != eInternalContainer() || (eContainerFeatureID() != EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT && newEntityContext != null)) {
			if (EcoreUtil.isAncestor(this, newEntityContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntityContext != null)
				msgs = ((InternalEObject)newEntityContext).eInverseAdd(this, EcmmPackage.ENTITY_CONTEXT__SITUATIONS, EntityContext.class, msgs);
			msgs = basicSetEntityContext(newEntityContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT, newEntityContext, newEntityContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.CONTEXT_SITUATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.CONTEXT_SITUATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean matches() {
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
			case EcmmPackage.CONTEXT_SITUATION__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
			case EcmmPackage.CONTEXT_SITUATION__MEMORY_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemoryConditions()).basicAdd(otherEnd, msgs);
			case EcmmPackage.CONTEXT_SITUATION__SENSING_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensingConditions()).basicAdd(otherEnd, msgs);
			case EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntityContext((EntityContext)otherEnd, msgs);
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
			case EcmmPackage.CONTEXT_SITUATION__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case EcmmPackage.CONTEXT_SITUATION__MEMORY_CONDITIONS:
				return ((InternalEList<?>)getMemoryConditions()).basicRemove(otherEnd, msgs);
			case EcmmPackage.CONTEXT_SITUATION__SENSING_CONDITIONS:
				return ((InternalEList<?>)getSensingConditions()).basicRemove(otherEnd, msgs);
			case EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT:
				return basicSetEntityContext(null, msgs);
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
			case EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT:
				return eInternalContainer().eInverseRemove(this, EcmmPackage.ENTITY_CONTEXT__SITUATIONS, EntityContext.class, msgs);
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
			case EcmmPackage.CONTEXT_SITUATION__ACTIONS:
				return getActions();
			case EcmmPackage.CONTEXT_SITUATION__MEMORY_CONDITIONS:
				return getMemoryConditions();
			case EcmmPackage.CONTEXT_SITUATION__SENSING_CONDITIONS:
				return getSensingConditions();
			case EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT:
				return getEntityContext();
			case EcmmPackage.CONTEXT_SITUATION__NAME:
				return getName();
			case EcmmPackage.CONTEXT_SITUATION__ID:
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
			case EcmmPackage.CONTEXT_SITUATION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends ContextAction>)newValue);
				return;
			case EcmmPackage.CONTEXT_SITUATION__MEMORY_CONDITIONS:
				getMemoryConditions().clear();
				getMemoryConditions().addAll((Collection<? extends MemoryContextCondition>)newValue);
				return;
			case EcmmPackage.CONTEXT_SITUATION__SENSING_CONDITIONS:
				getSensingConditions().clear();
				getSensingConditions().addAll((Collection<? extends SensingContextCondition>)newValue);
				return;
			case EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT:
				setEntityContext((EntityContext)newValue);
				return;
			case EcmmPackage.CONTEXT_SITUATION__NAME:
				setName((String)newValue);
				return;
			case EcmmPackage.CONTEXT_SITUATION__ID:
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
			case EcmmPackage.CONTEXT_SITUATION__ACTIONS:
				getActions().clear();
				return;
			case EcmmPackage.CONTEXT_SITUATION__MEMORY_CONDITIONS:
				getMemoryConditions().clear();
				return;
			case EcmmPackage.CONTEXT_SITUATION__SENSING_CONDITIONS:
				getSensingConditions().clear();
				return;
			case EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT:
				setEntityContext((EntityContext)null);
				return;
			case EcmmPackage.CONTEXT_SITUATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcmmPackage.CONTEXT_SITUATION__ID:
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
			case EcmmPackage.CONTEXT_SITUATION__ACTIONS:
				return actions != null && !actions.isEmpty();
			case EcmmPackage.CONTEXT_SITUATION__MEMORY_CONDITIONS:
				return memoryConditions != null && !memoryConditions.isEmpty();
			case EcmmPackage.CONTEXT_SITUATION__SENSING_CONDITIONS:
				return sensingConditions != null && !sensingConditions.isEmpty();
			case EcmmPackage.CONTEXT_SITUATION__ENTITY_CONTEXT:
				return getEntityContext() != null;
			case EcmmPackage.CONTEXT_SITUATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcmmPackage.CONTEXT_SITUATION__ID:
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
			case EcmmPackage.CONTEXT_SITUATION___MATCHES:
				return matches();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ContextSituationImpl
