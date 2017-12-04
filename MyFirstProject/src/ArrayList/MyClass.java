package ArrayList;
import java.util.ArrayList;
public class MyClass {
	public static void main(String[] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>(5);
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		mylist.add(5);
		mylist.add(6);
		
		for(Integer x : mylist)
			System.out.println(x);

		System.out.println("size "+mylist.size());
		System.out.println("=========================");

		mylist.remove(2);
		for(Integer x : mylist)
			System.out.println(x);

		System.out.println("size "+mylist.size());
		
		System.out.println("=========================");
		mylist.clear();
		System.out.println("size "+mylist.size());

		System.out.println("=========================");

		mylist.set(0,100);
		for(Integer x : mylist)
			System.out.println(x);

		System.out.println("size "+mylist.size());
		

	}
}