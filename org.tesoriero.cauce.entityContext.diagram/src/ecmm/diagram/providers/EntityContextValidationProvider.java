package ecmm.diagram.providers;

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

import ecmm.EcmmPackage;
import ecmm.diagram.edit.parts.SystemContextEditPart;
import ecmm.diagram.expressions.EntityContextOCLFactory;
import ecmm.diagram.part.EntityContextDiagramEditorPlugin;
import ecmm.diagram.part.EntityContextVisualIDRegistry;

/**
 * @generated
 */
public class EntityContextValidationProvider {

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
				EntityContextDiagramEditorPlugin.getInstance().logError(
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
					&& SystemContextEditPart.MODEL_ID
							.equals(EntityContextVisualIDRegistry
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
					EcmmPackage.eINSTANCE.getSystemContext_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(23,
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
					EcmmPackage.eINSTANCE.getEntityContext_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(24,
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
	public static class Adapter3 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					EcmmPackage.eINSTANCE.getEntityContext_Entity());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(25,
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
					EcmmPackage.eINSTANCE.getVariableDataDefinition_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(28,
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
					EcmmPackage.eINSTANCE
							.getVariableDataDefinition_Definition());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(29,
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
	public static class Adapter8 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					EcmmPackage.eINSTANCE.getVariableDataDefinition_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(30,
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
	public static class Adapter11 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					EcmmPackage.eINSTANCE.getContextCondition_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(33,
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
					EcmmPackage.eINSTANCE
							.getSensingContextCondition_Informationflow());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(34,
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
					EcmmPackage.eINSTANCE
							.getMemoryContextCondition_Expression());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(36,
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
	public static class Adapter17 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					EcmmPackage.eINSTANCE.getContextSituation_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(39,
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
	public static class Adapter18 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					EcmmPackage.eINSTANCE.getContextSituation_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(40,
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
	public static class Adapter20 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					EcmmPackage.eINSTANCE.getContextAction_Expression());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(42,
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
	public static class Adapter22 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					EcmmPackage.eINSTANCE.getContextAction_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(44,
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
	public static class Adapter23 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					EcmmPackage.eINSTANCE.getContextAction_MemoryName());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(45,
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
	public static class Adapter25 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					EcmmPackage.eINSTANCE.getContextMemory_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(47,
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
	public static class Adapter27 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					EcmmPackage.eINSTANCE.getContextMemory_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = EntityContextOCLFactory.getExpression(49,
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
