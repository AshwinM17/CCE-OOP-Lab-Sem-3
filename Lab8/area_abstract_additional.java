import java.util.Scanner;
abstract class shape{
    abstract float area();
    Scanner in=new Scanner(System.in);
}
class triangle extends shape{
    float area() 
    {
        System.out.println("Enter the Base of the triangle:");
        float b=in.nextFloat();
        System.out.println("Enter the Height:");
        float h=in.nextFloat();
        float area=b*h*(float)0.5;
        return area;
    }
}
class Square extends shape{
    float area() 
    {
        System.out.println("Enter the Side of the Square:");
        float len=in.nextFloat();
        float area=len*len;
        return area;
    }
}
class area_abstract_additional{
    public static void main(String[] args) {
        Square obj =new Square();
        System.out.println("area of Square="+obj.area());
        triangle obj1 =new  triangle();
        System.out.println("area of triangle="+obj1.area());
        

    }
    
    
}