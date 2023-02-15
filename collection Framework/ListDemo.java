import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ListDemo{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("java");
		a1.add(true);
		a1.add(null);
		a1.add(10); // duplicate elements are allowed
		System.out.println(a1);

		// we can also use for each loop

		for(Object o:a1)
			System.out.println(o);
			System.out.println("*************************");

			Collections.sort(a1); // sort is static method of class Collections


			Iterator itr =a1.iterator(); // Iterator -itr- a1.Iterator() using cursur - unversal curser

			while(itr.hasNext()){   // as long as exists an object a1
				System.out.println(itr.next());
				//System.out.println(itr.remove()); //remove an elements

			}
	}
}