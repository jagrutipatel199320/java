package createThreadInMainClass;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread (new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getId()+ "value "+ i);
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}// TODO Auto-generated method stub
				
			}
			
		});
		t1.start();

	}

} 
