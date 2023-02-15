import java.io.*;
import java.util.Scanner;
class BReader {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new FileReader("BReader.java"));
		String line=br.readLine();

		while(line!=null){
		System.out.println(line);
		line=br.readLine();	
		}
		br.close();
	}

}