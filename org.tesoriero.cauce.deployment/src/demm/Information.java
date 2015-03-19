/**
 */
package demm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.Information#getConnection <em>Connection</em>}</li>
 *   <li>{@link demm.Information#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getInformation()
 * @model
 * @generated
 */
public interface Information extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link demm.Connection#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' container reference.
	 * @see #setConnection(Connection)
	 * @see demm.DemmPackage#getInformation_Connection()
	 * @see demm.Connection#getInformation
	 * @model opposite="information" required="true" transient="false"
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link demm.Information#getConnection <em>Connection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' container reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

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
	 * @see demm.DemmPackage#getInformation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link demm.Information#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Information
