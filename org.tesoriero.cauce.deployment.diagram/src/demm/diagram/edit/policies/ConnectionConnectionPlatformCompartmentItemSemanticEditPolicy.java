package demm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import demm.diagram.edit.commands.ConnectionPlatformCreateCommand;
import demm.diagram.providers.DeploymentElementTypes;

/**
 * @generated
 */
public class ConnectionConnectionPlatformCompartmentItemSemanticEditPolicy
		extends DeploymentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionConnectionPlatformCompartmentItemSemanticEditPolicy() {
		super(DeploymentElementTypes.Connection_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeploymentElementTypes.ConnectionPlatform_3004 == req
				.getElementType()) {
			return getGEFWrapper(new ConnectionPlatformCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
