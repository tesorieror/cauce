/**
 */
package rsmm.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import rsmm.util.RsmmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RsmmItemProviderAdapterFactory extends RsmmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RsmmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link rsmm.SystemInformationFlowReferenceSpace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemInformationFlowReferenceSpaceItemProvider systemInformationFlowReferenceSpaceItemProvider;

	/**
	 * This creates an adapter for a {@link rsmm.SystemInformationFlowReferenceSpace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemInformationFlowReferenceSpaceAdapter() {
		if (systemInformationFlowReferenceSpaceItemProvider == null) {
			systemInformationFlowReferenceSpaceItemProvider = new SystemInformationFlowReferenceSpaceItemProvider(this);
		}

		return systemInformationFlowReferenceSpaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rsmm.ReferentialSpace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferentialSpaceItemProvider referentialSpaceItemProvider;

	/**
	 * This creates an adapter for a {@link rsmm.ReferentialSpace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferentialSpaceAdapter() {
		if (referentialSpaceItemProvider == null) {
			referentialSpaceItemProvider = new ReferentialSpaceItemProvider(this);
		}

		return referentialSpaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rsmm.ContextAwareEntityReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextAwareEntityReferenceItemProvider contextAwareEntityReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link rsmm.ContextAwareEntityReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextAwareEntityReferenceAdapter() {
		if (contextAwareEntityReferenceItemProvider == null) {
			contextAwareEntityReferenceItemProvider = new ContextAwareEntityReferenceItemProvider(this);
		}

		return contextAwareEntityReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rsmm.SpaceToEntityReferenceDependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceToEntityReferenceDependencyItemProvider spaceToEntityReferenceDependencyItemProvider;

	/**
	 * This creates an adapter for a {@link rsmm.SpaceToEntityReferenceDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpaceToEntityReferenceDependencyAdapter() {
		if (spaceToEntityReferenceDependencyItemProvider == null) {
			spaceToEntityReferenceDependencyItemProvider = new SpaceToEntityReferenceDependencyItemProvider(this);
		}

		return spaceToEntityReferenceDependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rsmm.SpaceToSpaceReferenceDependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceToSpaceReferenceDependencyItemProvider spaceToSpaceReferenceDependencyItemProvider;

	/**
	 * This creates an adapter for a {@link rsmm.SpaceToSpaceReferenceDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpaceToSpaceReferenceDependencyAdapter() {
		if (spaceToSpaceReferenceDependencyItemProvider == null) {
			spaceToSpaceReferenceDependencyItemProvider = new SpaceToSpaceReferenceDependencyItemProvider(this);
		}

		return spaceToSpaceReferenceDependencyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (systemInformationFlowReferenceSpaceItemProvider != null) systemInformationFlowReferenceSpaceItemProvider.dispose();
		if (referentialSpaceItemProvider != null) referentialSpaceItemProvider.dispose();
		if (contextAwareEntityReferenceItemProvider != null) contextAwareEntityReferenceItemProvider.dispose();
		if (spaceToEntityReferenceDependencyItemProvider != null) spaceToEntityReferenceDependencyItemProvider.dispose();
		if (spaceToSpaceReferenceDependencyItemProvider != null) spaceToSpaceReferenceDependencyItemProvider.dispose();
	}

}
