package rsmm.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

import rsmm.ContextAwareEntityReference;
import rsmm.ReferentialSpace;
import rsmm.RsmmPackage;
import rsmm.SpaceToEntityReferenceDependency;
import rsmm.SpaceToSpaceReferenceDependency;
import rsmm.diagram.expressions.SpaceReferenceAbstractExpression;
import rsmm.diagram.expressions.SpaceReferenceOCLFactory;
import rsmm.diagram.part.SpaceReferenceDiagramEditorPlugin;

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
	public void init_ContextAwareEntityReference_2001(
			ContextAwareEntityReference instance) {
		try {
			Object value_0 = SpaceReferenceOCLFactory.getExpression(0,
					RsmmPackage.eINSTANCE.getContextAwareEntityReference(),
					null).evaluate(instance);

			value_0 = SpaceReferenceAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = SpaceReferenceOCLFactory.getExpression(1,
					RsmmPackage.eINSTANCE.getContextAwareEntityReference(),
					null).evaluate(instance);
			instance.setName((String) value_1);
			Object value_2 = SpaceReferenceOCLFactory.getExpression(2,
					RsmmPackage.eINSTANCE.getContextAwareEntityReference(),
					null).evaluate(instance);
			instance.setEntity((String) value_2);
		} catch (RuntimeException e) {
			SpaceReferenceDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ReferentialSpace_2002(ReferentialSpace instance) {
		try {
			Object value_0 = SpaceReferenceOCLFactory.getExpression(3,
					RsmmPackage.eINSTANCE.getReferentialSpace(), null)
					.evaluate(instance);

			value_0 = SpaceReferenceAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = SpaceReferenceOCLFactory.getExpression(4,
					RsmmPackage.eINSTANCE.getReferentialSpace(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			SpaceReferenceDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_SpaceToSpaceReferenceDependency_4001(
			SpaceToSpaceReferenceDependency instance) {
		try {
			Object value_0 = SpaceReferenceOCLFactory.getExpression(5,
					RsmmPackage.eINSTANCE.getSpaceToSpaceReferenceDependency(),
					null).evaluate(instance);

			value_0 = SpaceReferenceAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setCardinality(((Integer) value_0).intValue());
			Object value_1 = SpaceReferenceOCLFactory.getExpression(6,
					RsmmPackage.eINSTANCE.getSpaceToSpaceReferenceDependency(),
					null).evaluate(instance);

			value_1 = SpaceReferenceAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			SpaceReferenceDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_SpaceToEntityReferenceDependency_4002(
			SpaceToEntityReferenceDependency instance) {
		try {
			Object value_0 = SpaceReferenceOCLFactory
					.getExpression(
							8,
							RsmmPackage.eINSTANCE
									.getSpaceToEntityReferenceDependency(),
							null).evaluate(instance);

			value_0 = SpaceReferenceAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = SpaceReferenceOCLFactory
					.getExpression(
							9,
							RsmmPackage.eINSTANCE
									.getSpaceToEntityReferenceDependency(),
							null).evaluate(instance);

			value_1 = SpaceReferenceAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setCardinality(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			SpaceReferenceDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SpaceReferenceDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			SpaceReferenceDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
