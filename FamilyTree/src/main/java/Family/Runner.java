package Family;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

 		 Person p1 = new Person("male");
 		 p1.setName("Dean");
 		 p1.setParentA(p1);
 		 p1.setParentB(p1);
		 System.out.println(p1);
	 }

}