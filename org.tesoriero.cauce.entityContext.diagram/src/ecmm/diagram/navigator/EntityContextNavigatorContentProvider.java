package ecmm.diagram.navigator;

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

import ecmm.diagram.edit.parts.ContextActionEditPart;
import ecmm.diagram.edit.parts.ContextSituationActionsEditPart;
import ecmm.diagram.edit.parts.ContextSituationConditionsEditPart;
import ecmm.diagram.edit.parts.ContextSituationEditPart;
import ecmm.diagram.edit.parts.ContextSituationSensingEditPart;
import ecmm.diagram.edit.parts.DictionaryMemoryEditPart;
import ecmm.diagram.edit.parts.EntityContextDefinitionsEditPart;
import ecmm.diagram.edit.parts.EntityContextEditPart;
import ecmm.diagram.edit.parts.EntityContextSituationsEditPart;
import ecmm.diagram.edit.parts.EntityContextStateEditPart;
import ecmm.diagram.edit.parts.HolderMemoryEditPart;
import ecmm.diagram.edit.parts.LogicMemoryEditPart;
import ecmm.diagram.edit.parts.MemoryContextConditionEditPart;
import ecmm.diagram.edit.parts.SensingContextConditionEditPart;
import ecmm.diagram.edit.parts.StackMemoryEditPart;
import ecmm.diagram.edit.parts.SystemContextEditPart;
import ecmm.diagram.edit.parts.TimeMemoryEditPart;
import ecmm.diagram.edit.parts.VariableDataDefinitionEditPart;
import ecmm.diagram.part.EntityContextVisualIDRegistry;

/**
 * @generated
 */
public class EntityContextNavigatorContentProvider implements
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
	public EntityContextNavigatorContentProvider() {
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
			ArrayList<EntityContextNavigatorItem> result = new ArrayList<EntityContextNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, SystemContextEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof EntityContextNavigatorGroup) {
			EntityContextNavigatorGroup group = (EntityContextNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof EntityContextNavigatorItem) {
			EntityContextNavigatorItem navigatorItem = (EntityContextNavigatorItem) parentElement;
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
		switch (EntityContextVisualIDRegistry.getVisualID(view)) {

		case SystemContextEditPart.VISUAL_ID: {
			LinkedList<EntityContextAbstractNavigatorItem> result = new LinkedList<EntityContextAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityContextVisualIDRegistry
							.getType(EntityContextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EntityContextEditPart.VISUAL_ID: {
			LinkedList<EntityContextAbstractNavigatorItem> result = new LinkedList<EntityContextAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityContextVisualIDRegistry
							.getType(EntityContextStateEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EntityContextVisualIDRegistry
							.getType(HolderMemoryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityContextVisualIDRegistry
							.getType(EntityContextStateEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EntityContextVisualIDRegistry
							.getType(LogicMemoryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityContextVisualIDRegistry
							.getType(EntityContextStateEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EntityContextVisualIDRegistry
							.getType(TimeMemoryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityContextVisualIDRegistry
							.getType(EntityContextStateEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EntityContextVisualIDRegistry
							.getType(StackMemoryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityContextVisualIDRegistry
							.getType(EntityContextStateEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EntityContextVisualIDRegistry
							.getType(DictionaryMemoryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityContextVisualIDRegistry
							.getType(EntityContextSituationsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EntityContextVisualIDRegistry
							.getType(ContextSituationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EntityContextVisualIDRegistry
							.getType(EntityContextDefinitionsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EntityContextVisualIDRegistry
							.getType(VariableDataDefinitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ContextSituationEditPart.VISUAL_ID: {
			LinkedList<EntityContextAbstractNavigatorItem> result = new LinkedList<EntityContextAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EntityContextVisualIDRegistry
							.getType(ContextSituationConditionsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EntityContextVisualIDRegistry
							.getType(MemoryContextConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityContextVisualIDRegistry
							.getType(ContextSituationSensingEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EntityContextVisualIDRegistry
							.getType(SensingContextConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityContextVisualIDRegistry
							.getType(ContextSituationActionsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EntityContextVisualIDRegistry
							.getType(ContextActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
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
		return SystemContextEditPart.MODEL_ID
				.equals(EntityContextVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<EntityContextNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<EntityContextNavigatorItem> result = new ArrayList<EntityContextNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new EntityContextNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof EntityContextAbstractNavigatorItem) {
			EntityContextAbstractNavigatorItem abstractNavigatorItem = (EntityContextAbstractNavigatorItem) element;
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
