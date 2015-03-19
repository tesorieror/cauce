package somm.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import somm.IndividualRealization;
import somm.Society;
import somm.Specialization;
import somm.diagram.edit.parts.IndividualInstanceEditPart;
import somm.diagram.edit.parts.IndividualInstanceNameEditPart;
import somm.diagram.edit.parts.IndividualRealizationEditPart;
import somm.diagram.edit.parts.RoleEditPart;
import somm.diagram.edit.parts.RoleNameEditPart;
import somm.diagram.edit.parts.SocietyEditPart;
import somm.diagram.edit.parts.SpecializationEditPart;
import somm.diagram.part.SocialDiagramEditorPlugin;
import somm.diagram.part.SocialVisualIDRegistry;
import somm.diagram.providers.SocialElementTypes;
import somm.diagram.providers.SocialParserProvider;

/**
 * @generated
 */
public class SocialNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SocialDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SocialDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SocialNavigatorItem
				&& !isOwnView(((SocialNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SocialNavigatorGroup) {
			SocialNavigatorGroup group = (SocialNavigatorGroup) element;
			return SocialDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof SocialNavigatorItem) {
			SocialNavigatorItem navigatorItem = (SocialNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (SocialVisualIDRegistry.getVisualID(view)) {
		case SocietyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tesoriero.org/cauce/social/1.0?Society", SocialElementTypes.Society_1000); //$NON-NLS-1$
		case IndividualInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/social/1.0?IndividualInstance", SocialElementTypes.IndividualInstance_2001); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tesoriero.org/cauce/social/1.0?Role", SocialElementTypes.Role_2002); //$NON-NLS-1$
		case SpecializationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/social/1.0?Specialization", SocialElementTypes.Specialization_4001); //$NON-NLS-1$
		case IndividualRealizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tesoriero.org/cauce/social/1.0?IndividualRealization", SocialElementTypes.IndividualRealization_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SocialDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SocialElementTypes.isKnownElementType(elementType)) {
			image = SocialElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SocialNavigatorGroup) {
			SocialNavigatorGroup group = (SocialNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SocialNavigatorItem) {
			SocialNavigatorItem navigatorItem = (SocialNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (SocialVisualIDRegistry.getVisualID(view)) {
		case SocietyEditPart.VISUAL_ID:
			return getSociety_1000Text(view);
		case IndividualInstanceEditPart.VISUAL_ID:
			return getIndividualInstance_2001Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2002Text(view);
		case SpecializationEditPart.VISUAL_ID:
			return getSpecialization_4001Text(view);
		case IndividualRealizationEditPart.VISUAL_ID:
			return getIndividualRealization_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSociety_1000Text(View view) {
		Society domainModelElement = (Society) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SocialDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualInstance_2001Text(View view) {
		IParser parser = SocialParserProvider.getParser(
				SocialElementTypes.IndividualInstance_2001,
				view.getElement() != null ? view.getElement() : view,
				SocialVisualIDRegistry
						.getType(IndividualInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SocialDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRole_2002Text(View view) {
		IParser parser = SocialParserProvider.getParser(
				SocialElementTypes.Role_2002,
				view.getElement() != null ? view.getElement() : view,
				SocialVisualIDRegistry.getType(RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SocialDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpecialization_4001Text(View view) {
		Specialization domainModelElement = (Specialization) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			SocialDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndividualRealization_4002Text(View view) {
		IndividualRealization domainModelElement = (IndividualRealization) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			SocialDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SocietyEditPart.MODEL_ID.equals(SocialVisualIDRegistry
				.getModelID(view));
	}

}
