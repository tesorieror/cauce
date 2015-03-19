/**
 */
package demm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programming Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.ProgrammingLanguage#getName <em>Name</em>}</li>
 *   <li>{@link demm.ProgrammingLanguage#getVersion <em>Version</em>}</li>
 *   <li>{@link demm.ProgrammingLanguage#getProfile <em>Profile</em>}</li>
 *   <li>{@link demm.ProgrammingLanguage#getRevision <em>Revision</em>}</li>
 *   <li>{@link demm.ProgrammingLanguage#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getProgrammingLanguage()
 * @model
 * @generated
 */
public interface ProgrammingLanguage extends EObject {
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
	 * @see demm.DemmPackage#getProgrammingLanguage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link demm.ProgrammingLanguage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see demm.DemmPackage#getProgrammingLanguage_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link demm.ProgrammingLanguage#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' attribute.
	 * @see #setProfile(String)
	 * @see demm.DemmPackage#getProgrammingLanguage_Profile()
	 * @model
	 * @generated
	 */
	String getProfile();

	/**
	 * Sets the value of the '{@link demm.ProgrammingLanguage#getProfile <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' attribute.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(String value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(String)
	 * @see demm.DemmPackage#getProgrammingLanguage_Revision()
	 * @model
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link demm.ProgrammingLanguage#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link demm.DevelopmentEnvironment#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' container reference.
	 * @see #setEnvironment(DevelopmentEnvironment)
	 * @see demm.DemmPackage#getProgrammingLanguage_Environment()
	 * @see demm.DevelopmentEnvironment#getLanguages
	 * @model opposite="languages" required="true" transient="false"
	 * @generated
	 */
	DevelopmentEnvironment getEnvironment();

	/**
	 * Sets the value of the '{@link demm.ProgrammingLanguage#getEnvironment <em>Environment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' container reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(DevelopmentEnvironment value);

} // ProgrammingLanguage
