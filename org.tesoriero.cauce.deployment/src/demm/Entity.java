/**
 */
package demm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link demm.Entity#getName <em>Name</em>}</li>
 *   <li>{@link demm.Entity#getDevice <em>Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see demm.DemmPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
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
	 * @see demm.DemmPackage#getEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link demm.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link demm.Device#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' container reference.
	 * @see #setDevice(Device)
	 * @see demm.DemmPackage#getEntity_Device()
	 * @see demm.Device#getEntities
	 * @model opposite="entities" required="true" transient="false"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link demm.Entity#getDevice <em>Device</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' container reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

} // Entity
