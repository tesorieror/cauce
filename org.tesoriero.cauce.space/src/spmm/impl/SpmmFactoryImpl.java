/**
 */
package spmm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spmm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpmmFactoryImpl extends EFactoryImpl implements SpmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpmmFactory init() {
		try {
			SpmmFactory theSpmmFactory = (SpmmFactory)EPackage.Registry.INSTANCE.getEFactory(SpmmPackage.eNS_URI);
			if (theSpmmFactory != null) {
				return theSpmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmmFactoryImpl() {
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
			case SpmmPackage.UNIVERSE: return createUniverse();
			case SpmmPackage.VIRTUAL_SPACE: return createVirtualSpace();
			case SpmmPackage.PHYSICAL_SPACE: return createPhysicalSpace();
			case SpmmPackage.LOCATION_UNIT: return createLocationUnit();
			case SpmmPackage.IDENTIFICATION: return createIdentification();
			case SpmmPackage.GROUPING: return createGrouping();
			case SpmmPackage.GENERALIZATION: return createGeneralization();
			case SpmmPackage.CONTENTION: return createContention();
			case SpmmPackage.REPRESENTATION: return createRepresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universe createUniverse() {
		UniverseImpl universe = new UniverseImpl();
		return universe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSpace createVirtualSpace() {
		VirtualSpaceImpl virtualSpace = new VirtualSpaceImpl();
		return virtualSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalSpace createPhysicalSpace() {
		PhysicalSpaceImpl physicalSpace = new PhysicalSpaceImpl();
		return physicalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationUnit createLocationUnit() {
		LocationUnitImpl locationUnit = new LocationUnitImpl();
		return locationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identification createIdentification() {
		IdentificationImpl identification = new IdentificationImpl();
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grouping createGrouping() {
		GroupingImpl grouping = new GroupingImpl();
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contention createContention() {
		ContentionImpl contention = new ContentionImpl();
		return contention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation createRepresentation() {
		RepresentationImpl representation = new RepresentationImpl();
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmmPackage getSpmmPackage() {
		return (SpmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpmmPackage getPackage() {
		return SpmmPackage.eINSTANCE;
	}

} //SpmmFactoryImpl
