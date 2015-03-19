/**
 */
package spmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spmm.Representation#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.Representation#getRepresents <em>Represents</em>}</li>
 *   <li>{@link spmm.Representation#getRepresentedBy <em>Represented By</em>}</li>
 * </ul>
 * </p>
 *
 * @see spmm.SpmmPackage#getRepresentation()
 * @model
 * @generated
 */
public interface Representation extends SpaceRelationship {
	/**
	 * Returns the value of the '<em><b>Universe</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link spmm.Universe#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universe</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universe</em>' container reference.
	 * @see #setUniverse(Universe)
	 * @see spmm.SpmmPackage#getRepresentation_Universe()
	 * @see spmm.Universe#getRepresentations
	 * @model opposite="representations" required="true" transient="false"
	 * @generated
	 */
	Universe getUniverse();

	/**
	 * Sets the value of the '{@link spmm.Representation#getUniverse <em>Universe</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universe</em>' container reference.
	 * @see #getUniverse()
	 * @generated
	 */
	void setUniverse(Universe value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spmm.PhysicalSpace#getRepresentedBy <em>Represented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(PhysicalSpace)
	 * @see spmm.SpmmPackage#getRepresentation_Represents()
	 * @see spmm.PhysicalSpace#getRepresentedBy
	 * @model opposite="representedBy" required="true"
	 * @generated
	 */
	PhysicalSpace getRepresents();

	/**
	 * Sets the value of the '{@link spmm.Representation#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(PhysicalSpace value);

	/**
	 * Returns the value of the '<em><b>Represented By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spmm.LocationUnit#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented By</em>' reference.
	 * @see #setRepresentedBy(LocationUnit)
	 * @see spmm.SpmmPackage#getRepresentation_RepresentedBy()
	 * @see spmm.LocationUnit#getRepresents
	 * @model opposite="represents" required="true"
	 * @generated
	 */
	LocationUnit getRepresentedBy();

	/**
	 * Sets the value of the '{@link spmm.Representation#getRepresentedBy <em>Represented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented By</em>' reference.
	 * @see #getRepresentedBy()
	 * @generated
	 */
	void setRepresentedBy(LocationUnit value);

} // Representation
