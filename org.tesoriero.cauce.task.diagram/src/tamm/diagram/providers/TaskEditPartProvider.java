package tamm.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import tamm.diagram.edit.parts.ContextAwareSystemEditPart;
import tamm.diagram.edit.parts.TaskEditPartFactory;
import tamm.diagram.part.TaskVisualIDRegistry;

/**
 * @generated
 */
public class TaskEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public TaskEditPartProvider() {
		super(new TaskEditPartFactory(), TaskVisualIDRegistry.TYPED_INSTANCE,
				ContextAwareSystemEditPart.MODEL_ID);
	}

}
