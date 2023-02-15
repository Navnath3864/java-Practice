interface A{
    void m1();
}
interface B{
    void m1();
}
class test implements A,B{
    public void m1()
    {
        System.out.println("Hello Java");
    }
}

public class MultipleInheritanceEx {
    public static void main(String[] args) {
        test obj = new test();
        obj.m1();
    }
}
