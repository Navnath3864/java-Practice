
import java.io.*;
public class RWCountLW{
    public static void main(String[] args) throws Exception {

        int line=0,words=0,ch=0,len=0;
        BufferedReader br= new BufferedReader(new FileReader("RWCountLW.java"));//read  data from the file
       String currline= br.readLine();//read lines by line of files
       while(currline!=null) {
           line++;
          String wrds[]= currline.split(" ");//split() is use to split words based on space and store in an array 
          
          words =words+wrds.length;//count the words or element
          for(String w:wrds){
              ch=ch+w.length();
                       }
              currline= br.readLine();
          }
          System.out.println("no of lines:  "+line);
          System.out.println("no of words:  "+words);
          System.out.println("no of character:  "+ch);
         
       }

        
    }