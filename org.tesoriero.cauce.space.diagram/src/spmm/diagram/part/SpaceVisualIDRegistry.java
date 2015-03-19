package spmm.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import spmm.SpmmPackage;
import spmm.Universe;
import spmm.diagram.edit.parts.ContentionEditPart;
import spmm.diagram.edit.parts.GeneralizationEditPart;
import spmm.diagram.edit.parts.GroupingEditPart;
import spmm.diagram.edit.parts.PhysicalSpaceEditPart;
import spmm.diagram.edit.parts.PhysicalSpaceNameEditPart;
import spmm.diagram.edit.parts.UniverseEditPart;
import spmm.diagram.edit.parts.VirtualSpaceEditPart;
import spmm.diagram.edit.parts.VirtualSpaceNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SpaceVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tesoriero.cauce.space.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UniverseEditPart.MODEL_ID.equals(view.getType())) {
				return UniverseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return spmm.diagram.part.SpaceVisualIDRegistry.getVisualID(view
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
				SpaceDiagramEditorPlugin.getInstance().logError(
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
		if (SpmmPackage.eINSTANCE.getUniverse().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Universe) domainElement)) {
			return UniverseEditPart.VISUAL_ID;
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
		String containerModelID = spmm.diagram.part.SpaceVisualIDRegistry
				.getModelID(containerView);
		if (!UniverseEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (UniverseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = spmm.diagram.part.SpaceVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UniverseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UniverseEditPart.VISUAL_ID:
			if (SpmmPackage.eINSTANCE.getPhysicalSpace().isSuperTypeOf(
					domainElement.eClass())) {
				return PhysicalSpaceEditPart.VISUAL_ID;
			}
			if (SpmmPackage.eINSTANCE.getVirtualSpace().isSuperTypeOf(
					domainElement.eClass())) {
				return VirtualSpaceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = spmm.diagram.part.SpaceVisualIDRegistry
				.getModelID(containerView);
		if (!UniverseEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (UniverseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = spmm.diagram.part.SpaceVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UniverseEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UniverseEditPart.VISUAL_ID:
			if (PhysicalSpaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VirtualSpaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PhysicalSpaceEditPart.VISUAL_ID:
			if (PhysicalSpaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VirtualSpaceEditPart.VISUAL_ID:
			if (VirtualSpaceNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (SpmmPackage.eINSTANCE.getGrouping().isSuperTypeOf(
				domainElement.eClass())) {
			return GroupingEditPart.VISUAL_ID;
		}
		if (SpmmPackage.eINSTANCE.getContention().isSuperTypeOf(
				domainElement.eClass())) {
			return ContentionEditPart.VISUAL_ID;
		}
		if (SpmmPackage.eINSTANCE.getGeneralization().isSuperTypeOf(
				domainElement.eClass())) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Universe element) {
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
		case UniverseEditPart.VISUAL_ID:
			return false;
		case PhysicalSpaceEditPart.VISUAL_ID:
		case VirtualSpaceEditPart.VISUAL_ID:
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
			return spmm.diagram.part.SpaceVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return spmm.diagram.part.SpaceVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return spmm.diagram.part.SpaceVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return spmm.diagram.part.SpaceVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return spmm.diagram.part.SpaceVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return spmm.diagram.part.SpaceVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
