package rsmm.diagram.part;

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

import rsmm.ContextAwareEntityReference;
import rsmm.ReferentialSpace;
import rsmm.RsmmPackage;
import rsmm.SpaceToEntityReferenceDependency;
import rsmm.SpaceToSpaceReferenceDependency;
import rsmm.SystemInformationFlowReferenceSpace;
import rsmm.diagram.edit.parts.ContextAwareEntityReferenceEditPart;
import rsmm.diagram.edit.parts.ReferentialSpaceEditPart;
import rsmm.diagram.edit.parts.SpaceToEntityReferenceDependencyEditPart;
import rsmm.diagram.edit.parts.SpaceToSpaceReferenceDependencyEditPart;
import rsmm.diagram.edit.parts.SystemInformationFlowReferenceSpaceEditPart;
import rsmm.diagram.providers.SpaceReferenceElementTypes;

/**
 * @generated
 */
public class SpaceReferenceDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SpaceReferenceNodeDescriptor> getSemanticChildren(
			View view) {
		switch (SpaceReferenceVisualIDRegistry.getVisualID(view)) {
		case SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID:
			return getSystemInformationFlowReferenceSpace_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceNodeDescriptor> getSystemInformationFlowReferenceSpace_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SystemInformationFlowReferenceSpace modelElement = (SystemInformationFlowReferenceSpace) view
				.getElement();
		LinkedList<SpaceReferenceNodeDescriptor> result = new LinkedList<SpaceReferenceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntityReferences().iterator(); it
				.hasNext();) {
			ContextAwareEntityReference childElement = (ContextAwareEntityReference) it
					.next();
			int visualID = SpaceReferenceVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContextAwareEntityReferenceEditPart.VISUAL_ID) {
				result.add(new SpaceReferenceNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getReferentialSpaces().iterator(); it
				.hasNext();) {
			ReferentialSpace childElement = (ReferentialSpace) it.next();
			int visualID = SpaceReferenceVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ReferentialSpaceEditPart.VISUAL_ID) {
				result.add(new SpaceReferenceNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getContainedLinks(View view) {
		switch (SpaceReferenceVisualIDRegistry.getVisualID(view)) {
		case SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID:
			return getSystemInformationFlowReferenceSpace_1000ContainedLinks(view);
		case ContextAwareEntityReferenceEditPart.VISUAL_ID:
			return getContextAwareEntityReference_2001ContainedLinks(view);
		case ReferentialSpaceEditPart.VISUAL_ID:
			return getReferentialSpace_2002ContainedLinks(view);
		case SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID:
			return getSpaceToSpaceReferenceDependency_4001ContainedLinks(view);
		case SpaceToEntityReferenceDependencyEditPart.VISUAL_ID:
			return getSpaceToEntityReferenceDependency_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getIncomingLinks(View view) {
		switch (SpaceReferenceVisualIDRegistry.getVisualID(view)) {
		case ContextAwareEntityReferenceEditPart.VISUAL_ID:
			return getContextAwareEntityReference_2001IncomingLinks(view);
		case ReferentialSpaceEditPart.VISUAL_ID:
			return getReferentialSpace_2002IncomingLinks(view);
		case SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID:
			return getSpaceToSpaceReferenceDependency_4001IncomingLinks(view);
		case SpaceToEntityReferenceDependencyEditPart.VISUAL_ID:
			return getSpaceToEntityReferenceDependency_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getOutgoingLinks(View view) {
		switch (SpaceReferenceVisualIDRegistry.getVisualID(view)) {
		case ContextAwareEntityReferenceEditPart.VISUAL_ID:
			return getContextAwareEntityReference_2001OutgoingLinks(view);
		case ReferentialSpaceEditPart.VISUAL_ID:
			return getReferentialSpace_2002OutgoingLinks(view);
		case SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID:
			return getSpaceToSpaceReferenceDependency_4001OutgoingLinks(view);
		case SpaceToEntityReferenceDependencyEditPart.VISUAL_ID:
			return getSpaceToEntityReferenceDependency_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getSystemInformationFlowReferenceSpace_1000ContainedLinks(
			View view) {
		SystemInformationFlowReferenceSpace modelElement = (SystemInformationFlowReferenceSpace) view
				.getElement();
		LinkedList<SpaceReferenceLinkDescriptor> result = new LinkedList<SpaceReferenceLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SpaceToSpaceReferenceDependency_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SpaceToEntityReferenceDependency_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getContextAwareEntityReference_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getReferentialSpace_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getSpaceToSpaceReferenceDependency_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getSpaceToEntityReferenceDependency_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getContextAwareEntityReference_2001IncomingLinks(
			View view) {
		ContextAwareEntityReference modelElement = (ContextAwareEntityReference) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SpaceReferenceLinkDescriptor> result = new LinkedList<SpaceReferenceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SpaceToEntityReferenceDependency_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getReferentialSpace_2002IncomingLinks(
			View view) {
		ReferentialSpace modelElement = (ReferentialSpace) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SpaceReferenceLinkDescriptor> result = new LinkedList<SpaceReferenceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SpaceToSpaceReferenceDependency_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getSpaceToSpaceReferenceDependency_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getSpaceToEntityReferenceDependency_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getContextAwareEntityReference_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getReferentialSpace_2002OutgoingLinks(
			View view) {
		ReferentialSpace modelElement = (ReferentialSpace) view.getElement();
		LinkedList<SpaceReferenceLinkDescriptor> result = new LinkedList<SpaceReferenceLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SpaceToSpaceReferenceDependency_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SpaceToEntityReferenceDependency_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getSpaceToSpaceReferenceDependency_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SpaceReferenceLinkDescriptor> getSpaceToEntityReferenceDependency_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceReferenceLinkDescriptor> getContainedTypeModelFacetLinks_SpaceToSpaceReferenceDependency_4001(
			SystemInformationFlowReferenceSpace container) {
		LinkedList<SpaceReferenceLinkDescriptor> result = new LinkedList<SpaceReferenceLinkDescriptor>();
		for (Iterator<?> links = container
				.getSpaceToSpaceReferenceDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SpaceToSpaceReferenceDependency) {
				continue;
			}
			SpaceToSpaceReferenceDependency link = (SpaceToSpaceReferenceDependency) linkObject;
			if (SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID != SpaceReferenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ReferentialSpace dst = link.getChild();
			ReferentialSpace src = link.getParent();
			result.add(new SpaceReferenceLinkDescriptor(
					src,
					dst,
					link,
					SpaceReferenceElementTypes.SpaceToSpaceReferenceDependency_4001,
					SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceReferenceLinkDescriptor> getContainedTypeModelFacetLinks_SpaceToEntityReferenceDependency_4002(
			SystemInformationFlowReferenceSpace container) {
		LinkedList<SpaceReferenceLinkDescriptor> result = new LinkedList<SpaceReferenceLinkDescriptor>();
		for (Iterator<?> links = container
				.getSpaceToEntityReferenceDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SpaceToEntityReferenceDependency) {
				continue;
			}
			SpaceToEntityReferenceDependency link = (SpaceToEntityReferenceDependency) linkObject;
			if (SpaceToEntityReferenceDependencyEditPart.VISUAL_ID != SpaceReferenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextAwareEntityReference dst = link.getChild();
			ReferentialSpace src = link.getParent();
			result.add(new SpaceReferenceLinkDescriptor(
					src,
					dst,
					link,
					SpaceReferenceElementTypes.SpaceToEntityReferenceDependency_4002,
					SpaceToEntityReferenceDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceReferenceLinkDescriptor> getIncomingTypeModelFacetLinks_SpaceToSpaceReferenceDependency_4001(
			ReferentialSpace target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SpaceReferenceLinkDescriptor> result = new LinkedList<SpaceReferenceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RsmmPackage.eINSTANCE
					.getSpaceToSpaceReferenceDependency_Child()
					|| false == setting.getEObject() instanceof SpaceToSpaceReferenceDependency) {
				continue;
			}
			SpaceToSpaceReferenceDependency link = (SpaceToSpaceReferenceDependency) setting
					.getEObject();
			if (SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID != SpaceReferenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ReferentialSpace src = link.getParent();
			result.add(new SpaceReferenceLinkDescriptor(
					src,
					target,
					link,
					SpaceReferenceElementTypes.SpaceToSpaceReferenceDependency_4001,
					SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceReferenceLinkDescriptor> getIncomingTypeModelFacetLinks_SpaceToEntityReferenceDependency_4002(
			ContextAwareEntityReference target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SpaceReferenceLinkDescriptor> result = new LinkedList<SpaceReferenceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RsmmPackage.eINSTANCE
					.getSpaceToEntityReferenceDependency_Child()
					|| false == setting.getEObject() instanceof SpaceToEntityReferenceDependency) {
				continue;
			}
			SpaceToEntityReferenceDependency link = (SpaceToEntityReferenceDependency) setting
					.getEObject();
			if (SpaceToEntityReferenceDependencyEditPart.VISUAL_ID != SpaceReferenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ReferentialSpace src = link.getParent();
			result.add(new SpaceReferenceLinkDescriptor(
					src,
					target,
					link,
					SpaceReferenceElementTypes.SpaceToEntityReferenceDependency_4002,
					SpaceToEntityReferenceDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceReferenceLinkDescriptor> getOutgoingTypeModelFacetLinks_SpaceToSpaceReferenceDependency_4001(
			ReferentialSpace source) {
		SystemInformationFlowReferenceSpace container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SystemInformationFlowReferenceSpace) {
				container = (SystemInformationFlowReferenceSpace) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SpaceReferenceLinkDescriptor> result = new LinkedList<SpaceReferenceLinkDescriptor>();
		for (Iterator<?> links = container
				.getSpaceToSpaceReferenceDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SpaceToSpaceReferenceDependency) {
				continue;
			}
			SpaceToSpaceReferenceDependency link = (SpaceToSpaceReferenceDependency) linkObject;
			if (SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID != SpaceReferenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ReferentialSpace dst = link.getChild();
			ReferentialSpace src = link.getParent();
			if (src != source) {
				continue;
			}
			result.add(new SpaceReferenceLinkDescriptor(
					src,
					dst,
					link,
					SpaceReferenceElementTypes.SpaceToSpaceReferenceDependency_4001,
					SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SpaceReferenceLinkDescriptor> getOutgoingTypeModelFacetLinks_SpaceToEntityReferenceDependency_4002(
			ReferentialSpace source) {
		SystemInformationFlowReferenceSpace container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SystemInformationFlowReferenceSpace) {
				container = (SystemInformationFlowReferenceSpace) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SpaceReferenceLinkDescriptor> result = new LinkedList<SpaceReferenceLinkDescriptor>();
		for (Iterator<?> links = container
				.getSpaceToEntityReferenceDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SpaceToEntityReferenceDependency) {
				continue;
			}
			SpaceToEntityReferenceDependency link = (SpaceToEntityReferenceDependency) linkObject;
			if (SpaceToEntityReferenceDependencyEditPart.VISUAL_ID != SpaceReferenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextAwareEntityReference dst = link.getChild();
			ReferentialSpace src = link.getParent();
			if (src != source) {
				continue;
			}
			result.add(new SpaceReferenceLinkDescriptor(
					src,
					dst,
					link,
					SpaceReferenceElementTypes.SpaceToEntityReferenceDependency_4002,
					SpaceToEntityReferenceDependencyEditPart.VISUAL_ID));
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
		public List<SpaceReferenceNodeDescriptor> getSemanticChildren(View view) {
			return SpaceReferenceDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SpaceReferenceLinkDescriptor> getContainedLinks(View view) {
			return SpaceReferenceDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SpaceReferenceLinkDescriptor> getIncomingLinks(View view) {
			return SpaceReferenceDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SpaceReferenceLinkDescriptor> getOutgoingLinks(View view) {
			return SpaceReferenceDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
