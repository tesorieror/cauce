package ecmm.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.FlowLayout;
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

import ecmm.diagram.edit.policies.EntityContextItemSemanticEditPolicy;
import ecmm.diagram.part.EntityContextVisualIDRegistry;
import ecmm.diagram.providers.EntityContextElementTypes;

/**
 * @generated
 */
public class EntityContextEditPart extends ShapeNodeEditPart {

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
	public EntityContextEditPart(View view) {
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
				new EntityContextItemSemanticEditPolicy());
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
		return primaryShape = new EntityContextFigure();
	}

	/**
	 * @generated
	 */
	public EntityContextFigure getPrimaryShape() {
		return (EntityContextFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof EntityContextEntityEditPart) {
			((EntityContextEntityEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEntityContextEntityFigure());
			return true;
		}
		if (childEditPart instanceof EntityContextIdEditPart) {
			((EntityContextIdEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEntityContextIdFigure());
			return true;
		}
		if (childEditPart instanceof EntityContextStateEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureEntityContextStateRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((EntityContextStateEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof EntityContextSituationsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureEntityContextSituationRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((EntityContextSituationsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof EntityContextDefinitionsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureEntityContextVariableDefinitionRectangleFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((EntityContextDefinitionsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof EntityContextEntityEditPart) {
			return true;
		}
		if (childEditPart instanceof EntityContextIdEditPart) {
			return true;
		}
		if (childEditPart instanceof EntityContextStateEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureEntityContextStateRectangleFigure();
			pane.remove(((EntityContextStateEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof EntityContextSituationsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureEntityContextSituationRectangleFigure();
			pane.remove(((EntityContextSituationsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof EntityContextDefinitionsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureEntityContextVariableDefinitionRectangleFigure();
			pane.remove(((EntityContextDefinitionsEditPart) childEditPart)
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
		if (editPart instanceof EntityContextStateEditPart) {
			return getPrimaryShape()
					.getFigureEntityContextStateRectangleFigure();
		}
		if (editPart instanceof EntityContextSituationsEditPart) {
			return getPrimaryShape()
					.getFigureEntityContextSituationRectangleFigure();
		}
		if (editPart instanceof EntityContextDefinitionsEditPart) {
			return getPrimaryShape()
					.getFigureEntityContextVariableDefinitionRectangleFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(120, 240);
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
				.getType(EntityContextEntityEditPart.VISUAL_ID));
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
			if (type == EntityContextElementTypes.HolderMemory_3001) {
				return getChildBySemanticHint(EntityContextVisualIDRegistry
						.getType(EntityContextStateEditPart.VISUAL_ID));
			}
			if (type == EntityContextElementTypes.LogicMemory_3002) {
				return getChildBySemanticHint(EntityContextVisualIDRegistry
						.getType(EntityContextStateEditPart.VISUAL_ID));
			}
			if (type == EntityContextElementTypes.TimeMemory_3003) {
				return getChildBySemanticHint(EntityContextVisualIDRegistry
						.getType(EntityContextStateEditPart.VISUAL_ID));
			}
			if (type == EntityContextElementTypes.StackMemory_3004) {
				return getChildBySemanticHint(EntityContextVisualIDRegistry
						.getType(EntityContextStateEditPart.VISUAL_ID));
			}
			if (type == EntityContextElementTypes.DictionaryMemory_3005) {
				return getChildBySemanticHint(EntityContextVisualIDRegistry
						.getType(EntityContextStateEditPart.VISUAL_ID));
			}
			if (type == EntityContextElementTypes.VariableDataDefinition_3010) {
				return getChildBySemanticHint(EntityContextVisualIDRegistry
						.getType(EntityContextDefinitionsEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class EntityContextFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEntityContextIdFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEntityContextEntityFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureEntityContextStateRectangleFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureEntityContextSituationRectangleFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureEntityContextVariableDefinitionRectangleFigure;

		/**
		 * @generated
		 */
		public EntityContextFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure entityContextEntityContainerFigure0 = new RectangleFigure();

			entityContextEntityContainerFigure0.setFill(false);
			entityContextEntityContainerFigure0.setOutline(false);
			entityContextEntityContainerFigure0.setBorder(new MarginBorder(
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			this.add(entityContextEntityContainerFigure0, BorderLayout.TOP);

			ToolbarLayout layoutEntityContextEntityContainerFigure0 = new ToolbarLayout();
			layoutEntityContextEntityContainerFigure0
					.setStretchMinorAxis(false);
			layoutEntityContextEntityContainerFigure0
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutEntityContextEntityContainerFigure0.setSpacing(5);
			layoutEntityContextEntityContainerFigure0.setVertical(false);

			entityContextEntityContainerFigure0
					.setLayoutManager(layoutEntityContextEntityContainerFigure0);

			fFigureEntityContextIdFigure = new WrappingLabel();

			fFigureEntityContextIdFigure.setText("");

			entityContextEntityContainerFigure0
					.add(fFigureEntityContextIdFigure);

			fFigureEntityContextEntityFigure = new WrappingLabel();

			fFigureEntityContextEntityFigure.setText("<enter entity>");

			entityContextEntityContainerFigure0
					.add(fFigureEntityContextEntityFigure);

			RectangleFigure entityContextCompartmentsRectangleFigure0 = new RectangleFigure();

			entityContextCompartmentsRectangleFigure0.setFill(false);
			entityContextCompartmentsRectangleFigure0.setOutline(false);

			this.add(entityContextCompartmentsRectangleFigure0,
					BorderLayout.CENTER);

			BorderLayout layoutEntityContextCompartmentsRectangleFigure0 = new BorderLayout();
			entityContextCompartmentsRectangleFigure0
					.setLayoutManager(layoutEntityContextCompartmentsRectangleFigure0);

			fFigureEntityContextStateRectangleFigure = new RectangleFigure();

			fFigureEntityContextStateRectangleFigure.setFill(false);
			fFigureEntityContextStateRectangleFigure.setOutline(false);

			entityContextCompartmentsRectangleFigure0.add(
					fFigureEntityContextStateRectangleFigure, BorderLayout.TOP);

			fFigureEntityContextSituationRectangleFigure = new RectangleFigure();

			fFigureEntityContextSituationRectangleFigure.setFill(false);
			fFigureEntityContextSituationRectangleFigure.setOutline(false);

			entityContextCompartmentsRectangleFigure0.add(
					fFigureEntityContextSituationRectangleFigure,
					BorderLayout.CENTER);

			fFigureEntityContextVariableDefinitionRectangleFigure = new RectangleFigure();

			fFigureEntityContextVariableDefinitionRectangleFigure
					.setFill(false);
			fFigureEntityContextVariableDefinitionRectangleFigure
					.setOutline(false);

			entityContextCompartmentsRectangleFigure0.add(
					fFigureEntityContextVariableDefinitionRectangleFigure,
					BorderLayout.BOTTOM);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEntityContextIdFigure() {
			return fFigureEntityContextIdFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEntityContextEntityFigure() {
			return fFigureEntityContextEntityFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureEntityContextStateRectangleFigure() {
			return fFigureEntityContextStateRectangleFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureEntityContextSituationRectangleFigure() {
			return fFigureEntityContextSituationRectangleFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureEntityContextVariableDefinitionRectangleFigure() {
			return fFigureEntityContextVariableDefinitionRectangleFigure;
		}

	}

}
