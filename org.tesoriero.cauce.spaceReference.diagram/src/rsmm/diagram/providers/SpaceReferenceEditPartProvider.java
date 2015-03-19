package rsmm.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import rsmm.diagram.edit.parts.SpaceReferenceEditPartFactory;
import rsmm.diagram.edit.parts.SystemInformationFlowReferenceSpaceEditPart;
import rsmm.diagram.part.SpaceReferenceVisualIDRegistry;

/**
 * @generated
 */
public class SpaceReferenceEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public SpaceReferenceEditPartProvider() {
		super(new SpaceReferenceEditPartFactory(),
				SpaceReferenceVisualIDRegistry.TYPED_INSTANCE,
				SystemInformationFlowReferenceSpaceEditPart.MODEL_ID);
	}

}
