/**
 */
package spmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contention</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spmm.Contention#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.Contention#getParent <em>Parent</em>}</li>
 *   <li>{@link spmm.Contention#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see spmm.SpmmPackage#getContention()
 * @model
 * @generated
 */
public interface Contention extends SpaceRelationship {
	/**
	 * Returns the value of the '<em><b>Universe</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link spmm.Universe#getContentions <em>Contentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universe</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universe</em>' container reference.
	 * @see #setUniverse(Universe)
	 * @see spmm.SpmmPackage#getContention_Universe()
	 * @see spmm.Universe#getContentions
	 * @model opposite="contentions" required="true" transient="false"
	 * @generated
	 */
	Universe getUniverse();

	/**
	 * Sets the value of the '{@link spmm.Contention#getUniverse <em>Universe</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universe</em>' container reference.
	 * @see #getUniverse()
	 * @generated
	 */
	void setUniverse(Universe value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spmm.PhysicalSpace#getInnerSpaces <em>Inner Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(PhysicalSpace)
	 * @see spmm.SpmmPackage#getContention_Parent()
	 * @see spmm.PhysicalSpace#getInnerSpaces
	 * @model opposite="innerSpaces" required="true"
	 * @generated
	 */
	PhysicalSpace getParent();

	/**
	 * Sets the value of the '{@link spmm.Contention#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(PhysicalSpace value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spmm.PhysicalSpace#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(PhysicalSpace)
	 * @see spmm.SpmmPackage#getContention_Child()
	 * @see spmm.PhysicalSpace#getContainer
	 * @model opposite="container" required="true"
	 * @generated
	 */
	PhysicalSpace getChild();

	/**
	 * Sets the value of the '{@link spmm.Contention#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(PhysicalSpace value);

} // Contention
