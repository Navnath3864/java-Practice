import java.util.Scanner;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String \n");
        String str = sc.nextLine();
        
        String rev="";
        char ch;
        for(int i=0; i<str.length();i++)
        {
            ch= str.charAt(i);
            rev=ch+rev;
        }

        System.out.println(rev);
    }  
}

