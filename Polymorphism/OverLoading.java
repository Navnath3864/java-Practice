class Arithematics{
    public void sum(int a)
    {
        System.out.println(a+a);
    }
    public void sum(double a)
    {
        System.out.println(a+a);
    }
    public void sum(double a, double b)
    {
        System.out.println(a+b);
    }
    public void sum(int a,int b)
    {
        System.out.println(a+b);
    }

}


public class OverLoading {
    public static void main(String args[])
    {
        Arithematics a = new Arithematics();
        a.sum(10);
        a.sum(10,20);
        a.sum(10,12.2);
        a.sum(11.1);
    }
}
