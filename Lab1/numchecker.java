import java.util.Scanner;
class numchecker
{
	public static void main(String args[])
	{
		int numarr[]=new int[10];
		int x;
		Scanner in = new Scanner(System.in);
		for(x=0;x<10;x++)
		{
			System.out.println("enter the "+(x+1)+" number");
			numarr[x]= in.nextInt();
		}
		int pos=0,neg=0,zero=0;
		for(x=0;x<10;x++)
		{
			if (numarr[x]>0)
			{
			pos++;}
			else if (numarr[x]<0)
			{neg++;}
			else 
			{zero++;}
		}
	System.out.println("number of positives= "+pos);
	System.out.println("number of negatives= "+neg);
	System.out.println("number of zeroes= "+zero);
	}
}