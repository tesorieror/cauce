/**
 */
package ifmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point To Point Information Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifmm.PointToPointInformationFlow#getOutputData <em>Output Data</em>}</li>
 *   <li>{@link ifmm.PointToPointInformationFlow#getSource <em>Source</em>}</li>
 *   <li>{@link ifmm.PointToPointInformationFlow#getTarget <em>Target</em>}</li>
 *   <li>{@link ifmm.PointToPointInformationFlow#getInputData <em>Input Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifmm.IfmmPackage#getPointToPointInformationFlow()
 * @model
 * @generated
 */
public interface PointToPointInformationFlow extends InformationFlow {
	/**
	 * Returns the value of the '<em><b>Output Data</b></em>' containment reference list.
	 * The list contents are of type {@link ifmm.OutputData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data</em>' containment reference list.
	 * @see ifmm.IfmmPackage#getPointToPointInformationFlow_OutputData()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputData> getOutputData();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifmm.EntityToPointToPointInformationFlowEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EntityToPointToPointInformationFlowEdge)
	 * @see ifmm.IfmmPackage#getPointToPointInformationFlow_Source()
	 * @see ifmm.EntityToPointToPointInformationFlowEdge#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	EntityToPointToPointInformationFlowEdge getSource();

	/**
	 * Sets the value of the '{@link ifmm.PointToPointInformationFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EntityToPointToPointInformationFlowEdge value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifmm.PointToPointInformationFlowToEntityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PointToPointInformationFlowToEntityEdge)
	 * @see ifmm.IfmmPackage#getPointToPointInformationFlow_Target()
	 * @see ifmm.PointToPointInformationFlowToEntityEdge#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	PointToPointInformationFlowToEntityEdge getTarget();

	/**
	 * Sets the value of the '{@link ifmm.PointToPointInformationFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PointToPointInformationFlowToEntityEdge value);

	/**
	 * Returns the value of the '<em><b>Input Data</b></em>' containment reference list.
	 * The list contents are of type {@link ifmm.InputData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data</em>' containment reference list.
	 * @see ifmm.IfmmPackage#getPointToPointInformationFlow_InputData()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputData> getInputData();

} // PointToPointInformationFlow
