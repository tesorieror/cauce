/**
 */
package somm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Society</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link somm.Society#getGeneralizations <em>Generalizations</em>}</li>
 *   <li>{@link somm.Society#getRelaizations <em>Relaizations</em>}</li>
 *   <li>{@link somm.Society#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link somm.Society#getName <em>Name</em>}</li>
 *   <li>{@link somm.Society#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see somm.SommPackage#getSociety()
 * @model
 * @generated
 */
public interface Society extends EObject {
	/**
	 * Returns the value of the '<em><b>Generalizations</b></em>' containment reference list.
	 * The list contents are of type {@link somm.Specialization}.
	 * It is bidirectional and its opposite is '{@link somm.Specialization#getSociety <em>Society</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizations</em>' containment reference list.
	 * @see somm.SommPackage#getSociety_Generalizations()
	 * @see somm.Specialization#getSociety
	 * @model opposite="society" containment="true"
	 * @generated
	 */
	EList<Specialization> getGeneralizations();

	/**
	 * Returns the value of the '<em><b>Relaizations</b></em>' containment reference list.
	 * The list contents are of type {@link somm.IndividualRealization}.
	 * It is bidirectional and its opposite is '{@link somm.IndividualRealization#getSociety <em>Society</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaizations</em>' containment reference list.
	 * @see somm.SommPackage#getSociety_Relaizations()
	 * @see somm.IndividualRealization#getSociety
	 * @model opposite="society" containment="true"
	 * @generated
	 */
	EList<IndividualRealization> getRelaizations();

	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
	 * The list contents are of type {@link somm.IndividualInstance}.
	 * It is bidirectional and its opposite is '{@link somm.IndividualInstance#getSociety <em>Society</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individuals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' containment reference list.
	 * @see somm.SommPackage#getSociety_Individuals()
	 * @see somm.IndividualInstance#getSociety
	 * @model opposite="society" containment="true"
	 * @generated
	 */
	EList<IndividualInstance> getIndividuals();

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
	 * @see somm.SommPackage#getSociety_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link somm.Society#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link somm.Role}.
	 * It is bidirectional and its opposite is '{@link somm.Role#getSociety <em>Society</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see somm.SommPackage#getSociety_Roles()
	 * @see somm.Role#getSociety
	 * @model opposite="society" containment="true" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // Society
