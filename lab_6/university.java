import java.util.Scanner;
class student{
    int reg_no;
    String name;
    int age;   
}
class UG extends student{
    int semester,fees;
    UG(int reg_no,String name,int age,int semester,int fees)
    {
        this.reg_no=reg_no;
        this.name=name;
        this.age=age;
        this.semester=semester;
        this.fees=fees;
    }
    void display()
    {
        System.out.println("registeration no="+reg_no);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("Semester:"+semester);
        System.out.println("fees:"+fees+"\n");
    }
}
class PG extends student{
    int semester,fees;
    PG(int reg_no,String name,int age,int semester,int fees)
    {
        this.reg_no=reg_no;
        this.name=name;
        this.age=age;
        this.semester=semester;
        this.fees=fees;
    }
    void display()
    {
        System.out.println("registeration no="+reg_no);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("Semester:"+semester);
        System.out.println("fees:"+fees+"\n");
        
    }
    
}
class university{
    public static void main(String[] args) {
        char choice='y';
        int num;
        int counteru=0,counterp=0;
        Scanner sc=new Scanner(System.in);
        UG obju[]=new UG[100];
        PG objp[]=new PG[100];
        while(choice=='y')
        {
        System.out.println("Enter students to which course(1 for UG/2 for PG)?");
        int course=sc.nextInt();
            System.out.println("Enter the reg_no,name,age,semester and fees");
            int reg_no=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int age=sc.nextInt();
            int sem=sc.nextInt();
            int fee=sc.nextInt();
            switch(course) {
            case 1:
            {
                obju[counteru++]=new UG(reg_no, name, age, sem, fee);
                
                break;
            }
            case 2:
            {
                objp[counterp++]=new PG(reg_no, name, age, sem, fee);
                break;
            }
            default:
            {
                System.out.println("Invalid Course input");
                break;
            }
        }
        System.out.println("Continue adding students?(y/n)");
        sc.nextLine();
        choice=sc.next().charAt(0); 
        }
        int i;
        System.out.println("Details of the "+counteru+" UG students are:");
        for(i=0;i<counteru;i++)
        {
            obju[i].display();
        }
        System.out.println("Details of the "+counterp+" PG students are:");
        for(i=0;i<counterp;i++)
        {
            objp[i].display();
        }
        

    }
}