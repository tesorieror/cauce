/**
 */
package rsmm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import rsmm.RsmmFactory;
import rsmm.RsmmPackage;
import rsmm.SystemInformationFlowReferenceSpace;

/**
 * This is the item provider adapter for a {@link rsmm.SystemInformationFlowReferenceSpace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemInformationFlowReferenceSpaceItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInformationFlowReferenceSpaceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemInformationFlowReferenceSpace_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemInformationFlowReferenceSpace_name_feature", "_UI_SystemInformationFlowReferenceSpace_type"),
				 RsmmPackage.Literals.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemInformationFlowReferenceSpace_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemInformationFlowReferenceSpace_id_feature", "_UI_SystemInformationFlowReferenceSpace_type"),
				 RsmmPackage.Literals.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RsmmPackage.Literals.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES);
			childrenFeatures.add(RsmmPackage.Literals.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES);
			childrenFeatures.add(RsmmPackage.Literals.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES);
			childrenFeatures.add(RsmmPackage.Literals.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SystemInformationFlowReferenceSpace.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SystemInformationFlowReferenceSpace"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SystemInformationFlowReferenceSpace)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SystemInformationFlowReferenceSpace_type") :
			getString("_UI_SystemInformationFlowReferenceSpace_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SystemInformationFlowReferenceSpace.class)) {
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__NAME:
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES:
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES:
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES:
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RsmmPackage.Literals.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__REFERENTIAL_SPACES,
				 RsmmFactory.eINSTANCE.createReferentialSpace()));

		newChildDescriptors.add
			(createChildParameter
				(RsmmPackage.Literals.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_SPACE_REFERENCE_DEPENDENCIES,
				 RsmmFactory.eINSTANCE.createSpaceToSpaceReferenceDependency()));

		newChildDescriptors.add
			(createChildParameter
				(RsmmPackage.Literals.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__SPACE_TO_ENTITY_REFERENCE_DEPENDENCIES,
				 RsmmFactory.eINSTANCE.createSpaceToEntityReferenceDependency()));

		newChildDescriptors.add
			(createChildParameter
				(RsmmPackage.Literals.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE__ENTITY_REFERENCES,
				 RsmmFactory.eINSTANCE.createContextAwareEntityReference()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SpaceReferenceEditPlugin.INSTANCE;
	}

}
