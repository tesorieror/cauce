package rsmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import rsmm.diagram.providers.SpaceReferenceElementTypes;

/**
 * @generated
 */
public class SpaceToEntityReferenceDependencyItemSemanticEditPolicy extends
		SpaceReferenceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SpaceToEntityReferenceDependencyItemSemanticEditPolicy() {
		super(SpaceReferenceElementTypes.SpaceToEntityReferenceDependency_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
