//package Polymorphism;

class A
{
  void m1()
  {
    System.out.println("A-m1()");
  }
}
class B extends A
{
    @Override
    void m1()
    {
      System.out.println("B-m1()");
    }
    void m2()
    {
      System.out.println("B-m2()");
    }
}

public class Overriding {
    public static void main(String[] args) {
        A obj = new A();
        obj.m1();
        A obj2=new B();
        obj2.m1();

        System.out.println("******************************");
        B b = new B();
        b.m1();
        b.m2();
    }
}
