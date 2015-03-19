package tamm.diagram.providers;

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

import tamm.TammPackage;
import tamm.diagram.edit.parts.ContextAwareSystemEditPart;
import tamm.diagram.expressions.TaskOCLFactory;
import tamm.diagram.part.TaskDiagramEditorPlugin;
import tamm.diagram.part.TaskVisualIDRegistry;

/**
 * @generated
 */
public class TaskValidationProvider {

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
				TaskDiagramEditorPlugin.getInstance().logError(
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
					&& ContextAwareSystemEditPart.MODEL_ID
							.equals(TaskVisualIDRegistry
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
	public static class Adapter1 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					TammPackage.eINSTANCE.getContextAwareSystem_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = TaskOCLFactory.getExpression(20,
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
	public static class Adapter2 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					TammPackage.eINSTANCE.getCondition_SocialExpression());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = TaskOCLFactory.getExpression(21,
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
	public static class Adapter3 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					TammPackage.eINSTANCE.getCondition_SpaceExpression());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = TaskOCLFactory.getExpression(22,
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
	public static class Adapter4 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					TammPackage.eINSTANCE.getCondition_TaskExpression());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = TaskOCLFactory.getExpression(23,
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
	public static class Adapter5 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					TammPackage.eINSTANCE.getCondition_LogicExpression());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = TaskOCLFactory.getExpression(24,
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
					TammPackage.eINSTANCE.getCondition_DataExpression());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = TaskOCLFactory.getExpression(25,
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
	public static class Adapter7 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					TammPackage.eINSTANCE.getCondition_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = TaskOCLFactory.getExpression(26,
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
					TammPackage.eINSTANCE.getTask_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = TaskOCLFactory.getExpression(31,
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
	public static class Adapter21 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					TammPackage.eINSTANCE.getSimpleTask_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = TaskOCLFactory.getExpression(40,
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
