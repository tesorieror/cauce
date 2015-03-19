package ecmm.diagram.navigator;

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

import ecmm.SystemContext;
import ecmm.diagram.edit.parts.ContextActionEditPart;
import ecmm.diagram.edit.parts.ContextActionExpressionEditPart;
import ecmm.diagram.edit.parts.ContextSituationEditPart;
import ecmm.diagram.edit.parts.ContextSituationNameEditPart;
import ecmm.diagram.edit.parts.DictionaryMemoryEditPart;
import ecmm.diagram.edit.parts.DictionaryMemoryNameEditPart;
import ecmm.diagram.edit.parts.EntityContextEditPart;
import ecmm.diagram.edit.parts.EntityContextEntityEditPart;
import ecmm.diagram.edit.parts.HolderMemoryEditPart;
import ecmm.diagram.edit.parts.HolderMemoryNameEditPart;
import ecmm.diagram.edit.parts.LogicMemoryEditPart;
import ecmm.diagram.edit.parts.LogicMemoryNameEditPart;
import ecmm.diagram.edit.parts.MemoryContextConditionEditPart;
import ecmm.diagram.edit.parts.MemoryContextConditionExpressionEditPart;
import ecmm.diagram.edit.parts.SensingContextConditionEditPart;
import ecmm.diagram.edit.parts.SensingContextConditionInformationflowEditPart;
import ecmm.diagram.edit.parts.StackMemoryEditPart;
import ecmm.diagram.edit.parts.StackMemoryNameEditPart;
import ecmm.diagram.edit.parts.SystemContextEditPart;
import ecmm.diagram.edit.parts.TimeMemoryEditPart;
import ecmm.diagram.edit.parts.TimeMemoryNameEditPart;
import ecmm.diagram.edit.parts.VariableDataDefinitionEditPart;
import ecmm.diagram.edit.parts.VariableDataDefinitionNameDefinitionEditPart;
import ecmm.diagram.part.EntityContextDiagramEditorPlugin;
import ecmm.diagram.part.EntityContextVisualIDRegistry;
import ecmm.diagram.providers.EntityContextElementTypes;
import ecmm.diagram.providers.EntityContextParserProvider;

/**
 * @generated
 */
public class EntityContextNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		EntityContextDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		EntityContextDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof EntityContextNavigatorItem
				&& !isOwnView(((EntityContextNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof EntityContextNavigatorGroup) {
			EntityContextNavigatorGroup group = (EntityContextNavigatorGroup) element;
			return EntityContextDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof EntityContextNavigatorItem) {
			EntityContextNavigatorItem navigatorItem = (EntityContextNavigatorItem) element;
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
		switch (EntityContextVisualIDRegistry.getVisualID(view)) {
		case SystemContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tesoriero.org/cauce/entityContext/1.0?SystemContext", EntityContextElementTypes.SystemContext_1000); //$NON-NLS-1$
		case EntityContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/entityContext/1.0?EntityContext", EntityContextElementTypes.EntityContext_2001); //$NON-NLS-1$
		case HolderMemoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/entityContext/1.0?HolderMemory", EntityContextElementTypes.HolderMemory_3001); //$NON-NLS-1$
		case LogicMemoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/entityContext/1.0?LogicMemory", EntityContextElementTypes.LogicMemory_3002); //$NON-NLS-1$
		case TimeMemoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/entityContext/1.0?TimeMemory", EntityContextElementTypes.TimeMemory_3003); //$NON-NLS-1$
		case StackMemoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/entityContext/1.0?StackMemory", EntityContextElementTypes.StackMemory_3004); //$NON-NLS-1$
		case DictionaryMemoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/entityContext/1.0?DictionaryMemory", EntityContextElementTypes.DictionaryMemory_3005); //$NON-NLS-1$
		case ContextSituationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/entityContext/1.0?ContextSituation", EntityContextElementTypes.ContextSituation_3006); //$NON-NLS-1$
		case MemoryContextConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/entityContext/1.0?MemoryContextCondition", EntityContextElementTypes.MemoryContextCondition_3007); //$NON-NLS-1$
		case SensingContextConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/entityContext/1.0?SensingContextCondition", EntityContextElementTypes.SensingContextCondition_3008); //$NON-NLS-1$
		case ContextActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/entityContext/1.0?ContextAction", EntityContextElementTypes.ContextAction_3009); //$NON-NLS-1$
		case VariableDataDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tesoriero.org/cauce/entityContext/1.0?VariableDataDefinition", EntityContextElementTypes.VariableDataDefinition_3010); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = EntityContextDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& EntityContextElementTypes.isKnownElementType(elementType)) {
			image = EntityContextElementTypes.getImage(elementType);
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
		if (element instanceof EntityContextNavigatorGroup) {
			EntityContextNavigatorGroup group = (EntityContextNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof EntityContextNavigatorItem) {
			EntityContextNavigatorItem navigatorItem = (EntityContextNavigatorItem) element;
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
		switch (EntityContextVisualIDRegistry.getVisualID(view)) {
		case SystemContextEditPart.VISUAL_ID:
			return getSystemContext_1000Text(view);
		case EntityContextEditPart.VISUAL_ID:
			return getEntityContext_2001Text(view);
		case HolderMemoryEditPart.VISUAL_ID:
			return getHolderMemory_3001Text(view);
		case LogicMemoryEditPart.VISUAL_ID:
			return getLogicMemory_3002Text(view);
		case TimeMemoryEditPart.VISUAL_ID:
			return getTimeMemory_3003Text(view);
		case StackMemoryEditPart.VISUAL_ID:
			return getStackMemory_3004Text(view);
		case DictionaryMemoryEditPart.VISUAL_ID:
			return getDictionaryMemory_3005Text(view);
		case ContextSituationEditPart.VISUAL_ID:
			return getContextSituation_3006Text(view);
		case MemoryContextConditionEditPart.VISUAL_ID:
			return getMemoryContextCondition_3007Text(view);
		case SensingContextConditionEditPart.VISUAL_ID:
			return getSensingContextCondition_3008Text(view);
		case ContextActionEditPart.VISUAL_ID:
			return getContextAction_3009Text(view);
		case VariableDataDefinitionEditPart.VISUAL_ID:
			return getVariableDataDefinition_3010Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSystemContext_1000Text(View view) {
		SystemContext domainModelElement = (SystemContext) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntityContext_2001Text(View view) {
		IParser parser = EntityContextParserProvider.getParser(
				EntityContextElementTypes.EntityContext_2001,
				view.getElement() != null ? view.getElement() : view,
				EntityContextVisualIDRegistry
						.getType(EntityContextEntityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHolderMemory_3001Text(View view) {
		IParser parser = EntityContextParserProvider.getParser(
				EntityContextElementTypes.HolderMemory_3001,
				view.getElement() != null ? view.getElement() : view,
				EntityContextVisualIDRegistry
						.getType(HolderMemoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLogicMemory_3002Text(View view) {
		IParser parser = EntityContextParserProvider.getParser(
				EntityContextElementTypes.LogicMemory_3002,
				view.getElement() != null ? view.getElement() : view,
				EntityContextVisualIDRegistry
						.getType(LogicMemoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTimeMemory_3003Text(View view) {
		IParser parser = EntityContextParserProvider.getParser(
				EntityContextElementTypes.TimeMemory_3003,
				view.getElement() != null ? view.getElement() : view,
				EntityContextVisualIDRegistry
						.getType(TimeMemoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStackMemory_3004Text(View view) {
		IParser parser = EntityContextParserProvider.getParser(
				EntityContextElementTypes.StackMemory_3004,
				view.getElement() != null ? view.getElement() : view,
				EntityContextVisualIDRegistry
						.getType(StackMemoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDictionaryMemory_3005Text(View view) {
		IParser parser = EntityContextParserProvider.getParser(
				EntityContextElementTypes.DictionaryMemory_3005, view
						.getElement() != null ? view.getElement() : view,
				EntityContextVisualIDRegistry
						.getType(DictionaryMemoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContextSituation_3006Text(View view) {
		IParser parser = EntityContextParserProvider.getParser(
				EntityContextElementTypes.ContextSituation_3006, view
						.getElement() != null ? view.getElement() : view,
				EntityContextVisualIDRegistry
						.getType(ContextSituationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMemoryContextCondition_3007Text(View view) {
		IParser parser = EntityContextParserProvider
				.getParser(
						EntityContextElementTypes.MemoryContextCondition_3007,
						view.getElement() != null ? view.getElement() : view,
						EntityContextVisualIDRegistry
								.getType(MemoryContextConditionExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSensingContextCondition_3008Text(View view) {
		IParser parser = EntityContextParserProvider
				.getParser(
						EntityContextElementTypes.SensingContextCondition_3008,
						view.getElement() != null ? view.getElement() : view,
						EntityContextVisualIDRegistry
								.getType(SensingContextConditionInformationflowEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContextAction_3009Text(View view) {
		IParser parser = EntityContextParserProvider.getParser(
				EntityContextElementTypes.ContextAction_3009,
				view.getElement() != null ? view.getElement() : view,
				EntityContextVisualIDRegistry
						.getType(ContextActionExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariableDataDefinition_3010Text(View view) {
		IParser parser = EntityContextParserProvider
				.getParser(
						EntityContextElementTypes.VariableDataDefinition_3010,
						view.getElement() != null ? view.getElement() : view,
						EntityContextVisualIDRegistry
								.getType(VariableDataDefinitionNameDefinitionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityContextDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
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
		return SystemContextEditPart.MODEL_ID
				.equals(EntityContextVisualIDRegistry.getModelID(view));
	}

}
