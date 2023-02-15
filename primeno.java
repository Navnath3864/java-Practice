import java.util.Scanner;
public class primeno
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number \n");
        int num=sc.nextInt();

        if (num==0 || num==1)
        {
            System.out.println("the given no is not prime no \n");
        }
        else
        {
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    System.out.println("the given no is not prime no \n");
                    count=1;
                    break;
                }
                
            }
            if (count==0)
                System.out.println("the given no is prime no \n");
        }
        
    }
}