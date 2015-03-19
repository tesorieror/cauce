package ifmm.diagram.navigator;

import ifmm.diagram.edit.parts.BroadcastInformationFlowBOutputDataEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.edit.parts.ContextAwareEntityEditPart;
import ifmm.diagram.edit.parts.EntityToBroadcastInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.EntityToPointToPointInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.InputDataEditPart;
import ifmm.diagram.edit.parts.OutputData2EditPart;
import ifmm.diagram.edit.parts.OutputDataEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowP2PInputDataEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowP2POutputDataEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.edit.parts.SystemInformaitonFlowEditPart;
import ifmm.diagram.part.InformationFlowVisualIDRegistry;
import ifmm.diagram.part.Messages;

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

/**
 * @generated
 */
public class InformationFlowNavigatorContentProvider implements
		ICommonContentProvider {

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
	public InformationFlowNavigatorContentProvider() {
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
			ArrayList<InformationFlowNavigatorItem> result = new ArrayList<InformationFlowNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							SystemInformaitonFlowEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof InformationFlowNavigatorGroup) {
			InformationFlowNavigatorGroup group = (InformationFlowNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof InformationFlowNavigatorItem) {
			InformationFlowNavigatorItem navigatorItem = (InformationFlowNavigatorItem) parentElement;
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
		switch (InformationFlowVisualIDRegistry.getVisualID(view)) {

		case SystemInformaitonFlowEditPart.VISUAL_ID: {
			LinkedList<InformationFlowAbstractNavigatorItem> result = new LinkedList<InformationFlowAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			InformationFlowNavigatorGroup links = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_SystemInformaitonFlow_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(BroadcastInformationFlowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(PointToPointInformationFlowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(ContextAwareEntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case BroadcastInformationFlowEditPart.VISUAL_ID: {
			LinkedList<InformationFlowAbstractNavigatorItem> result = new LinkedList<InformationFlowAbstractNavigatorItem>();
			Node sv = (Node) view;
			InformationFlowNavigatorGroup outgoinglinks = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_BroadcastInformationFlow_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			InformationFlowNavigatorGroup incominglinks = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_BroadcastInformationFlow_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(BroadcastInformationFlowBOutputDataEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					InformationFlowVisualIDRegistry
							.getType(OutputDataEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID));
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

		case PointToPointInformationFlowEditPart.VISUAL_ID: {
			LinkedList<InformationFlowAbstractNavigatorItem> result = new LinkedList<InformationFlowAbstractNavigatorItem>();
			Node sv = (Node) view;
			InformationFlowNavigatorGroup incominglinks = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_PointToPointInformationFlow_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			InformationFlowNavigatorGroup outgoinglinks = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_PointToPointInformationFlow_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(PointToPointInformationFlowP2POutputDataEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					InformationFlowVisualIDRegistry
							.getType(OutputData2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(PointToPointInformationFlowP2PInputDataEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					InformationFlowVisualIDRegistry
							.getType(InputDataEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID));
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

		case ContextAwareEntityEditPart.VISUAL_ID: {
			LinkedList<InformationFlowAbstractNavigatorItem> result = new LinkedList<InformationFlowAbstractNavigatorItem>();
			Node sv = (Node) view;
			InformationFlowNavigatorGroup incominglinks = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_ContextAwareEntity_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			InformationFlowNavigatorGroup outgoinglinks = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_ContextAwareEntity_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID: {
			LinkedList<InformationFlowAbstractNavigatorItem> result = new LinkedList<InformationFlowAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			InformationFlowNavigatorGroup target = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_BroadcastInformationFlowToEntityEdge_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			InformationFlowNavigatorGroup source = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_BroadcastInformationFlowToEntityEdge_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(ContextAwareEntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(BroadcastInformationFlowEditPart.VISUAL_ID));
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

		case EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID: {
			LinkedList<InformationFlowAbstractNavigatorItem> result = new LinkedList<InformationFlowAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			InformationFlowNavigatorGroup target = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_EntityToBroadcastInformationFlowEdge_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			InformationFlowNavigatorGroup source = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_EntityToBroadcastInformationFlowEdge_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(BroadcastInformationFlowEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(ContextAwareEntityEditPart.VISUAL_ID));
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

		case EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID: {
			LinkedList<InformationFlowAbstractNavigatorItem> result = new LinkedList<InformationFlowAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			InformationFlowNavigatorGroup target = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_EntityToPointToPointInformationFlowEdge_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			InformationFlowNavigatorGroup source = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_EntityToPointToPointInformationFlowEdge_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(PointToPointInformationFlowEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(ContextAwareEntityEditPart.VISUAL_ID));
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

		case PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID: {
			LinkedList<InformationFlowAbstractNavigatorItem> result = new LinkedList<InformationFlowAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			InformationFlowNavigatorGroup target = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_PointToPointInformationFlowToEntityEdge_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			InformationFlowNavigatorGroup source = new InformationFlowNavigatorGroup(
					Messages.NavigatorGroupName_PointToPointInformationFlowToEntityEdge_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(ContextAwareEntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					InformationFlowVisualIDRegistry
							.getType(PointToPointInformationFlowEditPart.VISUAL_ID));
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
		return SystemInformaitonFlowEditPart.MODEL_ID
				.equals(InformationFlowVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<InformationFlowNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<InformationFlowNavigatorItem> result = new ArrayList<InformationFlowNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new InformationFlowNavigatorItem(nextView, parent,
					isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof InformationFlowAbstractNavigatorItem) {
			InformationFlowAbstractNavigatorItem abstractNavigatorItem = (InformationFlowAbstractNavigatorItem) element;
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
