import org.junit.Assert;
import org.junit.Test;

public class AnimalTest 
{
	@Test
	public void Animal()
	{
		Animal a = new Animal("Golden", 10);
		Assert.assertEquals("A 10-year old Golden.", a.toString());
		Assert.assertEquals("Golden", a.getBreed());
		Assert.assertEquals(10, a.getAge());
	}
}
