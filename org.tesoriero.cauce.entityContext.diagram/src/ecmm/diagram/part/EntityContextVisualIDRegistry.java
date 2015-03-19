package ecmm.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import ecmm.EcmmPackage;
import ecmm.SystemContext;
import ecmm.diagram.edit.parts.ContextActionEditPart;
import ecmm.diagram.edit.parts.ContextActionExpressionEditPart;
import ecmm.diagram.edit.parts.ContextActionMemoryNameEditPart;
import ecmm.diagram.edit.parts.ContextSituationActionsEditPart;
import ecmm.diagram.edit.parts.ContextSituationConditionsEditPart;
import ecmm.diagram.edit.parts.ContextSituationEditPart;
import ecmm.diagram.edit.parts.ContextSituationIdEditPart;
import ecmm.diagram.edit.parts.ContextSituationNameEditPart;
import ecmm.diagram.edit.parts.ContextSituationSensingEditPart;
import ecmm.diagram.edit.parts.DictionaryMemoryEditPart;
import ecmm.diagram.edit.parts.DictionaryMemoryIdEditPart;
import ecmm.diagram.edit.parts.DictionaryMemoryNameEditPart;
import ecmm.diagram.edit.parts.EntityContextDefinitionsEditPart;
import ecmm.diagram.edit.parts.EntityContextEditPart;
import ecmm.diagram.edit.parts.EntityContextEntityEditPart;
import ecmm.diagram.edit.parts.EntityContextIdEditPart;
import ecmm.diagram.edit.parts.EntityContextSituationsEditPart;
import ecmm.diagram.edit.parts.EntityContextStateEditPart;
import ecmm.diagram.edit.parts.HolderMemoryEditPart;
import ecmm.diagram.edit.parts.HolderMemoryIdEditPart;
import ecmm.diagram.edit.parts.HolderMemoryNameEditPart;
import ecmm.diagram.edit.parts.LogicMemoryEditPart;
import ecmm.diagram.edit.parts.LogicMemoryIdEditPart;
import ecmm.diagram.edit.parts.LogicMemoryNameEditPart;
import ecmm.diagram.edit.parts.MemoryContextConditionEditPart;
import ecmm.diagram.edit.parts.MemoryContextConditionExpressionEditPart;
import ecmm.diagram.edit.parts.MemoryContextConditionMemoryNameEditPart;
import ecmm.diagram.edit.parts.SensingContextConditionEditPart;
import ecmm.diagram.edit.parts.SensingContextConditionInformationflowEditPart;
import ecmm.diagram.edit.parts.StackMemoryEditPart;
import ecmm.diagram.edit.parts.StackMemoryIdEditPart;
import ecmm.diagram.edit.parts.StackMemoryNameEditPart;
import ecmm.diagram.edit.parts.SystemContextEditPart;
import ecmm.diagram.edit.parts.TimeMemoryEditPart;
import ecmm.diagram.edit.parts.TimeMemoryIdEditPart;
import ecmm.diagram.edit.parts.TimeMemoryNameEditPart;
import ecmm.diagram.edit.parts.VariableDataDefinitionEditPart;
import ecmm.diagram.edit.parts.VariableDataDefinitionNameDefinitionEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class EntityContextVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tesoriero.cauce.entityContext.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SystemContextEditPart.MODEL_ID.equals(view.getType())) {
				return SystemContextEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ecmm.diagram.part.EntityContextVisualIDRegistry.getVisualID(view
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
				EntityContextDiagramEditorPlugin.getInstance().logError(
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
		if (EcmmPackage.eINSTANCE.getSystemContext().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((SystemContext) domainElement)) {
			return SystemContextEditPart.VISUAL_ID;
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
		String containerModelID = ecmm.diagram.part.EntityContextVisualIDRegistry
				.getModelID(containerView);
		if (!SystemContextEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SystemContextEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ecmm.diagram.part.EntityContextVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemContextEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SystemContextEditPart.VISUAL_ID:
			if (EcmmPackage.eINSTANCE.getEntityContext().isSuperTypeOf(
					domainElement.eClass())) {
				return EntityContextEditPart.VISUAL_ID;
			}
			break;
		case EntityContextStateEditPart.VISUAL_ID:
			if (EcmmPackage.eINSTANCE.getHolderMemory().isSuperTypeOf(
					domainElement.eClass())) {
				return HolderMemoryEditPart.VISUAL_ID;
			}
			if (EcmmPackage.eINSTANCE.getLogicMemory().isSuperTypeOf(
					domainElement.eClass())) {
				return LogicMemoryEditPart.VISUAL_ID;
			}
			if (EcmmPackage.eINSTANCE.getTimeMemory().isSuperTypeOf(
					domainElement.eClass())) {
				return TimeMemoryEditPart.VISUAL_ID;
			}
			if (EcmmPackage.eINSTANCE.getStackMemory().isSuperTypeOf(
					domainElement.eClass())) {
				return StackMemoryEditPart.VISUAL_ID;
			}
			if (EcmmPackage.eINSTANCE.getDictionaryMemory().isSuperTypeOf(
					domainElement.eClass())) {
				return DictionaryMemoryEditPart.VISUAL_ID;
			}
			break;
		case EntityContextSituationsEditPart.VISUAL_ID:
			if (EcmmPackage.eINSTANCE.getContextSituation().isSuperTypeOf(
					domainElement.eClass())) {
				return ContextSituationEditPart.VISUAL_ID;
			}
			break;
		case EntityContextDefinitionsEditPart.VISUAL_ID:
			if (EcmmPackage.eINSTANCE.getVariableDataDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return VariableDataDefinitionEditPart.VISUAL_ID;
			}
			break;
		case ContextSituationConditionsEditPart.VISUAL_ID:
			if (EcmmPackage.eINSTANCE.getMemoryContextCondition()
					.isSuperTypeOf(domainElement.eClass())) {
				return MemoryContextConditionEditPart.VISUAL_ID;
			}
			break;
		case ContextSituationSensingEditPart.VISUAL_ID:
			if (EcmmPackage.eINSTANCE.getSensingContextCondition()
					.isSuperTypeOf(domainElement.eClass())) {
				return SensingContextConditionEditPart.VISUAL_ID;
			}
			break;
		case ContextSituationActionsEditPart.VISUAL_ID:
			if (EcmmPackage.eINSTANCE.getContextAction().isSuperTypeOf(
					domainElement.eClass())) {
				return ContextActionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ecmm.diagram.part.EntityContextVisualIDRegistry
				.getModelID(containerView);
		if (!SystemContextEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SystemContextEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ecmm.diagram.part.EntityContextVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemContextEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SystemContextEditPart.VISUAL_ID:
			if (EntityContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityContextEditPart.VISUAL_ID:
			if (EntityContextEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityContextIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityContextStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityContextSituationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityContextDefinitionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HolderMemoryEditPart.VISUAL_ID:
			if (HolderMemoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HolderMemoryIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicMemoryEditPart.VISUAL_ID:
			if (LogicMemoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogicMemoryIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TimeMemoryEditPart.VISUAL_ID:
			if (TimeMemoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeMemoryIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StackMemoryEditPart.VISUAL_ID:
			if (StackMemoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StackMemoryIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DictionaryMemoryEditPart.VISUAL_ID:
			if (DictionaryMemoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DictionaryMemoryIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextSituationEditPart.VISUAL_ID:
			if (ContextSituationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextSituationIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextSituationConditionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextSituationSensingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextSituationActionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MemoryContextConditionEditPart.VISUAL_ID:
			if (MemoryContextConditionExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MemoryContextConditionMemoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SensingContextConditionEditPart.VISUAL_ID:
			if (SensingContextConditionInformationflowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextActionEditPart.VISUAL_ID:
			if (ContextActionExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextActionMemoryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VariableDataDefinitionEditPart.VISUAL_ID:
			if (VariableDataDefinitionNameDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityContextStateEditPart.VISUAL_ID:
			if (HolderMemoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogicMemoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeMemoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StackMemoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DictionaryMemoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityContextSituationsEditPart.VISUAL_ID:
			if (ContextSituationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityContextDefinitionsEditPart.VISUAL_ID:
			if (VariableDataDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextSituationConditionsEditPart.VISUAL_ID:
			if (MemoryContextConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextSituationSensingEditPart.VISUAL_ID:
			if (SensingContextConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextSituationActionsEditPart.VISUAL_ID:
			if (ContextActionEditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(SystemContext element) {
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
		case EntityContextStateEditPart.VISUAL_ID:
		case EntityContextSituationsEditPart.VISUAL_ID:
		case EntityContextDefinitionsEditPart.VISUAL_ID:
		case ContextSituationConditionsEditPart.VISUAL_ID:
		case ContextSituationSensingEditPart.VISUAL_ID:
		case ContextSituationActionsEditPart.VISUAL_ID:
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
		case SystemContextEditPart.VISUAL_ID:
			return false;
		case HolderMemoryEditPart.VISUAL_ID:
		case LogicMemoryEditPart.VISUAL_ID:
		case TimeMemoryEditPart.VISUAL_ID:
		case StackMemoryEditPart.VISUAL_ID:
		case DictionaryMemoryEditPart.VISUAL_ID:
		case MemoryContextConditionEditPart.VISUAL_ID:
		case SensingContextConditionEditPart.VISUAL_ID:
		case ContextActionEditPart.VISUAL_ID:
		case VariableDataDefinitionEditPart.VISUAL_ID:
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
			return ecmm.diagram.part.EntityContextVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return ecmm.diagram.part.EntityContextVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ecmm.diagram.part.EntityContextVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return ecmm.diagram.part.EntityContextVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return ecmm.diagram.part.EntityContextVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return ecmm.diagram.part.EntityContextVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
