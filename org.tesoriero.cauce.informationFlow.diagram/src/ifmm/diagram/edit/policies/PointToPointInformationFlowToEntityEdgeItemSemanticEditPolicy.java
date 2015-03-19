package ifmm.diagram.edit.policies;

import ifmm.diagram.providers.InformationFlowElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class PointToPointInformationFlowToEntityEdgeItemSemanticEditPolicy
		extends InformationFlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PointToPointInformationFlowToEntityEdgeItemSemanticEditPolicy() {
		super(
				InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
