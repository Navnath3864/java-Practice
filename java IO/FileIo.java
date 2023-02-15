import java.io.*;
import java.util.Scanner;

public class FileIo{
 public static void main(String[] args) throws Exception {
	//Scanner sc=new Scanner(System.in);
	
  //	FileWriter fw = new FileWriter("FileIouserInput.txt");
  	FileReader fr = new FileReader("FileIouserInput.txt");
  	//	String str= "i am the best once again";
//  	fw.write(str);
  	int count;
  	while((count=fr.read())!=-1){
  		System.out.print((char)count);
  	}
  	
  //	fw.close();
  	fr.close();
	System.out.println("You write file successfully");
 
}
}