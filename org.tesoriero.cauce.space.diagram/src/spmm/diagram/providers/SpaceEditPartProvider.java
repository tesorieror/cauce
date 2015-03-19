package spmm.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import spmm.diagram.edit.parts.SpaceEditPartFactory;
import spmm.diagram.edit.parts.UniverseEditPart;
import spmm.diagram.part.SpaceVisualIDRegistry;

/**
 * @generated
 */
public class SpaceEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public SpaceEditPartProvider() {
		super(new SpaceEditPartFactory(), SpaceVisualIDRegistry.TYPED_INSTANCE,
				UniverseEditPart.MODEL_ID);
	}

}
