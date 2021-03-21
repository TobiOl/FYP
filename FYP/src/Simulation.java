import org.eclipse.swt.widgets.Text;
import java.io.*;  
import java.util.*;
public class Simulation {
	//These variables are created to store the returned results from the HospitalisationRates class
	private double HospitalisedMale18to29;
	private double HospitalisedMale34to49;
	private double HospitalisedMale50to65;
	private double HospitalisedMale66to81;
	private double HospitalisedMale81to100;
	private double HospitalisedFemale18to33;
	private double HospitalisedFemale34to49;
	private double HospitalisedFemale50to65;
	private double HospitalisedFemale66to81;
	private double HospitalisedFemale81to100;
	//This variable is to store the total number of people hospitalised and made public for the ResultVisualisation class to have access
	public static double TotalHospitalised;
	//These variables are created to store the returned results from the DeathRates class
	private double DeadMale18to29;
	private double DeadMale34to49;
	private double DeadMale50to65;
	private double DeadMale66to81;
	private double DeadMale81to100;
	private double DeadFemale18to29;
	private double DeadFemale34to49;
	private double DeadFemale50to65;
	private double DeadFemale66to81;
	private double DeadFemale81to100;
	//Used to store the Wards class results.
	private String OverFlowWeek;
	//Creating objects for the HospitalisationRates, Wards and DeathRates classes to be called so their functions can be used
	HospitalisationRates myHospitalRatesObject = new HospitalisationRates(); 
	Wards myWardsCalculationObject = new Wards(); 
	DeathRates myDeathRatesObject = new DeathRates(); 
	//This variable is the line used for the name of the screen created in the ResultVisualisation class
	private String line = "Hospitalisation Bar Chart";

	//reads in the user input from the EntryScreen class for use across the above mentioned classes
public void SimulationResults (int numbWardsUse, int numbBedsUse, int Age18to33Male, int Age34to49Male, int Age50to65Male, int Age66to81Male, int Age81to100Male, int age18to33FemaleUse, int age34to49FemaleUse, int age50to65FemaleUse, int age66to81FemaleUse, int age81to100FemaleUse) throws InterruptedException, IOException{
	
	//For all the lines under Hospitalisation, it will go into the HospitalisationRates class, select the created function for that specific age group and then
	//print out the returned result with a line explaining the results. It will do this for all the age groups and genders passed in above
	System.out.println("HOSPITALISATION PER GENDER AND AGE");
	System.out.println("");
	HospitalisedMale18to29 = HospitalisationRates.HospitalisationMale18to33(Age18to33Male);
	System.out.println("Out of " + Age18to33Male + " Males, the amount of Males aged 18 to 29 that will be hospitalised are " + HospitalisedMale18to29);
	HospitalisedFemale18to33 = HospitalisationRates.HospitalisationFemale18to33(age18to33FemaleUse);
	System.out.println("Out of " + age18to33FemaleUse + " Females, The amount of Females aged 18 to 29 that will be hospitalised are " + HospitalisedFemale18to33);
	
	HospitalisedMale34to49 = HospitalisationRates.HospitalisationMaleAge34to49(Age34to49Male);
	System.out.println("Out of " + Age34to49Male + " Males, The amount of Males aged 34 to 49 that will be hospitalised are " + HospitalisedMale34to49);
	HospitalisedFemale34to49 = HospitalisationRates.HospitalisationFemaleAge34to49(age34to49FemaleUse);
	System.out.println("Out of " + age34to49FemaleUse + " Females, The amount of Females aged 34 to 49 that will be hospitalised are " + HospitalisedFemale34to49);
	
	HospitalisedMale50to65 = HospitalisationRates.HospitalisationMaleAge50to65(Age50to65Male);
	System.out.println("Out of " + Age50to65Male + " Males, The amount of Males aged 50 to 65 that will be hospitalised are " + HospitalisedMale50to65);
	HospitalisedFemale50to65 = HospitalisationRates.HospitalisationFemaleAge50to65(age50to65FemaleUse);
	System.out.println("Out of " + age50to65FemaleUse + " Females, The amount of Females aged 50 to 65 that will be hospitalised are " + HospitalisedFemale50to65);
		
	HospitalisedMale66to81 = HospitalisationRates.HospitalisationMaleAge66to81(Age66to81Male);
	System.out.println("Out of " + Age66to81Male + " Males, The amount of Males aged 66 to 81 that will be hospitalised are " + HospitalisedMale66to81);
	HospitalisedFemale66to81 = HospitalisationRates.HospitalisationFemaleAge66to81(age66to81FemaleUse);
	System.out.println("Out of " + age66to81FemaleUse + " Females, The amount of Females aged 66 to 81 that will be hospitalised are " + HospitalisedFemale66to81);
	
	HospitalisedMale81to100 = HospitalisationRates.HospitalisationMale81to100(Age81to100Male);
	System.out.println("Out of " + Age81to100Male + " Males, The amount of Males aged 81 to 100 that will be hospitalised are " + HospitalisedMale81to100);
	HospitalisedFemale81to100 = HospitalisationRates.HospitalisationFemale81to100(age81to100FemaleUse);
	System.out.println("Out of " + age81to100FemaleUse + " Females, The amount of Females aged 81 to 100 that will be hospitalised are " + HospitalisedFemale81to100);
		
	
	
	System.out.println("");
	System.out.println("DEATH PER GENDER AND AGE");
	System.out.println("");
	
	//For all the lines under Death, it will go into the DeathRates class, select the created function for that specific age group and then
	//print out the returned result with a line explaining the results. It will do this for all the age groups and genders passed in above

	DeadMale18to29 = DeathRates.DeathMale18to33(Age18to33Male);
	System.out.println("Out of " + Age18to33Male + " Males, The amount of Males aged 18 to 29 that will die are " + DeadMale18to29);
	DeadFemale18to29 = DeathRates.DeathFemale18to33(age18to33FemaleUse);
	System.out.println("Out of " + age18to33FemaleUse + " Females, The amount of Females aged 18 to 29 that will die are " + DeadFemale18to29);
	
	DeadMale34to49 = DeathRates.DeathMale34to49(Age34to49Male);
	System.out.println("Out of " + Age34to49Male + " Males, The amount of Males aged 34 to 49 that will die are " + DeadMale34to49);
	DeadFemale34to49 = DeathRates.DeathFemaleAge34to49(age34to49FemaleUse);
	System.out.println("Out of " + age34to49FemaleUse + " Females, The amount of Females aged 34 to 49 that will die are " + DeadFemale34to49);

	DeadMale50to65 = DeathRates.DeathMale50to65(Age50to65Male);
	System.out.println("Out of " + Age50to65Male + " Males, The amount of Males aged 50 to 65 that will die are " + DeadMale50to65);
	DeadFemale50to65 = DeathRates.DeathFemaleAge50to65(age50to65FemaleUse);
	System.out.println("Out of " + age50to65FemaleUse + " Females, The amount of Females aged 50 to 65 that will die are " + DeadFemale50to65);

	DeadMale66to81 = DeathRates.DeathMale66to81(Age66to81Male);
	System.out.println("Out of " + Age66to81Male + " Males, The amount of Males aged 66 to 81 that will die are " + DeadMale66to81);
	DeadFemale66to81 = DeathRates.DeathFemaleAge66to81(age66to81FemaleUse);
	System.out.println("Out of " + age66to81FemaleUse + " Females, The amount of Females aged 66 to 81 that will die are " + DeadFemale66to81);
	
	DeadMale81to100 = DeathRates.DeathMale81to100(Age81to100Male);
	System.out.println("Out of " + Age81to100Male + " Males, The amount of Males aged 81 to 100 that will die are " + DeadMale81to100);
	DeadFemale81to100 = DeathRates.DeathFemaleAge81to100(age81to100FemaleUse);
	System.out.println("Out of " + age81to100FemaleUse + " Females, The amount of Females aged 81 to 100 that will die are " + DeadFemale81to100);

	//adds up up all the hospitalisation numbers to be used in the ResultVisualisation class
	TotalHospitalised = (HospitalisedMale18to29 + HospitalisedMale34to49+ HospitalisedMale50to65+ HospitalisedMale66to81+
			HospitalisedMale81to100+ HospitalisedFemale18to33+HospitalisedFemale34to49+HospitalisedFemale50to65+
			HospitalisedFemale66to81+HospitalisedFemale81to100);
	//Runs the ResultsVisualisation screen, passes in the window title created above
	ResultVisualisation graphscreen = new ResultVisualisation(line);
	graphscreen.setVisible(true);
	
	System.out.println("");
	System.out.println("Wards Calculation over 3 months");
	System.out.println("");
	//Runs the WardsCalculation function in the Wards class while passing in the Wards data passed in above then prints out the results
	OverFlowWeek = Wards.WardsCalculation(numbWardsUse, numbBedsUse);
	System.out.println(OverFlowWeek);
	
	
	
}


}
