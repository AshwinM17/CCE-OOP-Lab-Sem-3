
import java.util.Scanner;

public class negativearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        try{
                int array[] = new int[n];
                System.out.println("Enter the elments");
                for (int i = 0; i < n; i++) {
                    array[i] = sc.nextInt();
                }
        }catch(NegativeArraySizeException e){
            System.out.println("Error:"+e.toString());
        }
    }
}
