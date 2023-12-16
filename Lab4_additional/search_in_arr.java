import java.util.Scanner;
class search_in_arr{
    public static void main(String[] args)
    {
        int n,i,searchkey;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n=in.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Element to be Searched:-");
        searchkey=in.nextInt();
        int counter=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==searchkey)
            {
                counter++;
            }
        }
        System.out.println("Number of times the "+searchkey+" occured in the array is:"+counter);
    }
}