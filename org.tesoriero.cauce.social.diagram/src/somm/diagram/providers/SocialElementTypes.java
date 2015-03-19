package somm.diagram.providers;

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

import somm.SommPackage;
import somm.diagram.edit.parts.IndividualInstanceEditPart;
import somm.diagram.edit.parts.IndividualRealizationEditPart;
import somm.diagram.edit.parts.RoleEditPart;
import somm.diagram.edit.parts.SocietyEditPart;
import somm.diagram.edit.parts.SpecializationEditPart;
import somm.diagram.part.SocialDiagramEditorPlugin;

/**
 * @generated
 */
public class SocialElementTypes {

	/**
	 * @generated
	 */
	private SocialElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			SocialDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Society_1000 = getElementType("org.tesoriero.cauce.social.diagram.Society_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualInstance_2001 = getElementType("org.tesoriero.cauce.social.diagram.IndividualInstance_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_2002 = getElementType("org.tesoriero.cauce.social.diagram.Role_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Specialization_4001 = getElementType("org.tesoriero.cauce.social.diagram.Specialization_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IndividualRealization_4002 = getElementType("org.tesoriero.cauce.social.diagram.IndividualRealization_4002"); //$NON-NLS-1$

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

			elements.put(Society_1000, SommPackage.eINSTANCE.getSociety());

			elements.put(IndividualInstance_2001,
					SommPackage.eINSTANCE.getIndividualInstance());

			elements.put(Role_2002, SommPackage.eINSTANCE.getRole());

			elements.put(Specialization_4001,
					SommPackage.eINSTANCE.getSpecialization());

			elements.put(IndividualRealization_4002,
					SommPackage.eINSTANCE.getIndividualRealization());
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
			KNOWN_ELEMENT_TYPES.add(Society_1000);
			KNOWN_ELEMENT_TYPES.add(IndividualInstance_2001);
			KNOWN_ELEMENT_TYPES.add(Role_2002);
			KNOWN_ELEMENT_TYPES.add(Specialization_4001);
			KNOWN_ELEMENT_TYPES.add(IndividualRealization_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SocietyEditPart.VISUAL_ID:
			return Society_1000;
		case IndividualInstanceEditPart.VISUAL_ID:
			return IndividualInstance_2001;
		case RoleEditPart.VISUAL_ID:
			return Role_2002;
		case SpecializationEditPart.VISUAL_ID:
			return Specialization_4001;
		case IndividualRealizationEditPart.VISUAL_ID:
			return IndividualRealization_4002;
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
			return somm.diagram.providers.SocialElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return somm.diagram.providers.SocialElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return somm.diagram.providers.SocialElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
