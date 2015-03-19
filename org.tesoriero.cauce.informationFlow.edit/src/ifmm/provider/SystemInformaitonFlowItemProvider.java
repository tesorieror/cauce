/**
 */
package ifmm.provider;


import ifmm.IfmmFactory;
import ifmm.IfmmPackage;
import ifmm.SystemInformaitonFlow;

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

/**
 * This is the item provider adapter for a {@link ifmm.SystemInformaitonFlow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemInformaitonFlowItemProvider
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
	public SystemInformaitonFlowItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_SystemInformaitonFlow_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemInformaitonFlow_id_feature", "_UI_SystemInformaitonFlow_type"),
				 IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_SystemInformaitonFlow_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemInformaitonFlow_name_feature", "_UI_SystemInformaitonFlow_type"),
				 IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__ENTITIES);
			childrenFeatures.add(IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS);
			childrenFeatures.add(IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__EDGES);
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
	 * This returns SystemInformaitonFlow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SystemInformaitonFlow"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SystemInformaitonFlow)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SystemInformaitonFlow_type") :
			getString("_UI_SystemInformaitonFlow_type") + " " + label;
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

		switch (notification.getFeatureID(SystemInformaitonFlow.class)) {
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ID:
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__ENTITIES:
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS:
			case IfmmPackage.SYSTEM_INFORMAITON_FLOW__EDGES:
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
				(IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__ENTITIES,
				 IfmmFactory.eINSTANCE.createContextAwareEntity()));

		newChildDescriptors.add
			(createChildParameter
				(IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS,
				 IfmmFactory.eINSTANCE.createPointToPointInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__INFORMATION_FLOWS,
				 IfmmFactory.eINSTANCE.createBroadcastInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__EDGES,
				 IfmmFactory.eINSTANCE.createEntityToBroadcastInformationFlowEdge()));

		newChildDescriptors.add
			(createChildParameter
				(IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__EDGES,
				 IfmmFactory.eINSTANCE.createEntityToPointToPointInformationFlowEdge()));

		newChildDescriptors.add
			(createChildParameter
				(IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__EDGES,
				 IfmmFactory.eINSTANCE.createBroadcastInformationFlowToEntityEdge()));

		newChildDescriptors.add
			(createChildParameter
				(IfmmPackage.Literals.SYSTEM_INFORMAITON_FLOW__EDGES,
				 IfmmFactory.eINSTANCE.createPointToPointInformationFlowToEntityEdge()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return InformationFlowEditPlugin.INSTANCE;
	}

}
