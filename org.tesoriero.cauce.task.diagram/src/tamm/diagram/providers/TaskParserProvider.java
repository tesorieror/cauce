package tamm.diagram.providers;

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

import tamm.TammPackage;
import tamm.diagram.edit.parts.FinalConditionDataExpressionEditPart;
import tamm.diagram.edit.parts.FinalConditionLogicExpressionEditPart;
import tamm.diagram.edit.parts.FinalConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.FinalConditionSpaceExpressionEditPart;
import tamm.diagram.edit.parts.FinalConditionTaskExpressionEditPart;
import tamm.diagram.edit.parts.InitialConditionDataExpressionEditPart;
import tamm.diagram.edit.parts.InitialConditionLogicExpressionEditPart;
import tamm.diagram.edit.parts.InitialConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.InitialConditionSpaceExpressionEditPart;
import tamm.diagram.edit.parts.InitialConditionTaskExpressionEditPart;
import tamm.diagram.edit.parts.PostConditionDataExpressionEditPart;
import tamm.diagram.edit.parts.PostConditionLogicExpressionEditPart;
import tamm.diagram.edit.parts.PostConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.PostConditionSpaceExpressionEditPart;
import tamm.diagram.edit.parts.PostConditionTaskExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionDataExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionLogicExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionSocialExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionSpaceExpressionEditPart;
import tamm.diagram.edit.parts.PreConditionTaskExpressionEditPart;
import tamm.diagram.edit.parts.SimpleTaskNameEditPart;
import tamm.diagram.parsers.MessageFormatParser;
import tamm.diagram.part.TaskVisualIDRegistry;

/**
 * @generated
 */
public class TaskParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser preConditionSocialExpression_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPreConditionSocialExpression_5001Parser() {
		if (preConditionSocialExpression_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_SocialExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("So: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			preConditionSocialExpression_5001Parser = parser;
		}
		return preConditionSocialExpression_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser preConditionTaskExpression_5002Parser;

	/**
	 * @generated
	 */
	private IParser getPreConditionTaskExpression_5002Parser() {
		if (preConditionTaskExpression_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_TaskExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Ta: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			preConditionTaskExpression_5002Parser = parser;
		}
		return preConditionTaskExpression_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser preConditionSpaceExpression_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPreConditionSpaceExpression_5003Parser() {
		if (preConditionSpaceExpression_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_SpaceExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Sp: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			preConditionSpaceExpression_5003Parser = parser;
		}
		return preConditionSpaceExpression_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser preConditionLogicExpression_5004Parser;

	/**
	 * @generated
	 */
	private IParser getPreConditionLogicExpression_5004Parser() {
		if (preConditionLogicExpression_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_LogicExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Lo: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			preConditionLogicExpression_5004Parser = parser;
		}
		return preConditionLogicExpression_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser preConditionDataExpression_5005Parser;

	/**
	 * @generated
	 */
	private IParser getPreConditionDataExpression_5005Parser() {
		if (preConditionDataExpression_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_DataExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Da: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			preConditionDataExpression_5005Parser = parser;
		}
		return preConditionDataExpression_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser postConditionSocialExpression_5006Parser;

	/**
	 * @generated
	 */
	private IParser getPostConditionSocialExpression_5006Parser() {
		if (postConditionSocialExpression_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_SocialExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("So: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			postConditionSocialExpression_5006Parser = parser;
		}
		return postConditionSocialExpression_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser postConditionTaskExpression_5007Parser;

	/**
	 * @generated
	 */
	private IParser getPostConditionTaskExpression_5007Parser() {
		if (postConditionTaskExpression_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_TaskExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Ta: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			postConditionTaskExpression_5007Parser = parser;
		}
		return postConditionTaskExpression_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser postConditionSpaceExpression_5008Parser;

	/**
	 * @generated
	 */
	private IParser getPostConditionSpaceExpression_5008Parser() {
		if (postConditionSpaceExpression_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_SpaceExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Sp: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			postConditionSpaceExpression_5008Parser = parser;
		}
		return postConditionSpaceExpression_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser postConditionLogicExpression_5009Parser;

	/**
	 * @generated
	 */
	private IParser getPostConditionLogicExpression_5009Parser() {
		if (postConditionLogicExpression_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_LogicExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Lo: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			postConditionLogicExpression_5009Parser = parser;
		}
		return postConditionLogicExpression_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser postConditionDataExpression_5010Parser;

	/**
	 * @generated
	 */
	private IParser getPostConditionDataExpression_5010Parser() {
		if (postConditionDataExpression_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_DataExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Da: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			postConditionDataExpression_5010Parser = parser;
		}
		return postConditionDataExpression_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser finalConditionSocialExpression_5011Parser;

	/**
	 * @generated
	 */
	private IParser getFinalConditionSocialExpression_5011Parser() {
		if (finalConditionSocialExpression_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_SocialExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("So: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			finalConditionSocialExpression_5011Parser = parser;
		}
		return finalConditionSocialExpression_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser finalConditionTaskExpression_5012Parser;

	/**
	 * @generated
	 */
	private IParser getFinalConditionTaskExpression_5012Parser() {
		if (finalConditionTaskExpression_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_TaskExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Ta: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			finalConditionTaskExpression_5012Parser = parser;
		}
		return finalConditionTaskExpression_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser finalConditionSpaceExpression_5013Parser;

	/**
	 * @generated
	 */
	private IParser getFinalConditionSpaceExpression_5013Parser() {
		if (finalConditionSpaceExpression_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_SpaceExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Sp: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			finalConditionSpaceExpression_5013Parser = parser;
		}
		return finalConditionSpaceExpression_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser finalConditionLogicExpression_5014Parser;

	/**
	 * @generated
	 */
	private IParser getFinalConditionLogicExpression_5014Parser() {
		if (finalConditionLogicExpression_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_LogicExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Lo: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			finalConditionLogicExpression_5014Parser = parser;
		}
		return finalConditionLogicExpression_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser finalConditionDataExpression_5015Parser;

	/**
	 * @generated
	 */
	private IParser getFinalConditionDataExpression_5015Parser() {
		if (finalConditionDataExpression_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_DataExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Da: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			finalConditionDataExpression_5015Parser = parser;
		}
		return finalConditionDataExpression_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser initialConditionSocialExpression_5016Parser;

	/**
	 * @generated
	 */
	private IParser getInitialConditionSocialExpression_5016Parser() {
		if (initialConditionSocialExpression_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_SocialExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("So: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			initialConditionSocialExpression_5016Parser = parser;
		}
		return initialConditionSocialExpression_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser initialConditionTaskExpression_5017Parser;

	/**
	 * @generated
	 */
	private IParser getInitialConditionTaskExpression_5017Parser() {
		if (initialConditionTaskExpression_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_TaskExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Ta: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			initialConditionTaskExpression_5017Parser = parser;
		}
		return initialConditionTaskExpression_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser initialConditionSpaceExpression_5018Parser;

	/**
	 * @generated
	 */
	private IParser getInitialConditionSpaceExpression_5018Parser() {
		if (initialConditionSpaceExpression_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_SpaceExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Sp: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			initialConditionSpaceExpression_5018Parser = parser;
		}
		return initialConditionSpaceExpression_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser initialConditionLogicExpression_5019Parser;

	/**
	 * @generated
	 */
	private IParser getInitialConditionLogicExpression_5019Parser() {
		if (initialConditionLogicExpression_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_LogicExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Lo: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			initialConditionLogicExpression_5019Parser = parser;
		}
		return initialConditionLogicExpression_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser initialConditionDataExpression_5020Parser;

	/**
	 * @generated
	 */
	private IParser getInitialConditionDataExpression_5020Parser() {
		if (initialConditionDataExpression_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getCondition_DataExpression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Da: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			initialConditionDataExpression_5020Parser = parser;
		}
		return initialConditionDataExpression_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser simpleTaskName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleTaskName_5021Parser() {
		if (simpleTaskName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { TammPackage.eINSTANCE
					.getSimpleTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			simpleTaskName_5021Parser = parser;
		}
		return simpleTaskName_5021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PreConditionSocialExpressionEditPart.VISUAL_ID:
			return getPreConditionSocialExpression_5001Parser();
		case PreConditionTaskExpressionEditPart.VISUAL_ID:
			return getPreConditionTaskExpression_5002Parser();
		case PreConditionSpaceExpressionEditPart.VISUAL_ID:
			return getPreConditionSpaceExpression_5003Parser();
		case PreConditionLogicExpressionEditPart.VISUAL_ID:
			return getPreConditionLogicExpression_5004Parser();
		case PreConditionDataExpressionEditPart.VISUAL_ID:
			return getPreConditionDataExpression_5005Parser();
		case PostConditionSocialExpressionEditPart.VISUAL_ID:
			return getPostConditionSocialExpression_5006Parser();
		case PostConditionTaskExpressionEditPart.VISUAL_ID:
			return getPostConditionTaskExpression_5007Parser();
		case PostConditionSpaceExpressionEditPart.VISUAL_ID:
			return getPostConditionSpaceExpression_5008Parser();
		case PostConditionLogicExpressionEditPart.VISUAL_ID:
			return getPostConditionLogicExpression_5009Parser();
		case PostConditionDataExpressionEditPart.VISUAL_ID:
			return getPostConditionDataExpression_5010Parser();
		case FinalConditionSocialExpressionEditPart.VISUAL_ID:
			return getFinalConditionSocialExpression_5011Parser();
		case FinalConditionTaskExpressionEditPart.VISUAL_ID:
			return getFinalConditionTaskExpression_5012Parser();
		case FinalConditionSpaceExpressionEditPart.VISUAL_ID:
			return getFinalConditionSpaceExpression_5013Parser();
		case FinalConditionLogicExpressionEditPart.VISUAL_ID:
			return getFinalConditionLogicExpression_5014Parser();
		case FinalConditionDataExpressionEditPart.VISUAL_ID:
			return getFinalConditionDataExpression_5015Parser();
		case InitialConditionSocialExpressionEditPart.VISUAL_ID:
			return getInitialConditionSocialExpression_5016Parser();
		case InitialConditionTaskExpressionEditPart.VISUAL_ID:
			return getInitialConditionTaskExpression_5017Parser();
		case InitialConditionSpaceExpressionEditPart.VISUAL_ID:
			return getInitialConditionSpaceExpression_5018Parser();
		case InitialConditionLogicExpressionEditPart.VISUAL_ID:
			return getInitialConditionLogicExpression_5019Parser();
		case InitialConditionDataExpressionEditPart.VISUAL_ID:
			return getInitialConditionDataExpression_5020Parser();
		case SimpleTaskNameEditPart.VISUAL_ID:
			return getSimpleTaskName_5021Parser();
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
			return getParser(TaskVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TaskVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TaskElementTypes.getElement(hint) == null) {
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
