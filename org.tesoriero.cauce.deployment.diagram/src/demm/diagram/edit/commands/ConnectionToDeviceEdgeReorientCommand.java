package demm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import demm.Connection;
import demm.ConnectionToDeviceEdge;
import demm.DevelopmentEnvironment;
import demm.Device;
import demm.diagram.edit.policies.DeploymentBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConnectionToDeviceEdgeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ConnectionToDeviceEdgeReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ConnectionToDeviceEdge) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Connection && newEnd instanceof Connection)) {
			return false;
		}
		Device target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof DevelopmentEnvironment)) {
			return false;
		}
		DevelopmentEnvironment container = (DevelopmentEnvironment) getLink()
				.eContainer();
		return DeploymentBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnectionToDeviceEdge_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Device && newEnd instanceof Device)) {
			return false;
		}
		Connection source = getLink().getSource();
		if (!(getLink().eContainer() instanceof DevelopmentEnvironment)) {
			return false;
		}
		DevelopmentEnvironment container = (DevelopmentEnvironment) getLink()
				.eContainer();
		return DeploymentBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnectionToDeviceEdge_4002(container, getLink(),
						source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ConnectionToDeviceEdge getLink() {
		return (ConnectionToDeviceEdge) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Connection getOldSource() {
		return (Connection) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Connection getNewSource() {
		return (Connection) newEnd;
	}

	/**
	 * @generated
	 */
	protected Device getOldTarget() {
		return (Device) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Device getNewTarget() {
		return (Device) newEnd;
	}
}
