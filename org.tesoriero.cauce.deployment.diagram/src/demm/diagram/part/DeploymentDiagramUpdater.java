package demm.diagram.part;

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

import demm.Connection;
import demm.ConnectionPlatform;
import demm.ConnectionToDeviceEdge;
import demm.DemmPackage;
import demm.DevelopmentEnvironment;
import demm.Device;
import demm.DevicePlatform;
import demm.DeviceToConnectionEdge;
import demm.Entity;
import demm.Information;
import demm.Medium;
import demm.OperatingSystem;
import demm.ProgrammingLanguage;
import demm.Protocol;
import demm.diagram.edit.parts.ConnectionConnectionPlatformCompartmentEditPart;
import demm.diagram.edit.parts.ConnectionEditPart;
import demm.diagram.edit.parts.ConnectionInformationCompartmentEditPart;
import demm.diagram.edit.parts.ConnectionPlatformEditPart;
import demm.diagram.edit.parts.ConnectionToDeviceEdgeEditPart;
import demm.diagram.edit.parts.DevelopmentEnvironmentEditPart;
import demm.diagram.edit.parts.DeviceDevicePlatformCompartmentEditPart;
import demm.diagram.edit.parts.DeviceEditPart;
import demm.diagram.edit.parts.DeviceEntityCompartmentEditPart;
import demm.diagram.edit.parts.DevicePlatformEditPart;
import demm.diagram.edit.parts.DeviceToConnectionEdgeEditPart;
import demm.diagram.edit.parts.EntityEditPart;
import demm.diagram.edit.parts.InformationEditPart;
import demm.diagram.edit.parts.MediumEditPart;
import demm.diagram.edit.parts.OperatingSystemEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageEditPart;
import demm.diagram.edit.parts.ProtocolEditPart;
import demm.diagram.providers.DeploymentElementTypes;

/**
 * @generated
 */
public class DeploymentDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<DeploymentNodeDescriptor> getSemanticChildren(View view) {
		switch (DeploymentVisualIDRegistry.getVisualID(view)) {
		case DevelopmentEnvironmentEditPart.VISUAL_ID:
			return getDevelopmentEnvironment_1000SemanticChildren(view);
		case DeviceDevicePlatformCompartmentEditPart.VISUAL_ID:
			return getDeviceDevicePlatformCompartment_7001SemanticChildren(view);
		case DeviceEntityCompartmentEditPart.VISUAL_ID:
			return getDeviceEntityCompartment_7002SemanticChildren(view);
		case ConnectionConnectionPlatformCompartmentEditPart.VISUAL_ID:
			return getConnectionConnectionPlatformCompartment_7003SemanticChildren(view);
		case ConnectionInformationCompartmentEditPart.VISUAL_ID:
			return getConnectionInformationCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentNodeDescriptor> getDevelopmentEnvironment_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DevelopmentEnvironment modelElement = (DevelopmentEnvironment) view
				.getElement();
		LinkedList<DeploymentNodeDescriptor> result = new LinkedList<DeploymentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLanguages().iterator(); it
				.hasNext();) {
			ProgrammingLanguage childElement = (ProgrammingLanguage) it.next();
			int visualID = DeploymentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProgrammingLanguageEditPart.VISUAL_ID) {
				result.add(new DeploymentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOs().iterator(); it.hasNext();) {
			OperatingSystem childElement = (OperatingSystem) it.next();
			int visualID = DeploymentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperatingSystemEditPart.VISUAL_ID) {
				result.add(new DeploymentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDevices().iterator(); it
				.hasNext();) {
			Device childElement = (Device) it.next();
			int visualID = DeploymentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DeviceEditPart.VISUAL_ID) {
				result.add(new DeploymentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getConnections().iterator(); it
				.hasNext();) {
			Connection childElement = (Connection) it.next();
			int visualID = DeploymentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectionEditPart.VISUAL_ID) {
				result.add(new DeploymentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMediums().iterator(); it
				.hasNext();) {
			Medium childElement = (Medium) it.next();
			int visualID = DeploymentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MediumEditPart.VISUAL_ID) {
				result.add(new DeploymentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProtocols().iterator(); it
				.hasNext();) {
			Protocol childElement = (Protocol) it.next();
			int visualID = DeploymentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProtocolEditPart.VISUAL_ID) {
				result.add(new DeploymentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeploymentNodeDescriptor> getDeviceDevicePlatformCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Device modelElement = (Device) containerView.getElement();
		LinkedList<DeploymentNodeDescriptor> result = new LinkedList<DeploymentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPlatforms().iterator(); it
				.hasNext();) {
			DevicePlatform childElement = (DevicePlatform) it.next();
			int visualID = DeploymentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DevicePlatformEditPart.VISUAL_ID) {
				result.add(new DeploymentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeploymentNodeDescriptor> getDeviceEntityCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Device modelElement = (Device) containerView.getElement();
		LinkedList<DeploymentNodeDescriptor> result = new LinkedList<DeploymentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntities().iterator(); it
				.hasNext();) {
			Entity childElement = (Entity) it.next();
			int visualID = DeploymentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new DeploymentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeploymentNodeDescriptor> getConnectionConnectionPlatformCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Connection modelElement = (Connection) containerView.getElement();
		LinkedList<DeploymentNodeDescriptor> result = new LinkedList<DeploymentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPlatforms().iterator(); it
				.hasNext();) {
			ConnectionPlatform childElement = (ConnectionPlatform) it.next();
			int visualID = DeploymentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectionPlatformEditPart.VISUAL_ID) {
				result.add(new DeploymentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeploymentNodeDescriptor> getConnectionInformationCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Connection modelElement = (Connection) containerView.getElement();
		LinkedList<DeploymentNodeDescriptor> result = new LinkedList<DeploymentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInformation().iterator(); it
				.hasNext();) {
			Information childElement = (Information) it.next();
			int visualID = DeploymentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InformationEditPart.VISUAL_ID) {
				result.add(new DeploymentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getContainedLinks(View view) {
		switch (DeploymentVisualIDRegistry.getVisualID(view)) {
		case DevelopmentEnvironmentEditPart.VISUAL_ID:
			return getDevelopmentEnvironment_1000ContainedLinks(view);
		case ProgrammingLanguageEditPart.VISUAL_ID:
			return getProgrammingLanguage_2001ContainedLinks(view);
		case OperatingSystemEditPart.VISUAL_ID:
			return getOperatingSystem_2002ContainedLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2003ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2004ContainedLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2005ContainedLinks(view);
		case ProtocolEditPart.VISUAL_ID:
			return getProtocol_2006ContainedLinks(view);
		case DevicePlatformEditPart.VISUAL_ID:
			return getDevicePlatform_3001ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_3002ContainedLinks(view);
		case InformationEditPart.VISUAL_ID:
			return getInformation_3003ContainedLinks(view);
		case ConnectionPlatformEditPart.VISUAL_ID:
			return getConnectionPlatform_3004ContainedLinks(view);
		case DeviceToConnectionEdgeEditPart.VISUAL_ID:
			return getDeviceToConnectionEdge_4001ContainedLinks(view);
		case ConnectionToDeviceEdgeEditPart.VISUAL_ID:
			return getConnectionToDeviceEdge_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getIncomingLinks(View view) {
		switch (DeploymentVisualIDRegistry.getVisualID(view)) {
		case ProgrammingLanguageEditPart.VISUAL_ID:
			return getProgrammingLanguage_2001IncomingLinks(view);
		case OperatingSystemEditPart.VISUAL_ID:
			return getOperatingSystem_2002IncomingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2003IncomingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2004IncomingLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2005IncomingLinks(view);
		case ProtocolEditPart.VISUAL_ID:
			return getProtocol_2006IncomingLinks(view);
		case DevicePlatformEditPart.VISUAL_ID:
			return getDevicePlatform_3001IncomingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_3002IncomingLinks(view);
		case InformationEditPart.VISUAL_ID:
			return getInformation_3003IncomingLinks(view);
		case ConnectionPlatformEditPart.VISUAL_ID:
			return getConnectionPlatform_3004IncomingLinks(view);
		case DeviceToConnectionEdgeEditPart.VISUAL_ID:
			return getDeviceToConnectionEdge_4001IncomingLinks(view);
		case ConnectionToDeviceEdgeEditPart.VISUAL_ID:
			return getConnectionToDeviceEdge_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getOutgoingLinks(View view) {
		switch (DeploymentVisualIDRegistry.getVisualID(view)) {
		case ProgrammingLanguageEditPart.VISUAL_ID:
			return getProgrammingLanguage_2001OutgoingLinks(view);
		case OperatingSystemEditPart.VISUAL_ID:
			return getOperatingSystem_2002OutgoingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2003OutgoingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2004OutgoingLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2005OutgoingLinks(view);
		case ProtocolEditPart.VISUAL_ID:
			return getProtocol_2006OutgoingLinks(view);
		case DevicePlatformEditPart.VISUAL_ID:
			return getDevicePlatform_3001OutgoingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_3002OutgoingLinks(view);
		case InformationEditPart.VISUAL_ID:
			return getInformation_3003OutgoingLinks(view);
		case ConnectionPlatformEditPart.VISUAL_ID:
			return getConnectionPlatform_3004OutgoingLinks(view);
		case DeviceToConnectionEdgeEditPart.VISUAL_ID:
			return getDeviceToConnectionEdge_4001OutgoingLinks(view);
		case ConnectionToDeviceEdgeEditPart.VISUAL_ID:
			return getConnectionToDeviceEdge_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getDevelopmentEnvironment_1000ContainedLinks(
			View view) {
		DevelopmentEnvironment modelElement = (DevelopmentEnvironment) view
				.getElement();
		LinkedList<DeploymentLinkDescriptor> result = new LinkedList<DeploymentLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_DeviceToConnectionEdge_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ConnectionToDeviceEdge_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getProgrammingLanguage_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getOperatingSystem_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getDevice_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getConnection_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getMedium_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getProtocol_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getDevicePlatform_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getEntity_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getInformation_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getConnectionPlatform_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getDeviceToConnectionEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getConnectionToDeviceEdge_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getProgrammingLanguage_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getOperatingSystem_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getDevice_2003IncomingLinks(
			View view) {
		Device modelElement = (Device) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeploymentLinkDescriptor> result = new LinkedList<DeploymentLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionToDeviceEdge_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getConnection_2004IncomingLinks(
			View view) {
		Connection modelElement = (Connection) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeploymentLinkDescriptor> result = new LinkedList<DeploymentLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DeviceToConnectionEdge_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getMedium_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getProtocol_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getDevicePlatform_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getEntity_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getInformation_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getConnectionPlatform_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getDeviceToConnectionEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getConnectionToDeviceEdge_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getProgrammingLanguage_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getOperatingSystem_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getDevice_2003OutgoingLinks(
			View view) {
		Device modelElement = (Device) view.getElement();
		LinkedList<DeploymentLinkDescriptor> result = new LinkedList<DeploymentLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DeviceToConnectionEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getConnection_2004OutgoingLinks(
			View view) {
		Connection modelElement = (Connection) view.getElement();
		LinkedList<DeploymentLinkDescriptor> result = new LinkedList<DeploymentLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionToDeviceEdge_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getMedium_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getProtocol_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getDevicePlatform_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getEntity_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getInformation_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getConnectionPlatform_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getDeviceToConnectionEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeploymentLinkDescriptor> getConnectionToDeviceEdge_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DeploymentLinkDescriptor> getContainedTypeModelFacetLinks_DeviceToConnectionEdge_4001(
			DevelopmentEnvironment container) {
		LinkedList<DeploymentLinkDescriptor> result = new LinkedList<DeploymentLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DeviceToConnectionEdge) {
				continue;
			}
			DeviceToConnectionEdge link = (DeviceToConnectionEdge) linkObject;
			if (DeviceToConnectionEdgeEditPart.VISUAL_ID != DeploymentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connection dst = link.getTarget();
			Device src = link.getSource();
			result.add(new DeploymentLinkDescriptor(src, dst, link,
					DeploymentElementTypes.DeviceToConnectionEdge_4001,
					DeviceToConnectionEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeploymentLinkDescriptor> getContainedTypeModelFacetLinks_ConnectionToDeviceEdge_4002(
			DevelopmentEnvironment container) {
		LinkedList<DeploymentLinkDescriptor> result = new LinkedList<DeploymentLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConnectionToDeviceEdge) {
				continue;
			}
			ConnectionToDeviceEdge link = (ConnectionToDeviceEdge) linkObject;
			if (ConnectionToDeviceEdgeEditPart.VISUAL_ID != DeploymentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Device dst = link.getTarget();
			Connection src = link.getSource();
			result.add(new DeploymentLinkDescriptor(src, dst, link,
					DeploymentElementTypes.ConnectionToDeviceEdge_4002,
					ConnectionToDeviceEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeploymentLinkDescriptor> getIncomingTypeModelFacetLinks_DeviceToConnectionEdge_4001(
			Connection target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeploymentLinkDescriptor> result = new LinkedList<DeploymentLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DemmPackage.eINSTANCE
					.getDeviceToConnectionEdge_Target()
					|| false == setting.getEObject() instanceof DeviceToConnectionEdge) {
				continue;
			}
			DeviceToConnectionEdge link = (DeviceToConnectionEdge) setting
					.getEObject();
			if (DeviceToConnectionEdgeEditPart.VISUAL_ID != DeploymentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Device src = link.getSource();
			result.add(new DeploymentLinkDescriptor(src, target, link,
					DeploymentElementTypes.DeviceToConnectionEdge_4001,
					DeviceToConnectionEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeploymentLinkDescriptor> getIncomingTypeModelFacetLinks_ConnectionToDeviceEdge_4002(
			Device target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeploymentLinkDescriptor> result = new LinkedList<DeploymentLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DemmPackage.eINSTANCE
					.getConnectionToDeviceEdge_Target()
					|| false == setting.getEObject() instanceof ConnectionToDeviceEdge) {
				continue;
			}
			ConnectionToDeviceEdge link = (ConnectionToDeviceEdge) setting
					.getEObject();
			if (ConnectionToDeviceEdgeEditPart.VISUAL_ID != DeploymentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connection src = link.getSource();
			result.add(new DeploymentLinkDescriptor(src, target, link,
					DeploymentElementTypes.ConnectionToDeviceEdge_4002,
					ConnectionToDeviceEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeploymentLinkDescriptor> getOutgoingTypeModelFacetLinks_DeviceToConnectionEdge_4001(
			Device source) {
		DevelopmentEnvironment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof DevelopmentEnvironment) {
				container = (DevelopmentEnvironment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeploymentLinkDescriptor> result = new LinkedList<DeploymentLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DeviceToConnectionEdge) {
				continue;
			}
			DeviceToConnectionEdge link = (DeviceToConnectionEdge) linkObject;
			if (DeviceToConnectionEdgeEditPart.VISUAL_ID != DeploymentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connection dst = link.getTarget();
			Device src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DeploymentLinkDescriptor(src, dst, link,
					DeploymentElementTypes.DeviceToConnectionEdge_4001,
					DeviceToConnectionEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeploymentLinkDescriptor> getOutgoingTypeModelFacetLinks_ConnectionToDeviceEdge_4002(
			Connection source) {
		DevelopmentEnvironment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof DevelopmentEnvironment) {
				container = (DevelopmentEnvironment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeploymentLinkDescriptor> result = new LinkedList<DeploymentLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConnectionToDeviceEdge) {
				continue;
			}
			ConnectionToDeviceEdge link = (ConnectionToDeviceEdge) linkObject;
			if (ConnectionToDeviceEdgeEditPart.VISUAL_ID != DeploymentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Device dst = link.getTarget();
			Connection src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DeploymentLinkDescriptor(src, dst, link,
					DeploymentElementTypes.ConnectionToDeviceEdge_4002,
					ConnectionToDeviceEdgeEditPart.VISUAL_ID));
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
		public List<DeploymentNodeDescriptor> getSemanticChildren(View view) {
			return DeploymentDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DeploymentLinkDescriptor> getContainedLinks(View view) {
			return DeploymentDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DeploymentLinkDescriptor> getIncomingLinks(View view) {
			return DeploymentDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DeploymentLinkDescriptor> getOutgoingLinks(View view) {
			return DeploymentDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
