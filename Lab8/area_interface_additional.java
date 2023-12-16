import java.util.Scanner;
interface Shape{
    float area();
    
}
class Square implements Shape{
    Scanner in=new Scanner(System.in);
    public float area() 
    {
        System.out.println("Enter the Side of the Square:");
        float r=in.nextFloat();
        float area=r*r;
        return area;
    }
}

class triangle implements Shape{
    Scanner in=new Scanner(System.in);
    public float area() 
    {
        System.out.println("Enter the hieght and base:");
        float len=in.nextFloat();
        float breadth=in.nextFloat();
        float area=len*breadth*0.5f;
        return area;
    }
}
class area_interface_additional{
    public static void main(String[] args) {
        triangle obj =new triangle();
        System.out.println("area of triangle="+obj.area());
        Square sobj=new Square();
        System.out.println("area of square="+sobj.area());
        
    }
    
}