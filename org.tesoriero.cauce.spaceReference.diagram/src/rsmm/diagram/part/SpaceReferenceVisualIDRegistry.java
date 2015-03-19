package rsmm.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import rsmm.RsmmPackage;
import rsmm.SystemInformationFlowReferenceSpace;
import rsmm.diagram.edit.parts.ContextAwareEntityReferenceEditPart;
import rsmm.diagram.edit.parts.ContextAwareEntityReferenceEntityEditPart;
import rsmm.diagram.edit.parts.ContextAwareEntityReferenceIdEditPart;
import rsmm.diagram.edit.parts.ContextAwareEntityReferenceNameEditPart;
import rsmm.diagram.edit.parts.ReferentialSpaceEditPart;
import rsmm.diagram.edit.parts.ReferentialSpaceIdEditPart;
import rsmm.diagram.edit.parts.ReferentialSpaceNameEditPart;
import rsmm.diagram.edit.parts.SpaceToEntityReferenceDependencyCardinalityEditPart;
import rsmm.diagram.edit.parts.SpaceToEntityReferenceDependencyEditPart;
import rsmm.diagram.edit.parts.SpaceToSpaceReferenceDependencyCardinalityEditPart;
import rsmm.diagram.edit.parts.SpaceToSpaceReferenceDependencyEditPart;
import rsmm.diagram.edit.parts.SystemInformationFlowReferenceSpaceEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SpaceReferenceVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tesoriero.cauce.spaceReference.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SystemInformationFlowReferenceSpaceEditPart.MODEL_ID
					.equals(view.getType())) {
				return SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return rsmm.diagram.part.SpaceReferenceVisualIDRegistry
				.getVisualID(view.getType());
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
				SpaceReferenceDiagramEditorPlugin.getInstance().logError(
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
		if (RsmmPackage.eINSTANCE.getSystemInformationFlowReferenceSpace()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((SystemInformationFlowReferenceSpace) domainElement)) {
			return SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID;
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
		String containerModelID = rsmm.diagram.part.SpaceReferenceVisualIDRegistry
				.getModelID(containerView);
		if (!SystemInformationFlowReferenceSpaceEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SystemInformationFlowReferenceSpaceEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = rsmm.diagram.part.SpaceReferenceVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID:
			if (RsmmPackage.eINSTANCE.getContextAwareEntityReference()
					.isSuperTypeOf(domainElement.eClass())) {
				return ContextAwareEntityReferenceEditPart.VISUAL_ID;
			}
			if (RsmmPackage.eINSTANCE.getReferentialSpace().isSuperTypeOf(
					domainElement.eClass())) {
				return ReferentialSpaceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = rsmm.diagram.part.SpaceReferenceVisualIDRegistry
				.getModelID(containerView);
		if (!SystemInformationFlowReferenceSpaceEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SystemInformationFlowReferenceSpaceEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = rsmm.diagram.part.SpaceReferenceVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID:
			if (ContextAwareEntityReferenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReferentialSpaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextAwareEntityReferenceEditPart.VISUAL_ID:
			if (ContextAwareEntityReferenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextAwareEntityReferenceEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextAwareEntityReferenceIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReferentialSpaceEditPart.VISUAL_ID:
			if (ReferentialSpaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReferentialSpaceIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID:
			if (SpaceToSpaceReferenceDependencyCardinalityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SpaceToEntityReferenceDependencyEditPart.VISUAL_ID:
			if (SpaceToEntityReferenceDependencyCardinalityEditPart.VISUAL_ID == nodeVisualID) {
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
		if (RsmmPackage.eINSTANCE.getSpaceToSpaceReferenceDependency()
				.isSuperTypeOf(domainElement.eClass())) {
			return SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID;
		}
		if (RsmmPackage.eINSTANCE.getSpaceToEntityReferenceDependency()
				.isSuperTypeOf(domainElement.eClass())) {
			return SpaceToEntityReferenceDependencyEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(SystemInformationFlowReferenceSpace element) {
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
		case SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID:
			return false;
		case ContextAwareEntityReferenceEditPart.VISUAL_ID:
		case ReferentialSpaceEditPart.VISUAL_ID:
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
			return rsmm.diagram.part.SpaceReferenceVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return rsmm.diagram.part.SpaceReferenceVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return rsmm.diagram.part.SpaceReferenceVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return rsmm.diagram.part.SpaceReferenceVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return rsmm.diagram.part.SpaceReferenceVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return rsmm.diagram.part.SpaceReferenceVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
