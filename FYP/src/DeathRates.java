
public class DeathRates {
	//These functions will take in the estimate number of people in their specific age group and then
	//divide the number by 15 so there is an even number per age in the group. It will run a for loop
	//That carries out the QCovid algorithm focusing on age and gender, multiply them by the number of people in age group
	// to get the number that will die and put these all together
	//in the returned value
	//Algorithm source: https://qcovid.org/Home/Algorithm
	public static int DeathFemale18to33(int age18to33FemaleUse) {
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
			
			age_2 = Math.pow(dage,3)*Math.log(dage);
			
			age_1 = Math.pow(dage,3);
			
			age_1 = age_1 - 115.599884033203125;
			
			age_2 = age_2 - 183.038345336914062;
			
			a += age_1 *  0.0535266800950749549459218;
			a += age_2 * -0.0200935878258154260178614;
			
			score = 100 * (1-Math.pow(0.999977290630341, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int DeathFemaleAge34to49(int age34to49FemaleUse) {
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
			age_1 = Math.pow(dage,3);
			age_2 = Math.pow(dage,3)*Math.log(dage);
			age_1 = age_1 - 115.599884033203125;
			age_2 = age_2 - 183.038345336914062;
			a += age_1 *  0.0535266800950749549459218;
			a += age_2 * -0.0200935878258154260178614;
			
			score = 100 * (1-Math.pow(0.999977290630341, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int DeathFemaleAge50to65(int age50to65FemaleUse) {
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
			age_1 = Math.pow(dage,3);
			age_2 = Math.pow(dage,3)*Math.log(dage);
			age_1 = age_1 - 115.599884033203125;
			age_2 = age_2 - 183.038345336914062;
			a += age_1 *  0.0535266800950749549459218;
			a += age_2 * -0.0200935878258154260178614;
			
			score = 100 * (1-Math.pow(0.999977290630341, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int DeathFemaleAge66to81(int age66to81FemaleUse) {
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
			age_1 = Math.pow(dage,3);
			age_2 = Math.pow(dage,3)*Math.log(dage);
			age_1 = age_1 - 115.599884033203125;
			age_2 = age_2 - 183.038345336914062;
			a += age_1 *  0.0535266800950749549459218;
			a += age_2 * -0.0200935878258154260178614;
			
			score = 100 * (1-Math.pow(0.999977290630341, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int DeathFemaleAge81to100(int age81to100FemaleUse) {
		int thisi = age81to100FemaleUse/15;
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
			age_1 = Math.pow(dage,3);
			age_2 = Math.pow(dage,3)*Math.log(dage);
			age_1 = age_1 - 115.599884033203125;
			age_2 = age_2 - 183.038345336914062;
			a += age_1 *  0.0535266800950749549459218;
			a += age_2 * -0.0200935878258154260178614;
			
			score = 100 * (1-Math.pow(0.999977290630341, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int DeathMale18to33(int age18to33Use) {
		int thisi = age18to33Use/15;
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
			age_1 = dage;
			age_2 = Math.pow(dage,3);
			age_1 = age_1 - 4.770704746246338;
			age_2 = age_2 - 108.579444885253906;
			a += age_1 * 1.4547532388624053734105246;
			a += age_2 * -0.0028280265297625597521736;
			
			score = 100 * (1-Math.pow(0.999956965446472, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int DeathMale34to49(int Age34to49Use) {
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
			age_1 = dage;
			age_2 = Math.pow(dage,3);
			age_1 = age_1 - 4.770704746246338;
			age_2 = age_2 - 108.579444885253906;
			a += age_1 * 1.4547532388624053734105246;
			a += age_2 * -0.0028280265297625597521736;
			
			score = 100 * (1-Math.pow(0.999956965446472, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int DeathMale50to65(int Age50to65Use) {
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
			age_1 = dage;
			age_2 = Math.pow(dage,3);
			age_1 = age_1 - 4.770704746246338;
			age_2 = age_2 - 108.579444885253906;
			a += age_1 * 1.4547532388624053734105246;
			a += age_2 * -0.0028280265297625597521736;
			
			score = 100 * (1-Math.pow(0.999956965446472, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int DeathMale66to81(int Age66to81Use) {
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
			age_1 = dage;
			age_2 = Math.pow(dage,3);
			age_1 = age_1 - 4.770704746246338;
			age_2 = age_2 - 108.579444885253906;
			a += age_1 * 1.4547532388624053734105246;
			a += age_2 * -0.0028280265297625597521736;
			
			score = 100 * (1-Math.pow(0.999956965446472, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		
		
	}
	
	public static int DeathMale81to100(int Age82to100Use) {
		int thisi = Age82to100Use/15;
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
			age_1 = dage;
			age_2 = Math.pow(dage,3);
			age_1 = age_1 - 4.770704746246338;
			age_2 = age_2 - 108.579444885253906;
			a += age_1 * 1.4547532388624053734105246;
			a += age_2 * -0.0028280265297625597521736;
			
			score = 100 * (1-Math.pow(0.999956965446472, Math.exp(a)));
			
			a=0;
			
			anotheri = thisi*score;
			
			results = (int) (results+anotheri);
			
			
			
		}
		
		
		return results;
		 
		
	}
}
