package ecmm.diagram.edit.parts;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import ecmm.diagram.edit.policies.EntityContextSituationsCanonicalEditPolicy;
import ecmm.diagram.edit.policies.EntityContextSituationsItemSemanticEditPolicy;
import ecmm.diagram.part.EntityContextVisualIDRegistry;
import ecmm.diagram.part.Messages;

/**
 * @generated
 */
public class EntityContextSituationsEditPart extends ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7002;

	/**
	 * @generated
	 */
	public EntityContextSituationsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.EntityContextSituationsEditPart_title;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EntityContextSituationsItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						EntityContextVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new EntityContextSituationsCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

}
