package demm.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import demm.diagram.edit.policies.MediumItemSemanticEditPolicy;
import demm.diagram.part.DeploymentVisualIDRegistry;

/**
 * @generated
 */
public class MediumEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public MediumEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MediumItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new MediumFigure();
	}

	/**
	 * @generated
	 */
	public MediumFigure getPrimaryShape() {
		return (MediumFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MediumVersionEditPart) {
			((MediumVersionEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureMediumVersionFigure());
			return true;
		}
		if (childEditPart instanceof MediumTypeEditPart) {
			((MediumTypeEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureMediumTypeFigure());
			return true;
		}
		if (childEditPart instanceof MediumTechnologyEditPart) {
			((MediumTechnologyEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediumTechnologyFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MediumVersionEditPart) {
			return true;
		}
		if (childEditPart instanceof MediumTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof MediumTechnologyEditPart) {
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
		super.addChildVisual(childEditPart, -1);
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
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(DeploymentVisualIDRegistry
				.getType(MediumVersionEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class MediumFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediumTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediumTechnologyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediumVersionFigure;

		/**
		 * @generated
		 */
		public MediumFigure() {

			BorderLayout layoutThis = new BorderLayout();
			layoutThis.setHorizontalSpacing(2);// TODO mapMode?
			layoutThis.setVerticalSpacing(2);
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure mediumTypeRectangleFigure0 = new RectangleFigure();

			mediumTypeRectangleFigure0.setForegroundColor(ColorConstants.black);
			mediumTypeRectangleFigure0.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(200), getMapMode().DPtoLP(50)));

			mediumTypeRectangleFigure0.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(2), getMapMode().DPtoLP(2), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(2)));

			this.add(mediumTypeRectangleFigure0, BorderLayout.CENTER);

			GridLayout layoutMediumTypeRectangleFigure0 = new GridLayout();
			layoutMediumTypeRectangleFigure0.numColumns = 1;
			layoutMediumTypeRectangleFigure0.makeColumnsEqualWidth = true;
			mediumTypeRectangleFigure0
					.setLayoutManager(layoutMediumTypeRectangleFigure0);

			fFigureMediumTypeFigure = new WrappingLabel();

			fFigureMediumTypeFigure.setText("<...>");

			fFigureMediumTypeFigure.setFont(FFIGUREMEDIUMTYPEFIGURE_FONT);

			GridData constraintFFigureMediumTypeFigure = new GridData();
			constraintFFigureMediumTypeFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureMediumTypeFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureMediumTypeFigure.horizontalIndent = 0;
			constraintFFigureMediumTypeFigure.horizontalSpan = 1;
			constraintFFigureMediumTypeFigure.verticalSpan = 1;
			constraintFFigureMediumTypeFigure.grabExcessHorizontalSpace = true;
			constraintFFigureMediumTypeFigure.grabExcessVerticalSpace = false;
			mediumTypeRectangleFigure0.add(fFigureMediumTypeFigure,
					constraintFFigureMediumTypeFigure);

			fFigureMediumTechnologyFigure = new WrappingLabel();

			fFigureMediumTechnologyFigure.setText("<...>");

			GridData constraintFFigureMediumTechnologyFigure = new GridData();
			constraintFFigureMediumTechnologyFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureMediumTechnologyFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureMediumTechnologyFigure.horizontalIndent = 0;
			constraintFFigureMediumTechnologyFigure.horizontalSpan = 1;
			constraintFFigureMediumTechnologyFigure.verticalSpan = 1;
			constraintFFigureMediumTechnologyFigure.grabExcessHorizontalSpace = true;
			constraintFFigureMediumTechnologyFigure.grabExcessVerticalSpace = false;
			mediumTypeRectangleFigure0.add(fFigureMediumTechnologyFigure,
					constraintFFigureMediumTechnologyFigure);

			Ellipse mediumVersionEllipseFigure0 = new Ellipse();

			mediumVersionEllipseFigure0.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(50), getMapMode().DPtoLP(50)));

			this.add(mediumVersionEllipseFigure0, BorderLayout.RIGHT);

			GridLayout layoutMediumVersionEllipseFigure0 = new GridLayout();
			layoutMediumVersionEllipseFigure0.numColumns = 1;
			layoutMediumVersionEllipseFigure0.makeColumnsEqualWidth = true;
			mediumVersionEllipseFigure0
					.setLayoutManager(layoutMediumVersionEllipseFigure0);

			fFigureMediumVersionFigure = new WrappingLabel();

			fFigureMediumVersionFigure.setText("<...>");

			GridData constraintFFigureMediumVersionFigure = new GridData();
			constraintFFigureMediumVersionFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureMediumVersionFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureMediumVersionFigure.horizontalIndent = 0;
			constraintFFigureMediumVersionFigure.horizontalSpan = 1;
			constraintFFigureMediumVersionFigure.verticalSpan = 1;
			constraintFFigureMediumVersionFigure.grabExcessHorizontalSpace = true;
			constraintFFigureMediumVersionFigure.grabExcessVerticalSpace = true;
			mediumVersionEllipseFigure0.add(fFigureMediumVersionFigure,
					constraintFFigureMediumVersionFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediumTypeFigure() {
			return fFigureMediumTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediumTechnologyFigure() {
			return fFigureMediumTechnologyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediumVersionFigure() {
			return fFigureMediumVersionFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREMEDIUMTYPEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
