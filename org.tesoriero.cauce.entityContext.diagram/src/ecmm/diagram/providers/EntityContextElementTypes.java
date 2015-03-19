package ecmm.diagram.providers;

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

import ecmm.EcmmPackage;
import ecmm.diagram.edit.parts.ContextActionEditPart;
import ecmm.diagram.edit.parts.ContextSituationEditPart;
import ecmm.diagram.edit.parts.DictionaryMemoryEditPart;
import ecmm.diagram.edit.parts.EntityContextEditPart;
import ecmm.diagram.edit.parts.HolderMemoryEditPart;
import ecmm.diagram.edit.parts.LogicMemoryEditPart;
import ecmm.diagram.edit.parts.MemoryContextConditionEditPart;
import ecmm.diagram.edit.parts.SensingContextConditionEditPart;
import ecmm.diagram.edit.parts.StackMemoryEditPart;
import ecmm.diagram.edit.parts.SystemContextEditPart;
import ecmm.diagram.edit.parts.TimeMemoryEditPart;
import ecmm.diagram.edit.parts.VariableDataDefinitionEditPart;
import ecmm.diagram.part.EntityContextDiagramEditorPlugin;

/**
 * @generated
 */
public class EntityContextElementTypes {

	/**
	 * @generated
	 */
	private EntityContextElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			EntityContextDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType SystemContext_1000 = getElementType("org.tesoriero.cauce.entityContext.diagram.SystemContext_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntityContext_2001 = getElementType("org.tesoriero.cauce.entityContext.diagram.EntityContext_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HolderMemory_3001 = getElementType("org.tesoriero.cauce.entityContext.diagram.HolderMemory_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogicMemory_3002 = getElementType("org.tesoriero.cauce.entityContext.diagram.LogicMemory_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TimeMemory_3003 = getElementType("org.tesoriero.cauce.entityContext.diagram.TimeMemory_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StackMemory_3004 = getElementType("org.tesoriero.cauce.entityContext.diagram.StackMemory_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DictionaryMemory_3005 = getElementType("org.tesoriero.cauce.entityContext.diagram.DictionaryMemory_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextSituation_3006 = getElementType("org.tesoriero.cauce.entityContext.diagram.ContextSituation_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MemoryContextCondition_3007 = getElementType("org.tesoriero.cauce.entityContext.diagram.MemoryContextCondition_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SensingContextCondition_3008 = getElementType("org.tesoriero.cauce.entityContext.diagram.SensingContextCondition_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextAction_3009 = getElementType("org.tesoriero.cauce.entityContext.diagram.ContextAction_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VariableDataDefinition_3010 = getElementType("org.tesoriero.cauce.entityContext.diagram.VariableDataDefinition_3010"); //$NON-NLS-1$

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

			elements.put(SystemContext_1000,
					EcmmPackage.eINSTANCE.getSystemContext());

			elements.put(EntityContext_2001,
					EcmmPackage.eINSTANCE.getEntityContext());

			elements.put(HolderMemory_3001,
					EcmmPackage.eINSTANCE.getHolderMemory());

			elements.put(LogicMemory_3002,
					EcmmPackage.eINSTANCE.getLogicMemory());

			elements.put(TimeMemory_3003, EcmmPackage.eINSTANCE.getTimeMemory());

			elements.put(StackMemory_3004,
					EcmmPackage.eINSTANCE.getStackMemory());

			elements.put(DictionaryMemory_3005,
					EcmmPackage.eINSTANCE.getDictionaryMemory());

			elements.put(ContextSituation_3006,
					EcmmPackage.eINSTANCE.getContextSituation());

			elements.put(MemoryContextCondition_3007,
					EcmmPackage.eINSTANCE.getMemoryContextCondition());

			elements.put(SensingContextCondition_3008,
					EcmmPackage.eINSTANCE.getSensingContextCondition());

			elements.put(ContextAction_3009,
					EcmmPackage.eINSTANCE.getContextAction());

			elements.put(VariableDataDefinition_3010,
					EcmmPackage.eINSTANCE.getVariableDataDefinition());
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
			KNOWN_ELEMENT_TYPES.add(SystemContext_1000);
			KNOWN_ELEMENT_TYPES.add(EntityContext_2001);
			KNOWN_ELEMENT_TYPES.add(HolderMemory_3001);
			KNOWN_ELEMENT_TYPES.add(LogicMemory_3002);
			KNOWN_ELEMENT_TYPES.add(TimeMemory_3003);
			KNOWN_ELEMENT_TYPES.add(StackMemory_3004);
			KNOWN_ELEMENT_TYPES.add(DictionaryMemory_3005);
			KNOWN_ELEMENT_TYPES.add(ContextSituation_3006);
			KNOWN_ELEMENT_TYPES.add(MemoryContextCondition_3007);
			KNOWN_ELEMENT_TYPES.add(SensingContextCondition_3008);
			KNOWN_ELEMENT_TYPES.add(ContextAction_3009);
			KNOWN_ELEMENT_TYPES.add(VariableDataDefinition_3010);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SystemContextEditPart.VISUAL_ID:
			return SystemContext_1000;
		case EntityContextEditPart.VISUAL_ID:
			return EntityContext_2001;
		case HolderMemoryEditPart.VISUAL_ID:
			return HolderMemory_3001;
		case LogicMemoryEditPart.VISUAL_ID:
			return LogicMemory_3002;
		case TimeMemoryEditPart.VISUAL_ID:
			return TimeMemory_3003;
		case StackMemoryEditPart.VISUAL_ID:
			return StackMemory_3004;
		case DictionaryMemoryEditPart.VISUAL_ID:
			return DictionaryMemory_3005;
		case ContextSituationEditPart.VISUAL_ID:
			return ContextSituation_3006;
		case MemoryContextConditionEditPart.VISUAL_ID:
			return MemoryContextCondition_3007;
		case SensingContextConditionEditPart.VISUAL_ID:
			return SensingContextCondition_3008;
		case ContextActionEditPart.VISUAL_ID:
			return ContextAction_3009;
		case VariableDataDefinitionEditPart.VISUAL_ID:
			return VariableDataDefinition_3010;
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
			return ecmm.diagram.providers.EntityContextElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return ecmm.diagram.providers.EntityContextElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return ecmm.diagram.providers.EntityContextElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
