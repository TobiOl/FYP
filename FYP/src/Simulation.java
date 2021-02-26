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
	private double HospitalisedFemale18to29;
	private double HospitalisedFemale34to49;
	private double HospitalisedFemale50to65;
	private double HospitalisedFemale66to81;
	private double HospitalisedFemale81to100;
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
	
	
	/*
	HospitalisedMale18to29 = HospitalisationRates.HospitalisationMale18to33(Age18to33Male);
	
	HospitalisedMale34to49 = HospitalisationRates.HospitalisationMaleAge34to49(Age34to49Male);
	
	HospitalisedMale50to65 = HospitalisationRates.HospitalisationMaleAge50to65(Age50to65Male);
	
	HospitalisedMale66to81 = HospitalisationRates.HospitalisationMaleAge66to81(Age66to81Male);
	
	HospitalisedMale81to100 = HospitalisationRates.HospitalisationMale81to100(Age81to100Male);
	
	HospitalisedFemale18to33 = HospitalisationRates.HospitalisationFemale81to100(age18to33FemaleUse);
	
	HospitalisedFemale34to49 = HospitalisationRates.HospitalisationFemaleAge34to49(age34to49FemaleUse);
	
	HospitalisedFemale50to65 = HospitalisationRates.HospitalisationFemaleAge50to65(age50to65FemaleUse);
	
	HospitalisedFemale66to81 = HospitalisationRates.HospitalisationFemaleAge66to81(age66to81FemaleUse);
	
	HospitalisedFemale81to100 = HospitalisationRates.HospitalisationFemale81to100(age81to100FemaleUse);
	*/
	
	DeadMale18to29 = DeathRates.DeathMale18to33(Age18to33Male);
	System.out.println(DeadMale18to29);
	DeadFemale18to29 = DeathRates.DeathFemale18to33(age18to33FemaleUse);
	System.out.println(DeadFemale18to29);
	DeadMale81to100 = DeathRates.DeathMale81to100(Age81to100Male);
	System.out.println(DeadMale81to100);
	DeadFemale81to100 = DeathRates.DeathFemaleAge81to100(age81to100FemaleUse);
	System.out.println(DeadFemale81to100);
	
	
}


}
