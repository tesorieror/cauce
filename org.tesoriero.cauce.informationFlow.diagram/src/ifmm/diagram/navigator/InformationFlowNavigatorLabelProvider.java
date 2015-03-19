package ifmm.diagram.navigator;

import ifmm.SystemInformaitonFlow;
import ifmm.diagram.edit.parts.BroadcastInformationFlowEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowNameEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.edit.parts.ContextAwareEntityEditPart;
import ifmm.diagram.edit.parts.ContextAwareEntityNameEditPart;
import ifmm.diagram.edit.parts.EntityToBroadcastInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.EntityToPointToPointInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.InputDataDefinitionEditPart;
import ifmm.diagram.edit.parts.InputDataEditPart;
import ifmm.diagram.edit.parts.OutputData2EditPart;
import ifmm.diagram.edit.parts.OutputDataDefinition2EditPart;
import ifmm.diagram.edit.parts.OutputDataDefinitionEditPart;
import ifmm.diagram.edit.parts.OutputDataEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowNameEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.edit.parts.SystemInformaitonFlowEditPart;
import ifmm.diagram.part.InformationFlowDiagramEditorPlugin;
import ifmm.diagram.part.InformationFlowVisualIDRegistry;
import ifmm.diagram.providers.InformationFlowElementTypes;
import ifmm.diagram.providers.InformationFlowParserProvider;

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

/**
 * @generated
 */
public class InformationFlowNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		InformationFlowDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		InformationFlowDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof InformationFlowNavigatorItem
				&& !isOwnView(((InformationFlowNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof InformationFlowNavigatorGroup) {
			InformationFlowNavigatorGroup group = (InformationFlowNavigatorGroup) element;
			return InformationFlowDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof InformationFlowNavigatorItem) {
			InformationFlowNavigatorItem navigatorItem = (InformationFlowNavigatorItem) element;
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
		switch (InformationFlowVisualIDRegistry.getVisualID(view)) {
		case SystemInformaitonFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tesoriero.org/cauce/informationFlow/1.0?SystemInformaitonFlow", InformationFlowElementTypes.SystemInformaitonFlow_1000); //$NON-NLS-1$
		case BroadcastInformationFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/informationFlow/1.0?BroadcastInformationFlow", InformationFlowElementTypes.BroadcastInformationFlow_2001); //$NON-NLS-1$
		case PointToPointInformationFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/informationFlow/1.0?PointToPointInformationFlow", InformationFlowElementTypes.PointToPointInformationFlow_2002); //$NON-NLS-1$
		case ContextAwareEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/informationFlow/1.0?ContextAwareEntity", InformationFlowElementTypes.ContextAwareEntity_2003); //$NON-NLS-1$
		case OutputDataEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/informationFlow/1.0?OutputData", InformationFlowElementTypes.OutputData_3001); //$NON-NLS-1$
		case OutputData2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/informationFlow/1.0?OutputData", InformationFlowElementTypes.OutputData_3002); //$NON-NLS-1$
		case InputDataEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/informationFlow/1.0?InputData", InformationFlowElementTypes.InputData_3003); //$NON-NLS-1$
		case BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/informationFlow/1.0?BroadcastInformationFlowToEntityEdge", InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001); //$NON-NLS-1$
		case EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/informationFlow/1.0?EntityToBroadcastInformationFlowEdge", InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002); //$NON-NLS-1$
		case EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/informationFlow/1.0?EntityToPointToPointInformationFlowEdge", InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003); //$NON-NLS-1$
		case PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/informationFlow/1.0?PointToPointInformationFlowToEntityEdge", InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = InformationFlowDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& InformationFlowElementTypes.isKnownElementType(elementType)) {
			image = InformationFlowElementTypes.getImage(elementType);
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
		if (element instanceof InformationFlowNavigatorGroup) {
			InformationFlowNavigatorGroup group = (InformationFlowNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof InformationFlowNavigatorItem) {
			InformationFlowNavigatorItem navigatorItem = (InformationFlowNavigatorItem) element;
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
		switch (InformationFlowVisualIDRegistry.getVisualID(view)) {
		case SystemInformaitonFlowEditPart.VISUAL_ID:
			return getSystemInformaitonFlow_1000Text(view);
		case BroadcastInformationFlowEditPart.VISUAL_ID:
			return getBroadcastInformationFlow_2001Text(view);
		case PointToPointInformationFlowEditPart.VISUAL_ID:
			return getPointToPointInformationFlow_2002Text(view);
		case ContextAwareEntityEditPart.VISUAL_ID:
			return getContextAwareEntity_2003Text(view);
		case OutputDataEditPart.VISUAL_ID:
			return getOutputData_3001Text(view);
		case OutputData2EditPart.VISUAL_ID:
			return getOutputData_3002Text(view);
		case InputDataEditPart.VISUAL_ID:
			return getInputData_3003Text(view);
		case BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getBroadcastInformationFlowToEntityEdge_4001Text(view);
		case EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID:
			return getEntityToBroadcastInformationFlowEdge_4002Text(view);
		case EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID:
			return getEntityToPointToPointInformationFlowEdge_4003Text(view);
		case PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getPointToPointInformationFlowToEntityEdge_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSystemInformaitonFlow_1000Text(View view) {
		SystemInformaitonFlow domainModelElement = (SystemInformaitonFlow) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBroadcastInformationFlow_2001Text(View view) {
		IParser parser = InformationFlowParserProvider
				.getParser(
						InformationFlowElementTypes.BroadcastInformationFlow_2001,
						view.getElement() != null ? view.getElement() : view,
						InformationFlowVisualIDRegistry
								.getType(BroadcastInformationFlowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPointToPointInformationFlow_2002Text(View view) {
		IParser parser = InformationFlowParserProvider
				.getParser(
						InformationFlowElementTypes.PointToPointInformationFlow_2002,
						view.getElement() != null ? view.getElement() : view,
						InformationFlowVisualIDRegistry
								.getType(PointToPointInformationFlowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContextAwareEntity_2003Text(View view) {
		IParser parser = InformationFlowParserProvider.getParser(
				InformationFlowElementTypes.ContextAwareEntity_2003, view
						.getElement() != null ? view.getElement() : view,
				InformationFlowVisualIDRegistry
						.getType(ContextAwareEntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputData_3001Text(View view) {
		IParser parser = InformationFlowParserProvider.getParser(
				InformationFlowElementTypes.OutputData_3001,
				view.getElement() != null ? view.getElement() : view,
				InformationFlowVisualIDRegistry
						.getType(OutputDataDefinitionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputData_3002Text(View view) {
		IParser parser = InformationFlowParserProvider.getParser(
				InformationFlowElementTypes.OutputData_3002,
				view.getElement() != null ? view.getElement() : view,
				InformationFlowVisualIDRegistry
						.getType(OutputDataDefinition2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputData_3003Text(View view) {
		IParser parser = InformationFlowParserProvider.getParser(
				InformationFlowElementTypes.InputData_3003,
				view.getElement() != null ? view.getElement() : view,
				InformationFlowVisualIDRegistry
						.getType(InputDataDefinitionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InformationFlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBroadcastInformationFlowToEntityEdge_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEntityToBroadcastInformationFlowEdge_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEntityToPointToPointInformationFlowEdge_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPointToPointInformationFlowToEntityEdge_4004Text(View view) {
		return ""; //$NON-NLS-1$
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
		return SystemInformaitonFlowEditPart.MODEL_ID
				.equals(InformationFlowVisualIDRegistry.getModelID(view));
	}

}
