package ifmm.diagram.providers;

import ifmm.IfmmPackage;
import ifmm.diagram.edit.parts.BroadcastInformationFlowIdEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowNameEditPart;
import ifmm.diagram.edit.parts.ContextAwareEntityIdEditPart;
import ifmm.diagram.edit.parts.ContextAwareEntityNameEditPart;
import ifmm.diagram.edit.parts.InputDataDefinitionEditPart;
import ifmm.diagram.edit.parts.OutputDataDefinition2EditPart;
import ifmm.diagram.edit.parts.OutputDataDefinitionEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowIdEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowNameEditPart;
import ifmm.diagram.parsers.MessageFormatParser;
import ifmm.diagram.part.InformationFlowVisualIDRegistry;

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

/**
 * @generated
 */
public class InformationFlowParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser broadcastInformationFlowName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getBroadcastInformationFlowName_5002Parser() {
		if (broadcastInformationFlowName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { IfmmPackage.eINSTANCE
					.getInformationFlow_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			broadcastInformationFlowName_5002Parser = parser;
		}
		return broadcastInformationFlowName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser broadcastInformationFlowId_5003Parser;

	/**
	 * @generated
	 */
	private IParser getBroadcastInformationFlowId_5003Parser() {
		if (broadcastInformationFlowId_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { IfmmPackage.eINSTANCE
					.getInformationFlow_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			broadcastInformationFlowId_5003Parser = parser;
		}
		return broadcastInformationFlowId_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser pointToPointInformationFlowName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getPointToPointInformationFlowName_5006Parser() {
		if (pointToPointInformationFlowName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { IfmmPackage.eINSTANCE
					.getInformationFlow_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pointToPointInformationFlowName_5006Parser = parser;
		}
		return pointToPointInformationFlowName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser pointToPointInformationFlowId_5007Parser;

	/**
	 * @generated
	 */
	private IParser getPointToPointInformationFlowId_5007Parser() {
		if (pointToPointInformationFlowId_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { IfmmPackage.eINSTANCE
					.getInformationFlow_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			pointToPointInformationFlowId_5007Parser = parser;
		}
		return pointToPointInformationFlowId_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextAwareEntityName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getContextAwareEntityName_5008Parser() {
		if (contextAwareEntityName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { IfmmPackage.eINSTANCE
					.getContextAwareEntity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextAwareEntityName_5008Parser = parser;
		}
		return contextAwareEntityName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextAwareEntityId_5009Parser;

	/**
	 * @generated
	 */
	private IParser getContextAwareEntityId_5009Parser() {
		if (contextAwareEntityId_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { IfmmPackage.eINSTANCE
					.getContextAwareEntity_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			contextAwareEntityId_5009Parser = parser;
		}
		return contextAwareEntityId_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputDataDefinition_5001Parser;

	/**
	 * @generated
	 */
	private IParser getOutputDataDefinition_5001Parser() {
		if (outputDataDefinition_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { IfmmPackage.eINSTANCE
					.getData_Definition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputDataDefinition_5001Parser = parser;
		}
		return outputDataDefinition_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputDataDefinition_5004Parser;

	/**
	 * @generated
	 */
	private IParser getOutputDataDefinition_5004Parser() {
		if (outputDataDefinition_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { IfmmPackage.eINSTANCE
					.getData_Definition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputDataDefinition_5004Parser = parser;
		}
		return outputDataDefinition_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputDataDefinition_5005Parser;

	/**
	 * @generated
	 */
	private IParser getInputDataDefinition_5005Parser() {
		if (inputDataDefinition_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { IfmmPackage.eINSTANCE
					.getData_Definition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputDataDefinition_5005Parser = parser;
		}
		return inputDataDefinition_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case BroadcastInformationFlowNameEditPart.VISUAL_ID:
			return getBroadcastInformationFlowName_5002Parser();
		case BroadcastInformationFlowIdEditPart.VISUAL_ID:
			return getBroadcastInformationFlowId_5003Parser();
		case PointToPointInformationFlowNameEditPart.VISUAL_ID:
			return getPointToPointInformationFlowName_5006Parser();
		case PointToPointInformationFlowIdEditPart.VISUAL_ID:
			return getPointToPointInformationFlowId_5007Parser();
		case ContextAwareEntityNameEditPart.VISUAL_ID:
			return getContextAwareEntityName_5008Parser();
		case ContextAwareEntityIdEditPart.VISUAL_ID:
			return getContextAwareEntityId_5009Parser();
		case OutputDataDefinitionEditPart.VISUAL_ID:
			return getOutputDataDefinition_5001Parser();
		case OutputDataDefinition2EditPart.VISUAL_ID:
			return getOutputDataDefinition_5004Parser();
		case InputDataDefinitionEditPart.VISUAL_ID:
			return getInputDataDefinition_5005Parser();
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
			return getParser(InformationFlowVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(InformationFlowVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (InformationFlowElementTypes.getElement(hint) == null) {
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
