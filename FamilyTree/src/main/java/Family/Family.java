package Family;
import java.util.*;

class Family {
	
	private static Map<String, Person> family;
	private String name;
	public boolean male;
	public boolean female;
	private Gender gender;
	
    public Family() {
        family = new HashMap<String, Person>();
        
    }
    
    private static boolean addName(String name, String gender) {
    	family.put(name, gender);
		return addName(name, gender);
	}         
    
    public boolean male(String name) {
    	//addName(name, Gender.MALE);
    	return true;
    }
	public boolean female(String name) {
    	//addName(name, Gender.FEMALE);
    	return true;
    }

    
    
    
    
    
    
    
    
}