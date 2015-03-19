package ecmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ecmm.diagram.edit.commands.ContextSituationCreateCommand;
import ecmm.diagram.providers.EntityContextElementTypes;

/**
 * @generated
 */
public class EntityContextSituationsItemSemanticEditPolicy extends
		EntityContextBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityContextSituationsItemSemanticEditPolicy() {
		super(EntityContextElementTypes.EntityContext_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EntityContextElementTypes.ContextSituation_3006 == req
				.getElementType()) {
			return getGEFWrapper(new ContextSituationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
