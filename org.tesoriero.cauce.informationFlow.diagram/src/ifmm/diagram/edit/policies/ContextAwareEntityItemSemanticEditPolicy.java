package ifmm.diagram.edit.policies;

import ifmm.diagram.edit.commands.BroadcastInformationFlowToEntityEdgeCreateCommand;
import ifmm.diagram.edit.commands.BroadcastInformationFlowToEntityEdgeReorientCommand;
import ifmm.diagram.edit.commands.EntityToBroadcastInformationFlowEdgeCreateCommand;
import ifmm.diagram.edit.commands.EntityToBroadcastInformationFlowEdgeReorientCommand;
import ifmm.diagram.edit.commands.EntityToPointToPointInformationFlowEdgeCreateCommand;
import ifmm.diagram.edit.commands.EntityToPointToPointInformationFlowEdgeReorientCommand;
import ifmm.diagram.edit.commands.PointToPointInformationFlowToEntityEdgeCreateCommand;
import ifmm.diagram.edit.commands.PointToPointInformationFlowToEntityEdgeReorientCommand;
import ifmm.diagram.edit.parts.BroadcastInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.edit.parts.EntityToBroadcastInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.EntityToPointToPointInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.part.InformationFlowVisualIDRegistry;
import ifmm.diagram.providers.InformationFlowElementTypes;

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

/**
 * @generated
 */
public class ContextAwareEntityItemSemanticEditPolicy extends
		InformationFlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextAwareEntityItemSemanticEditPolicy() {
		super(InformationFlowElementTypes.ContextAwareEntity_2003);
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
			if (InformationFlowVisualIDRegistry.getVisualID(incomingLink) == BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (InformationFlowVisualIDRegistry.getVisualID(incomingLink) == PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (InformationFlowVisualIDRegistry.getVisualID(outgoingLink) == EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (InformationFlowVisualIDRegistry.getVisualID(outgoingLink) == EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID) {
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
		if (InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001 == req
				.getElementType()) {
			return null;
		}
		if (InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002 == req
				.getElementType()) {
			return getGEFWrapper(new EntityToBroadcastInformationFlowEdgeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003 == req
				.getElementType()) {
			return getGEFWrapper(new EntityToPointToPointInformationFlowEdgeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001 == req
				.getElementType()) {
			return getGEFWrapper(new BroadcastInformationFlowToEntityEdgeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002 == req
				.getElementType()) {
			return null;
		}
		if (InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003 == req
				.getElementType()) {
			return null;
		}
		if (InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004 == req
				.getElementType()) {
			return getGEFWrapper(new PointToPointInformationFlowToEntityEdgeCreateCommand(
					req, req.getSource(), req.getTarget()));
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
		case BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new BroadcastInformationFlowToEntityEdgeReorientCommand(
					req));
		case EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new EntityToBroadcastInformationFlowEdgeReorientCommand(
					req));
		case EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new EntityToPointToPointInformationFlowEdgeReorientCommand(
					req));
		case PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new PointToPointInformationFlowToEntityEdgeReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
