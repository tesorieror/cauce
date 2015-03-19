/**
 */
package demm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.OperatingSystem#getName <em>Name</em>}</li>
 *   <li>{@link demm.OperatingSystem#getVersion <em>Version</em>}</li>
 *   <li>{@link demm.OperatingSystem#getRevision <em>Revision</em>}</li>
 *   <li>{@link demm.OperatingSystem#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getOperatingSystem()
 * @model
 * @generated
 */
public interface OperatingSystem extends EObject {
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
	 * @see demm.DemmPackage#getOperatingSystem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link demm.OperatingSystem#getName <em>Name</em>}' attribute.
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
	 * @see demm.DemmPackage#getOperatingSystem_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link demm.OperatingSystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * @see demm.DemmPackage#getOperatingSystem_Revision()
	 * @model
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link demm.OperatingSystem#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link demm.DevelopmentEnvironment#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' container reference.
	 * @see #setEnvironment(DevelopmentEnvironment)
	 * @see demm.DemmPackage#getOperatingSystem_Environment()
	 * @see demm.DevelopmentEnvironment#getOs
	 * @model opposite="os" required="true" transient="false"
	 * @generated
	 */
	DevelopmentEnvironment getEnvironment();

	/**
	 * Sets the value of the '{@link demm.OperatingSystem#getEnvironment <em>Environment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' container reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(DevelopmentEnvironment value);

} // OperatingSystem
