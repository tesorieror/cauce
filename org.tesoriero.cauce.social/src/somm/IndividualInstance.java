/**
 */
package somm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link somm.IndividualInstance#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link somm.IndividualInstance#getId <em>Id</em>}</li>
 *   <li>{@link somm.IndividualInstance#getName <em>Name</em>}</li>
 *   <li>{@link somm.IndividualInstance#getSociety <em>Society</em>}</li>
 * </ul>
 * </p>
 *
 * @see somm.SommPackage#getIndividualInstance()
 * @model
 * @generated
 */
public interface IndividualInstance extends SocialInstance {
	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference list.
	 * The list contents are of type {@link somm.IndividualRealization}.
	 * It is bidirectional and its opposite is '{@link somm.IndividualRealization#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference list.
	 * @see somm.SommPackage#getIndividualInstance_Realizes()
	 * @see somm.IndividualRealization#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	EList<IndividualRealization> getRealizes();

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
	 * @see somm.SommPackage#getIndividualInstance_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link somm.IndividualInstance#getId <em>Id</em>}' attribute.
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
	 * @see somm.SommPackage#getIndividualInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link somm.IndividualInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Society</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link somm.Society#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Society</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Society</em>' container reference.
	 * @see #setSociety(Society)
	 * @see somm.SommPackage#getIndividualInstance_Society()
	 * @see somm.Society#getIndividuals
	 * @model opposite="individuals" required="true" transient="false"
	 * @generated
	 */
	Society getSociety();

	/**
	 * Sets the value of the '{@link somm.IndividualInstance#getSociety <em>Society</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Society</em>' container reference.
	 * @see #getSociety()
	 * @generated
	 */
	void setSociety(Society value);

} // IndividualInstance
