package tamm.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import tamm.diagram.edit.policies.FinalConditionItemSemanticEditPolicy;
import tamm.diagram.edit.policies.TaskTextSelectionEditPolicy;
import tamm.diagram.part.TaskVisualIDRegistry;
import tamm.diagram.providers.TaskElementTypes;

/**
 * @generated
 */

public class FinalConditionEditPart extends ShapeNodeEditPart {

	// Richard XCX

	private int var2;

	private int var;

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
	public FinalConditionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new FinalConditionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new TaskTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new FinalConditionFigure();
	}

	/**
	 * @generated
	 */
	public FinalConditionFigure getPrimaryShape() {
		return (FinalConditionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FinalConditionSocialExpressionEditPart) {
			((FinalConditionSocialExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFinalSocialExpressionAreaFigure());
			return true;
		}
		if (childEditPart instanceof FinalConditionTaskExpressionEditPart) {
			((FinalConditionTaskExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFinalTaskExpressionAreaFigure());
			return true;
		}
		if (childEditPart instanceof FinalConditionSpaceExpressionEditPart) {
			((FinalConditionSpaceExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFinalSpaceExpressionAreaFigure());
			return true;
		}
		if (childEditPart instanceof FinalConditionLogicExpressionEditPart) {
			((FinalConditionLogicExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFinalLogicExpressionAreaFigure());
			return true;
		}
		if (childEditPart instanceof FinalConditionDataExpressionEditPart) {
			((FinalConditionDataExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFinalDataExpressionAreaFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FinalConditionSocialExpressionEditPart) {
			return true;
		}
		if (childEditPart instanceof FinalConditionTaskExpressionEditPart) {
			return true;
		}
		if (childEditPart instanceof FinalConditionSpaceExpressionEditPart) {
			return true;
		}
		if (childEditPart instanceof FinalConditionLogicExpressionEditPart) {
			return true;
		}
		if (childEditPart instanceof FinalConditionDataExpressionEditPart) {
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
		return getChildBySemanticHint(TaskVisualIDRegistry
				.getType(FinalConditionSocialExpressionEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TaskElementTypes.JoinTaskToOutputCondition_4003);
		types.add(TaskElementTypes.SplitTaskToOutputCondition_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == TaskElementTypes.JoinTaskToOutputCondition_4003) {
			types.add(TaskElementTypes.AndJoin_2006);
			types.add(TaskElementTypes.OrJoin_2010);
		} else if (relationshipType == TaskElementTypes.SplitTaskToOutputCondition_4004) {
			types.add(TaskElementTypes.AndSplit_2001);
			types.add(TaskElementTypes.OrSplit_2009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class FinalConditionFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFinalSocialExpressionAreaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFinalTaskExpressionAreaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFinalSpaceExpressionAreaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFinalLogicExpressionAreaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFinalDataExpressionAreaFigure;

		/**
		 * @generated
		 */
		public FinalConditionFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(2);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineStyle(Graphics.LINE_DOT);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			Ellipse conditionEllipseFigure0 = new Ellipse();

			conditionEllipseFigure0.setForegroundColor(ColorConstants.black);
			conditionEllipseFigure0.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(40), getMapMode().DPtoLP(40)));
			conditionEllipseFigure0.setMinimumSize(new Dimension(getMapMode()
					.DPtoLP(40), getMapMode().DPtoLP(40)));

			this.add(conditionEllipseFigure0);

			GridLayout layoutConditionEllipseFigure0 = new GridLayout();
			layoutConditionEllipseFigure0.numColumns = 1;
			layoutConditionEllipseFigure0.makeColumnsEqualWidth = false;
			conditionEllipseFigure0
					.setLayoutManager(layoutConditionEllipseFigure0);

			WrappingLabel conditionLabel1 = new WrappingLabel();

			conditionLabel1.setText("F");

			conditionLabel1.setFont(CONDITIONLABEL1_FONT);

			GridData constraintConditionLabel1 = new GridData();
			constraintConditionLabel1.verticalAlignment = GridData.CENTER;
			constraintConditionLabel1.horizontalAlignment = GridData.CENTER;
			constraintConditionLabel1.horizontalIndent = 0;
			constraintConditionLabel1.horizontalSpan = 1;
			constraintConditionLabel1.verticalSpan = 1;
			constraintConditionLabel1.grabExcessHorizontalSpace = true;
			constraintConditionLabel1.grabExcessVerticalSpace = true;
			conditionEllipseFigure0.add(conditionLabel1,
					constraintConditionLabel1);

			RectangleFigure finalExpressionRectangleFigure0 = new RectangleFigure();

			finalExpressionRectangleFigure0.setFill(false);
			finalExpressionRectangleFigure0.setOutline(false);
			finalExpressionRectangleFigure0
					.setForegroundColor(ColorConstants.lightGray);

			this.add(finalExpressionRectangleFigure0);

			ToolbarLayout layoutFinalExpressionRectangleFigure0 = new ToolbarLayout();
			layoutFinalExpressionRectangleFigure0.setStretchMinorAxis(false);
			layoutFinalExpressionRectangleFigure0
					.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutFinalExpressionRectangleFigure0.setSpacing(5);
			layoutFinalExpressionRectangleFigure0.setVertical(true);

			finalExpressionRectangleFigure0
					.setLayoutManager(layoutFinalExpressionRectangleFigure0);

			fFigureFinalSocialExpressionAreaFigure = new WrappingLabel();

			fFigureFinalSocialExpressionAreaFigure.setTextWrap(true);

			finalExpressionRectangleFigure0
					.add(fFigureFinalSocialExpressionAreaFigure);

			fFigureFinalTaskExpressionAreaFigure = new WrappingLabel();

			fFigureFinalTaskExpressionAreaFigure.setTextWrap(true);

			finalExpressionRectangleFigure0
					.add(fFigureFinalTaskExpressionAreaFigure);

			fFigureFinalSpaceExpressionAreaFigure = new WrappingLabel();

			fFigureFinalSpaceExpressionAreaFigure.setTextWrap(true);

			finalExpressionRectangleFigure0
					.add(fFigureFinalSpaceExpressionAreaFigure);

			fFigureFinalLogicExpressionAreaFigure = new WrappingLabel();

			fFigureFinalLogicExpressionAreaFigure.setTextWrap(true);

			finalExpressionRectangleFigure0
					.add(fFigureFinalLogicExpressionAreaFigure);

			fFigureFinalDataExpressionAreaFigure = new WrappingLabel();

			fFigureFinalDataExpressionAreaFigure.setTextWrap(true);

			finalExpressionRectangleFigure0
					.add(fFigureFinalDataExpressionAreaFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFinalSocialExpressionAreaFigure() {
			return fFigureFinalSocialExpressionAreaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFinalTaskExpressionAreaFigure() {
			return fFigureFinalTaskExpressionAreaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFinalSpaceExpressionAreaFigure() {
			return fFigureFinalSpaceExpressionAreaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFinalLogicExpressionAreaFigure() {
			return fFigureFinalLogicExpressionAreaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFinalDataExpressionAreaFigure() {
			return fFigureFinalDataExpressionAreaFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font CONDITIONLABEL1_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(),
			12, SWT.BOLD);

}
