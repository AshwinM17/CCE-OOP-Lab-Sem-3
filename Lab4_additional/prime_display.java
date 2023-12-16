import java.util.Scanner;
class prime_display{
    public static void main(String[] args) {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        num=in.nextInt();
        int i,n,k,flag;
        int arr[]=new int[num];
        for(i=0;i<num;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The prime numbers in the array are:");
        
        for(i=0;i<num;i++)
        {
            flag=1;
            n=arr[i];
            for(k=2;k<=n/2;k++)
            {
                if((n%k)==0)
                {
                    flag=0;
                    break;
                }
            }
            if (flag==1)
                System.out.print(n+" ");
        
        }
        
    }
}