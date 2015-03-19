/**
 */
package tamm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tamm.Condition#getId <em>Id</em>}</li>
 *   <li>{@link tamm.Condition#getSocialExpression <em>Social Expression</em>}</li>
 *   <li>{@link tamm.Condition#getSpaceExpression <em>Space Expression</em>}</li>
 *   <li>{@link tamm.Condition#getTaskExpression <em>Task Expression</em>}</li>
 *   <li>{@link tamm.Condition#getLogicExpression <em>Logic Expression</em>}</li>
 *   <li>{@link tamm.Condition#getDataExpression <em>Data Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see tamm.TammPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tamm.TammPackage#getCondition_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tamm.Condition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Social Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Social Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Expression</em>' attribute.
	 * @see #setSocialExpression(String)
	 * @see tamm.TammPackage#getCondition_SocialExpression()
	 * @model unique="false"
	 * @generated
	 */
	String getSocialExpression();

	/**
	 * Sets the value of the '{@link tamm.Condition#getSocialExpression <em>Social Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social Expression</em>' attribute.
	 * @see #getSocialExpression()
	 * @generated
	 */
	void setSocialExpression(String value);

	/**
	 * Returns the value of the '<em><b>Space Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Expression</em>' attribute.
	 * @see #setSpaceExpression(String)
	 * @see tamm.TammPackage#getCondition_SpaceExpression()
	 * @model unique="false"
	 * @generated
	 */
	String getSpaceExpression();

	/**
	 * Sets the value of the '{@link tamm.Condition#getSpaceExpression <em>Space Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Expression</em>' attribute.
	 * @see #getSpaceExpression()
	 * @generated
	 */
	void setSpaceExpression(String value);

	/**
	 * Returns the value of the '<em><b>Task Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Expression</em>' attribute.
	 * @see #setTaskExpression(String)
	 * @see tamm.TammPackage#getCondition_TaskExpression()
	 * @model unique="false"
	 * @generated
	 */
	String getTaskExpression();

	/**
	 * Sets the value of the '{@link tamm.Condition#getTaskExpression <em>Task Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Expression</em>' attribute.
	 * @see #getTaskExpression()
	 * @generated
	 */
	void setTaskExpression(String value);

	/**
	 * Returns the value of the '<em><b>Logic Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Expression</em>' attribute.
	 * @see #setLogicExpression(String)
	 * @see tamm.TammPackage#getCondition_LogicExpression()
	 * @model unique="false"
	 * @generated
	 */
	String getLogicExpression();

	/**
	 * Sets the value of the '{@link tamm.Condition#getLogicExpression <em>Logic Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Expression</em>' attribute.
	 * @see #getLogicExpression()
	 * @generated
	 */
	void setLogicExpression(String value);

	/**
	 * Returns the value of the '<em><b>Data Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Expression</em>' attribute.
	 * @see #setDataExpression(String)
	 * @see tamm.TammPackage#getCondition_DataExpression()
	 * @model unique="false"
	 * @generated
	 */
	String getDataExpression();

	/**
	 * Sets the value of the '{@link tamm.Condition#getDataExpression <em>Data Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Expression</em>' attribute.
	 * @see #getDataExpression()
	 * @generated
	 */
	void setDataExpression(String value);

} // Condition
