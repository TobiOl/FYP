

public class Wards {
	private static int TotalBeds;
	
	public static String WardsCalculation(int numbWardsUse, int numbBedsUse) {
		//Calculates the total amount of hospital beds available in the hospital
		TotalBeds = numbBedsUse*numbWardsUse;
		
		
		//runs if else statements checking if each of the weeks hospitalisation numbers will go over the total bed capacity
		//if so, they return the statement to the Simulation class to be printed out

		if (ResultVisualisation.Weeks.get(0) > TotalBeds) {
			return "Hospital capacity is filled up by Week 1";
		}
		else if (ResultVisualisation.Weeks.get(1) > TotalBeds) {
			return "Hospital capacity is filled up by Week 2";
		}
else if (ResultVisualisation.Weeks.get(2) > TotalBeds) {
	return "Hospital capacity is filled up by Week 3";
}
else if (ResultVisualisation.Weeks.get(3) > TotalBeds) {
	return "Hospital capacity is filled up by Week 4";
}
else if (ResultVisualisation.Weeks.get(4) > TotalBeds) {
	return "Hospital capacity is filled up by Week 5";
}
else if (ResultVisualisation.Weeks.get(5) > TotalBeds) {
	return "Hospital capacity is filled up by Week 6";
}
else if (ResultVisualisation.Weeks.get(6) > TotalBeds) {
	return "Hospital capacity is filled up by Week 7";
}
else if (ResultVisualisation.Weeks.get(7) > TotalBeds) {
	return "Hospital capacity is filled up by Week 8";
}
else if (ResultVisualisation.Weeks.get(8) > TotalBeds) {
	return "Hospital capacity is filled up by Week 9";
}
else if (ResultVisualisation.Weeks.get(9) > TotalBeds) {
	return "Hospital capacity is filled up by Week 10";
}
else if (ResultVisualisation.Weeks.get(10) > TotalBeds) {
	return "Hospital capacity is filled up by Week 11";
}
else if (ResultVisualisation.Weeks.get(11) > TotalBeds) {
	return "Hospital capacity is filled up by Week 12";
}
else {
	return "Hospital capacity does not get filled up over 3 months";
}
		
		
		
	}
}
