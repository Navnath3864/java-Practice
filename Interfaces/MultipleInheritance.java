interface A
{
    void m1();
}
interface B
{
    void m2();   
}

class C implements A,B{
   public void m1()
    {
        System.out.println("this is method m1() of class A");
    }
    public void m2()
    {
        System.out.println("this is method m1() of class B");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
    C obj = new C();
    obj.m1();
    obj.m2();        
    }
}
