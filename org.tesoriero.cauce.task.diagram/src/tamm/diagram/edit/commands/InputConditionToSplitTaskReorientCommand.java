package tamm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import tamm.ContextAwareSystem;
import tamm.InputConditionToSplitTask;
import tamm.Split;
import tamm.TaskInputCondition;
import tamm.diagram.edit.policies.TaskBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InputConditionToSplitTaskReorientCommand extends
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
	public InputConditionToSplitTaskReorientCommand(
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
		if (false == getElementToEdit() instanceof InputConditionToSplitTask) {
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
		if (!(oldEnd instanceof TaskInputCondition && newEnd instanceof TaskInputCondition)) {
			return false;
		}
		Split target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ContextAwareSystem)) {
			return false;
		}
		ContextAwareSystem container = (ContextAwareSystem) getLink()
				.eContainer();
		return TaskBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInputConditionToSplitTask_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Split && newEnd instanceof Split)) {
			return false;
		}
		TaskInputCondition source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ContextAwareSystem)) {
			return false;
		}
		ContextAwareSystem container = (ContextAwareSystem) getLink()
				.eContainer();
		return TaskBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInputConditionToSplitTask_4002(container, getLink(),
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
	protected InputConditionToSplitTask getLink() {
		return (InputConditionToSplitTask) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected TaskInputCondition getOldSource() {
		return (TaskInputCondition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected TaskInputCondition getNewSource() {
		return (TaskInputCondition) newEnd;
	}

	/**
	 * @generated
	 */
	protected Split getOldTarget() {
		return (Split) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Split getNewTarget() {
		return (Split) newEnd;
	}
}
