package somm.diagram.part;

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

import somm.diagram.providers.SocialElementTypes;

/**
 * @generated
 */
public class SocialPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSomm1Group());
	}

	/**
	 * Creates "somm" palette tool group
	 * @generated
	 */
	private PaletteContainer createSomm1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Somm1Group_title);
		paletteContainer.setId("createSomm1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Somm1Group_desc);
		paletteContainer.add(createRole1CreationTool());
		paletteContainer.add(createIndividual2CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createGeneralization4CreationTool());
		paletteContainer.add(createRealization5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Role1CreationTool_title,
				Messages.Role1CreationTool_desc,
				Collections.singletonList(SocialElementTypes.Role_2002));
		entry.setId("createRole1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SocialElementTypes
				.getImageDescriptor(SocialElementTypes.Role_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndividual2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Individual2CreationTool_title,
				Messages.Individual2CreationTool_desc,
				Collections
						.singletonList(SocialElementTypes.IndividualInstance_2001));
		entry.setId("createIndividual2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SocialElementTypes
				.getImageDescriptor(SocialElementTypes.IndividualInstance_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Generalization4CreationTool_title,
				Messages.Generalization4CreationTool_desc,
				Collections
						.singletonList(SocialElementTypes.Specialization_4001));
		entry.setId("createGeneralization4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SocialElementTypes
				.getImageDescriptor(SocialElementTypes.Specialization_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRealization5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Realization5CreationTool_title,
				Messages.Realization5CreationTool_desc,
				Collections
						.singletonList(SocialElementTypes.IndividualRealization_4002));
		entry.setId("createRealization5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SocialElementTypes
				.getImageDescriptor(SocialElementTypes.IndividualRealization_4002));
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
