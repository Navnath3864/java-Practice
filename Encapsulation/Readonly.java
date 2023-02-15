//package Encapsulation;

class Readonlyex{
    private String name="Navnath";

    public String getName(){
        return name;
    }
}
public class Readonly {
    public static void main (String[] args)
    {
        Readonlyex obj = new Readonlyex();
        System.out.println(obj.getName());
        //obj.getName();
    }

}