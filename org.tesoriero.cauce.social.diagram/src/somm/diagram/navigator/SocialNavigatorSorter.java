package somm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import somm.diagram.part.SocialVisualIDRegistry;

/**
 * @generated
 */
public class SocialNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SocialNavigatorItem) {
			SocialNavigatorItem item = (SocialNavigatorItem) element;
			return SocialVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
