package demm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import demm.diagram.providers.DeploymentElementTypes;

/**
 * @generated
 */
public class ConnectionToDeviceEdgeItemSemanticEditPolicy extends
		DeploymentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionToDeviceEdgeItemSemanticEditPolicy() {
		super(DeploymentElementTypes.ConnectionToDeviceEdge_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
