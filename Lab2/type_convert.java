import java.util.Scanner;
class type_convert
{
	public static void main(String args[])
	{
		int integer;
		double doub;
		char charac;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Integer");
		integer=in.nextInt();
		System.out.println("Enter the Double");
		doub=in.nextDouble();
		System.out.println("Enter the Character");
		charac= in.next().charAt(0);
		System.out.println("Integer entered is:"+integer+",converted to byte="+((byte)integer));
		System.out.println("double entered is:"+doub+",converted to byte="+((byte)doub));
		System.out.println("double entered is:"+doub+",converted to integer="+((int)doub));
		System.out.println("Character entered is:"+charac+",converted to int="+((int)charac));	
	}
}