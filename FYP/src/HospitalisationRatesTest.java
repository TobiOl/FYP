import static org.junit.Assert.*;

import org.junit.Test;



public class HospitalisationRatesTest {
	private HospitalisationRates hospitalrates = new HospitalisationRates();
	int input = 600;
	@SuppressWarnings("static-access")
	@Test
	//All tests will check if the values returned by the functions are not null
	//to pass
	
	public void testHospitalisationMale18to33() {
		assertNotNull(hospitalrates.HospitalisationMale18to33(input));
		
		
	}
	
	@Test
	public void testHospitalisationMale34to49() {
		assertNotNull(hospitalrates.HospitalisationMaleAge34to49(input));
		
		
	}
	
	@Test
	public void testHospitalisationMaleAge50to65() {
		assertNotNull(hospitalrates.HospitalisationMaleAge50to65(input));
		
		
	}
	
	@Test
	public void testHospitalisationMaleAge66to81() {
		assertNotNull(hospitalrates.HospitalisationMaleAge66to81(input));
		
		
	}
	
	@Test
	public void testHospitalisationMaleAge81to100() {
		assertNotNull(hospitalrates.HospitalisationMale81to100(input));
		
		
	}
	
	@Test
	public void testHospitalisationFemale18to33() {
		assertNotNull(hospitalrates.HospitalisationFemale18to33(input));
		
		
	}
	
	@Test
	public void testHospitalisationFemaleAge34to49() {
		assertNotNull(hospitalrates.HospitalisationFemaleAge34to49(input));
		
		
	}
	
	@Test
	public void testHospitalisationFemaleAge50to65() {
		assertNotNull(hospitalrates.HospitalisationFemaleAge50to65(input));
		
		
	}
	
	@Test
	public void testHospitalisationFemaleAge66to81() {
		assertNotNull(hospitalrates.HospitalisationFemaleAge66to81(input));
		
		
	}
	
	@Test
	public void testHospitalisationFemaleAge81to100() {
		assertNotNull(hospitalrates.HospitalisationFemale81to100(input));
		
		
	}

}
