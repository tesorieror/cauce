package ecmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ecmm.diagram.edit.commands.DictionaryMemoryCreateCommand;
import ecmm.diagram.edit.commands.HolderMemoryCreateCommand;
import ecmm.diagram.edit.commands.LogicMemoryCreateCommand;
import ecmm.diagram.edit.commands.StackMemoryCreateCommand;
import ecmm.diagram.edit.commands.TimeMemoryCreateCommand;
import ecmm.diagram.providers.EntityContextElementTypes;

/**
 * @generated
 */
public class EntityContextStateItemSemanticEditPolicy extends
		EntityContextBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityContextStateItemSemanticEditPolicy() {
		super(EntityContextElementTypes.EntityContext_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EntityContextElementTypes.HolderMemory_3001 == req.getElementType()) {
			return getGEFWrapper(new HolderMemoryCreateCommand(req));
		}
		if (EntityContextElementTypes.LogicMemory_3002 == req.getElementType()) {
			return getGEFWrapper(new LogicMemoryCreateCommand(req));
		}
		if (EntityContextElementTypes.TimeMemory_3003 == req.getElementType()) {
			return getGEFWrapper(new TimeMemoryCreateCommand(req));
		}
		if (EntityContextElementTypes.StackMemory_3004 == req.getElementType()) {
			return getGEFWrapper(new StackMemoryCreateCommand(req));
		}
		if (EntityContextElementTypes.DictionaryMemory_3005 == req
				.getElementType()) {
			return getGEFWrapper(new DictionaryMemoryCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
