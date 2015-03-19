package tamm.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import tamm.diagram.edit.commands.AndJoinCreateCommand;
import tamm.diagram.edit.commands.AndSplitCreateCommand;
import tamm.diagram.edit.commands.FinalConditionCreateCommand;
import tamm.diagram.edit.commands.InitialConditionCreateCommand;
import tamm.diagram.edit.commands.OrJoinCreateCommand;
import tamm.diagram.edit.commands.OrSplitCreateCommand;
import tamm.diagram.edit.commands.PostConditionCreateCommand;
import tamm.diagram.edit.commands.PreConditionCreateCommand;
import tamm.diagram.edit.commands.SimpleTaskCreateCommand;
import tamm.diagram.edit.commands.SkipTaskCreateCommand;
import tamm.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class ContextAwareSystemItemSemanticEditPolicy extends
		TaskBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextAwareSystemItemSemanticEditPolicy() {
		super(TaskElementTypes.ContextAwareSystem_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TaskElementTypes.AndSplit_2001 == req.getElementType()) {
			return getGEFWrapper(new AndSplitCreateCommand(req));
		}
		if (TaskElementTypes.PreCondition_2002 == req.getElementType()) {
			return getGEFWrapper(new PreConditionCreateCommand(req));
		}
		if (TaskElementTypes.PostCondition_2003 == req.getElementType()) {
			return getGEFWrapper(new PostConditionCreateCommand(req));
		}
		if (TaskElementTypes.SkipTask_2004 == req.getElementType()) {
			return getGEFWrapper(new SkipTaskCreateCommand(req));
		}
		if (TaskElementTypes.FinalCondition_2005 == req.getElementType()) {
			return getGEFWrapper(new FinalConditionCreateCommand(req));
		}
		if (TaskElementTypes.AndJoin_2006 == req.getElementType()) {
			return getGEFWrapper(new AndJoinCreateCommand(req));
		}
		if (TaskElementTypes.InitialCondition_2007 == req.getElementType()) {
			return getGEFWrapper(new InitialConditionCreateCommand(req));
		}
		if (TaskElementTypes.SimpleTask_2008 == req.getElementType()) {
			return getGEFWrapper(new SimpleTaskCreateCommand(req));
		}
		if (TaskElementTypes.OrSplit_2009 == req.getElementType()) {
			return getGEFWrapper(new OrSplitCreateCommand(req));
		}
		if (TaskElementTypes.OrJoin_2010 == req.getElementType()) {
			return getGEFWrapper(new OrJoinCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
