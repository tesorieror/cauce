package spmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import spmm.diagram.providers.SpaceElementTypes;

/**
 * @generated
 */
public class GeneralizationItemSemanticEditPolicy extends
		SpaceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GeneralizationItemSemanticEditPolicy() {
		super(SpaceElementTypes.Generalization_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
