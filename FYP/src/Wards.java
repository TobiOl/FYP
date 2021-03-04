

public class Wards {
	private static int TotalBeds;
	
	public static String WardsCalculation(int numbWardsUse, int numbBedsUse) {
		//Calculates the total amount of hospital beds available in the hospital
		TotalBeds = numbBedsUse*numbWardsUse;
		
		
		//runs if else statements checking if each of the weeks hospitalisation numbers will go over the total bed capacity
		//if so, they return the statement to the Simulation class to be printed out

		if (ResultVisualisation.Week1 > TotalBeds) {
			return "Hospital capacity is filled up by Week 1";
		}
		else if (ResultVisualisation.Week2 > TotalBeds) {
			return "Hospital capacity is filled up by Week 2";
		}
else if (ResultVisualisation.Week3 > TotalBeds) {
	return "Hospital capacity is filled up by Week 3";
}
else if (ResultVisualisation.Week4 > TotalBeds) {
	return "Hospital capacity is filled up by Week 4";
}
else if (ResultVisualisation.Week5 > TotalBeds) {
	return "Hospital capacity is filled up by Week 5";
}
else if (ResultVisualisation.Week6 > TotalBeds) {
	return "Hospital capacity is filled up by Week 6";
}
else if (ResultVisualisation.Week7 > TotalBeds) {
	return "Hospital capacity is filled up by Week 7";
}
else if (ResultVisualisation.Week8 > TotalBeds) {
	return "Hospital capacity is filled up by Week 8";
}
else if (ResultVisualisation.Week9 > TotalBeds) {
	return "Hospital capacity is filled up by Week 9";
}
else if (ResultVisualisation.Week10 > TotalBeds) {
	return "Hospital capacity is filled up by Week 10";
}
else if (ResultVisualisation.Week11 > TotalBeds) {
	return "Hospital capacity is filled up by Week 11";
}
else if (ResultVisualisation.Week12 > TotalBeds) {
	return "Hospital capacity is filled up by Week 12";
}
else {
	return "Hospital capacity does not get filled up over 3 months";
}
		
		
		
	}
}
