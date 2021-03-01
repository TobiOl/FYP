import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.SWT;

public class OutputScreen extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public OutputScreen(Composite parent, int style) {
		super(parent, style);
		
		TextViewer textViewer = new TextViewer(this, SWT.BORDER);
		StyledText styledText = textViewer.getTextWidget();
		styledText.setBounds(50, 113, 156, 75);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
