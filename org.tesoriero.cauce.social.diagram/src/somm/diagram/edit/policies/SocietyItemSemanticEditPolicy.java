package somm.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import somm.diagram.edit.commands.IndividualInstanceCreateCommand;
import somm.diagram.edit.commands.RoleCreateCommand;
import somm.diagram.providers.SocialElementTypes;

/**
 * @generated
 */
public class SocietyItemSemanticEditPolicy extends
		SocialBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SocietyItemSemanticEditPolicy() {
		super(SocialElementTypes.Society_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SocialElementTypes.IndividualInstance_2001 == req.getElementType()) {
			return getGEFWrapper(new IndividualInstanceCreateCommand(req));
		}
		if (SocialElementTypes.Role_2002 == req.getElementType()) {
			return getGEFWrapper(new RoleCreateCommand(req));
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
