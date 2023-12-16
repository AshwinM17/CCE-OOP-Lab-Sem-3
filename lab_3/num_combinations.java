import java.util.Scanner;
class num_combinations
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4},i,j,k,l,f;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1 for duplication to be allowed and Enter 2 for Duplication to not be allowed:");
        f=in.nextInt();
        switch(f)
        {
        case 1:
        {
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
                for(k=0;k<4;k++)
                    for(l=0;l<4;l++)
                    {
                        System.out.print(arr[i]+""+arr[j]+""+arr[k]+""+arr[l]+" ");
                    }

        }break;
        }
        case 2:
        {
        
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
                if(j!=i)
                    for(k=0;k<4;k++)
                        if(j!=k && k!=i)
                            for(l=0;l<4;l++)
                        {       
                        if(l!=k && l!=i && l!=j)
                            System.out.print(arr[i]+""+arr[j]+""+arr[k]+""+arr[l]+" ");
                        }
        }break;
        }
        }

    }
}