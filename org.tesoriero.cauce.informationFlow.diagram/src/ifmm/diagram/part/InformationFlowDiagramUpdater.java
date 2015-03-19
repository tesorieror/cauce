package ifmm.diagram.part;

import ifmm.BroadcastInformationFlow;
import ifmm.BroadcastInformationFlowToEntityEdge;
import ifmm.ContextAwareEntity;
import ifmm.EntityToBroadcastInformationFlowEdge;
import ifmm.EntityToPointToPointInformationFlowEdge;
import ifmm.IfmmPackage;
import ifmm.InformationFlow;
import ifmm.InputData;
import ifmm.OutputData;
import ifmm.PointToPointInformationFlow;
import ifmm.PointToPointInformationFlowToEntityEdge;
import ifmm.SystemInformaitonFlow;
import ifmm.diagram.edit.parts.BroadcastInformationFlowBOutputDataEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.edit.parts.ContextAwareEntityEditPart;
import ifmm.diagram.edit.parts.EntityToBroadcastInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.EntityToPointToPointInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.InputDataEditPart;
import ifmm.diagram.edit.parts.OutputData2EditPart;
import ifmm.diagram.edit.parts.OutputDataEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowP2PInputDataEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowP2POutputDataEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.edit.parts.SystemInformaitonFlowEditPart;
import ifmm.diagram.providers.InformationFlowElementTypes;

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

/**
 * @generated
 */
public class InformationFlowDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<InformationFlowNodeDescriptor> getSemanticChildren(
			View view) {
		switch (InformationFlowVisualIDRegistry.getVisualID(view)) {
		case SystemInformaitonFlowEditPart.VISUAL_ID:
			return getSystemInformaitonFlow_1000SemanticChildren(view);
		case BroadcastInformationFlowBOutputDataEditPart.VISUAL_ID:
			return getBroadcastInformationFlowBOutputData_7001SemanticChildren(view);
		case PointToPointInformationFlowP2POutputDataEditPart.VISUAL_ID:
			return getPointToPointInformationFlowP2POutputData_7002SemanticChildren(view);
		case PointToPointInformationFlowP2PInputDataEditPart.VISUAL_ID:
			return getPointToPointInformationFlowP2PInputData_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowNodeDescriptor> getSystemInformaitonFlow_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SystemInformaitonFlow modelElement = (SystemInformaitonFlow) view
				.getElement();
		LinkedList<InformationFlowNodeDescriptor> result = new LinkedList<InformationFlowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInformationFlows().iterator(); it
				.hasNext();) {
			InformationFlow childElement = (InformationFlow) it.next();
			int visualID = InformationFlowVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == BroadcastInformationFlowEditPart.VISUAL_ID) {
				result.add(new InformationFlowNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == PointToPointInformationFlowEditPart.VISUAL_ID) {
				result.add(new InformationFlowNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEntities().iterator(); it
				.hasNext();) {
			ContextAwareEntity childElement = (ContextAwareEntity) it.next();
			int visualID = InformationFlowVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == ContextAwareEntityEditPart.VISUAL_ID) {
				result.add(new InformationFlowNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowNodeDescriptor> getBroadcastInformationFlowBOutputData_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BroadcastInformationFlow modelElement = (BroadcastInformationFlow) containerView
				.getElement();
		LinkedList<InformationFlowNodeDescriptor> result = new LinkedList<InformationFlowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getData().iterator(); it.hasNext();) {
			OutputData childElement = (OutputData) it.next();
			int visualID = InformationFlowVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == OutputDataEditPart.VISUAL_ID) {
				result.add(new InformationFlowNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowNodeDescriptor> getPointToPointInformationFlowP2POutputData_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PointToPointInformationFlow modelElement = (PointToPointInformationFlow) containerView
				.getElement();
		LinkedList<InformationFlowNodeDescriptor> result = new LinkedList<InformationFlowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOutputData().iterator(); it
				.hasNext();) {
			OutputData childElement = (OutputData) it.next();
			int visualID = InformationFlowVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == OutputData2EditPart.VISUAL_ID) {
				result.add(new InformationFlowNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowNodeDescriptor> getPointToPointInformationFlowP2PInputData_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PointToPointInformationFlow modelElement = (PointToPointInformationFlow) containerView
				.getElement();
		LinkedList<InformationFlowNodeDescriptor> result = new LinkedList<InformationFlowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputData().iterator(); it
				.hasNext();) {
			InputData childElement = (InputData) it.next();
			int visualID = InformationFlowVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == InputDataEditPart.VISUAL_ID) {
				result.add(new InformationFlowNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getContainedLinks(
			View view) {
		switch (InformationFlowVisualIDRegistry.getVisualID(view)) {
		case SystemInformaitonFlowEditPart.VISUAL_ID:
			return getSystemInformaitonFlow_1000ContainedLinks(view);
		case BroadcastInformationFlowEditPart.VISUAL_ID:
			return getBroadcastInformationFlow_2001ContainedLinks(view);
		case PointToPointInformationFlowEditPart.VISUAL_ID:
			return getPointToPointInformationFlow_2002ContainedLinks(view);
		case ContextAwareEntityEditPart.VISUAL_ID:
			return getContextAwareEntity_2003ContainedLinks(view);
		case OutputDataEditPart.VISUAL_ID:
			return getOutputData_3001ContainedLinks(view);
		case OutputData2EditPart.VISUAL_ID:
			return getOutputData_3002ContainedLinks(view);
		case InputDataEditPart.VISUAL_ID:
			return getInputData_3003ContainedLinks(view);
		case BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getBroadcastInformationFlowToEntityEdge_4001ContainedLinks(view);
		case EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID:
			return getEntityToBroadcastInformationFlowEdge_4002ContainedLinks(view);
		case EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID:
			return getEntityToPointToPointInformationFlowEdge_4003ContainedLinks(view);
		case PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getPointToPointInformationFlowToEntityEdge_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getIncomingLinks(View view) {
		switch (InformationFlowVisualIDRegistry.getVisualID(view)) {
		case BroadcastInformationFlowEditPart.VISUAL_ID:
			return getBroadcastInformationFlow_2001IncomingLinks(view);
		case PointToPointInformationFlowEditPart.VISUAL_ID:
			return getPointToPointInformationFlow_2002IncomingLinks(view);
		case ContextAwareEntityEditPart.VISUAL_ID:
			return getContextAwareEntity_2003IncomingLinks(view);
		case OutputDataEditPart.VISUAL_ID:
			return getOutputData_3001IncomingLinks(view);
		case OutputData2EditPart.VISUAL_ID:
			return getOutputData_3002IncomingLinks(view);
		case InputDataEditPart.VISUAL_ID:
			return getInputData_3003IncomingLinks(view);
		case BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getBroadcastInformationFlowToEntityEdge_4001IncomingLinks(view);
		case EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID:
			return getEntityToBroadcastInformationFlowEdge_4002IncomingLinks(view);
		case EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID:
			return getEntityToPointToPointInformationFlowEdge_4003IncomingLinks(view);
		case PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getPointToPointInformationFlowToEntityEdge_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getOutgoingLinks(View view) {
		switch (InformationFlowVisualIDRegistry.getVisualID(view)) {
		case BroadcastInformationFlowEditPart.VISUAL_ID:
			return getBroadcastInformationFlow_2001OutgoingLinks(view);
		case PointToPointInformationFlowEditPart.VISUAL_ID:
			return getPointToPointInformationFlow_2002OutgoingLinks(view);
		case ContextAwareEntityEditPart.VISUAL_ID:
			return getContextAwareEntity_2003OutgoingLinks(view);
		case OutputDataEditPart.VISUAL_ID:
			return getOutputData_3001OutgoingLinks(view);
		case OutputData2EditPart.VISUAL_ID:
			return getOutputData_3002OutgoingLinks(view);
		case InputDataEditPart.VISUAL_ID:
			return getInputData_3003OutgoingLinks(view);
		case BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getBroadcastInformationFlowToEntityEdge_4001OutgoingLinks(view);
		case EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID:
			return getEntityToBroadcastInformationFlowEdge_4002OutgoingLinks(view);
		case EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID:
			return getEntityToPointToPointInformationFlowEdge_4003OutgoingLinks(view);
		case PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return getPointToPointInformationFlowToEntityEdge_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getSystemInformaitonFlow_1000ContainedLinks(
			View view) {
		SystemInformaitonFlow modelElement = (SystemInformaitonFlow) view
				.getElement();
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_BroadcastInformationFlowToEntityEdge_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EntityToBroadcastInformationFlowEdge_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EntityToPointToPointInformationFlowEdge_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PointToPointInformationFlowToEntityEdge_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getBroadcastInformationFlow_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getPointToPointInformationFlow_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getContextAwareEntity_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getOutputData_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getOutputData_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getInputData_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getBroadcastInformationFlowToEntityEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getEntityToBroadcastInformationFlowEdge_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getEntityToPointToPointInformationFlowEdge_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getPointToPointInformationFlowToEntityEdge_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getBroadcastInformationFlow_2001IncomingLinks(
			View view) {
		BroadcastInformationFlow modelElement = (BroadcastInformationFlow) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EntityToBroadcastInformationFlowEdge_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getPointToPointInformationFlow_2002IncomingLinks(
			View view) {
		PointToPointInformationFlow modelElement = (PointToPointInformationFlow) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EntityToPointToPointInformationFlowEdge_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getContextAwareEntity_2003IncomingLinks(
			View view) {
		ContextAwareEntity modelElement = (ContextAwareEntity) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_BroadcastInformationFlowToEntityEdge_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PointToPointInformationFlowToEntityEdge_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getOutputData_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getOutputData_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getInputData_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getBroadcastInformationFlowToEntityEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getEntityToBroadcastInformationFlowEdge_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getEntityToPointToPointInformationFlowEdge_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getPointToPointInformationFlowToEntityEdge_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getBroadcastInformationFlow_2001OutgoingLinks(
			View view) {
		BroadcastInformationFlow modelElement = (BroadcastInformationFlow) view
				.getElement();
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_BroadcastInformationFlowToEntityEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getPointToPointInformationFlow_2002OutgoingLinks(
			View view) {
		PointToPointInformationFlow modelElement = (PointToPointInformationFlow) view
				.getElement();
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PointToPointInformationFlowToEntityEdge_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getContextAwareEntity_2003OutgoingLinks(
			View view) {
		ContextAwareEntity modelElement = (ContextAwareEntity) view
				.getElement();
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EntityToBroadcastInformationFlowEdge_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EntityToPointToPointInformationFlowEdge_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getOutputData_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getOutputData_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getInputData_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getBroadcastInformationFlowToEntityEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getEntityToBroadcastInformationFlowEdge_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getEntityToPointToPointInformationFlowEdge_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InformationFlowLinkDescriptor> getPointToPointInformationFlowToEntityEdge_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getContainedTypeModelFacetLinks_BroadcastInformationFlowToEntityEdge_4001(
			SystemInformaitonFlow container) {
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof BroadcastInformationFlowToEntityEdge) {
				continue;
			}
			BroadcastInformationFlowToEntityEdge link = (BroadcastInformationFlowToEntityEdge) linkObject;
			if (BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextAwareEntity dst = link.getTarget();
			BroadcastInformationFlow src = link.getSource();
			result.add(new InformationFlowLinkDescriptor(
					src,
					dst,
					link,
					InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001,
					BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getContainedTypeModelFacetLinks_EntityToBroadcastInformationFlowEdge_4002(
			SystemInformaitonFlow container) {
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EntityToBroadcastInformationFlowEdge) {
				continue;
			}
			EntityToBroadcastInformationFlowEdge link = (EntityToBroadcastInformationFlowEdge) linkObject;
			if (EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			BroadcastInformationFlow dst = link.getTarget();
			ContextAwareEntity src = link.getSource();
			result.add(new InformationFlowLinkDescriptor(
					src,
					dst,
					link,
					InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002,
					EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getContainedTypeModelFacetLinks_EntityToPointToPointInformationFlowEdge_4003(
			SystemInformaitonFlow container) {
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EntityToPointToPointInformationFlowEdge) {
				continue;
			}
			EntityToPointToPointInformationFlowEdge link = (EntityToPointToPointInformationFlowEdge) linkObject;
			if (EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PointToPointInformationFlow dst = link.getTarget();
			ContextAwareEntity src = link.getSource();
			result.add(new InformationFlowLinkDescriptor(
					src,
					dst,
					link,
					InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003,
					EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getContainedTypeModelFacetLinks_PointToPointInformationFlowToEntityEdge_4004(
			SystemInformaitonFlow container) {
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PointToPointInformationFlowToEntityEdge) {
				continue;
			}
			PointToPointInformationFlowToEntityEdge link = (PointToPointInformationFlowToEntityEdge) linkObject;
			if (PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextAwareEntity dst = link.getTarget();
			PointToPointInformationFlow src = link.getSource();
			result.add(new InformationFlowLinkDescriptor(
					src,
					dst,
					link,
					InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004,
					PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getIncomingTypeModelFacetLinks_BroadcastInformationFlowToEntityEdge_4001(
			ContextAwareEntity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IfmmPackage.eINSTANCE
					.getInformationFlowToEntityEdge_Target()
					|| false == setting.getEObject() instanceof BroadcastInformationFlowToEntityEdge) {
				continue;
			}
			BroadcastInformationFlowToEntityEdge link = (BroadcastInformationFlowToEntityEdge) setting
					.getEObject();
			if (BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			BroadcastInformationFlow src = link.getSource();
			result.add(new InformationFlowLinkDescriptor(
					src,
					target,
					link,
					InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001,
					BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getIncomingTypeModelFacetLinks_EntityToBroadcastInformationFlowEdge_4002(
			BroadcastInformationFlow target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IfmmPackage.eINSTANCE
					.getEntityToBroadcastInformationFlowEdge_Target()
					|| false == setting.getEObject() instanceof EntityToBroadcastInformationFlowEdge) {
				continue;
			}
			EntityToBroadcastInformationFlowEdge link = (EntityToBroadcastInformationFlowEdge) setting
					.getEObject();
			if (EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextAwareEntity src = link.getSource();
			result.add(new InformationFlowLinkDescriptor(
					src,
					target,
					link,
					InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002,
					EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getIncomingTypeModelFacetLinks_EntityToPointToPointInformationFlowEdge_4003(
			PointToPointInformationFlow target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IfmmPackage.eINSTANCE
					.getEntityToPointToPointInformationFlowEdge_Target()
					|| false == setting.getEObject() instanceof EntityToPointToPointInformationFlowEdge) {
				continue;
			}
			EntityToPointToPointInformationFlowEdge link = (EntityToPointToPointInformationFlowEdge) setting
					.getEObject();
			if (EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextAwareEntity src = link.getSource();
			result.add(new InformationFlowLinkDescriptor(
					src,
					target,
					link,
					InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003,
					EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getIncomingTypeModelFacetLinks_PointToPointInformationFlowToEntityEdge_4004(
			ContextAwareEntity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IfmmPackage.eINSTANCE
					.getInformationFlowToEntityEdge_Target()
					|| false == setting.getEObject() instanceof PointToPointInformationFlowToEntityEdge) {
				continue;
			}
			PointToPointInformationFlowToEntityEdge link = (PointToPointInformationFlowToEntityEdge) setting
					.getEObject();
			if (PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PointToPointInformationFlow src = link.getSource();
			result.add(new InformationFlowLinkDescriptor(
					src,
					target,
					link,
					InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004,
					PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getOutgoingTypeModelFacetLinks_BroadcastInformationFlowToEntityEdge_4001(
			BroadcastInformationFlow source) {
		SystemInformaitonFlow container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SystemInformaitonFlow) {
				container = (SystemInformaitonFlow) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof BroadcastInformationFlowToEntityEdge) {
				continue;
			}
			BroadcastInformationFlowToEntityEdge link = (BroadcastInformationFlowToEntityEdge) linkObject;
			if (BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextAwareEntity dst = link.getTarget();
			BroadcastInformationFlow src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new InformationFlowLinkDescriptor(
					src,
					dst,
					link,
					InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001,
					BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getOutgoingTypeModelFacetLinks_EntityToBroadcastInformationFlowEdge_4002(
			ContextAwareEntity source) {
		SystemInformaitonFlow container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SystemInformaitonFlow) {
				container = (SystemInformaitonFlow) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EntityToBroadcastInformationFlowEdge) {
				continue;
			}
			EntityToBroadcastInformationFlowEdge link = (EntityToBroadcastInformationFlowEdge) linkObject;
			if (EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			BroadcastInformationFlow dst = link.getTarget();
			ContextAwareEntity src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new InformationFlowLinkDescriptor(
					src,
					dst,
					link,
					InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002,
					EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getOutgoingTypeModelFacetLinks_EntityToPointToPointInformationFlowEdge_4003(
			ContextAwareEntity source) {
		SystemInformaitonFlow container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SystemInformaitonFlow) {
				container = (SystemInformaitonFlow) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EntityToPointToPointInformationFlowEdge) {
				continue;
			}
			EntityToPointToPointInformationFlowEdge link = (EntityToPointToPointInformationFlowEdge) linkObject;
			if (EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PointToPointInformationFlow dst = link.getTarget();
			ContextAwareEntity src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new InformationFlowLinkDescriptor(
					src,
					dst,
					link,
					InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003,
					EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InformationFlowLinkDescriptor> getOutgoingTypeModelFacetLinks_PointToPointInformationFlowToEntityEdge_4004(
			PointToPointInformationFlow source) {
		SystemInformaitonFlow container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SystemInformaitonFlow) {
				container = (SystemInformaitonFlow) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<InformationFlowLinkDescriptor> result = new LinkedList<InformationFlowLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PointToPointInformationFlowToEntityEdge) {
				continue;
			}
			PointToPointInformationFlowToEntityEdge link = (PointToPointInformationFlowToEntityEdge) linkObject;
			if (PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID != InformationFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextAwareEntity dst = link.getTarget();
			PointToPointInformationFlow src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new InformationFlowLinkDescriptor(
					src,
					dst,
					link,
					InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004,
					PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID));
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
		public List<InformationFlowNodeDescriptor> getSemanticChildren(View view) {
			return InformationFlowDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<InformationFlowLinkDescriptor> getContainedLinks(View view) {
			return InformationFlowDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<InformationFlowLinkDescriptor> getIncomingLinks(View view) {
			return InformationFlowDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<InformationFlowLinkDescriptor> getOutgoingLinks(View view) {
			return InformationFlowDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
