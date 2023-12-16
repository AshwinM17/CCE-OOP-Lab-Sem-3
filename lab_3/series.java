import java.util.Scanner;
import java.lang.Math;
class series
{
    public static void main(String args[])
    {
        int count=15;
        //case 1 sin(s)
        Scanner in=new Scanner(System.in);
        double x,sin=0,fac,facj;
        System.out.println("Enter the value of x:");
        x=in.nextDouble();
        int i,j;
        sin=x;
        for(i=1;i<count;i=i+2)
        {
            fac=1;
            facj=1;
            for(j=1;j<=(2*i+1);j++)
                fac=fac*j;
            for(j=1;j<=(2*i+3);j++)
                facj=facj*j;  
            sin=sin-(Math.pow(x,2*i+1)/fac)+(Math.pow(x,2*i+3)/facj);
        }
        System.out.println("Sin("+x+")="+sin);


        //case 2
        double sum=0,n;
        for(n=1;n<count;n++)
        {
            sum=sum+Math.pow(1/n,n);
        }
        System.out.println("Sum of the second series is: "+sum);   
    }
}