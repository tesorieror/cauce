package demm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import demm.diagram.edit.commands.InformationCreateCommand;
import demm.diagram.providers.DeploymentElementTypes;

/**
 * @generated
 */
public class ConnectionInformationCompartmentItemSemanticEditPolicy extends
		DeploymentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionInformationCompartmentItemSemanticEditPolicy() {
		super(DeploymentElementTypes.Connection_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeploymentElementTypes.Information_3003 == req.getElementType()) {
			return getGEFWrapper(new InformationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
