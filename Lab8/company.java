import java.util.Scanner;
interface hard_soft{    
    void input(String a,String b);
}
class hardware implements hard_soft{
    String category,manufacturer;
    public void input(String a, String b)  //parameter type and name should be same
    {
        category=a;
        manufacturer=b;
    }
}
class software implements hard_soft{
    String type,os;
    public void input(String a,String b)
    {
        type=a;
        os=b;
    }
}
class company{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ware,scount=0,hcount=0;;
        char choice;
        String category,manufacturer,type,os;
        do
        {
            System.out.println("What has been sold?\nPress 1 for Hardware\n2 for Software");
            ware=in.nextInt();
            in.nextLine();
            switch(ware)
            {
                case 1:
                {
                    hardware obj=new hardware();
                    hcount++;
                    System.out.println("Enter the category of the item");
                    category=in.nextLine();
                    System.out.println("Enter the original manufacturer");
                    manufacturer=in.nextLine();
                    obj.input(category,manufacturer);
                    break;

                }
                case 2:
                {
                    software obj=new software();
                    scount++;
                    System.out.println("Enter the type of the Software");
                    type=in.nextLine();
                    System.out.println("Enter the Operating Software");
                    os=in.nextLine();
                    obj.input(type,os);
                    break;

                }
                default:
                {
                    System.out.println("Invalid Sale Type");
                }
            }
            System.out.println("Add more?(y/n)");
            choice=in.next().charAt(0);
        }while(choice=='y');
        System.out.println("We sold "+scount+" Software items sold in 3 months");
        System.out.println("We sold "+hcount+" Hardware items sold in 3 months");

    }
}