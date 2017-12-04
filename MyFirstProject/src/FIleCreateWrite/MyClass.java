package FIleCreateWrite;

import java.io.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	
		File file = new File("Finename.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		PrintWriter pw = new PrintWriter(file);
		pw.println("This is my file content");
		pw.println(1000);
		pw.close();
		System.out.println("done");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
