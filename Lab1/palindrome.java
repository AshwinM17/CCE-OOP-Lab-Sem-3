import java.util.Scanner;
class palindrome
{
	public static void main(String args[])

{
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	int num;
	num=sc.nextInt();
	int rem,rev=0;
	rem=num;
	while(rem>0)
	{
		rev=(rev*10)+rem%10;
		rem/=10;
	}
	if(num==rev)
	{
	System.out.println(num+" is a palindrome");}
	else 
	{System.out.println(num+"is not a palindrome");}
	
}
}