package ifmm.diagram.edit.policies;

import ifmm.diagram.providers.InformationFlowElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class EntityToPointToPointInformationFlowEdgeItemSemanticEditPolicy
		extends InformationFlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityToPointToPointInformationFlowEdgeItemSemanticEditPolicy() {
		super(
				InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
