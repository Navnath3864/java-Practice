import java.util.Scanner;

public class ScannerDemo{
	String title;
	int pages;
	String publisher;

	void setBook(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enthe the name of book");
		title=in.nextLine();
		System.out.println("Enthe number of pages");
		pages=in.nextInt();
		System.out.println("Enthe the name of publisher");
		publisher=in.nextLine();

	}
	void getBook(){
		System.out.println(title+" "+pages+" "+publisher);
	
	}

	 public static void main(String[] args) {
	
	ScannerDemo obj = new ScannerDemo();
	obj.setBook();
	obj.getBook();

	 }

}