/**
 */
package rsmm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rsmm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rsmm.RsmmPackage
 * @generated
 */
public class RsmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RsmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RsmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RsmmPackage.eINSTANCE;
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
	protected RsmmSwitch<Adapter> modelSwitch =
		new RsmmSwitch<Adapter>() {
			@Override
			public Adapter caseSystemInformationFlowReferenceSpace(SystemInformationFlowReferenceSpace object) {
				return createSystemInformationFlowReferenceSpaceAdapter();
			}
			@Override
			public Adapter caseReferentialSpace(ReferentialSpace object) {
				return createReferentialSpaceAdapter();
			}
			@Override
			public Adapter caseContextAwareEntityReference(ContextAwareEntityReference object) {
				return createContextAwareEntityReferenceAdapter();
			}
			@Override
			public Adapter caseSpaceToEntityReferenceDependency(SpaceToEntityReferenceDependency object) {
				return createSpaceToEntityReferenceDependencyAdapter();
			}
			@Override
			public Adapter caseSpaceToSpaceReferenceDependency(SpaceToSpaceReferenceDependency object) {
				return createSpaceToSpaceReferenceDependencyAdapter();
			}
			@Override
			public Adapter caseReferenceDependency(ReferenceDependency object) {
				return createReferenceDependencyAdapter();
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
	 * Creates a new adapter for an object of class '{@link rsmm.SystemInformationFlowReferenceSpace <em>System Information Flow Reference Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsmm.SystemInformationFlowReferenceSpace
	 * @generated
	 */
	public Adapter createSystemInformationFlowReferenceSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsmm.ReferentialSpace <em>Referential Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsmm.ReferentialSpace
	 * @generated
	 */
	public Adapter createReferentialSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsmm.ContextAwareEntityReference <em>Context Aware Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsmm.ContextAwareEntityReference
	 * @generated
	 */
	public Adapter createContextAwareEntityReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsmm.SpaceToEntityReferenceDependency <em>Space To Entity Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsmm.SpaceToEntityReferenceDependency
	 * @generated
	 */
	public Adapter createSpaceToEntityReferenceDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsmm.SpaceToSpaceReferenceDependency <em>Space To Space Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsmm.SpaceToSpaceReferenceDependency
	 * @generated
	 */
	public Adapter createSpaceToSpaceReferenceDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsmm.ReferenceDependency <em>Reference Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsmm.ReferenceDependency
	 * @generated
	 */
	public Adapter createReferenceDependencyAdapter() {
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

} //RsmmAdapterFactory
