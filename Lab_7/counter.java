import java.util.Scanner;
class object{
    int num;
    object(){}
}
class counter{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        object obj[]=new object[100];
        System.out.println("Do you want to create an object?(y/n)");
        char choice=in.next().charAt(0);
        int count=0;
        while(choice=='y')
        {
            obj[count++]=new object();
            System.out.println("Create more?(y/n)");
            choice=in.next().charAt(0);
        }
        System.out.println("Number of objects created="+count);
    }
}