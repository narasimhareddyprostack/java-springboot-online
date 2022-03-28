import java.io.*;
public class Demo {

	public static void main(String[] args) {
		try {
			PrintWriter p = new PrintWriter("data.txt");
			p.println("Hello, GE");
		}
		catch(FileNotFoundException e) {
			System.out.print(e);
		}
		
	}

}
