package spmm.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import spmm.Contention;
import spmm.Generalization;
import spmm.Grouping;
import spmm.Universe;
import spmm.diagram.edit.parts.ContentionEditPart;
import spmm.diagram.edit.parts.GeneralizationEditPart;
import spmm.diagram.edit.parts.GroupingEditPart;
import spmm.diagram.edit.parts.PhysicalSpaceEditPart;
import spmm.diagram.edit.parts.PhysicalSpaceNameEditPart;
import spmm.diagram.edit.parts.UniverseEditPart;
import spmm.diagram.edit.parts.VirtualSpaceEditPart;
import spmm.diagram.edit.parts.VirtualSpaceNameEditPart;
import spmm.diagram.part.SpaceDiagramEditorPlugin;
import spmm.diagram.part.SpaceVisualIDRegistry;
import spmm.diagram.providers.SpaceElementTypes;
import spmm.diagram.providers.SpaceParserProvider;

/**
 * @generated
 */
public class SpaceNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SpaceDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SpaceDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SpaceNavigatorItem
				&& !isOwnView(((SpaceNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SpaceNavigatorGroup) {
			SpaceNavigatorGroup group = (SpaceNavigatorGroup) element;
			return SpaceDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof SpaceNavigatorItem) {
			SpaceNavigatorItem navigatorItem = (SpaceNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (SpaceVisualIDRegistry.getVisualID(view)) {
		case UniverseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tesoriero.org/cauce/space/1.0?Universe", SpaceElementTypes.Universe_1000); //$NON-NLS-1$
		case PhysicalSpaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/space/1.0?PhysicalSpace", SpaceElementTypes.PhysicalSpace_2001); //$NON-NLS-1$
		case VirtualSpaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/space/1.0?VirtualSpace", SpaceElementTypes.VirtualSpace_2002); //$NON-NLS-1$
		case GroupingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/space/1.0?Grouping", SpaceElementTypes.Grouping_4001); //$NON-NLS-1$
		case ContentionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/space/1.0?Contention", SpaceElementTypes.Contention_4002); //$NON-NLS-1$
		case GeneralizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/space/1.0?Generalization", SpaceElementTypes.Generalization_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SpaceDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SpaceElementTypes.isKnownElementType(elementType)) {
			image = SpaceElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SpaceNavigatorGroup) {
			SpaceNavigatorGroup group = (SpaceNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SpaceNavigatorItem) {
			SpaceNavigatorItem navigatorItem = (SpaceNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (SpaceVisualIDRegistry.getVisualID(view)) {
		case UniverseEditPart.VISUAL_ID:
			return getUniverse_1000Text(view);
		case PhysicalSpaceEditPart.VISUAL_ID:
			return getPhysicalSpace_2001Text(view);
		case VirtualSpaceEditPart.VISUAL_ID:
			return getVirtualSpace_2002Text(view);
		case GroupingEditPart.VISUAL_ID:
			return getGrouping_4001Text(view);
		case ContentionEditPart.VISUAL_ID:
			return getContention_4002Text(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getUniverse_1000Text(View view) {
		Universe domainModelElement = (Universe) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SpaceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPhysicalSpace_2001Text(View view) {
		IParser parser = SpaceParserProvider.getParser(
				SpaceElementTypes.PhysicalSpace_2001,
				view.getElement() != null ? view.getElement() : view,
				SpaceVisualIDRegistry
						.getType(PhysicalSpaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SpaceDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVirtualSpace_2002Text(View view) {
		IParser parser = SpaceParserProvider.getParser(
				SpaceElementTypes.VirtualSpace_2002,
				view.getElement() != null ? view.getElement() : view,
				SpaceVisualIDRegistry
						.getType(VirtualSpaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SpaceDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGrouping_4001Text(View view) {
		Grouping domainModelElement = (Grouping) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			SpaceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContention_4002Text(View view) {
		Contention domainModelElement = (Contention) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			SpaceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralization_4003Text(View view) {
		Generalization domainModelElement = (Generalization) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			SpaceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return UniverseEditPart.MODEL_ID.equals(SpaceVisualIDRegistry
				.getModelID(view));
	}

}
