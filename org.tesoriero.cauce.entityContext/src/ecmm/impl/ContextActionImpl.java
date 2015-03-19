/**
 */
package ecmm.impl;

import ecmm.ContextAction;
import ecmm.ContextMemory;
import ecmm.ContextSituation;
import ecmm.EcmmPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecmm.impl.ContextActionImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link ecmm.impl.ContextActionImpl#getSituation <em>Situation</em>}</li>
 *   <li>{@link ecmm.impl.ContextActionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link ecmm.impl.ContextActionImpl#getId <em>Id</em>}</li>
 *   <li>{@link ecmm.impl.ContextActionImpl#getMemoryName <em>Memory Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextActionImpl extends MinimalEObjectImpl.Container implements ContextAction {
	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected ContextMemory memory;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

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
	 * The default value of the '{@link #getMemoryName() <em>Memory Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcmmPackage.Literals.CONTEXT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMemory getMemory() {
		if (memory != null && memory.eIsProxy()) {
			InternalEObject oldMemory = (InternalEObject)memory;
			memory = (ContextMemory)eResolveProxy(oldMemory);
			if (memory != oldMemory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcmmPackage.CONTEXT_ACTION__MEMORY, oldMemory, memory));
			}
		}
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMemory basicGetMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setMemory(ContextMemory newMemory) {
		String oldMemoryName = getMemoryName();
		ContextMemory oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.CONTEXT_ACTION__MEMORY, oldMemory, memory));
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.CONTEXT_ACTION__MEMORY_NAME, oldMemoryName, getMemoryName()));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextSituation getSituation() {
		if (eContainerFeatureID() != EcmmPackage.CONTEXT_ACTION__SITUATION) return null;
		return (ContextSituation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSituation(ContextSituation newSituation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSituation, EcmmPackage.CONTEXT_ACTION__SITUATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituation(ContextSituation newSituation) {
		if (newSituation != eInternalContainer() || (eContainerFeatureID() != EcmmPackage.CONTEXT_ACTION__SITUATION && newSituation != null)) {
			if (EcoreUtil.isAncestor(this, newSituation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSituation != null)
				msgs = ((InternalEObject)newSituation).eInverseAdd(this, EcmmPackage.CONTEXT_SITUATION__ACTIONS, ContextSituation.class, msgs);
			msgs = basicSetSituation(newSituation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.CONTEXT_ACTION__SITUATION, newSituation, newSituation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.CONTEXT_ACTION__EXPRESSION, oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.CONTEXT_ACTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMemoryName() {
		if(getMemory()==null)
		return "null";
		else return getMemory().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryName(String newMemoryName) {
		// TODO: implement this method to set the 'Memory Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcmmPackage.CONTEXT_ACTION__SITUATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSituation((ContextSituation)otherEnd, msgs);
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
			case EcmmPackage.CONTEXT_ACTION__SITUATION:
				return basicSetSituation(null, msgs);
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
			case EcmmPackage.CONTEXT_ACTION__SITUATION:
				return eInternalContainer().eInverseRemove(this, EcmmPackage.CONTEXT_SITUATION__ACTIONS, ContextSituation.class, msgs);
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
			case EcmmPackage.CONTEXT_ACTION__MEMORY:
				if (resolve) return getMemory();
				return basicGetMemory();
			case EcmmPackage.CONTEXT_ACTION__SITUATION:
				return getSituation();
			case EcmmPackage.CONTEXT_ACTION__EXPRESSION:
				return getExpression();
			case EcmmPackage.CONTEXT_ACTION__ID:
				return getId();
			case EcmmPackage.CONTEXT_ACTION__MEMORY_NAME:
				return getMemoryName();
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
			case EcmmPackage.CONTEXT_ACTION__MEMORY:
				setMemory((ContextMemory)newValue);
				return;
			case EcmmPackage.CONTEXT_ACTION__SITUATION:
				setSituation((ContextSituation)newValue);
				return;
			case EcmmPackage.CONTEXT_ACTION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case EcmmPackage.CONTEXT_ACTION__ID:
				setId((Integer)newValue);
				return;
			case EcmmPackage.CONTEXT_ACTION__MEMORY_NAME:
				setMemoryName((String)newValue);
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
			case EcmmPackage.CONTEXT_ACTION__MEMORY:
				setMemory((ContextMemory)null);
				return;
			case EcmmPackage.CONTEXT_ACTION__SITUATION:
				setSituation((ContextSituation)null);
				return;
			case EcmmPackage.CONTEXT_ACTION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case EcmmPackage.CONTEXT_ACTION__ID:
				setId(ID_EDEFAULT);
				return;
			case EcmmPackage.CONTEXT_ACTION__MEMORY_NAME:
				setMemoryName(MEMORY_NAME_EDEFAULT);
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
			case EcmmPackage.CONTEXT_ACTION__MEMORY:
				return memory != null;
			case EcmmPackage.CONTEXT_ACTION__SITUATION:
				return getSituation() != null;
			case EcmmPackage.CONTEXT_ACTION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case EcmmPackage.CONTEXT_ACTION__ID:
				return id != ID_EDEFAULT;
			case EcmmPackage.CONTEXT_ACTION__MEMORY_NAME:
				return MEMORY_NAME_EDEFAULT == null ? getMemoryName() != null : !MEMORY_NAME_EDEFAULT.equals(getMemoryName());
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
			case EcmmPackage.CONTEXT_ACTION___EXECUTE:
				execute();
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ContextActionImpl
