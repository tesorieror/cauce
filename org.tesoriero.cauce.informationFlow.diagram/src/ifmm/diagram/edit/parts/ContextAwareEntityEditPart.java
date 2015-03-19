package ifmm.diagram.edit.parts;

import ifmm.diagram.edit.policies.ContextAwareEntityItemSemanticEditPolicy;
import ifmm.diagram.edit.policies.InformationFlowTextSelectionEditPolicy;
import ifmm.diagram.part.InformationFlowVisualIDRegistry;
import ifmm.diagram.providers.InformationFlowElementTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
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

/**
 * @generated
 */
public class ContextAwareEntityEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

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
	public ContextAwareEntityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ContextAwareEntityItemSemanticEditPolicy());
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
		return primaryShape = new ContextAwareEntityFigure();
	}

	/**
	 * @generated
	 */
	public ContextAwareEntityFigure getPrimaryShape() {
		return (ContextAwareEntityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContextAwareEntityNameEditPart) {
			((ContextAwareEntityNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureContextAwareEntityNameFigure());
			return true;
		}
		if (childEditPart instanceof ContextAwareEntityIdEditPart) {
			((ContextAwareEntityIdEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureContextAwareEntityIdFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContextAwareEntityNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ContextAwareEntityIdEditPart) {
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
				.getType(ContextAwareEntityNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002);
		types.add(InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof BroadcastInformationFlowEditPart) {
			types.add(InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002);
		}
		if (targetEditPart instanceof PointToPointInformationFlowEditPart) {
			types.add(InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == InformationFlowElementTypes.EntityToBroadcastInformationFlowEdge_4002) {
			types.add(InformationFlowElementTypes.BroadcastInformationFlow_2001);
		} else if (relationshipType == InformationFlowElementTypes.EntityToPointToPointInformationFlowEdge_4003) {
			types.add(InformationFlowElementTypes.PointToPointInformationFlow_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001);
		types.add(InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == InformationFlowElementTypes.BroadcastInformationFlowToEntityEdge_4001) {
			types.add(InformationFlowElementTypes.BroadcastInformationFlow_2001);
		} else if (relationshipType == InformationFlowElementTypes.PointToPointInformationFlowToEntityEdge_4004) {
			types.add(InformationFlowElementTypes.PointToPointInformationFlow_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ContextAwareEntityFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureContextAwareEntityIdFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureContextAwareEntityNameFigure;

		/**
		 * @generated
		 */
		public ContextAwareEntityFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutThis.setSpacing(5);
			layoutThis.setVertical(false);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureContextAwareEntityIdFigure = new WrappingLabel();

			fFigureContextAwareEntityIdFigure.setText("");

			this.add(fFigureContextAwareEntityIdFigure);

			fFigureContextAwareEntityNameFigure = new WrappingLabel();

			fFigureContextAwareEntityNameFigure.setText("<...>");

			this.add(fFigureContextAwareEntityNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContextAwareEntityIdFigure() {
			return fFigureContextAwareEntityIdFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContextAwareEntityNameFigure() {
			return fFigureContextAwareEntityNameFigure;
		}

	}

}
