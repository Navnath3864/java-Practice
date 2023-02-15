import java.io.*;
public class RWDemoNewPro{
    public static void main(String[] args) throws Exception {      
     FileReader reader=new FileReader("RWDemoNewPro.java");
     BufferedReader br = new BufferedReader(reader);
    // StringBuffer sb = new StringBuffer();
     //Console cnsl = System.console();
   //  FileWriter fw=new FileWriter("newfile.txt");

        int charCount = 0;
         
        int wordCount = 0;
         
        int lineCount = 0;
         
        try
        { 
            String currentLine = br.readLine();
                while (currentLine != null)
            {
                //Updating the lineCount
                 
                lineCount++;
                 
                //Getting number of words in currentLine
                 
                 String[] words = currentLine.split(" ");
                 
                //Updating the wordCount
                 
                wordCount = wordCount + words.length;
                 
                //Iterating each word
                 
                for (String word : words)
                {
                    //Updating the charCount
                     
                    charCount = charCount + word.length();
                }
                 
                //Reading next line into currentLine
                 
                currentLine = br.readLine();
            }
             
            //Printing charCount, wordCount and lineCount
             
            System.out.println("Number Of Chars In A File : "+charCount);
             
            System.out.println("Number Of Words In A File : "+wordCount);
             
            System.out.println("Number Of Lines In A File : "+lineCount);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }


 }
}