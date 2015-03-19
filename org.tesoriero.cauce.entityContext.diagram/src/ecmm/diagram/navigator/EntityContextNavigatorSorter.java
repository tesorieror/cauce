package ecmm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import ecmm.diagram.part.EntityContextVisualIDRegistry;

/**
 * @generated
 */
public class EntityContextNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof EntityContextNavigatorItem) {
			EntityContextNavigatorItem item = (EntityContextNavigatorItem) element;
			return EntityContextVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
