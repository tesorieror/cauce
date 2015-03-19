/**
 */
package spmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spmm.Universe#getName <em>Name</em>}</li>
 *   <li>{@link spmm.Universe#getId <em>Id</em>}</li>
 *   <li>{@link spmm.Universe#getGroupings <em>Groupings</em>}</li>
 *   <li>{@link spmm.Universe#getGeneralizations <em>Generalizations</em>}</li>
 *   <li>{@link spmm.Universe#getContentions <em>Contentions</em>}</li>
 *   <li>{@link spmm.Universe#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link spmm.Universe#getVirtualSpaces <em>Virtual Spaces</em>}</li>
 *   <li>{@link spmm.Universe#getPhysicalSpaces <em>Physical Spaces</em>}</li>
 *   <li>{@link spmm.Universe#getLocationUnits <em>Location Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see spmm.SpmmPackage#getUniverse()
 * @model
 * @generated
 */
public interface Universe extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"spmm-diagram"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spmm.SpmmPackage#getUniverse_Name()
	 * @model default="spmm-diagram" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spmm.Universe#getName <em>Name</em>}' attribute.
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
	 * @see spmm.SpmmPackage#getUniverse_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link spmm.Universe#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Groupings</b></em>' containment reference list.
	 * The list contents are of type {@link spmm.Grouping}.
	 * It is bidirectional and its opposite is '{@link spmm.Grouping#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupings</em>' containment reference list.
	 * @see spmm.SpmmPackage#getUniverse_Groupings()
	 * @see spmm.Grouping#getUniverse
	 * @model opposite="universe" containment="true"
	 * @generated
	 */
	EList<Grouping> getGroupings();

	/**
	 * Returns the value of the '<em><b>Generalizations</b></em>' containment reference list.
	 * The list contents are of type {@link spmm.Generalization}.
	 * It is bidirectional and its opposite is '{@link spmm.Generalization#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizations</em>' containment reference list.
	 * @see spmm.SpmmPackage#getUniverse_Generalizations()
	 * @see spmm.Generalization#getUniverse
	 * @model opposite="universe" containment="true"
	 * @generated
	 */
	EList<Generalization> getGeneralizations();

	/**
	 * Returns the value of the '<em><b>Contentions</b></em>' containment reference list.
	 * The list contents are of type {@link spmm.Contention}.
	 * It is bidirectional and its opposite is '{@link spmm.Contention#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contentions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contentions</em>' containment reference list.
	 * @see spmm.SpmmPackage#getUniverse_Contentions()
	 * @see spmm.Contention#getUniverse
	 * @model opposite="universe" containment="true"
	 * @generated
	 */
	EList<Contention> getContentions();

	/**
	 * Returns the value of the '<em><b>Representations</b></em>' containment reference list.
	 * The list contents are of type {@link spmm.Representation}.
	 * It is bidirectional and its opposite is '{@link spmm.Representation#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representations</em>' containment reference list.
	 * @see spmm.SpmmPackage#getUniverse_Representations()
	 * @see spmm.Representation#getUniverse
	 * @model opposite="universe" containment="true"
	 * @generated
	 */
	EList<Representation> getRepresentations();

	/**
	 * Returns the value of the '<em><b>Virtual Spaces</b></em>' containment reference list.
	 * The list contents are of type {@link spmm.VirtualSpace}.
	 * It is bidirectional and its opposite is '{@link spmm.VirtualSpace#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Spaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Spaces</em>' containment reference list.
	 * @see spmm.SpmmPackage#getUniverse_VirtualSpaces()
	 * @see spmm.VirtualSpace#getUniverse
	 * @model opposite="universe" containment="true"
	 * @generated
	 */
	EList<VirtualSpace> getVirtualSpaces();

	/**
	 * Returns the value of the '<em><b>Physical Spaces</b></em>' containment reference list.
	 * The list contents are of type {@link spmm.PhysicalSpace}.
	 * It is bidirectional and its opposite is '{@link spmm.PhysicalSpace#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Spaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Spaces</em>' containment reference list.
	 * @see spmm.SpmmPackage#getUniverse_PhysicalSpaces()
	 * @see spmm.PhysicalSpace#getUniverse
	 * @model opposite="universe" containment="true"
	 * @generated
	 */
	EList<PhysicalSpace> getPhysicalSpaces();

	/**
	 * Returns the value of the '<em><b>Location Units</b></em>' containment reference list.
	 * The list contents are of type {@link spmm.LocationUnit}.
	 * It is bidirectional and its opposite is '{@link spmm.LocationUnit#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Units</em>' containment reference list.
	 * @see spmm.SpmmPackage#getUniverse_LocationUnits()
	 * @see spmm.LocationUnit#getUniverse
	 * @model opposite="universe" containment="true"
	 * @generated
	 */
	EList<LocationUnit> getLocationUnits();

} // Universe
