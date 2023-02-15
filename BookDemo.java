import java.util.Scanner; // to read data from KB - Scanner
public class BookDemo{
String title; 
int pages;
String publisher;
//setter or mutator is replaced with constructor
    BookDemo(){ // default cons - 
    Scanner in=new Scanner(System.in); // creating Scanner object
    System.out.println("Enter title of the Book");
    title=in.nextLine();
    
    System.out.println("Enter publisher the Book");
    publisher=in.nextLine();
    System.out.println("Enter no. of pages of Book");
    pages=in.nextInt();
}
//getter or accessor 
void getBook(){
System.out.println(title+"\n"+pages+"\n"+publisher);
}
public static void main(String[] args) {
    
    BookDemo b1=new BookDemo(); // Book() - default constructor - no arguments
    b1.getBook();
    BookDemo b2=new BookDemo(); // Book() - 
    b2.getBook();
}
}