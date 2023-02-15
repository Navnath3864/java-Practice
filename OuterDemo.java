public class OuterDemo{
	//int a=10;
	

	class InnerDemo{
		String name= "Navnath";
		void method(){
			int b=10;
		System.out.println(b+" "+name+" "+a);
	}
	}
	public static void main(String[] args) {
		OuterDemo d1= new OuterDemo();
	//	d1.a;
	//	System.out.println(a);
		OuterDemo.InnerDemo in = d1.new InnerDemo();
		in.method();
	//	System.out.println(in.b);
	}
	
}