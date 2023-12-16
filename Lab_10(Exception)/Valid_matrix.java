import java.util.*;
class InvalidMatrixException extends Exception
{
    public String toString()
    {
        return "InvalidMatrixException:this is an Invalid Matrix";
    }
}
public class Valid_matrix {
    public static void main(String[] args) {
        int row,col;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        row=in.nextInt();
        col=in.nextInt();
        try
        {
            if(row!=col)
            {
                throw new InvalidMatrixException();
            }
            System.out.println("This is a valid matrix");
        }
        catch(InvalidMatrixException e)
        {
            System.out.println(e.toString());
        }
    }
}
