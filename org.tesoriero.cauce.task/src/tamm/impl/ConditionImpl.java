/**
 */
package tamm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tamm.Condition;
import tamm.TammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tamm.impl.ConditionImpl#getId <em>Id</em>}</li>
 *   <li>{@link tamm.impl.ConditionImpl#getSocialExpression <em>Social Expression</em>}</li>
 *   <li>{@link tamm.impl.ConditionImpl#getSpaceExpression <em>Space Expression</em>}</li>
 *   <li>{@link tamm.impl.ConditionImpl#getTaskExpression <em>Task Expression</em>}</li>
 *   <li>{@link tamm.impl.ConditionImpl#getLogicExpression <em>Logic Expression</em>}</li>
 *   <li>{@link tamm.impl.ConditionImpl#getDataExpression <em>Data Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
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
	 * The default value of the '{@link #getSocialExpression() <em>Social Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SOCIAL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSocialExpression() <em>Social Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialExpression()
	 * @generated
	 * @ordered
	 */
	protected String socialExpression = SOCIAL_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceExpression() <em>Space Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceExpression() <em>Space Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceExpression()
	 * @generated
	 * @ordered
	 */
	protected String spaceExpression = SPACE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskExpression() <em>Task Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskExpression() <em>Task Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskExpression()
	 * @generated
	 * @ordered
	 */
	protected String taskExpression = TASK_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicExpression() <em>Logic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIC_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicExpression() <em>Logic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicExpression()
	 * @generated
	 * @ordered
	 */
	protected String logicExpression = LOGIC_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataExpression() <em>Data Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataExpression() <em>Data Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExpression()
	 * @generated
	 * @ordered
	 */
	protected String dataExpression = DATA_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TammPackage.Literals.CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.CONDITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSocialExpression() {
		return socialExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocialExpression(String newSocialExpression) {
		String oldSocialExpression = socialExpression;
		socialExpression = newSocialExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.CONDITION__SOCIAL_EXPRESSION, oldSocialExpression, socialExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpaceExpression() {
		return spaceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceExpression(String newSpaceExpression) {
		String oldSpaceExpression = spaceExpression;
		spaceExpression = newSpaceExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.CONDITION__SPACE_EXPRESSION, oldSpaceExpression, spaceExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskExpression() {
		return taskExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskExpression(String newTaskExpression) {
		String oldTaskExpression = taskExpression;
		taskExpression = newTaskExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.CONDITION__TASK_EXPRESSION, oldTaskExpression, taskExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogicExpression() {
		return logicExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicExpression(String newLogicExpression) {
		String oldLogicExpression = logicExpression;
		logicExpression = newLogicExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.CONDITION__LOGIC_EXPRESSION, oldLogicExpression, logicExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataExpression() {
		return dataExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataExpression(String newDataExpression) {
		String oldDataExpression = dataExpression;
		dataExpression = newDataExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TammPackage.CONDITION__DATA_EXPRESSION, oldDataExpression, dataExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TammPackage.CONDITION__ID:
				return getId();
			case TammPackage.CONDITION__SOCIAL_EXPRESSION:
				return getSocialExpression();
			case TammPackage.CONDITION__SPACE_EXPRESSION:
				return getSpaceExpression();
			case TammPackage.CONDITION__TASK_EXPRESSION:
				return getTaskExpression();
			case TammPackage.CONDITION__LOGIC_EXPRESSION:
				return getLogicExpression();
			case TammPackage.CONDITION__DATA_EXPRESSION:
				return getDataExpression();
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
			case TammPackage.CONDITION__ID:
				setId((Integer)newValue);
				return;
			case TammPackage.CONDITION__SOCIAL_EXPRESSION:
				setSocialExpression((String)newValue);
				return;
			case TammPackage.CONDITION__SPACE_EXPRESSION:
				setSpaceExpression((String)newValue);
				return;
			case TammPackage.CONDITION__TASK_EXPRESSION:
				setTaskExpression((String)newValue);
				return;
			case TammPackage.CONDITION__LOGIC_EXPRESSION:
				setLogicExpression((String)newValue);
				return;
			case TammPackage.CONDITION__DATA_EXPRESSION:
				setDataExpression((String)newValue);
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
			case TammPackage.CONDITION__ID:
				setId(ID_EDEFAULT);
				return;
			case TammPackage.CONDITION__SOCIAL_EXPRESSION:
				setSocialExpression(SOCIAL_EXPRESSION_EDEFAULT);
				return;
			case TammPackage.CONDITION__SPACE_EXPRESSION:
				setSpaceExpression(SPACE_EXPRESSION_EDEFAULT);
				return;
			case TammPackage.CONDITION__TASK_EXPRESSION:
				setTaskExpression(TASK_EXPRESSION_EDEFAULT);
				return;
			case TammPackage.CONDITION__LOGIC_EXPRESSION:
				setLogicExpression(LOGIC_EXPRESSION_EDEFAULT);
				return;
			case TammPackage.CONDITION__DATA_EXPRESSION:
				setDataExpression(DATA_EXPRESSION_EDEFAULT);
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
			case TammPackage.CONDITION__ID:
				return id != ID_EDEFAULT;
			case TammPackage.CONDITION__SOCIAL_EXPRESSION:
				return SOCIAL_EXPRESSION_EDEFAULT == null ? socialExpression != null : !SOCIAL_EXPRESSION_EDEFAULT.equals(socialExpression);
			case TammPackage.CONDITION__SPACE_EXPRESSION:
				return SPACE_EXPRESSION_EDEFAULT == null ? spaceExpression != null : !SPACE_EXPRESSION_EDEFAULT.equals(spaceExpression);
			case TammPackage.CONDITION__TASK_EXPRESSION:
				return TASK_EXPRESSION_EDEFAULT == null ? taskExpression != null : !TASK_EXPRESSION_EDEFAULT.equals(taskExpression);
			case TammPackage.CONDITION__LOGIC_EXPRESSION:
				return LOGIC_EXPRESSION_EDEFAULT == null ? logicExpression != null : !LOGIC_EXPRESSION_EDEFAULT.equals(logicExpression);
			case TammPackage.CONDITION__DATA_EXPRESSION:
				return DATA_EXPRESSION_EDEFAULT == null ? dataExpression != null : !DATA_EXPRESSION_EDEFAULT.equals(dataExpression);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", socialExpression: ");
		result.append(socialExpression);
		result.append(", spaceExpression: ");
		result.append(spaceExpression);
		result.append(", taskExpression: ");
		result.append(taskExpression);
		result.append(", logicExpression: ");
		result.append(logicExpression);
		result.append(", dataExpression: ");
		result.append(dataExpression);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
