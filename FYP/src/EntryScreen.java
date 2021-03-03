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
	private Text Age18to33Male;
	private Text Age34to49Male;
	private Text Age50to65Male;
	private Text Age66to81Male;
	private Text Age81to100Male;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	Simulation mySimulationObject = new Simulation();  
	private Text Age18to33Female;
	private Text Age34to49Female;
	private Text Age50to65Female;
	private Text Age66to81Female;
	private Text Age81to100Female;
	
	
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
		GridLayout gridLayout = new GridLayout(5, false);
		gridLayout.horizontalSpacing = 7;
		setLayout(gridLayout);
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
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblNumberOfWards = new Label(this, SWT.NONE);
		lblNumberOfWards.setText("Number of wards");
		new Label(this, SWT.NONE);
		
		NumbWards = new Text(this, SWT.BORDER);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblNumberOfHospital = new Label(this, SWT.NONE);
		lblNumberOfHospital.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNumberOfHospital.setText("Number of hospital beds");
		new Label(this, SWT.NONE);
		
		NumbBeds = new Text(this, SWT.BORDER);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblAgeGroupsOf = new Label(this, SWT.NONE);
		lblAgeGroupsOf.setText("Age Groups of borough (average)");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setText("18-33 Male");
		new Label(this, SWT.NONE);
		
		Age18to33Male = new Text(this, SWT.BORDER);
		
		Label lblNewLabel_1 = new Label(this, SWT.NONE);
		formToolkit.adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("18-33 Female");
		
		Age18to33Female = new Text(this, SWT.BORDER);
		GridData gd_Age18to33Female = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_Age18to33Female.widthHint = 62;
		Age18to33Female.setLayoutData(gd_Age18to33Female);
		formToolkit.adapt(Age18to33Female, true, true);
		
		Label lblMale = new Label(this, SWT.NONE);
		lblMale.setText("34-49 Male");
		new Label(this, SWT.NONE);
		
		Age34to49Male = new Text(this, SWT.BORDER);
		
		Label lblNewLabel_2 = new Label(this, SWT.NONE);
		formToolkit.adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("34-49 Female");
		
		Age34to49Female = new Text(this, SWT.BORDER);
		GridData gd_Age34to49Female = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_Age34to49Female.widthHint = 60;
		Age34to49Female.setLayoutData(gd_Age34to49Female);
		formToolkit.adapt(Age34to49Female, true, true);
		
		Label lblMale_1 = new Label(this, SWT.NONE);
		lblMale_1.setText("50-65 Male");
		new Label(this, SWT.NONE);
		
		Age50to65Male = new Text(this, SWT.BORDER);
		
		Label lblNewLabel_3 = new Label(this, SWT.NONE);
		formToolkit.adapt(lblNewLabel_3, true, true);
		lblNewLabel_3.setText("50-65 Female");
		
		Age50to65Female = new Text(this, SWT.BORDER);
		GridData gd_Age50to65Female = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_Age50to65Female.widthHint = 62;
		Age50to65Female.setLayoutData(gd_Age50to65Female);
		formToolkit.adapt(Age50to65Female, true, true);
		
		Label lblMale_2 = new Label(this, SWT.NONE);
		lblMale_2.setText("66-81 Male");
		new Label(this, SWT.NONE);
		
		Age66to81Male = new Text(this, SWT.BORDER);
		
		Label lblNewLabel_4 = new Label(this, SWT.NONE);
		formToolkit.adapt(lblNewLabel_4, true, true);
		lblNewLabel_4.setText("66-81 Female");
		
		Age66to81Female = new Text(this, SWT.BORDER);
		Age66to81Female.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(Age66to81Female, true, true);
		
		Label lblMale_3 = new Label(this, SWT.NONE);
		lblMale_3.setText("81-100 Male");
		new Label(this, SWT.NONE);
		
		Age81to100Male = new Text(this, SWT.BORDER);
		
		Label lblNewLabel_5 = new Label(this, SWT.NONE);
		formToolkit.adapt(lblNewLabel_5, true, true);
		lblNewLabel_5.setText("81-100 Female");
		
		Age81to100Female = new Text(this, SWT.BORDER);
		Age81to100Female.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(Age81to100Female, true, true);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnRunSimulation = new Button(this, SWT.NONE);
		btnRunSimulation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//Coverts the user input into usable values for the Simulation class
				int NumbWardsUse = Integer.parseInt(NumbWards.getText());
				int NumbBedsUse = Integer.parseInt(NumbBeds.getText());
				int Age18to33MaleUse = Integer.parseInt(Age18to33Male.getText());
				int Age34to49MaleUse = Integer.parseInt(Age34to49Male.getText());
				int Age50to65MaleUse = Integer.parseInt(Age50to65Male.getText());
				int Age66to81MaleUse = Integer.parseInt(Age66to81Male.getText());
				int Age81to100MaleUse = Integer.parseInt(Age81to100Male.getText());
				int Age18to33FemaleUse = Integer.parseInt(Age18to33Male.getText());
				int Age34to49FemaleUse = Integer.parseInt(Age34to49Male.getText());
				int Age50to65FemaleUse = Integer.parseInt(Age50to65Male.getText());
				int Age66to81FemaleUse = Integer.parseInt(Age66to81Male.getText());
				int Age81to100FemaleUse = Integer.parseInt(Age81to100Male.getText());
				
				try {
					
					Output outputscreen = new Output();
					outputscreen.setVisible(true);
					
					
					//loads into the simulation class on button click
					mySimulationObject.WorkPls(NumbWardsUse,
							NumbBedsUse,
							Age18to33MaleUse,
							Age34to49MaleUse,
							Age50to65MaleUse,
							Age66to81MaleUse,
							Age81to100MaleUse,
							Age18to33FemaleUse,
							Age34to49FemaleUse,
							Age50to65FemaleUse,
							Age66to81FemaleUse,
							Age81to100FemaleUse
							);
					
					
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
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
