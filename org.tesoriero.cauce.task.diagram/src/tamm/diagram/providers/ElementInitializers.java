package tamm.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

import tamm.AndJoin;
import tamm.AndSplit;
import tamm.FinalCondition;
import tamm.InitialCondition;
import tamm.OrJoin;
import tamm.OrSplit;
import tamm.PostCondition;
import tamm.PreCondition;
import tamm.SimpleTask;
import tamm.SkipTask;
import tamm.TammPackage;
import tamm.diagram.expressions.TaskAbstractExpression;
import tamm.diagram.expressions.TaskOCLFactory;
import tamm.diagram.part.TaskDiagramEditorPlugin;

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
	public void init_AndSplit_2001(AndSplit instance) {
		try {
			Object value_0 = TaskOCLFactory.getExpression(0,
					TammPackage.eINSTANCE.getAndSplit(), null).evaluate(
					instance);

			value_0 = TaskAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_PreCondition_2002(PreCondition instance) {
		try {
			Object value_0 = TaskOCLFactory.getExpression(1,
					TammPackage.eINSTANCE.getPreCondition(), null).evaluate(
					instance);

			value_0 = TaskAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_PostCondition_2003(PostCondition instance) {
		try {
			Object value_0 = TaskOCLFactory.getExpression(2,
					TammPackage.eINSTANCE.getPostCondition(), null).evaluate(
					instance);

			value_0 = TaskAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_SkipTask_2004(SkipTask instance) {
		try {
			Object value_0 = TaskOCLFactory.getExpression(3,
					TammPackage.eINSTANCE.getSkipTask(), null).evaluate(
					instance);

			value_0 = TaskAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_FinalCondition_2005(FinalCondition instance) {
		try {
			Object value_0 = TaskOCLFactory.getExpression(4,
					TammPackage.eINSTANCE.getFinalCondition(), null).evaluate(
					instance);

			value_0 = TaskAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AndJoin_2006(AndJoin instance) {
		try {
			Object value_0 = TaskOCLFactory.getExpression(5,
					TammPackage.eINSTANCE.getAndJoin(), null)
					.evaluate(instance);

			value_0 = TaskAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InitialCondition_2007(InitialCondition instance) {
		try {
			Object value_0 = TaskOCLFactory.getExpression(6,
					TammPackage.eINSTANCE.getInitialCondition(), null)
					.evaluate(instance);

			value_0 = TaskAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_SimpleTask_2008(SimpleTask instance) {
		try {
			Object value_0 = TaskOCLFactory.getExpression(7,
					TammPackage.eINSTANCE.getSimpleTask(), null).evaluate(
					instance);

			value_0 = TaskAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OrSplit_2009(OrSplit instance) {
		try {
			Object value_0 = TaskOCLFactory.getExpression(8,
					TammPackage.eINSTANCE.getOrSplit(), null)
					.evaluate(instance);

			value_0 = TaskAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OrJoin_2010(OrJoin instance) {
		try {
			Object value_0 = TaskOCLFactory.getExpression(9,
					TammPackage.eINSTANCE.getOrJoin(), null).evaluate(instance);

			value_0 = TaskAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = TaskDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			TaskDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
