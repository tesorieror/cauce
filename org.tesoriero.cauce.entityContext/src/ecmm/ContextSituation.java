/**
 */
package ecmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Situation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecmm.ContextSituation#getActions <em>Actions</em>}</li>
 *   <li>{@link ecmm.ContextSituation#getMemoryConditions <em>Memory Conditions</em>}</li>
 *   <li>{@link ecmm.ContextSituation#getSensingConditions <em>Sensing Conditions</em>}</li>
 *   <li>{@link ecmm.ContextSituation#getEntityContext <em>Entity Context</em>}</li>
 *   <li>{@link ecmm.ContextSituation#getName <em>Name</em>}</li>
 *   <li>{@link ecmm.ContextSituation#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecmm.EcmmPackage#getContextSituation()
 * @model
 * @generated
 */
public interface ContextSituation extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ecmm.ContextAction}.
	 * It is bidirectional and its opposite is '{@link ecmm.ContextAction#getSituation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see ecmm.EcmmPackage#getContextSituation_Actions()
	 * @see ecmm.ContextAction#getSituation
	 * @model opposite="situation" containment="true"
	 * @generated
	 */
	EList<ContextAction> getActions();

	/**
	 * Returns the value of the '<em><b>Memory Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link ecmm.MemoryContextCondition}.
	 * It is bidirectional and its opposite is '{@link ecmm.MemoryContextCondition#getSituation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Conditions</em>' containment reference list.
	 * @see ecmm.EcmmPackage#getContextSituation_MemoryConditions()
	 * @see ecmm.MemoryContextCondition#getSituation
	 * @model opposite="situation" containment="true"
	 * @generated
	 */
	EList<MemoryContextCondition> getMemoryConditions();

	/**
	 * Returns the value of the '<em><b>Sensing Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link ecmm.SensingContextCondition}.
	 * It is bidirectional and its opposite is '{@link ecmm.SensingContextCondition#getSituation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensing Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensing Conditions</em>' containment reference list.
	 * @see ecmm.EcmmPackage#getContextSituation_SensingConditions()
	 * @see ecmm.SensingContextCondition#getSituation
	 * @model opposite="situation" containment="true"
	 * @generated
	 */
	EList<SensingContextCondition> getSensingConditions();

	/**
	 * Returns the value of the '<em><b>Entity Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecmm.EntityContext#getSituations <em>Situations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Context</em>' container reference.
	 * @see #setEntityContext(EntityContext)
	 * @see ecmm.EcmmPackage#getContextSituation_EntityContext()
	 * @see ecmm.EntityContext#getSituations
	 * @model opposite="situations" required="true" transient="false"
	 * @generated
	 */
	EntityContext getEntityContext();

	/**
	 * Sets the value of the '{@link ecmm.ContextSituation#getEntityContext <em>Entity Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Context</em>' container reference.
	 * @see #getEntityContext()
	 * @generated
	 */
	void setEntityContext(EntityContext value);

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
	 * @see ecmm.EcmmPackage#getContextSituation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecmm.ContextSituation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see ecmm.EcmmPackage#getContextSituation_Id()
	 * @model default="-1" id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ecmm.ContextSituation#getId <em>Id</em>}' attribute.
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
	boolean matches();

} // ContextSituation
