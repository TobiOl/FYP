
public class HospitalisationRates {
	//These functions will take in the estimate number of people in their specific age group and then
	//divide the number by 15 so there is an even number per age in the group. It will run a for loop
	//That carries out the QCovid algorithm focusing on age and gender, multiply them by the number of people in age group
	// to get the number that will go into the hospital and put these all together
	//in the returned value
	//Algorithm source: https://qcovid.org/Home/Algorithm
	public static int HospitalisationMale18to33(int Age18to33Use) {
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

	public static int HospitalisationMaleAge34to49(int Age34to49Use) {
		int thisi = Age34to49Use/15;
		double anotheri = 0;
		double score = 0;
		double dage = 0;
		double age_1 = 0;
		double age_2 = 0;
		int results = 0;
		double a = 0;
		for (int i = 34; i < 49; i++) {
			
			
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

	public static int HospitalisationMaleAge50to65(int Age50to65Use) {
		int thisi = Age50to65Use/15;
		double anotheri = 0;
		double score = 0;
		double dage = 0;
		double age_1 = 0;
		double age_2 = 0;
		int results = 0;
		double a = 0;
		for (int i = 50; i < 65; i++) {
			
			
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

	public static int HospitalisationMaleAge66to81(int Age66to81Use) {
		int thisi = Age66to81Use/15;
		double anotheri = 0;
		double score = 0;
		double dage = 0;
		double age_1 = 0;
		double age_2 = 0;
		int results = 0;
		double a = 0;
		for (int i = 66; i < 81; i++) {
			
			
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


	public static int HospitalisationMale81to100(int Age81to100Use) {
		int thisi = Age81to100Use/15;
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
	

	public static int HospitalisationFemale18to33(int age18to33FemaleUse) {
		int thisi = age18to33FemaleUse/15;
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
			age_1 = Math.pow(dage,.5);
			age_2 = Math.pow(dage,2);
			age_1 = age_1 - 2.207121372222900;
			age_2 = age_2 - 23.730392456054688;
			a += age_1 * -0.1484733673762321515265938;
			a += age_2 * 0.0405941535676193412940371;
			
			score = 100 * (1-Math.pow(0.999614596366882, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	
	
	public static int HospitalisationFemaleAge34to49(int age34to49FemaleUse) {
		int thisi = age34to49FemaleUse/15;
		double anotheri = 0;
		double score = 0;
		double dage = 0;
		double age_1 = 0;
		double age_2 = 0;
		int results = 0;
		double a = 0;
		for (int i = 34; i < 49; i++) {
			
			
			dage = i;
			dage=dage/10;
			age_1 = Math.pow(dage,.5);
			age_2 = Math.pow(dage,2);
			age_1 = age_1 - 2.207121372222900;
			age_2 = age_2 - 23.730392456054688;
			a += age_1 * -0.1484733673762321515265938;
			a += age_2 * 0.0405941535676193412940371;
			
			score = 100 * (1-Math.pow(0.999614596366882, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int HospitalisationFemaleAge50to65(int age50to65FemaleUse) {
		int thisi = age50to65FemaleUse/15;
		double anotheri = 0;
		double score = 0;
		double dage = 0;
		double age_1 = 0;
		double age_2 = 0;
		int results = 0;
		double a = 0;
		for (int i = 50; i < 65; i++) {
			
			
			dage = i;
			dage=dage/10;
			age_1 = Math.pow(dage,.5);
			age_2 = Math.pow(dage,2);
			age_1 = age_1 - 2.207121372222900;
			age_2 = age_2 - 23.730392456054688;
			a += age_1 * -0.1484733673762321515265938;
			a += age_2 * 0.0405941535676193412940371;
			
			score = 100 * (1-Math.pow(0.999614596366882, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int HospitalisationFemaleAge66to81(int age66to81FemaleUse) {
		int thisi = age66to81FemaleUse/15;
		double anotheri = 0;
		double score = 0;
		double dage = 0;
		double age_1 = 0;
		double age_2 = 0;
		int results = 0;
		double a = 0;
		for (int i = 66; i < 81; i++) {
			
			
			dage = i;
			dage=dage/10;
			age_1 = Math.pow(dage,.5);
			age_2 = Math.pow(dage,2);
			age_1 = age_1 - 2.207121372222900;
			age_2 = age_2 - 23.730392456054688;
			a += age_1 * -0.1484733673762321515265938;
			a += age_2 * 0.0405941535676193412940371;
			
			score = 100 * (1-Math.pow(0.999614596366882, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int HospitalisationFemale81to100(int Age81to100FemaleUse) {
		int thisi = Age81to100FemaleUse/15;
		double anotheri = 0;
		double score = 0;
		double dage = 0;
		double age_1 = 0;
		double age_2 = 0;
		int results = 0;
		double a = 0;
		for (int i = 81; i < 100; i++) {
			
			
			dage = i;
			dage=dage/10;
			age_1 = Math.pow(dage,.5);
			age_2 = Math.pow(dage,2);
			age_1 = age_1 - 2.207121372222900;
			age_2 = age_2 - 23.730392456054688;
			a += age_1 * -0.1484733673762321515265938;
			a += age_2 * 0.0405941535676193412940371;
			
			score = 100 * (1-Math.pow(0.999614596366882, Math.exp(a)));
			
			
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	
}
