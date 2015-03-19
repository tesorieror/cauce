package spmm.diagram.providers;

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

import spmm.SpmmPackage;
import spmm.diagram.edit.parts.UniverseEditPart;
import spmm.diagram.expressions.SpaceOCLFactory;
import spmm.diagram.part.SpaceDiagramEditorPlugin;
import spmm.diagram.part.SpaceVisualIDRegistry;

/**
 * @generated
 */
public class SpaceValidationProvider {

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
				SpaceDiagramEditorPlugin.getInstance().logError(
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
					&& UniverseEditPart.MODEL_ID.equals(SpaceVisualIDRegistry
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
	public static class Adapter10 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					SpmmPackage.eINSTANCE.getSpaceRelationship_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SpaceOCLFactory.getExpression(16,
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
	public static class Adapter15 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					SpmmPackage.eINSTANCE.getSpace_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SpaceOCLFactory.getExpression(21,
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
	public static class Adapter16 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					SpmmPackage.eINSTANCE.getSpace_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SpaceOCLFactory.getExpression(22,
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
	static String formatElement(EObject object) {
		return EMFCoreUtil.getQualifiedName(object, true);
	}

}
