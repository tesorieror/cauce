package rsmm.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import rsmm.diagram.part.SpaceReferenceVisualIDRegistry;

/**
 * @generated
 */
public class SpaceReferenceEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SpaceReferenceVisualIDRegistry.getVisualID(view)) {

			case SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID:
				return new SystemInformationFlowReferenceSpaceEditPart(view);

			case ContextAwareEntityReferenceEditPart.VISUAL_ID:
				return new ContextAwareEntityReferenceEditPart(view);

			case ContextAwareEntityReferenceNameEditPart.VISUAL_ID:
				return new ContextAwareEntityReferenceNameEditPart(view);

			case ContextAwareEntityReferenceEntityEditPart.VISUAL_ID:
				return new ContextAwareEntityReferenceEntityEditPart(view);

			case ContextAwareEntityReferenceIdEditPart.VISUAL_ID:
				return new ContextAwareEntityReferenceIdEditPart(view);

			case ReferentialSpaceEditPart.VISUAL_ID:
				return new ReferentialSpaceEditPart(view);

			case ReferentialSpaceNameEditPart.VISUAL_ID:
				return new ReferentialSpaceNameEditPart(view);

			case ReferentialSpaceIdEditPart.VISUAL_ID:
				return new ReferentialSpaceIdEditPart(view);

			case SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID:
				return new SpaceToSpaceReferenceDependencyEditPart(view);

			case SpaceToSpaceReferenceDependencyCardinalityEditPart.VISUAL_ID:
				return new SpaceToSpaceReferenceDependencyCardinalityEditPart(
						view);

			case SpaceToEntityReferenceDependencyEditPart.VISUAL_ID:
				return new SpaceToEntityReferenceDependencyEditPart(view);

			case SpaceToEntityReferenceDependencyCardinalityEditPart.VISUAL_ID:
				return new SpaceToEntityReferenceDependencyCardinalityEditPart(
						view);

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
