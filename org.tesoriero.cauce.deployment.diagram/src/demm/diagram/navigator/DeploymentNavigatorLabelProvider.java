package demm.diagram.navigator;

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

import demm.ConnectionToDeviceEdge;
import demm.DevelopmentEnvironment;
import demm.DeviceToConnectionEdge;
import demm.diagram.edit.parts.ConnectionEditPart;
import demm.diagram.edit.parts.ConnectionNameEditPart;
import demm.diagram.edit.parts.ConnectionPlatformEditPart;
import demm.diagram.edit.parts.ConnectionPlatformNameEditPart;
import demm.diagram.edit.parts.ConnectionToDeviceEdgeEditPart;
import demm.diagram.edit.parts.DevelopmentEnvironmentEditPart;
import demm.diagram.edit.parts.DeviceEditPart;
import demm.diagram.edit.parts.DeviceNameEditPart;
import demm.diagram.edit.parts.DevicePlatformEditPart;
import demm.diagram.edit.parts.DevicePlatformNameEditPart;
import demm.diagram.edit.parts.DeviceToConnectionEdgeEditPart;
import demm.diagram.edit.parts.EntityEditPart;
import demm.diagram.edit.parts.EntityNameEditPart;
import demm.diagram.edit.parts.InformationEditPart;
import demm.diagram.edit.parts.InformationNameEditPart;
import demm.diagram.edit.parts.MediumEditPart;
import demm.diagram.edit.parts.MediumVersionEditPart;
import demm.diagram.edit.parts.OperatingSystemEditPart;
import demm.diagram.edit.parts.OperatingSystemNameEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageNameEditPart;
import demm.diagram.edit.parts.ProtocolEditPart;
import demm.diagram.edit.parts.ProtocolNameEditPart;
import demm.diagram.part.DeploymentDiagramEditorPlugin;
import demm.diagram.part.DeploymentVisualIDRegistry;
import demm.diagram.providers.DeploymentElementTypes;
import demm.diagram.providers.DeploymentParserProvider;

/**
 * @generated
 */
public class DeploymentNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DeploymentDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DeploymentDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DeploymentNavigatorItem
				&& !isOwnView(((DeploymentNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof DeploymentNavigatorGroup) {
			DeploymentNavigatorGroup group = (DeploymentNavigatorGroup) element;
			return DeploymentDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof DeploymentNavigatorItem) {
			DeploymentNavigatorItem navigatorItem = (DeploymentNavigatorItem) element;
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
		switch (DeploymentVisualIDRegistry.getVisualID(view)) {
		case DevelopmentEnvironmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tesoriero.org/cauce/deployment/1.0?DevelopmentEnvironment", DeploymentElementTypes.DevelopmentEnvironment_1000); //$NON-NLS-1$
		case ProgrammingLanguageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/deployment/1.0?ProgrammingLanguage", DeploymentElementTypes.ProgrammingLanguage_2001); //$NON-NLS-1$
		case OperatingSystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/deployment/1.0?OperatingSystem", DeploymentElementTypes.OperatingSystem_2002); //$NON-NLS-1$
		case DeviceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/deployment/1.0?Device", DeploymentElementTypes.Device_2003); //$NON-NLS-1$
		case ConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/deployment/1.0?Connection", DeploymentElementTypes.Connection_2004); //$NON-NLS-1$
		case MediumEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/deployment/1.0?Medium", DeploymentElementTypes.Medium_2005); //$NON-NLS-1$
		case ProtocolEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/deployment/1.0?Protocol", DeploymentElementTypes.Protocol_2006); //$NON-NLS-1$
		case DevicePlatformEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/deployment/1.0?DevicePlatform", DeploymentElementTypes.DevicePlatform_3001); //$NON-NLS-1$
		case EntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/deployment/1.0?Entity", DeploymentElementTypes.Entity_3002); //$NON-NLS-1$
		case InformationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/deployment/1.0?Information", DeploymentElementTypes.Information_3003); //$NON-NLS-1$
		case ConnectionPlatformEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/deployment/1.0?ConnectionPlatform", DeploymentElementTypes.ConnectionPlatform_3004); //$NON-NLS-1$
		case DeviceToConnectionEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/deployment/1.0?DeviceToConnectionEdge", DeploymentElementTypes.DeviceToConnectionEdge_4001); //$NON-NLS-1$
		case ConnectionToDeviceEdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/deployment/1.0?ConnectionToDeviceEdge", DeploymentElementTypes.ConnectionToDeviceEdge_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DeploymentDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DeploymentElementTypes.isKnownElementType(elementType)) {
			image = DeploymentElementTypes.getImage(elementType);
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
		if (element instanceof DeploymentNavigatorGroup) {
			DeploymentNavigatorGroup group = (DeploymentNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DeploymentNavigatorItem) {
			DeploymentNavigatorItem navigatorItem = (DeploymentNavigatorItem) element;
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
		switch (DeploymentVisualIDRegistry.getVisualID(view)) {
		case DevelopmentEnvironmentEditPart.VISUAL_ID:
			return getDevelopmentEnvironment_1000Text(view);
		case ProgrammingLanguageEditPart.VISUAL_ID:
			return getProgrammingLanguage_2001Text(view);
		case OperatingSystemEditPart.VISUAL_ID:
			return getOperatingSystem_2002Text(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2003Text(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2004Text(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2005Text(view);
		case ProtocolEditPart.VISUAL_ID:
			return getProtocol_2006Text(view);
		case DevicePlatformEditPart.VISUAL_ID:
			return getDevicePlatform_3001Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_3002Text(view);
		case InformationEditPart.VISUAL_ID:
			return getInformation_3003Text(view);
		case ConnectionPlatformEditPart.VISUAL_ID:
			return getConnectionPlatform_3004Text(view);
		case DeviceToConnectionEdgeEditPart.VISUAL_ID:
			return getDeviceToConnectionEdge_4001Text(view);
		case ConnectionToDeviceEdgeEditPart.VISUAL_ID:
			return getConnectionToDeviceEdge_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDevelopmentEnvironment_1000Text(View view) {
		DevelopmentEnvironment domainModelElement = (DevelopmentEnvironment) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProgrammingLanguage_2001Text(View view) {
		IParser parser = DeploymentParserProvider.getParser(
				DeploymentElementTypes.ProgrammingLanguage_2001, view
						.getElement() != null ? view.getElement() : view,
				DeploymentVisualIDRegistry
						.getType(ProgrammingLanguageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperatingSystem_2002Text(View view) {
		IParser parser = DeploymentParserProvider.getParser(
				DeploymentElementTypes.OperatingSystem_2002,
				view.getElement() != null ? view.getElement() : view,
				DeploymentVisualIDRegistry
						.getType(OperatingSystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDevice_2003Text(View view) {
		IParser parser = DeploymentParserProvider.getParser(
				DeploymentElementTypes.Device_2003,
				view.getElement() != null ? view.getElement() : view,
				DeploymentVisualIDRegistry
						.getType(DeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_2004Text(View view) {
		IParser parser = DeploymentParserProvider.getParser(
				DeploymentElementTypes.Connection_2004,
				view.getElement() != null ? view.getElement() : view,
				DeploymentVisualIDRegistry
						.getType(ConnectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMedium_2005Text(View view) {
		IParser parser = DeploymentParserProvider.getParser(
				DeploymentElementTypes.Medium_2005,
				view.getElement() != null ? view.getElement() : view,
				DeploymentVisualIDRegistry
						.getType(MediumVersionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProtocol_2006Text(View view) {
		IParser parser = DeploymentParserProvider.getParser(
				DeploymentElementTypes.Protocol_2006,
				view.getElement() != null ? view.getElement() : view,
				DeploymentVisualIDRegistry
						.getType(ProtocolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDevicePlatform_3001Text(View view) {
		IParser parser = DeploymentParserProvider.getParser(
				DeploymentElementTypes.DevicePlatform_3001,
				view.getElement() != null ? view.getElement() : view,
				DeploymentVisualIDRegistry
						.getType(DevicePlatformNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntity_3002Text(View view) {
		IParser parser = DeploymentParserProvider.getParser(
				DeploymentElementTypes.Entity_3002,
				view.getElement() != null ? view.getElement() : view,
				DeploymentVisualIDRegistry
						.getType(EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInformation_3003Text(View view) {
		IParser parser = DeploymentParserProvider.getParser(
				DeploymentElementTypes.Information_3003,
				view.getElement() != null ? view.getElement() : view,
				DeploymentVisualIDRegistry
						.getType(InformationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionPlatform_3004Text(View view) {
		IParser parser = DeploymentParserProvider.getParser(
				DeploymentElementTypes.ConnectionPlatform_3004, view
						.getElement() != null ? view.getElement() : view,
				DeploymentVisualIDRegistry
						.getType(ConnectionPlatformNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeviceToConnectionEdge_4001Text(View view) {
		DeviceToConnectionEdge domainModelElement = (DeviceToConnectionEdge) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionToDeviceEdge_4002Text(View view) {
		ConnectionToDeviceEdge domainModelElement = (ConnectionToDeviceEdge) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
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
		return DevelopmentEnvironmentEditPart.MODEL_ID
				.equals(DeploymentVisualIDRegistry.getModelID(view));
	}

}
