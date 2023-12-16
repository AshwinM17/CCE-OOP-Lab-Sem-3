import java.util.Scanner;
class account{
    String name;
    int acc_no;
    String acctype;
    float balance;
    account(String n,int no,String acc,float bal){
        name=n;
        acc_no=no;
        acctype=acc;
        balance=bal;
    }
    void displaybal()
    {
        System.out.println("Balance="+balance);

    }
    void deposit(float dep)
    {
        balance+=dep;
        displaybal();
    }

    void withdraw(float with)
    {
        if(with>balance)
        {
            System.out.println("Can't permit withdrawal as Insufficient Balance");
        }
        else
        {
            balance-=with;
            System.out.println("Succesfully withdrawn "+with+" rupees");
            System.out.println("Updated balnce="+balance);
        }
    }

}
class current extends account{
    
    current(String n, int no, String acc, float bal) {
        super(n, no, acc, bal);
    }
    int minbal=500;
    float min()
    {
        float tax=0;
        if(minbal<=balance)
        {
            System.out.println("Minimum Balance is maintained");
        }
        else
        {
            System.out.println("Minimum Balance is not maintained");
            tax=(float)0.1*minbal;
            balance-=tax;
            System.out.print("Updated ");
            displaybal();
        }
        return tax;
    }
    

}
class saving extends account{
    saving(String n, int no, String acc, float bal) {
        super(n, no, acc, bal);
    }
    void interest(int time)
    {
        float interest=(balance*5/100)*time;
        System.out.println("Interest="+interest);
        System.out.print("After adding interest ");
        balance+=interest;
        displaybal();
        
    }
}

class accountsmain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name;
        name=in.nextLine();
        System.out.println("Enter the account number");
        int acc_no;
        acc_no=in.nextInt();
        in.nextLine();
        System.out.println("Enter the account type(current/saving)");
        String acctype;
        acctype=in.nextLine();
        float balance;
        System.out.println("Enter the account Balance");
        balance=in.nextFloat();
        in.nextLine();
        int n;//=(acctype.equals("saving")?1:3);
        if(acctype.equals("saving"))
        {
            n=1;
        }
        else if(acctype.equals("current"))
        {
            n=2;
        }
        else
        {
            n=3;
        }
        char contin='y';
        

        switch (n)
        {
            case 1:
            {
                saving user=new saving(name, acc_no, acctype, balance);
                while(contin=='y')
                {
                    System.out.println("Press 1 for balance,2 to deposit,3 to withdraw,4 to calculate interest");
                    int choice=in.nextInt();
                    switch(choice)
                    {
                        case 1:
                        {
                            user.displaybal();
                            break;
                        }
                        case 2:
                        {
                            System.out.println("How much do you want to deposit?");
                            float dep=in.nextFloat();
                            user.deposit(dep);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("How much do you want to withdraw?");
                            float wit=in.nextFloat();
                            user.withdraw(wit);
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter the number of years");
                            int years=in.nextInt();
                            user.interest(years);
                            break;
                        }
                    }
                    System.out.println("Continue?(y/n)");
                    contin=in.next().charAt(0);
                }
                break;
            }
            case 2:
            {
                current user=new current(name, acc_no, acctype, balance);
                while(contin=='y')
                {
                    System.out.println("Press 1 for balance,2 to deposit,3 to withdraw,4 to verify minimum balance");
                    int choice=in.nextInt();
                    switch(choice)
                    {
                        case 1:
                        {
                            user.displaybal();
                            break;
                        }
                        case 2:
                        {
                            System.out.println("How much do you want to deposit?");
                            float dep=in.nextFloat();
                            user.deposit(dep);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("How much do you want to withdraw?");
                            float wit=in.nextFloat();
                            user.withdraw(wit);
                            break;
                        }
                        case 4:
                        {
                            float tax=user.min();
                            System.out.println("Penalty paid="+tax);
                            break;
                        }
                    }
                    System.out.println("Continue?(y/n)");
                    contin=in.next().charAt(0);
                    
                }
                break;
            }
            case 3:
            {
                System.out.println("Invalid Account type");
                break;
            }
        }   
    }
}
