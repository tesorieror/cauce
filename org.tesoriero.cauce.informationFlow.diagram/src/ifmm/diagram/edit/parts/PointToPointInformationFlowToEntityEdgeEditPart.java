package ifmm.diagram.edit.parts;

import ifmm.diagram.edit.policies.PointToPointInformationFlowToEntityEdgeItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PointToPointInformationFlowToEntityEdgeEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public PointToPointInformationFlowToEntityEdgeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new PointToPointInformationFlowToEntityEdgeItemSemanticEditPolicy());
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
		return new PointToPointInformationFlowToEntityEdgeFigure();
	}

	/**
	 * @generated
	 */
	public PointToPointInformationFlowToEntityEdgeFigure getPrimaryShape() {
		return (PointToPointInformationFlowToEntityEdgeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class PointToPointInformationFlowToEntityEdgeFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public PointToPointInformationFlowToEntityEdgeFigure() {

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
