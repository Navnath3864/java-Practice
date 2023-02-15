public class StringDemo{

	public static void main(String[] args) {
		String name= "Sachin";
		name.concat("Tendulakr");
		System.out.println(name); //Immutable

		StringBuilder sb = new StringBuilder("Hello");
		sb.append("java");
		System.out.println(sb); // Mutable

		String Str="hello"+"java";
		System.out.println(str);

		System.out.println("Nav"+" rup");// hello java
	
		String s1 = new StringBuffer().append("Hello").append("java").toString();
		System.out.println(s1);
		
		String s1 = new StringBuilder().append("Hello").append("java").toString();
		System.out.println(s2);

		String s4 = 50+30+"Sachin"+40+60;
		System.out.println(s4); // 80sachin4060

	}

}