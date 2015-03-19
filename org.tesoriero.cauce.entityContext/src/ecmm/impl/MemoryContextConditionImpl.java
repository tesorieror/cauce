/**
 */
package ecmm.impl;

import ecmm.ContextMemory;
import ecmm.ContextSituation;
import ecmm.EcmmPackage;
import ecmm.MemoryContextCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Context Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecmm.impl.MemoryContextConditionImpl#getSituation <em>Situation</em>}</li>
 *   <li>{@link ecmm.impl.MemoryContextConditionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link ecmm.impl.MemoryContextConditionImpl#getContextMemory <em>Context Memory</em>}</li>
 *   <li>{@link ecmm.impl.MemoryContextConditionImpl#getMemoryName <em>Memory Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryContextConditionImpl extends ContextConditionImpl implements MemoryContextCondition {
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
	 * The cached value of the '{@link #getContextMemory() <em>Context Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextMemory()
	 * @generated
	 * @ordered
	 */
	protected ContextMemory contextMemory;

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
	protected MemoryContextConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcmmPackage.Literals.MEMORY_CONTEXT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextSituation getSituation() {
		if (eContainerFeatureID() != EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION) return null;
		return (ContextSituation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSituation(ContextSituation newSituation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSituation, EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituation(ContextSituation newSituation) {
		if (newSituation != eInternalContainer() || (eContainerFeatureID() != EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION && newSituation != null)) {
			if (EcoreUtil.isAncestor(this, newSituation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSituation != null)
				msgs = ((InternalEObject)newSituation).eInverseAdd(this, EcmmPackage.CONTEXT_SITUATION__MEMORY_CONDITIONS, ContextSituation.class, msgs);
			msgs = basicSetSituation(newSituation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION, newSituation, newSituation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.MEMORY_CONTEXT_CONDITION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMemory getContextMemory() {
		if (contextMemory != null && contextMemory.eIsProxy()) {
			InternalEObject oldContextMemory = (InternalEObject)contextMemory;
			contextMemory = (ContextMemory)eResolveProxy(oldContextMemory);
			if (contextMemory != oldContextMemory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcmmPackage.MEMORY_CONTEXT_CONDITION__CONTEXT_MEMORY, oldContextMemory, contextMemory));
			}
		}
		return contextMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMemory basicGetContextMemory() {
		return contextMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setContextMemory(ContextMemory newContextMemory) {
		ContextMemory oldContextMemory = contextMemory;
		String oldMemoryName = getMemoryName();
		contextMemory = newContextMemory;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.MEMORY_CONTEXT_CONDITION__CONTEXT_MEMORY, oldContextMemory, contextMemory));
			eNotify(new ENotificationImpl(this, Notification.SET, EcmmPackage.MEMORY_CONTEXT_CONDITION__MEMORY_NAME , oldMemoryName, getMemoryName()));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMemoryName() {
		// TODO: implement this method to return the 'Memory Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		if(getContextMemory()==null)
			return "null";
			else return getContextMemory().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION:
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
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION:
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
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION:
				return eInternalContainer().eInverseRemove(this, EcmmPackage.CONTEXT_SITUATION__MEMORY_CONDITIONS, ContextSituation.class, msgs);
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
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION:
				return getSituation();
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__EXPRESSION:
				return getExpression();
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__CONTEXT_MEMORY:
				if (resolve) return getContextMemory();
				return basicGetContextMemory();
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__MEMORY_NAME:
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
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION:
				setSituation((ContextSituation)newValue);
				return;
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__CONTEXT_MEMORY:
				setContextMemory((ContextMemory)newValue);
				return;
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__MEMORY_NAME:
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
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION:
				setSituation((ContextSituation)null);
				return;
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__CONTEXT_MEMORY:
				setContextMemory((ContextMemory)null);
				return;
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__MEMORY_NAME:
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
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__SITUATION:
				return getSituation() != null;
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__CONTEXT_MEMORY:
				return contextMemory != null;
			case EcmmPackage.MEMORY_CONTEXT_CONDITION__MEMORY_NAME:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //MemoryContextConditionImpl
