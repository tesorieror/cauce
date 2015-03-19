/**
 */
package ecmm.impl;

import ecmm.EcmmPackage;
import ecmm.EntityContext;
import ecmm.VariableDataDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Data Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecmm.impl.VariableDataDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecmm.impl.VariableDataDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link ecmm.impl.VariableDataDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link ecmm.impl.VariableDataDefinitionImpl#getEntityContext <em>Entity Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDataDefinitionImpl extends MinimalEObjectImpl.Container implements VariableDataDefinition {
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
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

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
	protected VariableDataDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcmmPackage.Literals.VARIABLE_DATA_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.VARIABLE_DATA_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.VARIABLE_DATA_DEFINITION__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.VARIABLE_DATA_DEFINITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityContext getEntityContext() {
		if (eContainerFeatureID() != EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT) return null;
		return (EntityContext)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityContext(EntityContext newEntityContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntityContext, EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityContext(EntityContext newEntityContext) {
		if (newEntityContext != eInternalContainer() || (eContainerFeatureID() != EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT && newEntityContext != null)) {
			if (EcoreUtil.isAncestor(this, newEntityContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntityContext != null)
				msgs = ((InternalEObject)newEntityContext).eInverseAdd(this, EcmmPackage.ENTITY_CONTEXT__VARIABLES, EntityContext.class, msgs);
			msgs = basicSetEntityContext(newEntityContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT, newEntityContext, newEntityContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT:
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
			case EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT:
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
			case EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT:
				return eInternalContainer().eInverseRemove(this, EcmmPackage.ENTITY_CONTEXT__VARIABLES, EntityContext.class, msgs);
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
			case EcmmPackage.VARIABLE_DATA_DEFINITION__NAME:
				return getName();
			case EcmmPackage.VARIABLE_DATA_DEFINITION__DEFINITION:
				return getDefinition();
			case EcmmPackage.VARIABLE_DATA_DEFINITION__ID:
				return getId();
			case EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT:
				return getEntityContext();
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
			case EcmmPackage.VARIABLE_DATA_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case EcmmPackage.VARIABLE_DATA_DEFINITION__DEFINITION:
				setDefinition((String)newValue);
				return;
			case EcmmPackage.VARIABLE_DATA_DEFINITION__ID:
				setId((Integer)newValue);
				return;
			case EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT:
				setEntityContext((EntityContext)newValue);
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
			case EcmmPackage.VARIABLE_DATA_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcmmPackage.VARIABLE_DATA_DEFINITION__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case EcmmPackage.VARIABLE_DATA_DEFINITION__ID:
				setId(ID_EDEFAULT);
				return;
			case EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT:
				setEntityContext((EntityContext)null);
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
			case EcmmPackage.VARIABLE_DATA_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcmmPackage.VARIABLE_DATA_DEFINITION__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case EcmmPackage.VARIABLE_DATA_DEFINITION__ID:
				return id != ID_EDEFAULT;
			case EcmmPackage.VARIABLE_DATA_DEFINITION__ENTITY_CONTEXT:
				return getEntityContext() != null;
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
		result.append(", definition: ");
		result.append(definition);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //VariableDataDefinitionImpl
