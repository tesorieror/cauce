package somm.diagram.part;

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

import somm.IndividualInstance;
import somm.IndividualRealization;
import somm.Role;
import somm.Society;
import somm.SommPackage;
import somm.Specialization;
import somm.diagram.edit.parts.IndividualInstanceEditPart;
import somm.diagram.edit.parts.IndividualRealizationEditPart;
import somm.diagram.edit.parts.RoleEditPart;
import somm.diagram.edit.parts.SocietyEditPart;
import somm.diagram.edit.parts.SpecializationEditPart;
import somm.diagram.providers.SocialElementTypes;

/**
 * @generated
 */
public class SocialDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SocialNodeDescriptor> getSemanticChildren(View view) {
		switch (SocialVisualIDRegistry.getVisualID(view)) {
		case SocietyEditPart.VISUAL_ID:
			return getSociety_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialNodeDescriptor> getSociety_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Society modelElement = (Society) view.getElement();
		LinkedList<SocialNodeDescriptor> result = new LinkedList<SocialNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIndividuals().iterator(); it
				.hasNext();) {
			IndividualInstance childElement = (IndividualInstance) it.next();
			int visualID = SocialVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IndividualInstanceEditPart.VISUAL_ID) {
				result.add(new SocialNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			Role childElement = (Role) it.next();
			int visualID = SocialVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new SocialNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getContainedLinks(View view) {
		switch (SocialVisualIDRegistry.getVisualID(view)) {
		case SocietyEditPart.VISUAL_ID:
			return getSociety_1000ContainedLinks(view);
		case IndividualInstanceEditPart.VISUAL_ID:
			return getIndividualInstance_2001ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2002ContainedLinks(view);
		case SpecializationEditPart.VISUAL_ID:
			return getSpecialization_4001ContainedLinks(view);
		case IndividualRealizationEditPart.VISUAL_ID:
			return getIndividualRealization_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getIncomingLinks(View view) {
		switch (SocialVisualIDRegistry.getVisualID(view)) {
		case IndividualInstanceEditPart.VISUAL_ID:
			return getIndividualInstance_2001IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2002IncomingLinks(view);
		case SpecializationEditPart.VISUAL_ID:
			return getSpecialization_4001IncomingLinks(view);
		case IndividualRealizationEditPart.VISUAL_ID:
			return getIndividualRealization_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getOutgoingLinks(View view) {
		switch (SocialVisualIDRegistry.getVisualID(view)) {
		case IndividualInstanceEditPart.VISUAL_ID:
			return getIndividualInstance_2001OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2002OutgoingLinks(view);
		case SpecializationEditPart.VISUAL_ID:
			return getSpecialization_4001OutgoingLinks(view);
		case IndividualRealizationEditPart.VISUAL_ID:
			return getIndividualRealization_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getSociety_1000ContainedLinks(
			View view) {
		Society modelElement = (Society) view.getElement();
		LinkedList<SocialLinkDescriptor> result = new LinkedList<SocialLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Specialization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IndividualRealization_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getIndividualInstance_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getRole_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getSpecialization_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getIndividualRealization_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getIndividualInstance_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getRole_2002IncomingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SocialLinkDescriptor> result = new LinkedList<SocialLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Specialization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndividualRealization_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getSpecialization_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getIndividualRealization_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getIndividualInstance_2001OutgoingLinks(
			View view) {
		IndividualInstance modelElement = (IndividualInstance) view
				.getElement();
		LinkedList<SocialLinkDescriptor> result = new LinkedList<SocialLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IndividualRealization_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getRole_2002OutgoingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<SocialLinkDescriptor> result = new LinkedList<SocialLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Specialization_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getSpecialization_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SocialLinkDescriptor> getIndividualRealization_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SocialLinkDescriptor> getContainedTypeModelFacetLinks_Specialization_4001(
			Society container) {
		LinkedList<SocialLinkDescriptor> result = new LinkedList<SocialLinkDescriptor>();
		for (Iterator<?> links = container.getGeneralizations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Specialization) {
				continue;
			}
			Specialization link = (Specialization) linkObject;
			if (SpecializationEditPart.VISUAL_ID != SocialVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getTarget();
			Role src = link.getSource();
			result.add(new SocialLinkDescriptor(src, dst, link,
					SocialElementTypes.Specialization_4001,
					SpecializationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SocialLinkDescriptor> getContainedTypeModelFacetLinks_IndividualRealization_4002(
			Society container) {
		LinkedList<SocialLinkDescriptor> result = new LinkedList<SocialLinkDescriptor>();
		for (Iterator<?> links = container.getRelaizations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IndividualRealization) {
				continue;
			}
			IndividualRealization link = (IndividualRealization) linkObject;
			if (IndividualRealizationEditPart.VISUAL_ID != SocialVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getTarget();
			IndividualInstance src = link.getSource();
			result.add(new SocialLinkDescriptor(src, dst, link,
					SocialElementTypes.IndividualRealization_4002,
					IndividualRealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SocialLinkDescriptor> getIncomingTypeModelFacetLinks_Specialization_4001(
			Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SocialLinkDescriptor> result = new LinkedList<SocialLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SommPackage.eINSTANCE
					.getSpecialization_Target()
					|| false == setting.getEObject() instanceof Specialization) {
				continue;
			}
			Specialization link = (Specialization) setting.getEObject();
			if (SpecializationEditPart.VISUAL_ID != SocialVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role src = link.getSource();
			result.add(new SocialLinkDescriptor(src, target, link,
					SocialElementTypes.Specialization_4001,
					SpecializationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SocialLinkDescriptor> getIncomingTypeModelFacetLinks_IndividualRealization_4002(
			Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SocialLinkDescriptor> result = new LinkedList<SocialLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SommPackage.eINSTANCE
					.getIndividualRealization_Target()
					|| false == setting.getEObject() instanceof IndividualRealization) {
				continue;
			}
			IndividualRealization link = (IndividualRealization) setting
					.getEObject();
			if (IndividualRealizationEditPart.VISUAL_ID != SocialVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IndividualInstance src = link.getSource();
			result.add(new SocialLinkDescriptor(src, target, link,
					SocialElementTypes.IndividualRealization_4002,
					IndividualRealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SocialLinkDescriptor> getOutgoingTypeModelFacetLinks_Specialization_4001(
			Role source) {
		Society container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Society) {
				container = (Society) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SocialLinkDescriptor> result = new LinkedList<SocialLinkDescriptor>();
		for (Iterator<?> links = container.getGeneralizations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Specialization) {
				continue;
			}
			Specialization link = (Specialization) linkObject;
			if (SpecializationEditPart.VISUAL_ID != SocialVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getTarget();
			Role src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new SocialLinkDescriptor(src, dst, link,
					SocialElementTypes.Specialization_4001,
					SpecializationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SocialLinkDescriptor> getOutgoingTypeModelFacetLinks_IndividualRealization_4002(
			IndividualInstance source) {
		Society container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Society) {
				container = (Society) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SocialLinkDescriptor> result = new LinkedList<SocialLinkDescriptor>();
		for (Iterator<?> links = container.getRelaizations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IndividualRealization) {
				continue;
			}
			IndividualRealization link = (IndividualRealization) linkObject;
			if (IndividualRealizationEditPart.VISUAL_ID != SocialVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getTarget();
			IndividualInstance src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new SocialLinkDescriptor(src, dst, link,
					SocialElementTypes.IndividualRealization_4002,
					IndividualRealizationEditPart.VISUAL_ID));
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
		public List<SocialNodeDescriptor> getSemanticChildren(View view) {
			return SocialDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SocialLinkDescriptor> getContainedLinks(View view) {
			return SocialDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SocialLinkDescriptor> getIncomingLinks(View view) {
			return SocialDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SocialLinkDescriptor> getOutgoingLinks(View view) {
			return SocialDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
