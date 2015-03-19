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

import demm.diagram.edit.policies.ProgrammingLanguageItemSemanticEditPolicy;
import demm.diagram.part.DeploymentVisualIDRegistry;

/**
 * @generated
 */
public class ProgrammingLanguageEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public ProgrammingLanguageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ProgrammingLanguageItemSemanticEditPolicy());
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
		return primaryShape = new ProgrammingLanguageFigure();
	}

	/**
	 * @generated
	 */
	public ProgrammingLanguageFigure getPrimaryShape() {
		return (ProgrammingLanguageFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProgrammingLanguageNameEditPart) {
			((ProgrammingLanguageNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureProgrammingLanguageNameFigure());
			return true;
		}
		if (childEditPart instanceof ProgrammingLanguageProfileEditPart) {
			((ProgrammingLanguageProfileEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureProgrammingLanguageProfileFigure());
			return true;
		}
		if (childEditPart instanceof ProgrammingLanguageVersionEditPart) {
			((ProgrammingLanguageVersionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureProgrammingLanguageVersionFigure());
			return true;
		}
		if (childEditPart instanceof ProgrammingLanguageRevisionEditPart) {
			((ProgrammingLanguageRevisionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureProgrammingLanguageRevisionFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProgrammingLanguageNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ProgrammingLanguageProfileEditPart) {
			return true;
		}
		if (childEditPart instanceof ProgrammingLanguageVersionEditPart) {
			return true;
		}
		if (childEditPart instanceof ProgrammingLanguageRevisionEditPart) {
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
				.getType(ProgrammingLanguageNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ProgrammingLanguageFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProgrammingLanguageNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProgrammingLanguageVersionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProgrammingLanguageProfileFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProgrammingLanguageRevisionFigure;

		/**
		 * @generated
		 */
		public ProgrammingLanguageFigure() {

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

			RectangleFigure programmingLanguageNameAndProfileRectangleFigure0 = new RectangleFigure();

			programmingLanguageNameAndProfileRectangleFigure0
					.setForegroundColor(ColorConstants.black);
			programmingLanguageNameAndProfileRectangleFigure0
					.setPreferredSize(new Dimension(getMapMode().DPtoLP(150),
							getMapMode().DPtoLP(50)));

			programmingLanguageNameAndProfileRectangleFigure0
					.setBorder(new MarginBorder(getMapMode().DPtoLP(2),
							getMapMode().DPtoLP(2), getMapMode().DPtoLP(2),
							getMapMode().DPtoLP(2)));

			this.add(programmingLanguageNameAndProfileRectangleFigure0,
					BorderLayout.CENTER);

			GridLayout layoutProgrammingLanguageNameAndProfileRectangleFigure0 = new GridLayout();
			layoutProgrammingLanguageNameAndProfileRectangleFigure0.numColumns = 1;
			layoutProgrammingLanguageNameAndProfileRectangleFigure0.makeColumnsEqualWidth = true;
			programmingLanguageNameAndProfileRectangleFigure0
					.setLayoutManager(layoutProgrammingLanguageNameAndProfileRectangleFigure0);

			fFigureProgrammingLanguageNameFigure = new WrappingLabel();

			fFigureProgrammingLanguageNameFigure.setText("<...>");

			fFigureProgrammingLanguageNameFigure
					.setFont(FFIGUREPROGRAMMINGLANGUAGENAMEFIGURE_FONT);

			GridData constraintFFigureProgrammingLanguageNameFigure = new GridData();
			constraintFFigureProgrammingLanguageNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureProgrammingLanguageNameFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureProgrammingLanguageNameFigure.horizontalIndent = 0;
			constraintFFigureProgrammingLanguageNameFigure.horizontalSpan = 1;
			constraintFFigureProgrammingLanguageNameFigure.verticalSpan = 1;
			constraintFFigureProgrammingLanguageNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureProgrammingLanguageNameFigure.grabExcessVerticalSpace = false;
			programmingLanguageNameAndProfileRectangleFigure0.add(
					fFigureProgrammingLanguageNameFigure,
					constraintFFigureProgrammingLanguageNameFigure);

			fFigureProgrammingLanguageProfileFigure = new WrappingLabel();

			fFigureProgrammingLanguageProfileFigure.setText("<...>");

			GridData constraintFFigureProgrammingLanguageProfileFigure = new GridData();
			constraintFFigureProgrammingLanguageProfileFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureProgrammingLanguageProfileFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureProgrammingLanguageProfileFigure.horizontalIndent = 0;
			constraintFFigureProgrammingLanguageProfileFigure.horizontalSpan = 1;
			constraintFFigureProgrammingLanguageProfileFigure.verticalSpan = 1;
			constraintFFigureProgrammingLanguageProfileFigure.grabExcessHorizontalSpace = true;
			constraintFFigureProgrammingLanguageProfileFigure.grabExcessVerticalSpace = false;
			programmingLanguageNameAndProfileRectangleFigure0.add(
					fFigureProgrammingLanguageProfileFigure,
					constraintFFigureProgrammingLanguageProfileFigure);

			RectangleFigure programmingLanguageVersionAndRevisionRectangleFigure0 = new RectangleFigure();

			programmingLanguageVersionAndRevisionRectangleFigure0
					.setFill(false);
			programmingLanguageVersionAndRevisionRectangleFigure0
					.setOutline(false);

			this.add(programmingLanguageVersionAndRevisionRectangleFigure0,
					BorderLayout.RIGHT);

			GridLayout layoutProgrammingLanguageVersionAndRevisionRectangleFigure0 = new GridLayout();
			layoutProgrammingLanguageVersionAndRevisionRectangleFigure0.numColumns = 2;
			layoutProgrammingLanguageVersionAndRevisionRectangleFigure0.makeColumnsEqualWidth = true;
			layoutProgrammingLanguageVersionAndRevisionRectangleFigure0.marginWidth = 0;
			layoutProgrammingLanguageVersionAndRevisionRectangleFigure0.marginHeight = 0;
			programmingLanguageVersionAndRevisionRectangleFigure0
					.setLayoutManager(layoutProgrammingLanguageVersionAndRevisionRectangleFigure0);

			Ellipse programmingLanguageVersionEllipseFigure1 = new Ellipse();

			programmingLanguageVersionEllipseFigure1
					.setPreferredSize(new Dimension(getMapMode().DPtoLP(50),
							getMapMode().DPtoLP(50)));

			programmingLanguageVersionAndRevisionRectangleFigure0
					.add(programmingLanguageVersionEllipseFigure1);

			GridLayout layoutProgrammingLanguageVersionEllipseFigure1 = new GridLayout();
			layoutProgrammingLanguageVersionEllipseFigure1.numColumns = 1;
			layoutProgrammingLanguageVersionEllipseFigure1.makeColumnsEqualWidth = true;
			programmingLanguageVersionEllipseFigure1
					.setLayoutManager(layoutProgrammingLanguageVersionEllipseFigure1);

			fFigureProgrammingLanguageVersionFigure = new WrappingLabel();

			fFigureProgrammingLanguageVersionFigure.setText("<...>");

			GridData constraintFFigureProgrammingLanguageVersionFigure = new GridData();
			constraintFFigureProgrammingLanguageVersionFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureProgrammingLanguageVersionFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureProgrammingLanguageVersionFigure.horizontalIndent = 0;
			constraintFFigureProgrammingLanguageVersionFigure.horizontalSpan = 1;
			constraintFFigureProgrammingLanguageVersionFigure.verticalSpan = 1;
			constraintFFigureProgrammingLanguageVersionFigure.grabExcessHorizontalSpace = true;
			constraintFFigureProgrammingLanguageVersionFigure.grabExcessVerticalSpace = true;
			programmingLanguageVersionEllipseFigure1.add(
					fFigureProgrammingLanguageVersionFigure,
					constraintFFigureProgrammingLanguageVersionFigure);

			Ellipse programmingLanguageRevisionEllipseFigure1 = new Ellipse();

			programmingLanguageRevisionEllipseFigure1
					.setPreferredSize(new Dimension(getMapMode().DPtoLP(50),
							getMapMode().DPtoLP(50)));

			programmingLanguageVersionAndRevisionRectangleFigure0
					.add(programmingLanguageRevisionEllipseFigure1);

			GridLayout layoutProgrammingLanguageRevisionEllipseFigure1 = new GridLayout();
			layoutProgrammingLanguageRevisionEllipseFigure1.numColumns = 1;
			layoutProgrammingLanguageRevisionEllipseFigure1.makeColumnsEqualWidth = true;
			programmingLanguageRevisionEllipseFigure1
					.setLayoutManager(layoutProgrammingLanguageRevisionEllipseFigure1);

			fFigureProgrammingLanguageRevisionFigure = new WrappingLabel();

			fFigureProgrammingLanguageRevisionFigure.setText("<...>");

			GridData constraintFFigureProgrammingLanguageRevisionFigure = new GridData();
			constraintFFigureProgrammingLanguageRevisionFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureProgrammingLanguageRevisionFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureProgrammingLanguageRevisionFigure.horizontalIndent = 0;
			constraintFFigureProgrammingLanguageRevisionFigure.horizontalSpan = 1;
			constraintFFigureProgrammingLanguageRevisionFigure.verticalSpan = 1;
			constraintFFigureProgrammingLanguageRevisionFigure.grabExcessHorizontalSpace = true;
			constraintFFigureProgrammingLanguageRevisionFigure.grabExcessVerticalSpace = true;
			programmingLanguageRevisionEllipseFigure1.add(
					fFigureProgrammingLanguageRevisionFigure,
					constraintFFigureProgrammingLanguageRevisionFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProgrammingLanguageNameFigure() {
			return fFigureProgrammingLanguageNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProgrammingLanguageVersionFigure() {
			return fFigureProgrammingLanguageVersionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProgrammingLanguageProfileFigure() {
			return fFigureProgrammingLanguageProfileFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProgrammingLanguageRevisionFigure() {
			return fFigureProgrammingLanguageRevisionFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREPROGRAMMINGLANGUAGENAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
