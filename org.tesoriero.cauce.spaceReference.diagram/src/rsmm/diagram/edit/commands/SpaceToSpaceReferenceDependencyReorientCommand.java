package rsmm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import rsmm.ReferentialSpace;
import rsmm.SpaceToSpaceReferenceDependency;
import rsmm.SystemInformationFlowReferenceSpace;
import rsmm.diagram.edit.policies.SpaceReferenceBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SpaceToSpaceReferenceDependencyReorientCommand extends
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
	public SpaceToSpaceReferenceDependencyReorientCommand(
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
		if (false == getElementToEdit() instanceof SpaceToSpaceReferenceDependency) {
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
		if (!(oldEnd instanceof ReferentialSpace && newEnd instanceof ReferentialSpace)) {
			return false;
		}
		ReferentialSpace target = getLink().getChild();
		if (!(getLink().eContainer() instanceof SystemInformationFlowReferenceSpace)) {
			return false;
		}
		SystemInformationFlowReferenceSpace container = (SystemInformationFlowReferenceSpace) getLink()
				.eContainer();
		return SpaceReferenceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistSpaceToSpaceReferenceDependency_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ReferentialSpace && newEnd instanceof ReferentialSpace)) {
			return false;
		}
		ReferentialSpace source = getLink().getParent();
		if (!(getLink().eContainer() instanceof SystemInformationFlowReferenceSpace)) {
			return false;
		}
		SystemInformationFlowReferenceSpace container = (SystemInformationFlowReferenceSpace) getLink()
				.eContainer();
		return SpaceReferenceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistSpaceToSpaceReferenceDependency_4001(container,
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
	protected SpaceToSpaceReferenceDependency getLink() {
		return (SpaceToSpaceReferenceDependency) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ReferentialSpace getOldSource() {
		return (ReferentialSpace) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ReferentialSpace getNewSource() {
		return (ReferentialSpace) newEnd;
	}

	/**
	 * @generated
	 */
	protected ReferentialSpace getOldTarget() {
		return (ReferentialSpace) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ReferentialSpace getNewTarget() {
		return (ReferentialSpace) newEnd;
	}
}
