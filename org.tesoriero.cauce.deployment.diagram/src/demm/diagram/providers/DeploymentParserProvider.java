package demm.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import demm.DemmPackage;
import demm.diagram.edit.parts.ConnectionIdEditPart;
import demm.diagram.edit.parts.ConnectionNameEditPart;
import demm.diagram.edit.parts.ConnectionPlatformIdEditPart;
import demm.diagram.edit.parts.ConnectionPlatformNameEditPart;
import demm.diagram.edit.parts.DeviceIdEditPart;
import demm.diagram.edit.parts.DeviceNameEditPart;
import demm.diagram.edit.parts.DevicePlatformIdEditPart;
import demm.diagram.edit.parts.DevicePlatformNameEditPart;
import demm.diagram.edit.parts.EntityNameEditPart;
import demm.diagram.edit.parts.InformationNameEditPart;
import demm.diagram.edit.parts.MediumTechnologyEditPart;
import demm.diagram.edit.parts.MediumTypeEditPart;
import demm.diagram.edit.parts.MediumVersionEditPart;
import demm.diagram.edit.parts.OperatingSystemNameEditPart;
import demm.diagram.edit.parts.OperatingSystemRevisionEditPart;
import demm.diagram.edit.parts.OperatingSystemVersionEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageNameEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageProfileEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageRevisionEditPart;
import demm.diagram.edit.parts.ProgrammingLanguageVersionEditPart;
import demm.diagram.edit.parts.ProtocolNameEditPart;
import demm.diagram.edit.parts.ProtocolVersionEditPart;
import demm.diagram.parsers.MessageFormatParser;
import demm.diagram.part.DeploymentVisualIDRegistry;

/**
 * @generated
 */
public class DeploymentParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser programmingLanguageName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getProgrammingLanguageName_5001Parser() {
		if (programmingLanguageName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getProgrammingLanguage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			programmingLanguageName_5001Parser = parser;
		}
		return programmingLanguageName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser programmingLanguageProfile_5002Parser;

	/**
	 * @generated
	 */
	private IParser getProgrammingLanguageProfile_5002Parser() {
		if (programmingLanguageProfile_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getProgrammingLanguage_Profile() };
			MessageFormatParser parser = new MessageFormatParser(features);
			programmingLanguageProfile_5002Parser = parser;
		}
		return programmingLanguageProfile_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser programmingLanguageVersion_5003Parser;

	/**
	 * @generated
	 */
	private IParser getProgrammingLanguageVersion_5003Parser() {
		if (programmingLanguageVersion_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getProgrammingLanguage_Version() };
			MessageFormatParser parser = new MessageFormatParser(features);
			programmingLanguageVersion_5003Parser = parser;
		}
		return programmingLanguageVersion_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser programmingLanguageRevision_5004Parser;

	/**
	 * @generated
	 */
	private IParser getProgrammingLanguageRevision_5004Parser() {
		if (programmingLanguageRevision_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getProgrammingLanguage_Revision() };
			MessageFormatParser parser = new MessageFormatParser(features);
			programmingLanguageRevision_5004Parser = parser;
		}
		return programmingLanguageRevision_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser operatingSystemName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getOperatingSystemName_5005Parser() {
		if (operatingSystemName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getOperatingSystem_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operatingSystemName_5005Parser = parser;
		}
		return operatingSystemName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser operatingSystemVersion_5006Parser;

	/**
	 * @generated
	 */
	private IParser getOperatingSystemVersion_5006Parser() {
		if (operatingSystemVersion_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getOperatingSystem_Version() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operatingSystemVersion_5006Parser = parser;
		}
		return operatingSystemVersion_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser operatingSystemRevision_5007Parser;

	/**
	 * @generated
	 */
	private IParser getOperatingSystemRevision_5007Parser() {
		if (operatingSystemRevision_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getOperatingSystem_Revision() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operatingSystemRevision_5007Parser = parser;
		}
		return operatingSystemRevision_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceName_5011Parser() {
		if (deviceName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getDevice_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deviceName_5011Parser = parser;
		}
		return deviceName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceId_5012Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceId_5012Parser() {
		if (deviceId_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getDevice_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			deviceId_5012Parser = parser;
		}
		return deviceId_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionName_5016Parser() {
		if (connectionName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getConnection_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionName_5016Parser = parser;
		}
		return connectionName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionId_5017Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionId_5017Parser() {
		if (connectionId_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getConnection_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			connectionId_5017Parser = parser;
		}
		return connectionId_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumVersion_5018Parser;

	/**
	 * @generated
	 */
	private IParser getMediumVersion_5018Parser() {
		if (mediumVersion_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getMedium_Version() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mediumVersion_5018Parser = parser;
		}
		return mediumVersion_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumType_5019Parser;

	/**
	 * @generated
	 */
	private IParser getMediumType_5019Parser() {
		if (mediumType_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getMedium_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mediumType_5019Parser = parser;
		}
		return mediumType_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser mediumTechnology_5020Parser;

	/**
	 * @generated
	 */
	private IParser getMediumTechnology_5020Parser() {
		if (mediumTechnology_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getMedium_Technology() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mediumTechnology_5020Parser = parser;
		}
		return mediumTechnology_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser protocolName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getProtocolName_5021Parser() {
		if (protocolName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getProtocol_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			protocolName_5021Parser = parser;
		}
		return protocolName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser protocolVersion_5022Parser;

	/**
	 * @generated
	 */
	private IParser getProtocolVersion_5022Parser() {
		if (protocolVersion_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getProtocol_Version() };
			MessageFormatParser parser = new MessageFormatParser(features);
			protocolVersion_5022Parser = parser;
		}
		return protocolVersion_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser devicePlatformName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getDevicePlatformName_5008Parser() {
		if (devicePlatformName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getPlatform_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			devicePlatformName_5008Parser = parser;
		}
		return devicePlatformName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser devicePlatformId_5009Parser;

	/**
	 * @generated
	 */
	private IParser getDevicePlatformId_5009Parser() {
		if (devicePlatformId_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getPlatform_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			devicePlatformId_5009Parser = parser;
		}
		return devicePlatformId_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getEntityName_5010Parser() {
		if (entityName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getEntity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5010Parser = parser;
		}
		return entityName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser informationName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getInformationName_5013Parser() {
		if (informationName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getInformation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			informationName_5013Parser = parser;
		}
		return informationName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionPlatformName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionPlatformName_5014Parser() {
		if (connectionPlatformName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getPlatform_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionPlatformName_5014Parser = parser;
		}
		return connectionPlatformName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionPlatformId_5015Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionPlatformId_5015Parser() {
		if (connectionPlatformId_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { DemmPackage.eINSTANCE
					.getPlatform_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			connectionPlatformId_5015Parser = parser;
		}
		return connectionPlatformId_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ProgrammingLanguageNameEditPart.VISUAL_ID:
			return getProgrammingLanguageName_5001Parser();
		case ProgrammingLanguageProfileEditPart.VISUAL_ID:
			return getProgrammingLanguageProfile_5002Parser();
		case ProgrammingLanguageVersionEditPart.VISUAL_ID:
			return getProgrammingLanguageVersion_5003Parser();
		case ProgrammingLanguageRevisionEditPart.VISUAL_ID:
			return getProgrammingLanguageRevision_5004Parser();
		case OperatingSystemNameEditPart.VISUAL_ID:
			return getOperatingSystemName_5005Parser();
		case OperatingSystemVersionEditPart.VISUAL_ID:
			return getOperatingSystemVersion_5006Parser();
		case OperatingSystemRevisionEditPart.VISUAL_ID:
			return getOperatingSystemRevision_5007Parser();
		case DeviceNameEditPart.VISUAL_ID:
			return getDeviceName_5011Parser();
		case DeviceIdEditPart.VISUAL_ID:
			return getDeviceId_5012Parser();
		case ConnectionNameEditPart.VISUAL_ID:
			return getConnectionName_5016Parser();
		case ConnectionIdEditPart.VISUAL_ID:
			return getConnectionId_5017Parser();
		case MediumVersionEditPart.VISUAL_ID:
			return getMediumVersion_5018Parser();
		case MediumTypeEditPart.VISUAL_ID:
			return getMediumType_5019Parser();
		case MediumTechnologyEditPart.VISUAL_ID:
			return getMediumTechnology_5020Parser();
		case ProtocolNameEditPart.VISUAL_ID:
			return getProtocolName_5021Parser();
		case ProtocolVersionEditPart.VISUAL_ID:
			return getProtocolVersion_5022Parser();
		case DevicePlatformNameEditPart.VISUAL_ID:
			return getDevicePlatformName_5008Parser();
		case DevicePlatformIdEditPart.VISUAL_ID:
			return getDevicePlatformId_5009Parser();
		case EntityNameEditPart.VISUAL_ID:
			return getEntityName_5010Parser();
		case InformationNameEditPart.VISUAL_ID:
			return getInformationName_5013Parser();
		case ConnectionPlatformNameEditPart.VISUAL_ID:
			return getConnectionPlatformName_5014Parser();
		case ConnectionPlatformIdEditPart.VISUAL_ID:
			return getConnectionPlatformId_5015Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DeploymentVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DeploymentVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DeploymentElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
