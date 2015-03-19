package spmm.diagram.part;

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

import spmm.diagram.providers.SpaceElementTypes;

/**
 * @generated
 */
public class SpacePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSpmm1Group());
	}

	/**
	 * Creates "spmm" palette tool group
	 * @generated
	 */
	private PaletteContainer createSpmm1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Spmm1Group_title);
		paletteContainer.setId("createSpmm1Group"); //$NON-NLS-1$
		paletteContainer.add(createVirtualSpace1CreationTool());
		paletteContainer.add(createPhysicalSpace2CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createGrouping4CreationTool());
		paletteContainer.add(createGeneralization5CreationTool());
		paletteContainer.add(createContention6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVirtualSpace1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.VirtualSpace1CreationTool_title,
				Messages.VirtualSpace1CreationTool_desc,
				Collections.singletonList(SpaceElementTypes.VirtualSpace_2002));
		entry.setId("createVirtualSpace1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SpaceElementTypes
				.getImageDescriptor(SpaceElementTypes.VirtualSpace_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPhysicalSpace2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PhysicalSpace2CreationTool_title,
				Messages.PhysicalSpace2CreationTool_desc,
				Collections.singletonList(SpaceElementTypes.PhysicalSpace_2001));
		entry.setId("createPhysicalSpace2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SpaceElementTypes
				.getImageDescriptor(SpaceElementTypes.PhysicalSpace_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGrouping4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Grouping4CreationTool_title,
				Messages.Grouping4CreationTool_desc,
				Collections.singletonList(SpaceElementTypes.Grouping_4001));
		entry.setId("createGrouping4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SpaceElementTypes
				.getImageDescriptor(SpaceElementTypes.Grouping_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Generalization5CreationTool_title,
				Messages.Generalization5CreationTool_desc,
				Collections
						.singletonList(SpaceElementTypes.Generalization_4003));
		entry.setId("createGeneralization5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SpaceElementTypes
				.getImageDescriptor(SpaceElementTypes.Generalization_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContention6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Contention6CreationTool_title,
				Messages.Contention6CreationTool_desc,
				Collections.singletonList(SpaceElementTypes.Contention_4002));
		entry.setId("createContention6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SpaceElementTypes
				.getImageDescriptor(SpaceElementTypes.Contention_4002));
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
