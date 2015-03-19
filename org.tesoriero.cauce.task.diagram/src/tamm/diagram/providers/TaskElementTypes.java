package tamm.diagram.providers;

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

import tamm.TammPackage;
import tamm.diagram.edit.parts.AndJoinEditPart;
import tamm.diagram.edit.parts.AndSplitEditPart;
import tamm.diagram.edit.parts.ContextAwareSystemEditPart;
import tamm.diagram.edit.parts.FinalConditionEditPart;
import tamm.diagram.edit.parts.InitialConditionEditPart;
import tamm.diagram.edit.parts.InputConditionToJoinTaskEditPart;
import tamm.diagram.edit.parts.InputConditionToSplitTaskEditPart;
import tamm.diagram.edit.parts.JoinTaskToOutputConditionEditPart;
import tamm.diagram.edit.parts.OrJoinEditPart;
import tamm.diagram.edit.parts.OrSplitEditPart;
import tamm.diagram.edit.parts.PostConditionEditPart;
import tamm.diagram.edit.parts.PreConditionEditPart;
import tamm.diagram.edit.parts.PreConditionToSystemTaskEditPart;
import tamm.diagram.edit.parts.SimpleTaskEditPart;
import tamm.diagram.edit.parts.SkipTaskEditPart;
import tamm.diagram.edit.parts.SplitTaskToOutputConditionEditPart;
import tamm.diagram.edit.parts.SystemTaskToPostConditionEditPart;
import tamm.diagram.part.TaskDiagramEditorPlugin;

/**
 * @generated
 */
public class TaskElementTypes {

	/**
	 * @generated
	 */
	private TaskElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			TaskDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ContextAwareSystem_1000 = getElementType("org.tesoriero.cauce.task.diagram.ContextAwareSystem_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AndSplit_2001 = getElementType("org.tesoriero.cauce.task.diagram.AndSplit_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PreCondition_2002 = getElementType("org.tesoriero.cauce.task.diagram.PreCondition_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PostCondition_2003 = getElementType("org.tesoriero.cauce.task.diagram.PostCondition_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SkipTask_2004 = getElementType("org.tesoriero.cauce.task.diagram.SkipTask_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FinalCondition_2005 = getElementType("org.tesoriero.cauce.task.diagram.FinalCondition_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AndJoin_2006 = getElementType("org.tesoriero.cauce.task.diagram.AndJoin_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialCondition_2007 = getElementType("org.tesoriero.cauce.task.diagram.InitialCondition_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SimpleTask_2008 = getElementType("org.tesoriero.cauce.task.diagram.SimpleTask_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OrSplit_2009 = getElementType("org.tesoriero.cauce.task.diagram.OrSplit_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OrJoin_2010 = getElementType("org.tesoriero.cauce.task.diagram.OrJoin_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputConditionToJoinTask_4001 = getElementType("org.tesoriero.cauce.task.diagram.InputConditionToJoinTask_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputConditionToSplitTask_4002 = getElementType("org.tesoriero.cauce.task.diagram.InputConditionToSplitTask_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JoinTaskToOutputCondition_4003 = getElementType("org.tesoriero.cauce.task.diagram.JoinTaskToOutputCondition_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SplitTaskToOutputCondition_4004 = getElementType("org.tesoriero.cauce.task.diagram.SplitTaskToOutputCondition_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PreConditionToSystemTask_4005 = getElementType("org.tesoriero.cauce.task.diagram.PreConditionToSystemTask_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemTaskToPostCondition_4006 = getElementType("org.tesoriero.cauce.task.diagram.SystemTaskToPostCondition_4006"); //$NON-NLS-1$

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

			elements.put(ContextAwareSystem_1000,
					TammPackage.eINSTANCE.getContextAwareSystem());

			elements.put(AndSplit_2001, TammPackage.eINSTANCE.getAndSplit());

			elements.put(PreCondition_2002,
					TammPackage.eINSTANCE.getPreCondition());

			elements.put(PostCondition_2003,
					TammPackage.eINSTANCE.getPostCondition());

			elements.put(SkipTask_2004, TammPackage.eINSTANCE.getSkipTask());

			elements.put(FinalCondition_2005,
					TammPackage.eINSTANCE.getFinalCondition());

			elements.put(AndJoin_2006, TammPackage.eINSTANCE.getAndJoin());

			elements.put(InitialCondition_2007,
					TammPackage.eINSTANCE.getInitialCondition());

			elements.put(SimpleTask_2008, TammPackage.eINSTANCE.getSimpleTask());

			elements.put(OrSplit_2009, TammPackage.eINSTANCE.getOrSplit());

			elements.put(OrJoin_2010, TammPackage.eINSTANCE.getOrJoin());

			elements.put(InputConditionToJoinTask_4001,
					TammPackage.eINSTANCE.getInputConditionToJoinTask());

			elements.put(InputConditionToSplitTask_4002,
					TammPackage.eINSTANCE.getInputConditionToSplitTask());

			elements.put(JoinTaskToOutputCondition_4003,
					TammPackage.eINSTANCE.getJoinTaskToOutputCondition());

			elements.put(SplitTaskToOutputCondition_4004,
					TammPackage.eINSTANCE.getSplitTaskToOutputCondition());

			elements.put(PreConditionToSystemTask_4005,
					TammPackage.eINSTANCE.getPreConditionToSystemTask());

			elements.put(SystemTaskToPostCondition_4006,
					TammPackage.eINSTANCE.getSystemTaskToPostCondition());
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
			KNOWN_ELEMENT_TYPES.add(ContextAwareSystem_1000);
			KNOWN_ELEMENT_TYPES.add(AndSplit_2001);
			KNOWN_ELEMENT_TYPES.add(PreCondition_2002);
			KNOWN_ELEMENT_TYPES.add(PostCondition_2003);
			KNOWN_ELEMENT_TYPES.add(SkipTask_2004);
			KNOWN_ELEMENT_TYPES.add(FinalCondition_2005);
			KNOWN_ELEMENT_TYPES.add(AndJoin_2006);
			KNOWN_ELEMENT_TYPES.add(InitialCondition_2007);
			KNOWN_ELEMENT_TYPES.add(SimpleTask_2008);
			KNOWN_ELEMENT_TYPES.add(OrSplit_2009);
			KNOWN_ELEMENT_TYPES.add(OrJoin_2010);
			KNOWN_ELEMENT_TYPES.add(InputConditionToJoinTask_4001);
			KNOWN_ELEMENT_TYPES.add(InputConditionToSplitTask_4002);
			KNOWN_ELEMENT_TYPES.add(JoinTaskToOutputCondition_4003);
			KNOWN_ELEMENT_TYPES.add(SplitTaskToOutputCondition_4004);
			KNOWN_ELEMENT_TYPES.add(PreConditionToSystemTask_4005);
			KNOWN_ELEMENT_TYPES.add(SystemTaskToPostCondition_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ContextAwareSystemEditPart.VISUAL_ID:
			return ContextAwareSystem_1000;
		case AndSplitEditPart.VISUAL_ID:
			return AndSplit_2001;
		case PreConditionEditPart.VISUAL_ID:
			return PreCondition_2002;
		case PostConditionEditPart.VISUAL_ID:
			return PostCondition_2003;
		case SkipTaskEditPart.VISUAL_ID:
			return SkipTask_2004;
		case FinalConditionEditPart.VISUAL_ID:
			return FinalCondition_2005;
		case AndJoinEditPart.VISUAL_ID:
			return AndJoin_2006;
		case InitialConditionEditPart.VISUAL_ID:
			return InitialCondition_2007;
		case SimpleTaskEditPart.VISUAL_ID:
			return SimpleTask_2008;
		case OrSplitEditPart.VISUAL_ID:
			return OrSplit_2009;
		case OrJoinEditPart.VISUAL_ID:
			return OrJoin_2010;
		case InputConditionToJoinTaskEditPart.VISUAL_ID:
			return InputConditionToJoinTask_4001;
		case InputConditionToSplitTaskEditPart.VISUAL_ID:
			return InputConditionToSplitTask_4002;
		case JoinTaskToOutputConditionEditPart.VISUAL_ID:
			return JoinTaskToOutputCondition_4003;
		case SplitTaskToOutputConditionEditPart.VISUAL_ID:
			return SplitTaskToOutputCondition_4004;
		case PreConditionToSystemTaskEditPart.VISUAL_ID:
			return PreConditionToSystemTask_4005;
		case SystemTaskToPostConditionEditPart.VISUAL_ID:
			return SystemTaskToPostCondition_4006;
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
			return tamm.diagram.providers.TaskElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return tamm.diagram.providers.TaskElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return tamm.diagram.providers.TaskElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
