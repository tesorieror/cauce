package ifmm.diagram.edit.parts;

import ifmm.diagram.edit.policies.InformationFlowTextSelectionEditPolicy;
import ifmm.diagram.edit.policies.PointToPointInformationFlowItemSemanticEditPolicy;
import ifmm.diagram.part.InformationFlowVisualIDRegistry;
import ifmm.diagram.providers.InformationFlowElementTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
public class PointToPointInformationFlowEditPart extends ShapeNodeEditPart {

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
	public PointToPointInformationFlowEditPart(View view) {
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
				new PointToPointInformationFlowItemSemanticEditPolicy());
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
		return primaryShape = new PointToPointInformationFlowFigure();
	}

	/**
	 * @generated
	 */
	public PointToPointInformationFlowFigure getPrimaryShape() {
		return (PointToPointInformationFlowFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PointToPointInformationFlowNameEditPart) {
			((PointToPointInformationFlowNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePointToPointInformationFlowNameFigure());
			return true;
		}
		if (childEditPart instanceof PointToPointInformationFlowIdEditPart) {
			((PointToPointInformationFlowIdEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePointToPointInformationFlowIdFigure());
			return true;
		}
		if (childEditPart instanceof PointToPointInformationFlowP2POutputDataEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePointToPointInformationFlowOutputDataContainerRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PointToPointInformationFlowP2POutputDataEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof PointToPointInformationFlowP2PInputDataEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePointToPointInformationFlowInputDataContainerRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PointToPointInformationFlowP2PInputDataEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PointToPointInformationFlowNameEditPart) {
			return true;
		}
		if (childEditPart instanceof PointToPointInformationFlowIdEditPart) {
			return true;
		}
		if (childEditPart instanceof PointToPointInformationFlowP2POutputDataEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePointToPointInformationFlowOutputDataContainerRectangleFigure();
			pane.remove(((PointToPointInformationFlowP2POutputDataEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof PointToPointInformationFlowP2PInputDataEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePointToPointInformationFlowInputDataContainerRectangleFigure();
			pane.remove(((PointToPointInformationFlowP2PInputDataEditPart) childEditPart)
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
		if (editPart instanceof PointToPointInformationFlowP2POutputDataEditPart) {
			return getPrimaryShape()
					.getFigurePointToPointInformationFlowOutputDataContainerRectangleFigure();
		}
		if (editPart instanceof PointToPointInformationFlowP2PInputDataEditPart) {
			return getPrimaryShape()
					.getFigurePointToPointInformationFlowInputDataContainerRectangleFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 30);
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
				.getType(PointToPointInformationFlowNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ContextAwareEntityEditPart) {
			types.add(InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004) {
			types.add(InformationFlowElementTypes.ContextAwareEntity_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003) {
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
			if (type == InformationFlowElementTypes.OutputData_3002) {
				return getChildBySemanticHint(InformationFlowVisualIDRegistry
						.getType(PointToPointInformationFlowP2POutputDataEditPart.VISUAL_ID));
			}
			if (type == InformationFlowElementTypes.InputData_3003) {
				return getChildBySemanticHint(InformationFlowVisualIDRegistry
						.getType(PointToPointInformationFlowP2PInputDataEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class PointToPointInformationFlowFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fFigurePointToPointInformationFlowInputDataContainerRectangleFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigurePointToPointInformationFlowOutputDataContainerRectangleFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePointToPointInformationFlowNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePointToPointInformationFlowIdFigure;

		/**
		 * @generated
		 */
		public PointToPointInformationFlowFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure pointToPointInformationFlowTitleFigure0 = new RectangleFigure();

			pointToPointInformationFlowTitleFigure0.setOutlineXOR(true);

			this.add(pointToPointInformationFlowTitleFigure0);

			ToolbarLayout layoutPointToPointInformationFlowTitleFigure0 = new ToolbarLayout();
			layoutPointToPointInformationFlowTitleFigure0
					.setStretchMinorAxis(true);
			layoutPointToPointInformationFlowTitleFigure0
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutPointToPointInformationFlowTitleFigure0.setSpacing(5);
			layoutPointToPointInformationFlowTitleFigure0.setVertical(false);

			pointToPointInformationFlowTitleFigure0
					.setLayoutManager(layoutPointToPointInformationFlowTitleFigure0);

			fFigurePointToPointInformationFlowIdFigure = new WrappingLabel();

			fFigurePointToPointInformationFlowIdFigure.setText("");
			fFigurePointToPointInformationFlowIdFigure
					.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
							getMapMode().DPtoLP(0), getMapMode().DPtoLP(5),
							getMapMode().DPtoLP(5)));

			pointToPointInformationFlowTitleFigure0
					.add(fFigurePointToPointInformationFlowIdFigure);

			fFigurePointToPointInformationFlowNameFigure = new WrappingLabel();

			fFigurePointToPointInformationFlowNameFigure.setText("<...>");
			fFigurePointToPointInformationFlowNameFigure
					.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
							getMapMode().DPtoLP(0), getMapMode().DPtoLP(5),
							getMapMode().DPtoLP(5)));

			pointToPointInformationFlowTitleFigure0
					.add(fFigurePointToPointInformationFlowNameFigure);

			fFigurePointToPointInformationFlowOutputDataContainerRectangleFigure = new RectangleFigure();

			fFigurePointToPointInformationFlowOutputDataContainerRectangleFigure
					.setFill(false);
			fFigurePointToPointInformationFlowOutputDataContainerRectangleFigure
					.setOutline(false);

			this.add(fFigurePointToPointInformationFlowOutputDataContainerRectangleFigure);
			fFigurePointToPointInformationFlowOutputDataContainerRectangleFigure
					.setLayoutManager(new StackLayout());

			fFigurePointToPointInformationFlowInputDataContainerRectangleFigure = new RectangleFigure();

			fFigurePointToPointInformationFlowInputDataContainerRectangleFigure
					.setFill(false);
			fFigurePointToPointInformationFlowInputDataContainerRectangleFigure
					.setOutline(false);

			this.add(fFigurePointToPointInformationFlowInputDataContainerRectangleFigure);
			fFigurePointToPointInformationFlowInputDataContainerRectangleFigure
					.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigurePointToPointInformationFlowInputDataContainerRectangleFigure() {
			return fFigurePointToPointInformationFlowInputDataContainerRectangleFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigurePointToPointInformationFlowOutputDataContainerRectangleFigure() {
			return fFigurePointToPointInformationFlowOutputDataContainerRectangleFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePointToPointInformationFlowNameFigure() {
			return fFigurePointToPointInformationFlowNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePointToPointInformationFlowIdFigure() {
			return fFigurePointToPointInformationFlowIdFigure;
		}

	}

}
