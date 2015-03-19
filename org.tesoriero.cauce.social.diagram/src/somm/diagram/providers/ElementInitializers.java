package somm.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

import somm.IndividualInstance;
import somm.IndividualRealization;
import somm.Role;
import somm.SommPackage;
import somm.Specialization;
import somm.diagram.expressions.SocialAbstractExpression;
import somm.diagram.expressions.SocialOCLFactory;
import somm.diagram.part.SocialDiagramEditorPlugin;

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
	public void init_IndividualInstance_2001(IndividualInstance instance) {
		try {
			Object value_0 = SocialOCLFactory.getExpression(0,
					SommPackage.eINSTANCE.getIndividualInstance(), null)
					.evaluate(instance);

			value_0 = SocialAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = SocialOCLFactory.getExpression(1,
					SommPackage.eINSTANCE.getIndividualInstance(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			SocialDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Role_2002(Role instance) {
		try {
			Object value_0 = SocialOCLFactory.getExpression(2,
					SommPackage.eINSTANCE.getRole(), null).evaluate(instance);

			value_0 = SocialAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = SocialOCLFactory.getExpression(3,
					SommPackage.eINSTANCE.getRole(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			SocialDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Specialization_4001(Specialization instance) {
		try {
			Object value_0 = SocialOCLFactory.getExpression(4,
					SommPackage.eINSTANCE.getSpecialization(), null).evaluate(
					instance);

			value_0 = SocialAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			SocialDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_IndividualRealization_4002(IndividualRealization instance) {
		try {
			Object value_0 = SocialOCLFactory.getExpression(5,
					SommPackage.eINSTANCE.getIndividualRealization(), null)
					.evaluate(instance);

			value_0 = SocialAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			SocialDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SocialDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			SocialDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
