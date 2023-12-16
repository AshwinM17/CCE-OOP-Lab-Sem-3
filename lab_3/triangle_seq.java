import java.util.Scanner;
class triangle_seq
{
    public static void main(String[] args) {
        int k,f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            for(int l=0;l<i+1;l++)
            {
                System.out.print(++f+" ");
            }
            System.out.println("");
            
        }
    }
}