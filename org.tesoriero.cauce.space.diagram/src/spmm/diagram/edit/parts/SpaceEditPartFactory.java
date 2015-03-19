package spmm.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import spmm.diagram.part.SpaceVisualIDRegistry;

/**
 * @generated
 */
public class SpaceEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SpaceVisualIDRegistry.getVisualID(view)) {

			case UniverseEditPart.VISUAL_ID:
				return new UniverseEditPart(view);

			case PhysicalSpaceEditPart.VISUAL_ID:
				return new PhysicalSpaceEditPart(view);

			case PhysicalSpaceNameEditPart.VISUAL_ID:
				return new PhysicalSpaceNameEditPart(view);

			case VirtualSpaceEditPart.VISUAL_ID:
				return new VirtualSpaceEditPart(view);

			case VirtualSpaceNameEditPart.VISUAL_ID:
				return new VirtualSpaceNameEditPart(view);

			case GroupingEditPart.VISUAL_ID:
				return new GroupingEditPart(view);

			case ContentionEditPart.VISUAL_ID:
				return new ContentionEditPart(view);

			case GeneralizationEditPart.VISUAL_ID:
				return new GeneralizationEditPart(view);

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
