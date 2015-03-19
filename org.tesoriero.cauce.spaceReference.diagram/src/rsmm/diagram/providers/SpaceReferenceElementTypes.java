package rsmm.diagram.providers;

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

import rsmm.RsmmPackage;
import rsmm.diagram.edit.parts.ContextAwareEntityReferenceEditPart;
import rsmm.diagram.edit.parts.ReferentialSpaceEditPart;
import rsmm.diagram.edit.parts.SpaceToEntityReferenceDependencyEditPart;
import rsmm.diagram.edit.parts.SpaceToSpaceReferenceDependencyEditPart;
import rsmm.diagram.edit.parts.SystemInformationFlowReferenceSpaceEditPart;
import rsmm.diagram.part.SpaceReferenceDiagramEditorPlugin;

/**
 * @generated
 */
public class SpaceReferenceElementTypes {

	/**
	 * @generated
	 */
	private SpaceReferenceElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			SpaceReferenceDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType SystemInformationFlowReferenceSpace_1000 = getElementType("org.tesoriero.cauce.spaceReference.diagram.SystemInformationFlowReferenceSpace_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextAwareEntityReference_2001 = getElementType("org.tesoriero.cauce.spaceReference.diagram.ContextAwareEntityReference_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ReferentialSpace_2002 = getElementType("org.tesoriero.cauce.spaceReference.diagram.ReferentialSpace_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SpaceToSpaceReferenceDependency_4001 = getElementType("org.tesoriero.cauce.spaceReference.diagram.SpaceToSpaceReferenceDependency_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SpaceToEntityReferenceDependency_4002 = getElementType("org.tesoriero.cauce.spaceReference.diagram.SpaceToEntityReferenceDependency_4002"); //$NON-NLS-1$

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

			elements.put(SystemInformationFlowReferenceSpace_1000,
					RsmmPackage.eINSTANCE
							.getSystemInformationFlowReferenceSpace());

			elements.put(ContextAwareEntityReference_2001,
					RsmmPackage.eINSTANCE.getContextAwareEntityReference());

			elements.put(ReferentialSpace_2002,
					RsmmPackage.eINSTANCE.getReferentialSpace());

			elements.put(SpaceToSpaceReferenceDependency_4001,
					RsmmPackage.eINSTANCE.getSpaceToSpaceReferenceDependency());

			elements.put(SpaceToEntityReferenceDependency_4002,
					RsmmPackage.eINSTANCE.getSpaceToEntityReferenceDependency());
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
			KNOWN_ELEMENT_TYPES.add(SystemInformationFlowReferenceSpace_1000);
			KNOWN_ELEMENT_TYPES.add(ContextAwareEntityReference_2001);
			KNOWN_ELEMENT_TYPES.add(ReferentialSpace_2002);
			KNOWN_ELEMENT_TYPES.add(SpaceToSpaceReferenceDependency_4001);
			KNOWN_ELEMENT_TYPES.add(SpaceToEntityReferenceDependency_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SystemInformationFlowReferenceSpaceEditPart.VISUAL_ID:
			return SystemInformationFlowReferenceSpace_1000;
		case ContextAwareEntityReferenceEditPart.VISUAL_ID:
			return ContextAwareEntityReference_2001;
		case ReferentialSpaceEditPart.VISUAL_ID:
			return ReferentialSpace_2002;
		case SpaceToSpaceReferenceDependencyEditPart.VISUAL_ID:
			return SpaceToSpaceReferenceDependency_4001;
		case SpaceToEntityReferenceDependencyEditPart.VISUAL_ID:
			return SpaceToEntityReferenceDependency_4002;
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
			return rsmm.diagram.providers.SpaceReferenceElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return rsmm.diagram.providers.SpaceReferenceElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return rsmm.diagram.providers.SpaceReferenceElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
