package rsmm.diagram.navigator;

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

import rsmm.SystemInformationFlowReferenceSpace;
import rsmm.diagram.edit.parts.ContextAwareEntityReferenceEditPart;
import rsmm.diagram.edit.parts.ContextAwareEntityReferenceNameEditPart;
import rsmm.diagram.edit.parts.ReferentialSpaceEditPart;
import rsmm.diagram.edit.parts.ReferentialSpaceNameEditPart;
import rsmm.diagram.edit.parts.SpaceToEntityReferenceDependencyCardinalityEditPart;
import rsmm.diagram.edit.parts.SpaceToEntityReferenceDependencyEditPart;
import rsmm.diagram.edit.parts.SpaceToSpaceReferenceDependencyCardinalityEditPart;
import rsmm.diagram.edit.parts.SpaceToSpaceReferenceDependencyEditPart;
import rsmm.diagram.edit.parts.SystemInformationFlowReferenceSpaceEditPart;
import rsmm.diagram.part.SpaceReferenceDiagramEditorPlugin;
import rsmm.diagram.part.SpaceReferenceVisualIDRegistry;
import rsmm.diagram.providers.SpaceReferenceElementTypes;
import rsmm.diagram.providers.SpaceReferenceParserProvider;

/**
 * @generated
 */
public class SpaceReferenceNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SpaceReferenceDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SpaceReferenceDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SpaceReferenceNavigatorItem
				&& !isOwnView(((SpaceReferenceNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SpaceReferenceNavigatorGroup) {
			SpaceReferenceNavigatorGroup group = (SpaceReferenceNavigatorGroup) element;
			return SpaceReferenceDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof SpaceReferenceNavigatorItem) {
			SpaceReferenceNavigatorItem navigatorItem = (SpaceReferenceNavigatorItem) element;
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
		switch (SpaceReferenceVisualIDRegistry.getVisualID(view)) {
		case SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tesoriero.org/cauce/spaceReference/1.0?SystemInformationFlowReferenceSpace", SpaceReferenceElementTypes.SystemInformationFlowReferenceSpace_1000); //$NON-NLS-1$
		case ContextAwareEntityReferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/spaceReference/1.0?ContextAwareEntityReference", SpaceReferenceElementTypes.ContextAwareEntityReference_2001); //$NON-NLS-1$
		case ReferentialSpaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/spaceReference/1.0?ReferentialSpace", SpaceReferenceElementTypes.ReferentialSpace_2002); //$NON-NLS-1$
		case SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/spaceReference/1.0?SpaceToSpaceReferenceDependency", SpaceReferenceElementTypes.SpaceToSpaceReferenceDependency_4001); //$NON-NLS-1$
		case SpaceToEntityReferenceDependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/spaceReference/1.0?SpaceToEntityReferenceDependency", SpaceReferenceElementTypes.SpaceToEntityReferenceDependency_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SpaceReferenceDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SpaceReferenceElementTypes.isKnownElementType(elementType)) {
			image = SpaceReferenceElementTypes.getImage(elementType);
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
		if (element instanceof SpaceReferenceNavigatorGroup) {
			SpaceReferenceNavigatorGroup group = (SpaceReferenceNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SpaceReferenceNavigatorItem) {
			SpaceReferenceNavigatorItem navigatorItem = (SpaceReferenceNavigatorItem) element;
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
		switch (SpaceReferenceVisualIDRegistry.getVisualID(view)) {
		case SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID:
			return getSystemInformationFlowReferenceSpace_1000Text(view);
		case ContextAwareEntityReferenceEditPart.VISUAL_ID:
			return getContextAwareEntityReference_2001Text(view);
		case ReferentialSpaceEditPart.VISUAL_ID:
			return getReferentialSpace_2002Text(view);
		case SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID:
			return getSpaceToSpaceReferenceDependency_4001Text(view);
		case SpaceToEntityReferenceDependencyEditPart.VISUAL_ID:
			return getSpaceToEntityReferenceDependency_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSystemInformationFlowReferenceSpace_1000Text(View view) {
		SystemInformationFlowReferenceSpace domainModelElement = (SystemInformationFlowReferenceSpace) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SpaceReferenceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContextAwareEntityReference_2001Text(View view) {
		IParser parser = SpaceReferenceParserProvider
				.getParser(
						SpaceReferenceElementTypes.ContextAwareEntityReference_2001,
						view.getElement() != null ? view.getElement() : view,
						SpaceReferenceVisualIDRegistry
								.getType(ContextAwareEntityReferenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SpaceReferenceDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReferentialSpace_2002Text(View view) {
		IParser parser = SpaceReferenceParserProvider.getParser(
				SpaceReferenceElementTypes.ReferentialSpace_2002, view
						.getElement() != null ? view.getElement() : view,
				SpaceReferenceVisualIDRegistry
						.getType(ReferentialSpaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SpaceReferenceDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpaceToSpaceReferenceDependency_4001Text(View view) {
		IParser parser = SpaceReferenceParserProvider
				.getParser(
						SpaceReferenceElementTypes.SpaceToSpaceReferenceDependency_4001,
						view.getElement() != null ? view.getElement() : view,
						SpaceReferenceVisualIDRegistry
								.getType(SpaceToSpaceReferenceDependencyCardinalityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SpaceReferenceDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpaceToEntityReferenceDependency_4002Text(View view) {
		IParser parser = SpaceReferenceParserProvider
				.getParser(
						SpaceReferenceElementTypes.SpaceToEntityReferenceDependency_4002,
						view.getElement() != null ? view.getElement() : view,
						SpaceReferenceVisualIDRegistry
								.getType(SpaceToEntityReferenceDependencyCardinalityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SpaceReferenceDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
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
		return SystemInformationFlowReferenceSpaceEditPart.MODEL_ID
				.equals(SpaceReferenceVisualIDRegistry.getModelID(view));
	}

}
