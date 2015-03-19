/**
 */
package somm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link somm.Role#getSociety <em>Society</em>}</li>
 *   <li>{@link somm.Role#getIsRealizedByIndividual <em>Is Realized By Individual</em>}</li>
 *   <li>{@link somm.Role#getParent <em>Parent</em>}</li>
 *   <li>{@link somm.Role#getChildren <em>Children</em>}</li>
 *   <li>{@link somm.Role#getId <em>Id</em>}</li>
 *   <li>{@link somm.Role#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see somm.SommPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends SocialInstance {
	/**
	 * Returns the value of the '<em><b>Society</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link somm.Society#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Society</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Society</em>' container reference.
	 * @see #setSociety(Society)
	 * @see somm.SommPackage#getRole_Society()
	 * @see somm.Society#getRoles
	 * @model opposite="roles" required="true" transient="false"
	 * @generated
	 */
	Society getSociety();

	/**
	 * Sets the value of the '{@link somm.Role#getSociety <em>Society</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Society</em>' container reference.
	 * @see #getSociety()
	 * @generated
	 */
	void setSociety(Society value);

	/**
	 * Returns the value of the '<em><b>Is Realized By Individual</b></em>' reference list.
	 * The list contents are of type {@link somm.IndividualRealization}.
	 * It is bidirectional and its opposite is '{@link somm.IndividualRealization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Realized By Individual</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Realized By Individual</em>' reference list.
	 * @see somm.SommPackage#getRole_IsRealizedByIndividual()
	 * @see somm.IndividualRealization#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<IndividualRealization> getIsRealizedByIndividual();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference list.
	 * The list contents are of type {@link somm.Specialization}.
	 * It is bidirectional and its opposite is '{@link somm.Specialization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference list.
	 * @see somm.SommPackage#getRole_Parent()
	 * @see somm.Specialization#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Specialization> getParent();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link somm.Specialization}.
	 * It is bidirectional and its opposite is '{@link somm.Specialization#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see somm.SommPackage#getRole_Children()
	 * @see somm.Specialization#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Specialization> getChildren();

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
	 * @see somm.SommPackage#getRole_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link somm.Role#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see somm.SommPackage#getRole_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link somm.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Role
