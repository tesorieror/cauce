/**
 */
package tamm.provider;


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

import tamm.ContextAwareSystem;
import tamm.TammFactory;
import tamm.TammPackage;

/**
 * This is the item provider adapter for a {@link tamm.ContextAwareSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextAwareSystemItemProvider
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
	public ContextAwareSystemItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_ContextAwareSystem_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContextAwareSystem_name_feature", "_UI_ContextAwareSystem_type"),
				 TammPackage.Literals.CONTEXT_AWARE_SYSTEM__NAME,
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
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS);
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS);
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS);
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS);
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS);
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS);
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS);
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS);
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS);
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS);
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS);
			childrenFeatures.add(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS);
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
	 * This returns ContextAwareSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContextAwareSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContextAwareSystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ContextAwareSystem_type") :
			getString("_UI_ContextAwareSystem_type") + " " + label;
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

		switch (notification.getFeatureID(ContextAwareSystem.class)) {
			case TammPackage.CONTEXT_AWARE_SYSTEM__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TammPackage.CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS:
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS:
			case TammPackage.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS:
			case TammPackage.CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS:
			case TammPackage.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS:
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS:
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS:
			case TammPackage.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS:
			case TammPackage.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS:
			case TammPackage.CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS:
			case TammPackage.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS:
			case TammPackage.CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS:
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
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__FINAL_CONDITIONS,
				 TammFactory.eINSTANCE.createFinalCondition()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__PRE_CONDITIONS,
				 TammFactory.eINSTANCE.createPreCondition()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__POST_CONDITIONS,
				 TammFactory.eINSTANCE.createPostCondition()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__INITIAL_CONDITIONS,
				 TammFactory.eINSTANCE.createInitialCondition()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS,
				 TammFactory.eINSTANCE.createAndJoin()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS,
				 TammFactory.eINSTANCE.createOrJoin()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS,
				 TammFactory.eINSTANCE.createAndSplit()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__ROUTE_TASKS,
				 TammFactory.eINSTANCE.createOrSplit()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS,
				 TammFactory.eINSTANCE.createSimpleTask()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__SYSTEM_TASKS,
				 TammFactory.eINSTANCE.createSkipTask()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_JOIN_TASKS,
				 TammFactory.eINSTANCE.createInputConditionToJoinTask()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__INPUT_CONDITION_TO_SPLIT_TASKS,
				 TammFactory.eINSTANCE.createInputConditionToSplitTask()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__JOIN_TASK_TO_OUTPUT_CONDITIONS,
				 TammFactory.eINSTANCE.createJoinTaskToOutputCondition()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__SPLIT_TASK_TO_OUTPUT_CONDITIONS,
				 TammFactory.eINSTANCE.createSplitTaskToOutputCondition()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__PRE_CONDITION_TO_SYSTEM_TASKS,
				 TammFactory.eINSTANCE.createPreConditionToSystemTask()));

		newChildDescriptors.add
			(createChildParameter
				(TammPackage.Literals.CONTEXT_AWARE_SYSTEM__SYSTEM_TASK_TO_POST_CONDITIONS,
				 TammFactory.eINSTANCE.createSystemTaskToPostCondition()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TaskEditPlugin.INSTANCE;
	}

}
