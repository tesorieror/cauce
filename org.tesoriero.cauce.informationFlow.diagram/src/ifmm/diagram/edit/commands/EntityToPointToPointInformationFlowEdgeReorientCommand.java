package ifmm.diagram.edit.commands;

import ifmm.ContextAwareEntity;
import ifmm.EntityToPointToPointInformationFlowEdge;
import ifmm.PointToPointInformationFlow;
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
public class EntityToPointToPointInformationFlowEdgeReorientCommand extends
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
	public EntityToPointToPointInformationFlowEdgeReorientCommand(
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
		if (false == getElementToEdit() instanceof EntityToPointToPointInformationFlowEdge) {
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
		if (!(oldEnd instanceof ContextAwareEntity && newEnd instanceof ContextAwareEntity)) {
			return false;
		}
		PointToPointInformationFlow target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof SystemInformaitonFlow)) {
			return false;
		}
		SystemInformaitonFlow container = (SystemInformaitonFlow) getLink()
				.eContainer();
		return InformationFlowBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntityToPointToPointInformationFlowEdge_4003(
						container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof PointToPointInformationFlow && newEnd instanceof PointToPointInformationFlow)) {
			return false;
		}
		ContextAwareEntity source = getLink().getSource();
		if (!(getLink().eContainer() instanceof SystemInformaitonFlow)) {
			return false;
		}
		SystemInformaitonFlow container = (SystemInformaitonFlow) getLink()
				.eContainer();
		return InformationFlowBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntityToPointToPointInformationFlowEdge_4003(
						container, getLink(), source, getNewTarget());
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
	protected EntityToPointToPointInformationFlowEdge getLink() {
		return (EntityToPointToPointInformationFlowEdge) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ContextAwareEntity getOldSource() {
		return (ContextAwareEntity) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ContextAwareEntity getNewSource() {
		return (ContextAwareEntity) newEnd;
	}

	/**
	 * @generated
	 */
	protected PointToPointInformationFlow getOldTarget() {
		return (PointToPointInformationFlow) oldEnd;
	}

	/**
	 * @generated
	 */
	protected PointToPointInformationFlow getNewTarget() {
		return (PointToPointInformationFlow) newEnd;
	}
}
