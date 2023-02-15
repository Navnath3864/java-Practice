class Bike
{
    Bike(){
    System.out.println("bike is created \n");   
    }
}
public class DefaultConstructor
{
    public static void main(String[] args) {
        Bike obj=new Bike();// <-- Bike() is default constructor
        System.out.println(obj);
    }
}