import java.io.*;
public class RWDemo{
    public static void main(String[] args) throws Exception {
        
     FileReader fr=new FileReader("RWDemo.java");
     FileWriter fw=new FileWriter("rw.txt");
     int i;
     while( (i=fr.read())!=-1){
         fw.write(i); //
         System.out.print((char)i); // print()
     }
    
     String str="\n\n***********";
     fw.write(str);
     System.out.println("\n File written successfully");
     fr.close();
     fw.close();
    }
}