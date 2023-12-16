// Online Java Compiler
/*interface product
{
    void buy(int num);
}
class genproduct implements product
{
    int quan;
    genproduct(int n)
    {
        quan=n;
    }
    public synchronized void buy(int num)
    {
        if(quan<num)
        {
            System.out.println("Erretysuor");
        }
        else{
            System.out.println(num+" in start "+quan);
            quan=quan-num;
            System.out.println("succesfull "+quan);
        }
    }
}

class inventory<T extends product> extends Thread
{
    T obj;
    int num;
    inventory(T obj,int num)
    {
        this.obj=obj;
        this.num=num;
    }
    public void run()
    {
        obj.buy(num);
    }
}
class Mainclass
{
    public static void main(String[] args) {
        genproduct buyer1 =new genproduct(15);
        inventory<genproduct> t1=new inventory(buyer1,2);
        inventory<genproduct> t2=new inventory(buyer1,5);
       // obj.start();
       t1.start();
       t2.start();
       
       
    }
}*/
class BankAccount {
    private int balance;
    private int accountNumber;

    public BankAccount(int accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance after Deposit: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance after Withdrawal: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

class TransactionThread extends Thread {
    private BankAccount account;
    private boolean isDeposit;
    private int amount;

    public TransactionThread(BankAccount account, boolean isDeposit, int amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

class Practice_question{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, 1000);

        // Create multiple threads for deposits and withdrawals
        TransactionThread depositThread1 = new TransactionThread(account, true, 500);
        TransactionThread withdrawThread1 = new TransactionThread(account, false, 200);
        TransactionThread depositThread2 = new TransactionThread(account, true, 100);
        TransactionThread withdrawThread2 = new TransactionThread(account, false, 300);

        // Start the threads
        depositThread1.start();
        withdrawThread1.start();
        depositThread2.start();
        withdrawThread2.start();

        // Wait for all threads to finish
        try {
            depositThread1.join();
            withdrawThread1.join();
            depositThread2.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
