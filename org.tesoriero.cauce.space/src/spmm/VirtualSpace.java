/**
 */
package spmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spmm.VirtualSpace#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.VirtualSpace#getContains <em>Contains</em>}</li>
 *   <li>{@link spmm.VirtualSpace#getGeneralizes <em>Generalizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see spmm.SpmmPackage#getVirtualSpace()
 * @model
 * @generated
 */
public interface VirtualSpace extends Space {
	/**
	 * Returns the value of the '<em><b>Universe</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link spmm.Universe#getVirtualSpaces <em>Virtual Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universe</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universe</em>' container reference.
	 * @see #setUniverse(Universe)
	 * @see spmm.SpmmPackage#getVirtualSpace_Universe()
	 * @see spmm.Universe#getVirtualSpaces
	 * @model opposite="virtualSpaces" required="true" transient="false"
	 * @generated
	 */
	Universe getUniverse();

	/**
	 * Sets the value of the '{@link spmm.VirtualSpace#getUniverse <em>Universe</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universe</em>' container reference.
	 * @see #getUniverse()
	 * @generated
	 */
	void setUniverse(Universe value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link spmm.Grouping}.
	 * It is bidirectional and its opposite is '{@link spmm.Grouping#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see spmm.SpmmPackage#getVirtualSpace_Contains()
	 * @see spmm.Grouping#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Grouping> getContains();

	/**
	 * Returns the value of the '<em><b>Generalizes</b></em>' reference list.
	 * The list contents are of type {@link spmm.Generalization}.
	 * It is bidirectional and its opposite is '{@link spmm.Generalization#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalizes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizes</em>' reference list.
	 * @see spmm.SpmmPackage#getVirtualSpace_Generalizes()
	 * @see spmm.Generalization#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Generalization> getGeneralizes();

} // VirtualSpace
