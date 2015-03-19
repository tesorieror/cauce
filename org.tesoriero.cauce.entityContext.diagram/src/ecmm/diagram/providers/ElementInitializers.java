package ecmm.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

import ecmm.ContextAction;
import ecmm.ContextSituation;
import ecmm.DictionaryMemory;
import ecmm.EcmmPackage;
import ecmm.EntityContext;
import ecmm.HolderMemory;
import ecmm.LogicMemory;
import ecmm.MemoryContextCondition;
import ecmm.SensingContextCondition;
import ecmm.StackMemory;
import ecmm.TimeMemory;
import ecmm.VariableDataDefinition;
import ecmm.diagram.expressions.EntityContextAbstractExpression;
import ecmm.diagram.expressions.EntityContextOCLFactory;
import ecmm.diagram.part.EntityContextDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_EntityContext_2001(EntityContext instance) {
		try {
			Object value_0 = EntityContextOCLFactory.getExpression(0,
					EcmmPackage.eINSTANCE.getEntityContext(), null).evaluate(
					instance);

			value_0 = EntityContextAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = EntityContextOCLFactory.getExpression(1,
					EcmmPackage.eINSTANCE.getEntityContext(), null).evaluate(
					instance);
			instance.setEntity((String) value_1);
		} catch (RuntimeException e) {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_HolderMemory_3001(HolderMemory instance) {
		try {
			Object value_0 = EntityContextOCLFactory.getExpression(2,
					EcmmPackage.eINSTANCE.getHolderMemory(), null).evaluate(
					instance);

			value_0 = EntityContextAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = EntityContextOCLFactory.getExpression(3,
					EcmmPackage.eINSTANCE.getHolderMemory(), null).evaluate(
					instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_LogicMemory_3002(LogicMemory instance) {
		try {
			Object value_0 = EntityContextOCLFactory.getExpression(4,
					EcmmPackage.eINSTANCE.getLogicMemory(), null).evaluate(
					instance);

			value_0 = EntityContextAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = EntityContextOCLFactory.getExpression(5,
					EcmmPackage.eINSTANCE.getLogicMemory(), null).evaluate(
					instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TimeMemory_3003(TimeMemory instance) {
		try {
			Object value_0 = EntityContextOCLFactory.getExpression(6,
					EcmmPackage.eINSTANCE.getTimeMemory(), null).evaluate(
					instance);

			value_0 = EntityContextAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = EntityContextOCLFactory.getExpression(7,
					EcmmPackage.eINSTANCE.getTimeMemory(), null).evaluate(
					instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StackMemory_3004(StackMemory instance) {
		try {
			Object value_0 = EntityContextOCLFactory.getExpression(8,
					EcmmPackage.eINSTANCE.getStackMemory(), null).evaluate(
					instance);

			value_0 = EntityContextAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = EntityContextOCLFactory.getExpression(9,
					EcmmPackage.eINSTANCE.getStackMemory(), null).evaluate(
					instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DictionaryMemory_3005(DictionaryMemory instance) {
		try {
			Object value_0 = EntityContextOCLFactory.getExpression(10,
					EcmmPackage.eINSTANCE.getDictionaryMemory(), null)
					.evaluate(instance);

			value_0 = EntityContextAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = EntityContextOCLFactory.getExpression(11,
					EcmmPackage.eINSTANCE.getDictionaryMemory(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ContextSituation_3006(ContextSituation instance) {
		try {
			Object value_0 = EntityContextOCLFactory.getExpression(12,
					EcmmPackage.eINSTANCE.getContextSituation(), null)
					.evaluate(instance);

			value_0 = EntityContextAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = EntityContextOCLFactory.getExpression(13,
					EcmmPackage.eINSTANCE.getContextSituation(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_MemoryContextCondition_3007(MemoryContextCondition instance) {
		try {
			Object value_0 = EntityContextOCLFactory.getExpression(14,
					EcmmPackage.eINSTANCE.getMemoryContextCondition(), null)
					.evaluate(instance);

			value_0 = EntityContextAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = EntityContextOCLFactory.getExpression(15,
					EcmmPackage.eINSTANCE.getMemoryContextCondition(), null)
					.evaluate(instance);
			instance.setExpression((String) value_1);
		} catch (RuntimeException e) {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_SensingContextCondition_3008(
			SensingContextCondition instance) {
		try {
			Object value_0 = EntityContextOCLFactory.getExpression(16,
					EcmmPackage.eINSTANCE.getSensingContextCondition(), null)
					.evaluate(instance);

			value_0 = EntityContextAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = EntityContextOCLFactory.getExpression(17,
					EcmmPackage.eINSTANCE.getSensingContextCondition(), null)
					.evaluate(instance);
			instance.setInformationflow((String) value_1);
		} catch (RuntimeException e) {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ContextAction_3009(ContextAction instance) {
		try {
			Object value_0 = EntityContextOCLFactory.getExpression(18,
					EcmmPackage.eINSTANCE.getContextAction(), null).evaluate(
					instance);

			value_0 = EntityContextAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = EntityContextOCLFactory.getExpression(19,
					EcmmPackage.eINSTANCE.getContextAction(), null).evaluate(
					instance);
			instance.setExpression((String) value_1);
		} catch (RuntimeException e) {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_VariableDataDefinition_3010(VariableDataDefinition instance) {
		try {
			Object value_0 = EntityContextOCLFactory.getExpression(20,
					EcmmPackage.eINSTANCE.getVariableDataDefinition(), null)
					.evaluate(instance);

			value_0 = EntityContextAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = EntityContextOCLFactory.getExpression(21,
					EcmmPackage.eINSTANCE.getVariableDataDefinition(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
			Object value_2 = EntityContextOCLFactory.getExpression(22,
					EcmmPackage.eINSTANCE.getVariableDataDefinition(), null)
					.evaluate(instance);
			instance.setDefinition((String) value_2);
		} catch (RuntimeException e) {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = EntityContextDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			EntityContextDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
