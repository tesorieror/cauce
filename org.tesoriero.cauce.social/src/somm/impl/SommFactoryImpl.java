/**
 */
package somm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import somm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SommFactoryImpl extends EFactoryImpl implements SommFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SommFactory init() {
		try {
			SommFactory theSommFactory = (SommFactory)EPackage.Registry.INSTANCE.getEFactory(SommPackage.eNS_URI);
			if (theSommFactory != null) {
				return theSommFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SommFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SommFactoryImpl() {
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
			case SommPackage.ROLE: return createRole();
			case SommPackage.INDIVIDUAL_REALIZATION: return createIndividualRealization();
			case SommPackage.SOCIETY: return createSociety();
			case SommPackage.SPECIALIZATION: return createSpecialization();
			case SommPackage.INDIVIDUAL_INSTANCE: return createIndividualInstance();
			case SommPackage.SOCIAL_INSTANCE: return createSocialInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualRealization createIndividualRealization() {
		IndividualRealizationImpl individualRealization = new IndividualRealizationImpl();
		return individualRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Society createSociety() {
		SocietyImpl society = new SocietyImpl();
		return society;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization createSpecialization() {
		SpecializationImpl specialization = new SpecializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualInstance createIndividualInstance() {
		IndividualInstanceImpl individualInstance = new IndividualInstanceImpl();
		return individualInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialInstance createSocialInstance() {
		SocialInstanceImpl socialInstance = new SocialInstanceImpl();
		return socialInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SommPackage getSommPackage() {
		return (SommPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SommPackage getPackage() {
		return SommPackage.eINSTANCE;
	}

} //SommFactoryImpl
