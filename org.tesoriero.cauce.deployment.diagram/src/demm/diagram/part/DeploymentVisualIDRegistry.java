package demm.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import demm.DemmPackage;
import demm.DevelopmentEnvironment;
import demm.diagram.edit.parts.ConnectionConnectionPlatformCompartmentEditPart;
import demm.diagram.edit.parts.ConnectionEditPart;
import demm.diagram.edit.parts.ConnectionIdEditPart;
import demm.diagram.edit.parts.ConnectionInformationCompartmentEditPart;
import demm.diagram.edit.parts.ConnectionNameEditPart;
import demm.diagram.edit.parts.ConnectionPlatformEditPart;
import demm.diagram.edit.parts.ConnectionPlatformIdEditPart;
import demm.diagram.edit.parts.ConnectionPlatformNameEditPart;
import demm.diagram.edit.parts.ConnectionToDeviceEdgeEditPart;
import demm.diagram.edit.parts.DevelopmentEnvironmentEditPart;
import demm.diagram.edit.parts.DeviceDevicePlatformCompartmentEditPart;
import demm.diagram.edit.parts.DeviceEditPart;
import demm.diagram.edit.parts.DeviceEntityCompartmentEditPart;
import demm.diagram.edit.parts.DeviceIdEditPart;
import demm.diagram.edit.parts.DeviceNameEditPart;
import demm.diagram.edit.parts.DevicePlatformEditPart;
import demm.diagram.edit.parts.DevicePlatformIdEditPart;
import demm.diagram.edit.parts.DevicePlatformNameEditPart;
import demm.diagram.edit.parts.DeviceToConnectionEdgeEditPart;
import demm.diagram.edit.parts.EntityEditPart;
import demm.diagram.edit.parts.EntityNameEditPart;
import demm.diagram.edit.parts.InformationEditPart;
import demm.diagram.edit.parts.InformationNameEditPart;
import demm.diagram.edit.parts.MediumEditPart;
import demm.diagram.edit.parts.MediumTechnologyEditPart;
import demm.diagram.edit.parts.MediumTypeEditPart;
import demm.diagram.edit.parts.MediumVersionEditPart;
import demm.diagram.edit.parts.OperatingSystemEditPart;
import demm.diagram.edit.parts.OperatingSystemNameEditPart;
import demm.diagram.edit.parts.OperatingSystemRevisionEditPart;
import demm.diagram.edit.parts.OperatingSystemVersionEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageNameEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageProfileEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageRevisionEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageVersionEditPart;
import demm.diagram.edit.parts.ProtocolEditPart;
import demm.diagram.edit.parts.ProtocolNameEditPart;
import demm.diagram.edit.parts.ProtocolVersionEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DeploymentVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tesoriero.cauce.deployment.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DevelopmentEnvironmentEditPart.MODEL_ID.equals(view.getType())) {
				return DevelopmentEnvironmentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return demm.diagram.part.DeploymentVisualIDRegistry.getVisualID(view
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
				DeploymentDiagramEditorPlugin.getInstance().logError(
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
		if (DemmPackage.eINSTANCE.getDevelopmentEnvironment().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((DevelopmentEnvironment) domainElement)) {
			return DevelopmentEnvironmentEditPart.VISUAL_ID;
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
		String containerModelID = demm.diagram.part.DeploymentVisualIDRegistry
				.getModelID(containerView);
		if (!DevelopmentEnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DevelopmentEnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = demm.diagram.part.DeploymentVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DevelopmentEnvironmentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DevelopmentEnvironmentEditPart.VISUAL_ID:
			if (DemmPackage.eINSTANCE.getProgrammingLanguage().isSuperTypeOf(
					domainElement.eClass())) {
				return ProgrammingLanguageEditPart.VISUAL_ID;
			}
			if (DemmPackage.eINSTANCE.getOperatingSystem().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatingSystemEditPart.VISUAL_ID;
			}
			if (DemmPackage.eINSTANCE.getDevice().isSuperTypeOf(
					domainElement.eClass())) {
				return DeviceEditPart.VISUAL_ID;
			}
			if (DemmPackage.eINSTANCE.getConnection().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectionEditPart.VISUAL_ID;
			}
			if (DemmPackage.eINSTANCE.getMedium().isSuperTypeOf(
					domainElement.eClass())) {
				return MediumEditPart.VISUAL_ID;
			}
			if (DemmPackage.eINSTANCE.getProtocol().isSuperTypeOf(
					domainElement.eClass())) {
				return ProtocolEditPart.VISUAL_ID;
			}
			break;
		case DeviceDevicePlatformCompartmentEditPart.VISUAL_ID:
			if (DemmPackage.eINSTANCE.getDevicePlatform().isSuperTypeOf(
					domainElement.eClass())) {
				return DevicePlatformEditPart.VISUAL_ID;
			}
			break;
		case DeviceEntityCompartmentEditPart.VISUAL_ID:
			if (DemmPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			break;
		case ConnectionConnectionPlatformCompartmentEditPart.VISUAL_ID:
			if (DemmPackage.eINSTANCE.getConnectionPlatform().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectionPlatformEditPart.VISUAL_ID;
			}
			break;
		case ConnectionInformationCompartmentEditPart.VISUAL_ID:
			if (DemmPackage.eINSTANCE.getInformation().isSuperTypeOf(
					domainElement.eClass())) {
				return InformationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = demm.diagram.part.DeploymentVisualIDRegistry
				.getModelID(containerView);
		if (!DevelopmentEnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DevelopmentEnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = demm.diagram.part.DeploymentVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DevelopmentEnvironmentEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DevelopmentEnvironmentEditPart.VISUAL_ID:
			if (ProgrammingLanguageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatingSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediumEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProtocolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProgrammingLanguageEditPart.VISUAL_ID:
			if (ProgrammingLanguageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProgrammingLanguageProfileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProgrammingLanguageVersionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProgrammingLanguageRevisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperatingSystemEditPart.VISUAL_ID:
			if (OperatingSystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatingSystemVersionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatingSystemRevisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceEditPart.VISUAL_ID:
			if (DeviceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceDevicePlatformCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceEntityCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionEditPart.VISUAL_ID:
			if (ConnectionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionConnectionPlatformCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionInformationCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediumEditPart.VISUAL_ID:
			if (MediumVersionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediumTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediumTechnologyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProtocolEditPart.VISUAL_ID:
			if (ProtocolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProtocolVersionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DevicePlatformEditPart.VISUAL_ID:
			if (DevicePlatformNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DevicePlatformIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InformationEditPart.VISUAL_ID:
			if (InformationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionPlatformEditPart.VISUAL_ID:
			if (ConnectionPlatformNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionPlatformIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceDevicePlatformCompartmentEditPart.VISUAL_ID:
			if (DevicePlatformEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceEntityCompartmentEditPart.VISUAL_ID:
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionConnectionPlatformCompartmentEditPart.VISUAL_ID:
			if (ConnectionPlatformEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionInformationCompartmentEditPart.VISUAL_ID:
			if (InformationEditPart.VISUAL_ID == nodeVisualID) {
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
		if (DemmPackage.eINSTANCE.getDeviceToConnectionEdge().isSuperTypeOf(
				domainElement.eClass())) {
			return DeviceToConnectionEdgeEditPart.VISUAL_ID;
		}
		if (DemmPackage.eINSTANCE.getConnectionToDeviceEdge().isSuperTypeOf(
				domainElement.eClass())) {
			return ConnectionToDeviceEdgeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(DevelopmentEnvironment element) {
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
		case DeviceDevicePlatformCompartmentEditPart.VISUAL_ID:
		case DeviceEntityCompartmentEditPart.VISUAL_ID:
		case ConnectionConnectionPlatformCompartmentEditPart.VISUAL_ID:
		case ConnectionInformationCompartmentEditPart.VISUAL_ID:
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
		case DevelopmentEnvironmentEditPart.VISUAL_ID:
			return false;
		case ProgrammingLanguageEditPart.VISUAL_ID:
		case OperatingSystemEditPart.VISUAL_ID:
		case MediumEditPart.VISUAL_ID:
		case ProtocolEditPart.VISUAL_ID:
		case DevicePlatformEditPart.VISUAL_ID:
		case EntityEditPart.VISUAL_ID:
		case InformationEditPart.VISUAL_ID:
		case ConnectionPlatformEditPart.VISUAL_ID:
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
			return demm.diagram.part.DeploymentVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return demm.diagram.part.DeploymentVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return demm.diagram.part.DeploymentVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return demm.diagram.part.DeploymentVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return demm.diagram.part.DeploymentVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return demm.diagram.part.DeploymentVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
