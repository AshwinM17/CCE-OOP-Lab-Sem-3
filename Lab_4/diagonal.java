import java.util.Scanner;
class diagonal{
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number of rows and columns of the Square Matrix:-");
        n=in.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the elements of the matrix:-");
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        int sum=0;
        System.out.println("Diagonal Elements are:-");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==i)
                {
                    sum+=arr[i][j];
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println("\nSum of Diagonal Elements is:"+sum);

    }
}