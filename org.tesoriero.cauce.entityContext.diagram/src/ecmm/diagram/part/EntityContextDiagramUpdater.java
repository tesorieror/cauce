package ecmm.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import ecmm.ContextAction;
import ecmm.ContextMemory;
import ecmm.ContextSituation;
import ecmm.EntityContext;
import ecmm.MemoryContextCondition;
import ecmm.SensingContextCondition;
import ecmm.SystemContext;
import ecmm.VariableDataDefinition;
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

/**
 * @generated
 */
public class EntityContextDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<EntityContextNodeDescriptor> getSemanticChildren(
			View view) {
		switch (EntityContextVisualIDRegistry.getVisualID(view)) {
		case SystemContextEditPart.VISUAL_ID:
			return getSystemContext_1000SemanticChildren(view);
		case EntityContextStateEditPart.VISUAL_ID:
			return getEntityContextState_7001SemanticChildren(view);
		case EntityContextSituationsEditPart.VISUAL_ID:
			return getEntityContextSituations_7002SemanticChildren(view);
		case EntityContextDefinitionsEditPart.VISUAL_ID:
			return getEntityContextDefinitions_7003SemanticChildren(view);
		case ContextSituationConditionsEditPart.VISUAL_ID:
			return getContextSituationConditions_7004SemanticChildren(view);
		case ContextSituationSensingEditPart.VISUAL_ID:
			return getContextSituationSensing_7005SemanticChildren(view);
		case ContextSituationActionsEditPart.VISUAL_ID:
			return getContextSituationActions_7006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextNodeDescriptor> getSystemContext_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SystemContext modelElement = (SystemContext) view.getElement();
		LinkedList<EntityContextNodeDescriptor> result = new LinkedList<EntityContextNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntities().iterator(); it
				.hasNext();) {
			EntityContext childElement = (EntityContext) it.next();
			int visualID = EntityContextVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntityContextEditPart.VISUAL_ID) {
				result.add(new EntityContextNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityContextNodeDescriptor> getEntityContextState_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EntityContext modelElement = (EntityContext) containerView.getElement();
		LinkedList<EntityContextNodeDescriptor> result = new LinkedList<EntityContextNodeDescriptor>();
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			ContextMemory childElement = (ContextMemory) it.next();
			int visualID = EntityContextVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HolderMemoryEditPart.VISUAL_ID) {
				result.add(new EntityContextNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == LogicMemoryEditPart.VISUAL_ID) {
				result.add(new EntityContextNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == TimeMemoryEditPart.VISUAL_ID) {
				result.add(new EntityContextNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == StackMemoryEditPart.VISUAL_ID) {
				result.add(new EntityContextNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == DictionaryMemoryEditPart.VISUAL_ID) {
				result.add(new EntityContextNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityContextNodeDescriptor> getEntityContextSituations_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EntityContext modelElement = (EntityContext) containerView.getElement();
		LinkedList<EntityContextNodeDescriptor> result = new LinkedList<EntityContextNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSituations().iterator(); it
				.hasNext();) {
			ContextSituation childElement = (ContextSituation) it.next();
			int visualID = EntityContextVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContextSituationEditPart.VISUAL_ID) {
				result.add(new EntityContextNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityContextNodeDescriptor> getEntityContextDefinitions_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EntityContext modelElement = (EntityContext) containerView.getElement();
		LinkedList<EntityContextNodeDescriptor> result = new LinkedList<EntityContextNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it
				.hasNext();) {
			VariableDataDefinition childElement = (VariableDataDefinition) it
					.next();
			int visualID = EntityContextVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == VariableDataDefinitionEditPart.VISUAL_ID) {
				result.add(new EntityContextNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityContextNodeDescriptor> getContextSituationConditions_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContextSituation modelElement = (ContextSituation) containerView
				.getElement();
		LinkedList<EntityContextNodeDescriptor> result = new LinkedList<EntityContextNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMemoryConditions().iterator(); it
				.hasNext();) {
			MemoryContextCondition childElement = (MemoryContextCondition) it
					.next();
			int visualID = EntityContextVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MemoryContextConditionEditPart.VISUAL_ID) {
				result.add(new EntityContextNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityContextNodeDescriptor> getContextSituationSensing_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContextSituation modelElement = (ContextSituation) containerView
				.getElement();
		LinkedList<EntityContextNodeDescriptor> result = new LinkedList<EntityContextNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSensingConditions().iterator(); it
				.hasNext();) {
			SensingContextCondition childElement = (SensingContextCondition) it
					.next();
			int visualID = EntityContextVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SensingContextConditionEditPart.VISUAL_ID) {
				result.add(new EntityContextNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityContextNodeDescriptor> getContextSituationActions_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContextSituation modelElement = (ContextSituation) containerView
				.getElement();
		LinkedList<EntityContextNodeDescriptor> result = new LinkedList<EntityContextNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it
				.hasNext();) {
			ContextAction childElement = (ContextAction) it.next();
			int visualID = EntityContextVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContextActionEditPart.VISUAL_ID) {
				result.add(new EntityContextNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getContainedLinks(View view) {
		switch (EntityContextVisualIDRegistry.getVisualID(view)) {
		case SystemContextEditPart.VISUAL_ID:
			return getSystemContext_1000ContainedLinks(view);
		case EntityContextEditPart.VISUAL_ID:
			return getEntityContext_2001ContainedLinks(view);
		case HolderMemoryEditPart.VISUAL_ID:
			return getHolderMemory_3001ContainedLinks(view);
		case LogicMemoryEditPart.VISUAL_ID:
			return getLogicMemory_3002ContainedLinks(view);
		case TimeMemoryEditPart.VISUAL_ID:
			return getTimeMemory_3003ContainedLinks(view);
		case StackMemoryEditPart.VISUAL_ID:
			return getStackMemory_3004ContainedLinks(view);
		case DictionaryMemoryEditPart.VISUAL_ID:
			return getDictionaryMemory_3005ContainedLinks(view);
		case ContextSituationEditPart.VISUAL_ID:
			return getContextSituation_3006ContainedLinks(view);
		case MemoryContextConditionEditPart.VISUAL_ID:
			return getMemoryContextCondition_3007ContainedLinks(view);
		case SensingContextConditionEditPart.VISUAL_ID:
			return getSensingContextCondition_3008ContainedLinks(view);
		case ContextActionEditPart.VISUAL_ID:
			return getContextAction_3009ContainedLinks(view);
		case VariableDataDefinitionEditPart.VISUAL_ID:
			return getVariableDataDefinition_3010ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getIncomingLinks(View view) {
		switch (EntityContextVisualIDRegistry.getVisualID(view)) {
		case EntityContextEditPart.VISUAL_ID:
			return getEntityContext_2001IncomingLinks(view);
		case HolderMemoryEditPart.VISUAL_ID:
			return getHolderMemory_3001IncomingLinks(view);
		case LogicMemoryEditPart.VISUAL_ID:
			return getLogicMemory_3002IncomingLinks(view);
		case TimeMemoryEditPart.VISUAL_ID:
			return getTimeMemory_3003IncomingLinks(view);
		case StackMemoryEditPart.VISUAL_ID:
			return getStackMemory_3004IncomingLinks(view);
		case DictionaryMemoryEditPart.VISUAL_ID:
			return getDictionaryMemory_3005IncomingLinks(view);
		case ContextSituationEditPart.VISUAL_ID:
			return getContextSituation_3006IncomingLinks(view);
		case MemoryContextConditionEditPart.VISUAL_ID:
			return getMemoryContextCondition_3007IncomingLinks(view);
		case SensingContextConditionEditPart.VISUAL_ID:
			return getSensingContextCondition_3008IncomingLinks(view);
		case ContextActionEditPart.VISUAL_ID:
			return getContextAction_3009IncomingLinks(view);
		case VariableDataDefinitionEditPart.VISUAL_ID:
			return getVariableDataDefinition_3010IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getOutgoingLinks(View view) {
		switch (EntityContextVisualIDRegistry.getVisualID(view)) {
		case EntityContextEditPart.VISUAL_ID:
			return getEntityContext_2001OutgoingLinks(view);
		case HolderMemoryEditPart.VISUAL_ID:
			return getHolderMemory_3001OutgoingLinks(view);
		case LogicMemoryEditPart.VISUAL_ID:
			return getLogicMemory_3002OutgoingLinks(view);
		case TimeMemoryEditPart.VISUAL_ID:
			return getTimeMemory_3003OutgoingLinks(view);
		case StackMemoryEditPart.VISUAL_ID:
			return getStackMemory_3004OutgoingLinks(view);
		case DictionaryMemoryEditPart.VISUAL_ID:
			return getDictionaryMemory_3005OutgoingLinks(view);
		case ContextSituationEditPart.VISUAL_ID:
			return getContextSituation_3006OutgoingLinks(view);
		case MemoryContextConditionEditPart.VISUAL_ID:
			return getMemoryContextCondition_3007OutgoingLinks(view);
		case SensingContextConditionEditPart.VISUAL_ID:
			return getSensingContextCondition_3008OutgoingLinks(view);
		case ContextActionEditPart.VISUAL_ID:
			return getContextAction_3009OutgoingLinks(view);
		case VariableDataDefinitionEditPart.VISUAL_ID:
			return getVariableDataDefinition_3010OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getSystemContext_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getEntityContext_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getHolderMemory_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getLogicMemory_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getTimeMemory_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getStackMemory_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getDictionaryMemory_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getContextSituation_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getMemoryContextCondition_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getSensingContextCondition_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getContextAction_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getVariableDataDefinition_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getEntityContext_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getHolderMemory_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getLogicMemory_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getTimeMemory_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getStackMemory_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getDictionaryMemory_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getContextSituation_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getMemoryContextCondition_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getSensingContextCondition_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getContextAction_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getVariableDataDefinition_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getEntityContext_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getHolderMemory_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getLogicMemory_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getTimeMemory_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getStackMemory_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getDictionaryMemory_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getContextSituation_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getMemoryContextCondition_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getSensingContextCondition_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getContextAction_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityContextLinkDescriptor> getVariableDataDefinition_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<EntityContextNodeDescriptor> getSemanticChildren(View view) {
			return EntityContextDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<EntityContextLinkDescriptor> getContainedLinks(View view) {
			return EntityContextDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<EntityContextLinkDescriptor> getIncomingLinks(View view) {
			return EntityContextDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<EntityContextLinkDescriptor> getOutgoingLinks(View view) {
			return EntityContextDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
