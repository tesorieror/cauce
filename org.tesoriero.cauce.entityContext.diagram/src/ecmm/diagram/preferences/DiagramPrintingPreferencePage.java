package ecmm.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.PrintingPreferencePage;

import ecmm.diagram.part.EntityContextDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramPrintingPreferencePage extends PrintingPreferencePage {

	/**
	 * @generated
	 */
	public DiagramPrintingPreferencePage() {
		setPreferenceStore(EntityContextDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
