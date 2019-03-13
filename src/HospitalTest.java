import org.junit.Assert;
import org.junit.Test;

public class HospitalTest 
{
	/**
	 * Thet the stack sorting for hospital
	 */
	@Test
	public void StackHospitalTest()
	{
		StackHospital<SickPerson> sh1 = new StackHospital<>();
		StackHospital<HealthyPerson> sh2 = new StackHospital<>();
		
		SickPerson sp1 = new SickPerson("Shawn", 22, 1);
		SickPerson sp2 = new SickPerson("Richard", 2, 10);
		SickPerson sp3 = new SickPerson("Josh", 13, 4);
		HealthyPerson hp1 = new HealthyPerson("Jay", 23, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Bob", 25, "Depression");
		HealthyPerson hp3 = new HealthyPerson("Joe", 15, "Flu Shot");
		
		sh1.addPatient(sp1);
		sh1.addPatient(sp2);
		sh1.addPatient(sp3);
		sh2.addPatient(hp1);
		sh2.addPatient(hp2);
		sh2.addPatient(hp3);
		
		Assert.assertEquals("[Shawn, a 22-year old. Severity level 1, Richard, a 2-year old. Severity level 10, Josh, a 13-year old. Severity level 4]", sh1.allPatientInfo());
		Assert.assertEquals("[Jay, a 23-year old. In for Checkup, Bob, a 25-year old. In for Depression, Joe, a 15-year old. In for Flu Shot]", sh2.allPatientInfo());
		
		Assert.assertEquals(sp3, sh1.nextPatient());
		Assert.assertEquals(sp3, sh1.nextPatient());
		Assert.assertEquals(hp3, sh2.nextPatient());
		Assert.assertEquals(hp3, sh2.nextPatient());
		
		Assert.assertEquals(sp3, sh1.treatNextPatient());
		Assert.assertEquals(sp2, sh1.treatNextPatient());
		Assert.assertEquals(sp1, sh1.treatNextPatient());
		Assert.assertEquals(hp3, sh2.treatNextPatient());
		Assert.assertEquals(hp2, sh2.treatNextPatient());
		Assert.assertEquals(hp1, sh2.treatNextPatient());
		
		Assert.assertEquals(0, sh1.numPatients());
		Assert.assertEquals(0, sh2.numPatients());
		
		Assert.assertEquals("Hosptial Type Matches","StackHospital", sh1.hospitalType());
		Assert.assertEquals("Hosptial Type Matches","StackHospital", sh2.hospitalType());
		
		Assert.assertEquals("[]", sh1.allPatientInfo());
		Assert.assertEquals("[]", sh2.allPatientInfo());
		
		Assert.assertEquals("A StackHospital-type hospital with 0 patients.", sh1.toString());
		Assert.assertEquals("A StackHospital-type hospital with 0 patients.", sh2.toString());
	}
	
	/**
	 * Test the queue sorting for hospital
	 */
	@Test
	public void QueueHospitalTest()
	{
		QueueHospital<SickPerson> qh1 = new QueueHospital<>();
		QueueHospital<HealthyPerson> qh2 = new QueueHospital<>();
		
		SickPerson sp1 = new SickPerson("Shawn", 22, 1);
		SickPerson sp2 = new SickPerson("Richard", 2, 10);
		SickPerson sp3 = new SickPerson("Josh", 13, 4);
		HealthyPerson hp1 = new HealthyPerson("Jay", 23, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Bob", 25, "Depression");
		HealthyPerson hp3 = new HealthyPerson("Joe", 15, "Flu Shot");
		
		qh1.addPatient(sp1);
		qh1.addPatient(sp2);
		qh1.addPatient(sp3);
		qh2.addPatient(hp1);
		qh2.addPatient(hp2);
		qh2.addPatient(hp3);
		
		Assert.assertEquals(sp1, qh1.nextPatient());
		Assert.assertEquals(sp1, qh1.nextPatient());
		Assert.assertEquals(hp1, qh2.nextPatient());
		Assert.assertEquals(hp1, qh2.nextPatient());
		
		Assert.assertEquals(sp1, qh1.treatNextPatient());
		Assert.assertEquals(sp2, qh1.treatNextPatient());
		Assert.assertEquals(sp3, qh1.treatNextPatient());
		Assert.assertEquals(hp1, qh2.treatNextPatient());
		Assert.assertEquals(hp2, qh2.treatNextPatient());
		Assert.assertEquals(hp3, qh2.treatNextPatient());
		
		Assert.assertEquals(0, qh1.numPatients());
		Assert.assertEquals(0, qh2.numPatients());
		
		Assert.assertEquals("Hosptial Type Matches","QueueHospital", qh1.hospitalType());
		Assert.assertEquals("Hosptial Type Matches","QueueHospital", qh2.hospitalType());
		
		Assert.assertEquals("[]", qh1.allPatientInfo());
		Assert.assertEquals("[]", qh2.allPatientInfo());
		
		Assert.assertEquals("A QueueHospital-type hospital with 0 patients.", qh1.toString());
		Assert.assertEquals("A QueueHospital-type hospital with 0 patients.", qh2.toString());
	}
	
	/**
	 * Test the Priority Queue sorting in hospital
	 */
	@Test
	public void PriorityQueueHospitalTest()
	{
		PriorityQueueHospital<SickPerson> pqh1 = new PriorityQueueHospital<>();
		PriorityQueueHospital<HealthyPerson> pqh2 = new PriorityQueueHospital<>();
		
		SickPerson sp1 = new SickPerson("Shawn", 22, 1);
		SickPerson sp2 = new SickPerson("Richard", 2, 10);
		SickPerson sp3 = new SickPerson("Josh", 13, 4);
		HealthyPerson hp1 = new HealthyPerson("Jay", 23, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Bob", 25, "Depression");
		HealthyPerson hp3 = new HealthyPerson("Joe", 15, "Flu Shot");
		
		pqh1.addPatient(sp1);
		pqh1.addPatient(sp2);
		pqh1.addPatient(sp3);
		pqh2.addPatient(hp1);
		pqh2.addPatient(hp2);
		pqh2.addPatient(hp3);
		
		Assert.assertEquals(sp1, pqh1.nextPatient());
		Assert.assertEquals(sp1, pqh1.nextPatient());
		Assert.assertEquals(hp2, pqh2.nextPatient());
		Assert.assertEquals(hp2, pqh2.nextPatient());
		
		Assert.assertEquals(sp1, pqh1.treatNextPatient());
		Assert.assertEquals(sp3, pqh1.treatNextPatient());
		Assert.assertEquals(sp2, pqh1.treatNextPatient());
		
		Assert.assertEquals(hp2, pqh2.treatNextPatient());
		Assert.assertEquals(hp1, pqh2.treatNextPatient());
		Assert.assertEquals(hp3, pqh2.treatNextPatient());
		
		Assert.assertEquals(0, pqh1.numPatients());
		Assert.assertEquals(0, pqh2.numPatients());
		
		Assert.assertEquals("Hosptial Type Matches","PriorityQueueHospital", pqh1.hospitalType());
		Assert.assertEquals("Hosptial Type Matches","PriorityQueueHospital", pqh2.hospitalType());
		
		Assert.assertEquals("[]", pqh1.allPatientInfo());
		Assert.assertEquals("[]", pqh2.allPatientInfo());
		
		Assert.assertEquals("A PriorityQueueHospital-type hospital with 0 patients.", pqh1.toString());
		Assert.assertEquals("A PriorityQueueHospital-type hospital with 0 patients.", pqh2.toString());
	}
}
