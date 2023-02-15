class Person{
    protected String name;
    protected int Age;
    protected String bloodGroup;
    public Person(String name,int Age,String bloodGroup){
        this.name=name;
        this.Age=Age;
        this.bloodGroup=bloodGroup;
    }
    void finalize(){
        System.out.println(" person name is :"+this.name);
        System.out.println(" person Age is :"+this.Age);
        System.out.println(" person bloodGroup is :"+this.bloodGroup);
    }
}
 public class Employee1 extends Person{
     
     
  //all non private member are available here
  private int eid;
  protected double Basic;
  private static String orgs=" C-DAC-DASSD_HYDRABAD";
  //@Overload
  public Employee1(String name,int Age,String bloodGroup,int eid,double Basic){
    
    super.name=name;
    super.Age=Age;
    super.bloodGroup=bloodGroup;
    this.eid=eid;
    this.Basic=Basic;
}
 @Override

void finalize(){
    super.Person(name, Age, bloodGroup);
    System.out.println(" Employee name is :"+super.name);
        System.out.println(" employee Age is :"+super.Age);
        System.out.println(" Employee bloodGroup is :"+super.bloodGroup);
    System.out.println(" Employee Id is : "+this.eid);
    System.out.println(" Employee Basic is :"+this.Basic);
    System.out.println(" Employee organisation is :"+orgs);
   
}

public static void main(String[]args) {
     Employee1 e=new Employee1("Navnath",23,"B_negative",9009,420000);//child 
     Person p=new Person();
     
    e.finalize();
    e.finalize();
    
}}