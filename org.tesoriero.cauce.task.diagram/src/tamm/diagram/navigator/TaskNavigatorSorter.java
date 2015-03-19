package tamm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import tamm.diagram.part.TaskVisualIDRegistry;

/**
 * @generated
 */
public class TaskNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof TaskNavigatorItem) {
			TaskNavigatorItem item = (TaskNavigatorItem) element;
			return TaskVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
