package demm.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import demm.diagram.providers.DeploymentElementTypes;

/**
 * @generated
 */
public class DeploymentPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(createDevice1CreationTool());
		paletteContainer.add(createEntity2CreationTool());
		paletteContainer.add(createDevicePlatform3CreationTool());
		paletteContainer.add(createLanguage4CreationTool());
		paletteContainer.add(createOS5CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createConnection7CreationTool());
		paletteContainer.add(createInformation8CreationTool());
		paletteContainer.add(createConnectionPlatform9CreationTool());
		paletteContainer.add(createMedium10CreationTool());
		paletteContainer.add(createProtocol11CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createDeviceToConnector13CreationTool());
		paletteContainer.add(createConnectorToDevice14CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Device1CreationTool_title,
				Messages.Device1CreationTool_desc,
				Collections.singletonList(DeploymentElementTypes.Device_2003));
		entry.setId("createDevice1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.Device_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Entity2CreationTool_title,
				Messages.Entity2CreationTool_desc,
				Collections.singletonList(DeploymentElementTypes.Entity_3002));
		entry.setId("createEntity2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.Entity_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevicePlatform3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DevicePlatform3CreationTool_title,
				Messages.DevicePlatform3CreationTool_desc,
				Collections
						.singletonList(DeploymentElementTypes.DevicePlatform_3001));
		entry.setId("createDevicePlatform3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.DevicePlatform_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLanguage4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Language4CreationTool_title,
				Messages.Language4CreationTool_desc,
				Collections
						.singletonList(DeploymentElementTypes.ProgrammingLanguage_2001));
		entry.setId("createLanguage4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.ProgrammingLanguage_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOS5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OS5CreationTool_title,
				Messages.OS5CreationTool_desc,
				Collections
						.singletonList(DeploymentElementTypes.OperatingSystem_2002));
		entry.setId("createOS5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.OperatingSystem_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Connection7CreationTool_title,
				Messages.Connection7CreationTool_desc,
				Collections
						.singletonList(DeploymentElementTypes.Connection_2004));
		entry.setId("createConnection7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.Connection_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInformation8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Information8CreationTool_title,
				Messages.Information8CreationTool_desc,
				Collections
						.singletonList(DeploymentElementTypes.Information_3003));
		entry.setId("createInformation8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.Information_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionPlatform9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConnectionPlatform9CreationTool_title,
				Messages.ConnectionPlatform9CreationTool_desc,
				Collections
						.singletonList(DeploymentElementTypes.ConnectionPlatform_3004));
		entry.setId("createConnectionPlatform9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.ConnectionPlatform_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMedium10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Medium10CreationTool_title,
				Messages.Medium10CreationTool_desc,
				Collections.singletonList(DeploymentElementTypes.Medium_2005));
		entry.setId("createMedium10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.Medium_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProtocol11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Protocol11CreationTool_title,
				Messages.Protocol11CreationTool_desc,
				Collections.singletonList(DeploymentElementTypes.Protocol_2006));
		entry.setId("createProtocol11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.Protocol_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeviceToConnector13CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DeviceToConnector13CreationTool_title,
				Messages.DeviceToConnector13CreationTool_desc,
				Collections
						.singletonList(DeploymentElementTypes.DeviceToConnectionEdge_4001));
		entry.setId("createDeviceToConnector13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.DeviceToConnectionEdge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectorToDevice14CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectorToDevice14CreationTool_title,
				Messages.ConnectorToDevice14CreationTool_desc,
				Collections
						.singletonList(DeploymentElementTypes.ConnectionToDeviceEdge_4002));
		entry.setId("createConnectorToDevice14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeploymentElementTypes
				.getImageDescriptor(DeploymentElementTypes.ConnectionToDeviceEdge_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
