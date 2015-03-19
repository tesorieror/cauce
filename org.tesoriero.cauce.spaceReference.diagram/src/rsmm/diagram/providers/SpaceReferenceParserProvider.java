package rsmm.diagram.providers;

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

import rsmm.RsmmPackage;
import rsmm.diagram.edit.parts.ContextAwareEntityReferenceEntityEditPart;
import rsmm.diagram.edit.parts.ContextAwareEntityReferenceIdEditPart;
import rsmm.diagram.edit.parts.ContextAwareEntityReferenceNameEditPart;
import rsmm.diagram.edit.parts.ReferentialSpaceIdEditPart;
import rsmm.diagram.edit.parts.ReferentialSpaceNameEditPart;
import rsmm.diagram.edit.parts.SpaceToEntityReferenceDependencyCardinalityEditPart;
import rsmm.diagram.edit.parts.SpaceToSpaceReferenceDependencyCardinalityEditPart;
import rsmm.diagram.parsers.MessageFormatParser;
import rsmm.diagram.part.SpaceReferenceVisualIDRegistry;

/**
 * @generated
 */
public class SpaceReferenceParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser contextAwareEntityReferenceName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getContextAwareEntityReferenceName_5001Parser() {
		if (contextAwareEntityReferenceName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { RsmmPackage.eINSTANCE
					.getContextAwareEntityReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextAwareEntityReferenceName_5001Parser = parser;
		}
		return contextAwareEntityReferenceName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextAwareEntityReferenceEntity_5002Parser;

	/**
	 * @generated
	 */
	private IParser getContextAwareEntityReferenceEntity_5002Parser() {
		if (contextAwareEntityReferenceEntity_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { RsmmPackage.eINSTANCE
					.getContextAwareEntityReference_Entity() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("[{0}]"); //$NON-NLS-1$
			parser.setEditorPattern("[{0}]"); //$NON-NLS-1$
			parser.setEditPattern("[{0}]"); //$NON-NLS-1$
			contextAwareEntityReferenceEntity_5002Parser = parser;
		}
		return contextAwareEntityReferenceEntity_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextAwareEntityReferenceId_5003Parser;

	/**
	 * @generated
	 */
	private IParser getContextAwareEntityReferenceId_5003Parser() {
		if (contextAwareEntityReferenceId_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { RsmmPackage.eINSTANCE
					.getContextAwareEntityReference_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			contextAwareEntityReferenceId_5003Parser = parser;
		}
		return contextAwareEntityReferenceId_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser referentialSpaceName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getReferentialSpaceName_5004Parser() {
		if (referentialSpaceName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { RsmmPackage.eINSTANCE
					.getReferentialSpace_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			referentialSpaceName_5004Parser = parser;
		}
		return referentialSpaceName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser referentialSpaceId_5005Parser;

	/**
	 * @generated
	 */
	private IParser getReferentialSpaceId_5005Parser() {
		if (referentialSpaceId_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { RsmmPackage.eINSTANCE
					.getReferentialSpace_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			referentialSpaceId_5005Parser = parser;
		}
		return referentialSpaceId_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser spaceToSpaceReferenceDependencyCardinality_6001Parser;

	/**
	 * @generated
	 */
	private IParser getSpaceToSpaceReferenceDependencyCardinality_6001Parser() {
		if (spaceToSpaceReferenceDependencyCardinality_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { RsmmPackage.eINSTANCE
					.getReferenceDependency_Cardinality() };
			MessageFormatParser parser = new MessageFormatParser(features);
			spaceToSpaceReferenceDependencyCardinality_6001Parser = parser;
		}
		return spaceToSpaceReferenceDependencyCardinality_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser spaceToEntityReferenceDependencyCardinality_6002Parser;

	/**
	 * @generated
	 */
	private IParser getSpaceToEntityReferenceDependencyCardinality_6002Parser() {
		if (spaceToEntityReferenceDependencyCardinality_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { RsmmPackage.eINSTANCE
					.getReferenceDependency_Cardinality() };
			MessageFormatParser parser = new MessageFormatParser(features);
			spaceToEntityReferenceDependencyCardinality_6002Parser = parser;
		}
		return spaceToEntityReferenceDependencyCardinality_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ContextAwareEntityReferenceNameEditPart.VISUAL_ID:
			return getContextAwareEntityReferenceName_5001Parser();
		case ContextAwareEntityReferenceEntityEditPart.VISUAL_ID:
			return getContextAwareEntityReferenceEntity_5002Parser();
		case ContextAwareEntityReferenceIdEditPart.VISUAL_ID:
			return getContextAwareEntityReferenceId_5003Parser();
		case ReferentialSpaceNameEditPart.VISUAL_ID:
			return getReferentialSpaceName_5004Parser();
		case ReferentialSpaceIdEditPart.VISUAL_ID:
			return getReferentialSpaceId_5005Parser();
		case SpaceToSpaceReferenceDependencyCardinalityEditPart.VISUAL_ID:
			return getSpaceToSpaceReferenceDependencyCardinality_6001Parser();
		case SpaceToEntityReferenceDependencyCardinalityEditPart.VISUAL_ID:
			return getSpaceToEntityReferenceDependencyCardinality_6002Parser();
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
			return getParser(SpaceReferenceVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SpaceReferenceVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SpaceReferenceElementTypes.getElement(hint) == null) {
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
