package Family;
import java.util.ArrayList;

public class Person {
	private String name;
	private Gender gender;
	private ArrayList<Person> parents = new ArrayList<Person>();
	private static ArrayList<Person> children = new ArrayList<Person>();
   
	public Person(String name)
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void addParent(Person parent) {
		this.parents.add(parent);
	}
	public ArrayList<Person> getParents() {
		return parents;
	}

	public void setParents(ArrayList<Person> parents) {
		this.parents = parents;
	}

	public void addChild(Person child) {
		this.children.add(child);
	}
	public ArrayList<Person> getChildren() {
		return children;
	}

	public static void setChildren(ArrayList<Person> children) {
		Person.children = children;
	}
	
	
	
	
	
	
	
	}