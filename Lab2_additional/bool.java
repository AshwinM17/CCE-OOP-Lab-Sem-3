import java.util.Scanner;
class bool
{
	public static void main(String args[])
	{
		System.out.println("Which Case dow you want to see?");
		Scanner in = new Scanner(System.in);
		int caseno;
		caseno=in.nextInt();
		switch(caseno){
		case 1:{
		boolean x =true;
 		int y=x;
		System.out.println("y="+y+",x="+x);   //Gives error
		break;
	}
		
		case 2:{
		boolean x =true;
		int y=(int)x;          //Gives error
		System.out.println("y="+y+",x="+x);
		break;}
		
		}

	}
}