//BufferReader

package exception;
 import java.io.*;

import br.readLine;
public class ExceptDemo{

public static void main(String[] args) throws IOException {
	// read name and age of person 

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the name");
	readLine name = new br.readLine(); //read a line of text

	System.out.println("Enter the age : ");
	int age = Integer.parseInt(br.readLine());

	System.out.println(name+" "+age);
}
}