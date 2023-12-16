import java.util.Scanner;
class largest_tern
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a,b,c,max;
		System.out.println("Enter the values of 1st number");
		a=in.nextInt();
		System.out.println("Enter the values of 2nd number");
		b=in.nextInt();
		System.out.println("Enter the values of 3rd number");
		c=in.nextInt();
		max=(a>=b)?((a>=c)?a:c):((b>=c)?b:c);
		System.out.println("Largest number="+max);
	}
}