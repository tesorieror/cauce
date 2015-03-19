package tamm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import tamm.ContextAwareSystem;
import tamm.PreCondition;
import tamm.PreConditionToSystemTask;
import tamm.SystemTask;
import tamm.diagram.edit.policies.TaskBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class PreConditionToSystemTaskReorientCommand extends EditElementCommand {

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
	public PreConditionToSystemTaskReorientCommand(
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
		if (false == getElementToEdit() instanceof PreConditionToSystemTask) {
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
		if (!(oldEnd instanceof PreCondition && newEnd instanceof PreCondition)) {
			return false;
		}
		SystemTask target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ContextAwareSystem)) {
			return false;
		}
		ContextAwareSystem container = (ContextAwareSystem) getLink()
				.eContainer();
		return TaskBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPreConditionToSystemTask_4005(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof SystemTask && newEnd instanceof SystemTask)) {
			return false;
		}
		PreCondition source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ContextAwareSystem)) {
			return false;
		}
		ContextAwareSystem container = (ContextAwareSystem) getLink()
				.eContainer();
		return TaskBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPreConditionToSystemTask_4005(container, getLink(),
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
	protected PreConditionToSystemTask getLink() {
		return (PreConditionToSystemTask) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected PreCondition getOldSource() {
		return (PreCondition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected PreCondition getNewSource() {
		return (PreCondition) newEnd;
	}

	/**
	 * @generated
	 */
	protected SystemTask getOldTarget() {
		return (SystemTask) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SystemTask getNewTarget() {
		return (SystemTask) newEnd;
	}
}
