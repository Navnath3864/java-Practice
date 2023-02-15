//package Inheritance;
class Animal{
    void m1()
    {
        System.out.println("Animals");
    }
}

class Dog extends Animal{
    void m2()
    {
      //  super.m1();  //ouput : Animals
        System.out.println("Dog");
    }
}
/*________________________________________________________________________________ */
// Multilevel Inheritance
class Cat extends Dog{
    void m3()
    {
        System.out.println("Cat");
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.m1();
        d.m2();
        Cat c = new Cat();
        c.m1();
        c.m2();
        c.m3();
    }
}