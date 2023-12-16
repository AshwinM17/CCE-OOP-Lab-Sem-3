import java.util.Scanner;
class box
{
    double width,height,depth;
    box()
    {

    }
    box(double wid,double hgt,double dep)
    {
        width=wid;
        height=hgt;
        depth=dep;
    }
    Double volume()
    {
        return width*height*depth;
    }
}
class mainbox
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the width,height and depth:");
        Scanner sc=new Scanner(System.in);
        double width,height,depth;
        width=sc.nextDouble();
        height=sc.nextDouble();
        depth=sc.nextDouble();
        box obj=new box(width,height,depth);
        System.out.println("Volume of the box="+obj.volume());
    }
}