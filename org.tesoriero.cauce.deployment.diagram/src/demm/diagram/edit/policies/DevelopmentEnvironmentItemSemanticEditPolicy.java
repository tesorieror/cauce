package demm.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import demm.diagram.edit.commands.ConnectionCreateCommand;
import demm.diagram.edit.commands.DeviceCreateCommand;
import demm.diagram.edit.commands.MediumCreateCommand;
import demm.diagram.edit.commands.OperatingSystemCreateCommand;
import demm.diagram.edit.commands.ProgrammingLanguageCreateCommand;
import demm.diagram.edit.commands.ProtocolCreateCommand;
import demm.diagram.providers.DeploymentElementTypes;

/**
 * @generated
 */
public class DevelopmentEnvironmentItemSemanticEditPolicy extends
		DeploymentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DevelopmentEnvironmentItemSemanticEditPolicy() {
		super(DeploymentElementTypes.DevelopmentEnvironment_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeploymentElementTypes.ProgrammingLanguage_2001 == req
				.getElementType()) {
			return getGEFWrapper(new ProgrammingLanguageCreateCommand(req));
		}
		if (DeploymentElementTypes.OperatingSystem_2002 == req.getElementType()) {
			return getGEFWrapper(new OperatingSystemCreateCommand(req));
		}
		if (DeploymentElementTypes.Device_2003 == req.getElementType()) {
			return getGEFWrapper(new DeviceCreateCommand(req));
		}
		if (DeploymentElementTypes.Connection_2004 == req.getElementType()) {
			return getGEFWrapper(new ConnectionCreateCommand(req));
		}
		if (DeploymentElementTypes.Medium_2005 == req.getElementType()) {
			return getGEFWrapper(new MediumCreateCommand(req));
		}
		if (DeploymentElementTypes.Protocol_2006 == req.getElementType()) {
			return getGEFWrapper(new ProtocolCreateCommand(req));
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
