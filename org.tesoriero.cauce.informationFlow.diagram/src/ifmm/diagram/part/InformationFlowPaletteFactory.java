package ifmm.diagram.part;

import ifmm.diagram.providers.InformationFlowElementTypes;

import java.util.ArrayList;
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

/**
 * @generated
 */
public class InformationFlowPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createIfmm1Group());
	}

	/**
	 * Creates "ifmm" palette tool group
	 * @generated
	 */
	private PaletteContainer createIfmm1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Ifmm1Group_title);
		paletteContainer.setId("createIfmm1Group"); //$NON-NLS-1$
		paletteContainer.add(createContextAwareEntity1CreationTool());
		paletteContainer.add(createPointToPointInformationFlow2CreationTool());
		paletteContainer.add(createBroadcastInformationFlow3CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer
				.add(createEntityToBroadcastInformationFlowEdge5CreationTool());
		paletteContainer
				.add(createEntityToPointToPointInformationFlowEdge6CreationTool());
		paletteContainer
				.add(createBroadcastInformationFlowToEntityEdge7CreationTool());
		paletteContainer
				.add(createPointToPointInformationFlowToEntityEdge8CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createInputData10CreationTool());
		paletteContainer.add(createOutputData11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContextAwareEntity1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContextAwareEntity1CreationTool_title,
				Messages.ContextAwareEntity1CreationTool_desc,
				Collections
						.singletonList(InformationFlowElementTypes.ContextAwareEntity_2003));
		entry.setId("createContextAwareEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InformationFlowElementTypes
				.getImageDescriptor(InformationFlowElementTypes.ContextAwareEntity_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPointToPointInformationFlow2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PointToPointInformationFlow2CreationTool_title,
				Messages.PointToPointInformationFlow2CreationTool_desc,
				Collections
						.singletonList(InformationFlowElementTypes.PointToPointInformationFlow_2002));
		entry.setId("createPointToPointInformationFlow2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InformationFlowElementTypes
				.getImageDescriptor(InformationFlowElementTypes.PointToPointInformationFlow_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBroadcastInformationFlow3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BroadcastInformationFlow3CreationTool_title,
				Messages.BroadcastInformationFlow3CreationTool_desc,
				Collections
						.singletonList(InformationFlowElementTypes.BroadcastInformationFlow_2001));
		entry.setId("createBroadcastInformationFlow3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InformationFlowElementTypes
				.getImageDescriptor(InformationFlowElementTypes.BroadcastInformationFlow_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntityToBroadcastInformationFlowEdge5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EntityToBroadcastInformationFlowEdge5CreationTool_title,
				Messages.EntityToBroadcastInformationFlowEdge5CreationTool_desc,
				Collections
						.singletonList(InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002));
		entry.setId("createEntityToBroadcastInformationFlowEdge5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InformationFlowElementTypes
				.getImageDescriptor(InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntityToPointToPointInformationFlowEdge6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EntityToPointToPointInformationFlowEdge6CreationTool_title,
				Messages.EntityToPointToPointInformationFlowEdge6CreationTool_desc,
				Collections
						.singletonList(InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003));
		entry.setId("createEntityToPointToPointInformationFlowEdge6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InformationFlowElementTypes
				.getImageDescriptor(InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBroadcastInformationFlowToEntityEdge7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.BroadcastInformationFlowToEntityEdge7CreationTool_title,
				Messages.BroadcastInformationFlowToEntityEdge7CreationTool_desc,
				Collections
						.singletonList(InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001));
		entry.setId("createBroadcastInformationFlowToEntityEdge7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InformationFlowElementTypes
				.getImageDescriptor(InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPointToPointInformationFlowToEntityEdge8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PointToPointInformationFlowToEntityEdge8CreationTool_title,
				Messages.PointToPointInformationFlowToEntityEdge8CreationTool_desc,
				Collections
						.singletonList(InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004));
		entry.setId("createPointToPointInformationFlowToEntityEdge8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InformationFlowElementTypes
				.getImageDescriptor(InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputData10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputData10CreationTool_title,
				Messages.InputData10CreationTool_desc,
				Collections
						.singletonList(InformationFlowElementTypes.InputData_3003));
		entry.setId("createInputData10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InformationFlowElementTypes
				.getImageDescriptor(InformationFlowElementTypes.InputData_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputData11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(InformationFlowElementTypes.OutputData_3001);
		types.add(InformationFlowElementTypes.OutputData_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutputData11CreationTool_title,
				Messages.OutputData11CreationTool_desc, types);
		entry.setId("createOutputData11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InformationFlowElementTypes
				.getImageDescriptor(InformationFlowElementTypes.OutputData_3001));
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
