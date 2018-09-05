import org.junit.Test;

import Family.Family;
import Family.Gender;
import Family.Person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;


public class FamilyTDD {
Person person;
Family family;

	@Before
	public void setUp() {
	person = new Person("George","male");
	}
	
	@Test
	public void testGender() {
		assertFalse(person.isFemale("Vera"));
		assertTrue(person.isMale("George"));
	}

	@Test
	public void testParents() {
		person = new Person("Vera", "female");
		person.setParentOf("Vera", "Frank");
		assertEquals("Frank", person.getParentsOf("Frank"));
	}

//	@Test 
//	public void testChildren() {
//		
//	}
}

