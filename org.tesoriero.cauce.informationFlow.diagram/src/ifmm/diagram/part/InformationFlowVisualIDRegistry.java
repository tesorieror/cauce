package ifmm.diagram.part;

import ifmm.IfmmPackage;
import ifmm.SystemInformaitonFlow;
import ifmm.diagram.edit.parts.BroadcastInformationFlowBOutputDataEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowIdEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowNameEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.edit.parts.ContextAwareEntityEditPart;
import ifmm.diagram.edit.parts.ContextAwareEntityIdEditPart;
import ifmm.diagram.edit.parts.ContextAwareEntityNameEditPart;
import ifmm.diagram.edit.parts.EntityToBroadcastInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.EntityToPointToPointInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.InputDataDefinitionEditPart;
import ifmm.diagram.edit.parts.InputDataEditPart;
import ifmm.diagram.edit.parts.OutputData2EditPart;
import ifmm.diagram.edit.parts.OutputDataDefinition2EditPart;
import ifmm.diagram.edit.parts.OutputDataDefinitionEditPart;
import ifmm.diagram.edit.parts.OutputDataEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowIdEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowNameEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowP2PInputDataEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowP2POutputDataEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.edit.parts.SystemInformaitonFlowEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class InformationFlowVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tesoriero.cauce.informationFlow.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SystemInformaitonFlowEditPart.MODEL_ID.equals(view.getType())) {
				return SystemInformaitonFlowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ifmm.diagram.part.InformationFlowVisualIDRegistry
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
				InformationFlowDiagramEditorPlugin.getInstance().logError(
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
		if (IfmmPackage.eINSTANCE.getSystemInformaitonFlow().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((SystemInformaitonFlow) domainElement)) {
			return SystemInformaitonFlowEditPart.VISUAL_ID;
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
		String containerModelID = ifmm.diagram.part.InformationFlowVisualIDRegistry
				.getModelID(containerView);
		if (!SystemInformaitonFlowEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SystemInformaitonFlowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ifmm.diagram.part.InformationFlowVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemInformaitonFlowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SystemInformaitonFlowEditPart.VISUAL_ID:
			if (IfmmPackage.eINSTANCE.getBroadcastInformationFlow()
					.isSuperTypeOf(domainElement.eClass())) {
				return BroadcastInformationFlowEditPart.VISUAL_ID;
			}
			if (IfmmPackage.eINSTANCE.getPointToPointInformationFlow()
					.isSuperTypeOf(domainElement.eClass())) {
				return PointToPointInformationFlowEditPart.VISUAL_ID;
			}
			if (IfmmPackage.eINSTANCE.getContextAwareEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return ContextAwareEntityEditPart.VISUAL_ID;
			}
			break;
		case BroadcastInformationFlowBOutputDataEditPart.VISUAL_ID:
			if (IfmmPackage.eINSTANCE.getOutputData().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputDataEditPart.VISUAL_ID;
			}
			break;
		case PointToPointInformationFlowP2POutputDataEditPart.VISUAL_ID:
			if (IfmmPackage.eINSTANCE.getOutputData().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputData2EditPart.VISUAL_ID;
			}
			break;
		case PointToPointInformationFlowP2PInputDataEditPart.VISUAL_ID:
			if (IfmmPackage.eINSTANCE.getInputData().isSuperTypeOf(
					domainElement.eClass())) {
				return InputDataEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ifmm.diagram.part.InformationFlowVisualIDRegistry
				.getModelID(containerView);
		if (!SystemInformaitonFlowEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SystemInformaitonFlowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ifmm.diagram.part.InformationFlowVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemInformaitonFlowEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SystemInformaitonFlowEditPart.VISUAL_ID:
			if (BroadcastInformationFlowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PointToPointInformationFlowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextAwareEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BroadcastInformationFlowEditPart.VISUAL_ID:
			if (BroadcastInformationFlowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BroadcastInformationFlowIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BroadcastInformationFlowBOutputDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PointToPointInformationFlowEditPart.VISUAL_ID:
			if (PointToPointInformationFlowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PointToPointInformationFlowIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PointToPointInformationFlowP2POutputDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PointToPointInformationFlowP2PInputDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextAwareEntityEditPart.VISUAL_ID:
			if (ContextAwareEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextAwareEntityIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputDataEditPart.VISUAL_ID:
			if (OutputDataDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputData2EditPart.VISUAL_ID:
			if (OutputDataDefinition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputDataEditPart.VISUAL_ID:
			if (InputDataDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BroadcastInformationFlowBOutputDataEditPart.VISUAL_ID:
			if (OutputDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PointToPointInformationFlowP2POutputDataEditPart.VISUAL_ID:
			if (OutputData2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PointToPointInformationFlowP2PInputDataEditPart.VISUAL_ID:
			if (InputDataEditPart.VISUAL_ID == nodeVisualID) {
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
		if (IfmmPackage.eINSTANCE.getBroadcastInformationFlowToEntityEdge()
				.isSuperTypeOf(domainElement.eClass())) {
			return BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID;
		}
		if (IfmmPackage.eINSTANCE.getEntityToBroadcastInformationFlowEdge()
				.isSuperTypeOf(domainElement.eClass())) {
			return EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID;
		}
		if (IfmmPackage.eINSTANCE.getEntityToPointToPointInformationFlowEdge()
				.isSuperTypeOf(domainElement.eClass())) {
			return EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID;
		}
		if (IfmmPackage.eINSTANCE.getPointToPointInformationFlowToEntityEdge()
				.isSuperTypeOf(domainElement.eClass())) {
			return PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(SystemInformaitonFlow element) {
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
		switch (visualID) {
		case BroadcastInformationFlowBOutputDataEditPart.VISUAL_ID:
		case PointToPointInformationFlowP2POutputDataEditPart.VISUAL_ID:
		case PointToPointInformationFlowP2PInputDataEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SystemInformaitonFlowEditPart.VISUAL_ID:
			return false;
		case ContextAwareEntityEditPart.VISUAL_ID:
		case OutputDataEditPart.VISUAL_ID:
		case OutputData2EditPart.VISUAL_ID:
		case InputDataEditPart.VISUAL_ID:
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
			return ifmm.diagram.part.InformationFlowVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return ifmm.diagram.part.InformationFlowVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ifmm.diagram.part.InformationFlowVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return ifmm.diagram.part.InformationFlowVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return ifmm.diagram.part.InformationFlowVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return ifmm.diagram.part.InformationFlowVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
