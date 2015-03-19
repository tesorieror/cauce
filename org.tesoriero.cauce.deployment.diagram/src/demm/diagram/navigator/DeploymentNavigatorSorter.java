package demm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import demm.diagram.part.DeploymentVisualIDRegistry;

/**
 * @generated
 */
public class DeploymentNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof DeploymentNavigatorItem) {
			DeploymentNavigatorItem item = (DeploymentNavigatorItem) element;
			return DeploymentVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
