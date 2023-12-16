import java.util.Scanner;

public class Complex {
    int[] add(int k,int arr[])
    {
        int sum[]=new int[2];
        sum[0]=k+arr[0];
        sum[1]=arr[1];
        return sum;
    }
    int[] add(int arr1[],int arr2[])
    {
        int sum[]=new int[2];
        sum[0]=arr1[0]+arr2[0];
        sum[1]=arr1[1]+arr2[1];
        return sum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum[]=new int[2];
        
        System.out.println("Enter 1 for integer+Complex no\nEnter 2 for Complex no+Complex no");
        int choice=in.nextInt();
        Complex obj=new Complex();
        int k;
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter the integer:");
                k=in.nextInt();
                int arr[]=new int[2];
                System.out.println("Enter the real part of the complex number");
                arr[0]=in.nextInt();
                System.out.println("Enter the imaginary part of the complex number");
                arr[1]=in.nextInt();
                sum=obj.add(k,arr);
                System.out.println("Sum="+sum[0]+"+"+sum[1]+"i");
                break;

            }
            case 2:
            {
                int arr1[]=new int[2];
                int arr2[]=new int[2];
                System.out.println("Enter the real part of the 1st complex number");
                arr1[0]=in.nextInt();
                System.out.println("Enter the imaginary part of the 1st complex number");
                arr1[1]=in.nextInt();
                System.out.println("Enter the real part of the 2nd complex number");
                arr2[0]=in.nextInt();
                System.out.println("Enter the imaginary part of the 2nd complex number");
                arr2[1]=in.nextInt();
                sum=obj.add(arr1,arr2);
                System.out.println("Sum="+sum[0]+"+"+sum[1]+"i");
                break;

            }
            default:
                System.out.println("Invalid Input");

        }
    }
}
