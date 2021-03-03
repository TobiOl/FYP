import org.eclipse.swt.widgets.Text;
import java.io.*;  
import java.util.*;
public class Simulation {
	private float age18to33percentage;
	private float age34to49percentage;
	private float age50to65percentage;
	private float age66to81percentage;
	private float ageOver81percentage;
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
	public static double TotalHospitalised;
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
	HospitalisationRates myHospitalRatesObject = new HospitalisationRates(); 
	DeathRates myDeathRatesObject = new DeathRates(); 
	private float TotalInfected = 0;
	
public void WorkPls (int numbWardsUse, int numbBedsUse, int Age18to33Male, int Age34to49Male, int Age50to65Male, int Age66to81Male, int Age81to100Male, int age18to33FemaleUse, int age34to49FemaleUse, int age50to65FemaleUse, int age66to81FemaleUse, int age81to100FemaleUse) throws InterruptedException, IOException{
	//reads in infections per day in a CSV file and saves to a file
	String csvFile="C:\\Users\\Tobi\\Desktop\\School\\Year 3\\FYP\\Model\\InfectionsPerDay.csv";
	String csvSplitBy=",";

	
	
	String line = "";
	ArrayList<Integer> Infected = new ArrayList<>();
	Scanner scnr = new Scanner(new File(csvFile));
	
	
	while (scnr.hasNext()) {
		Infected.add(scnr.nextInt());
		TotalInfected = TotalInfected + scnr.nextInt();
		
	}
	
	age18to33percentage = (Age18to33Male/TotalInfected)*100;
	age34to49percentage = (Age34to49Male/TotalInfected)*100;
	age50to65percentage = (Age50to65Male/TotalInfected)*100;
	age66to81percentage = (Age66to81Male/TotalInfected)*100;
	ageOver81percentage = (Age81to100Male/TotalInfected)*100;
	
	
	System.out.println("HOSPITALISATION PER GENDER AND AGE (3 MONTHS)");
	System.out.println("");
	HospitalisedMale18to29 = HospitalisationRates.HospitalisationMale18to33(Age18to33Male);
	System.out.println("Out of " + Age18to33Male + " Males, the amount of Males aged 18 to 29 that will be hospitalised over 3 months are " + HospitalisedMale18to29);
	HospitalisedFemale18to33 = HospitalisationRates.HospitalisationFemale18to33(age18to33FemaleUse);
	System.out.println("Out of " + age18to33FemaleUse + " Females, The amount of Females aged 18 to 29 that will be hospitalised over 3 months are " + HospitalisedFemale18to33);
	
	HospitalisedMale34to49 = HospitalisationRates.HospitalisationMaleAge34to49(Age34to49Male);
	System.out.println("Out of " + Age34to49Male + " Males, The amount of Males aged 34 to 49 that will be hospitalised over 3 months are " + HospitalisedMale34to49);
	HospitalisedFemale34to49 = HospitalisationRates.HospitalisationFemaleAge34to49(age34to49FemaleUse);
	System.out.println("Out of " + age34to49FemaleUse + " Females, The amount of Females aged 34 to 49 that will be hospitalised over 3 months are " + HospitalisedFemale34to49);
	
	HospitalisedMale50to65 = HospitalisationRates.HospitalisationMaleAge50to65(Age50to65Male);
	System.out.println("Out of " + Age50to65Male + " Males, The amount of Males aged 50 to 65 that will be hospitalised over 3 months are " + HospitalisedMale50to65);
	HospitalisedFemale50to65 = HospitalisationRates.HospitalisationFemaleAge50to65(age50to65FemaleUse);
	System.out.println("Out of " + age50to65FemaleUse + " Females, The amount of Females aged 50 to 65 that will be hospitalised over 3 months are " + HospitalisedFemale50to65);
		
	HospitalisedMale66to81 = HospitalisationRates.HospitalisationMaleAge66to81(Age66to81Male);
	System.out.println("Out of " + Age66to81Male + " Males, The amount of Males aged 66 to 81 that will be hospitalised over 3 months are " + HospitalisedMale66to81);
	HospitalisedFemale66to81 = HospitalisationRates.HospitalisationFemaleAge66to81(age66to81FemaleUse);
	System.out.println("Out of " + age66to81FemaleUse + " Females, The amount of Females aged 66 to 81 that will be hospitalised over 3 months are " + HospitalisedFemale66to81);
	
	HospitalisedMale81to100 = HospitalisationRates.HospitalisationMale81to100(Age81to100Male);
	System.out.println("Out of " + Age81to100Male + " Males, The amount of Males aged 81 to 100 that will be hospitalised over 3 months are " + HospitalisedMale81to100);
	HospitalisedFemale81to100 = HospitalisationRates.HospitalisationFemale81to100(age81to100FemaleUse);
	System.out.println("Out of " + age81to100FemaleUse + " Females, The amount of Females aged 18 to 29 that will be hospitalised over 3 months are " + HospitalisedFemale81to100);
		
	
	
	System.out.println("");
	System.out.println("DEATH PER GENDER AND AGE (3 MONTHS)");
	System.out.println("");
	
	
	DeadMale18to29 = DeathRates.DeathMale18to33(Age18to33Male);
	System.out.println("Out of " + Age18to33Male + " Males, The amount of Males aged 18 to 29 that will die over 3 months are " + DeadMale18to29);
	DeadFemale18to29 = DeathRates.DeathFemale18to33(age18to33FemaleUse);
	System.out.println("Out of " + age18to33FemaleUse + " Females, The amount of Females aged 18 to 29 that will die over 3 months are " + DeadFemale18to29);
	
	DeadMale34to49 = DeathRates.DeathMale34to49(Age34to49Male);
	System.out.println("Out of " + Age34to49Male + " Males, The amount of Males aged 34 to 49 that will die over 3 months are " + DeadMale34to49);
	DeadFemale34to49 = DeathRates.DeathFemaleAge34to49(age34to49FemaleUse);
	System.out.println("Out of " + age34to49FemaleUse + " Females, The amount of Females aged 34 to 49 that will die over 3 months are " + DeadFemale34to49);

	DeadMale50to65 = DeathRates.DeathMale50to65(Age50to65Male);
	System.out.println("Out of " + Age50to65Male + " Males, The amount of Males aged 50 to 65 that will die over 3 months are " + DeadMale50to65);
	DeadFemale50to65 = DeathRates.DeathFemaleAge50to65(age50to65FemaleUse);
	System.out.println("Out of " + age50to65FemaleUse + " Females, The amount of Females aged 50 to 65 that will die over 3 months are " + DeadFemale50to65);

	DeadMale66to81 = DeathRates.DeathMale66to81(Age66to81Male);
	System.out.println("Out of " + Age66to81Male + " Males, The amount of Males aged 66 to 81 that will die over 3 months are " + DeadMale66to81);
	DeadFemale66to81 = DeathRates.DeathFemaleAge66to81(age66to81FemaleUse);
	System.out.println("Out of " + age66to81FemaleUse + " Females, The amount of Females aged 66 to 81 that will die over 3 months are " + DeadFemale66to81);
	
	DeadMale81to100 = DeathRates.DeathMale81to100(Age81to100Male);
	System.out.println("Out of " + Age81to100Male + " Males, The amount of Males aged 81 to 100 that will die over 3 months are " + DeadMale81to100);
	DeadFemale81to100 = DeathRates.DeathFemaleAge81to100(age81to100FemaleUse);
	System.out.println("Out of " + age81to100FemaleUse + " Females, The amount of Females aged 18 to 29 that will die over 3 months are " + DeadFemale81to100);
	
	TotalHospitalised = (HospitalisedMale18to29 + HospitalisedMale34to49+ HospitalisedMale50to65+ HospitalisedMale66to81+
			HospitalisedMale81to100+ HospitalisedFemale18to33+HospitalisedFemale34to49+HospitalisedFemale50to65+
			HospitalisedFemale66to81+HospitalisedFemale81to100);
	ResultVisualisation graphscreen = new ResultVisualisation(line);
	graphscreen.setVisible(true);
	
}


}
