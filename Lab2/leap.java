import java.util.Scanner;
class leap
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Year:");
		int year;
		year=in.nextInt();
		boolean istrue;
		if(year%4==0)
			{
			 if (year%100!=0)
				istrue=true;
			else if (year%400==0)
				istrue=true;
			else
				istrue=false;	
			}
		else
			istrue=false;
				
			
		if (istrue)
			System.out.println("This is a leap year");
		else
			System.out.println("THis is not a leap year");
	}
}