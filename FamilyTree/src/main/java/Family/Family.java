package Family;
import java.util.*;

public class Family {
	
	private Map<String, Person> family;
	private String name;
	public boolean male;
	public boolean female;
	private Gender gender;
	
    public Family() {
        family = new HashMap<String, Person>();
        
    }
    
    public boolean newChildParent(String name) {
    	Person newCP = new Person(name);
    	newCP.setGender(gender);
    	family.put(name, newCP);
    	return true;
    }
    public Family(String gender)
	{
		if (gender == "male") {
			this.gender = Gender.MALE;
		}
		else if (gender == "female") {
		this.gender = Gender.FEMALE;
		}
		else {
		this.gender = Gender.UNKNOWN;
	}
	}
    public boolean isMale(String name) {
		if (gender == Gender.MALE) {
			return true;
		}
		return false;
	}

	public boolean isFemale(String name) {
		if (gender == Gender.FEMALE) {
			return true;
		}
		return false;
	}
	
	 private Person getPerson(String name) {
		return family.get(name);
	}
	public boolean male(String name) {
		 getPerson(name).setGender(Gender.MALE);
	    	return true;
	    }

	public boolean female(String name) {
		 	return true;
	    } 
    
	public boolean setParentOf (String childName, String parentName) {
		boolean isChildExist = false;
	    boolean isParentExist = false;

	    if (!isChildExist) {
		newChildParent(childName);
	    }
	    if (!isParentExist) {
		newChildParent (parentName);
	    }
		return false;
	}
    
	public ArrayList<Person> getParents(String name) {
		ArrayList<Person> parents = getPerson(name).getParents();
		return parents;
	}
	
	public ArrayList<Person> getChildren(String name){
		ArrayList<Person> children = getPerson(name).getChildren();
		return children;

	}
    
    
    
    
    

}
