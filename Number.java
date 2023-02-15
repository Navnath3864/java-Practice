import java.util.Scanner;
import javax.lang.model.element.Element;

class Number    
{
    private int num;
    //user Input
    void getData()
    {
        //double num;
        Scanner sc=new Scanner(System.in);

        System.out.println("\n\nEnter Number : ");
        num=(int) sc.nextDouble();
    }

    //Constructor
    Number()
    {
        this.num=num;
    }

    //Number is zero or not
    boolean isZero()
    {
        if(num==0)
            return true;
        else
            return false;
    }

    //Number is Positive or not
    boolean isPositive()
    {
        if(num>0)
            return true;
        else
            return false;
    }

    //Number is Negative or not
    boolean isNegative()
    {
        if(num<0)
            return true;
        else
            return false;
    }

    //Number is odd or not
    boolean isOdd()
    {
        if((num%2)!=0)
            return true;
        else
            return false;
    }

    //Number is Even or not
    boolean isEven()
    {
        if((num%2)==0)
            return true;
        else
            return false;
    }

    ////Number is Prime or not
    boolean isPrime()
    {
        int i=1,count=0;
        while(i<=num)
        {
            if(num%i==0)
                count++;
            i++;
        }
        if(count==2)
            return true;
        else
            return false;
    }

    //Number is Armstrong or not
    boolean isArmStrong()
    {
        double AmStrong=0;
        int digit,count=0,temp=(int)num;

        temp=(int)num;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        
        temp=(int)num;
        while(temp>0)
        {
            digit=temp%10;
            AmStrong=AmStrong+Math.pow(digit, count);
            temp=temp/10;
        }
        //System.out.println(AmStrong+" This is armstrong");

        if(num==AmStrong)
            return true;
        else
            return false;
    }

    //Logic for factorial
    double getFactorial()
    {
        if(num>32)
        {
            System.out.println("\nFactorial is Not perform \nBecause O/P size is large \n");
            return -1;
        }            
        
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    //Square root
    double getSqrt()
    {
        return Math.sqrt(num);
    }

    //Square
    double getSqr()
    {
        return num*num;
    }

    //Finding sum of Digit
    double sumDigit()
    {
        double last=0,sum=0;
        while(num>0)    //123
        {
            last=(int)num%10;
            sum=sum+last;
            num=num/10;        
        }
        return sum;
    }

    //Reverse Number
    double getReverse() //<------
    {
       
        int rev=0,last,temp;
        while(num>0)
        {
            temp=(int)num%10;
            rev=(rev*10)+temp;
            num=num/10;
        }
        System.out.println("Reverse = "+rev);  

        return rev;
    }

    //Finding Factors of number
    void ListFactors()
    {
        int tmp=num;
        int i;
        int arr[]=new int[tmp+1];
        for(i=1;i<=tmp;i++)
        {
            if(tmp%i==0)
                arr[i]=i;
            else
                arr[i]=-1;
        }
        System.out.println("\n--Factors are--");                
        for(i=1;i<=tmp;i++)
        {
            if(arr[i]!=-1)
                System.out.println("["+arr[i]+"]");                
        }
    }

    //Display number in binary
    void dispBinary()
    {
        System.out.println("\nBinary of : "+num+" -> "+Integer.toBinaryString(num));
    }


    //Display All operation we done
    void ResultDisplay()
    {
        if(isZero()==true)
            System.out.println((int)num+" Number is zero\n");
        else
            System.out.println((int)num+" Number is Non-zero\n");


        if(isPrime()==true)
            System.out.println((int)num+" Number is Prime\n");
        else
            System.out.println((int)num+" Number is Non-Prime\n");

        if(isArmStrong()==true)
            System.out.println((int)num+" Number is ArmStrong\n");
        else
            System.out.println((int)num+" Number is Non-ArmStrong\n");

        System.out.println("\nFactorial = "+(int)getFactorial());
        System.out.println("\nSquare root = "+getSqrt());
        System.out.println("\nSquare = "+(int)getSqr());
        System.out.println("\nSum of Digit = "+(int)sumDigit());

       // System.out.println("\n\nReverse = "+(int)getReverse());        
    }
}


public class As15Number 
{
    public static void main(String[] args) 
    {
        System.out.println("\n-------Start-------");

        Number n1=new Number();

        System.out.println("\n-->Operation<--\n1.zero\t2.Positive\t3.Negative\n4.Odd\t5.Even\t6.Prime\t7.Amstrong");
        System.out.println("\n8.Factorial\t9.SquareRoot\t10.Square\n11.SumOfDigit\t12.Reverse");
        n1.getData();
        n1.ResultDisplay();

        System.out.println("\n-->Reverse<--");
        n1.getData();
        n1.getReverse();
        System.out.println("\n-->1.Number of Factors<--");
        System.out.println("\n-->2.Num in Binary<--");
        n1.getData();
        n1.ListFactors();
        n1.dispBinary();

        System.out.println("\n--------End--------\n");
    }
}