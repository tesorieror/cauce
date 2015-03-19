/**
 */
package spmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spmm.LocationUnit#getIdentifications <em>Identifications</em>}</li>
 *   <li>{@link spmm.LocationUnit#getUniverse <em>Universe</em>}</li>
 *   <li>{@link spmm.LocationUnit#getRepresents <em>Represents</em>}</li>
 *   <li>{@link spmm.LocationUnit#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see spmm.SpmmPackage#getLocationUnit()
 * @model
 * @generated
 */
public interface LocationUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifications</b></em>' containment reference list.
	 * The list contents are of type {@link spmm.Identification}.
	 * It is bidirectional and its opposite is '{@link spmm.Identification#getLocationUnit <em>Location Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifications</em>' containment reference list.
	 * @see spmm.SpmmPackage#getLocationUnit_Identifications()
	 * @see spmm.Identification#getLocationUnit
	 * @model opposite="locationUnit" containment="true" required="true"
	 * @generated
	 */
	EList<Identification> getIdentifications();

	/**
	 * Returns the value of the '<em><b>Universe</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link spmm.Universe#getLocationUnits <em>Location Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universe</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universe</em>' container reference.
	 * @see #setUniverse(Universe)
	 * @see spmm.SpmmPackage#getLocationUnit_Universe()
	 * @see spmm.Universe#getLocationUnits
	 * @model opposite="locationUnits" required="true" transient="false"
	 * @generated
	 */
	Universe getUniverse();

	/**
	 * Sets the value of the '{@link spmm.LocationUnit#getUniverse <em>Universe</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universe</em>' container reference.
	 * @see #getUniverse()
	 * @generated
	 */
	void setUniverse(Universe value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spmm.Representation#getRepresentedBy <em>Represented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(Representation)
	 * @see spmm.SpmmPackage#getLocationUnit_Represents()
	 * @see spmm.Representation#getRepresentedBy
	 * @model opposite="representedBy" required="true"
	 * @generated
	 */
	Representation getRepresents();

	/**
	 * Sets the value of the '{@link spmm.LocationUnit#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(Representation value);

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
	 * @see spmm.SpmmPackage#getLocationUnit_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spmm.LocationUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LocationUnit
