interface InterfaceEx{
    void m1();
}
class stud implements InterfaceEx{
    public void m1()
    {
        System.out.println("this is method  m1()");
    }
}
public class InterfaceExample{
    public static void main(String[] args){
        stud s = new stud();
        s.m1();
    }
}