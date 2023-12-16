import java.util.Scanner;
class number_triangle
{
    public static void main(String args[])
    {
        System.out.println("How many rows do you need?");
        int i,j,row;
        Scanner in=new Scanner(System.in);
        row=in.nextInt();
        System.out.println("Using for loop:-");
        for(i=1;i<row+1;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        System.out.println("Using for each loop:-");
        int arr[]=new int[row];
        for(i=0;i<row;i++)
        {
            arr[i]=i+1;
        }
        for(int k:arr){
            for(j=0;j<k;j++)
            {
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
}