package ecmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ecmm.diagram.edit.commands.MemoryContextConditionCreateCommand;
import ecmm.diagram.providers.EntityContextElementTypes;

/**
 * @generated
 */
public class ContextSituationConditionsItemSemanticEditPolicy extends
		EntityContextBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextSituationConditionsItemSemanticEditPolicy() {
		super(EntityContextElementTypes.ContextSituation_3006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EntityContextElementTypes.MemoryContextCondition_3007 == req
				.getElementType()) {
			return getGEFWrapper(new MemoryContextConditionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
