//Nested class

public class Outer {
	private int data=99;
	class Inner{ //non static 
		String name="java";
		void msg(){
			System.out.println(data+""+name);
		}
	}
	public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner in=out.new Inner();//access nested class 
		in.msg();
	}
}