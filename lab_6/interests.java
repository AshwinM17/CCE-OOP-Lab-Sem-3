import java.util.Scanner;

class Bank{
    float interest;
    int getRateOfInterest()
    {
        return 1;
    }
    float calculateinterest(float rate,float prin)
    {
        return interest=(prin*rate/100);
    }
}
class Sbi extends Bank{
    int getRateOfInterest()
    {
        return 8;
    }
}
class Icici extends Bank{
    int getRateOfInterest()
    {
        return 9;
    }
}
class Axis extends Bank{
    int getRateOfInterest()
    {
        return 10;
    }
}
class interests{
    public static void main(String[] args) {
        Bank obj;
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your bank?\nPress 1 for SBI,\n2 for ICICI,\n3 for Axis");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                obj=new Sbi();
                break;
            }
            case 2:
            {
                obj=new Icici();
                break;
            }
            case 3:
            {
                obj=new Axis();
                break;
            }
            default:
            {
                System.out.println("Invalid Choice");
                return;
            }
        }
        System.out.println("Enter the principal amount");
        float prin=sc.nextFloat();
        float rate=(float)obj.getRateOfInterest();
        System.out.println("Rate of interest="+rate);
        System.out.println("Interest="+obj.calculateinterest(rate, prin));
    }
}