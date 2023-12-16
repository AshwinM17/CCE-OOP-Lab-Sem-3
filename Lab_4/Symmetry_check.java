import java.util.Scanner;
class Symmetry_check{
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
        int flag=1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i][j]!=arr[j][i])
                {
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Entered Matrix is a Symmetric Matrix");
        }
        else
        {
            System.out.println("Entered Matrix is not a Symmetric Matrix");
        }
    }
}