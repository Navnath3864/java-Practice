import java.util.*;
import java.util.Iterator;
public class ListDemo1{

    public static void main(String[] args) {
        
        
        LinkedList <String> ll=new LinkedList <String> ();
        ll.add("Hyd");
        ll.add("Blr");
        ll.add("Del");
        ll.add("Pune");
        ll.add("Mum");
        //ll.add(111);
        System.out.println(ll);
        Collections.reverse(ll); // Collections - 
                          
        Iterator itr=ll.iterator(); // Iterator - itr - al.iterator() - cursor - Universal Cursor
        while(itr.hasNext()){// as long as there exists an object - al
                System.out.println(itr.next());
        } 
        System.out.println("***************************");
        Collections.sort(ll);
        ListIterator litr=ll.listIterator();
        while(litr.hasNext())
            System.out.println(litr.next());
        System.out.println("\n"+litr.previous()); // last element
    }
}