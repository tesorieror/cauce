package ecmm.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import ecmm.diagram.providers.EntityContextElementTypes;

/**
 * @generated
 */
public class EntityContextPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEcmm1Group());
	}

	/**
	 * Creates "ecmm" palette tool group
	 * @generated
	 */
	private PaletteContainer createEcmm1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Ecmm1Group_title);
		paletteContainer.setId("createEcmm1Group"); //$NON-NLS-1$
		paletteContainer.add(createEntityContext1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createLogicMemory3CreationTool());
		paletteContainer.add(createDictionaryMemory4CreationTool());
		paletteContainer.add(createHolderMemory5CreationTool());
		paletteContainer.add(createStackMemory6CreationTool());
		paletteContainer.add(createTimeMemory7CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createContextSituation9CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createSensingContextCondition11CreationTool());
		paletteContainer.add(createMemoryContextCondition12CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createContextAction14CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createVariableDataDefinition16CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntityContext1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EntityContext1CreationTool_title,
				Messages.EntityContext1CreationTool_desc,
				Collections
						.singletonList(EntityContextElementTypes.EntityContext_2001));
		entry.setId("createEntityContext1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityContextElementTypes
				.getImageDescriptor(EntityContextElementTypes.EntityContext_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogicMemory3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LogicMemory3CreationTool_title,
				Messages.LogicMemory3CreationTool_desc,
				Collections
						.singletonList(EntityContextElementTypes.LogicMemory_3002));
		entry.setId("createLogicMemory3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityContextElementTypes
				.getImageDescriptor(EntityContextElementTypes.LogicMemory_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDictionaryMemory4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DictionaryMemory4CreationTool_title,
				Messages.DictionaryMemory4CreationTool_desc,
				Collections
						.singletonList(EntityContextElementTypes.DictionaryMemory_3005));
		entry.setId("createDictionaryMemory4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityContextElementTypes
				.getImageDescriptor(EntityContextElementTypes.DictionaryMemory_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHolderMemory5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.HolderMemory5CreationTool_title,
				Messages.HolderMemory5CreationTool_desc,
				Collections
						.singletonList(EntityContextElementTypes.HolderMemory_3001));
		entry.setId("createHolderMemory5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityContextElementTypes
				.getImageDescriptor(EntityContextElementTypes.HolderMemory_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStackMemory6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StackMemory6CreationTool_title,
				Messages.StackMemory6CreationTool_desc,
				Collections
						.singletonList(EntityContextElementTypes.StackMemory_3004));
		entry.setId("createStackMemory6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityContextElementTypes
				.getImageDescriptor(EntityContextElementTypes.StackMemory_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTimeMemory7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TimeMemory7CreationTool_title,
				Messages.TimeMemory7CreationTool_desc,
				Collections
						.singletonList(EntityContextElementTypes.TimeMemory_3003));
		entry.setId("createTimeMemory7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityContextElementTypes
				.getImageDescriptor(EntityContextElementTypes.TimeMemory_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContextSituation9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContextSituation9CreationTool_title,
				Messages.ContextSituation9CreationTool_desc,
				Collections
						.singletonList(EntityContextElementTypes.ContextSituation_3006));
		entry.setId("createContextSituation9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityContextElementTypes
				.getImageDescriptor(EntityContextElementTypes.ContextSituation_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSensingContextCondition11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SensingContextCondition11CreationTool_title,
				Messages.SensingContextCondition11CreationTool_desc,
				Collections
						.singletonList(EntityContextElementTypes.SensingContextCondition_3008));
		entry.setId("createSensingContextCondition11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityContextElementTypes
				.getImageDescriptor(EntityContextElementTypes.SensingContextCondition_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMemoryContextCondition12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MemoryContextCondition12CreationTool_title,
				Messages.MemoryContextCondition12CreationTool_desc,
				Collections
						.singletonList(EntityContextElementTypes.MemoryContextCondition_3007));
		entry.setId("createMemoryContextCondition12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityContextElementTypes
				.getImageDescriptor(EntityContextElementTypes.MemoryContextCondition_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContextAction14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContextAction14CreationTool_title,
				Messages.ContextAction14CreationTool_desc,
				Collections
						.singletonList(EntityContextElementTypes.ContextAction_3009));
		entry.setId("createContextAction14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityContextElementTypes
				.getImageDescriptor(EntityContextElementTypes.ContextAction_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariableDataDefinition16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.VariableDataDefinition16CreationTool_title,
				Messages.VariableDataDefinition16CreationTool_desc,
				Collections
						.singletonList(EntityContextElementTypes.VariableDataDefinition_3010));
		entry.setId("createVariableDataDefinition16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityContextElementTypes
				.getImageDescriptor(EntityContextElementTypes.VariableDataDefinition_3010));
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
}
