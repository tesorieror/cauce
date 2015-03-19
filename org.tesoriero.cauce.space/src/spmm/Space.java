/**
 */
package spmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spmm.Space#getName <em>Name</em>}</li>
 *   <li>{@link spmm.Space#getId <em>Id</em>}</li>
 *   <li>{@link spmm.Space#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link spmm.Space#getGeneralizedBy <em>Generalized By</em>}</li>
 * </ul>
 * </p>
 *
 * @see spmm.SpmmPackage#getSpace()
 * @model abstract="true"
 * @generated
 */
public interface Space extends EObject {
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
	 * @see spmm.SpmmPackage#getSpace_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spmm.Space#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see spmm.SpmmPackage#getSpace_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link spmm.Space#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Group By</b></em>' reference list.
	 * The list contents are of type {@link spmm.Grouping}.
	 * It is bidirectional and its opposite is '{@link spmm.Grouping#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group By</em>' reference list.
	 * @see spmm.SpmmPackage#getSpace_GroupBy()
	 * @see spmm.Grouping#getChild
	 * @model opposite="child"
	 * @generated
	 */
	EList<Grouping> getGroupBy();

	/**
	 * Returns the value of the '<em><b>Generalized By</b></em>' reference list.
	 * The list contents are of type {@link spmm.Generalization}.
	 * It is bidirectional and its opposite is '{@link spmm.Generalization#getGeneralizes <em>Generalizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalized By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalized By</em>' reference list.
	 * @see spmm.SpmmPackage#getSpace_GeneralizedBy()
	 * @see spmm.Generalization#getGeneralizes
	 * @model opposite="generalizes"
	 * @generated
	 */
	EList<Generalization> getGeneralizedBy();

} // Space
