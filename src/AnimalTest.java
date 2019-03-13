import org.junit.Assert;
import org.junit.Test;

public class AnimalTest 
{
	/**
	 * Test the animal class
	 */
	@Test
	public void AnimalTest()
	{
		Animal a = new Animal("Golden", 10);
		Animal b = new Animal("Liger", 4);
		Animal c = new Animal("Cat", 2);
		
		Assert.assertEquals("Breed was matching", "Golden", a.getBreed());
		Assert.assertEquals("Breed was matching","Liger", b.getBreed());
		Assert.assertEquals("Breed was matching","Cat", c.getBreed());
		
		Assert.assertEquals("Age was matching",10, a.getAge(), 0.00001);
		Assert.assertEquals("Age was matching",4, b.getAge(), 0.00001);
		Assert.assertEquals("Age was matching",2, c.getAge(), 0.00001);
		
		Assert.assertEquals("A 10-year old Golden.", a.toString());
		Assert.assertEquals("A 4-year old Liger.", b.toString());
		Assert.assertEquals("A 2-year old Cat.", c.toString());
		
		Assert.assertEquals(-6, a.compareTo(b));
		Assert.assertEquals(-8, a.compareTo(c));
		Assert.assertEquals(-2, b.compareTo(c));
	}
}
