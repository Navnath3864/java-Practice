public class MethodDemo{

	public static int sum(int x,int y){
		int sum1=0;
		for(int i=1;i<=10;i++)
			sum1=sum1+i;
		return sum1;

	}

	public static void main(String[] args) {
		
	//	sum(1,10);
	//	sum(50,100);
		System.out.println(sum(1,10));
	}
}