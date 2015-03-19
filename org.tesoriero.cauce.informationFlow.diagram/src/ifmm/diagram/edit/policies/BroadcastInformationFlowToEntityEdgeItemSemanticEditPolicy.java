package ifmm.diagram.edit.policies;

import ifmm.diagram.providers.InformationFlowElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class BroadcastInformationFlowToEntityEdgeItemSemanticEditPolicy extends
		InformationFlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BroadcastInformationFlowToEntityEdgeItemSemanticEditPolicy() {
		super(
				InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
