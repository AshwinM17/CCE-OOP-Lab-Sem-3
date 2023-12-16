import java.util.Scanner;
class add_multiply{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int row1,col1,row2,col2;
        System.out.println("Enter the Number of rows of 1st Matrix:-");
        row1=in.nextInt();
        System.out.println("Enter the Number of columns of 1st Matrix:-");
        col1=in.nextInt();
        int arr1[][]=new int[row1][col1];
        System.out.println("Enter the elements of the matrix:-");
        int i,j;
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                arr1[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the Number of rows of 2nd Matrix:-");
        row2=in.nextInt();
        System.out.println("Enter the Number of columns of 2nd Matrix:-");
        col2=in.nextInt();
        int arr2[][]=new int[row2][col2];
        System.out.println("Enter the elements of the matrix:-");
    
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                arr2[i][j]=in.nextInt();
            }
        }

        int k,prod=0;
        
        if (row1==row2 && col1==col2)
        {
            int sum[][]=new int[row1][col1];
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            
        System.out.println("Sum of the matrices is:");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println("");
            }

        }
        else
        System.out.println("Entered matrixes can't be added");

        if (col1==row2)
        {   
            int prod_arr[][]=new int[row1][col2];
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    prod=0;
                    for(k=0;k<col1;k++)
                    {
                        prod+=arr1[i][k]*arr2[k][j];
                    }
                    prod_arr[i][j]=prod;
                }
            }
            System.out.println("Product of the matrices is:");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    System.out.print(prod_arr[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Entered matrixes can't be multipled");
        }
    }
}
