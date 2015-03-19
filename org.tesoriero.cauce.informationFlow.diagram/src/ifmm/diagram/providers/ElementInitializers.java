package ifmm.diagram.providers;

import ifmm.BroadcastInformationFlow;
import ifmm.ContextAwareEntity;
import ifmm.IfmmPackage;
import ifmm.InputData;
import ifmm.OutputData;
import ifmm.PointToPointInformationFlow;
import ifmm.diagram.expressions.InformationFlowAbstractExpression;
import ifmm.diagram.expressions.InformationFlowOCLFactory;
import ifmm.diagram.part.InformationFlowDiagramEditorPlugin;

import org.eclipse.emf.ecore.EcorePackage;

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
	public void init_BroadcastInformationFlow_2001(
			BroadcastInformationFlow instance) {
		try {
			Object value_0 = InformationFlowOCLFactory.getExpression(0,
					IfmmPackage.eINSTANCE.getBroadcastInformationFlow(), null)
					.evaluate(instance);

			value_0 = InformationFlowAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = InformationFlowOCLFactory.getExpression(1,
					IfmmPackage.eINSTANCE.getBroadcastInformationFlow(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_PointToPointInformationFlow_2002(
			PointToPointInformationFlow instance) {
		try {
			Object value_0 = InformationFlowOCLFactory.getExpression(3,
					IfmmPackage.eINSTANCE.getPointToPointInformationFlow(),
					null).evaluate(instance);

			value_0 = InformationFlowAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = InformationFlowOCLFactory.getExpression(4,
					IfmmPackage.eINSTANCE.getPointToPointInformationFlow(),
					null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ContextAwareEntity_2003(ContextAwareEntity instance) {
		try {
			Object value_0 = InformationFlowOCLFactory.getExpression(7,
					IfmmPackage.eINSTANCE.getContextAwareEntity(), null)
					.evaluate(instance);

			value_0 = InformationFlowAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = InformationFlowOCLFactory.getExpression(8,
					IfmmPackage.eINSTANCE.getContextAwareEntity(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputData_3001(OutputData instance) {
		try {
			Object value_0 = InformationFlowOCLFactory.getExpression(2,
					IfmmPackage.eINSTANCE.getOutputData(), null).evaluate(
					instance);
			instance.setDefinition((String) value_0);
		} catch (RuntimeException e) {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputData_3002(OutputData instance) {
		try {
			Object value_0 = InformationFlowOCLFactory.getExpression(5,
					IfmmPackage.eINSTANCE.getOutputData(), null).evaluate(
					instance);
			instance.setDefinition((String) value_0);
		} catch (RuntimeException e) {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InputData_3003(InputData instance) {
		try {
			Object value_0 = InformationFlowOCLFactory.getExpression(6,
					IfmmPackage.eINSTANCE.getInputData(), null).evaluate(
					instance);
			instance.setDefinition((String) value_0);
		} catch (RuntimeException e) {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = InformationFlowDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			InformationFlowDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
