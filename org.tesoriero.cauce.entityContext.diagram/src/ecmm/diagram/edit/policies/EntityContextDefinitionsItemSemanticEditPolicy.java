package ecmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ecmm.diagram.edit.commands.VariableDataDefinitionCreateCommand;
import ecmm.diagram.providers.EntityContextElementTypes;

/**
 * @generated
 */
public class EntityContextDefinitionsItemSemanticEditPolicy extends
		EntityContextBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityContextDefinitionsItemSemanticEditPolicy() {
		super(EntityContextElementTypes.EntityContext_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EntityContextElementTypes.VariableDataDefinition_3010 == req
				.getElementType()) {
			return getGEFWrapper(new VariableDataDefinitionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
