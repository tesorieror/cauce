package ifmm.diagram.edit.policies;

import ifmm.diagram.edit.commands.BroadcastInformationFlowCreateCommand;
import ifmm.diagram.edit.commands.ContextAwareEntityCreateCommand;
import ifmm.diagram.edit.commands.PointToPointInformationFlowCreateCommand;
import ifmm.diagram.providers.InformationFlowElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class SystemInformaitonFlowItemSemanticEditPolicy extends
		InformationFlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SystemInformaitonFlowItemSemanticEditPolicy() {
		super(InformationFlowElementTypes.SystemInformaitonFlow_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (InformationFlowElementTypes.BroadcastInformationFlow_2001 == req
				.getElementType()) {
			return getGEFWrapper(new BroadcastInformationFlowCreateCommand(req));
		}
		if (InformationFlowElementTypes.PointToPointInformationFlow_2002 == req
				.getElementType()) {
			return getGEFWrapper(new PointToPointInformationFlowCreateCommand(
					req));
		}
		if (InformationFlowElementTypes.ContextAwareEntity_2003 == req
				.getElementType()) {
			return getGEFWrapper(new ContextAwareEntityCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
