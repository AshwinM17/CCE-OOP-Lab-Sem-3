import java.util.Scanner;
class value_search
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,1,2,1,5,6,7};
        int key,cnt=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter what is to be searched");
        key=in.nextInt();
        System.out.print("The value is found at locations:");
        for(int i:arr)
        {
            if(i==key)
            {
                System.out.print("arr["+cnt+"] ");
            }
            cnt++;
        }

    }
}