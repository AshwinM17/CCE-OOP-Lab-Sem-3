import java.util.*;
class ArrayOverflowException extends Exception
{
    int a;
    ArrayOverflowException(int b)
    {
        a=b;
    }
    public String toString()
    {
        return "ArrayOverflowException:"+a+" is out of bound";
    }

}
public class Array_Exception {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[10];
        for(int k=0;k<arr.length;k++)
            arr[k]=k;
        System.out.println("Enter the index:");
        int i;
        try{
            i=in.nextInt();
            if(i<arr.length)
            {
                System.out.println("Value="+arr[i]);
            }
            else
            {
                throw new ArrayOverflowException(i);
            }
        }
        catch(ArrayOverflowException e)
        {
            System.out.println(e.toString());
        }
    }
}
