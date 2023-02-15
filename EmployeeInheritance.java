
class EmployeeInheritance{
    private int eid;
    private String name;
    protected double basic;
  private static String org="C-DAC Hyd"; 
  protected void setEmployee(int eid, String name,double basic){
      this.eid=eid;
      this.name=name;
      this.basic=basic;
  }
  protected void getEmployee(){
      System.out.println(eid+ " "+ name+" "+basic+" "+org);
  }
}
public class TechEmployee extends EmployeeInheritance{
// all non private members are avaiable here
// basic, setter, getter
public static void main(String[] args) {
TechEmployee e1=new TechEmployee(); //   public TechEmployee(){ super(); }  
e1.setEmployee(111,"ABC",82600);
e1.getEmployee();
}
} 