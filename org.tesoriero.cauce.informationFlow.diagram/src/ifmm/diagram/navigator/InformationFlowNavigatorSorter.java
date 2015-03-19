package ifmm.diagram.navigator;

import ifmm.diagram.part.InformationFlowVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class InformationFlowNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof InformationFlowNavigatorItem) {
			InformationFlowNavigatorItem item = (InformationFlowNavigatorItem) element;
			return InformationFlowVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
