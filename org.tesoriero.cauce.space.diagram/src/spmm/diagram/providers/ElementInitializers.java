package spmm.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

import spmm.Contention;
import spmm.Generalization;
import spmm.Grouping;
import spmm.PhysicalSpace;
import spmm.SpmmPackage;
import spmm.VirtualSpace;
import spmm.diagram.expressions.SpaceAbstractExpression;
import spmm.diagram.expressions.SpaceOCLFactory;
import spmm.diagram.part.SpaceDiagramEditorPlugin;

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
	public void init_PhysicalSpace_2001(PhysicalSpace instance) {
		try {
			Object value_0 = SpaceOCLFactory.getExpression(0,
					SpmmPackage.eINSTANCE.getPhysicalSpace(), null).evaluate(
					instance);

			value_0 = SpaceAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = SpaceOCLFactory.getExpression(1,
					SpmmPackage.eINSTANCE.getPhysicalSpace(), null).evaluate(
					instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			SpaceDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_VirtualSpace_2002(VirtualSpace instance) {
		try {
			Object value_0 = SpaceOCLFactory.getExpression(2,
					SpmmPackage.eINSTANCE.getVirtualSpace(), null).evaluate(
					instance);

			value_0 = SpaceAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = SpaceOCLFactory.getExpression(3,
					SpmmPackage.eINSTANCE.getVirtualSpace(), null).evaluate(
					instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			SpaceDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Grouping_4001(Grouping instance) {
		try {
			Object value_0 = SpaceOCLFactory.getExpression(4,
					SpmmPackage.eINSTANCE.getGrouping(), null).evaluate(
					instance);

			value_0 = SpaceAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			SpaceDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Contention_4002(Contention instance) {
		try {
			Object value_0 = SpaceOCLFactory.getExpression(5,
					SpmmPackage.eINSTANCE.getContention(), null).evaluate(
					instance);

			value_0 = SpaceAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			SpaceDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Generalization_4003(Generalization instance) {
		try {
			Object value_0 = SpaceOCLFactory.getExpression(6,
					SpmmPackage.eINSTANCE.getGeneralization(), null).evaluate(
					instance);

			value_0 = SpaceAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			SpaceDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SpaceDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			SpaceDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
