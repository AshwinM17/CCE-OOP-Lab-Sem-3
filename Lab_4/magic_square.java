import java.util.Scanner;
class magic_square{
    public static void main(String[] args) {
    int n;
    Scanner in=new Scanner(System.in);         
        System.out.println("Enter the Number of rows and columns of Square Matrix:-");
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

        int sumdiag=0,sumndiag=0,sum,flag=1,sum2;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==i)
                {
                    sumdiag+=arr[i][j];
                }
                if(i==n-j-1)
                {
                    sumndiag+=arr[i][j];
                }
            }
        }
        
        for(i=0;i<n;i++)
        {
            sum=0;
            sum2=0;
            for(j=0;j<n;j++)
            {
                sum+=arr[i][j];
                sum2+=arr[j][i];
            }
            if(sum!=sumdiag || sum2!=sumdiag)
            {
                flag=0;
                break;
            }
        }
        
        if(sumndiag!=sumdiag)
            {
                flag=0;
            }
        if (flag==1)
        {
            System.out.println("Entered Matrix is a Magic Square");
        }
        else
        {
            System.out.println("Entered Matrix is not a Magic Square");
        }

    }
}