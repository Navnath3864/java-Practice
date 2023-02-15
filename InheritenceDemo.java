public class InheritenceDemo{
int age=23;
String name="Navnath";

class Student extends InheritenceDemo{
void studentDetail(){
	int marks=80;
}
}
public static void main(String[] args) {
	Student s1=new Student();
	
	System.out.println(s1.marks);
	System.out.println(s1.age);
	System.out.println(s1.name);
}

}