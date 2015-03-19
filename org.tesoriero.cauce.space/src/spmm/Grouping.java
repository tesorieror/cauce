/**
 */
package spmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grouping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spmm.Grouping#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.Grouping#getChild <em>Child</em>}</li>
 *   <li>{@link spmm.Grouping#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see spmm.SpmmPackage#getGrouping()
 * @model
 * @generated
 */
public interface Grouping extends SpaceRelationship {
	/**
	 * Returns the value of the '<em><b>Universe</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link spmm.Universe#getGroupings <em>Groupings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universe</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universe</em>' container reference.
	 * @see #setUniverse(Universe)
	 * @see spmm.SpmmPackage#getGrouping_Universe()
	 * @see spmm.Universe#getGroupings
	 * @model opposite="groupings" required="true" transient="false"
	 * @generated
	 */
	Universe getUniverse();

	/**
	 * Sets the value of the '{@link spmm.Grouping#getUniverse <em>Universe</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universe</em>' container reference.
	 * @see #getUniverse()
	 * @generated
	 */
	void setUniverse(Universe value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spmm.Space#getGroupBy <em>Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(Space)
	 * @see spmm.SpmmPackage#getGrouping_Child()
	 * @see spmm.Space#getGroupBy
	 * @model opposite="groupBy" required="true"
	 * @generated
	 */
	Space getChild();

	/**
	 * Sets the value of the '{@link spmm.Grouping#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Space value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spmm.VirtualSpace#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(VirtualSpace)
	 * @see spmm.SpmmPackage#getGrouping_Parent()
	 * @see spmm.VirtualSpace#getContains
	 * @model opposite="contains" required="true"
	 * @generated
	 */
	VirtualSpace getParent();

	/**
	 * Sets the value of the '{@link spmm.Grouping#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(VirtualSpace value);

} // Grouping
