package ifmm.diagram.edit.policies;

import ifmm.diagram.edit.commands.OutputDataCreateCommand;
import ifmm.diagram.providers.InformationFlowElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class BroadcastInformationFlowBOutputDataItemSemanticEditPolicy extends
		InformationFlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BroadcastInformationFlowBOutputDataItemSemanticEditPolicy() {
		super(InformationFlowElementTypes.BroadcastInformationFlow_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (InformationFlowElementTypes.OutputData_3001 == req.getElementType()) {
			return getGEFWrapper(new OutputDataCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
