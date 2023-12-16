import java.util.Scanner;
class Employee_record
{
    Scanner in=new Scanner(System.in);
    String name;
    String city;
    double sal;
    double DA;
    double HR;

    void getdata()
    {   
        System.out.println("Enter the Employee name ");
        name=in.nextLine(); 
        System.out.println("Enter the City name ");  
        city=in.nextLine();
        System.out.println("Enter the Basic Salary ");
        sal=in.nextDouble();
        System.out.println("Enter the dearness allowance ");
        DA=in.nextDouble();
        System.out.println("Enter the house rent ");
        HR=in.nextDouble();
    }
     double calculate()
    {
        double total;
        total=sal+sal*DA/100+sal*HR/100;
        return total;
    }
    void display()
    {
        System.out.println("Employee name:"+name);
        System.out.println("City name:"+city);
        System.out.println("Basic Salary:"+sal);
        System.out.println("Dearness allowance:"+DA);
        System.out.println("House rent:"+HR);
    }


    public static void main(String args[]) {
    Employee_record obj=new Employee_record();
    obj.getdata();
    Double tot=obj.calculate();
    System.out.println("Total salary="+tot);
    obj.display();
    }
}