package somm.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import somm.Society;
import somm.SommPackage;
import somm.diagram.edit.parts.IndividualInstanceEditPart;
import somm.diagram.edit.parts.IndividualInstanceIdEditPart;
import somm.diagram.edit.parts.IndividualInstanceNameEditPart;
import somm.diagram.edit.parts.IndividualRealizationEditPart;
import somm.diagram.edit.parts.RoleEditPart;
import somm.diagram.edit.parts.RoleIdEditPart;
import somm.diagram.edit.parts.RoleNameEditPart;
import somm.diagram.edit.parts.SocietyEditPart;
import somm.diagram.edit.parts.SpecializationEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SocialVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tesoriero.cauce.social.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SocietyEditPart.MODEL_ID.equals(view.getType())) {
				return SocietyEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return somm.diagram.part.SocialVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SocialDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SommPackage.eINSTANCE.getSociety().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Society) domainElement)) {
			return SocietyEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = somm.diagram.part.SocialVisualIDRegistry
				.getModelID(containerView);
		if (!SocietyEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SocietyEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = somm.diagram.part.SocialVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SocietyEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SocietyEditPart.VISUAL_ID:
			if (SommPackage.eINSTANCE.getIndividualInstance().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualInstanceEditPart.VISUAL_ID;
			}
			if (SommPackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = somm.diagram.part.SocialVisualIDRegistry
				.getModelID(containerView);
		if (!SocietyEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SocietyEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = somm.diagram.part.SocialVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SocietyEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SocietyEditPart.VISUAL_ID:
			if (IndividualInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualInstanceEditPart.VISUAL_ID:
			if (IndividualInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualInstanceIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleEditPart.VISUAL_ID:
			if (RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SommPackage.eINSTANCE.getSpecialization().isSuperTypeOf(
				domainElement.eClass())) {
			return SpecializationEditPart.VISUAL_ID;
		}
		if (SommPackage.eINSTANCE.getIndividualRealization().isSuperTypeOf(
				domainElement.eClass())) {
			return IndividualRealizationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Society element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SocietyEditPart.VISUAL_ID:
			return false;
		case IndividualInstanceEditPart.VISUAL_ID:
		case RoleEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return somm.diagram.part.SocialVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return somm.diagram.part.SocialVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return somm.diagram.part.SocialVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return somm.diagram.part.SocialVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return somm.diagram.part.SocialVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return somm.diagram.part.SocialVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
