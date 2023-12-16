import java.util.Scanner;
class operations
{
	public static void main(String args[])
	{
		System.out.println("Which Case do you want to see?");
		Scanner in = new Scanner(System.in);
		int caseno;
		caseno=in.nextInt();
		switch(caseno){
		case 1:{
		int x =10;
 		double y=x;
		System.out.println(y);
		break;}
		
		
		/*
		case 2:{
			double x = 10.5;
			int y=x;          //Gives error
			System.out.println(y);
			break;
		}
		*/

		case 3:{
		double x=10.5;
		int y = (int) x;
		System.out.println(y);
		break;}
		}

	}
}