/**
 */
package spmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spmm.PhysicalSpace#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.PhysicalSpace#getRepresentedBy <em>Represented By</em>}</li>
 *   <li>{@link spmm.PhysicalSpace#getInnerSpaces <em>Inner Spaces</em>}</li>
 *   <li>{@link spmm.PhysicalSpace#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see spmm.SpmmPackage#getPhysicalSpace()
 * @model
 * @generated
 */
public interface PhysicalSpace extends Space {
	/**
	 * Returns the value of the '<em><b>Universe</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link spmm.Universe#getPhysicalSpaces <em>Physical Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universe</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universe</em>' container reference.
	 * @see #setUniverse(Universe)
	 * @see spmm.SpmmPackage#getPhysicalSpace_Universe()
	 * @see spmm.Universe#getPhysicalSpaces
	 * @model opposite="physicalSpaces" required="true" transient="false"
	 * @generated
	 */
	Universe getUniverse();

	/**
	 * Sets the value of the '{@link spmm.PhysicalSpace#getUniverse <em>Universe</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universe</em>' container reference.
	 * @see #getUniverse()
	 * @generated
	 */
	void setUniverse(Universe value);

	/**
	 * Returns the value of the '<em><b>Represented By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spmm.Representation#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented By</em>' reference.
	 * @see #setRepresentedBy(Representation)
	 * @see spmm.SpmmPackage#getPhysicalSpace_RepresentedBy()
	 * @see spmm.Representation#getRepresents
	 * @model opposite="represents"
	 * @generated
	 */
	Representation getRepresentedBy();

	/**
	 * Sets the value of the '{@link spmm.PhysicalSpace#getRepresentedBy <em>Represented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented By</em>' reference.
	 * @see #getRepresentedBy()
	 * @generated
	 */
	void setRepresentedBy(Representation value);

	/**
	 * Returns the value of the '<em><b>Inner Spaces</b></em>' reference list.
	 * The list contents are of type {@link spmm.Contention}.
	 * It is bidirectional and its opposite is '{@link spmm.Contention#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Spaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Spaces</em>' reference list.
	 * @see spmm.SpmmPackage#getPhysicalSpace_InnerSpaces()
	 * @see spmm.Contention#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Contention> getInnerSpaces();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spmm.Contention#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Contention)
	 * @see spmm.SpmmPackage#getPhysicalSpace_Container()
	 * @see spmm.Contention#getChild
	 * @model opposite="child"
	 * @generated
	 */
	Contention getContainer();

	/**
	 * Sets the value of the '{@link spmm.PhysicalSpace#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Contention value);

} // PhysicalSpace
