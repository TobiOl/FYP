import static org.junit.Assert.*;

import org.junit.Test;

public class DeathRatesTest {

	private DeathRates deathrates = new DeathRates();
	int input = 600;
	@SuppressWarnings("static-access")
	@Test
	//All tests will check if the values returned by the functions are not null
	//to pass
	
	public void testDeathnMale18to33() {
		
		assertNotNull(deathrates.DeathMale18to33(input));
		
		
	}
	
	@Test
	public void testDeathMale34to49() {
		
		assertNotNull(deathrates.DeathMale34to49(input));
		
		
	}
	
	@Test
	public void testDeathMaleAge50to65() {
		
		assertNotNull(deathrates.DeathMale50to65(input));
		
		
	}
	
	@Test
	public void testDeathnMaleAge66to81() {
		
		assertNotNull(deathrates.DeathMale66to81(input));
		
		
	}
	
	@Test
	public void testDeathMaleAge81to100() {
		
		assertNotNull(deathrates.DeathMale81to100(input));
		
		
	}
	
	@Test
	public void testDeathFemale18to33() {
		
		assertNotNull(deathrates.DeathFemale18to33(input));
		
		
	}
	
	@Test
	public void testDeathFemaleAge34to49() {
		
		assertNotNull(deathrates.DeathFemaleAge34to49(input));
		
		
	}
	
	@Test
	public void testDeathFemaleAge50to65() {
		
		assertNotNull(deathrates.DeathFemaleAge50to65(input));
		
		
	}
	
	@Test
	public void testDeathFemaleAge66to81() {
		
		assertNotNull(deathrates.DeathFemaleAge66to81(input));
		
		
	}
	
	@Test
	public void testDeathFemaleAge81to100() {
		
		assertNotNull(deathrates.DeathFemaleAge81to100(input));
		
		
	}
}
