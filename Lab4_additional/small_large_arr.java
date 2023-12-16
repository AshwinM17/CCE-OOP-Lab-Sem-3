import java.util.Scanner;
class small_large_arr{
    public static void main(String[] args)
    {
        int n,i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n=in.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int small=arr[0],large=arr[0];
        for(i=0;i<n;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];
            }
            if (large<arr[i])
            {
                large=arr[i];
            }
        }
        System.out.println("Smallest number="+small);
        System.out.println("Largest number="+large);

    }
}