import org.junit.Test;
import Family.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Before;


public class FamilyTDD {
Family fam;
Person person;
	@Before
	public void setUp() {
	fam = new Family("male");
	}
	
	@Test
	public void testGender() {
		assertFalse(fam.isFemale("Vera"));
		assertTrue(fam.isMale("George"));
	}

	@Test
	public void testParents() {
		assertTrue(fam.setParentOf("Vera", "Frank"));
	}

	@Test 
	public void testChildren() {
	person = new Person("Vera");
	person.addChild(person);
	//assertTrue(fam.getChildren(null));
	}
}

