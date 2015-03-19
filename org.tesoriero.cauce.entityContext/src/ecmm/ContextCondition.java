/**
 */
package ecmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecmm.ContextCondition#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecmm.EcmmPackage#getContextCondition()
 * @model abstract="true"
 * @generated
 */
public interface ContextCondition extends EObject {
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
	 * @see ecmm.EcmmPackage#getContextCondition_Id()
	 * @model default="-1" id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ecmm.ContextCondition#getId <em>Id</em>}' attribute.
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
	boolean satisfies();

} // ContextCondition
