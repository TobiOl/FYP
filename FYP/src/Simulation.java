import org.eclipse.swt.widgets.Text;
import java.io.*;  
import java.util.*;
public class Simulation {
	private float age18to33percentage;
	private float age34to49percentage;
	private float age50to65percentage;
	private float age66to81percentage;
	private float ageOver81percentage;
	private double Hospitalised18to29;
	private double HospitalisedOver81;
	private float TotalInfected = 0;
	
public void WorkPls (int numbWardsUse, int numbBedsUse, int Age18to33Use, int Age34to49Use, int Age50to65Use, int Age66to81Use, int AgeOver81Use) throws InterruptedException, IOException{
//	Scanner sc = new Scanner(new File("C:\\Users\\Tobi\\Desktop\\School\\Year 3\\FYP\\Model\\InfectionsPerDay.csv"));
//	sc.useDelimiter(",");
//	while (sc.hasNext()) {
//		
//	}
//	
	String csvFile="C:\\Users\\Tobi\\Desktop\\School\\Year 3\\FYP\\Model\\InfectionsPerDay.csv";
	String csvSplitBy=",";

	
	
	String line = "";
	ArrayList<Integer> Infected = new ArrayList<>();
	Scanner scnr = new Scanner(new File(csvFile));
	
	
	while (scnr.hasNext()) {
		Infected.add(scnr.nextInt());
		TotalInfected = TotalInfected + scnr.nextInt();
		
	}
	
	age18to33percentage = (Age18to33Use/TotalInfected)*100;
	age34to49percentage = (Age34to49Use/TotalInfected)*100;
	age50to65percentage = (Age50to65Use/TotalInfected)*100;
	age66to81percentage = (Age66to81Use/TotalInfected)*100;
	ageOver81percentage = (AgeOver81Use/TotalInfected)*100;
	
	
	Hospitalised18to29 = HospitalisationMale18to33(Age18to33Use);
	
	System.out.println(Hospitalised18to29);
	
	HospitalisedOver81 = HospitalisationMaleOver81(AgeOver81Use);
	
	System.out.println(HospitalisedOver81);
	


	
	
}
//This function will take in the estimate number of people in this age group and then
//divide the number by 15 so there is an even number per age in the group. It will run a for loop
//That carries out the QCovid algorithm focusing on age, multiply them by the number of people in age group
// to get the number that will go into the hospital and put these all together
//in the returned value
public int HospitalisationMale18to33(int Age18to33Use) {
	int thisi = Age18to33Use/15;
	double anotheri = 0;
	double score = 0;
	double dage = 0;
	double age_1 = 0;
	double age_2 = 0;
	int results = 0;
	double a = 0;
	for (int i = 18; i < 33; i++) {
		
		
		dage = i;
		dage=dage/10;
		age_1 = Math.pow(dage,-2);
		age_2 = Math.pow(dage,2);
		age_1 = age_1 - 0.043937455862761;
		age_2 = age_2 - 22.759624481201172;
		a += age_1 * -9.8655000090771149956481167;
		a += age_2 * 0.0372128338797922050829037;
		
		score = 100 * (1-Math.pow(0.999484241008759, Math.exp(a)));
		
		a=0;
		
		anotheri = thisi*score;
		
		results = (int) (results+anotheri);
		
		
		
	}
	
	
	return results;
	
}

public int HospitalisationMaleOver81(int AgeOver81Use) {
	int thisi = AgeOver81Use/15;
	double anotheri = 0;
	double score = 0;
	double dage = 0;
	double age_1 = 0;
	double age_2 = 0;
	int results = 0;
	double a = 0;
	for (int i = 82; i < 100; i++) {
		
		
		dage = i;
		dage=dage/10;
		age_1 = Math.pow(dage,-2);
		age_2 = Math.pow(dage,2);
		age_1 = age_1 - 0.043937455862761;
		age_2 = age_2 - 22.759624481201172;
		a += age_1 * -9.8655000090771149956481167;
		a += age_2 * 0.0372128338797922050829037;
		
		score = 100 * (1-Math.pow(0.999484241008759, Math.exp(a)));
		
		a=0;
		
		anotheri = thisi*score;
		
		results = (int) (results+anotheri);
		
		
		
	}
	
	
	return results;
	
}

}
