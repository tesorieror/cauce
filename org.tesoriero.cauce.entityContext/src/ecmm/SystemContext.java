/**
 */
package ecmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecmm.SystemContext#getEntities <em>Entities</em>}</li>
 *   <li>{@link ecmm.SystemContext#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecmm.EcmmPackage#getSystemContext()
 * @model
 * @generated
 */
public interface SystemContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link ecmm.EntityContext}.
	 * It is bidirectional and its opposite is '{@link ecmm.EntityContext#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see ecmm.EcmmPackage#getSystemContext_Entities()
	 * @see ecmm.EntityContext#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<EntityContext> getEntities();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"ecmm-default"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecmm.EcmmPackage#getSystemContext_Name()
	 * @model default="ecmm-default" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecmm.SystemContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SystemContext
