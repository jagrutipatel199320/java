package lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*float my_number = (float)4.5;
		System.out.println(my_number);*/
		//myFirstMethod();
		//sayHello("jagruti");
		//sayHello("uttam");
		//add(10,20);
		int sum = sum(10,20,30);
		System.out.println(sum);
		

	}
	public static void  sayHello(String name) {
		System.out.println("hi " + name);
	}
	public static int sum(int a, int b,int c) {		
		return(a+b+c);
	}
	public static void add(int a, int b) {		
		System.out.println(a+b);
	}
	
	/*public static void  myFirstMethod() {
		System.out.println("hi");
	}*/
	/*	String myString = "Hello World";
		int myLen = myString.length();
		String lowerCase = myString.toLowerCase();
		
		System.out.println(myString.indexOf('o'));
		//System.out.println(myString.replace('e', 'a'));
	//	System.out.println(lowerCase);
	*/	
		/*int[] my_array = {1,2,3,4,5};
		for(int index = 0;index < 5; index++) {
			System.out.println(my_array[index]);			
		}
		
		for (int element : my_array) {
			System.out.println(element);
		}*/
		
		
	/*	int[] my_array = {1,2,3,4,5};
		//System.out.println(my_array[2]);
		int index = 0;
		while(index < 5) {
			System.out.println(my_array[index]);
			index ++;
		}*/
		
		
	/*	int a = 0;
		
		while(a <= 10) {
			System.out.println(a);
			a++;			
		}
		
		System.out.println("---------------------");
		int b = 0;
		
		do {
			System.out.println(b);
			b++;
		}while(b <= 10);
		*/
		
		/*int score = 100;
		switch (score) {
		case 100:
		case 90:
			System.out.println("very good");
			break;
		case 80:
		case 60:
			System.out.println("good");
			break;
		case 40:
			System.out.println("ok");
			break;
		default :
			System.out.println("Grades are not defined");
			break;		
		}
		*/
		/*int x = 20;
		
		if(x == 10) {
			System.out.println("yes x == 10");
		}else {
			System.out.println("No x != 10");
		}*/
		
	/*	int x = 10;
		System.out.println(x);
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x);
		*/

		
		/*int x, y, answer ;
		x = 20;
		y = 30;
		answer = x + y;
		
		System.out.println("answer =" + answer);*/
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		
		int my_number = scan.nextInt();
		System.out.println("The entered number");
		System.out.print(my_number);*/

	

}
