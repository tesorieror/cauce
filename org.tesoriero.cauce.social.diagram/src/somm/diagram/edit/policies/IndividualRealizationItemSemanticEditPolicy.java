package somm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import somm.diagram.providers.SocialElementTypes;

/**
 * @generated
 */
public class IndividualRealizationItemSemanticEditPolicy extends
		SocialBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndividualRealizationItemSemanticEditPolicy() {
		super(SocialElementTypes.IndividualRealization_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
