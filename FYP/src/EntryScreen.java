import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.MainScreen;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class EntryScreen extends Composite {
	private Text NumbWards;
	private Text NumbBeds;
	private Text Age18to29;
	private Text Age30to45;
	private Text Age46to60;
	private Text Age61to75;
	private Text AgeOver75;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	Simulation mySimulationObject = new Simulation();  
	
	
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(1, false));
		EntryScreen Screen = new EntryScreen(shell, SWT.NONE);
		

		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public EntryScreen(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(3, false));
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblSimulationSetUp = new Label(this, SWT.NONE);
		lblSimulationSetUp.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblSimulationSetUp.setAlignment(SWT.CENTER);
		lblSimulationSetUp.setText("Simulation set up screen");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblNumberOfWards = new Label(this, SWT.NONE);
		lblNumberOfWards.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNumberOfWards.setText("Number of wards");
		new Label(this, SWT.NONE);
		
		NumbWards = new Text(this, SWT.BORDER);
		NumbWards.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblNumberOfHospital = new Label(this, SWT.NONE);
		lblNumberOfHospital.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNumberOfHospital.setText("Number of hospital beds");
		new Label(this, SWT.NONE);
		
		NumbBeds = new Text(this, SWT.BORDER);
		NumbBeds.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblAgeGroupsOf = new Label(this, SWT.NONE);
		lblAgeGroupsOf.setText("Age Groups of borough (average)");
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setText("18-29");
		new Label(this, SWT.NONE);
		
		Age18to29 = new Text(this, SWT.BORDER);
		Age18to29.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		
		Label label = new Label(this, SWT.NONE);
		label.setText("30-45");
		new Label(this, SWT.NONE);
		
		Age30to45 = new Text(this, SWT.BORDER);
		Age30to45.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		
		Label label_1 = new Label(this, SWT.NONE);
		label_1.setText("46-60");
		new Label(this, SWT.NONE);
		
		Age46to60 = new Text(this, SWT.BORDER);
		Age46to60.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		
		Label label_2 = new Label(this, SWT.NONE);
		label_2.setText("61-75");
		new Label(this, SWT.NONE);
		
		Age61to75 = new Text(this, SWT.BORDER);
		Age61to75.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		
		Label label_3 = new Label(this, SWT.NONE);
		label_3.setText("75+");
		new Label(this, SWT.NONE);
		
		AgeOver75 = new Text(this, SWT.BORDER);
		AgeOver75.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnRunSimulation = new Button(this, SWT.NONE);
		btnRunSimulation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int NumbWardsUse = Integer.parseInt(NumbWards.getText());
				int NumbBedsUse = Integer.parseInt(NumbBeds.getText());
				int Age18to33Use = Integer.parseInt(Age18to29.getText());
				int Age34to49Use = Integer.parseInt(Age30to45.getText());
				int Age50to65Use = Integer.parseInt(Age46to60.getText());
				int Age66to81Use = Integer.parseInt(Age61to75.getText());
				int AgeOver81Use = Integer.parseInt(AgeOver75.getText());
				
				try {
					mySimulationObject.WorkPls(NumbWardsUse,
							NumbBedsUse,
							Age18to33Use,
							Age34to49Use,
							Age50to65Use,
							Age66to81Use,
							AgeOver81Use);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnRunSimulation.setText("Run Simulation");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
