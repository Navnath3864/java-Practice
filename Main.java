//Satic operation return values
public class Main
{
   // int a;
   static int a;
    public Main(){
        a++;
        System.out.println(a);
    }
	public static void main(String[] args) {
	    Main a1= new Main();	//instance variable int a=1  // static variable =1
	    Main a2= new Main();   //instance variable int a=1  //static variable=2
	    Main a3= new Main()	//instance variable int a=1 // static variabl =3
	 }
}
