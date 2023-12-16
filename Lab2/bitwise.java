import java.util.Scanner;
class bitwise
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter the number:");
		int num;
		num=in.nextInt();
		System.out.println(num+" divided by 2="+(num>>1));
		System.out.println(num+" multiplied by 2="+(num<<1));
	}
}