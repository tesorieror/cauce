package ecmm.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import ecmm.diagram.part.EntityContextVisualIDRegistry;

/**
 * @generated
 */
public class EntityContextEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (EntityContextVisualIDRegistry.getVisualID(view)) {

			case SystemContextEditPart.VISUAL_ID:
				return new SystemContextEditPart(view);

			case EntityContextEditPart.VISUAL_ID:
				return new EntityContextEditPart(view);

			case EntityContextEntityEditPart.VISUAL_ID:
				return new EntityContextEntityEditPart(view);

			case EntityContextIdEditPart.VISUAL_ID:
				return new EntityContextIdEditPart(view);

			case HolderMemoryEditPart.VISUAL_ID:
				return new HolderMemoryEditPart(view);

			case HolderMemoryNameEditPart.VISUAL_ID:
				return new HolderMemoryNameEditPart(view);

			case HolderMemoryIdEditPart.VISUAL_ID:
				return new HolderMemoryIdEditPart(view);

			case LogicMemoryEditPart.VISUAL_ID:
				return new LogicMemoryEditPart(view);

			case LogicMemoryNameEditPart.VISUAL_ID:
				return new LogicMemoryNameEditPart(view);

			case LogicMemoryIdEditPart.VISUAL_ID:
				return new LogicMemoryIdEditPart(view);

			case TimeMemoryEditPart.VISUAL_ID:
				return new TimeMemoryEditPart(view);

			case TimeMemoryNameEditPart.VISUAL_ID:
				return new TimeMemoryNameEditPart(view);

			case TimeMemoryIdEditPart.VISUAL_ID:
				return new TimeMemoryIdEditPart(view);

			case StackMemoryEditPart.VISUAL_ID:
				return new StackMemoryEditPart(view);

			case StackMemoryNameEditPart.VISUAL_ID:
				return new StackMemoryNameEditPart(view);

			case StackMemoryIdEditPart.VISUAL_ID:
				return new StackMemoryIdEditPart(view);

			case DictionaryMemoryEditPart.VISUAL_ID:
				return new DictionaryMemoryEditPart(view);

			case DictionaryMemoryNameEditPart.VISUAL_ID:
				return new DictionaryMemoryNameEditPart(view);

			case DictionaryMemoryIdEditPart.VISUAL_ID:
				return new DictionaryMemoryIdEditPart(view);

			case ContextSituationEditPart.VISUAL_ID:
				return new ContextSituationEditPart(view);

			case ContextSituationNameEditPart.VISUAL_ID:
				return new ContextSituationNameEditPart(view);

			case ContextSituationIdEditPart.VISUAL_ID:
				return new ContextSituationIdEditPart(view);

			case MemoryContextConditionEditPart.VISUAL_ID:
				return new MemoryContextConditionEditPart(view);

			case MemoryContextConditionExpressionEditPart.VISUAL_ID:
				return new MemoryContextConditionExpressionEditPart(view);

			case MemoryContextConditionMemoryNameEditPart.VISUAL_ID:
				return new MemoryContextConditionMemoryNameEditPart(view);

			case SensingContextConditionEditPart.VISUAL_ID:
				return new SensingContextConditionEditPart(view);

			case SensingContextConditionInformationflowEditPart.VISUAL_ID:
				return new SensingContextConditionInformationflowEditPart(view);

			case ContextActionEditPart.VISUAL_ID:
				return new ContextActionEditPart(view);

			case ContextActionExpressionEditPart.VISUAL_ID:
				return new ContextActionExpressionEditPart(view);

			case ContextActionMemoryNameEditPart.VISUAL_ID:
				return new ContextActionMemoryNameEditPart(view);

			case VariableDataDefinitionEditPart.VISUAL_ID:
				return new VariableDataDefinitionEditPart(view);

			case VariableDataDefinitionNameDefinitionEditPart.VISUAL_ID:
				return new VariableDataDefinitionNameDefinitionEditPart(view);

			case EntityContextStateEditPart.VISUAL_ID:
				return new EntityContextStateEditPart(view);

			case EntityContextSituationsEditPart.VISUAL_ID:
				return new EntityContextSituationsEditPart(view);

			case EntityContextDefinitionsEditPart.VISUAL_ID:
				return new EntityContextDefinitionsEditPart(view);

			case ContextSituationConditionsEditPart.VISUAL_ID:
				return new ContextSituationConditionsEditPart(view);

			case ContextSituationSensingEditPart.VISUAL_ID:
				return new ContextSituationSensingEditPart(view);

			case ContextSituationActionsEditPart.VISUAL_ID:
				return new ContextSituationActionsEditPart(view);
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
