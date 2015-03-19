package tamm.diagram.navigator;

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

import tamm.AndJoin;
import tamm.AndSplit;
import tamm.ContextAwareSystem;
import tamm.OrJoin;
import tamm.OrSplit;
import tamm.SkipTask;
import tamm.diagram.edit.parts.AndJoinEditPart;
import tamm.diagram.edit.parts.AndSplitEditPart;
import tamm.diagram.edit.parts.ContextAwareSystemEditPart;
import tamm.diagram.edit.parts.FinalConditionEditPart;
import tamm.diagram.edit.parts.FinalConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.InitialConditionEditPart;
import tamm.diagram.edit.parts.InitialConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.InputConditionToJoinTaskEditPart;
import tamm.diagram.edit.parts.InputConditionToSplitTaskEditPart;
import tamm.diagram.edit.parts.JoinTaskToOutputConditionEditPart;
import tamm.diagram.edit.parts.OrJoinEditPart;
import tamm.diagram.edit.parts.OrSplitEditPart;
import tamm.diagram.edit.parts.PostConditionEditPart;
import tamm.diagram.edit.parts.PostConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionEditPart;
import tamm.diagram.edit.parts.PreConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionToSystemTaskEditPart;
import tamm.diagram.edit.parts.SimpleTaskEditPart;
import tamm.diagram.edit.parts.SimpleTaskNameEditPart;
import tamm.diagram.edit.parts.SkipTaskEditPart;
import tamm.diagram.edit.parts.SplitTaskToOutputConditionEditPart;
import tamm.diagram.edit.parts.SystemTaskToPostConditionEditPart;
import tamm.diagram.part.TaskDiagramEditorPlugin;
import tamm.diagram.part.TaskVisualIDRegistry;
import tamm.diagram.providers.TaskElementTypes;
import tamm.diagram.providers.TaskParserProvider;

/**
 * @generated
 */
public class TaskNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TaskDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TaskDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TaskNavigatorItem
				&& !isOwnView(((TaskNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof TaskNavigatorGroup) {
			TaskNavigatorGroup group = (TaskNavigatorGroup) element;
			return TaskDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof TaskNavigatorItem) {
			TaskNavigatorItem navigatorItem = (TaskNavigatorItem) element;
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
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case ContextAwareSystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tesoriero.org/cauce/task/1.0?ContextAwareSystem", TaskElementTypes.ContextAwareSystem_1000); //$NON-NLS-1$
		case AndSplitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/task/1.0?AndSplit", TaskElementTypes.AndSplit_2001); //$NON-NLS-1$
		case PreConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/task/1.0?PreCondition", TaskElementTypes.PreCondition_2002); //$NON-NLS-1$
		case PostConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/task/1.0?PostCondition", TaskElementTypes.PostCondition_2003); //$NON-NLS-1$
		case SkipTaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/task/1.0?SkipTask", TaskElementTypes.SkipTask_2004); //$NON-NLS-1$
		case FinalConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/task/1.0?FinalCondition", TaskElementTypes.FinalCondition_2005); //$NON-NLS-1$
		case AndJoinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/task/1.0?AndJoin", TaskElementTypes.AndJoin_2006); //$NON-NLS-1$
		case InitialConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/task/1.0?InitialCondition", TaskElementTypes.InitialCondition_2007); //$NON-NLS-1$
		case SimpleTaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/task/1.0?SimpleTask", TaskElementTypes.SimpleTask_2008); //$NON-NLS-1$
		case OrSplitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/task/1.0?OrSplit", TaskElementTypes.OrSplit_2009); //$NON-NLS-1$
		case OrJoinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/task/1.0?OrJoin", TaskElementTypes.OrJoin_2010); //$NON-NLS-1$
		case InputConditionToJoinTaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/task/1.0?InputConditionToJoinTask", TaskElementTypes.InputConditionToJoinTask_4001); //$NON-NLS-1$
		case InputConditionToSplitTaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/task/1.0?InputConditionToSplitTask", TaskElementTypes.InputConditionToSplitTask_4002); //$NON-NLS-1$
		case JoinTaskToOutputConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/task/1.0?JoinTaskToOutputCondition", TaskElementTypes.JoinTaskToOutputCondition_4003); //$NON-NLS-1$
		case SplitTaskToOutputConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/task/1.0?SplitTaskToOutputCondition", TaskElementTypes.SplitTaskToOutputCondition_4004); //$NON-NLS-1$
		case PreConditionToSystemTaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/task/1.0?PreConditionToSystemTask", TaskElementTypes.PreConditionToSystemTask_4005); //$NON-NLS-1$
		case SystemTaskToPostConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/task/1.0?SystemTaskToPostCondition", TaskElementTypes.SystemTaskToPostCondition_4006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TaskDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& TaskElementTypes.isKnownElementType(elementType)) {
			image = TaskElementTypes.getImage(elementType);
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
		if (element instanceof TaskNavigatorGroup) {
			TaskNavigatorGroup group = (TaskNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TaskNavigatorItem) {
			TaskNavigatorItem navigatorItem = (TaskNavigatorItem) element;
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
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case ContextAwareSystemEditPart.VISUAL_ID:
			return getContextAwareSystem_1000Text(view);
		case AndSplitEditPart.VISUAL_ID:
			return getAndSplit_2001Text(view);
		case PreConditionEditPart.VISUAL_ID:
			return getPreCondition_2002Text(view);
		case PostConditionEditPart.VISUAL_ID:
			return getPostCondition_2003Text(view);
		case SkipTaskEditPart.VISUAL_ID:
			return getSkipTask_2004Text(view);
		case FinalConditionEditPart.VISUAL_ID:
			return getFinalCondition_2005Text(view);
		case AndJoinEditPart.VISUAL_ID:
			return getAndJoin_2006Text(view);
		case InitialConditionEditPart.VISUAL_ID:
			return getInitialCondition_2007Text(view);
		case SimpleTaskEditPart.VISUAL_ID:
			return getSimpleTask_2008Text(view);
		case OrSplitEditPart.VISUAL_ID:
			return getOrSplit_2009Text(view);
		case OrJoinEditPart.VISUAL_ID:
			return getOrJoin_2010Text(view);
		case InputConditionToJoinTaskEditPart.VISUAL_ID:
			return getInputConditionToJoinTask_4001Text(view);
		case InputConditionToSplitTaskEditPart.VISUAL_ID:
			return getInputConditionToSplitTask_4002Text(view);
		case JoinTaskToOutputConditionEditPart.VISUAL_ID:
			return getJoinTaskToOutputCondition_4003Text(view);
		case SplitTaskToOutputConditionEditPart.VISUAL_ID:
			return getSplitTaskToOutputCondition_4004Text(view);
		case PreConditionToSystemTaskEditPart.VISUAL_ID:
			return getPreConditionToSystemTask_4005Text(view);
		case SystemTaskToPostConditionEditPart.VISUAL_ID:
			return getSystemTaskToPostCondition_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getContextAwareSystem_1000Text(View view) {
		ContextAwareSystem domainModelElement = (ContextAwareSystem) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAndSplit_2001Text(View view) {
		AndSplit domainModelElement = (AndSplit) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPreCondition_2002Text(View view) {
		IParser parser = TaskParserProvider
				.getParser(
						TaskElementTypes.PreCondition_2002,
						view.getElement() != null ? view.getElement() : view,
						TaskVisualIDRegistry
								.getType(PreConditionSocialExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPostCondition_2003Text(View view) {
		IParser parser = TaskParserProvider
				.getParser(
						TaskElementTypes.PostCondition_2003,
						view.getElement() != null ? view.getElement() : view,
						TaskVisualIDRegistry
								.getType(PostConditionSocialExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSkipTask_2004Text(View view) {
		SkipTask domainModelElement = (SkipTask) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFinalCondition_2005Text(View view) {
		IParser parser = TaskParserProvider
				.getParser(
						TaskElementTypes.FinalCondition_2005,
						view.getElement() != null ? view.getElement() : view,
						TaskVisualIDRegistry
								.getType(FinalConditionSocialExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAndJoin_2006Text(View view) {
		AndJoin domainModelElement = (AndJoin) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialCondition_2007Text(View view) {
		IParser parser = TaskParserProvider
				.getParser(
						TaskElementTypes.InitialCondition_2007,
						view.getElement() != null ? view.getElement() : view,
						TaskVisualIDRegistry
								.getType(InitialConditionSocialExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleTask_2008Text(View view) {
		IParser parser = TaskParserProvider.getParser(
				TaskElementTypes.SimpleTask_2008,
				view.getElement() != null ? view.getElement() : view,
				TaskVisualIDRegistry.getType(SimpleTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOrSplit_2009Text(View view) {
		OrSplit domainModelElement = (OrSplit) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOrJoin_2010Text(View view) {
		OrJoin domainModelElement = (OrJoin) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			TaskDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputConditionToJoinTask_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getInputConditionToSplitTask_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getJoinTaskToOutputCondition_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSplitTaskToOutputCondition_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPreConditionToSystemTask_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSystemTaskToPostCondition_4006Text(View view) {
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
		return ContextAwareSystemEditPart.MODEL_ID.equals(TaskVisualIDRegistry
				.getModelID(view));
	}

}
