package tamm.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import tamm.diagram.edit.parts.AndJoinEditPart;
import tamm.diagram.edit.parts.AndSplitEditPart;
import tamm.diagram.edit.parts.ContextAwareSystemEditPart;
import tamm.diagram.edit.parts.FinalConditionEditPart;
import tamm.diagram.edit.parts.InitialConditionEditPart;
import tamm.diagram.edit.parts.InputConditionToJoinTaskEditPart;
import tamm.diagram.edit.parts.InputConditionToSplitTaskEditPart;
import tamm.diagram.edit.parts.JoinTaskToOutputConditionEditPart;
import tamm.diagram.edit.parts.OrJoinEditPart;
import tamm.diagram.edit.parts.OrSplitEditPart;
import tamm.diagram.edit.parts.PostConditionEditPart;
import tamm.diagram.edit.parts.PreConditionEditPart;
import tamm.diagram.edit.parts.PreConditionToSystemTaskEditPart;
import tamm.diagram.edit.parts.SimpleTaskEditPart;
import tamm.diagram.edit.parts.SkipTaskEditPart;
import tamm.diagram.edit.parts.SplitTaskToOutputConditionEditPart;
import tamm.diagram.edit.parts.SystemTaskToPostConditionEditPart;
import tamm.diagram.part.Messages;
import tamm.diagram.part.TaskVisualIDRegistry;

/**
 * @generated
 */
public class TaskNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public TaskNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<TaskNavigatorItem> result = new ArrayList<TaskNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							ContextAwareSystemEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof TaskNavigatorGroup) {
			TaskNavigatorGroup group = (TaskNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof TaskNavigatorItem) {
			TaskNavigatorItem navigatorItem = (TaskNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (TaskVisualIDRegistry.getVisualID(view)) {

		case ContextAwareSystemEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			TaskNavigatorGroup links = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_ContextAwareSystem_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(AndSplitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PreConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PostConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(SkipTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(FinalConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(AndJoinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InitialConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(SimpleTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(OrSplitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(OrJoinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InputConditionToJoinTaskEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InputConditionToSplitTaskEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(JoinTaskToOutputConditionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(SplitTaskToOutputConditionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PreConditionToSystemTaskEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(SystemTaskToPostConditionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case AndSplitEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Node sv = (Node) view;
			TaskNavigatorGroup incominglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_AndSplit_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup outgoinglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_AndSplit_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InputConditionToSplitTaskEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(SplitTaskToOutputConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PreConditionEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Node sv = (Node) view;
			TaskNavigatorGroup incominglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_PreCondition_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup outgoinglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_PreCondition_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(JoinTaskToOutputConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(SplitTaskToOutputConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PreConditionToSystemTaskEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PostConditionEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Node sv = (Node) view;
			TaskNavigatorGroup outgoinglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_PostCondition_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup incominglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_PostCondition_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InputConditionToJoinTaskEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InputConditionToSplitTaskEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(SystemTaskToPostConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SkipTaskEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Node sv = (Node) view;
			TaskNavigatorGroup incominglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_SkipTask_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup outgoinglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_SkipTask_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PreConditionToSystemTaskEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(SystemTaskToPostConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FinalConditionEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Node sv = (Node) view;
			TaskNavigatorGroup incominglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_FinalCondition_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(JoinTaskToOutputConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(SplitTaskToOutputConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case AndJoinEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Node sv = (Node) view;
			TaskNavigatorGroup incominglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_AndJoin_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup outgoinglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_AndJoin_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InputConditionToJoinTaskEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(JoinTaskToOutputConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InitialConditionEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Node sv = (Node) view;
			TaskNavigatorGroup outgoinglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_InitialCondition_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InputConditionToJoinTaskEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InputConditionToSplitTaskEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleTaskEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Node sv = (Node) view;
			TaskNavigatorGroup incominglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_SimpleTask_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup outgoinglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_SimpleTask_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PreConditionToSystemTaskEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(SystemTaskToPostConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OrSplitEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Node sv = (Node) view;
			TaskNavigatorGroup incominglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_OrSplit_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup outgoinglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_OrSplit_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InputConditionToSplitTaskEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(SplitTaskToOutputConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OrJoinEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Node sv = (Node) view;
			TaskNavigatorGroup incominglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_OrJoin_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup outgoinglinks = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_OrJoin_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InputConditionToJoinTaskEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(JoinTaskToOutputConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InputConditionToJoinTaskEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TaskNavigatorGroup target = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_InputConditionToJoinTask_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup source = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_InputConditionToJoinTask_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(AndJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(OrJoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PostConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InitialConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InputConditionToSplitTaskEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TaskNavigatorGroup target = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_InputConditionToSplitTask_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup source = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_InputConditionToSplitTask_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(AndSplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(OrSplitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PostConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(InitialConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case JoinTaskToOutputConditionEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TaskNavigatorGroup target = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_JoinTaskToOutputCondition_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup source = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_JoinTaskToOutputCondition_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PreConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(FinalConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(AndJoinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(OrJoinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SplitTaskToOutputConditionEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TaskNavigatorGroup target = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_SplitTaskToOutputCondition_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup source = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_SplitTaskToOutputCondition_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PreConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(FinalConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(AndSplitEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(OrSplitEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PreConditionToSystemTaskEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TaskNavigatorGroup target = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_PreConditionToSystemTask_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup source = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_PreConditionToSystemTask_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(SkipTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(SimpleTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PreConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SystemTaskToPostConditionEditPart.VISUAL_ID: {
			LinkedList<TaskAbstractNavigatorItem> result = new LinkedList<TaskAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TaskNavigatorGroup target = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_SystemTaskToPostCondition_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TaskNavigatorGroup source = new TaskNavigatorGroup(
					Messages.NavigatorGroupName_SystemTaskToPostCondition_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TaskVisualIDRegistry
							.getType(PostConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(SkipTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TaskVisualIDRegistry.getType(SimpleTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ContextAwareSystemEditPart.MODEL_ID.equals(TaskVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<TaskNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<TaskNavigatorItem> result = new ArrayList<TaskNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new TaskNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof TaskAbstractNavigatorItem) {
			TaskAbstractNavigatorItem abstractNavigatorItem = (TaskAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
