/**
 */
package somm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import somm.IndividualInstance;
import somm.IndividualRealization;
import somm.Role;
import somm.Society;
import somm.SommPackage;
import somm.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Society</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link somm.impl.SocietyImpl#getGeneralizations <em>Generalizations</em>}</li>
 *   <li>{@link somm.impl.SocietyImpl#getRelaizations <em>Relaizations</em>}</li>
 *   <li>{@link somm.impl.SocietyImpl#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link somm.impl.SocietyImpl#getName <em>Name</em>}</li>
 *   <li>{@link somm.impl.SocietyImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocietyImpl extends MinimalEObjectImpl.Container implements Society {
	/**
	 * The cached value of the '{@link #getGeneralizations() <em>Generalizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> generalizations;

	/**
	 * The cached value of the '{@link #getRelaizations() <em>Relaizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaizations()
	 * @generated
	 * @ordered
	 */
	protected EList<IndividualRealization> relaizations;

	/**
	 * The cached value of the '{@link #getIndividuals() <em>Individuals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividuals()
	 * @generated
	 * @ordered
	 */
	protected EList<IndividualInstance> individuals;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocietyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SommPackage.Literals.SOCIETY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getGeneralizations() {
		if (generalizations == null) {
			generalizations = new EObjectContainmentWithInverseEList<Specialization>(Specialization.class, this, SommPackage.SOCIETY__GENERALIZATIONS, SommPackage.SPECIALIZATION__SOCIETY);
		}
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndividualRealization> getRelaizations() {
		if (relaizations == null) {
			relaizations = new EObjectContainmentWithInverseEList<IndividualRealization>(IndividualRealization.class, this, SommPackage.SOCIETY__RELAIZATIONS, SommPackage.INDIVIDUAL_REALIZATION__SOCIETY);
		}
		return relaizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndividualInstance> getIndividuals() {
		if (individuals == null) {
			individuals = new EObjectContainmentWithInverseEList<IndividualInstance>(IndividualInstance.class, this, SommPackage.SOCIETY__INDIVIDUALS, SommPackage.INDIVIDUAL_INSTANCE__SOCIETY);
		}
		return individuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SommPackage.SOCIETY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList<Role>(Role.class, this, SommPackage.SOCIETY__ROLES, SommPackage.ROLE__SOCIETY);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SommPackage.SOCIETY__GENERALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralizations()).basicAdd(otherEnd, msgs);
			case SommPackage.SOCIETY__RELAIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelaizations()).basicAdd(otherEnd, msgs);
			case SommPackage.SOCIETY__INDIVIDUALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIndividuals()).basicAdd(otherEnd, msgs);
			case SommPackage.SOCIETY__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SommPackage.SOCIETY__GENERALIZATIONS:
				return ((InternalEList<?>)getGeneralizations()).basicRemove(otherEnd, msgs);
			case SommPackage.SOCIETY__RELAIZATIONS:
				return ((InternalEList<?>)getRelaizations()).basicRemove(otherEnd, msgs);
			case SommPackage.SOCIETY__INDIVIDUALS:
				return ((InternalEList<?>)getIndividuals()).basicRemove(otherEnd, msgs);
			case SommPackage.SOCIETY__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SommPackage.SOCIETY__GENERALIZATIONS:
				return getGeneralizations();
			case SommPackage.SOCIETY__RELAIZATIONS:
				return getRelaizations();
			case SommPackage.SOCIETY__INDIVIDUALS:
				return getIndividuals();
			case SommPackage.SOCIETY__NAME:
				return getName();
			case SommPackage.SOCIETY__ROLES:
				return getRoles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SommPackage.SOCIETY__GENERALIZATIONS:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case SommPackage.SOCIETY__RELAIZATIONS:
				getRelaizations().clear();
				getRelaizations().addAll((Collection<? extends IndividualRealization>)newValue);
				return;
			case SommPackage.SOCIETY__INDIVIDUALS:
				getIndividuals().clear();
				getIndividuals().addAll((Collection<? extends IndividualInstance>)newValue);
				return;
			case SommPackage.SOCIETY__NAME:
				setName((String)newValue);
				return;
			case SommPackage.SOCIETY__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SommPackage.SOCIETY__GENERALIZATIONS:
				getGeneralizations().clear();
				return;
			case SommPackage.SOCIETY__RELAIZATIONS:
				getRelaizations().clear();
				return;
			case SommPackage.SOCIETY__INDIVIDUALS:
				getIndividuals().clear();
				return;
			case SommPackage.SOCIETY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SommPackage.SOCIETY__ROLES:
				getRoles().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SommPackage.SOCIETY__GENERALIZATIONS:
				return generalizations != null && !generalizations.isEmpty();
			case SommPackage.SOCIETY__RELAIZATIONS:
				return relaizations != null && !relaizations.isEmpty();
			case SommPackage.SOCIETY__INDIVIDUALS:
				return individuals != null && !individuals.isEmpty();
			case SommPackage.SOCIETY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SommPackage.SOCIETY__ROLES:
				return roles != null && !roles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SocietyImpl
