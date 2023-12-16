import java.util.Scanner;
class rectangle_circum
{ 
	public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
		int length,breadth;
		System.out.println("Enter the length and breadth");
		length=in.nextInt();
		breadth=in.nextInt();
		int area=length*breadth;
		int circum=2*(length+breadth);
		System.out.println("Length of rectangle="+length);
		System.out.println("breadth of rectangle="+breadth);
		System.out.println("area of rectangle="+area);
		System.out.println("circumfrence of rectangle="+circum);
	}
}