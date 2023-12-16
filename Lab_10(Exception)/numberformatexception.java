import java.util.*;
public class numberformatexception {
    public static void main(String[] args) {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.print("Input:");
        try{
            a=Integer.parseInt(in.nextLine());
            System.out.println("Number entered is "+a);
        }
        catch(NumberFormatException e)//As NumberFormatException is typecasting error 
        {
            System.out.println("Error:"+e.toString());
        }
    }
    
}
