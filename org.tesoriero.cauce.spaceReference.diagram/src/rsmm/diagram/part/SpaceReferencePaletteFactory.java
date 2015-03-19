package rsmm.diagram.part;

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

import rsmm.diagram.providers.SpaceReferenceElementTypes;

/**
 * @generated
 */
public class SpaceReferencePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createRsmm1Group());
	}

	/**
	 * Creates "rsmm" palette tool group
	 * @generated
	 */
	private PaletteContainer createRsmm1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Rsmm1Group_title);
		paletteContainer.setId("createRsmm1Group"); //$NON-NLS-1$
		paletteContainer.add(createReferentialSpace1CreationTool());
		paletteContainer.add(createContextAwareEntityReference2CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer
				.add(createSpaceToEntityReferenceDependency4CreationTool());
		paletteContainer
				.add(createSpaceToSpaceReferenceDependency5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReferentialSpace1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ReferentialSpace1CreationTool_title,
				Messages.ReferentialSpace1CreationTool_desc,
				Collections
						.singletonList(SpaceReferenceElementTypes.ReferentialSpace_2002));
		entry.setId("createReferentialSpace1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SpaceReferenceElementTypes
				.getImageDescriptor(SpaceReferenceElementTypes.ReferentialSpace_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContextAwareEntityReference2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContextAwareEntityReference2CreationTool_title,
				Messages.ContextAwareEntityReference2CreationTool_desc,
				Collections
						.singletonList(SpaceReferenceElementTypes.ContextAwareEntityReference_2001));
		entry.setId("createContextAwareEntityReference2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SpaceReferenceElementTypes
				.getImageDescriptor(SpaceReferenceElementTypes.ContextAwareEntityReference_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpaceToEntityReferenceDependency4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SpaceToEntityReferenceDependency4CreationTool_title,
				Messages.SpaceToEntityReferenceDependency4CreationTool_desc,
				Collections
						.singletonList(SpaceReferenceElementTypes.SpaceToEntityReferenceDependency_4002));
		entry.setId("createSpaceToEntityReferenceDependency4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SpaceReferenceElementTypes
				.getImageDescriptor(SpaceReferenceElementTypes.SpaceToEntityReferenceDependency_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpaceToSpaceReferenceDependency5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SpaceToSpaceReferenceDependency5CreationTool_title,
				Messages.SpaceToSpaceReferenceDependency5CreationTool_desc,
				Collections
						.singletonList(SpaceReferenceElementTypes.SpaceToSpaceReferenceDependency_4001));
		entry.setId("createSpaceToSpaceReferenceDependency5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SpaceReferenceElementTypes
				.getImageDescriptor(SpaceReferenceElementTypes.SpaceToSpaceReferenceDependency_4001));
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
