package somm.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import somm.diagram.edit.parts.SocialEditPartFactory;
import somm.diagram.edit.parts.SocietyEditPart;
import somm.diagram.part.SocialVisualIDRegistry;

/**
 * @generated
 */
public class SocialEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public SocialEditPartProvider() {
		super(new SocialEditPartFactory(),
				SocialVisualIDRegistry.TYPED_INSTANCE, SocietyEditPart.MODEL_ID);
	}

}
