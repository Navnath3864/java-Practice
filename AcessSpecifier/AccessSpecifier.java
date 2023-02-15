//package AcessSpecifier;

//import mypack.TestPackage;

//import java.security.PublicKey;
class Test
{
    public void m1()
    {
        System.out.println("Public class Public method m1()");
    }
   
}
public class AccessSpecifier {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Test obj = new Test(); 
        System.out.println(obj);
        obj= new Test();
        obj.m1();
    }
    
}