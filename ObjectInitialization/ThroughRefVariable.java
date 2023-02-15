//package ObjectInitialization;

class Student {
    int num;
    String name;
   // System.out.println(name+" "+num);
   // System.out.println();
}
public class ThroughRefVariable{
public static void main(String[] args) {
    Student obj = new Student();
        obj.name="Navnath";
        obj.num=9;
        System.out.println(obj.name+" "+obj.num);
        System.out.println("\n");
        
    }
}
