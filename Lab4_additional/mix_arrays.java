import java.util.Scanner;
class mix_arrays{
    public static void main(String[] args)
    {
        int n1,i,n2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the 1st array");
        n1=in.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter the elements:-");
        for(i=0;i<n1;i++)
        {
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the number of elements in the 2nd array");
        n2=in.nextInt();
        System.out.println("Enter the elements:-");
        int arr2[]=new int[n2];
        for(i=0;i<n2;i++)
        {
            arr2[i]=in.nextInt();
        }
        int arr3[]=new int[n1+n2];
        for(i=0;i<n1;i++)
        {
            arr3[i]=arr1[i];
        }
        for(i=0;i<n2;i++)
        {
            arr3[n1+i]=arr2[i];
        }
        int n3=n1+n2,j;
        for(i=0;i<n3-1;i++)
        {
            for(j=0;j<n3-i-1;j++)
            {
                if(arr3[j]>arr3[j+1])
                {
                    arr3[j]+=arr3[j+1];
                    arr3[j+1]=arr3[j]-arr3[j+1];
                    arr3[j]-=arr3[j+1];
                }
            }
        }
        for(i=0;i<n3;i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
}