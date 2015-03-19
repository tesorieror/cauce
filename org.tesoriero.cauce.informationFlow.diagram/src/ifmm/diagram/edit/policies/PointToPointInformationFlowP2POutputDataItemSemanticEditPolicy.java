package ifmm.diagram.edit.policies;

import ifmm.diagram.edit.commands.OutputData2CreateCommand;
import ifmm.diagram.providers.InformationFlowElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PointToPointInformationFlowP2POutputDataItemSemanticEditPolicy
		extends InformationFlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PointToPointInformationFlowP2POutputDataItemSemanticEditPolicy() {
		super(InformationFlowElementTypes.PointToPointInformationFlow_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (InformationFlowElementTypes.OutputData_3002 == req.getElementType()) {
			return getGEFWrapper(new OutputData2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
