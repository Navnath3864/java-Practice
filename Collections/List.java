
import java.util.Collections;
import java.util.ArrayList;

public  class List {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(5);
        a.add(30);

        for(Object o : a)
        {
         System.out.println(o); 
         Collections.sort(a);  
        }
    }
    
}
