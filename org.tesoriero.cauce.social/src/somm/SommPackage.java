/**
 */
package somm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see somm.SommFactory
 * @model kind="package"
 * @generated
 */
public interface SommPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "somm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tesoriero.org/cauce/social/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "somm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SommPackage eINSTANCE = somm.impl.SommPackageImpl.init();

	/**
	 * The meta object id for the '{@link somm.impl.SocialInstanceImpl <em>Social Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see somm.impl.SocialInstanceImpl
	 * @see somm.impl.SommPackageImpl#getSocialInstance()
	 * @generated
	 */
	int SOCIAL_INSTANCE = 5;

	/**
	 * The number of structural features of the '<em>Social Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_INSTANCE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_INSTANCE___GET_ID = 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_INSTANCE___GET_NAME = 1;

	/**
	 * The number of operations of the '<em>Social Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_INSTANCE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link somm.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see somm.impl.RoleImpl
	 * @see somm.impl.SommPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 0;

	/**
	 * The feature id for the '<em><b>Society</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SOCIETY = SOCIAL_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Realized By Individual</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IS_REALIZED_BY_INDIVIDUAL = SOCIAL_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PARENT = SOCIAL_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CHILDREN = SOCIAL_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = SOCIAL_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = SOCIAL_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = SOCIAL_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_ID = SOCIAL_INSTANCE___GET_ID;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_NAME = SOCIAL_INSTANCE___GET_NAME;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = SOCIAL_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link somm.impl.IndividualRealizationImpl <em>Individual Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see somm.impl.IndividualRealizationImpl
	 * @see somm.impl.SommPackageImpl#getIndividualRealization()
	 * @generated
	 */
	int INDIVIDUAL_REALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_REALIZATION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_REALIZATION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Society</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_REALIZATION__SOCIETY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_REALIZATION__ID = 3;

	/**
	 * The number of structural features of the '<em>Individual Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_REALIZATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Individual Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_REALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link somm.impl.SocietyImpl <em>Society</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see somm.impl.SocietyImpl
	 * @see somm.impl.SommPackageImpl#getSociety()
	 * @generated
	 */
	int SOCIETY = 2;

	/**
	 * The feature id for the '<em><b>Generalizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIETY__GENERALIZATIONS = 0;

	/**
	 * The feature id for the '<em><b>Relaizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIETY__RELAIZATIONS = 1;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIETY__INDIVIDUALS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIETY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIETY__ROLES = 4;

	/**
	 * The number of structural features of the '<em>Society</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIETY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Society</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIETY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link somm.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see somm.impl.SpecializationImpl
	 * @see somm.impl.SommPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Society</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SOCIETY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__ID = 3;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link somm.impl.IndividualInstanceImpl <em>Individual Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see somm.impl.IndividualInstanceImpl
	 * @see somm.impl.SommPackageImpl#getIndividualInstance()
	 * @generated
	 */
	int INDIVIDUAL_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_INSTANCE__REALIZES = SOCIAL_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_INSTANCE__ID = SOCIAL_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_INSTANCE__NAME = SOCIAL_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Society</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_INSTANCE__SOCIETY = SOCIAL_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Individual Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_INSTANCE_FEATURE_COUNT = SOCIAL_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_INSTANCE___GET_ID = SOCIAL_INSTANCE___GET_ID;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_INSTANCE___GET_NAME = SOCIAL_INSTANCE___GET_NAME;

	/**
	 * The number of operations of the '<em>Individual Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_INSTANCE_OPERATION_COUNT = SOCIAL_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link somm.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see somm.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the container reference '{@link somm.Role#getSociety <em>Society</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Society</em>'.
	 * @see somm.Role#getSociety()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Society();

	/**
	 * Returns the meta object for the reference list '{@link somm.Role#getIsRealizedByIndividual <em>Is Realized By Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Realized By Individual</em>'.
	 * @see somm.Role#getIsRealizedByIndividual()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_IsRealizedByIndividual();

	/**
	 * Returns the meta object for the reference list '{@link somm.Role#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent</em>'.
	 * @see somm.Role#getParent()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Parent();

	/**
	 * Returns the meta object for the reference list '{@link somm.Role#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see somm.Role#getChildren()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Children();

	/**
	 * Returns the meta object for the attribute '{@link somm.Role#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see somm.Role#getId()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Id();

	/**
	 * Returns the meta object for the attribute '{@link somm.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see somm.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link somm.IndividualRealization <em>Individual Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Realization</em>'.
	 * @see somm.IndividualRealization
	 * @generated
	 */
	EClass getIndividualRealization();

	/**
	 * Returns the meta object for the reference '{@link somm.IndividualRealization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see somm.IndividualRealization#getTarget()
	 * @see #getIndividualRealization()
	 * @generated
	 */
	EReference getIndividualRealization_Target();

	/**
	 * Returns the meta object for the reference '{@link somm.IndividualRealization#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see somm.IndividualRealization#getSource()
	 * @see #getIndividualRealization()
	 * @generated
	 */
	EReference getIndividualRealization_Source();

	/**
	 * Returns the meta object for the container reference '{@link somm.IndividualRealization#getSociety <em>Society</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Society</em>'.
	 * @see somm.IndividualRealization#getSociety()
	 * @see #getIndividualRealization()
	 * @generated
	 */
	EReference getIndividualRealization_Society();

	/**
	 * Returns the meta object for the attribute '{@link somm.IndividualRealization#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see somm.IndividualRealization#getId()
	 * @see #getIndividualRealization()
	 * @generated
	 */
	EAttribute getIndividualRealization_Id();

	/**
	 * Returns the meta object for class '{@link somm.Society <em>Society</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Society</em>'.
	 * @see somm.Society
	 * @generated
	 */
	EClass getSociety();

	/**
	 * Returns the meta object for the containment reference list '{@link somm.Society#getGeneralizations <em>Generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalizations</em>'.
	 * @see somm.Society#getGeneralizations()
	 * @see #getSociety()
	 * @generated
	 */
	EReference getSociety_Generalizations();

	/**
	 * Returns the meta object for the containment reference list '{@link somm.Society#getRelaizations <em>Relaizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relaizations</em>'.
	 * @see somm.Society#getRelaizations()
	 * @see #getSociety()
	 * @generated
	 */
	EReference getSociety_Relaizations();

	/**
	 * Returns the meta object for the containment reference list '{@link somm.Society#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individuals</em>'.
	 * @see somm.Society#getIndividuals()
	 * @see #getSociety()
	 * @generated
	 */
	EReference getSociety_Individuals();

	/**
	 * Returns the meta object for the attribute '{@link somm.Society#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see somm.Society#getName()
	 * @see #getSociety()
	 * @generated
	 */
	EAttribute getSociety_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link somm.Society#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see somm.Society#getRoles()
	 * @see #getSociety()
	 * @generated
	 */
	EReference getSociety_Roles();

	/**
	 * Returns the meta object for class '{@link somm.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see somm.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the reference '{@link somm.Specialization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see somm.Specialization#getTarget()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Target();

	/**
	 * Returns the meta object for the reference '{@link somm.Specialization#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see somm.Specialization#getSource()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Source();

	/**
	 * Returns the meta object for the container reference '{@link somm.Specialization#getSociety <em>Society</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Society</em>'.
	 * @see somm.Specialization#getSociety()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Society();

	/**
	 * Returns the meta object for the attribute '{@link somm.Specialization#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see somm.Specialization#getId()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_Id();

	/**
	 * Returns the meta object for class '{@link somm.IndividualInstance <em>Individual Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Instance</em>'.
	 * @see somm.IndividualInstance
	 * @generated
	 */
	EClass getIndividualInstance();

	/**
	 * Returns the meta object for the reference list '{@link somm.IndividualInstance#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizes</em>'.
	 * @see somm.IndividualInstance#getRealizes()
	 * @see #getIndividualInstance()
	 * @generated
	 */
	EReference getIndividualInstance_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link somm.IndividualInstance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see somm.IndividualInstance#getId()
	 * @see #getIndividualInstance()
	 * @generated
	 */
	EAttribute getIndividualInstance_Id();

	/**
	 * Returns the meta object for the attribute '{@link somm.IndividualInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see somm.IndividualInstance#getName()
	 * @see #getIndividualInstance()
	 * @generated
	 */
	EAttribute getIndividualInstance_Name();

	/**
	 * Returns the meta object for the container reference '{@link somm.IndividualInstance#getSociety <em>Society</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Society</em>'.
	 * @see somm.IndividualInstance#getSociety()
	 * @see #getIndividualInstance()
	 * @generated
	 */
	EReference getIndividualInstance_Society();

	/**
	 * Returns the meta object for class '{@link somm.SocialInstance <em>Social Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Instance</em>'.
	 * @see somm.SocialInstance
	 * @generated
	 */
	EClass getSocialInstance();

	/**
	 * Returns the meta object for the '{@link somm.SocialInstance#getID() <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see somm.SocialInstance#getID()
	 * @generated
	 */
	EOperation getSocialInstance__GetID();

	/**
	 * Returns the meta object for the '{@link somm.SocialInstance#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see somm.SocialInstance#getName()
	 * @generated
	 */
	EOperation getSocialInstance__GetName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SommFactory getSommFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link somm.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see somm.impl.RoleImpl
		 * @see somm.impl.SommPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Society</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SOCIETY = eINSTANCE.getRole_Society();

		/**
		 * The meta object literal for the '<em><b>Is Realized By Individual</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__IS_REALIZED_BY_INDIVIDUAL = eINSTANCE.getRole_IsRealizedByIndividual();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PARENT = eINSTANCE.getRole_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__CHILDREN = eINSTANCE.getRole_Children();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ID = eINSTANCE.getRole_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link somm.impl.IndividualRealizationImpl <em>Individual Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see somm.impl.IndividualRealizationImpl
		 * @see somm.impl.SommPackageImpl#getIndividualRealization()
		 * @generated
		 */
		EClass INDIVIDUAL_REALIZATION = eINSTANCE.getIndividualRealization();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_REALIZATION__TARGET = eINSTANCE.getIndividualRealization_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_REALIZATION__SOURCE = eINSTANCE.getIndividualRealization_Source();

		/**
		 * The meta object literal for the '<em><b>Society</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_REALIZATION__SOCIETY = eINSTANCE.getIndividualRealization_Society();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_REALIZATION__ID = eINSTANCE.getIndividualRealization_Id();

		/**
		 * The meta object literal for the '{@link somm.impl.SocietyImpl <em>Society</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see somm.impl.SocietyImpl
		 * @see somm.impl.SommPackageImpl#getSociety()
		 * @generated
		 */
		EClass SOCIETY = eINSTANCE.getSociety();

		/**
		 * The meta object literal for the '<em><b>Generalizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIETY__GENERALIZATIONS = eINSTANCE.getSociety_Generalizations();

		/**
		 * The meta object literal for the '<em><b>Relaizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIETY__RELAIZATIONS = eINSTANCE.getSociety_Relaizations();

		/**
		 * The meta object literal for the '<em><b>Individuals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIETY__INDIVIDUALS = eINSTANCE.getSociety_Individuals();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIETY__NAME = eINSTANCE.getSociety_Name();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIETY__ROLES = eINSTANCE.getSociety_Roles();

		/**
		 * The meta object literal for the '{@link somm.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see somm.impl.SpecializationImpl
		 * @see somm.impl.SommPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__TARGET = eINSTANCE.getSpecialization_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SOURCE = eINSTANCE.getSpecialization_Source();

		/**
		 * The meta object literal for the '<em><b>Society</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SOCIETY = eINSTANCE.getSpecialization_Society();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__ID = eINSTANCE.getSpecialization_Id();

		/**
		 * The meta object literal for the '{@link somm.impl.IndividualInstanceImpl <em>Individual Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see somm.impl.IndividualInstanceImpl
		 * @see somm.impl.SommPackageImpl#getIndividualInstance()
		 * @generated
		 */
		EClass INDIVIDUAL_INSTANCE = eINSTANCE.getIndividualInstance();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_INSTANCE__REALIZES = eINSTANCE.getIndividualInstance_Realizes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_INSTANCE__ID = eINSTANCE.getIndividualInstance_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_INSTANCE__NAME = eINSTANCE.getIndividualInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Society</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_INSTANCE__SOCIETY = eINSTANCE.getIndividualInstance_Society();

		/**
		 * The meta object literal for the '{@link somm.impl.SocialInstanceImpl <em>Social Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see somm.impl.SocialInstanceImpl
		 * @see somm.impl.SommPackageImpl#getSocialInstance()
		 * @generated
		 */
		EClass SOCIAL_INSTANCE = eINSTANCE.getSocialInstance();

		/**
		 * The meta object literal for the '<em><b>Get ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOCIAL_INSTANCE___GET_ID = eINSTANCE.getSocialInstance__GetID();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOCIAL_INSTANCE___GET_NAME = eINSTANCE.getSocialInstance__GetName();

	}

} //SommPackage
