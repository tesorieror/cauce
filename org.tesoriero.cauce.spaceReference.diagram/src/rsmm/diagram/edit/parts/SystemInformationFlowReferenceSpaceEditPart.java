package rsmm.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import rsmm.diagram.edit.policies.SystemInformationFlowReferenceSpaceCanonicalEditPolicy;
import rsmm.diagram.edit.policies.SystemInformationFlowReferenceSpaceItemSemanticEditPolicy;
import rsmm.diagram.part.SpaceReferenceVisualIDRegistry;

/**
 * @generated
 */
public class SystemInformationFlowReferenceSpaceEditPart extends
		DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "SpaceReference"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public SystemInformationFlowReferenceSpaceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SystemInformationFlowReferenceSpaceItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SystemInformationFlowReferenceSpaceCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						SpaceReferenceVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
