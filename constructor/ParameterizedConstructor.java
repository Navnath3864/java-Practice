class Vehicle
{
    String vehicleName;

    Vehicle(String name)
    {
        vehicleName=name;   
        System.out.println("this is "+vehicleName);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("car");

        System.out.println(v.vehicleName);
    }
}
