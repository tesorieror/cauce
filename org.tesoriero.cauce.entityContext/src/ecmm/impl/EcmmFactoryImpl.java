/**
 */
package ecmm.impl;

import ecmm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcmmFactoryImpl extends EFactoryImpl implements EcmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcmmFactory init() {
		try {
			EcmmFactory theEcmmFactory = (EcmmFactory)EPackage.Registry.INSTANCE.getEFactory(EcmmPackage.eNS_URI);
			if (theEcmmFactory != null) {
				return theEcmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcmmPackage.VARIABLE_DATA_DEFINITION: return createVariableDataDefinition();
			case EcmmPackage.ENTITY_CONTEXT: return createEntityContext();
			case EcmmPackage.CONTEXT_SITUATION: return createContextSituation();
			case EcmmPackage.LOGIC_MEMORY: return createLogicMemory();
			case EcmmPackage.DICTIONARY_MEMORY: return createDictionaryMemory();
			case EcmmPackage.HOLDER_MEMORY: return createHolderMemory();
			case EcmmPackage.STACK_MEMORY: return createStackMemory();
			case EcmmPackage.TIME_MEMORY: return createTimeMemory();
			case EcmmPackage.CONTEXT_ACTION: return createContextAction();
			case EcmmPackage.SENSING_CONTEXT_CONDITION: return createSensingContextCondition();
			case EcmmPackage.MEMORY_CONTEXT_CONDITION: return createMemoryContextCondition();
			case EcmmPackage.SYSTEM_CONTEXT: return createSystemContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataDefinition createVariableDataDefinition() {
		VariableDataDefinitionImpl variableDataDefinition = new VariableDataDefinitionImpl();
		return variableDataDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityContext createEntityContext() {
		EntityContextImpl entityContext = new EntityContextImpl();
		return entityContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextSituation createContextSituation() {
		ContextSituationImpl contextSituation = new ContextSituationImpl();
		return contextSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicMemory createLogicMemory() {
		LogicMemoryImpl logicMemory = new LogicMemoryImpl();
		return logicMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryMemory createDictionaryMemory() {
		DictionaryMemoryImpl dictionaryMemory = new DictionaryMemoryImpl();
		return dictionaryMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HolderMemory createHolderMemory() {
		HolderMemoryImpl holderMemory = new HolderMemoryImpl();
		return holderMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackMemory createStackMemory() {
		StackMemoryImpl stackMemory = new StackMemoryImpl();
		return stackMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeMemory createTimeMemory() {
		TimeMemoryImpl timeMemory = new TimeMemoryImpl();
		return timeMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAction createContextAction() {
		ContextActionImpl contextAction = new ContextActionImpl();
		return contextAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingContextCondition createSensingContextCondition() {
		SensingContextConditionImpl sensingContextCondition = new SensingContextConditionImpl();
		return sensingContextCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryContextCondition createMemoryContextCondition() {
		MemoryContextConditionImpl memoryContextCondition = new MemoryContextConditionImpl();
		return memoryContextCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemContext createSystemContext() {
		SystemContextImpl systemContext = new SystemContextImpl();
		return systemContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcmmPackage getEcmmPackage() {
		return (EcmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcmmPackage getPackage() {
		return EcmmPackage.eINSTANCE;
	}

} //EcmmFactoryImpl
