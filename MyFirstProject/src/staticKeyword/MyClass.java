package staticKeyword;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Student jagruti = new Student();
		 System.out.println(jagruti.getNoOfStudenta());
		 Student uttam = new Student();
		 System.out.println(uttam.getNoOfStudenta());

		 
		 System.out.println(Student.getNoOfStudenta());

		 
		 
/*	//static member belong to class instead of instance hence we can call static method directly by class name itself
		Hello hello = new Hello();
		hello.age = 10;
		System.out.println(Hello.age);

		//Hello.DoSomething("Hi static");
		//hello.DoSomethingElse("Hi");
		
		Hello hello1 = new Hello();
		hello1.age = 20;
		System.out.println(Hello.age);
*/
		

	}

}