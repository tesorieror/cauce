/**
 */
package ecmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensing Context Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecmm.SensingContextCondition#getSituation <em>Situation</em>}</li>
 *   <li>{@link ecmm.SensingContextCondition#getInformationflow <em>Informationflow</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecmm.EcmmPackage#getSensingContextCondition()
 * @model
 * @generated
 */
public interface SensingContextCondition extends ContextCondition {
	/**
	 * Returns the value of the '<em><b>Situation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecmm.ContextSituation#getSensingConditions <em>Sensing Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation</em>' container reference.
	 * @see #setSituation(ContextSituation)
	 * @see ecmm.EcmmPackage#getSensingContextCondition_Situation()
	 * @see ecmm.ContextSituation#getSensingConditions
	 * @model opposite="sensingConditions" required="true" transient="false"
	 * @generated
	 */
	ContextSituation getSituation();

	/**
	 * Sets the value of the '{@link ecmm.SensingContextCondition#getSituation <em>Situation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation</em>' container reference.
	 * @see #getSituation()
	 * @generated
	 */
	void setSituation(ContextSituation value);

	/**
	 * Returns the value of the '<em><b>Informationflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informationflow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informationflow</em>' attribute.
	 * @see #setInformationflow(String)
	 * @see ecmm.EcmmPackage#getSensingContextCondition_Informationflow()
	 * @model
	 * @generated
	 */
	String getInformationflow();

	/**
	 * Sets the value of the '{@link ecmm.SensingContextCondition#getInformationflow <em>Informationflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informationflow</em>' attribute.
	 * @see #getInformationflow()
	 * @generated
	 */
	void setInformationflow(String value);

} // SensingContextCondition
