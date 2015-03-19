package ifmm.diagram.edit.policies;

import ifmm.diagram.edit.commands.InputDataCreateCommand;
import ifmm.diagram.providers.InformationFlowElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PointToPointInformationFlowP2PInputDataItemSemanticEditPolicy
		extends InformationFlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PointToPointInformationFlowP2PInputDataItemSemanticEditPolicy() {
		super(InformationFlowElementTypes.PointToPointInformationFlow_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (InformationFlowElementTypes.InputData_3003 == req.getElementType()) {
			return getGEFWrapper(new InputDataCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
