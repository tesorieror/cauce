package spmm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import spmm.diagram.part.SpaceVisualIDRegistry;

/**
 * @generated
 */
public class SpaceNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SpaceNavigatorItem) {
			SpaceNavigatorItem item = (SpaceNavigatorItem) element;
			return SpaceVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
