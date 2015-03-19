/**
 */
package spmm.provider;

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

import spmm.util.SpmmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpmmItemProviderAdapterFactory extends SpmmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public SpmmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link spmm.Universe} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniverseItemProvider universeItemProvider;

	/**
	 * This creates an adapter for a {@link spmm.Universe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUniverseAdapter() {
		if (universeItemProvider == null) {
			universeItemProvider = new UniverseItemProvider(this);
		}

		return universeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link spmm.VirtualSpace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualSpaceItemProvider virtualSpaceItemProvider;

	/**
	 * This creates an adapter for a {@link spmm.VirtualSpace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVirtualSpaceAdapter() {
		if (virtualSpaceItemProvider == null) {
			virtualSpaceItemProvider = new VirtualSpaceItemProvider(this);
		}

		return virtualSpaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link spmm.PhysicalSpace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalSpaceItemProvider physicalSpaceItemProvider;

	/**
	 * This creates an adapter for a {@link spmm.PhysicalSpace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhysicalSpaceAdapter() {
		if (physicalSpaceItemProvider == null) {
			physicalSpaceItemProvider = new PhysicalSpaceItemProvider(this);
		}

		return physicalSpaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link spmm.LocationUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationUnitItemProvider locationUnitItemProvider;

	/**
	 * This creates an adapter for a {@link spmm.LocationUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocationUnitAdapter() {
		if (locationUnitItemProvider == null) {
			locationUnitItemProvider = new LocationUnitItemProvider(this);
		}

		return locationUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link spmm.Identification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentificationItemProvider identificationItemProvider;

	/**
	 * This creates an adapter for a {@link spmm.Identification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIdentificationAdapter() {
		if (identificationItemProvider == null) {
			identificationItemProvider = new IdentificationItemProvider(this);
		}

		return identificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link spmm.Grouping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupingItemProvider groupingItemProvider;

	/**
	 * This creates an adapter for a {@link spmm.Grouping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupingAdapter() {
		if (groupingItemProvider == null) {
			groupingItemProvider = new GroupingItemProvider(this);
		}

		return groupingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link spmm.Generalization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationItemProvider generalizationItemProvider;

	/**
	 * This creates an adapter for a {@link spmm.Generalization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralizationAdapter() {
		if (generalizationItemProvider == null) {
			generalizationItemProvider = new GeneralizationItemProvider(this);
		}

		return generalizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link spmm.Contention} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentionItemProvider contentionItemProvider;

	/**
	 * This creates an adapter for a {@link spmm.Contention}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContentionAdapter() {
		if (contentionItemProvider == null) {
			contentionItemProvider = new ContentionItemProvider(this);
		}

		return contentionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link spmm.Representation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationItemProvider representationItemProvider;

	/**
	 * This creates an adapter for a {@link spmm.Representation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepresentationAdapter() {
		if (representationItemProvider == null) {
			representationItemProvider = new RepresentationItemProvider(this);
		}

		return representationItemProvider;
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
		if (universeItemProvider != null) universeItemProvider.dispose();
		if (virtualSpaceItemProvider != null) virtualSpaceItemProvider.dispose();
		if (physicalSpaceItemProvider != null) physicalSpaceItemProvider.dispose();
		if (locationUnitItemProvider != null) locationUnitItemProvider.dispose();
		if (identificationItemProvider != null) identificationItemProvider.dispose();
		if (groupingItemProvider != null) groupingItemProvider.dispose();
		if (generalizationItemProvider != null) generalizationItemProvider.dispose();
		if (contentionItemProvider != null) contentionItemProvider.dispose();
		if (representationItemProvider != null) representationItemProvider.dispose();
	}

}
