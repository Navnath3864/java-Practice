package exception;
import java.util.Scanner;
class ExceptionDemo{
	public static void main(String[] args) {
		
	
	try (Scanner in = new Scanner(System.in)) {
		System.out.println("Enter the number");
		int number = in.nextInt();

		System.out.println("Enter the number");
		int y = in.nextInt();

		System.out.println("result: "+ number/y);
		System.out.println("SQRT of : "+number+" is: "+Math.sqrt(number));
		System.out.printf("SQRT of : "+number+" is: %.2f"+Math.sqrt(number));
	}
}
}