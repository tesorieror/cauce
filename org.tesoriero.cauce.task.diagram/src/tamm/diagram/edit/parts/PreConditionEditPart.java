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
import org.eclipse.swt.graphics.Color;

import tamm.diagram.edit.policies.PreConditionItemSemanticEditPolicy;
import tamm.diagram.edit.policies.TaskTextSelectionEditPolicy;
import tamm.diagram.part.TaskVisualIDRegistry;
import tamm.diagram.providers.TaskElementTypes;

/**
 * @generated
 */

public class PreConditionEditPart extends ShapeNodeEditPart {

	// Richard XCX

	private int var2;

	private int var;

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
	public PreConditionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PreConditionItemSemanticEditPolicy());
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
		return primaryShape = new PreConditionFigure();
	}

	/**
	 * @generated
	 */
	public PreConditionFigure getPrimaryShape() {
		return (PreConditionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PreConditionSocialExpressionEditPart) {
			((PreConditionSocialExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePreSocialExpressionAreaFigure());
			return true;
		}
		if (childEditPart instanceof PreConditionTaskExpressionEditPart) {
			((PreConditionTaskExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePreTaskExpressionAreaFigure());
			return true;
		}
		if (childEditPart instanceof PreConditionSpaceExpressionEditPart) {
			((PreConditionSpaceExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePreSpaceExpressionAreaFigure());
			return true;
		}
		if (childEditPart instanceof PreConditionLogicExpressionEditPart) {
			((PreConditionLogicExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePreLogicExpressionAreaFigure());
			return true;
		}
		if (childEditPart instanceof PreConditionDataExpressionEditPart) {
			((PreConditionDataExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePreDataExpressionAreaFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PreConditionSocialExpressionEditPart) {
			return true;
		}
		if (childEditPart instanceof PreConditionTaskExpressionEditPart) {
			return true;
		}
		if (childEditPart instanceof PreConditionSpaceExpressionEditPart) {
			return true;
		}
		if (childEditPart instanceof PreConditionLogicExpressionEditPart) {
			return true;
		}
		if (childEditPart instanceof PreConditionDataExpressionEditPart) {
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
				.getType(PreConditionSocialExpressionEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TaskElementTypes.PreConditionToSystemTask_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof SkipTaskEditPart) {
			types.add(TaskElementTypes.PreConditionToSystemTask_4005);
		}
		if (targetEditPart instanceof SimpleTaskEditPart) {
			types.add(TaskElementTypes.PreConditionToSystemTask_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == TaskElementTypes.PreConditionToSystemTask_4005) {
			types.add(TaskElementTypes.SkipTask_2004);
			types.add(TaskElementTypes.SimpleTask_2008);
		}
		return types;
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
	public class PreConditionFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreSocialExpressionAreaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreTaskExpressionAreaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreSpaceExpressionAreaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreLogicExpressionAreaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreDataExpressionAreaFigure;

		/**
		 * @generated
		 */
		public PreConditionFigure() {

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

			conditionLabel1.setText("Pre");

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

			RectangleFigure preExpressionRectangleFigure0 = new RectangleFigure();

			preExpressionRectangleFigure0.setFill(false);
			preExpressionRectangleFigure0.setOutline(false);
			preExpressionRectangleFigure0
					.setForegroundColor(ColorConstants.lightGray);

			this.add(preExpressionRectangleFigure0);

			ToolbarLayout layoutPreExpressionRectangleFigure0 = new ToolbarLayout();
			layoutPreExpressionRectangleFigure0.setStretchMinorAxis(false);
			layoutPreExpressionRectangleFigure0
					.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutPreExpressionRectangleFigure0.setSpacing(5);
			layoutPreExpressionRectangleFigure0.setVertical(true);

			preExpressionRectangleFigure0
					.setLayoutManager(layoutPreExpressionRectangleFigure0);

			fFigurePreSocialExpressionAreaFigure = new WrappingLabel();

			fFigurePreSocialExpressionAreaFigure.setTextWrap(true);

			preExpressionRectangleFigure0
					.add(fFigurePreSocialExpressionAreaFigure);

			fFigurePreTaskExpressionAreaFigure = new WrappingLabel();

			fFigurePreTaskExpressionAreaFigure.setTextWrap(true);

			preExpressionRectangleFigure0
					.add(fFigurePreTaskExpressionAreaFigure);

			fFigurePreSpaceExpressionAreaFigure = new WrappingLabel();

			fFigurePreSpaceExpressionAreaFigure.setTextWrap(true);

			preExpressionRectangleFigure0
					.add(fFigurePreSpaceExpressionAreaFigure);

			fFigurePreLogicExpressionAreaFigure = new WrappingLabel();

			fFigurePreLogicExpressionAreaFigure.setTextWrap(true);

			preExpressionRectangleFigure0
					.add(fFigurePreLogicExpressionAreaFigure);

			fFigurePreDataExpressionAreaFigure = new WrappingLabel();

			fFigurePreDataExpressionAreaFigure.setTextWrap(true);

			preExpressionRectangleFigure0
					.add(fFigurePreDataExpressionAreaFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreSocialExpressionAreaFigure() {
			return fFigurePreSocialExpressionAreaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreTaskExpressionAreaFigure() {
			return fFigurePreTaskExpressionAreaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreSpaceExpressionAreaFigure() {
			return fFigurePreSpaceExpressionAreaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreLogicExpressionAreaFigure() {
			return fFigurePreLogicExpressionAreaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreDataExpressionAreaFigure() {
			return fFigurePreDataExpressionAreaFigure;
		}

	}

}
