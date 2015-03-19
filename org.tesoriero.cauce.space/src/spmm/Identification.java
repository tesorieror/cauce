/**
 */
package spmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spmm.Identification#getLocationUnit <em>Location Unit</em>}</li>
 *   <li>{@link spmm.Identification#getTechnology <em>Technology</em>}</li>
 *   <li>{@link spmm.Identification#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see spmm.SpmmPackage#getIdentification()
 * @model
 * @generated
 */
public interface Identification extends EObject {
	/**
	 * Returns the value of the '<em><b>Location Unit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link spmm.LocationUnit#getIdentifications <em>Identifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Unit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Unit</em>' container reference.
	 * @see #setLocationUnit(LocationUnit)
	 * @see spmm.SpmmPackage#getIdentification_LocationUnit()
	 * @see spmm.LocationUnit#getIdentifications
	 * @model opposite="identifications" required="true" transient="false"
	 * @generated
	 */
	LocationUnit getLocationUnit();

	/**
	 * Sets the value of the '{@link spmm.Identification#getLocationUnit <em>Location Unit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Unit</em>' container reference.
	 * @see #getLocationUnit()
	 * @generated
	 */
	void setLocationUnit(LocationUnit value);

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * The default value is <code>"<technology>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(String)
	 * @see spmm.SpmmPackage#getIdentification_Technology()
	 * @model default="<technology>" required="true"
	 * @generated
	 */
	String getTechnology();

	/**
	 * Sets the value of the '{@link spmm.Identification#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * The default value is <code>"<identification>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see spmm.SpmmPackage#getIdentification_Content()
	 * @model default="<identification>" required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link spmm.Identification#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // Identification
