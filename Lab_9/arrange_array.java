
import java.util.*;

public class arrange_array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings you would like");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your strings");
        String[] arr = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        Collections.sort(arr);// or use some sorting technique with arr[i].compareTo(arr[i+1])
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}