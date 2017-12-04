package threadDemo;

class MyClass extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getId()+ "value "+ i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myclass = new MyClass();
		myclass.start();
		
		MyClass myclass1 = new MyClass();
		myclass1.start();
				
	}

}
