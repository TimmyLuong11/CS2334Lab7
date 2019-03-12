import org.junit.Assert;
import org.junit.Test;

public class PersonTest 
{
	@Test
	public void SickPerson() 
	{
		SickPerson sp = new SickPerson("Shawn", 22, 8);
		Assert.assertEquals("Shawn", sp.getName());
		Assert.assertEquals(22, sp.getAge());
		Assert.assertEquals("Shawn, a 22-year old. In for 8", sp.toString());
	}
	
	@Test
	public void HealthyPerson()
	{
		
	}
}
