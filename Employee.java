

// Static method and Blocks
public class Employee{
    private int eid;
    private String name;
    double basic;
    private static String org="C-DAC Hyd"; // static or class variable
    private static String country; //
    static{  // static block
     // used to initilaize static members 
        System.out.println("This is static block!");
        country="India";
        org="MHA";
    }
      
      public Employee(int eid, String name,double basic){
          this.eid=eid;
          this.name=name;
          this.basic=basic;
      }
      static void changeOrg(){ // static method
    org="C-DAC"; // static org can be accessed here 
      }
      void getEmployee(){
          System.out.println(eid+ " "+ name+" "+basic+" "+org+" "+country);
      }
      public static void main(String[] args) {
          Employee e1=new Employee(111,"ABC",82000);
          e1.getEmployee();
        
        changeOrg(); // calling static method -- Employee.changeOrg()
          Employee e2=new Employee(101,"XYZ",72000);
          e2.getEmployee();
      }
}