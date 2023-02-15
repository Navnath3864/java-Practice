//Enumeration(enum)

enum Day{
	SUN,MON,TUE,WEN,THUS,FRI,SAT;
}
public class EnumDemo{
	public static void main(String args[]){
	Day[] d=Day.values();
	for(Day d1:d)
	System.out.println(d1);
	}
}