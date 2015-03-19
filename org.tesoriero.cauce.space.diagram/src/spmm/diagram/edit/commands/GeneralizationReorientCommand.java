package spmm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import spmm.Generalization;
import spmm.Space;
import spmm.Universe;
import spmm.VirtualSpace;
import spmm.diagram.edit.policies.SpaceBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class GeneralizationReorientCommand extends EditElementCommand {

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
	public GeneralizationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Generalization) {
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
		if (!(oldEnd instanceof VirtualSpace && newEnd instanceof VirtualSpace)) {
			return false;
		}
		Space target = getLink().getGeneralizes();
		if (!(getLink().eContainer() instanceof Universe)) {
			return false;
		}
		Universe container = (Universe) getLink().eContainer();
		return SpaceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistGeneralization_4003(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Space && newEnd instanceof Space)) {
			return false;
		}
		VirtualSpace source = getLink().getParent();
		if (!(getLink().eContainer() instanceof Universe)) {
			return false;
		}
		Universe container = (Universe) getLink().eContainer();
		return SpaceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistGeneralization_4003(container, getLink(), source,
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
		getLink().setGeneralizes(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Generalization getLink() {
		return (Generalization) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected VirtualSpace getOldSource() {
		return (VirtualSpace) oldEnd;
	}

	/**
	 * @generated
	 */
	protected VirtualSpace getNewSource() {
		return (VirtualSpace) newEnd;
	}

	/**
	 * @generated
	 */
	protected Space getOldTarget() {
		return (Space) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Space getNewTarget() {
		return (Space) newEnd;
	}
}
