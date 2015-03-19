/**
 */
package ecmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Context Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecmm.MemoryContextCondition#getSituation <em>Situation</em>}</li>
 *   <li>{@link ecmm.MemoryContextCondition#getExpression <em>Expression</em>}</li>
 *   <li>{@link ecmm.MemoryContextCondition#getContextMemory <em>Context Memory</em>}</li>
 *   <li>{@link ecmm.MemoryContextCondition#getMemoryName <em>Memory Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecmm.EcmmPackage#getMemoryContextCondition()
 * @model
 * @generated
 */
public interface MemoryContextCondition extends ContextCondition {
	/**
	 * Returns the value of the '<em><b>Situation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecmm.ContextSituation#getMemoryConditions <em>Memory Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation</em>' container reference.
	 * @see #setSituation(ContextSituation)
	 * @see ecmm.EcmmPackage#getMemoryContextCondition_Situation()
	 * @see ecmm.ContextSituation#getMemoryConditions
	 * @model opposite="memoryConditions" transient="false"
	 * @generated
	 */
	ContextSituation getSituation();

	/**
	 * Sets the value of the '{@link ecmm.MemoryContextCondition#getSituation <em>Situation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation</em>' container reference.
	 * @see #getSituation()
	 * @generated
	 */
	void setSituation(ContextSituation value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see ecmm.EcmmPackage#getMemoryContextCondition_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link ecmm.MemoryContextCondition#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Context Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Memory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Memory</em>' reference.
	 * @see #setContextMemory(ContextMemory)
	 * @see ecmm.EcmmPackage#getMemoryContextCondition_ContextMemory()
	 * @model required="true"
	 * @generated
	 */
	ContextMemory getContextMemory();

	/**
	 * Sets the value of the '{@link ecmm.MemoryContextCondition#getContextMemory <em>Context Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Memory</em>' reference.
	 * @see #getContextMemory()
	 * @generated
	 */
	void setContextMemory(ContextMemory value);

	/**
	 * Returns the value of the '<em><b>Memory Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Name</em>' attribute.
	 * @see #setMemoryName(String)
	 * @see ecmm.EcmmPackage#getMemoryContextCondition_MemoryName()
	 * @model unique="false" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getMemoryName();

	/**
	 * Sets the value of the '{@link ecmm.MemoryContextCondition#getMemoryName <em>Memory Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Name</em>' attribute.
	 * @see #getMemoryName()
	 * @generated
	 */
	void setMemoryName(String value);

} // MemoryContextCondition
