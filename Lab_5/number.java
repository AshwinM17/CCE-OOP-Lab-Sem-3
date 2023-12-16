import java .util.Scanner;
public class number {
    private double num;
    number(double n)
    {
        num=n;
    }
    boolean iszero()
    {
        return (num==0);
    }
    boolean ispositive()
    {
        return(num>0);
    }
    boolean isnegative()
    {
        return(num<0);
    }
    boolean isodd()
    {
        double cpy=num;
        if(isnegative())
        {
           cpy=num*(-1); 
        }
        return(cpy%2==1);
    }
    boolean iseven()
    {
        double cpy=num;
        if(isnegative())
        {
           cpy=num*(-1); 
        }
        return(cpy%2==0);
    }
    boolean isprime()
    {
        int i;
        boolean flag=true;
        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
                flag=false;
        }
        if(num<=0)
        {
            flag=false;
        }
        return flag;
    }
    boolean isarmstrong()
    {
        double cpy=num,b,n,sum=0;
		while((int)cpy>0)
		{
			b=(int)cpy%10;
			n=b*b*b;
			sum+=(int)n;
			cpy=cpy/10;
        }
        return (num==sum);
    }
}
class num_par
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double n;
        System.out.println("Enter the number:-");
        n=in.nextDouble();
        number obj=new number(n);
        System.out.println("Is zero? "+obj.iszero());
        System.out.println("Is positive? "+obj.ispositive());
        System.out.println("Is negative? "+obj.isnegative());
        System.out.println("Is odd? "+obj.isodd());
        System.out.println("Is even? "+obj.iseven());
        System.out.println("Is prime? "+obj.isprime());
        System.out.println("Is an Armstrong number? "+obj.isarmstrong());
    }
}
