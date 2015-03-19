package spmm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import spmm.Contention;
import spmm.PhysicalSpace;
import spmm.Universe;
import spmm.diagram.edit.policies.SpaceBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ContentionReorientCommand extends EditElementCommand {

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
	public ContentionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Contention) {
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
		if (!(oldEnd instanceof PhysicalSpace && newEnd instanceof PhysicalSpace)) {
			return false;
		}
		PhysicalSpace target = getLink().getChild();
		if (!(getLink().eContainer() instanceof Universe)) {
			return false;
		}
		Universe container = (Universe) getLink().eContainer();
		return SpaceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistContention_4002(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof PhysicalSpace && newEnd instanceof PhysicalSpace)) {
			return false;
		}
		PhysicalSpace source = getLink().getParent();
		if (!(getLink().eContainer() instanceof Universe)) {
			return false;
		}
		Universe container = (Universe) getLink().eContainer();
		return SpaceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistContention_4002(container, getLink(), source,
						getNewTarget());
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
		getLink().setParent(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setChild(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Contention getLink() {
		return (Contention) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected PhysicalSpace getOldSource() {
		return (PhysicalSpace) oldEnd;
	}

	/**
	 * @generated
	 */
	protected PhysicalSpace getNewSource() {
		return (PhysicalSpace) newEnd;
	}

	/**
	 * @generated
	 */
	protected PhysicalSpace getOldTarget() {
		return (PhysicalSpace) oldEnd;
	}

	/**
	 * @generated
	 */
	protected PhysicalSpace getNewTarget() {
		return (PhysicalSpace) newEnd;
	}
}
