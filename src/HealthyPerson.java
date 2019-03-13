/**
 * Class representing specific type of Person admitted to a Hospital. A healthy person.
 * 
 * @author Timmy
 * @version 03/10/2019
 */
public class HealthyPerson extends Person
{
	private String reason;
	
	/**
	 * Stores information about the HealthyPerson.
	 * 
	 * @param The HealthyPerson's name.
	 * @param The HealthyPerson's age.
	 * @param The HealthyPerson's reason for visiting the Hospital(e.g. a yearly checkup).
	 */
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.reason = reason; 
	}
	
	/**
	 * Implementation method for Person's compareTo method(). 
	 * Does the actual legwork of comparison to compare a HealthyPerson (self) vs. another Person (p).
	 * 
	 * @param p - The other Person to compare self to.
	 * @return If p is not of type HealthyPerson, return 0. 
	 * Else, return (ignoring case): 
	 * 	(1) self's name comes "before" o's name: negative number 
	 * 	(2) self's name comes "after" p's name: positive number 
	 * 	(3) names are equivalent: 0 i.e. the natural ordering of the name strings, ignoring case - orders alphabetically.
	 */
	protected int compareToImpl(Person p) 
	{
		if (p instanceof SickPerson) 
		{
			return 0;
		}
		else
		{	
			if ((p.getName().compareTo(this.getName()) > 0))
			{	
				return -1;
			}
			else if ((p.getName().compareTo(this.getName()) < 0)) 
			{
				return 1;
			}
			else 
			{
				return 0;
			}
		}
		
	}
	
	/**
	 * Gives some information about the HealthyPerson.
	 * 
	 * @return The String "%s In for %s" with replacements of the super's toString and the HealthyPerson's reason.
	 */
	@Override
	public String toString() {
		return String.format("%s In for %s", super.toString(), this.reason);
	}

}
