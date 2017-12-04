package RecursionJava;

public class MyClass {
	
	// N! = N x (N-1) x (N-2) X.......X 2 X 1
	
	public static int factorial (int N) { 
		if(N <=1)
			return 1;
		else return (N*factorial(N-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

}
