package demm.diagram.providers;

import org.eclipse.emf.ecore.EcorePackage;

import demm.Connection;
import demm.ConnectionPlatform;
import demm.DemmPackage;
import demm.Device;
import demm.DevicePlatform;
import demm.Entity;
import demm.Information;
import demm.Medium;
import demm.OperatingSystem;
import demm.ProgrammingLanguage;
import demm.Protocol;
import demm.diagram.expressions.DeploymentAbstractExpression;
import demm.diagram.expressions.DeploymentOCLFactory;
import demm.diagram.part.DeploymentDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_ProgrammingLanguage_2001(ProgrammingLanguage instance) {
		try {
			Object value_0 = DeploymentOCLFactory.getExpression(0,
					DemmPackage.eINSTANCE.getProgrammingLanguage(), null)
					.evaluate(instance);
			instance.setName((String) value_0);
			Object value_1 = DeploymentOCLFactory.getExpression(1,
					DemmPackage.eINSTANCE.getProgrammingLanguage(), null)
					.evaluate(instance);
			instance.setProfile((String) value_1);
			Object value_2 = DeploymentOCLFactory.getExpression(2,
					DemmPackage.eINSTANCE.getProgrammingLanguage(), null)
					.evaluate(instance);
			instance.setVersion((String) value_2);
			Object value_3 = DeploymentOCLFactory.getExpression(3,
					DemmPackage.eINSTANCE.getProgrammingLanguage(), null)
					.evaluate(instance);
			instance.setRevision((String) value_3);
		} catch (RuntimeException e) {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OperatingSystem_2002(OperatingSystem instance) {
		try {
			Object value_0 = DeploymentOCLFactory.getExpression(4,
					DemmPackage.eINSTANCE.getOperatingSystem(), null).evaluate(
					instance);
			instance.setName((String) value_0);
			Object value_1 = DeploymentOCLFactory.getExpression(5,
					DemmPackage.eINSTANCE.getOperatingSystem(), null).evaluate(
					instance);
			instance.setRevision((String) value_1);
			Object value_2 = DeploymentOCLFactory.getExpression(6,
					DemmPackage.eINSTANCE.getOperatingSystem(), null).evaluate(
					instance);
			instance.setVersion((String) value_2);
		} catch (RuntimeException e) {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Device_2003(Device instance) {
		try {
			Object value_0 = DeploymentOCLFactory.getExpression(7,
					DemmPackage.eINSTANCE.getDevice(), null).evaluate(instance);
			instance.setName((String) value_0);
			Object value_1 = DeploymentOCLFactory.getExpression(8,
					DemmPackage.eINSTANCE.getDevice(), null).evaluate(instance);
			instance.setId((String) value_1);
		} catch (RuntimeException e) {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Connection_2004(Connection instance) {
		try {
			Object value_0 = DeploymentOCLFactory.getExpression(12,
					DemmPackage.eINSTANCE.getConnection(), null).evaluate(
					instance);

			value_0 = DeploymentAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = DeploymentOCLFactory.getExpression(13,
					DemmPackage.eINSTANCE.getConnection(), null).evaluate(
					instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Medium_2005(Medium instance) {
		try {
			Object value_0 = DeploymentOCLFactory.getExpression(17,
					DemmPackage.eINSTANCE.getMedium(), null).evaluate(instance);
			instance.setTechnology((String) value_0);
			Object value_1 = DeploymentOCLFactory.getExpression(18,
					DemmPackage.eINSTANCE.getMedium(), null).evaluate(instance);
			instance.setType((String) value_1);
			Object value_2 = DeploymentOCLFactory.getExpression(19,
					DemmPackage.eINSTANCE.getMedium(), null).evaluate(instance);
			instance.setVersion((String) value_2);
		} catch (RuntimeException e) {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Protocol_2006(Protocol instance) {
		try {
			Object value_0 = DeploymentOCLFactory.getExpression(20,
					DemmPackage.eINSTANCE.getProtocol(), null).evaluate(
					instance);
			instance.setName((String) value_0);
			Object value_1 = DeploymentOCLFactory.getExpression(21,
					DemmPackage.eINSTANCE.getProtocol(), null).evaluate(
					instance);
			instance.setVersion((String) value_1);
		} catch (RuntimeException e) {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DevicePlatform_3001(DevicePlatform instance) {
		try {
			Object value_0 = DeploymentOCLFactory.getExpression(9,
					DemmPackage.eINSTANCE.getDevicePlatform(), null).evaluate(
					instance);
			instance.setName((String) value_0);
			Object value_1 = DeploymentOCLFactory.getExpression(10,
					DemmPackage.eINSTANCE.getDevicePlatform(), null).evaluate(
					instance);

			value_1 = DeploymentAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Entity_3002(Entity instance) {
		try {
			Object value_0 = DeploymentOCLFactory.getExpression(11,
					DemmPackage.eINSTANCE.getEntity(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Information_3003(Information instance) {
		try {
			Object value_0 = DeploymentOCLFactory.getExpression(14,
					DemmPackage.eINSTANCE.getInformation(), null).evaluate(
					instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ConnectionPlatform_3004(ConnectionPlatform instance) {
		try {
			Object value_0 = DeploymentOCLFactory.getExpression(15,
					DemmPackage.eINSTANCE.getConnectionPlatform(), null)
					.evaluate(instance);

			value_0 = DeploymentAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setId(((Integer) value_0).intValue());
			Object value_1 = DeploymentOCLFactory.getExpression(16,
					DemmPackage.eINSTANCE.getConnectionPlatform(), null)
					.evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			DeploymentDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = DeploymentDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			DeploymentDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
