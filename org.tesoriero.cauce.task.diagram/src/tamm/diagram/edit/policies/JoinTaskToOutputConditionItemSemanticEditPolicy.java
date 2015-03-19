package tamm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import tamm.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class JoinTaskToOutputConditionItemSemanticEditPolicy extends
		TaskBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public JoinTaskToOutputConditionItemSemanticEditPolicy() {
		super(TaskElementTypes.JoinTaskToOutputCondition_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
