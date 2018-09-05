package Family;
import java.util.ArrayList;
import java.util.HashMap;

public class Person {
	private String name;
	private String childName;
	private Gender gender;
//	private Person parent;
	private String parentName;
//	private Person parentB;
	public boolean male;
	public boolean female;
	private ArrayList<String> maleNames = new ArrayList<>();
	private ArrayList<String> femaleNames = new ArrayList<>();
	
	private ArrayList<Person> parents = new ArrayList<Person>();
	private static ArrayList<Person> children = new ArrayList<Person>();
   
	public Person(String name, String gender)
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

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean nameExists(String name) {
		for (Person person : children) {
			if (name.equals(person.getChildren(name))){
				return true;
			}
		}
		return false;
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
	 public boolean male(String name) {
	    	return true;
	    }
	 public boolean female(String name) {
		 	return true;
	    } 
	//
	 
//	public void addChild(String name, Gender gender) {
//		Person newChild = new Person(name, gender);
//		family.put(newChild);
//		
//	}
	public boolean setParent(String childName, String parentName) {
		boolean pIsMale = isMale(parentName);
		boolean pIsFemale = isFemale(parentName);
		
		if (pIsMale == true) {
		childName.add
		//parent.addChild(this);
	}
	}
	public String[] getParent(String name) {
			return family.get(name).getParent();
		}
}
public void addParents(Person parents) {
	this.parents.add(parent);
}
public Person getParent() {
	return parent;
}
public void setParent(String name, Person parent) {
	if (parent.isMale(name)) {
	this.parent = parent;
	//parent.addChild(this);
}
}
public ArrayList<Person> getParents(String name) {
	return parents;
}

public ArrayList<Person> getChildren(String name) {
	return children;
}

public Person getChild(int a) {
	return children.get(a);
}

}
