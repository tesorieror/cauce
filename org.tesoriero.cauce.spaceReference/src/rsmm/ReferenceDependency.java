/**
 */
package rsmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rsmm.ReferenceDependency#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link rsmm.ReferenceDependency#getParent <em>Parent</em>}</li>
 *   <li>{@link rsmm.ReferenceDependency#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see rsmm.RsmmPackage#getReferenceDependency()
 * @model abstract="true"
 * @generated
 */
public interface ReferenceDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(int)
	 * @see rsmm.RsmmPackage#getReferenceDependency_Cardinality()
	 * @model
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link rsmm.ReferenceDependency#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rsmm.ReferentialSpace#getOngoingReferenceDependencies <em>Ongoing Reference Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ReferentialSpace)
	 * @see rsmm.RsmmPackage#getReferenceDependency_Parent()
	 * @see rsmm.ReferentialSpace#getOngoingReferenceDependencies
	 * @model opposite="ongoingReferenceDependencies" required="true"
	 * @generated
	 */
	ReferentialSpace getParent();

	/**
	 * Sets the value of the '{@link rsmm.ReferenceDependency#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ReferentialSpace value);

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
	 * @see rsmm.RsmmPackage#getReferenceDependency_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link rsmm.ReferenceDependency#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // ReferenceDependency
