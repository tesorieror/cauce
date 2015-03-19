package ecmm.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
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

import ecmm.diagram.edit.policies.ContextSituationItemSemanticEditPolicy;
import ecmm.diagram.part.EntityContextVisualIDRegistry;
import ecmm.diagram.providers.EntityContextElementTypes;

/**
 * @generated
 */
public class ContextSituationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3006;

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
	public ContextSituationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						EntityContextVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ContextSituationItemSemanticEditPolicy());
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
		return primaryShape = new SituationFigure();
	}

	/**
	 * @generated
	 */
	public SituationFigure getPrimaryShape() {
		return (SituationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContextSituationNameEditPart) {
			((ContextSituationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureContextSituationNameFigure());
			return true;
		}
		if (childEditPart instanceof ContextSituationIdEditPart) {
			((ContextSituationIdEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureContextSituationIdFigure());
			return true;
		}
		if (childEditPart instanceof ContextSituationConditionsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureSituationConditionsRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ContextSituationConditionsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ContextSituationSensingEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureSituationSensingRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ContextSituationSensingEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ContextSituationActionsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureSituationActionRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ContextSituationActionsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContextSituationNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ContextSituationIdEditPart) {
			return true;
		}
		if (childEditPart instanceof ContextSituationConditionsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureSituationConditionsRectangleFigure();
			pane.remove(((ContextSituationConditionsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ContextSituationSensingEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureSituationSensingRectangleFigure();
			pane.remove(((ContextSituationSensingEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ContextSituationActionsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureSituationActionRectangleFigure();
			pane.remove(((ContextSituationActionsEditPart) childEditPart)
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
		if (editPart instanceof ContextSituationConditionsEditPart) {
			return getPrimaryShape()
					.getFigureSituationConditionsRectangleFigure();
		}
		if (editPart instanceof ContextSituationSensingEditPart) {
			return getPrimaryShape().getFigureSituationSensingRectangleFigure();
		}
		if (editPart instanceof ContextSituationActionsEditPart) {
			return getPrimaryShape().getFigureSituationActionRectangleFigure();
		}
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
		return getChildBySemanticHint(EntityContextVisualIDRegistry
				.getType(ContextSituationNameEditPart.VISUAL_ID));
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
			if (type == EntityContextElementTypes.MemoryContextCondition_3007) {
				return getChildBySemanticHint(EntityContextVisualIDRegistry
						.getType(ContextSituationConditionsEditPart.VISUAL_ID));
			}
			if (type == EntityContextElementTypes.SensingContextCondition_3008) {
				return getChildBySemanticHint(EntityContextVisualIDRegistry
						.getType(ContextSituationSensingEditPart.VISUAL_ID));
			}
			if (type == EntityContextElementTypes.ContextAction_3009) {
				return getChildBySemanticHint(EntityContextVisualIDRegistry
						.getType(ContextSituationActionsEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class SituationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureContextSituationIdFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureContextSituationNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureSituationConditionsRectangleFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureSituationSensingRectangleFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureSituationActionRectangleFigure;

		/**
		 * @generated
		 */
		public SituationFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure situationTitleFigure0 = new RectangleFigure();

			situationTitleFigure0.setFill(false);
			situationTitleFigure0.setOutline(false);
			situationTitleFigure0.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			this.add(situationTitleFigure0, BorderLayout.TOP);

			ToolbarLayout layoutSituationTitleFigure0 = new ToolbarLayout();
			layoutSituationTitleFigure0.setStretchMinorAxis(false);
			layoutSituationTitleFigure0
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutSituationTitleFigure0.setSpacing(5);
			layoutSituationTitleFigure0.setVertical(false);

			situationTitleFigure0.setLayoutManager(layoutSituationTitleFigure0);

			fFigureContextSituationIdFigure = new WrappingLabel();

			fFigureContextSituationIdFigure.setText("");

			situationTitleFigure0.add(fFigureContextSituationIdFigure);

			fFigureContextSituationNameFigure = new WrappingLabel();

			fFigureContextSituationNameFigure.setText("<...>");

			situationTitleFigure0.add(fFigureContextSituationNameFigure);

			RectangleFigure situationCompartmentRectangleFigure0 = new RectangleFigure();

			situationCompartmentRectangleFigure0.setFill(false);
			situationCompartmentRectangleFigure0.setOutline(false);

			this.add(situationCompartmentRectangleFigure0, BorderLayout.CENTER);

			BorderLayout layoutSituationCompartmentRectangleFigure0 = new BorderLayout();
			situationCompartmentRectangleFigure0
					.setLayoutManager(layoutSituationCompartmentRectangleFigure0);

			fFigureSituationConditionsRectangleFigure = new RectangleFigure();

			fFigureSituationConditionsRectangleFigure.setFill(false);
			fFigureSituationConditionsRectangleFigure.setOutline(false);

			situationCompartmentRectangleFigure0
					.add(fFigureSituationConditionsRectangleFigure,
							BorderLayout.TOP);

			fFigureSituationSensingRectangleFigure = new RectangleFigure();

			fFigureSituationSensingRectangleFigure.setFill(false);
			fFigureSituationSensingRectangleFigure.setOutline(false);

			situationCompartmentRectangleFigure0
					.add(fFigureSituationSensingRectangleFigure,
							BorderLayout.CENTER);

			fFigureSituationActionRectangleFigure = new RectangleFigure();

			fFigureSituationActionRectangleFigure.setFill(false);
			fFigureSituationActionRectangleFigure.setOutline(false);

			situationCompartmentRectangleFigure0.add(
					fFigureSituationActionRectangleFigure, BorderLayout.BOTTOM);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContextSituationIdFigure() {
			return fFigureContextSituationIdFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContextSituationNameFigure() {
			return fFigureContextSituationNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureSituationConditionsRectangleFigure() {
			return fFigureSituationConditionsRectangleFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureSituationSensingRectangleFigure() {
			return fFigureSituationSensingRectangleFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureSituationActionRectangleFigure() {
			return fFigureSituationActionRectangleFigure;
		}

	}

}
