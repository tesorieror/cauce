/**
 */
package rsmm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rsmm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RsmmFactoryImpl extends EFactoryImpl implements RsmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RsmmFactory init() {
		try {
			RsmmFactory theRsmmFactory = (RsmmFactory)EPackage.Registry.INSTANCE.getEFactory(RsmmPackage.eNS_URI);
			if (theRsmmFactory != null) {
				return theRsmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RsmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RsmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RsmmPackage.SYSTEM_INFORMATION_FLOW_REFERENCE_SPACE: return createSystemInformationFlowReferenceSpace();
			case RsmmPackage.REFERENTIAL_SPACE: return createReferentialSpace();
			case RsmmPackage.CONTEXT_AWARE_ENTITY_REFERENCE: return createContextAwareEntityReference();
			case RsmmPackage.SPACE_TO_ENTITY_REFERENCE_DEPENDENCY: return createSpaceToEntityReferenceDependency();
			case RsmmPackage.SPACE_TO_SPACE_REFERENCE_DEPENDENCY: return createSpaceToSpaceReferenceDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInformationFlowReferenceSpace createSystemInformationFlowReferenceSpace() {
		SystemInformationFlowReferenceSpaceImpl systemInformationFlowReferenceSpace = new SystemInformationFlowReferenceSpaceImpl();
		return systemInformationFlowReferenceSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferentialSpace createReferentialSpace() {
		ReferentialSpaceImpl referentialSpace = new ReferentialSpaceImpl();
		return referentialSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAwareEntityReference createContextAwareEntityReference() {
		ContextAwareEntityReferenceImpl contextAwareEntityReference = new ContextAwareEntityReferenceImpl();
		return contextAwareEntityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceToEntityReferenceDependency createSpaceToEntityReferenceDependency() {
		SpaceToEntityReferenceDependencyImpl spaceToEntityReferenceDependency = new SpaceToEntityReferenceDependencyImpl();
		return spaceToEntityReferenceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceToSpaceReferenceDependency createSpaceToSpaceReferenceDependency() {
		SpaceToSpaceReferenceDependencyImpl spaceToSpaceReferenceDependency = new SpaceToSpaceReferenceDependencyImpl();
		return spaceToSpaceReferenceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RsmmPackage getRsmmPackage() {
		return (RsmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RsmmPackage getPackage() {
		return RsmmPackage.eINSTANCE;
	}

} //RsmmFactoryImpl
