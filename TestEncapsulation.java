// Java program to demonstrate encapsulation
class Employee {
	// private variables declared
	// these can only be accessed by
	// public methods of class
	private String name;
	private int empid;
	private int age;
	private int salary;

	// get method for age to access
	// private variable Age
	public int getAge(){
	 	return age;
	}

	// get method for name to access
	// private variable geekName
	public String getName(){
	 return name; 
	}

	// get method for roll to access
	// private variable geekRoll
	public int getEmpid(){
		return empid;
	}
	public int getSalary(){
		return salary;
	}

	// set method for age to access
	// private variable geekage
	public void setAge(int newage){
		age = newage;
	}

	// set method for name to access
	// private variable geekName
	public void setName(String newname)
	{
		name = newname;
	}

	// set method for roll to access
	// private variable geekRoll
	public void setEmpid(int newempid){
	empid = newempid;
	}
	public void setSalary(int newsalary){
	salary = newsalary;
	}
	
}

public class TestEncapsulation {
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();

		// setting values of the variables
		obj.setName("Navnath");
		obj.setAge(22);
		obj.setEmpid(9009);
		obj.setSalary(1000);

		// Displaying values of the variables
		System.out.println("Geek's name: " + obj.getName());
		System.out.println("Geek's age: " + obj.getAge());
		System.out.println("Geek's roll: " + obj.getEmpid());
		System.out.println("Geek's roll: " + obj.getSalary());

		// Direct access of geekRoll is not possible
		// due to encapsulation
		// System.out.println("Geek's roll: " +
		// obj.geekName);
	}
}
