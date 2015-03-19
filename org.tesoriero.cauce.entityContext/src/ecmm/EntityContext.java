/**
 */
package ecmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecmm.EntityContext#getSituations <em>Situations</em>}</li>
 *   <li>{@link ecmm.EntityContext#getState <em>State</em>}</li>
 *   <li>{@link ecmm.EntityContext#getSystem <em>System</em>}</li>
 *   <li>{@link ecmm.EntityContext#getVariables <em>Variables</em>}</li>
 *   <li>{@link ecmm.EntityContext#getEntity <em>Entity</em>}</li>
 *   <li>{@link ecmm.EntityContext#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecmm.EcmmPackage#getEntityContext()
 * @model
 * @generated
 */
public interface EntityContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Situations</b></em>' containment reference list.
	 * The list contents are of type {@link ecmm.ContextSituation}.
	 * It is bidirectional and its opposite is '{@link ecmm.ContextSituation#getEntityContext <em>Entity Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situations</em>' containment reference list.
	 * @see ecmm.EcmmPackage#getEntityContext_Situations()
	 * @see ecmm.ContextSituation#getEntityContext
	 * @model opposite="entityContext" containment="true"
	 * @generated
	 */
	EList<ContextSituation> getSituations();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link ecmm.ContextMemory}.
	 * It is bidirectional and its opposite is '{@link ecmm.ContextMemory#getEntityContext <em>Entity Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see ecmm.EcmmPackage#getEntityContext_State()
	 * @see ecmm.ContextMemory#getEntityContext
	 * @model opposite="entityContext" containment="true"
	 * @generated
	 */
	EList<ContextMemory> getState();

	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecmm.SystemContext#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(SystemContext)
	 * @see ecmm.EcmmPackage#getEntityContext_System()
	 * @see ecmm.SystemContext#getEntities
	 * @model opposite="entities" required="true" transient="false"
	 * @generated
	 */
	SystemContext getSystem();

	/**
	 * Sets the value of the '{@link ecmm.EntityContext#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemContext value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ecmm.VariableDataDefinition}.
	 * It is bidirectional and its opposite is '{@link ecmm.VariableDataDefinition#getEntityContext <em>Entity Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ecmm.EcmmPackage#getEntityContext_Variables()
	 * @see ecmm.VariableDataDefinition#getEntityContext
	 * @model opposite="entityContext" containment="true"
	 * @generated
	 */
	EList<VariableDataDefinition> getVariables();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' attribute.
	 * @see #setEntity(String)
	 * @see ecmm.EcmmPackage#getEntityContext_Entity()
	 * @model required="true"
	 * @generated
	 */
	String getEntity();

	/**
	 * Sets the value of the '{@link ecmm.EntityContext#getEntity <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' attribute.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(String value);

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
	 * @see ecmm.EcmmPackage#getEntityContext_Id()
	 * @model default="-1" id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ecmm.EntityContext#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void incoming();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ongoing();

} // EntityContext
