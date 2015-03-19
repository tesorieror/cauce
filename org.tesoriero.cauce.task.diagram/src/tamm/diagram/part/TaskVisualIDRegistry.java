package tamm.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import tamm.ContextAwareSystem;
import tamm.TammPackage;
import tamm.diagram.edit.parts.AndJoinEditPart;
import tamm.diagram.edit.parts.AndSplitEditPart;
import tamm.diagram.edit.parts.ContextAwareSystemEditPart;
import tamm.diagram.edit.parts.FinalConditionDataExpressionEditPart;
import tamm.diagram.edit.parts.FinalConditionEditPart;
import tamm.diagram.edit.parts.FinalConditionLogicExpressionEditPart;
import tamm.diagram.edit.parts.FinalConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.FinalConditionSpaceExpressionEditPart;
import tamm.diagram.edit.parts.FinalConditionTaskExpressionEditPart;
import tamm.diagram.edit.parts.InitialConditionDataExpressionEditPart;
import tamm.diagram.edit.parts.InitialConditionEditPart;
import tamm.diagram.edit.parts.InitialConditionLogicExpressionEditPart;
import tamm.diagram.edit.parts.InitialConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.InitialConditionSpaceExpressionEditPart;
import tamm.diagram.edit.parts.InitialConditionTaskExpressionEditPart;
import tamm.diagram.edit.parts.InputConditionToJoinTaskEditPart;
import tamm.diagram.edit.parts.InputConditionToSplitTaskEditPart;
import tamm.diagram.edit.parts.JoinTaskToOutputConditionEditPart;
import tamm.diagram.edit.parts.OrJoinEditPart;
import tamm.diagram.edit.parts.OrSplitEditPart;
import tamm.diagram.edit.parts.PostConditionDataExpressionEditPart;
import tamm.diagram.edit.parts.PostConditionEditPart;
import tamm.diagram.edit.parts.PostConditionLogicExpressionEditPart;
import tamm.diagram.edit.parts.PostConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.PostConditionSpaceExpressionEditPart;
import tamm.diagram.edit.parts.PostConditionTaskExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionDataExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionEditPart;
import tamm.diagram.edit.parts.PreConditionLogicExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionSpaceExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionTaskExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionToSystemTaskEditPart;
import tamm.diagram.edit.parts.SimpleTaskEditPart;
import tamm.diagram.edit.parts.SimpleTaskNameEditPart;
import tamm.diagram.edit.parts.SkipTaskEditPart;
import tamm.diagram.edit.parts.SplitTaskToOutputConditionEditPart;
import tamm.diagram.edit.parts.SystemTaskToPostConditionEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TaskVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tesoriero.cauce.task.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ContextAwareSystemEditPart.MODEL_ID.equals(view.getType())) {
				return ContextAwareSystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return tamm.diagram.part.TaskVisualIDRegistry.getVisualID(view
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
				TaskDiagramEditorPlugin.getInstance().logError(
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
		if (TammPackage.eINSTANCE.getContextAwareSystem().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ContextAwareSystem) domainElement)) {
			return ContextAwareSystemEditPart.VISUAL_ID;
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
		String containerModelID = tamm.diagram.part.TaskVisualIDRegistry
				.getModelID(containerView);
		if (!ContextAwareSystemEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ContextAwareSystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = tamm.diagram.part.TaskVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ContextAwareSystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ContextAwareSystemEditPart.VISUAL_ID:
			if (TammPackage.eINSTANCE.getAndSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return AndSplitEditPart.VISUAL_ID;
			}
			if (TammPackage.eINSTANCE.getPreCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return PreConditionEditPart.VISUAL_ID;
			}
			if (TammPackage.eINSTANCE.getPostCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return PostConditionEditPart.VISUAL_ID;
			}
			if (TammPackage.eINSTANCE.getSkipTask().isSuperTypeOf(
					domainElement.eClass())) {
				return SkipTaskEditPart.VISUAL_ID;
			}
			if (TammPackage.eINSTANCE.getFinalCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return FinalConditionEditPart.VISUAL_ID;
			}
			if (TammPackage.eINSTANCE.getAndJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return AndJoinEditPart.VISUAL_ID;
			}
			if (TammPackage.eINSTANCE.getInitialCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return InitialConditionEditPart.VISUAL_ID;
			}
			if (TammPackage.eINSTANCE.getSimpleTask().isSuperTypeOf(
					domainElement.eClass())) {
				return SimpleTaskEditPart.VISUAL_ID;
			}
			if (TammPackage.eINSTANCE.getOrSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return OrSplitEditPart.VISUAL_ID;
			}
			if (TammPackage.eINSTANCE.getOrJoin().isSuperTypeOf(
					domainElement.eClass())) {
				return OrJoinEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = tamm.diagram.part.TaskVisualIDRegistry
				.getModelID(containerView);
		if (!ContextAwareSystemEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ContextAwareSystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = tamm.diagram.part.TaskVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ContextAwareSystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ContextAwareSystemEditPart.VISUAL_ID:
			if (AndSplitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PreConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PostConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SkipTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrSplitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrJoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PreConditionEditPart.VISUAL_ID:
			if (PreConditionSocialExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PreConditionTaskExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PreConditionSpaceExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PreConditionLogicExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PreConditionDataExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PostConditionEditPart.VISUAL_ID:
			if (PostConditionSocialExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PostConditionTaskExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PostConditionSpaceExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PostConditionLogicExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PostConditionDataExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FinalConditionEditPart.VISUAL_ID:
			if (FinalConditionSocialExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalConditionTaskExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalConditionSpaceExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalConditionLogicExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalConditionDataExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InitialConditionEditPart.VISUAL_ID:
			if (InitialConditionSocialExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialConditionTaskExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialConditionSpaceExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialConditionLogicExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialConditionDataExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleTaskEditPart.VISUAL_ID:
			if (SimpleTaskNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (TammPackage.eINSTANCE.getInputConditionToJoinTask().isSuperTypeOf(
				domainElement.eClass())) {
			return InputConditionToJoinTaskEditPart.VISUAL_ID;
		}
		if (TammPackage.eINSTANCE.getInputConditionToSplitTask().isSuperTypeOf(
				domainElement.eClass())) {
			return InputConditionToSplitTaskEditPart.VISUAL_ID;
		}
		if (TammPackage.eINSTANCE.getJoinTaskToOutputCondition().isSuperTypeOf(
				domainElement.eClass())) {
			return JoinTaskToOutputConditionEditPart.VISUAL_ID;
		}
		if (TammPackage.eINSTANCE.getSplitTaskToOutputCondition()
				.isSuperTypeOf(domainElement.eClass())) {
			return SplitTaskToOutputConditionEditPart.VISUAL_ID;
		}
		if (TammPackage.eINSTANCE.getPreConditionToSystemTask().isSuperTypeOf(
				domainElement.eClass())) {
			return PreConditionToSystemTaskEditPart.VISUAL_ID;
		}
		if (TammPackage.eINSTANCE.getSystemTaskToPostCondition().isSuperTypeOf(
				domainElement.eClass())) {
			return SystemTaskToPostConditionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ContextAwareSystem element) {
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
		case ContextAwareSystemEditPart.VISUAL_ID:
			return false;
		case AndSplitEditPart.VISUAL_ID:
		case PreConditionEditPart.VISUAL_ID:
		case PostConditionEditPart.VISUAL_ID:
		case SkipTaskEditPart.VISUAL_ID:
		case FinalConditionEditPart.VISUAL_ID:
		case AndJoinEditPart.VISUAL_ID:
		case InitialConditionEditPart.VISUAL_ID:
		case SimpleTaskEditPart.VISUAL_ID:
		case OrSplitEditPart.VISUAL_ID:
		case OrJoinEditPart.VISUAL_ID:
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
			return tamm.diagram.part.TaskVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return tamm.diagram.part.TaskVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return tamm.diagram.part.TaskVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return tamm.diagram.part.TaskVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return tamm.diagram.part.TaskVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return tamm.diagram.part.TaskVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
