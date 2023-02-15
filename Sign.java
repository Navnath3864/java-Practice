import java.util.Scanner;
public class Sign
{
public static void main(String[]args)
{
	int day,month;
	String sign=" ";
	Scanner sc=new Scanner (System.in);

   System.out.println("Enter month: ");
   month=sc.nextInt();

   System.out.println("Enter day: ");
   day=sc.nextInt();

String monthString;
        switch (month) {
            case 1:  monthString = "January";      
            		 break;
            case 2:  monthString = "February";      
            		break;
            case 3:  monthString = "March";         
            		break;
            case 4:  monthString = "April";        
            		 break;
            case 5:  monthString = "May";          
            		 break;
            case 6:  monthString = "June";         
            		 break;
            case 7:  monthString = "July";          
            		break;
            case 8:  monthString = "August";        
            		break;
            case 9:  monthString = "September";    
            		 break;
            case 10: monthString = "October";       
            		break;
            case 11: monthString = "November";      
            		break;
            case 12: monthString = "December";     
            		break;
            default: monthString = "Invalid month"; 
            		break;
        }


	if (month==12 && day>=22 && day<=31 || month==1 && day<=19 && day>0)
		 sign= "capricorn";
		else if(month==1 && day>=20 && day<=31 || month==2 && day<=18 && day>0)
			sign= "Aquarius";
		else if(month==2 && day>=19 && day<=29 || month==3 && day<=20 && day>0)
			sign= "Pisces";
		else if(month==3 && day>=21 && day<=31 || month==4 && day<=19 && day>0)
			sign= "Aries";
		else if(month==4 && day>=20 && day<=30 || month==5 && day<=20 && day>0)
			sign= "Taurus";
		else if(month==5 && day>=21 && day<=31 || month==6 && day<=20 && day>0)
			sign= "Gemini";
		else if(month==6 && day>=21 && day<=30 || month==7 && day<=22 && day>0)
			sign= "cancer";
		else if(month==7 && day>=23 && day<=31 || month==8 && day<=22 && day>0)
			sign= "leo";
		else if(month==8 && day>=23 && day<=31 || month==9 && day<=22 && day>0)
			sign= "Virgo";
		else if(month==9 && day>=23 && day<=30 || month==10 && day<=22 && day>0)
			sign= "Libro";
		else if(month==10 && day>=23 && day<=31 || month==11 && day<=21 && day>0)
			sign= "Scorpio";
		else if(month==11 && day>=22 && day<=30 || month==12&& day<=21 && day>0)
			sign= "Sagittarius";

System.out.println("The Zodiac sign for " + monthString + " " + day + " is " +sign);
}
}