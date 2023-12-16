import java.util.Scanner;
import java.lang.Math;
class trace_norm{
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
        int norm=0,trace=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    trace+=arr[i][j];
                }
                norm+=(arr[i][j]*arr[i][j]);
            }
        }
        double nor;
        nor=Math.pow((double)norm,0.5);
        System.out.println(nor+" "+trace);
    }
}