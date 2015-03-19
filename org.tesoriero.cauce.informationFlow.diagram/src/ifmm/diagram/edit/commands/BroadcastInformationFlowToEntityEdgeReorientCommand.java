package ifmm.diagram.edit.commands;

import ifmm.BroadcastInformationFlow;
import ifmm.BroadcastInformationFlowToEntityEdge;
import ifmm.ContextAwareEntity;
import ifmm.SystemInformaitonFlow;
import ifmm.diagram.edit.policies.InformationFlowBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class BroadcastInformationFlowToEntityEdgeReorientCommand extends
		EditElementCommand {

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
	public BroadcastInformationFlowToEntityEdgeReorientCommand(
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
		if (false == getElementToEdit() instanceof BroadcastInformationFlowToEntityEdge) {
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
		if (!(oldEnd instanceof BroadcastInformationFlow && newEnd instanceof BroadcastInformationFlow)) {
			return false;
		}
		ContextAwareEntity target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof SystemInformaitonFlow)) {
			return false;
		}
		SystemInformaitonFlow container = (SystemInformaitonFlow) getLink()
				.eContainer();
		return InformationFlowBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistBroadcastInformationFlowToEntityEdge_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ContextAwareEntity && newEnd instanceof ContextAwareEntity)) {
			return false;
		}
		BroadcastInformationFlow source = getLink().getSource();
		if (!(getLink().eContainer() instanceof SystemInformaitonFlow)) {
			return false;
		}
		SystemInformaitonFlow container = (SystemInformaitonFlow) getLink()
				.eContainer();
		return InformationFlowBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistBroadcastInformationFlowToEntityEdge_4001(container,
						getLink(), source, getNewTarget());
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
	protected BroadcastInformationFlowToEntityEdge getLink() {
		return (BroadcastInformationFlowToEntityEdge) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected BroadcastInformationFlow getOldSource() {
		return (BroadcastInformationFlow) oldEnd;
	}

	/**
	 * @generated
	 */
	protected BroadcastInformationFlow getNewSource() {
		return (BroadcastInformationFlow) newEnd;
	}

	/**
	 * @generated
	 */
	protected ContextAwareEntity getOldTarget() {
		return (ContextAwareEntity) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ContextAwareEntity getNewTarget() {
		return (ContextAwareEntity) newEnd;
	}
}
