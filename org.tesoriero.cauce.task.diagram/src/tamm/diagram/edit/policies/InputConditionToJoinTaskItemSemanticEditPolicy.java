package tamm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import tamm.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class InputConditionToJoinTaskItemSemanticEditPolicy extends
		TaskBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InputConditionToJoinTaskItemSemanticEditPolicy() {
		super(TaskElementTypes.InputConditionToJoinTask_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
