package ecmm.diagram.providers;

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

import ecmm.EcmmPackage;
import ecmm.diagram.edit.parts.ContextActionExpressionEditPart;
import ecmm.diagram.edit.parts.ContextActionMemoryNameEditPart;
import ecmm.diagram.edit.parts.ContextSituationIdEditPart;
import ecmm.diagram.edit.parts.ContextSituationNameEditPart;
import ecmm.diagram.edit.parts.DictionaryMemoryIdEditPart;
import ecmm.diagram.edit.parts.DictionaryMemoryNameEditPart;
import ecmm.diagram.edit.parts.EntityContextEntityEditPart;
import ecmm.diagram.edit.parts.EntityContextIdEditPart;
import ecmm.diagram.edit.parts.HolderMemoryIdEditPart;
import ecmm.diagram.edit.parts.HolderMemoryNameEditPart;
import ecmm.diagram.edit.parts.LogicMemoryIdEditPart;
import ecmm.diagram.edit.parts.LogicMemoryNameEditPart;
import ecmm.diagram.edit.parts.MemoryContextConditionExpressionEditPart;
import ecmm.diagram.edit.parts.MemoryContextConditionMemoryNameEditPart;
import ecmm.diagram.edit.parts.SensingContextConditionInformationflowEditPart;
import ecmm.diagram.edit.parts.StackMemoryIdEditPart;
import ecmm.diagram.edit.parts.StackMemoryNameEditPart;
import ecmm.diagram.edit.parts.TimeMemoryIdEditPart;
import ecmm.diagram.edit.parts.TimeMemoryNameEditPart;
import ecmm.diagram.edit.parts.VariableDataDefinitionNameDefinitionEditPart;
import ecmm.diagram.parsers.MessageFormatParser;
import ecmm.diagram.part.EntityContextVisualIDRegistry;

/**
 * @generated
 */
public class EntityContextParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser entityContextEntity_5019Parser;

	/**
	 * @generated
	 */
	private IParser getEntityContextEntity_5019Parser() {
		if (entityContextEntity_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getEntityContext_Entity() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityContextEntity_5019Parser = parser;
		}
		return entityContextEntity_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityContextId_5020Parser;

	/**
	 * @generated
	 */
	private IParser getEntityContextId_5020Parser() {
		if (entityContextId_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getEntityContext_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			entityContextId_5020Parser = parser;
		}
		return entityContextId_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser holderMemoryName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getHolderMemoryName_5001Parser() {
		if (holderMemoryName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextMemory_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			holderMemoryName_5001Parser = parser;
		}
		return holderMemoryName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser holderMemoryId_5002Parser;

	/**
	 * @generated
	 */
	private IParser getHolderMemoryId_5002Parser() {
		if (holderMemoryId_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextMemory_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			holderMemoryId_5002Parser = parser;
		}
		return holderMemoryId_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser logicMemoryName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getLogicMemoryName_5003Parser() {
		if (logicMemoryName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextMemory_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logicMemoryName_5003Parser = parser;
		}
		return logicMemoryName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser logicMemoryId_5004Parser;

	/**
	 * @generated
	 */
	private IParser getLogicMemoryId_5004Parser() {
		if (logicMemoryId_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextMemory_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			logicMemoryId_5004Parser = parser;
		}
		return logicMemoryId_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeMemoryName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getTimeMemoryName_5005Parser() {
		if (timeMemoryName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextMemory_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			timeMemoryName_5005Parser = parser;
		}
		return timeMemoryName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeMemoryId_5006Parser;

	/**
	 * @generated
	 */
	private IParser getTimeMemoryId_5006Parser() {
		if (timeMemoryId_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextMemory_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			timeMemoryId_5006Parser = parser;
		}
		return timeMemoryId_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser stackMemoryName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getStackMemoryName_5007Parser() {
		if (stackMemoryName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextMemory_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stackMemoryName_5007Parser = parser;
		}
		return stackMemoryName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser stackMemoryId_5008Parser;

	/**
	 * @generated
	 */
	private IParser getStackMemoryId_5008Parser() {
		if (stackMemoryId_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextMemory_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			stackMemoryId_5008Parser = parser;
		}
		return stackMemoryId_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser dictionaryMemoryName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getDictionaryMemoryName_5009Parser() {
		if (dictionaryMemoryName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextMemory_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dictionaryMemoryName_5009Parser = parser;
		}
		return dictionaryMemoryName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser dictionaryMemoryId_5010Parser;

	/**
	 * @generated
	 */
	private IParser getDictionaryMemoryId_5010Parser() {
		if (dictionaryMemoryId_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextMemory_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			dictionaryMemoryId_5010Parser = parser;
		}
		return dictionaryMemoryId_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextSituationName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getContextSituationName_5016Parser() {
		if (contextSituationName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextSituation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextSituationName_5016Parser = parser;
		}
		return contextSituationName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextSituationId_5017Parser;

	/**
	 * @generated
	 */
	private IParser getContextSituationId_5017Parser() {
		if (contextSituationId_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextSituation_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0})"); //$NON-NLS-1$
			parser.setEditorPattern("({0})"); //$NON-NLS-1$
			parser.setEditPattern("({0})"); //$NON-NLS-1$
			contextSituationId_5017Parser = parser;
		}
		return contextSituationId_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser memoryContextConditionExpression_5011Parser;

	/**
	 * @generated
	 */
	private IParser getMemoryContextConditionExpression_5011Parser() {
		if (memoryContextConditionExpression_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getMemoryContextCondition_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			memoryContextConditionExpression_5011Parser = parser;
		}
		return memoryContextConditionExpression_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser memoryContextConditionMemoryName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getMemoryContextConditionMemoryName_5012Parser() {
		if (memoryContextConditionMemoryName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getMemoryContextCondition_MemoryName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			memoryContextConditionMemoryName_5012Parser = parser;
		}
		return memoryContextConditionMemoryName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser sensingContextConditionInformationflow_5013Parser;

	/**
	 * @generated
	 */
	private IParser getSensingContextConditionInformationflow_5013Parser() {
		if (sensingContextConditionInformationflow_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getSensingContextCondition_Informationflow() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sensingContextConditionInformationflow_5013Parser = parser;
		}
		return sensingContextConditionInformationflow_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextActionExpression_5014Parser;

	/**
	 * @generated
	 */
	private IParser getContextActionExpression_5014Parser() {
		if (contextActionExpression_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextAction_Expression() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextActionExpression_5014Parser = parser;
		}
		return contextActionExpression_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextActionMemoryName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getContextActionMemoryName_5015Parser() {
		if (contextActionMemoryName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { EcmmPackage.eINSTANCE
					.getContextAction_MemoryName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextActionMemoryName_5015Parser = parser;
		}
		return contextActionMemoryName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser variableDataDefinitionNameDefinition_5018Parser;

	/**
	 * @generated
	 */
	private IParser getVariableDataDefinitionNameDefinition_5018Parser() {
		if (variableDataDefinitionNameDefinition_5018Parser == null) {
			EAttribute[] features = new EAttribute[] {
					EcmmPackage.eINSTANCE.getVariableDataDefinition_Name(),
					EcmmPackage.eINSTANCE
							.getVariableDataDefinition_Definition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			variableDataDefinitionNameDefinition_5018Parser = parser;
		}
		return variableDataDefinitionNameDefinition_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EntityContextEntityEditPart.VISUAL_ID:
			return getEntityContextEntity_5019Parser();
		case EntityContextIdEditPart.VISUAL_ID:
			return getEntityContextId_5020Parser();
		case HolderMemoryNameEditPart.VISUAL_ID:
			return getHolderMemoryName_5001Parser();
		case HolderMemoryIdEditPart.VISUAL_ID:
			return getHolderMemoryId_5002Parser();
		case LogicMemoryNameEditPart.VISUAL_ID:
			return getLogicMemoryName_5003Parser();
		case LogicMemoryIdEditPart.VISUAL_ID:
			return getLogicMemoryId_5004Parser();
		case TimeMemoryNameEditPart.VISUAL_ID:
			return getTimeMemoryName_5005Parser();
		case TimeMemoryIdEditPart.VISUAL_ID:
			return getTimeMemoryId_5006Parser();
		case StackMemoryNameEditPart.VISUAL_ID:
			return getStackMemoryName_5007Parser();
		case StackMemoryIdEditPart.VISUAL_ID:
			return getStackMemoryId_5008Parser();
		case DictionaryMemoryNameEditPart.VISUAL_ID:
			return getDictionaryMemoryName_5009Parser();
		case DictionaryMemoryIdEditPart.VISUAL_ID:
			return getDictionaryMemoryId_5010Parser();
		case ContextSituationNameEditPart.VISUAL_ID:
			return getContextSituationName_5016Parser();
		case ContextSituationIdEditPart.VISUAL_ID:
			return getContextSituationId_5017Parser();
		case MemoryContextConditionExpressionEditPart.VISUAL_ID:
			return getMemoryContextConditionExpression_5011Parser();
		case MemoryContextConditionMemoryNameEditPart.VISUAL_ID:
			return getMemoryContextConditionMemoryName_5012Parser();
		case SensingContextConditionInformationflowEditPart.VISUAL_ID:
			return getSensingContextConditionInformationflow_5013Parser();
		case ContextActionExpressionEditPart.VISUAL_ID:
			return getContextActionExpression_5014Parser();
		case ContextActionMemoryNameEditPart.VISUAL_ID:
			return getContextActionMemoryName_5015Parser();
		case VariableDataDefinitionNameDefinitionEditPart.VISUAL_ID:
			return getVariableDataDefinitionNameDefinition_5018Parser();
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
			return getParser(EntityContextVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(EntityContextVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (EntityContextElementTypes.getElement(hint) == null) {
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
