package somm.diagram.providers;

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

import somm.SommPackage;
import somm.diagram.edit.parts.IndividualInstanceIdEditPart;
import somm.diagram.edit.parts.IndividualInstanceNameEditPart;
import somm.diagram.edit.parts.RoleIdEditPart;
import somm.diagram.edit.parts.RoleNameEditPart;
import somm.diagram.parsers.MessageFormatParser;
import somm.diagram.part.SocialVisualIDRegistry;

/**
 * @generated
 */
public class SocialParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser individualInstanceName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualInstanceName_5001Parser() {
		if (individualInstanceName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SommPackage.eINSTANCE
					.getIndividualInstance_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			individualInstanceName_5001Parser = parser;
		}
		return individualInstanceName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualInstanceId_5002Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualInstanceId_5002Parser() {
		if (individualInstanceId_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { SommPackage.eINSTANCE
					.getIndividualInstance_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			individualInstanceId_5002Parser = parser;
		}
		return individualInstanceId_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_5003Parser() {
		if (roleName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SommPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roleName_5003Parser = parser;
		}
		return roleName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleId_5004Parser;

	/**
	 * @generated
	 */
	private IParser getRoleId_5004Parser() {
		if (roleId_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SommPackage.eINSTANCE
					.getRole_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			roleId_5004Parser = parser;
		}
		return roleId_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case IndividualInstanceNameEditPart.VISUAL_ID:
			return getIndividualInstanceName_5001Parser();
		case IndividualInstanceIdEditPart.VISUAL_ID:
			return getIndividualInstanceId_5002Parser();
		case RoleNameEditPart.VISUAL_ID:
			return getRoleName_5003Parser();
		case RoleIdEditPart.VISUAL_ID:
			return getRoleId_5004Parser();
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
			return getParser(SocialVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SocialVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SocialElementTypes.getElement(hint) == null) {
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
