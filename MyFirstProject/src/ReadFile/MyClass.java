package ReadFile;

import java.io.*;
public class MyClass {
	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			br =  new BufferedReader(new FileReader("D:\\projects\\java\\MyFirstProject\\Filename.txt"));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}