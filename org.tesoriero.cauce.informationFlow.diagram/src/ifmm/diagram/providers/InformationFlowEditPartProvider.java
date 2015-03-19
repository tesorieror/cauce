package ifmm.diagram.providers;

import ifmm.diagram.edit.parts.InformationFlowEditPartFactory;
import ifmm.diagram.edit.parts.SystemInformaitonFlowEditPart;
import ifmm.diagram.part.InformationFlowVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class InformationFlowEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public InformationFlowEditPartProvider() {
		super(new InformationFlowEditPartFactory(),
				InformationFlowVisualIDRegistry.TYPED_INSTANCE,
				SystemInformaitonFlowEditPart.MODEL_ID);
	}

}
