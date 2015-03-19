/**
 */
package spmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spmm.Generalization#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.Generalization#getParent <em>Parent</em>}</li>
 *   <li>{@link spmm.Generalization#getGeneralizes <em>Generalizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see spmm.SpmmPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends SpaceRelationship {
	/**
	 * Returns the value of the '<em><b>Universe</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link spmm.Universe#getGeneralizations <em>Generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universe</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universe</em>' container reference.
	 * @see #setUniverse(Universe)
	 * @see spmm.SpmmPackage#getGeneralization_Universe()
	 * @see spmm.Universe#getGeneralizations
	 * @model opposite="generalizations" required="true" transient="false"
	 * @generated
	 */
	Universe getUniverse();

	/**
	 * Sets the value of the '{@link spmm.Generalization#getUniverse <em>Universe</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universe</em>' container reference.
	 * @see #getUniverse()
	 * @generated
	 */
	void setUniverse(Universe value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spmm.VirtualSpace#getGeneralizes <em>Generalizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(VirtualSpace)
	 * @see spmm.SpmmPackage#getGeneralization_Parent()
	 * @see spmm.VirtualSpace#getGeneralizes
	 * @model opposite="generalizes" required="true"
	 * @generated
	 */
	VirtualSpace getParent();

	/**
	 * Sets the value of the '{@link spmm.Generalization#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(VirtualSpace value);

	/**
	 * Returns the value of the '<em><b>Generalizes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spmm.Space#getGeneralizedBy <em>Generalized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalizes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizes</em>' reference.
	 * @see #setGeneralizes(Space)
	 * @see spmm.SpmmPackage#getGeneralization_Generalizes()
	 * @see spmm.Space#getGeneralizedBy
	 * @model opposite="generalizedBy" required="true"
	 * @generated
	 */
	Space getGeneralizes();

	/**
	 * Sets the value of the '{@link spmm.Generalization#getGeneralizes <em>Generalizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalizes</em>' reference.
	 * @see #getGeneralizes()
	 * @generated
	 */
	void setGeneralizes(Space value);

} // Generalization
