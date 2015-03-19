package spmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import spmm.diagram.providers.SpaceElementTypes;

/**
 * @generated
 */
public class ContentionItemSemanticEditPolicy extends
		SpaceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContentionItemSemanticEditPolicy() {
		super(SpaceElementTypes.Contention_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
