package demm.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import demm.diagram.edit.commands.ConnectionToDeviceEdgeCreateCommand;
import demm.diagram.edit.commands.ConnectionToDeviceEdgeReorientCommand;
import demm.diagram.edit.commands.DeviceToConnectionEdgeCreateCommand;
import demm.diagram.edit.commands.DeviceToConnectionEdgeReorientCommand;
import demm.diagram.edit.parts.ConnectionConnectionPlatformCompartmentEditPart;
import demm.diagram.edit.parts.ConnectionInformationCompartmentEditPart;
import demm.diagram.edit.parts.ConnectionPlatformEditPart;
import demm.diagram.edit.parts.ConnectionToDeviceEdgeEditPart;
import demm.diagram.edit.parts.DeviceToConnectionEdgeEditPart;
import demm.diagram.edit.parts.InformationEditPart;
import demm.diagram.part.DeploymentVisualIDRegistry;
import demm.diagram.providers.DeploymentElementTypes;

/**
 * @generated
 */
public class ConnectionItemSemanticEditPolicy extends
		DeploymentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionItemSemanticEditPolicy() {
		super(DeploymentElementTypes.Connection_2004);
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
			if (DeploymentVisualIDRegistry.getVisualID(incomingLink) == DeviceToConnectionEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DeploymentVisualIDRegistry.getVisualID(outgoingLink) == ConnectionToDeviceEdgeEditPart.VISUAL_ID) {
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
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (DeploymentVisualIDRegistry.getVisualID(node)) {
			case ConnectionConnectionPlatformCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (DeploymentVisualIDRegistry.getVisualID(cnode)) {
					case ConnectionPlatformEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case ConnectionInformationCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (DeploymentVisualIDRegistry.getVisualID(cnode)) {
					case InformationEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (DeploymentElementTypes.DeviceToConnectionEdge_4001 == req
				.getElementType()) {
			return null;
		}
		if (DeploymentElementTypes.ConnectionToDeviceEdge_4002 == req
				.getElementType()) {
			return getGEFWrapper(new ConnectionToDeviceEdgeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DeploymentElementTypes.DeviceToConnectionEdge_4001 == req
				.getElementType()) {
			return getGEFWrapper(new DeviceToConnectionEdgeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeploymentElementTypes.ConnectionToDeviceEdge_4002 == req
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
		case DeviceToConnectionEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new DeviceToConnectionEdgeReorientCommand(req));
		case ConnectionToDeviceEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectionToDeviceEdgeReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
