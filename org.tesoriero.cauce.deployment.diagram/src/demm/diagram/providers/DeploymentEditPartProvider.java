package demm.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import demm.diagram.edit.parts.DeploymentEditPartFactory;
import demm.diagram.edit.parts.DevelopmentEnvironmentEditPart;
import demm.diagram.part.DeploymentVisualIDRegistry;

/**
 * @generated
 */
public class DeploymentEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public DeploymentEditPartProvider() {
		super(new DeploymentEditPartFactory(),
				DeploymentVisualIDRegistry.TYPED_INSTANCE,
				DevelopmentEnvironmentEditPart.MODEL_ID);
	}

}
