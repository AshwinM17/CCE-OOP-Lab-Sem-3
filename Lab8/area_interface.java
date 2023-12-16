import java.util.Scanner;
interface shape{
    float area();
    
}
class circle implements shape{
    Scanner in=new Scanner(System.in);
    public float area() 
    {
        System.out.println("Enter the radius:");
        float r=in.nextFloat();
        float area=22*r*r/7;
        return area;
    }
}
class rectangle implements shape{
    Scanner in=new Scanner(System.in);
    public float area() 
    {
        System.out.println("Enter the length and breadth for Rectangle:");
        float len=in.nextFloat();
        float breadth=in.nextFloat();
        float area=len*breadth;
        return area;
    }
}
class area_interface{
    public static void main(String[] args) {
        rectangle obj =new rectangle();
        System.out.println("area of rectangle="+obj.area());
        circle obj1 =new circle();
        System.out.println("area of circle="+obj1.area());
    }
    
}