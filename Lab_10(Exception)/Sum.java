import java.util.*;
class floatnum extends Exception
{
    float input;
    floatnum(float num)
    {
        input=num;
    }
    public String toString()
    {
        return "Error:"+input+" is a Floating point number";
    }
}
class Input_Exception
{
    public static void main(String[] args) {
        int n,sum=0;
        float input=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers one at a time,enter -1 to calculate the sum");
        while(true)
        {
            try
            {
                input=in.nextFloat();
                if(input == -1)
                {
                    System.out.println("Sum="+sum);
                    break;
                }
                else if(input%1!=0)
                {
                    throw new floatnum(input);
                }
                else
                {
                    sum=sum+(int)(input);
                }
            }
            catch(floatnum e)
            {
                System.out.println(e.toString());
            }
        }
    }
}