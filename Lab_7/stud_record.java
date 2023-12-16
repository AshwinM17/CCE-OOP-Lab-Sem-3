import java.util.Scanner;
class Student_Detail
{
    String name;
    int id;
    String college_name;

    void display_details(Student_Detail obj[])
    {
        for(Student_Detail det:obj)
        {
        System.out.println("Name: "+det.name);
        System.out.println("Id: "+det.id);
        System.out.println("college name: "+det.college_name+"\n");
        }
    }
    Student_Detail(String nam,int idn)
    {
        name=nam;
        id=idn;
        college_name="MIT";
    }
}
class stud_record{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number of students you want to add:");
        int num=in.nextInt(),i;
        Student_Detail obj[]=new Student_Detail[num];
        String name;
        int id;
        for(i=0;i<num;i++)
        {
            System.out.println("Enter the name and ID of student"+(i+1));
            in.nextLine();
            name=in.nextLine();
            id=in.nextInt();
            obj[i]=new Student_Detail(name,id);
        }
        obj[1].display_details(obj);

    }
    
}