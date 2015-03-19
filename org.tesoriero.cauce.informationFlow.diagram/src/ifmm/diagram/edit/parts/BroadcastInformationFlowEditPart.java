package ifmm.diagram.edit.parts;

import ifmm.diagram.edit.policies.BroadcastInformationFlowItemSemanticEditPolicy;
import ifmm.diagram.edit.policies.InformationFlowTextSelectionEditPolicy;
import ifmm.diagram.part.InformationFlowVisualIDRegistry;
import ifmm.diagram.providers.InformationFlowElementTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class BroadcastInformationFlowEditPart extends ShapeNodeEditPart {

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
	public BroadcastInformationFlowEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						InformationFlowVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BroadcastInformationFlowItemSemanticEditPolicy());
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
						return new InformationFlowTextSelectionEditPolicy();
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
		return primaryShape = new BroadcastInformationFlowFigure();
	}

	/**
	 * @generated
	 */
	public BroadcastInformationFlowFigure getPrimaryShape() {
		return (BroadcastInformationFlowFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof BroadcastInformationFlowNameEditPart) {
			((BroadcastInformationFlowNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureBroadcastInformationFlowNameFigure());
			return true;
		}
		if (childEditPart instanceof BroadcastInformationFlowIdEditPart) {
			((BroadcastInformationFlowIdEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureBroadcastInformationFlowIdFigure());
			return true;
		}
		if (childEditPart instanceof BroadcastInformationFlowBOutputDataEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureBroadcastInformationFlowOutputDataContainerRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((BroadcastInformationFlowBOutputDataEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof BroadcastInformationFlowNameEditPart) {
			return true;
		}
		if (childEditPart instanceof BroadcastInformationFlowIdEditPart) {
			return true;
		}
		if (childEditPart instanceof BroadcastInformationFlowBOutputDataEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureBroadcastInformationFlowOutputDataContainerRectangleFigure();
			pane.remove(((BroadcastInformationFlowBOutputDataEditPart) childEditPart)
					.getFigure());
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
		if (editPart instanceof BroadcastInformationFlowBOutputDataEditPart) {
			return getPrimaryShape()
					.getFigureBroadcastInformationFlowOutputDataContainerRectangleFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 50);
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
		return getChildBySemanticHint(InformationFlowVisualIDRegistry
				.getType(BroadcastInformationFlowNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ContextAwareEntityEditPart) {
			types.add(InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001) {
			types.add(InformationFlowElementTypes.ContextAwareEntity_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002) {
			types.add(InformationFlowElementTypes.ContextAwareEntity_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == InformationFlowElementTypes.OutputData_3001) {
				return getChildBySemanticHint(InformationFlowVisualIDRegistry
						.getType(BroadcastInformationFlowBOutputDataEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class BroadcastInformationFlowFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureBroadcastInformationFlowIdFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBroadcastInformationFlowNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureBroadcastInformationFlowOutputDataContainerRectangleFigure;

		/**
		 * @generated
		 */
		public BroadcastInformationFlowFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineStyle(Graphics.LINE_DASH);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure broadcastInformationFlowTitleFigure0 = new RectangleFigure();

			broadcastInformationFlowTitleFigure0.setOutlineXOR(true);
			broadcastInformationFlowTitleFigure0
					.setLineStyle(Graphics.LINE_DASH);

			this.add(broadcastInformationFlowTitleFigure0);

			ToolbarLayout layoutBroadcastInformationFlowTitleFigure0 = new ToolbarLayout();
			layoutBroadcastInformationFlowTitleFigure0
					.setStretchMinorAxis(true);
			layoutBroadcastInformationFlowTitleFigure0
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutBroadcastInformationFlowTitleFigure0.setSpacing(5);
			layoutBroadcastInformationFlowTitleFigure0.setVertical(false);

			broadcastInformationFlowTitleFigure0
					.setLayoutManager(layoutBroadcastInformationFlowTitleFigure0);

			fFigureBroadcastInformationFlowIdFigure = new WrappingLabel();

			fFigureBroadcastInformationFlowIdFigure.setText("");
			fFigureBroadcastInformationFlowIdFigure.setBorder(new MarginBorder(
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(0)));

			broadcastInformationFlowTitleFigure0
					.add(fFigureBroadcastInformationFlowIdFigure);

			fFigureBroadcastInformationFlowNameFigure = new WrappingLabel();

			fFigureBroadcastInformationFlowNameFigure.setText("<...>");
			fFigureBroadcastInformationFlowNameFigure
					.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
							getMapMode().DPtoLP(0), getMapMode().DPtoLP(5),
							getMapMode().DPtoLP(0)));

			broadcastInformationFlowTitleFigure0
					.add(fFigureBroadcastInformationFlowNameFigure);

			fFigureBroadcastInformationFlowOutputDataContainerRectangleFigure = new RectangleFigure();

			fFigureBroadcastInformationFlowOutputDataContainerRectangleFigure
					.setFill(false);
			fFigureBroadcastInformationFlowOutputDataContainerRectangleFigure
					.setOutline(false);
			fFigureBroadcastInformationFlowOutputDataContainerRectangleFigure
					.setLineStyle(Graphics.LINE_DASH);

			this.add(fFigureBroadcastInformationFlowOutputDataContainerRectangleFigure);
			fFigureBroadcastInformationFlowOutputDataContainerRectangleFigure
					.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBroadcastInformationFlowIdFigure() {
			return fFigureBroadcastInformationFlowIdFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBroadcastInformationFlowNameFigure() {
			return fFigureBroadcastInformationFlowNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureBroadcastInformationFlowOutputDataContainerRectangleFigure() {
			return fFigureBroadcastInformationFlowOutputDataContainerRectangleFigure;
		}

	}

}
