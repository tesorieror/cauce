package ifmm.diagram.edit.parts;

import ifmm.diagram.part.InformationFlowVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class InformationFlowEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (InformationFlowVisualIDRegistry.getVisualID(view)) {

			case SystemInformaitonFlowEditPart.VISUAL_ID:
				return new SystemInformaitonFlowEditPart(view);

			case BroadcastInformationFlowEditPart.VISUAL_ID:
				return new BroadcastInformationFlowEditPart(view);

			case BroadcastInformationFlowNameEditPart.VISUAL_ID:
				return new BroadcastInformationFlowNameEditPart(view);

			case BroadcastInformationFlowIdEditPart.VISUAL_ID:
				return new BroadcastInformationFlowIdEditPart(view);

			case PointToPointInformationFlowEditPart.VISUAL_ID:
				return new PointToPointInformationFlowEditPart(view);

			case PointToPointInformationFlowNameEditPart.VISUAL_ID:
				return new PointToPointInformationFlowNameEditPart(view);

			case PointToPointInformationFlowIdEditPart.VISUAL_ID:
				return new PointToPointInformationFlowIdEditPart(view);

			case ContextAwareEntityEditPart.VISUAL_ID:
				return new ContextAwareEntityEditPart(view);

			case ContextAwareEntityNameEditPart.VISUAL_ID:
				return new ContextAwareEntityNameEditPart(view);

			case ContextAwareEntityIdEditPart.VISUAL_ID:
				return new ContextAwareEntityIdEditPart(view);

			case OutputDataEditPart.VISUAL_ID:
				return new OutputDataEditPart(view);

			case OutputDataDefinitionEditPart.VISUAL_ID:
				return new OutputDataDefinitionEditPart(view);

			case OutputData2EditPart.VISUAL_ID:
				return new OutputData2EditPart(view);

			case OutputDataDefinition2EditPart.VISUAL_ID:
				return new OutputDataDefinition2EditPart(view);

			case InputDataEditPart.VISUAL_ID:
				return new InputDataEditPart(view);

			case InputDataDefinitionEditPart.VISUAL_ID:
				return new InputDataDefinitionEditPart(view);

			case BroadcastInformationFlowBOutputDataEditPart.VISUAL_ID:
				return new BroadcastInformationFlowBOutputDataEditPart(view);

			case PointToPointInformationFlowP2POutputDataEditPart.VISUAL_ID:
				return new PointToPointInformationFlowP2POutputDataEditPart(
						view);

			case PointToPointInformationFlowP2PInputDataEditPart.VISUAL_ID:
				return new PointToPointInformationFlowP2PInputDataEditPart(view);

			case BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID:
				return new BroadcastInformationFlowToEntityEdgeEditPart(view);

			case EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID:
				return new EntityToBroadcastInformationFlowEdgeEditPart(view);

			case EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID:
				return new EntityToPointToPointInformationFlowEdgeEditPart(view);

			case PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID:
				return new PointToPointInformationFlowToEntityEdgeEditPart(view);

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
