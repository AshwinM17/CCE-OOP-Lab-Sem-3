import java.util.Scanner;
import java.lang.Math;
public class armstrong_num {
    public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double b,n,num,sum=0,cpy;
        System.out.println("Enter the number");
		num=in.nextDouble();
		cpy=num;
		while((int)cpy>0)
		{
			b=(int)cpy%10; //converted to int and then back to double to remove the decimal
			n=Math.pow(b,3);	//Math.pow requires 2 Double data types as parameter
			sum+=n;
			cpy=cpy/10;
                }
		if(sum==num)
		System.out.println("It is an armsrtong Number");
                else
                    System.out.println("It is not an armstrong Number");   
	}
}
