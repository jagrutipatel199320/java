package inheritance;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Triangle tri = new Triangle();
		
		rect.setvalues(10, 10);
		tri.setvalues(10, 10);
		
		System.out.println(rect.area());
		System.out.println(tri.area());

		
	}

}
