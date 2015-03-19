package tamm.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import tamm.diagram.part.TaskVisualIDRegistry;

/**
 * @generated
 */
public class TaskEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TaskVisualIDRegistry.getVisualID(view)) {

			case ContextAwareSystemEditPart.VISUAL_ID:
				return new ContextAwareSystemEditPart(view);

			case AndSplitEditPart.VISUAL_ID:
				return new AndSplitEditPart(view);

			case PreConditionEditPart.VISUAL_ID:
				return new PreConditionEditPart(view);

			case PreConditionSocialExpressionEditPart.VISUAL_ID:
				return new PreConditionSocialExpressionEditPart(view);

			case PreConditionTaskExpressionEditPart.VISUAL_ID:
				return new PreConditionTaskExpressionEditPart(view);

			case PreConditionSpaceExpressionEditPart.VISUAL_ID:
				return new PreConditionSpaceExpressionEditPart(view);

			case PreConditionLogicExpressionEditPart.VISUAL_ID:
				return new PreConditionLogicExpressionEditPart(view);

			case PreConditionDataExpressionEditPart.VISUAL_ID:
				return new PreConditionDataExpressionEditPart(view);

			case PostConditionEditPart.VISUAL_ID:
				return new PostConditionEditPart(view);

			case PostConditionSocialExpressionEditPart.VISUAL_ID:
				return new PostConditionSocialExpressionEditPart(view);

			case PostConditionTaskExpressionEditPart.VISUAL_ID:
				return new PostConditionTaskExpressionEditPart(view);

			case PostConditionSpaceExpressionEditPart.VISUAL_ID:
				return new PostConditionSpaceExpressionEditPart(view);

			case PostConditionLogicExpressionEditPart.VISUAL_ID:
				return new PostConditionLogicExpressionEditPart(view);

			case PostConditionDataExpressionEditPart.VISUAL_ID:
				return new PostConditionDataExpressionEditPart(view);

			case SkipTaskEditPart.VISUAL_ID:
				return new SkipTaskEditPart(view);

			case FinalConditionEditPart.VISUAL_ID:
				return new FinalConditionEditPart(view);

			case FinalConditionSocialExpressionEditPart.VISUAL_ID:
				return new FinalConditionSocialExpressionEditPart(view);

			case FinalConditionTaskExpressionEditPart.VISUAL_ID:
				return new FinalConditionTaskExpressionEditPart(view);

			case FinalConditionSpaceExpressionEditPart.VISUAL_ID:
				return new FinalConditionSpaceExpressionEditPart(view);

			case FinalConditionLogicExpressionEditPart.VISUAL_ID:
				return new FinalConditionLogicExpressionEditPart(view);

			case FinalConditionDataExpressionEditPart.VISUAL_ID:
				return new FinalConditionDataExpressionEditPart(view);

			case AndJoinEditPart.VISUAL_ID:
				return new AndJoinEditPart(view);

			case InitialConditionEditPart.VISUAL_ID:
				return new InitialConditionEditPart(view);

			case InitialConditionSocialExpressionEditPart.VISUAL_ID:
				return new InitialConditionSocialExpressionEditPart(view);

			case InitialConditionTaskExpressionEditPart.VISUAL_ID:
				return new InitialConditionTaskExpressionEditPart(view);

			case InitialConditionSpaceExpressionEditPart.VISUAL_ID:
				return new InitialConditionSpaceExpressionEditPart(view);

			case InitialConditionLogicExpressionEditPart.VISUAL_ID:
				return new InitialConditionLogicExpressionEditPart(view);

			case InitialConditionDataExpressionEditPart.VISUAL_ID:
				return new InitialConditionDataExpressionEditPart(view);

			case SimpleTaskEditPart.VISUAL_ID:
				return new SimpleTaskEditPart(view);

			case SimpleTaskNameEditPart.VISUAL_ID:
				return new SimpleTaskNameEditPart(view);

			case OrSplitEditPart.VISUAL_ID:
				return new OrSplitEditPart(view);

			case OrJoinEditPart.VISUAL_ID:
				return new OrJoinEditPart(view);

			case InputConditionToJoinTaskEditPart.VISUAL_ID:
				return new InputConditionToJoinTaskEditPart(view);

			case InputConditionToSplitTaskEditPart.VISUAL_ID:
				return new InputConditionToSplitTaskEditPart(view);

			case JoinTaskToOutputConditionEditPart.VISUAL_ID:
				return new JoinTaskToOutputConditionEditPart(view);

			case SplitTaskToOutputConditionEditPart.VISUAL_ID:
				return new SplitTaskToOutputConditionEditPart(view);

			case PreConditionToSystemTaskEditPart.VISUAL_ID:
				return new PreConditionToSystemTaskEditPart(view);

			case SystemTaskToPostConditionEditPart.VISUAL_ID:
				return new SystemTaskToPostConditionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
