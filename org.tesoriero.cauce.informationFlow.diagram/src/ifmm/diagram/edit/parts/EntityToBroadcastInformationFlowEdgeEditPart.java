package ifmm.diagram.edit.parts;

import ifmm.diagram.edit.policies.EntityToBroadcastInformationFlowEdgeItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EntityToBroadcastInformationFlowEdgeEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public EntityToBroadcastInformationFlowEdgeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new EntityToBroadcastInformationFlowEdgeItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new EntityToBroadcastInformationFlowEdgeFigure();
	}

	/**
	 * @generated
	 */
	public EntityToBroadcastInformationFlowEdgeFigure getPrimaryShape() {
		return (EntityToBroadcastInformationFlowEdgeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class EntityToBroadcastInformationFlowEdgeFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public EntityToBroadcastInformationFlowEdgeFigure() {
			this.setLineStyle(Graphics.LINE_DASH);

		}

	}

}
