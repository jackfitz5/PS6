package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import domain.PersonDomainModel;

public class Person_Test {
	private static PersonDomainModel per = new PersonDomainModel();
	private static UUID perUUID = UUID.randomUUID();
	private static  LocalDate date = LocalDate.of(1998, 11, 16);
	
	@BeforeClass
	
	public static void setUpBeforeClass() throws Exception {
		
	per = new PersonDomainModel();
	per.setFirstName("Jack");
	per.setLastName("Fitzpatrick");
	per.setBirthday(date);
	per.setCity("Ellicott City");
	per.setPostalCode(21043);
	per.setStreet("3308 Governor Howard Dr");
}

	@AfterClass
	
	public static void tearDownAfterClass() throws Exception {
					per = null;
	
	}

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
	
	}

	@Test
	public void GetTest() throws Exception
	{
		
		PersonDAL.addPerson(per);
		String FirstName = per.getLastName();
			assertEquals("Jack",FirstName);
	}
	
	@Test
	public void AddTest() throws Exception 
	{
		
		PersonDomainModel per=new PersonDomainModel();
		PersonDAL.addPerson(per);
		}

	@Test
	public void DeleteTest() throws Exception
	{
		PersonDAL.addPerson(per);
		PersonDAL.deletePerson(per.getPersonID());
	
	@Test
	public void UpdateTest() throws Exception
	{
		PersonDAL.addPerson(per);
		per.setLastName("Fitzpatrick");
		PersonDAL.updatePerson(per);
	    }
	


}
}
