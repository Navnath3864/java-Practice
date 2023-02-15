public class ArrayDemo{
/**
 * @param args
 */
public static void main(String[] args) {
	int arr[]=new int[10];
	for(int i=0;i<arr.length;i++){
//		arr[i]=Math.random();//error it return double

		arr[i]=(int)(Math.random()*100);//type Casting
	}
//	for(int i=0;i<arr.length;i++){
	//	System.out.println(arr[i]);
//	}
	int sum=0;
	for(int x : arr){
		System.out.println(x);
		sum+=x;
	}
	
	// Sum of all array element
		System.out.println("sum: "+sum);

	
}

}


