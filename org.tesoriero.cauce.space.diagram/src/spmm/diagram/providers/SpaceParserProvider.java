package spmm.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import spmm.SpmmPackage;
import spmm.diagram.edit.parts.PhysicalSpaceNameEditPart;
import spmm.diagram.edit.parts.VirtualSpaceNameEditPart;
import spmm.diagram.parsers.MessageFormatParser;
import spmm.diagram.part.SpaceVisualIDRegistry;

/**
 * @generated
 */
public class SpaceParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser physicalSpaceName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPhysicalSpaceName_5001Parser() {
		if (physicalSpaceName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SpmmPackage.eINSTANCE
					.getSpace_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			physicalSpaceName_5001Parser = parser;
		}
		return physicalSpaceName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser virtualSpaceName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getVirtualSpaceName_5002Parser() {
		if (virtualSpaceName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { SpmmPackage.eINSTANCE
					.getSpace_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			virtualSpaceName_5002Parser = parser;
		}
		return virtualSpaceName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PhysicalSpaceNameEditPart.VISUAL_ID:
			return getPhysicalSpaceName_5001Parser();
		case VirtualSpaceNameEditPart.VISUAL_ID:
			return getVirtualSpaceName_5002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SpaceVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SpaceVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SpaceElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
