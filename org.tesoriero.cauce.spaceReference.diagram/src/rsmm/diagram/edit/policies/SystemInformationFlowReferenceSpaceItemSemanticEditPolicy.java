package rsmm.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import rsmm.diagram.edit.commands.ContextAwareEntityReferenceCreateCommand;
import rsmm.diagram.edit.commands.ReferentialSpaceCreateCommand;
import rsmm.diagram.providers.SpaceReferenceElementTypes;

/**
 * @generated
 */
public class SystemInformationFlowReferenceSpaceItemSemanticEditPolicy extends
		SpaceReferenceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SystemInformationFlowReferenceSpaceItemSemanticEditPolicy() {
		super(
				SpaceReferenceElementTypes.SystemInformationFlowReferenceSpace_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SpaceReferenceElementTypes.ContextAwareEntityReference_2001 == req
				.getElementType()) {
			return getGEFWrapper(new ContextAwareEntityReferenceCreateCommand(
					req));
		}
		if (SpaceReferenceElementTypes.ReferentialSpace_2002 == req
				.getElementType()) {
			return getGEFWrapper(new ReferentialSpaceCreateCommand(req));
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
