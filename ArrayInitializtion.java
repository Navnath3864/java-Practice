public class ArrayInitializtion{
	public static void main(String[] args) {
	 	String[] lang={"java","c","JAvaScript","c#","xml","sql","HTML"};
	 		
	 		for(String x : lang) // for each used
			System.out.println(x);

			System.out.println("Sorted order");
	 		java.util.Array.sort(lang);
	 		for(String x : lang) // for each used
			System.out.println(x);
	}

}