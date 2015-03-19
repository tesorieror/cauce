package demm.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import demm.diagram.part.DeploymentVisualIDRegistry;

/**
 * @generated
 */
public class DeploymentEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DeploymentVisualIDRegistry.getVisualID(view)) {

			case DevelopmentEnvironmentEditPart.VISUAL_ID:
				return new DevelopmentEnvironmentEditPart(view);

			case ProgrammingLanguageEditPart.VISUAL_ID:
				return new ProgrammingLanguageEditPart(view);

			case ProgrammingLanguageNameEditPart.VISUAL_ID:
				return new ProgrammingLanguageNameEditPart(view);

			case ProgrammingLanguageProfileEditPart.VISUAL_ID:
				return new ProgrammingLanguageProfileEditPart(view);

			case ProgrammingLanguageVersionEditPart.VISUAL_ID:
				return new ProgrammingLanguageVersionEditPart(view);

			case ProgrammingLanguageRevisionEditPart.VISUAL_ID:
				return new ProgrammingLanguageRevisionEditPart(view);

			case OperatingSystemEditPart.VISUAL_ID:
				return new OperatingSystemEditPart(view);

			case OperatingSystemNameEditPart.VISUAL_ID:
				return new OperatingSystemNameEditPart(view);

			case OperatingSystemVersionEditPart.VISUAL_ID:
				return new OperatingSystemVersionEditPart(view);

			case OperatingSystemRevisionEditPart.VISUAL_ID:
				return new OperatingSystemRevisionEditPart(view);

			case DeviceEditPart.VISUAL_ID:
				return new DeviceEditPart(view);

			case DeviceNameEditPart.VISUAL_ID:
				return new DeviceNameEditPart(view);

			case DeviceIdEditPart.VISUAL_ID:
				return new DeviceIdEditPart(view);

			case ConnectionEditPart.VISUAL_ID:
				return new ConnectionEditPart(view);

			case ConnectionNameEditPart.VISUAL_ID:
				return new ConnectionNameEditPart(view);

			case ConnectionIdEditPart.VISUAL_ID:
				return new ConnectionIdEditPart(view);

			case MediumEditPart.VISUAL_ID:
				return new MediumEditPart(view);

			case MediumVersionEditPart.VISUAL_ID:
				return new MediumVersionEditPart(view);

			case MediumTypeEditPart.VISUAL_ID:
				return new MediumTypeEditPart(view);

			case MediumTechnologyEditPart.VISUAL_ID:
				return new MediumTechnologyEditPart(view);

			case ProtocolEditPart.VISUAL_ID:
				return new ProtocolEditPart(view);

			case ProtocolNameEditPart.VISUAL_ID:
				return new ProtocolNameEditPart(view);

			case ProtocolVersionEditPart.VISUAL_ID:
				return new ProtocolVersionEditPart(view);

			case DevicePlatformEditPart.VISUAL_ID:
				return new DevicePlatformEditPart(view);

			case DevicePlatformNameEditPart.VISUAL_ID:
				return new DevicePlatformNameEditPart(view);

			case DevicePlatformIdEditPart.VISUAL_ID:
				return new DevicePlatformIdEditPart(view);

			case EntityEditPart.VISUAL_ID:
				return new EntityEditPart(view);

			case EntityNameEditPart.VISUAL_ID:
				return new EntityNameEditPart(view);

			case InformationEditPart.VISUAL_ID:
				return new InformationEditPart(view);

			case InformationNameEditPart.VISUAL_ID:
				return new InformationNameEditPart(view);

			case ConnectionPlatformEditPart.VISUAL_ID:
				return new ConnectionPlatformEditPart(view);

			case ConnectionPlatformNameEditPart.VISUAL_ID:
				return new ConnectionPlatformNameEditPart(view);

			case ConnectionPlatformIdEditPart.VISUAL_ID:
				return new ConnectionPlatformIdEditPart(view);

			case DeviceDevicePlatformCompartmentEditPart.VISUAL_ID:
				return new DeviceDevicePlatformCompartmentEditPart(view);

			case DeviceEntityCompartmentEditPart.VISUAL_ID:
				return new DeviceEntityCompartmentEditPart(view);

			case ConnectionConnectionPlatformCompartmentEditPart.VISUAL_ID:
				return new ConnectionConnectionPlatformCompartmentEditPart(view);

			case ConnectionInformationCompartmentEditPart.VISUAL_ID:
				return new ConnectionInformationCompartmentEditPart(view);

			case DeviceToConnectionEdgeEditPart.VISUAL_ID:
				return new DeviceToConnectionEdgeEditPart(view);

			case ConnectionToDeviceEdgeEditPart.VISUAL_ID:
				return new ConnectionToDeviceEdgeEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
