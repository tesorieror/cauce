package ecmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ecmm.diagram.edit.commands.SensingContextConditionCreateCommand;
import ecmm.diagram.providers.EntityContextElementTypes;

/**
 * @generated
 */
public class ContextSituationSensingItemSemanticEditPolicy extends
		EntityContextBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextSituationSensingItemSemanticEditPolicy() {
		super(EntityContextElementTypes.ContextSituation_3006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EntityContextElementTypes.SensingContextCondition_3008 == req
				.getElementType()) {
			return getGEFWrapper(new SensingContextConditionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
