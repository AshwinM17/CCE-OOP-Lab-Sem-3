import java.util.Scanner;
class operation_bit
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the values of a and b");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("(a<<2)+(b>>2)="+(a<<2)+(b>>2));
		System.out.println("(b>0)="+(b>0));
		System.out.println("(a+b*100)/10="+(a+b*100)/10);
		System.out.println("a&b="+(a&b));

	}
}