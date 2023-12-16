import java.util.*;
class karlihandle extends Exception
{
    float input;
    public String toString()
    {
        return "Error:Haan,karliya Handle";
    }
}
class Handled{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1 to cause an error for handling");
        try
        {
            if(in.nextInt()==1)
            {
                throw new karlihandle();
            }
        }
        catch(karlihandle e)
        {
            System.out.println(e.toString());
        }
    }
}