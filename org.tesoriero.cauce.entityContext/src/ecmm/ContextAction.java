/**
 */
package ecmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecmm.ContextAction#getMemory <em>Memory</em>}</li>
 *   <li>{@link ecmm.ContextAction#getSituation <em>Situation</em>}</li>
 *   <li>{@link ecmm.ContextAction#getExpression <em>Expression</em>}</li>
 *   <li>{@link ecmm.ContextAction#getId <em>Id</em>}</li>
 *   <li>{@link ecmm.ContextAction#getMemoryName <em>Memory Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecmm.EcmmPackage#getContextAction()
 * @model
 * @generated
 */
public interface ContextAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' reference.
	 * @see #setMemory(ContextMemory)
	 * @see ecmm.EcmmPackage#getContextAction_Memory()
	 * @model required="true"
	 * @generated
	 */
	ContextMemory getMemory();

	/**
	 * Sets the value of the '{@link ecmm.ContextAction#getMemory <em>Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' reference.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(ContextMemory value);

	/**
	 * Returns the value of the '<em><b>Situation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecmm.ContextSituation#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation</em>' container reference.
	 * @see #setSituation(ContextSituation)
	 * @see ecmm.EcmmPackage#getContextAction_Situation()
	 * @see ecmm.ContextSituation#getActions
	 * @model opposite="actions" required="true" transient="false"
	 * @generated
	 */
	ContextSituation getSituation();

	/**
	 * Sets the value of the '{@link ecmm.ContextAction#getSituation <em>Situation</em>}' container reference.
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
	 * @see ecmm.EcmmPackage#getContextAction_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link ecmm.ContextAction#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see ecmm.EcmmPackage#getContextAction_Id()
	 * @model default="-1" id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ecmm.ContextAction#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see ecmm.EcmmPackage#getContextAction_MemoryName()
	 * @model unique="false" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getMemoryName();

	/**
	 * Sets the value of the '{@link ecmm.ContextAction#getMemoryName <em>Memory Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Name</em>' attribute.
	 * @see #getMemoryName()
	 * @generated
	 */
	void setMemoryName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // ContextAction
