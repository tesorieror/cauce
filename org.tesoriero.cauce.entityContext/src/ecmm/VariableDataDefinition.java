/**
 */
package ecmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecmm.VariableDataDefinition#getName <em>Name</em>}</li>
 *   <li>{@link ecmm.VariableDataDefinition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link ecmm.VariableDataDefinition#getId <em>Id</em>}</li>
 *   <li>{@link ecmm.VariableDataDefinition#getEntityContext <em>Entity Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecmm.EcmmPackage#getVariableDataDefinition()
 * @model
 * @generated
 */
public interface VariableDataDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecmm.EcmmPackage#getVariableDataDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecmm.VariableDataDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see ecmm.EcmmPackage#getVariableDataDefinition_Definition()
	 * @model required="true"
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link ecmm.VariableDataDefinition#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

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
	 * @see ecmm.EcmmPackage#getVariableDataDefinition_Id()
	 * @model default="-1" id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ecmm.VariableDataDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Entity Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecmm.EntityContext#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Context</em>' container reference.
	 * @see #setEntityContext(EntityContext)
	 * @see ecmm.EcmmPackage#getVariableDataDefinition_EntityContext()
	 * @see ecmm.EntityContext#getVariables
	 * @model opposite="variables" required="true" transient="false"
	 * @generated
	 */
	EntityContext getEntityContext();

	/**
	 * Sets the value of the '{@link ecmm.VariableDataDefinition#getEntityContext <em>Entity Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Context</em>' container reference.
	 * @see #getEntityContext()
	 * @generated
	 */
	void setEntityContext(EntityContext value);

} // VariableDataDefinition
