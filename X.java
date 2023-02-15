public  class X{

	//String name; 	//Defaoult value is null
	// to avoid compile time error variable declare as static so
	static  String name;
	int a;
	String str;
	char b;
	float c;
	boolean d;

	public static void main(String[] args) {
		X obj = new X();
		System.out.println(obj.name);	// non-static variable cannot access normal variable
		System.out.println(obj.a);
		System.out.println(obj.str);
		System.out.println(obj.b);							//this statement give compile time error
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}