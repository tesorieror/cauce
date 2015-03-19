package demm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import demm.diagram.edit.commands.EntityCreateCommand;
import demm.diagram.providers.DeploymentElementTypes;

/**
 * @generated
 */
public class DeviceEntityCompartmentItemSemanticEditPolicy extends
		DeploymentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DeviceEntityCompartmentItemSemanticEditPolicy() {
		super(DeploymentElementTypes.Device_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeploymentElementTypes.Entity_3002 == req.getElementType()) {
			return getGEFWrapper(new EntityCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
