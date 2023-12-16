import java.util.Scanner;
class Prime{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int start,last,i,j,flag=1;
        System.out.println("Enter the Starting number");
        start=in.nextInt();
        System.out.println("Enter the Ending number");
        last=in.nextInt();
        for(i=start;i<=last;i++)
            {
                for(j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                    {
                        flag=0;//tells divisible ie not prime
                    }
                }
                if (flag!=0)
                {
                    System.out.print(i+" ");
                }
               flag=1;
                
            }
    }
}