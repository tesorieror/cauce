package rsmm.diagram.providers;

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

import rsmm.RsmmPackage;
import rsmm.diagram.edit.parts.SystemInformationFlowReferenceSpaceEditPart;
import rsmm.diagram.expressions.SpaceReferenceOCLFactory;
import rsmm.diagram.part.SpaceReferenceDiagramEditorPlugin;
import rsmm.diagram.part.SpaceReferenceVisualIDRegistry;

/**
 * @generated
 */
public class SpaceReferenceValidationProvider {

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
				SpaceReferenceDiagramEditorPlugin.getInstance().logError(
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
					&& SystemInformationFlowReferenceSpaceEditPart.MODEL_ID
							.equals(SpaceReferenceVisualIDRegistry
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
					RsmmPackage.eINSTANCE
							.getSystemInformationFlowReferenceSpace_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SpaceReferenceOCLFactory.getExpression(11,
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
					RsmmPackage.eINSTANCE
							.getSystemInformationFlowReferenceSpace_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SpaceReferenceOCLFactory.getExpression(13,
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
					RsmmPackage.eINSTANCE.getReferentialSpace_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SpaceReferenceOCLFactory.getExpression(15,
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
					RsmmPackage.eINSTANCE.getReferentialSpace_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SpaceReferenceOCLFactory.getExpression(17,
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
	public static class Adapter9 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget()
					.eGet(RsmmPackage.eINSTANCE
							.getContextAwareEntityReference_Name());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SpaceReferenceOCLFactory.getExpression(19,
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
	public static class Adapter11 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					RsmmPackage.eINSTANCE.getContextAwareEntityReference_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SpaceReferenceOCLFactory.getExpression(21,
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
	public static class Adapter13 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					RsmmPackage.eINSTANCE
							.getContextAwareEntityReference_Entity());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SpaceReferenceOCLFactory.getExpression(23,
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
	public static class Adapter15 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					RsmmPackage.eINSTANCE.getReferenceDependency_Id());
			if (context == null) {
				return ctx.createFailureStatus(new Object[] { formatElement(ctx
						.getTarget()) });
			}
			Object result = SpaceReferenceOCLFactory.getExpression(25,
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
	public static class Adapter17 extends AbstractModelConstraint {

		/**
		 * @generated
		 */
		public IStatus validate(IValidationContext ctx) {
			final Object context = ctx.getTarget().eGet(
					RsmmPackage.eINSTANCE.getReferenceDependency_Cardinality());
			if (context == null) {
				return Status.OK_STATUS;
			}
			Object result = SpaceReferenceOCLFactory.getExpression(27,
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
