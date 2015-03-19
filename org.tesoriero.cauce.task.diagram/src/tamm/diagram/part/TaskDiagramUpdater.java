package tamm.diagram.part;

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

import tamm.AndJoin;
import tamm.AndSplit;
import tamm.ContextAwareSystem;
import tamm.FinalCondition;
import tamm.InitialCondition;
import tamm.InputConditionToJoinTask;
import tamm.InputConditionToSplitTask;
import tamm.Join;
import tamm.JoinTaskToOutputCondition;
import tamm.OrJoin;
import tamm.OrSplit;
import tamm.PostCondition;
import tamm.PreCondition;
import tamm.PreConditionToSystemTask;
import tamm.RouteTask;
import tamm.SimpleTask;
import tamm.SkipTask;
import tamm.Split;
import tamm.SplitTaskToOutputCondition;
import tamm.SystemTask;
import tamm.SystemTaskToPostCondition;
import tamm.TammPackage;
import tamm.TaskInputCondition;
import tamm.TaskOutputCondition;
import tamm.diagram.edit.parts.AndJoinEditPart;
import tamm.diagram.edit.parts.AndSplitEditPart;
import tamm.diagram.edit.parts.ContextAwareSystemEditPart;
import tamm.diagram.edit.parts.FinalConditionEditPart;
import tamm.diagram.edit.parts.InitialConditionEditPart;
import tamm.diagram.edit.parts.InputConditionToJoinTaskEditPart;
import tamm.diagram.edit.parts.InputConditionToSplitTaskEditPart;
import tamm.diagram.edit.parts.JoinTaskToOutputConditionEditPart;
import tamm.diagram.edit.parts.OrJoinEditPart;
import tamm.diagram.edit.parts.OrSplitEditPart;
import tamm.diagram.edit.parts.PostConditionEditPart;
import tamm.diagram.edit.parts.PreConditionEditPart;
import tamm.diagram.edit.parts.PreConditionToSystemTaskEditPart;
import tamm.diagram.edit.parts.SimpleTaskEditPart;
import tamm.diagram.edit.parts.SkipTaskEditPart;
import tamm.diagram.edit.parts.SplitTaskToOutputConditionEditPart;
import tamm.diagram.edit.parts.SystemTaskToPostConditionEditPart;
import tamm.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class TaskDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<TaskNodeDescriptor> getSemanticChildren(View view) {
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case ContextAwareSystemEditPart.VISUAL_ID:
			return getContextAwareSystem_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskNodeDescriptor> getContextAwareSystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ContextAwareSystem modelElement = (ContextAwareSystem) view
				.getElement();
		LinkedList<TaskNodeDescriptor> result = new LinkedList<TaskNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRouteTasks().iterator(); it
				.hasNext();) {
			RouteTask childElement = (RouteTask) it.next();
			int visualID = TaskVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AndSplitEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AndJoinEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrSplitEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrJoinEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPreConditions().iterator(); it
				.hasNext();) {
			PreCondition childElement = (PreCondition) it.next();
			int visualID = TaskVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PreConditionEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPostConditions().iterator(); it
				.hasNext();) {
			PostCondition childElement = (PostCondition) it.next();
			int visualID = TaskVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PostConditionEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSystemTasks().iterator(); it
				.hasNext();) {
			SystemTask childElement = (SystemTask) it.next();
			int visualID = TaskVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SkipTaskEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleTaskEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFinalConditions().iterator(); it
				.hasNext();) {
			FinalCondition childElement = (FinalCondition) it.next();
			int visualID = TaskVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FinalConditionEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInitialConditions().iterator(); it
				.hasNext();) {
			InitialCondition childElement = (InitialCondition) it.next();
			int visualID = TaskVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InitialConditionEditPart.VISUAL_ID) {
				result.add(new TaskNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getContainedLinks(View view) {
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case ContextAwareSystemEditPart.VISUAL_ID:
			return getContextAwareSystem_1000ContainedLinks(view);
		case AndSplitEditPart.VISUAL_ID:
			return getAndSplit_2001ContainedLinks(view);
		case PreConditionEditPart.VISUAL_ID:
			return getPreCondition_2002ContainedLinks(view);
		case PostConditionEditPart.VISUAL_ID:
			return getPostCondition_2003ContainedLinks(view);
		case SkipTaskEditPart.VISUAL_ID:
			return getSkipTask_2004ContainedLinks(view);
		case FinalConditionEditPart.VISUAL_ID:
			return getFinalCondition_2005ContainedLinks(view);
		case AndJoinEditPart.VISUAL_ID:
			return getAndJoin_2006ContainedLinks(view);
		case InitialConditionEditPart.VISUAL_ID:
			return getInitialCondition_2007ContainedLinks(view);
		case SimpleTaskEditPart.VISUAL_ID:
			return getSimpleTask_2008ContainedLinks(view);
		case OrSplitEditPart.VISUAL_ID:
			return getOrSplit_2009ContainedLinks(view);
		case OrJoinEditPart.VISUAL_ID:
			return getOrJoin_2010ContainedLinks(view);
		case InputConditionToJoinTaskEditPart.VISUAL_ID:
			return getInputConditionToJoinTask_4001ContainedLinks(view);
		case InputConditionToSplitTaskEditPart.VISUAL_ID:
			return getInputConditionToSplitTask_4002ContainedLinks(view);
		case JoinTaskToOutputConditionEditPart.VISUAL_ID:
			return getJoinTaskToOutputCondition_4003ContainedLinks(view);
		case SplitTaskToOutputConditionEditPart.VISUAL_ID:
			return getSplitTaskToOutputCondition_4004ContainedLinks(view);
		case PreConditionToSystemTaskEditPart.VISUAL_ID:
			return getPreConditionToSystemTask_4005ContainedLinks(view);
		case SystemTaskToPostConditionEditPart.VISUAL_ID:
			return getSystemTaskToPostCondition_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getIncomingLinks(View view) {
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case AndSplitEditPart.VISUAL_ID:
			return getAndSplit_2001IncomingLinks(view);
		case PreConditionEditPart.VISUAL_ID:
			return getPreCondition_2002IncomingLinks(view);
		case PostConditionEditPart.VISUAL_ID:
			return getPostCondition_2003IncomingLinks(view);
		case SkipTaskEditPart.VISUAL_ID:
			return getSkipTask_2004IncomingLinks(view);
		case FinalConditionEditPart.VISUAL_ID:
			return getFinalCondition_2005IncomingLinks(view);
		case AndJoinEditPart.VISUAL_ID:
			return getAndJoin_2006IncomingLinks(view);
		case InitialConditionEditPart.VISUAL_ID:
			return getInitialCondition_2007IncomingLinks(view);
		case SimpleTaskEditPart.VISUAL_ID:
			return getSimpleTask_2008IncomingLinks(view);
		case OrSplitEditPart.VISUAL_ID:
			return getOrSplit_2009IncomingLinks(view);
		case OrJoinEditPart.VISUAL_ID:
			return getOrJoin_2010IncomingLinks(view);
		case InputConditionToJoinTaskEditPart.VISUAL_ID:
			return getInputConditionToJoinTask_4001IncomingLinks(view);
		case InputConditionToSplitTaskEditPart.VISUAL_ID:
			return getInputConditionToSplitTask_4002IncomingLinks(view);
		case JoinTaskToOutputConditionEditPart.VISUAL_ID:
			return getJoinTaskToOutputCondition_4003IncomingLinks(view);
		case SplitTaskToOutputConditionEditPart.VISUAL_ID:
			return getSplitTaskToOutputCondition_4004IncomingLinks(view);
		case PreConditionToSystemTaskEditPart.VISUAL_ID:
			return getPreConditionToSystemTask_4005IncomingLinks(view);
		case SystemTaskToPostConditionEditPart.VISUAL_ID:
			return getSystemTaskToPostCondition_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getOutgoingLinks(View view) {
		switch (TaskVisualIDRegistry.getVisualID(view)) {
		case AndSplitEditPart.VISUAL_ID:
			return getAndSplit_2001OutgoingLinks(view);
		case PreConditionEditPart.VISUAL_ID:
			return getPreCondition_2002OutgoingLinks(view);
		case PostConditionEditPart.VISUAL_ID:
			return getPostCondition_2003OutgoingLinks(view);
		case SkipTaskEditPart.VISUAL_ID:
			return getSkipTask_2004OutgoingLinks(view);
		case FinalConditionEditPart.VISUAL_ID:
			return getFinalCondition_2005OutgoingLinks(view);
		case AndJoinEditPart.VISUAL_ID:
			return getAndJoin_2006OutgoingLinks(view);
		case InitialConditionEditPart.VISUAL_ID:
			return getInitialCondition_2007OutgoingLinks(view);
		case SimpleTaskEditPart.VISUAL_ID:
			return getSimpleTask_2008OutgoingLinks(view);
		case OrSplitEditPart.VISUAL_ID:
			return getOrSplit_2009OutgoingLinks(view);
		case OrJoinEditPart.VISUAL_ID:
			return getOrJoin_2010OutgoingLinks(view);
		case InputConditionToJoinTaskEditPart.VISUAL_ID:
			return getInputConditionToJoinTask_4001OutgoingLinks(view);
		case InputConditionToSplitTaskEditPart.VISUAL_ID:
			return getInputConditionToSplitTask_4002OutgoingLinks(view);
		case JoinTaskToOutputConditionEditPart.VISUAL_ID:
			return getJoinTaskToOutputCondition_4003OutgoingLinks(view);
		case SplitTaskToOutputConditionEditPart.VISUAL_ID:
			return getSplitTaskToOutputCondition_4004OutgoingLinks(view);
		case PreConditionToSystemTaskEditPart.VISUAL_ID:
			return getPreConditionToSystemTask_4005OutgoingLinks(view);
		case SystemTaskToPostConditionEditPart.VISUAL_ID:
			return getSystemTaskToPostCondition_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getContextAwareSystem_1000ContainedLinks(
			View view) {
		ContextAwareSystem modelElement = (ContextAwareSystem) view
				.getElement();
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InputConditionToJoinTask_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InputConditionToSplitTask_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_JoinTaskToOutputCondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SplitTaskToOutputCondition_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PreConditionToSystemTask_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SystemTaskToPostCondition_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getAndSplit_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getPreCondition_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getPostCondition_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSkipTask_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getFinalCondition_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getAndJoin_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getInitialCondition_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSimpleTask_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getOrSplit_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getOrJoin_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getInputConditionToJoinTask_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getInputConditionToSplitTask_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getJoinTaskToOutputCondition_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSplitTaskToOutputCondition_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getPreConditionToSystemTask_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSystemTaskToPostCondition_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getAndSplit_2001IncomingLinks(
			View view) {
		AndSplit modelElement = (AndSplit) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputConditionToSplitTask_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getPreCondition_2002IncomingLinks(
			View view) {
		PreCondition modelElement = (PreCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinTaskToOutputCondition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SplitTaskToOutputCondition_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getPostCondition_2003IncomingLinks(
			View view) {
		PostCondition modelElement = (PostCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SystemTaskToPostCondition_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSkipTask_2004IncomingLinks(
			View view) {
		SkipTask modelElement = (SkipTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PreConditionToSystemTask_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getFinalCondition_2005IncomingLinks(
			View view) {
		FinalCondition modelElement = (FinalCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinTaskToOutputCondition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SplitTaskToOutputCondition_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getAndJoin_2006IncomingLinks(
			View view) {
		AndJoin modelElement = (AndJoin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputConditionToJoinTask_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getInitialCondition_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSimpleTask_2008IncomingLinks(
			View view) {
		SimpleTask modelElement = (SimpleTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PreConditionToSystemTask_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getOrSplit_2009IncomingLinks(
			View view) {
		OrSplit modelElement = (OrSplit) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputConditionToSplitTask_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getOrJoin_2010IncomingLinks(View view) {
		OrJoin modelElement = (OrJoin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputConditionToJoinTask_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getInputConditionToJoinTask_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getInputConditionToSplitTask_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getJoinTaskToOutputCondition_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSplitTaskToOutputCondition_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getPreConditionToSystemTask_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSystemTaskToPostCondition_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getAndSplit_2001OutgoingLinks(
			View view) {
		AndSplit modelElement = (AndSplit) view.getElement();
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SplitTaskToOutputCondition_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getPreCondition_2002OutgoingLinks(
			View view) {
		PreCondition modelElement = (PreCondition) view.getElement();
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PreConditionToSystemTask_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getPostCondition_2003OutgoingLinks(
			View view) {
		PostCondition modelElement = (PostCondition) view.getElement();
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InputConditionToJoinTask_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InputConditionToSplitTask_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSkipTask_2004OutgoingLinks(
			View view) {
		SkipTask modelElement = (SkipTask) view.getElement();
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SystemTaskToPostCondition_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getFinalCondition_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getAndJoin_2006OutgoingLinks(
			View view) {
		AndJoin modelElement = (AndJoin) view.getElement();
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_JoinTaskToOutputCondition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getInitialCondition_2007OutgoingLinks(
			View view) {
		InitialCondition modelElement = (InitialCondition) view.getElement();
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InputConditionToJoinTask_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InputConditionToSplitTask_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSimpleTask_2008OutgoingLinks(
			View view) {
		SimpleTask modelElement = (SimpleTask) view.getElement();
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SystemTaskToPostCondition_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getOrSplit_2009OutgoingLinks(
			View view) {
		OrSplit modelElement = (OrSplit) view.getElement();
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SplitTaskToOutputCondition_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getOrJoin_2010OutgoingLinks(View view) {
		OrJoin modelElement = (OrJoin) view.getElement();
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_JoinTaskToOutputCondition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getInputConditionToJoinTask_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getInputConditionToSplitTask_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getJoinTaskToOutputCondition_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSplitTaskToOutputCondition_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getPreConditionToSystemTask_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TaskLinkDescriptor> getSystemTaskToPostCondition_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getContainedTypeModelFacetLinks_InputConditionToJoinTask_4001(
			ContextAwareSystem container) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getInputConditionToJoinTasks()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InputConditionToJoinTask) {
				continue;
			}
			InputConditionToJoinTask link = (InputConditionToJoinTask) linkObject;
			if (InputConditionToJoinTaskEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Join dst = link.getTarget();
			TaskInputCondition src = link.getSource();
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.InputConditionToJoinTask_4001,
					InputConditionToJoinTaskEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getContainedTypeModelFacetLinks_InputConditionToSplitTask_4002(
			ContextAwareSystem container) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getInputConditionToSplitTasks()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InputConditionToSplitTask) {
				continue;
			}
			InputConditionToSplitTask link = (InputConditionToSplitTask) linkObject;
			if (InputConditionToSplitTaskEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Split dst = link.getTarget();
			TaskInputCondition src = link.getSource();
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.InputConditionToSplitTask_4002,
					InputConditionToSplitTaskEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getContainedTypeModelFacetLinks_JoinTaskToOutputCondition_4003(
			ContextAwareSystem container) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getJoinTaskToOutputConditions()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JoinTaskToOutputCondition) {
				continue;
			}
			JoinTaskToOutputCondition link = (JoinTaskToOutputCondition) linkObject;
			if (JoinTaskToOutputConditionEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TaskOutputCondition dst = link.getTarget();
			Join src = link.getSource();
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.JoinTaskToOutputCondition_4003,
					JoinTaskToOutputConditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getContainedTypeModelFacetLinks_SplitTaskToOutputCondition_4004(
			ContextAwareSystem container) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getSplitTaskToOutputConditions()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SplitTaskToOutputCondition) {
				continue;
			}
			SplitTaskToOutputCondition link = (SplitTaskToOutputCondition) linkObject;
			if (SplitTaskToOutputConditionEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TaskOutputCondition dst = link.getTarget();
			Split src = link.getSource();
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.SplitTaskToOutputCondition_4004,
					SplitTaskToOutputConditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getContainedTypeModelFacetLinks_PreConditionToSystemTask_4005(
			ContextAwareSystem container) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getPreConditionToSystemTasks()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PreConditionToSystemTask) {
				continue;
			}
			PreConditionToSystemTask link = (PreConditionToSystemTask) linkObject;
			if (PreConditionToSystemTaskEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SystemTask dst = link.getTarget();
			PreCondition src = link.getSource();
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.PreConditionToSystemTask_4005,
					PreConditionToSystemTaskEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getContainedTypeModelFacetLinks_SystemTaskToPostCondition_4006(
			ContextAwareSystem container) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getSystemTaskToPostConditions()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SystemTaskToPostCondition) {
				continue;
			}
			SystemTaskToPostCondition link = (SystemTaskToPostCondition) linkObject;
			if (SystemTaskToPostConditionEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PostCondition dst = link.getTarget();
			SystemTask src = link.getSource();
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.SystemTaskToPostCondition_4006,
					SystemTaskToPostConditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getIncomingTypeModelFacetLinks_InputConditionToJoinTask_4001(
			Join target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TammPackage.eINSTANCE
					.getInputConditionToJoinTask_Target()
					|| false == setting.getEObject() instanceof InputConditionToJoinTask) {
				continue;
			}
			InputConditionToJoinTask link = (InputConditionToJoinTask) setting
					.getEObject();
			if (InputConditionToJoinTaskEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TaskInputCondition src = link.getSource();
			result.add(new TaskLinkDescriptor(src, target, link,
					TaskElementTypes.InputConditionToJoinTask_4001,
					InputConditionToJoinTaskEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getIncomingTypeModelFacetLinks_InputConditionToSplitTask_4002(
			Split target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TammPackage.eINSTANCE
					.getInputConditionToSplitTask_Target()
					|| false == setting.getEObject() instanceof InputConditionToSplitTask) {
				continue;
			}
			InputConditionToSplitTask link = (InputConditionToSplitTask) setting
					.getEObject();
			if (InputConditionToSplitTaskEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TaskInputCondition src = link.getSource();
			result.add(new TaskLinkDescriptor(src, target, link,
					TaskElementTypes.InputConditionToSplitTask_4002,
					InputConditionToSplitTaskEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getIncomingTypeModelFacetLinks_JoinTaskToOutputCondition_4003(
			TaskOutputCondition target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TammPackage.eINSTANCE
					.getRouteTaskToOutputCondition_Target()
					|| false == setting.getEObject() instanceof JoinTaskToOutputCondition) {
				continue;
			}
			JoinTaskToOutputCondition link = (JoinTaskToOutputCondition) setting
					.getEObject();
			if (JoinTaskToOutputConditionEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Join src = link.getSource();
			result.add(new TaskLinkDescriptor(src, target, link,
					TaskElementTypes.JoinTaskToOutputCondition_4003,
					JoinTaskToOutputConditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getIncomingTypeModelFacetLinks_SplitTaskToOutputCondition_4004(
			TaskOutputCondition target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TammPackage.eINSTANCE
					.getRouteTaskToOutputCondition_Target()
					|| false == setting.getEObject() instanceof SplitTaskToOutputCondition) {
				continue;
			}
			SplitTaskToOutputCondition link = (SplitTaskToOutputCondition) setting
					.getEObject();
			if (SplitTaskToOutputConditionEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Split src = link.getSource();
			result.add(new TaskLinkDescriptor(src, target, link,
					TaskElementTypes.SplitTaskToOutputCondition_4004,
					SplitTaskToOutputConditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getIncomingTypeModelFacetLinks_PreConditionToSystemTask_4005(
			SystemTask target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TammPackage.eINSTANCE
					.getPreConditionToSystemTask_Target()
					|| false == setting.getEObject() instanceof PreConditionToSystemTask) {
				continue;
			}
			PreConditionToSystemTask link = (PreConditionToSystemTask) setting
					.getEObject();
			if (PreConditionToSystemTaskEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PreCondition src = link.getSource();
			result.add(new TaskLinkDescriptor(src, target, link,
					TaskElementTypes.PreConditionToSystemTask_4005,
					PreConditionToSystemTaskEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getIncomingTypeModelFacetLinks_SystemTaskToPostCondition_4006(
			PostCondition target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TammPackage.eINSTANCE
					.getSystemTaskToPostCondition_Target()
					|| false == setting.getEObject() instanceof SystemTaskToPostCondition) {
				continue;
			}
			SystemTaskToPostCondition link = (SystemTaskToPostCondition) setting
					.getEObject();
			if (SystemTaskToPostConditionEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SystemTask src = link.getSource();
			result.add(new TaskLinkDescriptor(src, target, link,
					TaskElementTypes.SystemTaskToPostCondition_4006,
					SystemTaskToPostConditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getOutgoingTypeModelFacetLinks_InputConditionToJoinTask_4001(
			TaskInputCondition source) {
		ContextAwareSystem container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ContextAwareSystem) {
				container = (ContextAwareSystem) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getInputConditionToJoinTasks()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InputConditionToJoinTask) {
				continue;
			}
			InputConditionToJoinTask link = (InputConditionToJoinTask) linkObject;
			if (InputConditionToJoinTaskEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Join dst = link.getTarget();
			TaskInputCondition src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.InputConditionToJoinTask_4001,
					InputConditionToJoinTaskEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getOutgoingTypeModelFacetLinks_InputConditionToSplitTask_4002(
			TaskInputCondition source) {
		ContextAwareSystem container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ContextAwareSystem) {
				container = (ContextAwareSystem) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getInputConditionToSplitTasks()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InputConditionToSplitTask) {
				continue;
			}
			InputConditionToSplitTask link = (InputConditionToSplitTask) linkObject;
			if (InputConditionToSplitTaskEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Split dst = link.getTarget();
			TaskInputCondition src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.InputConditionToSplitTask_4002,
					InputConditionToSplitTaskEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getOutgoingTypeModelFacetLinks_JoinTaskToOutputCondition_4003(
			Join source) {
		ContextAwareSystem container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ContextAwareSystem) {
				container = (ContextAwareSystem) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getJoinTaskToOutputConditions()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JoinTaskToOutputCondition) {
				continue;
			}
			JoinTaskToOutputCondition link = (JoinTaskToOutputCondition) linkObject;
			if (JoinTaskToOutputConditionEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TaskOutputCondition dst = link.getTarget();
			Join src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.JoinTaskToOutputCondition_4003,
					JoinTaskToOutputConditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getOutgoingTypeModelFacetLinks_SplitTaskToOutputCondition_4004(
			Split source) {
		ContextAwareSystem container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ContextAwareSystem) {
				container = (ContextAwareSystem) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getSplitTaskToOutputConditions()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SplitTaskToOutputCondition) {
				continue;
			}
			SplitTaskToOutputCondition link = (SplitTaskToOutputCondition) linkObject;
			if (SplitTaskToOutputConditionEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TaskOutputCondition dst = link.getTarget();
			Split src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.SplitTaskToOutputCondition_4004,
					SplitTaskToOutputConditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getOutgoingTypeModelFacetLinks_PreConditionToSystemTask_4005(
			PreCondition source) {
		ContextAwareSystem container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ContextAwareSystem) {
				container = (ContextAwareSystem) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getPreConditionToSystemTasks()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PreConditionToSystemTask) {
				continue;
			}
			PreConditionToSystemTask link = (PreConditionToSystemTask) linkObject;
			if (PreConditionToSystemTaskEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SystemTask dst = link.getTarget();
			PreCondition src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.PreConditionToSystemTask_4005,
					PreConditionToSystemTaskEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TaskLinkDescriptor> getOutgoingTypeModelFacetLinks_SystemTaskToPostCondition_4006(
			SystemTask source) {
		ContextAwareSystem container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ContextAwareSystem) {
				container = (ContextAwareSystem) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TaskLinkDescriptor> result = new LinkedList<TaskLinkDescriptor>();
		for (Iterator<?> links = container.getSystemTaskToPostConditions()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SystemTaskToPostCondition) {
				continue;
			}
			SystemTaskToPostCondition link = (SystemTaskToPostCondition) linkObject;
			if (SystemTaskToPostConditionEditPart.VISUAL_ID != TaskVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PostCondition dst = link.getTarget();
			SystemTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TaskLinkDescriptor(src, dst, link,
					TaskElementTypes.SystemTaskToPostCondition_4006,
					SystemTaskToPostConditionEditPart.VISUAL_ID));
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
		public List<TaskNodeDescriptor> getSemanticChildren(View view) {
			return TaskDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TaskLinkDescriptor> getContainedLinks(View view) {
			return TaskDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TaskLinkDescriptor> getIncomingLinks(View view) {
			return TaskDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TaskLinkDescriptor> getOutgoingLinks(View view) {
			return TaskDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
