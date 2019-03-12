import org.junit.Assert;
import org.junit.Test;

public class AnimalTest 
{
	@Test
	public void Animal()
	{
		Animal a = new Animal("Golden", 10);
		Animal b = new Animal("Liger", 4);
		Animal c = new Animal("Cat", 2);
		
		Assert.assertEquals("Golden", a.getBreed());
		Assert.assertEquals("Liger", b.getBreed());
		Assert.assertEquals("Cat", c.getBreed());
		
		Assert.assertEquals(10, a.getAge());
		Assert.assertEquals(4, b.getAge());
		Assert.assertEquals(2, c.getAge());
		
		Assert.assertEquals("A 10-year old Golden.", a.toString());
		Assert.assertEquals("A 4-year old Liger.", b.toString());
		Assert.assertEquals("A 2-year old Cat.", c.toString());
		
		Assert.assertEquals(-6, a.compareTo(b));
		Assert.assertEquals(-8, a.compareTo(c));
		Assert.assertEquals(-2, b.compareTo(c));
	}
}
