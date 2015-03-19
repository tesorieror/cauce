package spmm.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import spmm.diagram.edit.commands.PhysicalSpaceCreateCommand;
import spmm.diagram.edit.commands.VirtualSpaceCreateCommand;
import spmm.diagram.providers.SpaceElementTypes;

/**
 * @generated
 */
public class UniverseItemSemanticEditPolicy extends
		SpaceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UniverseItemSemanticEditPolicy() {
		super(SpaceElementTypes.Universe_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SpaceElementTypes.PhysicalSpace_2001 == req.getElementType()) {
			return getGEFWrapper(new PhysicalSpaceCreateCommand(req));
		}
		if (SpaceElementTypes.VirtualSpace_2002 == req.getElementType()) {
			return getGEFWrapper(new VirtualSpaceCreateCommand(req));
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
