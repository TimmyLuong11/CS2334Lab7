import org.junit.Assert;
import org.junit.Test;

public class PersonTest 
{
	@Test
	public void SickPerson() 
	{
		SickPerson sp1 = new SickPerson("Shawn", 22, 1);
		SickPerson sp2 = new SickPerson("Richard", 2, 10);
		SickPerson sp3 = new SickPerson("Steven", 18, 10);
		SickPerson sp4 = new SickPerson("Josh", 13, 4);
		
		Assert.assertEquals("Shawn", sp1.getName());
		Assert.assertEquals("Richard", sp2.getName());
		Assert.assertEquals("Steven", sp3.getName());
		Assert.assertEquals("Josh", sp4.getName());
		
		Assert.assertEquals(22, sp1.getAge());
		Assert.assertEquals(2, sp2.getAge());
		Assert.assertEquals(18, sp3.getAge());
		Assert.assertEquals(13, sp4.getAge());
		
		Assert.assertEquals("Shawn, a 22-year old. Severity level 1", sp1.toString());
		Assert.assertEquals("Richard, a 2-year old. Severity level 10", sp2.toString());
		Assert.assertEquals("Steven, a 18-year old. Severity level 10", sp3.toString());
		Assert.assertEquals("Josh, a 13-year old. Severity level 4", sp4.toString());
		
		Assert.assertEquals(1, sp1.compareTo(sp2));
		Assert.assertEquals(1, sp1.compareTo(sp3));
		Assert.assertEquals(0, sp2.compareTo(sp3));
		Assert.assertEquals(-1, sp3.compareTo(sp4));
		
	}
	
	@Test
	public void HealthyPerson()
	{
		HealthyPerson hp1 = new HealthyPerson("Jay", 23, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Bob", 25, "Depression");
		HealthyPerson hp3 = new HealthyPerson("Joe", 15, "Flu Shot");
		
		Assert.assertEquals("Jay", hp1.getName());
		Assert.assertEquals("Bob", hp2.getName());
		Assert.assertEquals("Joe", hp3.getName());
		
		Assert.assertEquals(23, hp1.getAge());
		Assert.assertEquals(25, hp2.getAge());
		Assert.assertEquals(15, hp3.getAge());
		
		Assert.assertEquals("Jay, a 23-year old. In for Checkup", hp1.toString());
		Assert.assertEquals("Bob, a 25-year old. In for Depression", hp2.toString());
		Assert.assertEquals("Joe, a 15-year old. In for Flu Shot", hp3.toString());
		
		Assert.assertEquals(1, hp1.compareTo(hp2));
		Assert.assertEquals(0, hp1.compareTo(hp3));
		Assert.assertEquals(-1, hp2.compareTo(hp3));
	}
}
