import java.util.Scanner;
class table{
	public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int num,x;
	System.out.print("Enter the number:");
	num=in.nextInt();
	for(x=1;x<=10;x++)
	{
	System.out.println(num+" X "+x+"="+x*num);
	}
}
	
}