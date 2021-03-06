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

import demm.diagram.edit.policies.ProtocolItemSemanticEditPolicy;
import demm.diagram.part.DeploymentVisualIDRegistry;

/**
 * @generated
 */
public class ProtocolEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

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
	public ProtocolEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ProtocolItemSemanticEditPolicy());
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
		return primaryShape = new ProtocolFigure();
	}

	/**
	 * @generated
	 */
	public ProtocolFigure getPrimaryShape() {
		return (ProtocolFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProtocolNameEditPart) {
			((ProtocolNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureProtocolNameFigure());
			return true;
		}
		if (childEditPart instanceof ProtocolVersionEditPart) {
			((ProtocolVersionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureProtocolVersionFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProtocolNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ProtocolVersionEditPart) {
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
				.getType(ProtocolNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ProtocolFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProtocolNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProtocolVersionFigure;

		/**
		 * @generated
		 */
		public ProtocolFigure() {

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

			RectangleFigure protocolNameRectangleFigure0 = new RectangleFigure();

			protocolNameRectangleFigure0
					.setForegroundColor(ColorConstants.black);
			protocolNameRectangleFigure0.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(100), getMapMode().DPtoLP(50)));

			protocolNameRectangleFigure0.setBorder(new MarginBorder(
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(2)));

			this.add(protocolNameRectangleFigure0, BorderLayout.CENTER);

			GridLayout layoutProtocolNameRectangleFigure0 = new GridLayout();
			layoutProtocolNameRectangleFigure0.numColumns = 1;
			layoutProtocolNameRectangleFigure0.makeColumnsEqualWidth = true;
			protocolNameRectangleFigure0
					.setLayoutManager(layoutProtocolNameRectangleFigure0);

			fFigureProtocolNameFigure = new WrappingLabel();

			fFigureProtocolNameFigure.setText("<...>");

			fFigureProtocolNameFigure.setFont(FFIGUREPROTOCOLNAMEFIGURE_FONT);

			GridData constraintFFigureProtocolNameFigure = new GridData();
			constraintFFigureProtocolNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureProtocolNameFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureProtocolNameFigure.horizontalIndent = 0;
			constraintFFigureProtocolNameFigure.horizontalSpan = 1;
			constraintFFigureProtocolNameFigure.verticalSpan = 1;
			constraintFFigureProtocolNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureProtocolNameFigure.grabExcessVerticalSpace = true;
			protocolNameRectangleFigure0.add(fFigureProtocolNameFigure,
					constraintFFigureProtocolNameFigure);

			Ellipse protocolVersionEllipseFigure0 = new Ellipse();

			protocolVersionEllipseFigure0.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(50), getMapMode().DPtoLP(50)));

			this.add(protocolVersionEllipseFigure0, BorderLayout.RIGHT);

			GridLayout layoutProtocolVersionEllipseFigure0 = new GridLayout();
			layoutProtocolVersionEllipseFigure0.numColumns = 1;
			layoutProtocolVersionEllipseFigure0.makeColumnsEqualWidth = true;
			protocolVersionEllipseFigure0
					.setLayoutManager(layoutProtocolVersionEllipseFigure0);

			fFigureProtocolVersionFigure = new WrappingLabel();

			fFigureProtocolVersionFigure.setText("<...>");

			GridData constraintFFigureProtocolVersionFigure = new GridData();
			constraintFFigureProtocolVersionFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureProtocolVersionFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureProtocolVersionFigure.horizontalIndent = 0;
			constraintFFigureProtocolVersionFigure.horizontalSpan = 1;
			constraintFFigureProtocolVersionFigure.verticalSpan = 1;
			constraintFFigureProtocolVersionFigure.grabExcessHorizontalSpace = true;
			constraintFFigureProtocolVersionFigure.grabExcessVerticalSpace = true;
			protocolVersionEllipseFigure0.add(fFigureProtocolVersionFigure,
					constraintFFigureProtocolVersionFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProtocolNameFigure() {
			return fFigureProtocolNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProtocolVersionFigure() {
			return fFigureProtocolVersionFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREPROTOCOLNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
