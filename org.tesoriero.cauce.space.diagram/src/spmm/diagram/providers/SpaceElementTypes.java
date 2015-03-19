package spmm.diagram.providers;

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

import spmm.SpmmPackage;
import spmm.diagram.edit.parts.ContentionEditPart;
import spmm.diagram.edit.parts.GeneralizationEditPart;
import spmm.diagram.edit.parts.GroupingEditPart;
import spmm.diagram.edit.parts.PhysicalSpaceEditPart;
import spmm.diagram.edit.parts.UniverseEditPart;
import spmm.diagram.edit.parts.VirtualSpaceEditPart;
import spmm.diagram.part.SpaceDiagramEditorPlugin;

/**
 * @generated
 */
public class SpaceElementTypes {

	/**
	 * @generated
	 */
	private SpaceElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			SpaceDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Universe_1000 = getElementType("org.tesoriero.cauce.space.diagram.Universe_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PhysicalSpace_2001 = getElementType("org.tesoriero.cauce.space.diagram.PhysicalSpace_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VirtualSpace_2002 = getElementType("org.tesoriero.cauce.space.diagram.VirtualSpace_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Grouping_4001 = getElementType("org.tesoriero.cauce.space.diagram.Grouping_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Contention_4002 = getElementType("org.tesoriero.cauce.space.diagram.Contention_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generalization_4003 = getElementType("org.tesoriero.cauce.space.diagram.Generalization_4003"); //$NON-NLS-1$

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

			elements.put(Universe_1000, SpmmPackage.eINSTANCE.getUniverse());

			elements.put(PhysicalSpace_2001,
					SpmmPackage.eINSTANCE.getPhysicalSpace());

			elements.put(VirtualSpace_2002,
					SpmmPackage.eINSTANCE.getVirtualSpace());

			elements.put(Grouping_4001, SpmmPackage.eINSTANCE.getGrouping());

			elements.put(Contention_4002, SpmmPackage.eINSTANCE.getContention());

			elements.put(Generalization_4003,
					SpmmPackage.eINSTANCE.getGeneralization());
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
			KNOWN_ELEMENT_TYPES.add(Universe_1000);
			KNOWN_ELEMENT_TYPES.add(PhysicalSpace_2001);
			KNOWN_ELEMENT_TYPES.add(VirtualSpace_2002);
			KNOWN_ELEMENT_TYPES.add(Grouping_4001);
			KNOWN_ELEMENT_TYPES.add(Contention_4002);
			KNOWN_ELEMENT_TYPES.add(Generalization_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UniverseEditPart.VISUAL_ID:
			return Universe_1000;
		case PhysicalSpaceEditPart.VISUAL_ID:
			return PhysicalSpace_2001;
		case VirtualSpaceEditPart.VISUAL_ID:
			return VirtualSpace_2002;
		case GroupingEditPart.VISUAL_ID:
			return Grouping_4001;
		case ContentionEditPart.VISUAL_ID:
			return Contention_4002;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_4003;
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
			return spmm.diagram.providers.SpaceElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return spmm.diagram.providers.SpaceElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return spmm.diagram.providers.SpaceElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
