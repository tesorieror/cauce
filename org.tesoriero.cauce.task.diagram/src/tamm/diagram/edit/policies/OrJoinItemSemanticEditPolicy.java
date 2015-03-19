package tamm.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import tamm.diagram.edit.commands.InputConditionToJoinTaskCreateCommand;
import tamm.diagram.edit.commands.InputConditionToJoinTaskReorientCommand;
import tamm.diagram.edit.commands.JoinTaskToOutputConditionCreateCommand;
import tamm.diagram.edit.commands.JoinTaskToOutputConditionReorientCommand;
import tamm.diagram.edit.parts.InputConditionToJoinTaskEditPart;
import tamm.diagram.edit.parts.JoinTaskToOutputConditionEditPart;
import tamm.diagram.part.TaskVisualIDRegistry;
import tamm.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class OrJoinItemSemanticEditPolicy extends
		TaskBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OrJoinItemSemanticEditPolicy() {
		super(TaskElementTypes.OrJoin_2010);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (TaskVisualIDRegistry.getVisualID(incomingLink) == InputConditionToJoinTaskEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (TaskVisualIDRegistry.getVisualID(outgoingLink) == JoinTaskToOutputConditionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TaskElementTypes.InputConditionToJoinTask_4001 == req
				.getElementType()) {
			return null;
		}
		if (TaskElementTypes.JoinTaskToOutputCondition_4003 == req
				.getElementType()) {
			return getGEFWrapper(new JoinTaskToOutputConditionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TaskElementTypes.InputConditionToJoinTask_4001 == req
				.getElementType()) {
			return getGEFWrapper(new InputConditionToJoinTaskCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TaskElementTypes.JoinTaskToOutputCondition_4003 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case InputConditionToJoinTaskEditPart.VISUAL_ID:
			return getGEFWrapper(new InputConditionToJoinTaskReorientCommand(
					req));
		case JoinTaskToOutputConditionEditPart.VISUAL_ID:
			return getGEFWrapper(new JoinTaskToOutputConditionReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
