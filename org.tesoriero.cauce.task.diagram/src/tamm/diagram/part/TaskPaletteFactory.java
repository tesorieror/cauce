package tamm.diagram.part;

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

import tamm.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class TaskPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createTamm1Group());
	}

	/**
	 * Creates "tamm" palette tool group
	 * @generated
	 */
	private PaletteContainer createTamm1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Tamm1Group_title);
		paletteContainer.setId("createTamm1Group"); //$NON-NLS-1$
		paletteContainer.add(createInitialCondition1CreationTool());
		paletteContainer.add(createPreCondition2CreationTool());
		paletteContainer.add(createPostCondition3CreationTool());
		paletteContainer.add(createFinalCondition4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAndSplit6CreationTool());
		paletteContainer.add(createAndJoin7CreationTool());
		paletteContainer.add(createOrSplit8CreationTool());
		paletteContainer.add(createOrJoin9CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createSkipTask11CreationTool());
		paletteContainer.add(createSimpleTask12CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createEdge14CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialCondition1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InitialCondition1CreationTool_title,
				Messages.InitialCondition1CreationTool_desc,
				Collections
						.singletonList(TaskElementTypes.InitialCondition_2007));
		entry.setId("createInitialCondition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaskElementTypes
				.getImageDescriptor(TaskElementTypes.InitialCondition_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPreCondition2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PreCondition2CreationTool_title,
				Messages.PreCondition2CreationTool_desc,
				Collections.singletonList(TaskElementTypes.PreCondition_2002));
		entry.setId("createPreCondition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaskElementTypes
				.getImageDescriptor(TaskElementTypes.PreCondition_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPostCondition3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PostCondition3CreationTool_title,
				Messages.PostCondition3CreationTool_desc,
				Collections.singletonList(TaskElementTypes.PostCondition_2003));
		entry.setId("createPostCondition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaskElementTypes
				.getImageDescriptor(TaskElementTypes.PostCondition_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinalCondition4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FinalCondition4CreationTool_title,
				Messages.FinalCondition4CreationTool_desc,
				Collections.singletonList(TaskElementTypes.FinalCondition_2005));
		entry.setId("createFinalCondition4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaskElementTypes
				.getImageDescriptor(TaskElementTypes.FinalCondition_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAndSplit6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AndSplit6CreationTool_title,
				Messages.AndSplit6CreationTool_desc,
				Collections.singletonList(TaskElementTypes.AndSplit_2001));
		entry.setId("createAndSplit6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaskElementTypes
				.getImageDescriptor(TaskElementTypes.AndSplit_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAndJoin7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AndJoin7CreationTool_title,
				Messages.AndJoin7CreationTool_desc,
				Collections.singletonList(TaskElementTypes.AndJoin_2006));
		entry.setId("createAndJoin7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaskElementTypes
				.getImageDescriptor(TaskElementTypes.AndJoin_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrSplit8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OrSplit8CreationTool_title,
				Messages.OrSplit8CreationTool_desc,
				Collections.singletonList(TaskElementTypes.OrSplit_2009));
		entry.setId("createOrSplit8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaskElementTypes
				.getImageDescriptor(TaskElementTypes.OrSplit_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrJoin9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OrJoin9CreationTool_title,
				Messages.OrJoin9CreationTool_desc,
				Collections.singletonList(TaskElementTypes.OrJoin_2010));
		entry.setId("createOrJoin9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaskElementTypes
				.getImageDescriptor(TaskElementTypes.OrJoin_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSkipTask11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SkipTask11CreationTool_title,
				Messages.SkipTask11CreationTool_desc,
				Collections.singletonList(TaskElementTypes.SkipTask_2004));
		entry.setId("createSkipTask11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaskElementTypes
				.getImageDescriptor(TaskElementTypes.SkipTask_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSimpleTask12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SimpleTask12CreationTool_title,
				Messages.SimpleTask12CreationTool_desc,
				Collections.singletonList(TaskElementTypes.SimpleTask_2008));
		entry.setId("createSimpleTask12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaskElementTypes
				.getImageDescriptor(TaskElementTypes.SimpleTask_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEdge14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(TaskElementTypes.InputConditionToJoinTask_4001);
		types.add(TaskElementTypes.InputConditionToSplitTask_4002);
		types.add(TaskElementTypes.JoinTaskToOutputCondition_4003);
		types.add(TaskElementTypes.SplitTaskToOutputCondition_4004);
		types.add(TaskElementTypes.PreConditionToSystemTask_4005);
		types.add(TaskElementTypes.SystemTaskToPostCondition_4006);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Edge14CreationTool_title,
				Messages.Edge14CreationTool_desc, types);
		entry.setId("createEdge14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaskElementTypes
				.getImageDescriptor(TaskElementTypes.InputConditionToJoinTask_4001));
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
