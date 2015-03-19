/**
 */
package ecmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecmm.EcmmPackage
 * @generated
 */
public interface EcmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcmmFactory eINSTANCE = ecmm.impl.EcmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Variable Data Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Data Definition</em>'.
	 * @generated
	 */
	VariableDataDefinition createVariableDataDefinition();

	/**
	 * Returns a new object of class '<em>Entity Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Context</em>'.
	 * @generated
	 */
	EntityContext createEntityContext();

	/**
	 * Returns a new object of class '<em>Context Situation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Situation</em>'.
	 * @generated
	 */
	ContextSituation createContextSituation();

	/**
	 * Returns a new object of class '<em>Logic Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Memory</em>'.
	 * @generated
	 */
	LogicMemory createLogicMemory();

	/**
	 * Returns a new object of class '<em>Dictionary Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dictionary Memory</em>'.
	 * @generated
	 */
	DictionaryMemory createDictionaryMemory();

	/**
	 * Returns a new object of class '<em>Holder Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Holder Memory</em>'.
	 * @generated
	 */
	HolderMemory createHolderMemory();

	/**
	 * Returns a new object of class '<em>Stack Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack Memory</em>'.
	 * @generated
	 */
	StackMemory createStackMemory();

	/**
	 * Returns a new object of class '<em>Time Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Memory</em>'.
	 * @generated
	 */
	TimeMemory createTimeMemory();

	/**
	 * Returns a new object of class '<em>Context Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Action</em>'.
	 * @generated
	 */
	ContextAction createContextAction();

	/**
	 * Returns a new object of class '<em>Sensing Context Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensing Context Condition</em>'.
	 * @generated
	 */
	SensingContextCondition createSensingContextCondition();

	/**
	 * Returns a new object of class '<em>Memory Context Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Context Condition</em>'.
	 * @generated
	 */
	MemoryContextCondition createMemoryContextCondition();

	/**
	 * Returns a new object of class '<em>System Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Context</em>'.
	 * @generated
	 */
	SystemContext createSystemContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcmmPackage getEcmmPackage();

} //EcmmFactory
