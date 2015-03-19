package somm.diagram.providers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import somm.SommPackage;
import somm.diagram.edit.parts.SocietyEditPart;
import somm.diagram.expressions.SocialOCLFactory;
import somm.diagram.part.SocialDiagramEditorPlugin;
import somm.diagram.part.SocialVisualIDRegistry;

/**
 * @generated
 */
public class SocialValidationProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				SocialDiagramEditorPlugin.getInstance().logError(
						"Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& SocietyEditPart.MODEL_ID.equals(SocialVisualIDRegistry
							.getModelID((View) object));
		}
		return true;
	}

	/**
	 * @generated
	 */
	public static class DefaultCtx implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			return isInDefaultEditorContext(object);
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter4 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					SommPackage.eINSTANCE.getSpecialization_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SocialOCLFactory.getExpression(9,
					EcorePackage.eINSTANCE.getEInt(), null).evaluate(context);
			if (result instanceof Boolean && ((Boolean) result).booleanValue()) {
				return Status.OK_STATUS;
			}
			return ctx.createFailureStatus(new Object[] { formatElement(ctx
					.getTarget()) });
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter5 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					SommPackage.eINSTANCE.getSociety_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SocialOCLFactory.getExpression(10,
					EcorePackage.eINSTANCE.getEString(), null)
					.evaluate(context);
			if (result instanceof Boolean && ((Boolean) result).booleanValue()) {
				return Status.OK_STATUS;
			}
			return ctx.createFailureStatus(new Object[] { formatElement(ctx
					.getTarget()) });
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter6 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					SommPackage.eINSTANCE.getIndividualInstance_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SocialOCLFactory.getExpression(11,
					EcorePackage.eINSTANCE.getEInt(), null).evaluate(context);
			if (result instanceof Boolean && ((Boolean) result).booleanValue()) {
				return Status.OK_STATUS;
			}
			return ctx.createFailureStatus(new Object[] { formatElement(ctx
					.getTarget()) });
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter8 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					SommPackage.eINSTANCE.getIndividualInstance_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SocialOCLFactory.getExpression(13,
					EcorePackage.eINSTANCE.getEString(), null)
					.evaluate(context);
			if (result instanceof Boolean && ((Boolean) result).booleanValue()) {
				return Status.OK_STATUS;
			}
			return ctx.createFailureStatus(new Object[] { formatElement(ctx
					.getTarget()) });
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter10 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					SommPackage.eINSTANCE.getRole_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SocialOCLFactory.getExpression(15,
					EcorePackage.eINSTANCE.getEInt(), null).evaluate(context);
			if (result instanceof Boolean && ((Boolean) result).booleanValue()) {
				return Status.OK_STATUS;
			}
			return ctx.createFailureStatus(new Object[] { formatElement(ctx
					.getTarget()) });
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter12 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					SommPackage.eINSTANCE.getRole_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SocialOCLFactory.getExpression(17,
					EcorePackage.eINSTANCE.getEString(), null)
					.evaluate(context);
			if (result instanceof Boolean && ((Boolean) result).booleanValue()) {
				return Status.OK_STATUS;
			}
			return ctx.createFailureStatus(new Object[] { formatElement(ctx
					.getTarget()) });
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter14 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					SommPackage.eINSTANCE.getIndividualRealization_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SocialOCLFactory.getExpression(19,
					EcorePackage.eINSTANCE.getEInt(), null).evaluate(context);
			if (result instanceof Boolean && ((Boolean) result).booleanValue()) {
				return Status.OK_STATUS;
			}
			return ctx.createFailureStatus(new Object[] { formatElement(ctx
					.getTarget()) });
		}
	}

	/**
	 * @generated
	 */
	static String formatElement(EObject object) {
		return EMFCoreUtil.getQualifiedName(object, true);
	}

}
