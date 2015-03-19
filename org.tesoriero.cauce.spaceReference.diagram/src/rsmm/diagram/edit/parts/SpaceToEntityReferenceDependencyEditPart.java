package rsmm.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import rsmm.diagram.edit.policies.SpaceToEntityReferenceDependencyItemSemanticEditPolicy;

/**
 * @generated
 */
public class SpaceToEntityReferenceDependencyEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public SpaceToEntityReferenceDependencyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SpaceToEntityReferenceDependencyItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SpaceToEntityReferenceDependencyCardinalityEditPart) {
			((SpaceToEntityReferenceDependencyCardinalityEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEntityToSpaceReferenceDependencyCardinalityFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SpaceToEntityReferenceDependencyCardinalityEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
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
		return new SpaceToEntityReferenceDependencyFigure();
	}

	/**
	 * @generated
	 */
	public SpaceToEntityReferenceDependencyFigure getPrimaryShape() {
		return (SpaceToEntityReferenceDependencyFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class SpaceToEntityReferenceDependencyFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEntityToSpaceReferenceDependencyCardinalityFigure;

		/**
		 * @generated
		 */
		public SpaceToEntityReferenceDependencyFigure() {

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureEntityToSpaceReferenceDependencyCardinalityFigure = new WrappingLabel();

			fFigureEntityToSpaceReferenceDependencyCardinalityFigure
					.setText("<...>");

			this.add(fFigureEntityToSpaceReferenceDependencyCardinalityFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			df.setBackgroundColor(DF_BACK);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEntityToSpaceReferenceDependencyCardinalityFigure() {
			return fFigureEntityToSpaceReferenceDependencyCardinalityFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color DF_BACK = new Color(null, 0, 0, 0);

}
