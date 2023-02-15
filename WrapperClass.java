public class WrapperClass{
	public static void main(String[] args) {
		int x= 10;
		char c='a';
		Integer y=x;  //auto boxing
		System.out.println(y.doubleValue());

		//System.out.println(x.doubleValue());

		double a=x;  //auto boxing
		System.out.println(a);

		float b=x;  //auto boxing
		System.out.println(b);

		int  ch=c;  //auto boxing
		System.out.println(ch);

		
	}
}