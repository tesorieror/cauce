package ifmm.diagram.providers;

import ifmm.IfmmPackage;
import ifmm.diagram.edit.parts.BroadcastInformationFlowEditPart;
import ifmm.diagram.edit.parts.BroadcastInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.edit.parts.ContextAwareEntityEditPart;
import ifmm.diagram.edit.parts.EntityToBroadcastInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.EntityToPointToPointInformationFlowEdgeEditPart;
import ifmm.diagram.edit.parts.InputDataEditPart;
import ifmm.diagram.edit.parts.OutputData2EditPart;
import ifmm.diagram.edit.parts.OutputDataEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowEditPart;
import ifmm.diagram.edit.parts.PointToPointInformationFlowToEntityEdgeEditPart;
import ifmm.diagram.edit.parts.SystemInformaitonFlowEditPart;
import ifmm.diagram.part.InformationFlowDiagramEditorPlugin;

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

/**
 * @generated
 */
public class InformationFlowElementTypes {

	/**
	 * @generated
	 */
	private InformationFlowElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			InformationFlowDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType SystemInformaitonFlow_1000 = getElementType("org.tesoriero.cauce.informationFlow.diagram.SystemInformaitonFlow_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BroadcastInformationFlow_2001 = getElementType("org.tesoriero.cauce.informationFlow.diagram.BroadcastInformationFlow_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PointToPointInformationFlow_2002 = getElementType("org.tesoriero.cauce.informationFlow.diagram.PointToPointInformationFlow_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextAwareEntity_2003 = getElementType("org.tesoriero.cauce.informationFlow.diagram.ContextAwareEntity_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputData_3001 = getElementType("org.tesoriero.cauce.informationFlow.diagram.OutputData_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputData_3002 = getElementType("org.tesoriero.cauce.informationFlow.diagram.OutputData_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputData_3003 = getElementType("org.tesoriero.cauce.informationFlow.diagram.InputData_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BroadcastInformationFlowToEntityEdge_4001 = getElementType("org.tesoriero.cauce.informationFlow.diagram.BroadcastInformationFlowToEntityEdge_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntityToBroadcastInformationFlowEdge_4002 = getElementType("org.tesoriero.cauce.informationFlow.diagram.EntityToBroadcastInformationFlowEdge_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntityToPointToPointInformationFlowEdge_4003 = getElementType("org.tesoriero.cauce.informationFlow.diagram.EntityToPointToPointInformationFlowEdge_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PointToPointInformationFlowToEntityEdge_4004 = getElementType("org.tesoriero.cauce.informationFlow.diagram.PointToPointInformationFlowToEntityEdge_4004"); //$NON-NLS-1$

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

			elements.put(SystemInformaitonFlow_1000,
					IfmmPackage.eINSTANCE.getSystemInformaitonFlow());

			elements.put(BroadcastInformationFlow_2001,
					IfmmPackage.eINSTANCE.getBroadcastInformationFlow());

			elements.put(PointToPointInformationFlow_2002,
					IfmmPackage.eINSTANCE.getPointToPointInformationFlow());

			elements.put(ContextAwareEntity_2003,
					IfmmPackage.eINSTANCE.getContextAwareEntity());

			elements.put(OutputData_3001, IfmmPackage.eINSTANCE.getOutputData());

			elements.put(OutputData_3002, IfmmPackage.eINSTANCE.getOutputData());

			elements.put(InputData_3003, IfmmPackage.eINSTANCE.getInputData());

			elements.put(BroadcastInformationFlowToEntityEdge_4001,
					IfmmPackage.eINSTANCE
							.getBroadcastInformationFlowToEntityEdge());

			elements.put(EntityToBroadcastInformationFlowEdge_4002,
					IfmmPackage.eINSTANCE
							.getEntityToBroadcastInformationFlowEdge());

			elements.put(EntityToPointToPointInformationFlowEdge_4003,
					IfmmPackage.eINSTANCE
							.getEntityToPointToPointInformationFlowEdge());

			elements.put(PointToPointInformationFlowToEntityEdge_4004,
					IfmmPackage.eINSTANCE
							.getPointToPointInformationFlowToEntityEdge());
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
			KNOWN_ELEMENT_TYPES.add(SystemInformaitonFlow_1000);
			KNOWN_ELEMENT_TYPES.add(BroadcastInformationFlow_2001);
			KNOWN_ELEMENT_TYPES.add(PointToPointInformationFlow_2002);
			KNOWN_ELEMENT_TYPES.add(ContextAwareEntity_2003);
			KNOWN_ELEMENT_TYPES.add(OutputData_3001);
			KNOWN_ELEMENT_TYPES.add(OutputData_3002);
			KNOWN_ELEMENT_TYPES.add(InputData_3003);
			KNOWN_ELEMENT_TYPES.add(BroadcastInformationFlowToEntityEdge_4001);
			KNOWN_ELEMENT_TYPES.add(EntityToBroadcastInformationFlowEdge_4002);
			KNOWN_ELEMENT_TYPES
					.add(EntityToPointToPointInformationFlowEdge_4003);
			KNOWN_ELEMENT_TYPES
					.add(PointToPointInformationFlowToEntityEdge_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SystemInformaitonFlowEditPart.VISUAL_ID:
			return SystemInformaitonFlow_1000;
		case BroadcastInformationFlowEditPart.VISUAL_ID:
			return BroadcastInformationFlow_2001;
		case PointToPointInformationFlowEditPart.VISUAL_ID:
			return PointToPointInformationFlow_2002;
		case ContextAwareEntityEditPart.VISUAL_ID:
			return ContextAwareEntity_2003;
		case OutputDataEditPart.VISUAL_ID:
			return OutputData_3001;
		case OutputData2EditPart.VISUAL_ID:
			return OutputData_3002;
		case InputDataEditPart.VISUAL_ID:
			return InputData_3003;
		case BroadcastInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return BroadcastInformationFlowToEntityEdge_4001;
		case EntityToBroadcastInformationFlowEdgeEditPart.VISUAL_ID:
			return EntityToBroadcastInformationFlowEdge_4002;
		case EntityToPointToPointInformationFlowEdgeEditPart.VISUAL_ID:
			return EntityToPointToPointInformationFlowEdge_4003;
		case PointToPointInformationFlowToEntityEdgeEditPart.VISUAL_ID:
			return PointToPointInformationFlowToEntityEdge_4004;
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
			return ifmm.diagram.providers.InformationFlowElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return ifmm.diagram.providers.InformationFlowElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return ifmm.diagram.providers.InformationFlowElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
