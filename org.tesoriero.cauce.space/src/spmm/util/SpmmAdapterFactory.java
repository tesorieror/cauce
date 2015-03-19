/**
 */
package spmm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import spmm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see spmm.SpmmPackage
 * @generated
 */
public class SpmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpmmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpmmSwitch<Adapter> modelSwitch =
		new SpmmSwitch<Adapter>() {
			@Override
			public Adapter caseUniverse(Universe object) {
				return createUniverseAdapter();
			}
			@Override
			public Adapter caseSpace(Space object) {
				return createSpaceAdapter();
			}
			@Override
			public Adapter caseVirtualSpace(VirtualSpace object) {
				return createVirtualSpaceAdapter();
			}
			@Override
			public Adapter casePhysicalSpace(PhysicalSpace object) {
				return createPhysicalSpaceAdapter();
			}
			@Override
			public Adapter caseLocationUnit(LocationUnit object) {
				return createLocationUnitAdapter();
			}
			@Override
			public Adapter caseIdentification(Identification object) {
				return createIdentificationAdapter();
			}
			@Override
			public Adapter caseGrouping(Grouping object) {
				return createGroupingAdapter();
			}
			@Override
			public Adapter caseGeneralization(Generalization object) {
				return createGeneralizationAdapter();
			}
			@Override
			public Adapter caseContention(Contention object) {
				return createContentionAdapter();
			}
			@Override
			public Adapter caseRepresentation(Representation object) {
				return createRepresentationAdapter();
			}
			@Override
			public Adapter caseSpaceRelationship(SpaceRelationship object) {
				return createSpaceRelationshipAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link spmm.Universe <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spmm.Universe
	 * @generated
	 */
	public Adapter createUniverseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spmm.Space <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spmm.Space
	 * @generated
	 */
	public Adapter createSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spmm.VirtualSpace <em>Virtual Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spmm.VirtualSpace
	 * @generated
	 */
	public Adapter createVirtualSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spmm.PhysicalSpace <em>Physical Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spmm.PhysicalSpace
	 * @generated
	 */
	public Adapter createPhysicalSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spmm.LocationUnit <em>Location Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spmm.LocationUnit
	 * @generated
	 */
	public Adapter createLocationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spmm.Identification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spmm.Identification
	 * @generated
	 */
	public Adapter createIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spmm.Grouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spmm.Grouping
	 * @generated
	 */
	public Adapter createGroupingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spmm.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spmm.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spmm.Contention <em>Contention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spmm.Contention
	 * @generated
	 */
	public Adapter createContentionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spmm.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spmm.Representation
	 * @generated
	 */
	public Adapter createRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spmm.SpaceRelationship <em>Space Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spmm.SpaceRelationship
	 * @generated
	 */
	public Adapter createSpaceRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpmmAdapterFactory
