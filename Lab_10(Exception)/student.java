import java.util.*;
class studrecord{
    String Name;
    int rollno;
    int marks[]=new int[3];
    int percent=0;
    studrecord(String name,int roll, int marks[])
    {
        Name=name;
        rollno=roll;
        this.marks=marks;
        percent=(marks[0]+marks[1]+marks[2])/3;
    }
    char getgrade()
    {    
        if(percent>90)
            return 'A';
        else if(percent>80)
            return 'B';
        else if(percent>70)
            return 'C';
        return 'F'; 
    } 
}
public class student {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        try{
            System.out.println("Enter the name,roll number and the marks in 3 subjects simutaneously");
            String name=in.nextLine();
            int roll=Integer.parseInt(in.nextLine());
            int marks[]=new int[3];
            for(int i=0;i<3;i++)
            {
                int a=Integer.parseInt(in.nextLine());
                marks[i]=a;
            }
            studrecord stud=new studrecord(name, roll, marks);
            System.out.println("Succesfully Entered");
            System.out.println("Percentage="+stud.percent+"%\nGrade:"+stud.getgrade());
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error:NumberFormatException Occured");
        }
    }
}
