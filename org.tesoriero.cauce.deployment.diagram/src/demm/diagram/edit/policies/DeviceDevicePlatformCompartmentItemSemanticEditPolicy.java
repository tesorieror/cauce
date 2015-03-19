package demm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import demm.diagram.edit.commands.DevicePlatformCreateCommand;
import demm.diagram.providers.DeploymentElementTypes;

/**
 * @generated
 */
public class DeviceDevicePlatformCompartmentItemSemanticEditPolicy extends
		DeploymentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DeviceDevicePlatformCompartmentItemSemanticEditPolicy() {
		super(DeploymentElementTypes.Device_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeploymentElementTypes.DevicePlatform_3001 == req.getElementType()) {
			return getGEFWrapper(new DevicePlatformCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
