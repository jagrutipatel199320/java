package HashSet;
import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> name = new HashSet<String>();
		name.add("jagruti");
		name.add("ayushi");
		name.add("krishna");
		name.add("uttam");	
		

	Iterator<String> itr = name.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	}

}
