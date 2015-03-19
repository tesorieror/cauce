package spmm.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import spmm.Contention;
import spmm.Generalization;
import spmm.Grouping;
import spmm.PhysicalSpace;
import spmm.Space;
import spmm.SpmmPackage;
import spmm.Universe;
import spmm.VirtualSpace;
import spmm.diagram.edit.parts.ContentionEditPart;
import spmm.diagram.edit.parts.GeneralizationEditPart;
import spmm.diagram.edit.parts.GroupingEditPart;
import spmm.diagram.edit.parts.PhysicalSpaceEditPart;
import spmm.diagram.edit.parts.UniverseEditPart;
import spmm.diagram.edit.parts.VirtualSpaceEditPart;
import spmm.diagram.providers.SpaceElementTypes;

/**
 * @generated
 */
public class SpaceDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SpaceNodeDescriptor> getSemanticChildren(View view) {
		switch (SpaceVisualIDRegistry.getVisualID(view)) {
		case UniverseEditPart.VISUAL_ID:
			return getUniverse_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceNodeDescriptor> getUniverse_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Universe modelElement = (Universe) view.getElement();
		LinkedList<SpaceNodeDescriptor> result = new LinkedList<SpaceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPhysicalSpaces().iterator(); it
				.hasNext();) {
			PhysicalSpace childElement = (PhysicalSpace) it.next();
			int visualID = SpaceVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PhysicalSpaceEditPart.VISUAL_ID) {
				result.add(new SpaceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getVirtualSpaces().iterator(); it
				.hasNext();) {
			VirtualSpace childElement = (VirtualSpace) it.next();
			int visualID = SpaceVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == VirtualSpaceEditPart.VISUAL_ID) {
				result.add(new SpaceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getContainedLinks(View view) {
		switch (SpaceVisualIDRegistry.getVisualID(view)) {
		case UniverseEditPart.VISUAL_ID:
			return getUniverse_1000ContainedLinks(view);
		case PhysicalSpaceEditPart.VISUAL_ID:
			return getPhysicalSpace_2001ContainedLinks(view);
		case VirtualSpaceEditPart.VISUAL_ID:
			return getVirtualSpace_2002ContainedLinks(view);
		case GroupingEditPart.VISUAL_ID:
			return getGrouping_4001ContainedLinks(view);
		case ContentionEditPart.VISUAL_ID:
			return getContention_4002ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getIncomingLinks(View view) {
		switch (SpaceVisualIDRegistry.getVisualID(view)) {
		case PhysicalSpaceEditPart.VISUAL_ID:
			return getPhysicalSpace_2001IncomingLinks(view);
		case VirtualSpaceEditPart.VISUAL_ID:
			return getVirtualSpace_2002IncomingLinks(view);
		case GroupingEditPart.VISUAL_ID:
			return getGrouping_4001IncomingLinks(view);
		case ContentionEditPart.VISUAL_ID:
			return getContention_4002IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getOutgoingLinks(View view) {
		switch (SpaceVisualIDRegistry.getVisualID(view)) {
		case PhysicalSpaceEditPart.VISUAL_ID:
			return getPhysicalSpace_2001OutgoingLinks(view);
		case VirtualSpaceEditPart.VISUAL_ID:
			return getVirtualSpace_2002OutgoingLinks(view);
		case GroupingEditPart.VISUAL_ID:
			return getGrouping_4001OutgoingLinks(view);
		case ContentionEditPart.VISUAL_ID:
			return getContention_4002OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getUniverse_1000ContainedLinks(
			View view) {
		Universe modelElement = (Universe) view.getElement();
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Grouping_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Contention_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getPhysicalSpace_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getVirtualSpace_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getGrouping_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getContention_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getGeneralization_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getPhysicalSpace_2001IncomingLinks(
			View view) {
		PhysicalSpace modelElement = (PhysicalSpace) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Grouping_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contention_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getVirtualSpace_2002IncomingLinks(
			View view) {
		VirtualSpace modelElement = (VirtualSpace) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Grouping_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getGrouping_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getContention_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getGeneralization_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getPhysicalSpace_2001OutgoingLinks(
			View view) {
		PhysicalSpace modelElement = (PhysicalSpace) view.getElement();
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Contention_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getVirtualSpace_2002OutgoingLinks(
			View view) {
		VirtualSpace modelElement = (VirtualSpace) view.getElement();
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Grouping_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getGrouping_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getContention_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceLinkDescriptor> getGeneralization_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceLinkDescriptor> getContainedTypeModelFacetLinks_Grouping_4001(
			Universe container) {
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		for (Iterator<?> links = container.getGroupings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Grouping) {
				continue;
			}
			Grouping link = (Grouping) linkObject;
			if (GroupingEditPart.VISUAL_ID != SpaceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Space dst = link.getChild();
			VirtualSpace src = link.getParent();
			result.add(new SpaceLinkDescriptor(src, dst, link,
					SpaceElementTypes.Grouping_4001, GroupingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceLinkDescriptor> getContainedTypeModelFacetLinks_Contention_4002(
			Universe container) {
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		for (Iterator<?> links = container.getContentions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Contention) {
				continue;
			}
			Contention link = (Contention) linkObject;
			if (ContentionEditPart.VISUAL_ID != SpaceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PhysicalSpace dst = link.getChild();
			PhysicalSpace src = link.getParent();
			result.add(new SpaceLinkDescriptor(src, dst, link,
					SpaceElementTypes.Contention_4002,
					ContentionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceLinkDescriptor> getContainedTypeModelFacetLinks_Generalization_4003(
			Universe container) {
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		for (Iterator<?> links = container.getGeneralizations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != SpaceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Space dst = link.getGeneralizes();
			VirtualSpace src = link.getParent();
			result.add(new SpaceLinkDescriptor(src, dst, link,
					SpaceElementTypes.Generalization_4003,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceLinkDescriptor> getIncomingTypeModelFacetLinks_Grouping_4001(
			Space target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SpmmPackage.eINSTANCE
					.getGrouping_Child()
					|| false == setting.getEObject() instanceof Grouping) {
				continue;
			}
			Grouping link = (Grouping) setting.getEObject();
			if (GroupingEditPart.VISUAL_ID != SpaceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			VirtualSpace src = link.getParent();
			result.add(new SpaceLinkDescriptor(src, target, link,
					SpaceElementTypes.Grouping_4001, GroupingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceLinkDescriptor> getIncomingTypeModelFacetLinks_Contention_4002(
			PhysicalSpace target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SpmmPackage.eINSTANCE
					.getContention_Child()
					|| false == setting.getEObject() instanceof Contention) {
				continue;
			}
			Contention link = (Contention) setting.getEObject();
			if (ContentionEditPart.VISUAL_ID != SpaceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PhysicalSpace src = link.getParent();
			result.add(new SpaceLinkDescriptor(src, target, link,
					SpaceElementTypes.Contention_4002,
					ContentionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceLinkDescriptor> getIncomingTypeModelFacetLinks_Generalization_4003(
			Space target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SpmmPackage.eINSTANCE
					.getGeneralization_Generalizes()
					|| false == setting.getEObject() instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) setting.getEObject();
			if (GeneralizationEditPart.VISUAL_ID != SpaceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			VirtualSpace src = link.getParent();
			result.add(new SpaceLinkDescriptor(src, target, link,
					SpaceElementTypes.Generalization_4003,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceLinkDescriptor> getOutgoingTypeModelFacetLinks_Grouping_4001(
			VirtualSpace source) {
		Universe container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Universe) {
				container = (Universe) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		for (Iterator<?> links = container.getGroupings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Grouping) {
				continue;
			}
			Grouping link = (Grouping) linkObject;
			if (GroupingEditPart.VISUAL_ID != SpaceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Space dst = link.getChild();
			VirtualSpace src = link.getParent();
			if (src != source) {
				continue;
			}
			result.add(new SpaceLinkDescriptor(src, dst, link,
					SpaceElementTypes.Grouping_4001, GroupingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceLinkDescriptor> getOutgoingTypeModelFacetLinks_Contention_4002(
			PhysicalSpace source) {
		Universe container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Universe) {
				container = (Universe) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		for (Iterator<?> links = container.getContentions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Contention) {
				continue;
			}
			Contention link = (Contention) linkObject;
			if (ContentionEditPart.VISUAL_ID != SpaceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PhysicalSpace dst = link.getChild();
			PhysicalSpace src = link.getParent();
			if (src != source) {
				continue;
			}
			result.add(new SpaceLinkDescriptor(src, dst, link,
					SpaceElementTypes.Contention_4002,
					ContentionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceLinkDescriptor> getOutgoingTypeModelFacetLinks_Generalization_4003(
			VirtualSpace source) {
		Universe container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Universe) {
				container = (Universe) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SpaceLinkDescriptor> result = new LinkedList<SpaceLinkDescriptor>();
		for (Iterator<?> links = container.getGeneralizations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != SpaceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Space dst = link.getGeneralizes();
			VirtualSpace src = link.getParent();
			if (src != source) {
				continue;
			}
			result.add(new SpaceLinkDescriptor(src, dst, link,
					SpaceElementTypes.Generalization_4003,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<SpaceNodeDescriptor> getSemanticChildren(View view) {
			return SpaceDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SpaceLinkDescriptor> getContainedLinks(View view) {
			return SpaceDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SpaceLinkDescriptor> getIncomingLinks(View view) {
			return SpaceDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SpaceLinkDescriptor> getOutgoingLinks(View view) {
			return SpaceDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
