package ecmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ecmm.diagram.edit.commands.ContextActionCreateCommand;
import ecmm.diagram.providers.EntityContextElementTypes;

/**
 * @generated
 */
public class ContextSituationActionsItemSemanticEditPolicy extends
		EntityContextBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextSituationActionsItemSemanticEditPolicy() {
		super(EntityContextElementTypes.ContextSituation_3006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EntityContextElementTypes.ContextAction_3009 == req
				.getElementType()) {
			return getGEFWrapper(new ContextActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
