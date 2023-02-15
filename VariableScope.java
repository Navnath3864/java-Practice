public class VariableScope{
	int sum=0;
	String name="C-DAC";
	class Sub{
		String  city ="pune";
	}

	void add(int c,int d){
		 sum=c+d;
		System.out.println(sum);
		System.out.println(name);
		System.out.println(city);
	}

	public static void main(String[] args) {
		VariableScope obj=new VariableScope();
		obj.add(5,5);
		//System.out.println(city); //non-static member not accessed in static method 
	}
}