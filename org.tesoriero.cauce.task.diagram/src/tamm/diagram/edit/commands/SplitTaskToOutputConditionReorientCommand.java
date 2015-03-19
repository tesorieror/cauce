package tamm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import tamm.ContextAwareSystem;
import tamm.Split;
import tamm.SplitTaskToOutputCondition;
import tamm.TaskOutputCondition;
import tamm.diagram.edit.policies.TaskBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SplitTaskToOutputConditionReorientCommand extends
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
	public SplitTaskToOutputConditionReorientCommand(
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
		if (false == getElementToEdit() instanceof SplitTaskToOutputCondition) {
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
		if (!(oldEnd instanceof Split && newEnd instanceof Split)) {
			return false;
		}
		TaskOutputCondition target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ContextAwareSystem)) {
			return false;
		}
		ContextAwareSystem container = (ContextAwareSystem) getLink()
				.eContainer();
		return TaskBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistSplitTaskToOutputCondition_4004(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof TaskOutputCondition && newEnd instanceof TaskOutputCondition)) {
			return false;
		}
		Split source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ContextAwareSystem)) {
			return false;
		}
		ContextAwareSystem container = (ContextAwareSystem) getLink()
				.eContainer();
		return TaskBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistSplitTaskToOutputCondition_4004(container, getLink(),
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
	protected SplitTaskToOutputCondition getLink() {
		return (SplitTaskToOutputCondition) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Split getOldSource() {
		return (Split) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Split getNewSource() {
		return (Split) newEnd;
	}

	/**
	 * @generated
	 */
	protected TaskOutputCondition getOldTarget() {
		return (TaskOutputCondition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected TaskOutputCondition getNewTarget() {
		return (TaskOutputCondition) newEnd;
	}
}
