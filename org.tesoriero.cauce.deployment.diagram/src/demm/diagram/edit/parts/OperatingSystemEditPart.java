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

import demm.diagram.edit.policies.OperatingSystemItemSemanticEditPolicy;
import demm.diagram.part.DeploymentVisualIDRegistry;

/**
 * @generated
 */
public class OperatingSystemEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public OperatingSystemEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OperatingSystemItemSemanticEditPolicy());
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
		return primaryShape = new OperatingSystemFigure();
	}

	/**
	 * @generated
	 */
	public OperatingSystemFigure getPrimaryShape() {
		return (OperatingSystemFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OperatingSystemNameEditPart) {
			((OperatingSystemNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOperatingSystemNameFigure());
			return true;
		}
		if (childEditPart instanceof OperatingSystemVersionEditPart) {
			((OperatingSystemVersionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOperatingSystemVersionFigure());
			return true;
		}
		if (childEditPart instanceof OperatingSystemRevisionEditPart) {
			((OperatingSystemRevisionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOperatingSystemRevisionFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OperatingSystemNameEditPart) {
			return true;
		}
		if (childEditPart instanceof OperatingSystemVersionEditPart) {
			return true;
		}
		if (childEditPart instanceof OperatingSystemRevisionEditPart) {
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
				.getType(OperatingSystemNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class OperatingSystemFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureOperatingSystemNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOperatingSystemVersionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOperatingSystemRevisionFigure;

		/**
		 * @generated
		 */
		public OperatingSystemFigure() {

			BorderLayout layoutThis = new BorderLayout();
			layoutThis.setHorizontalSpacing(0);// TODO mapMode?
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

			RectangleFigure operatingSystemNameRectangleFigure0 = new RectangleFigure();

			operatingSystemNameRectangleFigure0
					.setForegroundColor(ColorConstants.black);
			operatingSystemNameRectangleFigure0.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(150), getMapMode().DPtoLP(50)));

			operatingSystemNameRectangleFigure0.setBorder(new MarginBorder(
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(2)));

			this.add(operatingSystemNameRectangleFigure0, BorderLayout.CENTER);

			GridLayout layoutOperatingSystemNameRectangleFigure0 = new GridLayout();
			layoutOperatingSystemNameRectangleFigure0.numColumns = 1;
			layoutOperatingSystemNameRectangleFigure0.makeColumnsEqualWidth = true;
			operatingSystemNameRectangleFigure0
					.setLayoutManager(layoutOperatingSystemNameRectangleFigure0);

			fFigureOperatingSystemNameFigure = new WrappingLabel();

			fFigureOperatingSystemNameFigure.setText("<...>");

			fFigureOperatingSystemNameFigure
					.setFont(FFIGUREOPERATINGSYSTEMNAMEFIGURE_FONT);

			GridData constraintFFigureOperatingSystemNameFigure = new GridData();
			constraintFFigureOperatingSystemNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureOperatingSystemNameFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureOperatingSystemNameFigure.horizontalIndent = 0;
			constraintFFigureOperatingSystemNameFigure.horizontalSpan = 1;
			constraintFFigureOperatingSystemNameFigure.verticalSpan = 1;
			constraintFFigureOperatingSystemNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureOperatingSystemNameFigure.grabExcessVerticalSpace = true;
			operatingSystemNameRectangleFigure0.add(
					fFigureOperatingSystemNameFigure,
					constraintFFigureOperatingSystemNameFigure);

			RectangleFigure versionAndRevisionRectangleFigure0 = new RectangleFigure();

			versionAndRevisionRectangleFigure0.setFill(false);
			versionAndRevisionRectangleFigure0.setOutline(false);

			this.add(versionAndRevisionRectangleFigure0, BorderLayout.RIGHT);

			GridLayout layoutVersionAndRevisionRectangleFigure0 = new GridLayout();
			layoutVersionAndRevisionRectangleFigure0.numColumns = 2;
			layoutVersionAndRevisionRectangleFigure0.makeColumnsEqualWidth = true;
			layoutVersionAndRevisionRectangleFigure0.marginWidth = 0;
			layoutVersionAndRevisionRectangleFigure0.marginHeight = 0;
			versionAndRevisionRectangleFigure0
					.setLayoutManager(layoutVersionAndRevisionRectangleFigure0);

			Ellipse operatingSystemVersionEllipseFigure1 = new Ellipse();

			operatingSystemVersionEllipseFigure1
					.setPreferredSize(new Dimension(getMapMode().DPtoLP(50),
							getMapMode().DPtoLP(50)));

			versionAndRevisionRectangleFigure0
					.add(operatingSystemVersionEllipseFigure1);

			GridLayout layoutOperatingSystemVersionEllipseFigure1 = new GridLayout();
			layoutOperatingSystemVersionEllipseFigure1.numColumns = 1;
			layoutOperatingSystemVersionEllipseFigure1.makeColumnsEqualWidth = true;
			operatingSystemVersionEllipseFigure1
					.setLayoutManager(layoutOperatingSystemVersionEllipseFigure1);

			fFigureOperatingSystemVersionFigure = new WrappingLabel();

			fFigureOperatingSystemVersionFigure.setText("<...>");

			GridData constraintFFigureOperatingSystemVersionFigure = new GridData();
			constraintFFigureOperatingSystemVersionFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureOperatingSystemVersionFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureOperatingSystemVersionFigure.horizontalIndent = 0;
			constraintFFigureOperatingSystemVersionFigure.horizontalSpan = 1;
			constraintFFigureOperatingSystemVersionFigure.verticalSpan = 1;
			constraintFFigureOperatingSystemVersionFigure.grabExcessHorizontalSpace = true;
			constraintFFigureOperatingSystemVersionFigure.grabExcessVerticalSpace = true;
			operatingSystemVersionEllipseFigure1.add(
					fFigureOperatingSystemVersionFigure,
					constraintFFigureOperatingSystemVersionFigure);

			Ellipse operatingSystemRevisionEllipseFigure1 = new Ellipse();

			operatingSystemRevisionEllipseFigure1
					.setPreferredSize(new Dimension(getMapMode().DPtoLP(50),
							getMapMode().DPtoLP(50)));

			versionAndRevisionRectangleFigure0
					.add(operatingSystemRevisionEllipseFigure1);

			GridLayout layoutOperatingSystemRevisionEllipseFigure1 = new GridLayout();
			layoutOperatingSystemRevisionEllipseFigure1.numColumns = 1;
			layoutOperatingSystemRevisionEllipseFigure1.makeColumnsEqualWidth = true;
			operatingSystemRevisionEllipseFigure1
					.setLayoutManager(layoutOperatingSystemRevisionEllipseFigure1);

			fFigureOperatingSystemRevisionFigure = new WrappingLabel();

			fFigureOperatingSystemRevisionFigure.setText("<...>");

			GridData constraintFFigureOperatingSystemRevisionFigure = new GridData();
			constraintFFigureOperatingSystemRevisionFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureOperatingSystemRevisionFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureOperatingSystemRevisionFigure.horizontalIndent = 0;
			constraintFFigureOperatingSystemRevisionFigure.horizontalSpan = 1;
			constraintFFigureOperatingSystemRevisionFigure.verticalSpan = 1;
			constraintFFigureOperatingSystemRevisionFigure.grabExcessHorizontalSpace = true;
			constraintFFigureOperatingSystemRevisionFigure.grabExcessVerticalSpace = true;
			operatingSystemRevisionEllipseFigure1.add(
					fFigureOperatingSystemRevisionFigure,
					constraintFFigureOperatingSystemRevisionFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOperatingSystemNameFigure() {
			return fFigureOperatingSystemNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOperatingSystemVersionFigure() {
			return fFigureOperatingSystemVersionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOperatingSystemRevisionFigure() {
			return fFigureOperatingSystemRevisionFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREOPERATINGSYSTEMNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
