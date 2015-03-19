/**
 */
package somm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link somm.Specialization#getTarget <em>Target</em>}</li>
 *   <li>{@link somm.Specialization#getSource <em>Source</em>}</li>
 *   <li>{@link somm.Specialization#getSociety <em>Society</em>}</li>
 *   <li>{@link somm.Specialization#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see somm.SommPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link somm.Role#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Role)
	 * @see somm.SommPackage#getSpecialization_Target()
	 * @see somm.Role#getParent
	 * @model opposite="parent" required="true"
	 * @generated
	 */
	Role getTarget();

	/**
	 * Sets the value of the '{@link somm.Specialization#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Role value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link somm.Role#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Role)
	 * @see somm.SommPackage#getSpecialization_Source()
	 * @see somm.Role#getChildren
	 * @model opposite="children" required="true"
	 * @generated
	 */
	Role getSource();

	/**
	 * Sets the value of the '{@link somm.Specialization#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Role value);

	/**
	 * Returns the value of the '<em><b>Society</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link somm.Society#getGeneralizations <em>Generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Society</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Society</em>' container reference.
	 * @see #setSociety(Society)
	 * @see somm.SommPackage#getSpecialization_Society()
	 * @see somm.Society#getGeneralizations
	 * @model opposite="generalizations" required="true" transient="false"
	 * @generated
	 */
	Society getSociety();

	/**
	 * Sets the value of the '{@link somm.Specialization#getSociety <em>Society</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Society</em>' container reference.
	 * @see #getSociety()
	 * @generated
	 */
	void setSociety(Society value);

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
	 * @see somm.SommPackage#getSpecialization_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link somm.Specialization#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Specialization
