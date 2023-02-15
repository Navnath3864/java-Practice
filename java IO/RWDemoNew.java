import java.io.*;

public class RWDemoNew{
    public static void main(String[] args) throws Exception {
        
     FileReader fr=new FileReader("RWDemo.java");
     FileWriter fw=new FileWriter("rw.txt");
     

    /* while( (i=fr.read())!=-1){
        if
         fw.write(i); //
         System.out.print((char)i); // print()
     }  */
    
     String str="\n\n*******************************";
     fw.write(str);
     System.out.println("\n File written successfully");
     fr.close();
     fw.close();
    
     
    }
}