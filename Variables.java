public class Variables{
public static void main(String[] args){

byte b=100;
//b=b+20;		//this give an error because 20 is an int value
b=(byte)(b+20); // to solve this problem we use type casting
System.out.println(b);

}
}