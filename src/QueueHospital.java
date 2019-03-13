import java.util.LinkedList;

/**
 * Class representing a Hospital that orders its patients in the following way: Patients are ordered via a Queue.
 * 
 * @author Timmy
 * @version 03/10/2019
 * @param <PatientType>
 */
public class QueueHospital<PatientType> extends Hospital<PatientType>
{
	private LinkedList<PatientType> qH;
	
	/**
	 * Initializes the Patient Queue.
	 */
	public QueueHospital()
	{
		super();
		qH = new LinkedList<>();
	}
	
	/**
	 * Add a patient to the Hospital.
	 * 
	 * @param The patient to be added.
	 */
	@Override
	public void addPatient(PatientType patient) 
	{
		qH.addLast(patient);
	}

	/**
	 * Find and return the patient who will next be treated. 
	 * Does not treat the patient (i.e. it is not removed from the collection of patients that the hospital still must treat).
	 * 
	 * @return The patient who would be next treated.
	 */
	@Override
	public PatientType nextPatient() 
	{
		return qH.peek();
	}

	/**
	 * Treats the next patient and removes them from the Hospital. 
	 * Once someone is healed they no longer need to stay in the Hospital.
	 * @return The patient receiving treatment.
	 */
	@Override
	public PatientType treatNextPatient()
	{
		return qH.pollFirst();
	}

	/**
	 * Calculate and return the number of patients still in the hospital (untreated).
	 * @return The number of patients in the Hospital.
	 */
	@Override
	public int numPatients() 
	{
		return qH.size();
	}

	/**
	 * Gives a String for the hospital type.
	 * 
	 * @return A string exactly matching the class name.
	 */
	@Override
	public String hospitalType() 
	{
		return "" + qH.getClass();
	}
	
	/**
	 * Prints all patient information.
	 * 
	 * @return The toString of all patients, concatenated (don't add spaces, newlines, etc...).
	 */
	@Override
	public String allPatientInfo()
	{
		return qH.toString();
	}

}
