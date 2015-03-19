package ecmm.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import ecmm.diagram.edit.parts.EntityContextEditPartFactory;
import ecmm.diagram.edit.parts.SystemContextEditPart;
import ecmm.diagram.part.EntityContextVisualIDRegistry;

/**
 * @generated
 */
public class EntityContextEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public EntityContextEditPartProvider() {
		super(new EntityContextEditPartFactory(),
				EntityContextVisualIDRegistry.TYPED_INSTANCE,
				SystemContextEditPart.MODEL_ID);
	}

}
