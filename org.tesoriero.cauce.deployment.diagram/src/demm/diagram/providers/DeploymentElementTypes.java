package demm.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import demm.DemmPackage;
import demm.diagram.edit.parts.ConnectionEditPart;
import demm.diagram.edit.parts.ConnectionPlatformEditPart;
import demm.diagram.edit.parts.ConnectionToDeviceEdgeEditPart;
import demm.diagram.edit.parts.DevelopmentEnvironmentEditPart;
import demm.diagram.edit.parts.DeviceEditPart;
import demm.diagram.edit.parts.DevicePlatformEditPart;
import demm.diagram.edit.parts.DeviceToConnectionEdgeEditPart;
import demm.diagram.edit.parts.EntityEditPart;
import demm.diagram.edit.parts.InformationEditPart;
import demm.diagram.edit.parts.MediumEditPart;
import demm.diagram.edit.parts.OperatingSystemEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageEditPart;
import demm.diagram.edit.parts.ProtocolEditPart;
import demm.diagram.part.DeploymentDiagramEditorPlugin;

/**
 * @generated
 */
public class DeploymentElementTypes {

	/**
	 * @generated
	 */
	private DeploymentElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DeploymentDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType DevelopmentEnvironment_1000 = getElementType("org.tesoriero.cauce.deployment.diagram.DevelopmentEnvironment_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProgrammingLanguage_2001 = getElementType("org.tesoriero.cauce.deployment.diagram.ProgrammingLanguage_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperatingSystem_2002 = getElementType("org.tesoriero.cauce.deployment.diagram.OperatingSystem_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Device_2003 = getElementType("org.tesoriero.cauce.deployment.diagram.Device_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_2004 = getElementType("org.tesoriero.cauce.deployment.diagram.Connection_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Medium_2005 = getElementType("org.tesoriero.cauce.deployment.diagram.Medium_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Protocol_2006 = getElementType("org.tesoriero.cauce.deployment.diagram.Protocol_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DevicePlatform_3001 = getElementType("org.tesoriero.cauce.deployment.diagram.DevicePlatform_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_3002 = getElementType("org.tesoriero.cauce.deployment.diagram.Entity_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Information_3003 = getElementType("org.tesoriero.cauce.deployment.diagram.Information_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionPlatform_3004 = getElementType("org.tesoriero.cauce.deployment.diagram.ConnectionPlatform_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeviceToConnectionEdge_4001 = getElementType("org.tesoriero.cauce.deployment.diagram.DeviceToConnectionEdge_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionToDeviceEdge_4002 = getElementType("org.tesoriero.cauce.deployment.diagram.ConnectionToDeviceEdge_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(DevelopmentEnvironment_1000,
					DemmPackage.eINSTANCE.getDevelopmentEnvironment());

			elements.put(ProgrammingLanguage_2001,
					DemmPackage.eINSTANCE.getProgrammingLanguage());

			elements.put(OperatingSystem_2002,
					DemmPackage.eINSTANCE.getOperatingSystem());

			elements.put(Device_2003, DemmPackage.eINSTANCE.getDevice());

			elements.put(Connection_2004, DemmPackage.eINSTANCE.getConnection());

			elements.put(Medium_2005, DemmPackage.eINSTANCE.getMedium());

			elements.put(Protocol_2006, DemmPackage.eINSTANCE.getProtocol());

			elements.put(DevicePlatform_3001,
					DemmPackage.eINSTANCE.getDevicePlatform());

			elements.put(Entity_3002, DemmPackage.eINSTANCE.getEntity());

			elements.put(Information_3003,
					DemmPackage.eINSTANCE.getInformation());

			elements.put(ConnectionPlatform_3004,
					DemmPackage.eINSTANCE.getConnectionPlatform());

			elements.put(DeviceToConnectionEdge_4001,
					DemmPackage.eINSTANCE.getDeviceToConnectionEdge());

			elements.put(ConnectionToDeviceEdge_4002,
					DemmPackage.eINSTANCE.getConnectionToDeviceEdge());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(DevelopmentEnvironment_1000);
			KNOWN_ELEMENT_TYPES.add(ProgrammingLanguage_2001);
			KNOWN_ELEMENT_TYPES.add(OperatingSystem_2002);
			KNOWN_ELEMENT_TYPES.add(Device_2003);
			KNOWN_ELEMENT_TYPES.add(Connection_2004);
			KNOWN_ELEMENT_TYPES.add(Medium_2005);
			KNOWN_ELEMENT_TYPES.add(Protocol_2006);
			KNOWN_ELEMENT_TYPES.add(DevicePlatform_3001);
			KNOWN_ELEMENT_TYPES.add(Entity_3002);
			KNOWN_ELEMENT_TYPES.add(Information_3003);
			KNOWN_ELEMENT_TYPES.add(ConnectionPlatform_3004);
			KNOWN_ELEMENT_TYPES.add(DeviceToConnectionEdge_4001);
			KNOWN_ELEMENT_TYPES.add(ConnectionToDeviceEdge_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DevelopmentEnvironmentEditPart.VISUAL_ID:
			return DevelopmentEnvironment_1000;
		case ProgrammingLanguageEditPart.VISUAL_ID:
			return ProgrammingLanguage_2001;
		case OperatingSystemEditPart.VISUAL_ID:
			return OperatingSystem_2002;
		case DeviceEditPart.VISUAL_ID:
			return Device_2003;
		case ConnectionEditPart.VISUAL_ID:
			return Connection_2004;
		case MediumEditPart.VISUAL_ID:
			return Medium_2005;
		case ProtocolEditPart.VISUAL_ID:
			return Protocol_2006;
		case DevicePlatformEditPart.VISUAL_ID:
			return DevicePlatform_3001;
		case EntityEditPart.VISUAL_ID:
			return Entity_3002;
		case InformationEditPart.VISUAL_ID:
			return Information_3003;
		case ConnectionPlatformEditPart.VISUAL_ID:
			return ConnectionPlatform_3004;
		case DeviceToConnectionEdgeEditPart.VISUAL_ID:
			return DeviceToConnectionEdge_4001;
		case ConnectionToDeviceEdgeEditPart.VISUAL_ID:
			return ConnectionToDeviceEdge_4002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return demm.diagram.providers.DeploymentElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return demm.diagram.providers.DeploymentElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return demm.diagram.providers.DeploymentElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
