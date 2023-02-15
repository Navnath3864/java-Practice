public class Wrapper{
	public static void main(String[] args) {
		int x= 10;

		Integer y=x;  //auto boxing
		System.out.println(y.doubleValue());

		//System.out.println(x.doubleValue());

		double a=x;  //auto boxing
		System.out.println(a);

		float b=x;  //auto boxing
		System.out.println(b);

		
	}
}