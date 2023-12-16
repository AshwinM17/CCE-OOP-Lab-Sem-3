import java.util.Scanner;
class calculator
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		float num1,num2,ans=0;
		char operator;
		char contin;
		contin='y';
		do
		{
			System.out.println("Enter the 1st number,operator and then second number");
			num1=in.nextInt();
			operator= in.next().charAt(0);
			num2=in.nextInt();
			
			switch(operator)
			{
			case ('+'):
				{ans=num1+num2;
				System.out.println("Answer="+ans);
				System.out.println("Another?(y/n)");
				contin= in.next().charAt(0);
				break;
				}
			case ('-'):
				{ans=num1-num2;
				System.out.println("Answer="+ans);
				System.out.println("Another?(y/n)");
				contin= in.next().charAt(0);
				break;}
			case ('*'):
				{ans=num1*num2;
				System.out.println("Answer="+ans);
				System.out.println("Another?(y/n)");
				contin= in.next().charAt(0);
				break;}
			case ('/'):
				{ans=num1/num2;
				System.out.println("Answer="+ans);
				System.out.println("Another?(y/n)");
				contin= in.next().charAt(0);
				break;}
			}

		}while(contin=='y');

		}
}	