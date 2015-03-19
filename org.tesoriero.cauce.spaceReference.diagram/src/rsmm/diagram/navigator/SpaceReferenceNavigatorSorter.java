package rsmm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import rsmm.diagram.part.SpaceReferenceVisualIDRegistry;

/**
 * @generated
 */
public class SpaceReferenceNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SpaceReferenceNavigatorItem) {
			SpaceReferenceNavigatorItem item = (SpaceReferenceNavigatorItem) element;
			return SpaceReferenceVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
