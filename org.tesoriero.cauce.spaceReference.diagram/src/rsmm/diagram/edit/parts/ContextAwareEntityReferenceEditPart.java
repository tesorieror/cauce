package rsmm.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
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

import rsmm.diagram.edit.policies.ContextAwareEntityReferenceItemSemanticEditPolicy;
import rsmm.diagram.edit.policies.SpaceReferenceTextSelectionEditPolicy;
import rsmm.diagram.part.SpaceReferenceVisualIDRegistry;
import rsmm.diagram.providers.SpaceReferenceElementTypes;

/**
 * @generated
 */
public class ContextAwareEntityReferenceEditPart extends ShapeNodeEditPart {

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
	public ContextAwareEntityReferenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ContextAwareEntityReferenceItemSemanticEditPolicy());
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
						return new SpaceReferenceTextSelectionEditPolicy();
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
		return primaryShape = new ContextAwareEntityReferenceFigure();
	}

	/**
	 * @generated
	 */
	public ContextAwareEntityReferenceFigure getPrimaryShape() {
		return (ContextAwareEntityReferenceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContextAwareEntityReferenceNameEditPart) {
			((ContextAwareEntityReferenceNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureContextAwareEntityReferenceNameFigure());
			return true;
		}
		if (childEditPart instanceof ContextAwareEntityReferenceEntityEditPart) {
			((ContextAwareEntityReferenceEntityEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureContextAwareEntityReferenceEntityFigure());
			return true;
		}
		if (childEditPart instanceof ContextAwareEntityReferenceIdEditPart) {
			((ContextAwareEntityReferenceIdEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureContextAwareEntityReferenceIdFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContextAwareEntityReferenceNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ContextAwareEntityReferenceEntityEditPart) {
			return true;
		}
		if (childEditPart instanceof ContextAwareEntityReferenceIdEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 30);
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
		return getChildBySemanticHint(SpaceReferenceVisualIDRegistry
				.getType(ContextAwareEntityReferenceNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SpaceReferenceElementTypes.SpaceToEntityReferenceDependency_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SpaceReferenceElementTypes.SpaceToEntityReferenceDependency_4002) {
			types.add(SpaceReferenceElementTypes.ReferentialSpace_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ContextAwareEntityReferenceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureContextAwareEntityReferenceIdFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureContextAwareEntityReferenceNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureContextAwareEntityReferenceEntityFigure;

		/**
		 * @generated
		 */
		public ContextAwareEntityReferenceFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutThis.setSpacing(5);
			layoutThis.setVertical(false);

			this.setLayoutManager(layoutThis);

			this.setBorder(new CompoundBorder(new LineBorder(null, getMapMode()
					.DPtoLP(1)), new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5))));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureContextAwareEntityReferenceIdFigure = new WrappingLabel();

			fFigureContextAwareEntityReferenceIdFigure.setText("");

			this.add(fFigureContextAwareEntityReferenceIdFigure);

			fFigureContextAwareEntityReferenceNameFigure = new WrappingLabel();

			fFigureContextAwareEntityReferenceNameFigure.setText("<...>");

			this.add(fFigureContextAwareEntityReferenceNameFigure);

			fFigureContextAwareEntityReferenceEntityFigure = new WrappingLabel();

			fFigureContextAwareEntityReferenceEntityFigure.setText("<...>");

			this.add(fFigureContextAwareEntityReferenceEntityFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContextAwareEntityReferenceIdFigure() {
			return fFigureContextAwareEntityReferenceIdFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContextAwareEntityReferenceNameFigure() {
			return fFigureContextAwareEntityReferenceNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContextAwareEntityReferenceEntityFigure() {
			return fFigureContextAwareEntityReferenceEntityFigure;
		}

	}

}
