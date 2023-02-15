import java.lang.Object;
class InheritanceDemo{
	private int eid;
	private String name;
	protected double basic;
	private static String org="C-Dac Hyd";

	protected void setEmpoyee(int eid,String name,double basic){
		this.eid=eid;
		this.name=name;
		this.basic=basic;
	}

	protected void getEmployee(){
		System.out.println(eid+" "+name+" "+basic+" "+org);
	}
}
	class TechEmployee extends InheritanceDemo{

	
	public static void main(String[] args) {
		TechEmployee e1= new TechEmployee();
		e1.setEmpoyee(111,"Navnath",1000);
		e1.getEmployee();
		
	}
}