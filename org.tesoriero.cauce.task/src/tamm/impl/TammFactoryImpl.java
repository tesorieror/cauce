/**
 */
package tamm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tamm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TammFactoryImpl extends EFactoryImpl implements TammFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TammFactory init() {
		try {
			TammFactory theTammFactory = (TammFactory)EPackage.Registry.INSTANCE.getEFactory(TammPackage.eNS_URI);
			if (theTammFactory != null) {
				return theTammFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TammFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TammFactoryImpl() {
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
			case TammPackage.CONTEXT_AWARE_SYSTEM: return createContextAwareSystem();
			case TammPackage.PRE_CONDITION: return createPreCondition();
			case TammPackage.POST_CONDITION: return createPostCondition();
			case TammPackage.INITIAL_CONDITION: return createInitialCondition();
			case TammPackage.FINAL_CONDITION: return createFinalCondition();
			case TammPackage.SIMPLE_TASK: return createSimpleTask();
			case TammPackage.SKIP_TASK: return createSkipTask();
			case TammPackage.PRE_CONDITION_TO_SYSTEM_TASK: return createPreConditionToSystemTask();
			case TammPackage.SYSTEM_TASK_TO_POST_CONDITION: return createSystemTaskToPostCondition();
			case TammPackage.AND_JOIN: return createAndJoin();
			case TammPackage.OR_JOIN: return createOrJoin();
			case TammPackage.AND_SPLIT: return createAndSplit();
			case TammPackage.OR_SPLIT: return createOrSplit();
			case TammPackage.INPUT_CONDITION_TO_JOIN_TASK: return createInputConditionToJoinTask();
			case TammPackage.INPUT_CONDITION_TO_SPLIT_TASK: return createInputConditionToSplitTask();
			case TammPackage.JOIN_TASK_TO_OUTPUT_CONDITION: return createJoinTaskToOutputCondition();
			case TammPackage.SPLIT_TASK_TO_OUTPUT_CONDITION: return createSplitTaskToOutputCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAwareSystem createContextAwareSystem() {
		ContextAwareSystemImpl contextAwareSystem = new ContextAwareSystemImpl();
		return contextAwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreCondition createPreCondition() {
		PreConditionImpl preCondition = new PreConditionImpl();
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostCondition createPostCondition() {
		PostConditionImpl postCondition = new PostConditionImpl();
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialCondition createInitialCondition() {
		InitialConditionImpl initialCondition = new InitialConditionImpl();
		return initialCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalCondition createFinalCondition() {
		FinalConditionImpl finalCondition = new FinalConditionImpl();
		return finalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTask createSimpleTask() {
		SimpleTaskImpl simpleTask = new SimpleTaskImpl();
		return simpleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkipTask createSkipTask() {
		SkipTaskImpl skipTask = new SkipTaskImpl();
		return skipTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreConditionToSystemTask createPreConditionToSystemTask() {
		PreConditionToSystemTaskImpl preConditionToSystemTask = new PreConditionToSystemTaskImpl();
		return preConditionToSystemTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTaskToPostCondition createSystemTaskToPostCondition() {
		SystemTaskToPostConditionImpl systemTaskToPostCondition = new SystemTaskToPostConditionImpl();
		return systemTaskToPostCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndJoin createAndJoin() {
		AndJoinImpl andJoin = new AndJoinImpl();
		return andJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrJoin createOrJoin() {
		OrJoinImpl orJoin = new OrJoinImpl();
		return orJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndSplit createAndSplit() {
		AndSplitImpl andSplit = new AndSplitImpl();
		return andSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrSplit createOrSplit() {
		OrSplitImpl orSplit = new OrSplitImpl();
		return orSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConditionToJoinTask createInputConditionToJoinTask() {
		InputConditionToJoinTaskImpl inputConditionToJoinTask = new InputConditionToJoinTaskImpl();
		return inputConditionToJoinTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConditionToSplitTask createInputConditionToSplitTask() {
		InputConditionToSplitTaskImpl inputConditionToSplitTask = new InputConditionToSplitTaskImpl();
		return inputConditionToSplitTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinTaskToOutputCondition createJoinTaskToOutputCondition() {
		JoinTaskToOutputConditionImpl joinTaskToOutputCondition = new JoinTaskToOutputConditionImpl();
		return joinTaskToOutputCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitTaskToOutputCondition createSplitTaskToOutputCondition() {
		SplitTaskToOutputConditionImpl splitTaskToOutputCondition = new SplitTaskToOutputConditionImpl();
		return splitTaskToOutputCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TammPackage getTammPackage() {
		return (TammPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TammPackage getPackage() {
		return TammPackage.eINSTANCE;
	}

} //TammFactoryImpl
