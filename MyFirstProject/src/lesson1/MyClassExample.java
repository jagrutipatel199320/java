package lesson1;

public class MyClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student jagruti = new Student();
		
		/*jagruti.id = 1;
		jagruti.name = "jagruti";
		jagruti.age = 24;*/
		
		jagruti.setId(1);
		jagruti.setName("jagruti");
		jagruti.setAge(24);
		
		System.out.println(jagruti.getName() + " is " + jagruti.getAge() + " years old");
	}

}
